/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ui.filters;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

/**
 * Selects an object if it is a UML Property with 
 * VocabularySpecification stereotype applied.
 */
public class VocabSpecificationFilter extends CDAFilter {

	public boolean select(Object object) {
		Element element = getElement(object);
		
		if (element instanceof Property) {
			Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
					element, ICDAProfileConstants.VOCAB_SPECIFICATION);
			return stereotype != null;
		}
		return false;
	}

}
