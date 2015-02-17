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
package org.openhealthtools.mdht.uml.hdf2ecore.internal.preferences;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.openhealthtools.mdht.uml.hdf2ecore.internal.Activator;
import org.openhealthtools.mdht.uml.hdf2ecore.transform.EcoreTransformerOptions;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		Preferences store = Activator.getDefault().getPluginPreferences();

		store.setDefault(EcoreTransformerOptions.INCLUDE_VOCABULARY_CONSTRAINTS, false);
	}

}
