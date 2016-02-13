/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.cda.ui.properties;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Displays information which is normally too large to be displayed in a {@link MessageDialog}
 */
public class MemoDialog extends Dialog {

	/**
	 * The title of the dialog.
	 */
	private String title;

	/**
	 * The input value; the empty string by default.
	 */
	private String value = "";//$NON-NLS-1$

	/**
	 * Input text widget.
	 */
	private Text text;

	private boolean editable;

	/**
	 * Creates an input dialog with OK and Cancel buttons. Note that the dialog will have no visual representation (no widgets) until it is told to
	 * open.
	 *
	 * @param parentShell
	 *            the parent shell, or <code>null</code> to create a top-level shell
	 * @param dialogTitle
	 *            the dialog title, or <code>null</code> if none
	 * @param initialValue
	 *            the initial input value, or <code>null</code> if none (equivalent to the empty string)
	 */
	public MemoDialog(Shell parentShell, String dialogTitle, String initialValue) {
		super(parentShell);
		this.title = dialogTitle;
		if (initialValue == null) {
			value = "";//$NON-NLS-1$
		} else {
			value = initialValue;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		if (title != null) {
			shell.setText(title);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		createButton(parent, IDialogConstants.OK_ID, "OK", true);
		if (editable) {
			createButton(parent, IDialogConstants.CANCEL_ID, "Cancel", false);
		}
		// do this here because setting the text will set enablement on the ok
		// button
		text.setFocus();
		if (value != null) {
			text.setText(value);
			// text.selectAll();
		}
	}

	/*
	 * (non-Javadoc) Method declared on Dialog.
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		// create composite
		Composite composite = (Composite) super.createDialogArea(parent);
		text = new Text(composite, getInputTextStyle());
		text.setText(value);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		Font font = new Font(text.getDisplay(), "Courier New", 13, SWT.NORMAL);
		text.setFont(font);

		applyDialogFont(composite);
		return composite;
	}

	/**
	 * Returns the style bits that should be used for the input text field. Defaults to a single line entry. Subclasses may override.
	 *
	 * @return the integer style bits that should be used when creating the input text
	 *
	 * @since 1.1
	 */
	protected int getInputTextStyle() {
		if (editable) {
			return SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL;
		}
		return SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL;
	}

	public static boolean openInformation(Shell parent, String title, String message) {
		MemoDialog dialog = new MemoDialog(parent, title, message);
		return dialog.open() == 0;
	}

	public void setEditable(boolean b) {
		editable = b;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			value = text.getText();
		} else {
			value = null;
		}
		super.buttonPressed(buttonId);
	}

	/**
	 * Returns the string typed into this input dialog.
	 *
	 * @return the input string
	 */
	public String getValue() {
		return value;
	}
}
