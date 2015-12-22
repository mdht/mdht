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

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;

public abstract class OCL2ProgrammingLanguageTransformation<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends OCLTransformation<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	private int iCounter;

	@Override
	public String step(String set, String property) {
		if (set.startsWith("Set(") && set.endsWith(")") && !set.contains(".")) {
			// shortcut
			String i = set.substring("Set(".length(), set.length() - ")".length());
			return referVar(i + "." + property);
		}
		String i = newVar();
		return iterator(i + "." + property, i, "collect", set);
	}

	@Override
	final public String newVar() {
		return "i" + iCounter++;
	}

	@Override
	final protected String selfNode() {
		return referVar(selfVariable);
	}

	@Override
	protected String op(String operator) {
		if ("<>".equals(operator))
			return "!=";
		if ("=".equals(operator))
			return "==";
		if ("and".equals(operator))
			return " && ";
		if ("or".equals(operator))
			return " || ";
		if ("xor".equals(operator))
			return " ^ ";
		if ("not".equals(operator))
			return "!";
		return operator;
	}

	@Override
	public String compare(String opName, String xpath, String xpath2) {
		if ("=".equals(opName) && (xpath.startsWith("Set(") || xpath.startsWith("Flatten(")) && xpath.endsWith(")") && !xpath.endsWith(count(""))) {
			// optimization
			return contains(xpath, xpath2);
		}
		return "One(" + xpath + ")" + op(opName) + xpath2;
	}

	@Override
	final public String referVar(String variable) {
		return "Set(" + variable + ")";
	}

	@Override
	@SuppressWarnings("unchecked")
	protected String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		if ("size".equals(opName)) {
			if ("String".equals(getName(op.getSource().getType())))
				return length("One(" + transform(op.getSource()) + ")");
			return count(transform(op.getSource()));
		}
		return super.transformDomainSpecific(op, opName);
	}

	abstract public String length(String string);

	abstract public String count(String transform);

	@Override
	final public String childNode(String step) {
		String i = newVar();
		return iterator("getClinicalStatement(" + i + ")", i, "collect", step);
	}

	@Override
	@SuppressWarnings("unchecked")
	public String transform(OCLExpression<C> exp) {
		if (exp instanceof EnumLiteralExp) {
			EnumLiteralExp<C, EL> enumLiteralExp = (EnumLiteralExp<C, EL>) exp;
			return getName(enumLiteralExp.getType()) + "." + getName(enumLiteralExp.getReferredEnumLiteral());
		}
		return super.transform(exp);
	}

	public String cosmetics(String result) {
		result = result.replace("true()", "true");
		result = result.replace("false()", "false");
		return result;
	};

	@Override
	final public String isEmpty(String set) {
		return count(set) + "==0";
	}

	@Override
	final public String isNotEmpty(String set) {
		return count(set) + "!=0";
	}

	@Override
	public String getValue(P property, String value) {
		C type = getType(property);
		if (getOCLInstance().getEnvironment().getUMLReflection().isEnumeration(type)) {
			return getName(type) + "." + value;
		}
		if ("EBooleanObject".equals(getName(type)) || "Boolean".equals(getName(type))) {
			return value;
		}
		return "\"" + value.replace("\r", "").replace("\n", "\\n\"\n\t\t\t\t+ \"") + "\"";
	}

	abstract public String typeCast(String object, String type);

	abstract public String instanceOf(String object, String type);

	public String one(String transform) {
		return "One(" + transform + ")";
	}

}
