/*******************************************************************************
 * Copyright (c) 2015 NEHTA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NEHTA - initial API and implementation
 *
 *******************************************************************************/
package org.dita.dost.handlers;

import org.eclipse.core.runtime.Platform;

/**
 * Handle the context items menu for publishing as pdf
 * while respecting the PDF preferences in the MDHT Preferences tab
 * @author NEHTA
 */
public class PublishPdfHandler extends PublishDitaHandler {

	/*
	 * Plugin key is a soft reference to org.openhealthtools.mdht so as not to create
	 * cyclic dependencies.
	 */
	private static final String MDHT_PLUGIN_ID = "org.openhealthtools.mdht.uml.cda.ui";

	/* preference key from org.openhealthtools.mdht.uml.cda.ui.editors.MDHTPreferences */
	private static final String PDF_GEN_STORE_VALUE = "DisablePDFCheckValue";

	/**
	 * Should the context menu item be enabled?
	 * @return true if the user has not disabled PDF generation in preferences <br>
	 * 		   false if the user has disabled PDF generation
	 */
	@Override
	public boolean isEnabled() {

		Boolean disablePdfGeneration = Platform.getPreferencesService().getBoolean(
			MDHT_PLUGIN_ID, PDF_GEN_STORE_VALUE, false, null);

		// disable if the preference is set
		if (disablePdfGeneration) {
			return false;
		}

		// otherwise do what the publisher would normally do
		return super.isEnabled();
	}

}
