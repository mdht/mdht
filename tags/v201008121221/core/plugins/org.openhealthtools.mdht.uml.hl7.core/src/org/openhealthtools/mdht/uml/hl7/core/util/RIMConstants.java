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
package org.openhealthtools.mdht.uml.hl7.core.util;

import org.eclipse.uml2.uml.resource.UMLResource;

/**
 *
 * @version $Id: $
 */
public interface RIMConstants {

	public static final String HL7_RIM_PATHMAP = "pathmap://HL7_RIM_UV/"; //$NON-NLS-1$

	public static final String HL7_RIM_LIBRARY_URI = HL7_RIM_PATHMAP
		+ "RIM." + UMLResource.FILE_EXTENSION; //$NON-NLS-1$

}
