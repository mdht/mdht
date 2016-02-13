/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for filtering by resource
 *     Kenn Hussey - adding support for showing business names (or not)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 *
 * @version $Id: $
 */
public class UML2UIMessages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.mdht.uml.ui.internal.l10n.messages";//$NON-NLS-1$

	// ==============================================================================
	// Actions
	// ==============================================================================

	public static String AddUMLPackage_operation_title;

	public static String AddUMLPackageImport_operation_title;

	public static String AddUMLElementImport_operation_title;

	public static String AddUMLPackage_default_name;

	public static String AddStereotype_operation_title;

	public static String AddUMLClass_operation_title;

	public static String AddUMLClass_default_name;

	public static String AddUMLAttribute_operation_title;

	public static String AddUMLAttribute_default_name;

	public static String AddUMLOperation_operation_title;

	public static String AddUMLOperation_default_name;

	public static String AddUMLInputParameter_operation_title;

	public static String AddUMLInputParameter_default_name;

	public static String AddUMLReturnParameter_operation_title;

	public static String AddUMLReturnParameter_default_name;

	public static String AddUMLBodyConstraint_operation_title;

	public static String AddUMLBodyConstraint_default_name;

	public static String AddUMLPreConditionConstraint_operation_title;

	public static String AddUMLPreConditionConstraint_default_name;

	public static String AddUMLPostConditionConstraint_operation_title;

	public static String AddUMLPostConditionConstraint_default_name;

	public static String AddUMLComment_operation_title;

	public static String AddUMLComment_default_name;

	public static String AddUMLGeneralization_operation_title;

	public static String AddUMLGeneralization_default_name;

	public static String AddUMLConstraint_operation_title;

	public static String AddUMLConstraint_default_name;

	public static String AddUMLEnumeration_operation_title;

	public static String AddUMLEnumeration_default_name;

	public static String AddUMLEnumerationLiteral_operation_title;

	public static String AddUMLEnumerationLiteral_default_name;

	public static String AddUMLAssociation_operation_title;

	public static String TargetSelectionDialog_title;

	public static String TargetSelectionDialog_message;

	public static String GeneralizationSelectionDialog_title;

	public static String GeneralizationSelectionDialog_message;

	public static String PackageImportSelectionDialog_title;

	public static String PackageImportSelectionDialog_message;

	public static String ElementImportSelectionDialog_title;

	public static String ElementImportSelectionDialog_message;

	public static String BaseTypeFilter_title;

	public static String BaseTypeFilter_tooltip;

	public static String BaseTypeFilter_message;

	public static String ContainerFilter_title;

	public static String ContainerFilter_menu;

	public static String ContainerFilter_tooltip;

	public static String ContainerFilter_message;

	public static String ResourceFilter_title;

	public static String ResourceFilter_menu;

	public static String ResourceFilter_tooltip;

	public static String ResourceFilter_message;

	public static String RemoveFilter_title;

	public static String RemoveFilter_tooltip;

	public static String _UI_UMLEditor_menu;

	public static String _UI_ApplyProfileActionCommand_label;

	public static String _UI_ApplyStereotypeActionCommand_label;

	public static String _UI_UnapplyProfileActionCommand_label;

	public static String _UI_UnapplyStereotypeActionCommand_label;

	public static String ShowBusinessNames_title;

	// ==============================================================================
	// Property page sections
	// ==============================================================================

	// ==============================================================================
	// Editors
	// ==============================================================================

	public static String _UI_FileConflict_label;

	public static String _WARN_FileConflict;

	public static String _UI_UMLEditorDiagnostic_marker;

	public static String _UI_CreateModelError_message;

	public static String TableEditor_partName;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, UML2UIMessages.class);
	}
}
