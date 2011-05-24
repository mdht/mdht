/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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

package org.openhealthtools.mdht.uml.hl7.validation.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

/**
 * 
 * $Id: $
 */
public class HL7AbstractConstraint extends AbstractModelConstraint {

	public static final String CLASSES_GROUP = Activator.PLUGIN_ID + ".classes.";

	public static final String DATATYPES_GROUP = Activator.PLUGIN_ID + ".datatypes.";

	public static final String PROPERTIES_GROUP = Activator.PLUGIN_ID + ".properties.";

	public static final String ASSOCIATIONS_GROUP = Activator.PLUGIN_ID + ".associations.";

	public HL7AbstractConstraint() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.xtools.emf.validation.AbstractModelConstraint#validate(com.ibm.xtools.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		return context.createSuccessStatus();
	}

	// protected String getObjectLabel(EObject eObject) {
	// return EObjectUtil.getQName(eObject, true);
	// }

	protected String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getName();
	}

	// protected boolean containedInSchema(Element element) {
	// Stereotype stereotype = element.getApplicableStereotype("XMLSchema::Schema");
	// boolean isSchema = element.isStereotypeApplied(stereotype);
	// Package pkg = element.getNearestPackage();
	// while (!isSchema && pkg != null) {
	// isSchema = pkg.isStereotypeApplied(stereotype);
	// pkg = pkg.getNearestPackage();
	// }
	//
	// return isSchema;
	// }
}
