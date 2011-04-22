/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;

public class GenMethodHelper {

	public static Operation genAssociationGetterOperation(Property sourceProperty, Type domainType) {
		Class sourceClass = sourceProperty.getClass_();
		Class targetClass = (Class) sourceProperty.getType();
		
		if (sourceClass == null || targetClass == null || sourceProperty == null) {
			return null;
		}

		String targetQName = targetClass.getQualifiedName();

		Class cdaTargetClass = CDAModelUtil.getCDAClass(targetClass);
		String cdaTargetName = cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
		String cdaTargetQName = cdaTargetClass.getQualifiedName();
		
		StringBuffer operationBody = new StringBuffer();

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass))
				&& CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			operationBody.append("self.getAllSections()->select(");
			operationBody.append("section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" + targetQName + "))");
			
		}
		else {
			operationBody.append("self.get" + pluralize(cdaTargetName) + "()->select(");
			operationBody.append(cdaTargetLowerName + " : " + cdaTargetQName + " | ");
			operationBody.append("not " + cdaTargetLowerName + ".oclIsUndefined() and ");
			operationBody.append(cdaTargetLowerName + ".oclIsKindOf(" + targetQName + "))");
		}

		if (sourceProperty.getUpper() == 1) {
			operationBody.append("->asSequence()->first()");
		}
		operationBody.append(".oclAsType(" + targetQName + ")");
	
		String operationName = "get";
//		if (!UMLUtil.getRedefinedProperties(sourceProperty).isEmpty()) {
//			operationName += CDAModelUtil.getModelPrefix(sourceProperty);
//		}
		operationName += ((sourceProperty.getUpper() == 1) ? capitalize(sourceProperty.getName()) : capitalize(pluralize(sourceProperty.getName())));
		Operation operation = sourceClass.createOwnedOperation(operationName, null, null, domainType);
		operation.setIsQuery(true);	// make this a query method
		operation.setUpper(sourceProperty.getUpper());
		
		// create body constraint for "getter" operation
		Constraint bodyConstraint = operation.createBodyCondition("body");
		bodyConstraint.getConstrainedElements().add(operation);
		
		OpaqueExpression bodyExpression = (OpaqueExpression) bodyConstraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		bodyExpression.getLanguages().add("OCL");
		bodyExpression.getBodies().add(operationBody.toString());
		
		return operation;
	}

	protected static String pluralize(String name) {
		if (name.endsWith("y")) {
			return name.substring(0, name.length() - 1) + "ies";
		}
		if (name.endsWith("ia")) {
			return name;
		}
		return name + "s";
	}
	
	protected static String capitalize(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

}
