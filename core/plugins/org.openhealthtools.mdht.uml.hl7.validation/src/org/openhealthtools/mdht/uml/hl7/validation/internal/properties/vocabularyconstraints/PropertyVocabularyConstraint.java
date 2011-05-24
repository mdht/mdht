/*******************************************************************************
 * Copyright (c) 2008, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (JKM Software) - Refactored constraint structure
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.validation.internal.properties.vocabularyconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.Properties;

public class PropertyVocabularyConstraint extends HL7AbstractConstraint {

	private static final String ID_PROPERTYVOCABULARY = PROPERTIES_GROUP + "propertyVocabulary";

	public static void register() {
		Properties.registerConstraints(ID_PROPERTYVOCABULARY, new PropertyVocabularyConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {
		// / TODO Implement Vocabulary Test
		return context.createSuccessStatus();
	}

}
