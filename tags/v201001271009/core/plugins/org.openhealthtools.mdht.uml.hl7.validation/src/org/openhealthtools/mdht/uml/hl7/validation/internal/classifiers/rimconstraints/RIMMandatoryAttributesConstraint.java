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
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hl7.core.util.RIMUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Classes;

/**
 * RIMMandatoryAttribtuesConstraint implements the constraint to make sure all
 * the required attributes based on the rim derivation are present on the class.
 * 
 */
public class RIMMandatoryAttributesConstraint extends HL7AbstractConstraint {
	
	private static final String ID_RIMMANDATORYATTRIBUTES = CLASSES_GROUP + "RIMMandatoryAttributes";
	
	public static void register(){
		Classes.registerConstraints(ID_RIMMANDATORYATTRIBUTES, new RIMMandatoryAttributesConstraint());
	}
	
	@Override
	public IStatus validate(IValidationContext context) {
	final Class rimClass = (Class) context.getTarget();
		
		IStatus result = context.createSuccessStatus();
		
		
		// No need to flag invalid stereotype properties when the stereotype is invalid
		// and choice groups are not bound by this constraint
		if (Classes.getRIMCount(rimClass) == 1  && HL7ResourceUtil.getAppliedHDFStereotype(rimClass,IHDFProfileConstants.CHOICE_GROUP) == null  ) {

			Stereotype rimStereotype = null;

			for (Stereotype stereotype : rimClass.getAppliedStereotypes()) {
				if (IRIMProfileConstants.RIM_PROFILE_NAME.equals(stereotype
						.getProfile().getName())) {
					rimStereotype = stereotype;
					break;
				}
			}

			if (rimStereotype != null) {
				
				// Get the RIM derivation based on the value				
				Class rimDerivedClass = RIMUtil.getClassByName(rimClass.getNearestPackage(), rimStereotype.getName());				
				
				// All HL7 classes are derived from the rim indirectly through
				// the use of rim stereotypes. All uml derived classes must
				// contain at least all of the rim required attributes.
				if (rimDerivedClass != null)
				{
					for (Property derivedProperty : rimDerivedClass.getAllAttributes())
					{
						if (derivedProperty.is(1, 1) && derivedProperty.getAssociation() == null )
						{
							if (rimClass.getAttribute(derivedProperty.getName(), derivedProperty.getType()) == null)
							{
								
								Object[] data = new Object[2];
								data[0] = derivedProperty.getName();
								data[1] = rimStereotype.getName();
								result = context.createFailureStatus(data);
								
							}
						}
					}
					
				}
				
			}
		}
		return result;
	}
	
	

}
