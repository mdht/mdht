/*******************************************************************************
 * Copyright (c) 2009 David A Carlson
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
package org.openhealthtools.mdht.uml.cda.resources.util;

import org.eclipse.uml2.uml.resource.UMLResource;

public interface CDAResource {
	public static final String PROFILE_FILE_EXTENSION = "profile." //$NON-NLS-1$
			+
			UMLResource.FILE_EXTENSION;

	public static final String PROFILES_PATHMAP = "pathmap://CDA_PROFILES/"; //$NON-NLS-1$

	public static final String CDA_PROFILE_URI = PROFILES_PATHMAP + "CDA." //$NON-NLS-1$
			+ PROFILE_FILE_EXTENSION;
}
