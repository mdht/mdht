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

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.mdht.uml.cda.ui.internal.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class MDHTPreferences extends PreferencePage implements IWorkbenchPreferencePage {

	private static String CARDINALITY_CHECK_BOX_LABEL = "Show multiplicity after the element name" +
			" in the Properties view";

	private static String CARDINALITY_CHECK_BOX_TOOLTIP = "Show multiplicity after the element name in the" +
			" Properties view. This does not affect the DITA publication (PDF, Online) - " +
			"for that, dita-transform.xml needs to be adjusted to say " +
			"cardinalityAfterElement=\"true\" in <transformToDita>";

	private static String PDF_GEN_DISABLE_CHECK_BOX_LABEL = "Disable built-in PDF generation";

	private static String PDF_GEN_DISABLE_CHECK_BOX_TOOLTIP = "Prevent the automatic generation of PDF " +
			" files in the workspace. This also removes the PDF Generation context menu option";

	public static String CARDINALITY_STORE_VALUE = "CardinalityCheckValue";

	public static String PDF_GEN_STORE_VALUE = "DisablePDFCheckValue";

	private Button cardinalityCheckBox;

	private Button disablePdfGenerationCheckBox;

	/**
	 * Creates an new checkbox instance and sets the default
	 * layout data.
	 *
	 * @param group
	 *            the composite in which to create the checkbox
	 * @param label
	 *            the string to set into the checkbox
	 * @return the new checkbox
	 */
	private Button createCheckBox(Composite group, String label, String toolTip) {
		Button button = new Button(group, SWT.CHECK | SWT.LEFT);
		button.setText(label);
		button.setToolTipText(toolTip);
		GridData data = new GridData();
		button.setLayoutData(data);
		return button;
	}

	/**
	 * Creates composite control and sets the default layout data.
	 *
	 * @param parent
	 *            the parent of the new composite
	 * @param numColumns
	 *            the number of columns for the new composite
	 * @return the newly-created coposite
	 */
	private Composite createComposite(Composite parent, int numColumns) {
		Composite composite = new Composite(parent, SWT.NULL);

		// GridLayout
		GridLayout layout = new GridLayout();
		layout.numColumns = numColumns;
		composite.setLayout(layout);

		// GridData
		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);
		return composite;
	}

	/**
	 * (non-Javadoc)
	 * Method declared on PreferencePage
	 */
	@Override
	protected Control createContents(Composite parent) {
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "MDHTPreferences");

		Composite composite_textField = createComposite(parent, 2);
		cardinalityCheckBox = createCheckBox(
			composite_textField, CARDINALITY_CHECK_BOX_LABEL, CARDINALITY_CHECK_BOX_TOOLTIP);

		Composite pdf_composite_textField = createComposite(parent, 2);
		disablePdfGenerationCheckBox = createCheckBox(
			pdf_composite_textField, PDF_GEN_DISABLE_CHECK_BOX_LABEL, PDF_GEN_DISABLE_CHECK_BOX_TOOLTIP);

		initializeValues();

		return new Composite(parent, SWT.NULL);
	}

	/**
	 * The <code>ReadmePreferencePage</code> implementation of this <code>PreferencePage</code> method
	 * returns preference store that belongs to the our plugin.
	 * This is important because we want to store
	 * our preferences separately from the workbench.
	 */
	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	public void init(IWorkbench workbench) {
	}

	/**
	 * Initializes states of the controls using default values
	 * in the preference store.
	 */
	private void initializeDefaults() {
		IPreferenceStore store = getPreferenceStore();
		cardinalityCheckBox.setSelection(store.getDefaultBoolean(CARDINALITY_STORE_VALUE));
		disablePdfGenerationCheckBox.setSelection(store.getBoolean(PDF_GEN_STORE_VALUE));
	}

	/**
	 * Initializes states of the controls from the preference store.
	 */
	private void initializeValues() {
		IPreferenceStore store = getPreferenceStore();
		cardinalityCheckBox.setSelection(store.getBoolean(CARDINALITY_STORE_VALUE));
		disablePdfGenerationCheckBox.setSelection(store.getBoolean(PDF_GEN_STORE_VALUE));
	}

	@Override
	protected void performDefaults() {
		super.performDefaults();
		initializeDefaults();
	}

	@Override
	public boolean performOk() {
		storeValues();
		return true;
	}

	/**
	 * Stores the values of the controls back to the preference store.
	 */
	private void storeValues() {
		IPreferenceStore store = getPreferenceStore();
		store.setValue(CARDINALITY_STORE_VALUE, cardinalityCheckBox.getSelection());
		store.setValue(PDF_GEN_STORE_VALUE, disablePdfGenerationCheckBox.getSelection());
	}
}
