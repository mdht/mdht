/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Association;

public class TransformAssociation extends TransformAbstract {

	public TransformAssociation(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseAssociation(Association association) {
		if (isRemoved(association)) {
			return null;
		}
		
		removeModelElement(association);
		
		return association;
	}

}
