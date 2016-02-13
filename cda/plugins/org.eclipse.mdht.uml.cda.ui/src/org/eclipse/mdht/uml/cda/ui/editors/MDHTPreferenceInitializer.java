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
package org.eclipse.mdht.uml.cda.ui.editors;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.ui.internal.Activator;

public class MDHTPreferenceInitializer extends AbstractPreferenceInitializer {

	private IPropertyChangeListener changeListener = new IPropertyChangeListener() {
		public void propertyChange(PropertyChangeEvent event) {
			handleChanges(event);
		}
	};

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(MDHTPreferences.CARDINALITY_STORE_VALUE, false);
		store.setDefault(MDHTPreferences.PDF_GEN_STORE_VALUE, false);
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(changeListener);
	}

	private void handleChanges(PropertyChangeEvent event) {
		if (event.getProperty().equals(MDHTPreferences.CARDINALITY_STORE_VALUE)) {
			CDAModelUtil.cardinalityAfterElement = (Boolean) event.getNewValue();
		}

		if (event.getProperty().equals(MDHTPreferences.PDF_GEN_STORE_VALUE)) {
			CDAModelUtil.disablePdfGeneration = (Boolean) event.getNewValue();
		}
	}

}
