/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.common.ui.internal.l10n;

import org.eclipse.mdht.uml.common.ui.internal.Activator;
import org.eclipse.osgi.util.NLS;

/**
 *
 * @version $Id: $
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = Activator.PLUGIN_ID + ".internal.l10n.messages";//$NON-NLS-1$

	// ==============================================================================
	// Dialogs
	// ==============================================================================

	public static String ElementLabelProvider_default_package;

	public static String ElementLabelProvider_dash;

	public static String ElementSelectionDialog_title;

	public static String ElementSelectionDialog_message;

	public static String ElementSelectionDialog_errorMessage;

	public static String ElementSelectionDialog_errorTitle;

	public static String ElementSelectionDialog_lowerLabel;

	public static String ElementSelectionDialog_upperLabel;

	public static String ElementSelectionDialog_notypes_title;

	public static String ElementSelectionDialog_notypes_message;

	public static String ElementSelectionDialog_error2Message;

	public static String ElementSelectionDialog_error2Title;

	public static String ElementSelectionDialog_error3Message;

	public static String ElementSelectionDialog_error3Title;

	public static String PackageSelectionDialog_title;

	public static String PackageSelectionDialog_description;

	public static String PackageSelectionDialog_empty;

	public static String ModelSave_task;

	public static String ModelClose_task;

	public static String FileSaveError;

	public static String FileConflict_label;

	public static String FileConflictWarning;

	public static String UMLEditorDiagnostic_marker;

	public static String CreateModelError_message;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
