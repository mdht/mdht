/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhealthtools.mdht.transformation.ocl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionLiteralPart;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.types.TypeType;

/**
 * Abstract transformation from OCL to XPath or C# (UML or Ecore OCL is used by subclasses of this class by binding the type parameters)
 * 
 * 
 * @author Joe
 * 
 * @param <PK>
 * @param <C>
 * @param <O>
 * @param <P>
 * @param <EL>
 * @param <PM>
 * @param <S>
 * @param <COA>
 * @param <SSA>
 * @param <CT>
 * @param <CLS>
 * @param <E>
 */
abstract public class OCLTransformation<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	/**
	 * The name for the self variable
	 */
	protected String selfVariable = "self";

	protected boolean isMany;

	/**
	 * Holds all current variable bindings valid at the current transformation stage
	 */
	protected Map<Variable<C, PM>, String> bindings;

	/**
	 * Remembers all expressions of the form "not(innerExpression)"; Note: "not(a) and (b or c)" has not this form!
	 */
	protected Set<String> negatedExpressions = new HashSet<String>();

	OCL<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> EOCL_ENV;

	OCLHelper<C, O, P, CT> helper;

	protected DomainSpecificOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> domainSpecificOCLHandler = new DomainSpecificOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>();

	public DomainSpecificOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> getDomainSpecificOCLHandler() {
		return domainSpecificOCLHandler;
	}

	public void setDomainSpecificOCLHandler(DomainSpecificOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> domainSpecificOCLHandler) {
		this.domainSpecificOCLHandler = domainSpecificOCLHandler;
		this.domainSpecificOCLHandler.setTransformation(this);
	}

	protected ResourceSet rset;

	public void setResourceSet(ResourceSet resourceSet) {
		this.rset = resourceSet;
	}

	/**
	 * @param exp
	 * @return returns the string representation of the target language's equivalent for the given expression
	 */
	@SuppressWarnings("unchecked")
	public String transform(org.eclipse.ocl.expressions.OCLExpression<C> exp) {
		if (exp instanceof OperationCallExp) {
			OperationCallExp<C, O> op = (OperationCallExp<C, O>) exp;
			String opName = getName(op.getReferredOperation());

			String domainSpecific = transformDomainSpecific(op, opName);
			if (domainSpecific != null)
				return domainSpecific;

			if ("oclAsType".equals(opName)) {
				String source = transform(op.getSource());
				String i = newVar();
				C t = ((TypeType<C, O>) op.getArgument().get(0).getType()).getReferredType();
				C tBase = getBaseType(t);
				if (tBase == op.getSource().getType())
					return source;
				if (isSuperTypeOf(op.getSource().getType(), tBase))
					return iterator(typeCast(i, getName(tBase)), i, "collect", source);
				return source;
			}
			if ("oclIsKindOf".equals(opName) || "oclIsTypeOf".equals(opName)) {
				String source = transform(op.getSource());
				String i = newVar();
				C t = ((TypeType<C, O>) op.getArgument().get(0).getType()).getReferredType();
				String predicate = getTypeCheck(t, one(transform(op.getSource())));
				if (predicate != null)
					return predicate;
				C tBase = getBaseType(t);
				if (tBase == op.getSource().getType())
					return "true()";
				if (isSuperTypeOf(op.getSource().getType(), tBase))
					return iterator(instanceOf(i, getName(tBase)), i, "forAll", source);
				return "true()";
			}
			if ("oclIsUndefined".equals(opName)) {
				return isEmpty(transform(op.getSource()));
			}
			if ("not".equals(opName)) {
				return not(transform(op.getSource()));
			}
			if ("isEmpty".equals(opName)) {
				return isEmpty(transform(op.getSource()));
			}
			if ("notEmpty".equals(opName)) {
				return transform(op.getSource());
			}
			if ("implies".equals(opName)) {
				return not(transform(op.getSource())) + op("or") + transform(op.getArgument().get(0));
			}
			if ("or".equals(opName) || "xor".equals(opName)) {
				String result = transform(op.getSource());
				for (org.eclipse.ocl.expressions.OCLExpression<C> x : op.getArgument()) {
					result += op(opName) + transform(x) + "";
				}
				if (exp.eContainer() instanceof OperationCallExp) {
					OperationCallExp<C, O> operationCallExp2 = (OperationCallExp<C, O>) exp.eContainer();
					if ("and".equals(getName(operationCallExp2.getReferredOperation()))) {
						return "(" + result + ")";
					}
				}
				return result;
			}
			if ("and".equals(opName)) {
				String result = transform(op.getSource());
				for (org.eclipse.ocl.expressions.OCLExpression<C> x : op.getArgument()) {
					result += op(opName) + transform(x) + "";
				}
				return result;
			}
			if ("=".equals(opName) || "<=".equals(opName) || ">=".equals(opName) || "<".equals(opName) || ">".equals(opName) || "<>".equals(opName)) {
				return compare(opName, transform(op.getSource()), transform(op.getArgument().get(0)));
			}

			C eClass = (C) op.getReferredOperation().eContainer();
			String oclString = getFromOperations(eClass, getName(op.getReferredOperation()), "__EOCL_EXP");
			EAnnotation anno = op.getReferredOperation().getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
			if (oclString == null && anno != null) {
				oclString = anno.getDetails().get("documentation");
			}
			if (oclString != null) {
				OCLExpression<C> exp2 = getOCLExpression(eClass, oclString, false);
				String body = transformWithNewBindings(exp2, selfVariable);
				String result = step(transform(op.getSource()), body);
				return result;
			}

			String source = transform(op.getSource());
			String params = "";
			for (OCLExpression<C> arg : op.getArgument())
				params += ", " + transform(arg);
			if (params.startsWith(", "))
				params = params.substring(", ".length());
			if ("includes".equals(opName)) {
				return contains(source, params);
			}
			String i = newVar();
			String n = "collect";
			if ("Boolean".equals(getName(op.getType())))
				n = "exists";
			return iterator(i + "." + opName + "(" + params + ")", i, n, source);
		}
		if (exp instanceof PropertyCallExp) {
			PropertyCallExp<C, P> propertyCallExp = (PropertyCallExp<C, P>) exp;
			return step(transform(propertyCallExp.getSource()), propertyCallExp.getReferredProperty());
		}
		if (exp instanceof IteratorExp) {
			IteratorExp<C, PM> iteratorExp = (IteratorExp<C, PM>) exp;
			String n = iteratorExp.getName();
			String self = transform(iteratorExp.getSource());
			for (Variable<C, PM> var : iteratorExp.getIterator())
				bindings.put(var, newVar());
			try {
				return iterator(iteratorExp, n, self);
			} finally {
				bindings.keySet().removeAll(iteratorExp.getIterator());
			}
		}
		if (exp instanceof LetExp) {
			LetExp<C, PM> letExp = (LetExp<C, PM>) exp;
			String self = transform(letExp.getVariable().getInitExpression());
			String i = newVar();
			bindings.put(letExp.getVariable(), i);
			String result = isNotEmpty(predicate(self, transform(letExp.getIn()), i));
			bindings.keySet().remove(letExp.getVariable());
			return result;
		}
		if (exp instanceof VariableExp) {
			VariableExp<C, PM> variableExp = (VariableExp<C, PM>) exp;
			if (bindings.containsKey(variableExp.getReferredVariable()))
				return referVar(bindings.get(variableExp.getReferredVariable()));
			if (/* bindings.isEmpty() && */"self".equals(variableExp.getName())) {
				return selfNode();
			}
		}
		if (exp instanceof CollectionLiteralExp) {
			CollectionLiteralExp<C> collectionLiteralExp = (CollectionLiteralExp<C>) exp;
			if (collectionLiteralExp.getPart().isEmpty())
				return "*[false()]";
			if (collectionLiteralExp.getPart().size() > 1)
				throw new RuntimeException("Unsupported");
			CollectionLiteralPart<C> part = collectionLiteralExp.getPart().get(0);
			if (part instanceof CollectionItem) {
				CollectionItem<C> collectionItem = (CollectionItem<C>) part;
				return transform(collectionItem.getItem());
			}
		}
		if (exp instanceof StringLiteralExp) {
			StringLiteralExp<C> stringLiteralExp = (StringLiteralExp<C>) exp;
			return "\"" + stringLiteralExp.getStringSymbol() + "\"";
		}
		if (exp instanceof IntegerLiteralExp) {
			IntegerLiteralExp<C> integerLiteralExp = (IntegerLiteralExp<C>) exp;
			return "" + integerLiteralExp.getIntegerSymbol();
		}
		if (exp instanceof BooleanLiteralExp) {
			BooleanLiteralExp<C> booleanLiteralExp = (BooleanLiteralExp<C>) exp;
			return booleanLiteralExp.getBooleanSymbol().toString() + "()";
		}
		if (exp instanceof TypeExp) {
			TypeExp<C> typeExp = (TypeExp<C>) exp;
			return typeof(getName(typeExp.getReferredType()));
		}
		throw new RuntimeException("Could not transform OCL: " + exp);
	}

	abstract public String typeof(String typeName);

	public String getQualifiedName(P referredProperty) {
		return domainSpecificOCLHandler.getPropertyName(referredProperty);
	}

	/**
	 * @return a new introduced variable
	 */
	public abstract String newVar();

	/**
	 * @param variable
	 * @return accesses the given variable
	 */
	public String referVar(String variable) {
		return variable;
	}

	/**
	 * Compares the two values using the given operator
	 * 
	 * @param operator
	 * @param lhs
	 * @param rhs
	 * @return
	 */
	public String compare(String operator, String lhs, String rhs) {
		return lhs + " " + op(operator) + " " + rhs;
	}

	/**
	 * Translate the given OCL iterator expression
	 * 
	 * @param iteratorExp
	 * @param n
	 *            the type of iterator
	 * @param source
	 *            the translated source expression
	 * @return
	 */
	protected String iterator(IteratorExp<C, PM> iteratorExp, String n, String source) {
		String body = transform(iteratorExp.getBody());
		String i = bindings.get(iteratorExp.getIterator().get(0));
		return iterator(body, i, n, source);
	}

	public abstract String iterator(String body, String i, String n, String source);

	/**
	 * The equivalent to the given OCL operator
	 * 
	 * @param operator
	 * @return
	 */
	abstract protected String op(String operator);

	/**
	 * Gets some in Java implemented domain specific operations across
	 * 
	 * @param exp
	 * @param bindings
	 * @param op
	 * @param opName
	 * @return
	 */
	protected String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		return domainSpecificOCLHandler.transformDomainSpecific(op, opName);
	}

	/**
	 * Asks whether the given set is empty
	 * 
	 * @param set
	 * @return an expression which has a boolean value
	 */
	public abstract String isEmpty(String set);

	/**
	 * Negation of #isEmpty()
	 * 
	 * @param set
	 * @return
	 */
	public abstract String isNotEmpty(String set);

	/**
	 * @param type
	 * @return whether the given type is a class type (in contrast to a primitive type)
	 */
	public boolean isClassType(C type) {
		return getOCLInstance().getEnvironment().getUMLReflection().isClass(type);
	}

	/**
	 * Negates the given expression, applying the rule not(not(x))=x if applicable
	 * 
	 * @param expression
	 *            to be negated
	 * @return equivalent to "not(expression)"
	 */
	protected String not(String expression) {
		String func = op("not") + "(";
		if (negatedExpressions.contains(expression)) {
			return expression.substring(func.length(), expression.length() - ")".length());
		}
		if ("true()".equals(expression))
			return "false()";
		if ("false()".equals(expression))
			return "true()";
		String result = func + expression + ")";
		negatedExpressions.add(result);
		return result;
	}

	/**
	 * Filters the given set by the given predicate using the given iterator variable i
	 * 
	 * @param set
	 * @param predicate
	 * @param i
	 * @return
	 */
	final public String predicate(String set, String predicate, String i) {
		return iterator(predicate, i, "select", set);
	}

	/**
	 * Queries the given property for all elements in the set, i.e. performs a location step
	 * 
	 * @param set
	 * @param property
	 * @return
	 */
	public abstract String step(String set, String property);

	public String step(String set, P property) {
		return step(set, getQualifiedName(property));
	}

	/**
	 * @param namedObject
	 * @return queries getName() on the given object
	 */
	final public String getName(Object namedObject) {
		return domainSpecificOCLHandler.getName(namedObject);
	}

	public String transform(C context, String oclString) {
		OCLExpression<C> exp = getOCLExpression(context, oclString, true);
		return cosmetics(transformWithNewBindings(exp, selfVariable));
	}

	/**
	 * Calls the transform() method, however initializes a new variable binding
	 * 
	 * @param exp
	 * @param customSelfVariable
	 *            can be a custom name for the self variable
	 * @return
	 */
	public String transformWithNewBindings(org.eclipse.ocl.expressions.OCLExpression<C> exp, String customSelfVariable) {
		Map<Variable<C, PM>, String> saveBindings = bindings;
		String saveSelfName = selfVariable;
		selfVariable = customSelfVariable;
		bindings = new HashMap<Variable<C, PM>, String>();
		try {
			return transform(exp);
		} finally {
			bindings = saveBindings;
			selfVariable = saveSelfName;
		}
	}

	public abstract String cosmetics(String transform);

	public abstract OCL<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> getOCLInstance();

	public OCLExpression<C> getOCLExpression(C context, String oclString, boolean isInvariant) {
		if (helper == null) {
			EOCL_ENV = getOCLInstance();
			helper = EOCL_ENV.createOCLHelper();
		}
		helper.setContext(context);
		try {
			if (!isInvariant) {
				return helper.createQuery(oclString);
			}
			try {
				CT EOCL_INV = helper.createInvariant(oclString);
				OCLExpression<C> exp = EOCL_ENV.createQuery(EOCL_INV).getExpression();
				isMany = exp.getType() instanceof CollectionType;
				return exp;
			} catch (Exception e) {
				OCLExpression<C> exp = helper.createQuery(oclString);
				return EOCL_ENV.createQuery(exp).getExpression();

			}
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}
	}

	public String getFromOperations(C eClass, String opname, String suffix) {
		// cannot access generated code here
		return null;
	}

	/**
	 * @return whether the OCL query is a boolean invariant (<code>false</code>) or returns a set of objects (<code>true</code>)
	 */
	public boolean isMany() {
		return isMany;
	}

	/**
	 * how to encode the context variable
	 */
	abstract protected String selfNode();

	/**
	 * Qualifies the given property
	 */
	public String nsPrefix(String propertyName) {
		return propertyName;
	}

	public String childNode(String step) {
		return step + "/child::node()";
	}

	public String getTypeCheck(C clazz) {
		return getTypeCheck(clazz, selfVariable);
	}

	public String getTypeCheck(C clazz, String customSelfVariable) {
		return domainSpecificOCLHandler.getTypeCheck(clazz, customSelfVariable);
	}

	public String getValue(P property, String value) {
		return "\"" + value + "\"";
	}

	public C getType(P property) {
		C type = getOCLInstance().getEnvironment().getUMLReflection().getOCLType(property);
		if (type instanceof CollectionType) {
			CollectionType<C, O> collectionType = (CollectionType<C, O>) type;
			return collectionType.getElementType();

		}
		return type;
	}

	public String one(String transform) {
		return transform;
	}

	/**
	 * @param lhs
	 * @param rhs
	 * @return whether the lhs type is a supertype of the rhs type
	 */
	public boolean isSuperTypeOf(C lhs, C rhs) {
		return getOCLInstance().getEnvironment().getUMLReflection().getAllSupertypes(rhs).contains(lhs);
	}

	public String typeCast(String object, String type) {
		return object;
	}

	public String instanceOf(String object, String type) {
		return null;
	}

	final protected C getBaseType(C t) {
		return domainSpecificOCLHandler.getBaseType(t);
	}

	abstract public String contains(String set, String item);
}
