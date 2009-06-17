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
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Classes;

/**
 * MultipleRIMStereotypeConstraint implements the constraint to limit one and only RIM Profile stereotypes.
 * The current approach is to have two constraints - one make sure there is at least one and one that makes sure it is only one.
 * This is to allow some level of flexibility in the configuration of model validation but could easily combined into one constraint.
 * 
 * @see org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.SingleRIMStereotypeConstraint
 * 
 * @author Sean Muir
 *
 */
public class MultipleRIMStereotypeConstraint extends HL7AbstractConstraint {
	
	private static final String ID_MULTIPLERIMSTEREOTYPES = CLASSES_GROUP + "multipleRIMStereotypes";

	
	public static void register(){
		Classes.registerConstraints(ID_MULTIPLERIMSTEREOTYPES, new MultipleRIMStereotypeConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {

		final Class rimClass = (Class) context.getTarget();
		
		IStatus result = context.createSuccessStatus();
		
		if (Classes.getRIMCount(rimClass)>1)
		{
			Object[] data = new Object[1];
			data[0] = rimClass.getName();
			result = context.createFailureStatus(data);	
		}

		return result;
	}

}
