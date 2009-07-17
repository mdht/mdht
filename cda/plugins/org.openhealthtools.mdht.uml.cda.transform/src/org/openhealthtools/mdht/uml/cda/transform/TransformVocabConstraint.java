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
import org.eclipse.uml2.uml.util.UMLSwitch;

public class TransformVocabConstraint extends UMLSwitch {

	protected EcoreTransformerOptions transformerOptions;

	public TransformVocabConstraint(EcoreTransformerOptions options) {
		transformerOptions = options;
	}
	
	public Object caseProperty(Property property) {
		
		// Remove property?  Or, keep as redefinition?

		return property;
	}

}
