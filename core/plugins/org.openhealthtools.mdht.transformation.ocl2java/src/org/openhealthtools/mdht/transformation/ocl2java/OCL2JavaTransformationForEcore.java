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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.openhealthtools.mdht.transformation.ocl.DomainSpecificOCLHandler;

/**
 * @author Joe
 * 
 */
public class OCL2JavaTransformationForEcore extends OCL2JavaTransformation<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> {

	public OCL2JavaTransformationForEcore(ResourceSet rset) {
		this.rset = rset;
	}

	public OCL2JavaTransformationForEcore(ResourceSet resourceSet, DomainSpecificOCLHandler<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> domainSpecificOCLHandler) {
		this(resourceSet);
		this.setDomainSpecificOCLHandler(domainSpecificOCLHandler);
	}

	@Override
	public org.eclipse.ocl.OCL<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> getOCLInstance() {
		return OCL.newInstance();
	}

	@Override
	boolean isPrimitive(EStructuralFeature referredProperty) {
		return !referredProperty.getEType().getName().startsWith("E");
	}
}
