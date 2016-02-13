/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sarp Kaya (NEHTA)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.dita.internal.preferences;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.mdht.uml.cda.dita.DitaTransformerOptions;
import org.eclipse.mdht.uml.cda.dita.internal.Activator;

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

		store.setDefault(DitaTransformerOptions.INCLUDE_TABLE_VIEW, false);
		store.setDefault(DitaTransformerOptions.INCLUDE_VOCABULARY_CONSTRAINTS, false);
		store.setDefault(DitaTransformerOptions.CARDINALITY_AFTER_ELEMENT, false);
	}

}
