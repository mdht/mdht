package org.openhealthtools.mdht.uml.cda.resources.util;

import org.eclipse.uml2.uml.resource.UMLResource;

public interface CDAResource {
	public static final String PROFILE_FILE_EXTENSION = "profile." //$NON-NLS-1$
		+ UMLResource.FILE_EXTENSION;

	public static final String PROFILES_PATHMAP = "pathmap://CDA_PROFILES/"; //$NON-NLS-1$

	public static final String CDA_PROFILE_URI = PROFILES_PATHMAP + "CDA." //$NON-NLS-1$
		+ PROFILE_FILE_EXTENSION;
}
