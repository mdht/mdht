/*******************************************************************************
 * Copyright (c) 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.preferences;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.openhealthtools.mdht.uml.hl7.mif2uml.internal.Activator;
import org.openhealthtools.mdht.uml.hl7.mif2uml.mapping.MIFImporterOptions;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		Preferences store = Activator.getDefault()
				.getPluginPreferences();
		
		store.setDefault(MIFImporterOptions.CREATE_ASSOCIATION_CLASSES, false);
		store.setDefault(MIFImporterOptions.CREATE_STRUCTURAL_ATTRIBUTES, true);
		store.setDefault(MIFImporterOptions.CREATE_FILE_PER_PACKAGE, false);
		store.setDefault(MIFImporterOptions.USE_PACKAGE_TITLE, false);
		store.setDefault(MIFImporterOptions.USE_XHTML, true);
		store.setDefault(MIFImporterOptions.SUPPRESS_DATATYPE_COLLECTIONS, false);
	}
	
}
