/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhealthtools.mdht.transformation.ocl2xpath;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.uml.PropertyCallExp;
import org.openhealthtools.mdht.transformation.ocl.OCLTransformation;

/**
 * Transformation from OCL to XPath (UML or Ecore OCL is used by subclasses of this class by binding the type parameters)
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
abstract public class OCL2XPathTransformation<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends OCLTransformation<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	@Override
	@SuppressWarnings("unchecked")
	public String transform(org.eclipse.ocl.expressions.OCLExpression<C> exp) {
		if (exp instanceof OperationCallExp) {
			OperationCallExp<C, O> op = (OperationCallExp<C, O>) exp;
			String opName = getName(op.getReferredOperation());

			String domainSpecific = transformDomainSpecific(op, opName);
			if (domainSpecific != null)
				return domainSpecific;

			if ("matches".equals(opName)) {
				return step(transform(op.getSource()), "attribute::node()[name() = " + transform(op.getArgument().get(0)) + " and matches(string(.)," + transform(op.getArgument().get(1)) + ")]");
			}
			if ("substring".equals(opName)) {
				return "substring(" + transform(op.getSource()) + "," + transform(op.getArgument().get(0)) + "," + transform(op.getArgument().get(1)) + "-" + transform(op.getArgument().get(0)) + ")";
			}
			if ("size".equals(opName)) {
				if ("String".equals(getName(op.getSource().getType())))
					return "string-length(" + transform(op.getSource()) + ")";
				return "count(" + transform(op.getSource()) + ")";
			}
			if ("excluding".equals(opName)) {
				return predicate(transform(op.getSource()), ". != " + transform(op.getArgument().get(0)));
			}

		}
		if (exp instanceof EnumLiteralExp) {
			EnumLiteralExp<C, EL> enumLiteralExp = (EnumLiteralExp<C, EL>) exp;
			return "\"" + getName(enumLiteralExp.getReferredEnumLiteral()) + "\"";
		}
		if (exp instanceof IfExp) {
			IfExp<C> ifExp = (IfExp<C>) exp;
			String condition = transform(ifExp.getCondition());
			return "(" + predicate(transform(ifExp.getThenExpression()), condition) + " | " + predicate(transform(ifExp.getElseExpression()), not(condition)) + ")";
		}
		if (exp instanceof NullLiteralExp) {
			return "false()";
		}
		if (exp instanceof BooleanLiteralExp) {
			BooleanLiteralExp<C> booleanLiteralExp = (BooleanLiteralExp<C>) exp;
			if (exp.eContainer() instanceof OperationCallExp) {
				OperationCallExp<C, O> op = (OperationCallExp<C, O>) exp.eContainer();
				String opName = getName(op.getReferredOperation());
				if ("=".equals(opName) || "<>".equals(opName)) {
					OCLExpression<C> otherArg = op.getSource() == exp ? op.getArgument().get(0) : op.getSource();
					if (otherArg instanceof PropertyCallExp && "Boolean".equals(getName(otherArg.getType()))) {
						return "'" + booleanLiteralExp.getBooleanSymbol().toString() + "'";
					}
				}
			}
		}
		return super.transform(exp);
	}

	@Override
	public String newVar() {
		return selfNode();
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
	@Override
	public String iterator(String body, String i, String n, String source) {
		String predicate;
		if ("forAll".equals(n) || "reject".equals(n)) {
			predicate = not(body);
		} else {
			predicate = body;
		}
		String result;
		if ("collect".equals(n) || "exists".equals(n) & body.startsWith("@root = \""))
			result = step(source, predicate);
		else
			result = predicate(source, predicate);
		if ("one".equals(n)) {
			return "count(" + result + ")=1";
		}
		if ("forAll".equals(n)) {
			return not(result);
		}
		return result;
	}

	/**
	 * The equivalent to the given OCL operator
	 * 
	 * @param operator
	 * @return
	 */
	@Override
	protected String op(String operator) {
		if ("<>".equals(operator))
			return "!=";
		if ("and".equals(operator))
			return " and ";
		if ("or".equals(operator))
			return " or ";
		if ("xor".equals(operator))
			return " or ";
		return operator;
	}

	@Override
	public String isEmpty(String set) {
		return not(set);
	}

	@Override
	public String isNotEmpty(String set) {
		return set;
	}

	protected String predicate(String set, String predicate) {
		if (".".equals(set))
			return predicate;
		return set + "[" + predicate + "]";
	}

	@Override
	public String step(String set, String property) {
		if (".".equals(set))
			return property;
		return set + "/" + property;
	}

	public String cosmetics(String result) {
		result = result.replace("true() and ", ""); // cosmetic
		result = result.replace(" and true()", ""); // cosmetic
		result = result.replace("[. and ", "["); // cosmetic
		result = result.replace("[true()]", ""); // cosmetic
		result = result.replace("[.]", ""); // cosmetic
		return result;
	}

	@Override
	protected String selfNode() {
		return ".";
	}

	/**
	 * Qualifies the given element by a namespace
	 */
	@Override
	public String nsPrefix(String elementName) {
		return "cda:" + elementName;
	}

	@Override
	public String childNode(String step) {
		return step + "/child::node()";
	}

	public String compare(String operator, String lhs, String rhs) {
		// if e.g. nullFlavor attribute is undefined, then "@nullFlavor!='NI'" evaluates unexpectedly to false, so generate "not(@nullFlavor='NI')" instead!
		if ("<>".equals(operator))
			return not(super.compare("=", lhs, rhs));
		return super.compare(operator, lhs, rhs);
	}

	public String referVar(String variable) {
		// only support the "self" variable
		return selfNode();
	}

	public String instanceOf(String object, String type) {
		return predicate(object, "@xsi:type=\"" + type + "\"");
	}

	@Override
	public String typeof(String typeName) {
		return "\"" + typeName + "\"";
	}

	@Override
	public String contains(String set, String item) {
		return set + "=" + item;
	}
}
