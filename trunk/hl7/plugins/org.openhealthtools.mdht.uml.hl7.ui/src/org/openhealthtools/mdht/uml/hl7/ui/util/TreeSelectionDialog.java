/*******************************************************************************
 * Copyright (c) 2000, 2008, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 * 	   Sebastian Davids <sdavids@gmx.de> - Fix for bug 90273 - [Dialogs] 
 * 			ListSelectionDialog dialog alignment
 * 		Sean Muir (JKM Software) Extend to use tree versus list
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.ui.util;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.internal.IWorkbenchHelpContextIds;
import org.eclipse.ui.internal.WorkbenchMessages;

/**
 * A standard dialog which solicits a list of selections from the user. This
 * class is configured with an arbitrary data model represented by content and
 * label provider objects. The <code>getResult</code> method returns the
 * selected elements.
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * <p>
 * Example:
 * 
 * <pre>
 * ListSelectionDialog dlg = new ListSelectionDialog(
 * 	getShell(), input, new BaseWorkbenchContentProvider(), new WorkbenchLabelProvider(),
 * 	&quot;Select the resources to save:&quot;);
 * dlg.setInitialSelections(dirtyEditors);
 * dlg.setTitle(&quot;Save Resources&quot;);
 * dlg.open();
 * </pre>
 * 
 * </p>
 * 
 * @noextend This class is not intended to be subclassed by clients.
 * 
 *           This seems like a natural extension to the selectiondialog but
 *           could not find so copy and paste reuse. SWM This class should be
 *           replaced if a tree selection dialog exists
 * 
 *           Added SuppressWarnings("Restrictions") for the IWorkbenchMessages
 *           and IWorkbenchHelpContextIds
 * 
 */
@SuppressWarnings("restriction")
public class TreeSelectionDialog extends SelectionDialog {
	// the root element to populate the viewer with
	private Object inputElement;

	// providers for populating this dialog
	private ILabelProvider labelProvider;

	private IStructuredContentProvider contentProvider;

	TreeViewer treeViewer;

	// sizing constants
	private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;

	private final static int SIZING_SELECTION_WIDGET_WIDTH = 300;

	static String SELECT_ALL_TITLE = WorkbenchMessages.SelectionDialog_selectLabel;

	static String DESELECT_ALL_TITLE = WorkbenchMessages.SelectionDialog_deselectLabel;

	// Return Tree Path for selection - currently hard coded to true
	boolean returnPath = true;

	/**
	 * Creates a list selection dialog.
	 * 
	 * @param parentShell
	 *            the parent shell
	 * @param input
	 *            the root element to populate this dialog with
	 * @param contentProvider
	 *            the content provider for navigating the model
	 * @param labelProvider
	 *            the label provider for displaying model elements
	 * @param message
	 *            the message to be displayed at the top of this dialog, or <code>null</code> to display a default message
	 */
	public TreeSelectionDialog(Shell parentShell, Object input, IStructuredContentProvider contentProvider,
			ILabelProvider labelProvider, String message) {
		super(parentShell);
		setTitle(WorkbenchMessages.ListSelection_title);
		inputElement = input;
		this.contentProvider = contentProvider;
		this.labelProvider = labelProvider;
		if (message != null) {
			setMessage(message);
		} else {
			setMessage(WorkbenchMessages.ListSelection_message);
		}
	}

	/**
	 * Add the selection and deselection buttons to the dialog.
	 * 
	 * @param composite
	 *            org.eclipse.swt.widgets.Composite
	 */
	private void addSelectionButtons(Composite composite) {
		// Composite buttonComposite = new Composite(composite, SWT.NONE);
		// GridLayout layout = new GridLayout();
		//
		// layout.numColumns = 0;
		// layout.marginWidth = 0;
		// layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		// buttonComposite.setLayout(layout);
		// buttonComposite.setLayoutData(new GridData(SWT.END, SWT.TOP, true, false));
		//
		// Button selectButton = createButton(buttonComposite, IDialogConstants.SELECT_ALL_ID, SELECT_ALL_TITLE, false);
		//
		// SelectionListener listener = new SelectionAdapter() {
		// public void widgetSelected(SelectionEvent e) {
		// // listViewer.setAllChecked(true);
		// }
		// };
		// selectButton.addSelectionListener(listener);
		//
		// Button deselectButton = createButton(buttonComposite, IDialogConstants.DESELECT_ALL_ID, DESELECT_ALL_TITLE, false);
		//
		// listener = new SelectionAdapter() {
		// public void widgetSelected(SelectionEvent e) {
		// // listViewer.setAllChecked(false);
		// }
		// };
		// deselectButton.addSelectionListener(listener);
	}

	Object[] selectionPath = null;

	/**
	 * Visually checks the previously-specified elements in this dialog's list
	 * viewer.
	 */
	@Override
	public void setInitialSelections(Object[] selectionPath) {

		this.selectionPath = selectionPath;

	}

	HelpListener helpListener;

	public void setHelpListener(HelpListener helpListener) {
		this.helpListener = helpListener;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets
	 * .Shell)
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(shell, IWorkbenchHelpContextIds.LIST_SELECTION_DIALOG);
	}

	/*
	 * (non-Javadoc) Method declared on Dialog.
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		// page group
		Composite composite = (Composite) super.createDialogArea(parent);

		initializeDialogUnits(composite);

		createMessageArea(composite);

		treeViewer = new TreeViewer(composite); // .newCheckList(composite, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_BOTH);
		data.heightHint = SIZING_SELECTION_WIDGET_HEIGHT;
		data.widthHint = SIZING_SELECTION_WIDGET_WIDTH;

		treeViewer.getTree().setLayoutData(data);

		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setContentProvider(contentProvider);

		addSelectionButtons(composite);

		initializeViewer();

		Dialog.applyDialogFont(composite);

		return composite;
	}

	/**
	 * Returns the viewer used to show the list.
	 * 
	 * @return the viewer, or <code>null</code> if not yet created
	 */
	public TreeViewer getViewer() {
		return treeViewer;
	}

	/**
	 * Initializes this dialog's viewer after it has been laid out.
	 */
	private void initializeViewer() {
		treeViewer.setInput(inputElement);

		if (selectionPath != null) {
			treeViewer.setSelection(new TreeSelection(new TreePath(selectionPath)));
		}

		if (helpListener != null) {
			treeViewer.addHelpListener(helpListener);
		}
		// treeViewer.setSelection(new StructuredSelection(inputElement),true);

	}

	/**
	 * The <code>ListSelectionDialog</code> implementation of this <code>Dialog</code> method builds a list of the selected elements for
	 * later retrieval by the client and closes this dialog. TODO Implement
	 * okPressed when we know how and when we will use the dialog SWM
	 */
	@Override
	protected void okPressed() {

		ITreeSelection selection = (ITreeSelection) treeViewer.getSelection();

		if (!selection.isEmpty()) {
			if (returnPath) {
				ArrayList<Object> list = new ArrayList<Object>();
				TreePath treePath = selection.getPaths()[0];

				while (treePath.getLastSegment() != null) {
					list.add(treePath.getLastSegment());

					treePath = treePath.getParentPath();

				}

				setResult(list);
			}
		}

		super.okPressed();
	}
}
