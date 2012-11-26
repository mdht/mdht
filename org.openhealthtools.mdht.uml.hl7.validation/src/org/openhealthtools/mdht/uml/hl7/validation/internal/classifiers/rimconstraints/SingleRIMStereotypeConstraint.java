/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.TemplateBinding;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Classes;

/**
 * HL7AbstractConstraint implements the constraint to at least one RIM Profile stereotypes.
 * The current approach is to have two constraints - one make sure there is at least one and one that makes sure it is only one.
 * This is to allow some level of flexibility in the configuration of model validation but could easily combined into one constraint.
 * 
 * @see org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.MultipleRIMStereotypeConstraint
 * @author Sean Muir
 * 
 */

public class SingleRIMStereotypeConstraint extends HL7AbstractConstraint {

	private static final String ID_SINGLERIMSTEREOTYPES = CLASSES_GROUP + "singleRIMStereotypes";

	public static void register() {
		Classes.registerConstraints(ID_SINGLERIMSTEREOTYPES, new SingleRIMStereotypeConstraint());
	}

	public SingleRIMStereotypeConstraint() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		final Class rimClass = (Class) context.getTarget();

		IStatus result = context.createSuccessStatus();

		// If we do not have an assigned RIM stereotype
		if (Classes.getRIMCount(rimClass) < 1) {
			boolean exempt = false;

			// Check to see if HL7 Mif2 data type template binding thus exempt from the validation
			// For each template binding
			for (TemplateBinding templateBinding : rimClass.getTemplateBindings()) {
				// for each related element to the binding
				for (Element element : templateBinding.getRelatedElements()) {
					// Look for the template signature
					if (element instanceof RedefinableTemplateSignature) {
						RedefinableTemplateSignature redefinableTemplateSignature = (RedefinableTemplateSignature) element;

						if (DatatypeUtil.isAbstractDatatype(redefinableTemplateSignature.getClassifier())) {
							exempt = true;
						}

					}
				}

			}

			if (!exempt) {
				Object[] data = new Object[1];
				data[0] = rimClass.getName();
				result = context.createFailureStatus(data);
			}
		}

		return result;
	}

}
