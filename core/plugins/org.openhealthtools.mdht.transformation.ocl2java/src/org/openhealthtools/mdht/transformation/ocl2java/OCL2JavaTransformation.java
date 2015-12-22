/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhealthtools.mdht.transformation.ocl2java;

import org.apache.commons.lang.WordUtils;
import org.eclipse.emf.ecore.EModelElement;
import org.openhealthtools.mdht.transformation.ocl.OCL2ProgrammingLanguageTransformation;

public abstract class OCL2JavaTransformation<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends OCL2ProgrammingLanguageTransformation<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	@Override
	public String count(String transform) {
		return transform + ".count()";
	}

	public String length(String string) {
		return string + ".length()";
	}

	@Override
	public String contains(String set, String item) {
		return set + ".collect(Collectors.toList()).contains(" + item + ")";
	}

	@Override
	public String iterator(String body, String i, String n, String source) {
		String result;
		if ("collect".equals(n)) {
			if (!body.startsWith("Set("))
				body = "Set(" + body + ")";
			result = "Flatten(" + listfunction(source, body, "map", i) + ")";
		} else if ("forAll".equals(n))
			result = listfunction(source, body, "allMatch", i);
		else if ("exists".equals(n))
			result = listfunction(source, body, "anyMatch", i);
		else
			result = listfunction(source, body, "filter", i);
		if ("one".equals(n))
			return count(result) + "==1";
		return result;
	}

	public String listfunction(String steps, String body, String function, String i) {
		return steps + "." + function + "(" + i + " -> " + body + ")";
	}

	@Override
	public String typeCast(String object, String type) {
		return "(" + type + ") " + object;
	}

	@Override
	public String instanceOf(String object, String type) {
		return object + " instanceof " + type;
	}

	@Override
	public String getValue(P property, String value) {
		C type = getType(property);
		if ("Integer".equals(getName(type))) {
			return value;
		}
		return super.getValue(property, value);
	}

	@Override
	public String getQualifiedName(P referredProperty) {
		String name = super.getQualifiedName(referredProperty);
		C type = getType(referredProperty);
		String prefix = "Boolean".equals(getName(type)) && isPrimitive(referredProperty) ? "is" : "get";
		String result = prefix + WordUtils.capitalize(name);
		if (getOCLInstance().getEnvironment().getUMLReflection().isMany(referredProperty) && !"text".equals(name))
			result += "s";
		result = result.replaceAll("ys$", "ies");
		result = result.replaceAll("xs$", "xes");
		result += "()";
		return result;
	}

	abstract boolean isPrimitive(P referredProperty);

	@Override
	public String typeof(String typeName) {
		return typeName + ".class";
	}
}
