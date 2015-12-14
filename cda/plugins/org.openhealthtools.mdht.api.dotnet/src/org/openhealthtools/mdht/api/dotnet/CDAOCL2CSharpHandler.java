/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api.dotnet;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.api.CDAOCLHandler;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;

public class CDAOCL2CSharpHandler<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends CDAOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	@Override
	public String getName(Object namedObject) {
		if (trafo.getOCLInstance().getEnvironment().getUMLReflection().isClassifier(namedObject)) {
			String name = getName(trafo.getOCLInstance().getEnvironment().getUMLReflection().getPackage((C) namedObject));
			if ("cda".equals(name) || "rim".equals(name))
				return "POCD_MT000040" + super.getName(namedObject);
		}
		return super.getName(namedObject);
	}

	@Override
	public String getPropertyName(P p) {
		Property property = (Property) p;
		if (CDACommonUtils.getCDAProperty(property) != null) {
			property = CDACommonUtils.getCDAProperty(property);
			p = (P) property;
		}
		if (!(property.getType() instanceof Class)) {
			if ("mixed".equals(property.getName())) {
				return "@Text";
			}
			if ("part".equals(property.getName())) {
				return "@Text";
			}
			if ("any".equals(property.getName())) {
				return "@Text";
			}
			if ("institutionSpecified".equals(property.getName())) {
				return "@institutionSpecified1";
			}
			return "@" + property.getName();
		}
		if ("event".equals(property.getName())) {
			return "@event";
		}
		return property.getName();
	}

	@Override
	@SuppressWarnings("unchecked")
	public String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		if ("getClinicalDocument".equals(opName) || "getSection".equals(opName) || "getAllSections".equals(opName) || "hasContent".equals(opName) || "validateTargetOfEntryRelationship".equals(opName) || "isDefined".equals(opName) || "matches".equals(opName) || "validateTargetOfEntryRelationship".equals(opName)
				|| "getText".equals(opName) || "getSubstanceAdministrations".equals(opName) || "getSupplies".equals(opName)) {
			String source = trafo.transform(op.getSource());
			String params = "";
			for (OCLExpression<C> arg : op.getArgument())
				params += ", " + trafo.transform(arg);
			String i = trafo.newVar();
			String n = "collect";
			if ("Boolean".equals(getName(op.getType())))
				n = "exists";
			return trafo.iterator(opName + "(" + i + params + ")", i, n, source);
		}

		return super.transformDomainSpecific(op, opName);
	}

}
