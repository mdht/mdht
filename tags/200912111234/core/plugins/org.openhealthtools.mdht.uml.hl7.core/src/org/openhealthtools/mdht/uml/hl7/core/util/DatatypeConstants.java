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
public interface DatatypeConstants {

	public static final String HL7_DATATYPES_PATHMAP = "pathmap://HL7_DT_UV/"; //$NON-NLS-1$

	public static final String HL7_DATATYPES_1_0 = "DEFN=UV=DT=1.0"; //$NON-NLS-1$

	public static final String HL7_DATATYPES_2_0 = "DEFN=UV=DT=2.0"; //$NON-NLS-1$

	public static final String HL7_DATATYPES_1_0_LIBRARY_URI = HL7_DATATYPES_PATHMAP
		+ HL7_DATATYPES_1_0 + "." + UMLResource.FILE_EXTENSION; //$NON-NLS-1$

	public static final String HL7_DATATYPES_2_0_LIBRARY_URI = HL7_DATATYPES_PATHMAP
		+ HL7_DATATYPES_2_0 + "." + UMLResource.FILE_EXTENSION; //$NON-NLS-1$

}
