/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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

import org.eclipse.uml2.uml.Property;

/**
 * Transform UML property constraints for: multiplicity, type restriction.
 */
public class TransformPropertyConstraint extends TransformAbstract {

	public TransformPropertyConstraint(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseProperty(Property property) {
		if (isRemoved(property)) {
			return null;
		}
		
		// Find redefined property from superclass
		
		
		// Test for valid type restriction
		
		
		// Test for valid multiplicity restriction
		
		
		// else remove the property
		removeModelElement(property);
		
		return property;
	}

}
