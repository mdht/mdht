/*******************************************************************************
 * Copyright (c) 2015 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sarp Kaya (NEHTA) - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.editors;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;

public class MDHTPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		// These settings will show up when the Readme preference page
		// is shown for the first time.
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(MDHTPreferences.CARDINALITY_STORE_VALUE, true);
	}

}
