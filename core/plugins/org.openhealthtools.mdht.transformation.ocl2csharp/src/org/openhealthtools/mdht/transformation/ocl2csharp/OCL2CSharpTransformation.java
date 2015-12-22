/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhealthtools.mdht.transformation.ocl2csharp;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.openhealthtools.mdht.transformation.ocl.OCL2ProgrammingLanguageTransformation;

public abstract class OCL2CSharpTransformation<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends OCL2ProgrammingLanguageTransformation<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	public String listfunction(String steps, String body, String function, String i) {
		return steps + "." + function + "(" + i + " => " + body + ")";
	}

	@Override
	public String step(String set, String property) {
		if (set.startsWith("Set(") && set.endsWith(")") && !set.contains(".")) {
			// shortcut
			String i = set.substring("Set(".length(), set.length() - ")".length());
			return referVar(i + "." + property);
		}
		String i = newVar();
		return "Flatten(" + listfunction(set, i + "." + property, "ConvertAll", i) + ")";
	}

	@Override
	public String iterator(String body, String i, String n, String source) {
		String result;
		if ("collect".equals(n))
			result = "Flatten(" + listfunction(source, body, "ConvertAll", i) + ")";
		else if ("forAll".equals(n))
			result = listfunction(source, body, "TrueForAll", i);
		else if ("exists".equals(n))
			result = listfunction(source, body, "Exists", i);
		else
			result = listfunction(source, body, "FindAll", i);
		if ("one".equals(n))
			return count(result) + "==1";
		return result;
	}

	@Override
	public String compare(String opName, String xpath, String xpath2) {
		if ("=".equals(opName) && (xpath.startsWith("Set(") || xpath.startsWith("Flatten(")) && xpath.endsWith(")")) {
			// optimization
			return xpath + ".Contains(" + xpath2 + ")";
		}
		return "One(" + xpath + ")" + op(opName) + xpath2;
	}

	@Override
	@SuppressWarnings("unchecked")
	public String transform(OCLExpression<C> exp) {
		if (exp instanceof PropertyCallExp) {
			PropertyCallExp<C, P> propertyCallExp = (PropertyCallExp<C, P>) exp;
			String n = getName(propertyCallExp.getReferredProperty());
			if ("high".equals(n) || "low".equals(n) || "width".equals(n) || "center".equals(n)) {
				String t = "IVXB_TS";
				if ("center".equals(n))
					t = "TS";
				if ("width".equals(n))
					t = "PQ";
				String self = transform(propertyCallExp.getSource());
				String i = newVar();
				String predicate = "getTime<" + t + ">(" + i + ", ItemsChoiceType3." + n + ")";
				return listfunction(self, predicate, "ConvertAll", i);
			}
		}
		return super.transform(exp);
	}

	public String typeCast(String object, String type) {
		return object + " as " + type;
	}

	public String instanceOf(String object, String type) {
		return object + " is " + type;
	}

	@Override
	public String count(String transform) {
		return transform + ".Count";
	}

	@Override
	public String length(String string) {
		return string + ".Length";
	}

	@Override
	public String contains(String set, String item) {
		return set + ".Contains(" + item + ")";
	}

	@Override
	public String typeof(String typeName) {
		return "typeof(" + typeName + ")";
	}
}
