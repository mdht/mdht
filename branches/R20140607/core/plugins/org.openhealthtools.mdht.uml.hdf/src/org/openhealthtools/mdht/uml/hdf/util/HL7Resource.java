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
package org.openhealthtools.mdht.uml.hdf.util;

import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * 
 * @version $Id: $
 */
public interface HL7Resource {

	public static final String LIBRARY_FILE_EXTENSION = "library." //$NON-NLS-1$
			+
			UMLResource.FILE_EXTENSION;

	public static final String LIBRARIES_PATHMAP = "pathmap://HL7_LIBRARIES/"; //$NON-NLS-1$

	public static final String HL7_DATATYPES_LIBRARY_URI = LIBRARIES_PATHMAP + "HL7Datatypes." + LIBRARY_FILE_EXTENSION; //$NON-NLS-1$

	public static final String HL7_VOC_LIBRARY_URI = LIBRARIES_PATHMAP + "HL7VocSchema." + UMLResource.FILE_EXTENSION; //$NON-NLS-1$

	public static final String PROFILE_FILE_EXTENSION = "profile." //$NON-NLS-1$
			+
			UMLResource.FILE_EXTENSION;

	public static final String PROFILES_PATHMAP = "pathmap://HL7_PROFILES/"; //$NON-NLS-1$

	public static final String HDF_PROFILE_URI = PROFILES_PATHMAP + "HDF." //$NON-NLS-1$
			+ PROFILE_FILE_EXTENSION;

	public static final String RIM_PROFILE_URI = PROFILES_PATHMAP + "RIM." //$NON-NLS-1$
			+ PROFILE_FILE_EXTENSION;

}
