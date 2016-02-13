/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.ui.properties.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 *
 * @version $Id: $
 */
public class UML2UIMessages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.mdht.uml.ui.properties.internal.l10n.messages";//$NON-NLS-1$

	// ==============================================================================
	// Actions
	// ==============================================================================

	public static String AddUMLPackage_operation_title;

	public static String AddUMLPackage_default_name;

	public static String AddUMLClass_operation_title;

	public static String AddUMLClass_default_name;

	public static String _UI_UMLEditor_menu;

	public static String _UI_ApplyProfileActionCommand_label;

	public static String _UI_ApplyStereotypeActionCommand_label;

	public static String _UI_UnapplyProfileActionCommand_label;

	public static String _UI_UnapplyStereotypeActionCommand_label;

	// ==============================================================================
	// Property page sections
	// ==============================================================================

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

	// ==============================================================================
	// Editors
	// ==============================================================================

	public static String TableEditor_partName;

	// ==============================================================================
	// Wizards
	// ==============================================================================

	public static String Wizard_label;

	public static String UML2ModelWizard_label;

	public static String UML2ModelWizard_description;

	public static String UML2ModelWizard_operation_label;

	public static String UML2EditorFilenameDefaultBase;

	public static String UML2FilenameExtension;

	public static String EMXFilenameExtension;

	public static String XMIFilenameExtension;

	public static String NewModel_WARN_FilenameExtension;

	public static String NewModel_ERROR_FileCreation;

	public static String ModelObject;

	public static String XMLEncoding;

	public static String XMLEncodingChoices;

	public static String Wizard_new_file_description;

	public static String Wizard_initial_object_description;

	public static String FileConflict_label;

	public static String NewModel_WARN_FileConflict;

	public static String Browse_label;

	public static String File_label;

	public static String Question_title;

	public static String Error_title;

	public static String NewModel_WARN_No_Editor;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, UML2UIMessages.class);
	}
}
