/*******************************************************************************
 * Copyright (c) 2015 NEHTA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NEHTA - initial implementation
 *
 *******************************************************************************/
package org.dita.dost.handlers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.Platform;

/**
 * Test for the presence of the disable PDF MDHT Preference option
 *
 * @author NEHTA
 *
 * @see org.openhealthtools.mdht.uml.cda.ui.editors.MDHTPreferences
 *
 */
public class PdfPreferenceTester extends PropertyTester {
	public static final String TEST_PDF = "testPDF";

	/*
	 * Plugin key is a soft reference to org.openhealthtools.mdht so as not to create
	 * cyclic dependencies.
	 */
	private static final String MDHT_PLUGIN_ID = "org.openhealthtools.mdht.uml.cda.ui";

	/* preference key from org.openhealthtools.mdht.uml.cda.ui.editors.MDHTPreferences */
	private static final String PDF_GEN_STORE_VALUE = "DisablePDFCheckValue";

	/**
	 * Should the eclipse menu display the PDF publishing options?
	 */
	public boolean test(final Object receiver, final String property, final Object[] args, final Object expectedValue) {

		Boolean disablePdfGeneration = Platform.getPreferencesService().getBoolean(
			MDHT_PLUGIN_ID, PDF_GEN_STORE_VALUE, false, null);

		// don't display if the preference is set
		if (disablePdfGeneration && TEST_PDF.equals(property)) {
			return false;
		}

		// display otherwise
		return true;
	}
}
