/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.ui.clone;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.dialogs.SelectionStatusDialog;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Activator;
import org.openhealthtools.mdht.uml.hl7.core.util.RIMUtil;

/**
 * A class to select elements out of a tree structure.
 * 
 * @since 2.0
 */
public class CloneEditorDialog extends SelectionStatusDialog {
	private CheckboxTreeViewer fViewer;

	private CloneEditorViewLabelProvider fLabelProvider;

	private CloneEditorViewContentProvider fContentProvider;

	private ISelectionStatusValidator fValidator = null;

	private ViewerComparator fComparator;

	private IStatus fCurrStatus = new Status(IStatus.OK, PlatformUI.PLUGIN_ID, 0, "", null); //$NON-NLS-1$

	private List fFilters;

	private Object fInput;

	private boolean fIsEmpty;

	private int fWidth = 60;

	private int fHeight = 18;

	private boolean fContainerMode;

	private boolean fModifyMode = false;

	private Object[] fExpandedElements;

	private final static String ICONS_PATH = "/icons//full";

	private class OverrideFlatTreeAction extends Action {

		private boolean fToggle;

		public OverrideFlatTreeAction() {
			setToolTipText("Group attributes by Classes");
			URL disableURL = Activator.getDefault().getBundle().getEntry(ICONS_PATH + "//dlcl16//impl_co.gif");
			ImageDescriptor disableImage = ImageDescriptor.createFromURL(disableURL);
			setDisabledImageDescriptor(disableImage);

			URL enableURL = Activator.getDefault().getBundle().getEntry(ICONS_PATH + "//elcl16//impl_co.gif");
			ImageDescriptor enableImage = ImageDescriptor.createFromURL(enableURL);
			setHoverImageDescriptor(enableImage);
			setImageDescriptor(enableImage);

			fToggle = getCloneEditorContentProvider().isShowTypes();
			setChecked(fToggle);
		}

		private CloneEditorViewContentProvider getCloneEditorContentProvider() {
			return fContentProvider;
		}

		@Override
		public void run() {
			fToggle = !fToggle;
			setChecked(fToggle);
			getCloneEditorContentProvider().setShowTypes(fToggle);
		}

	}

	/**
	 * Constructs an instance of <code>ElementTreeSelectionDialog</code>.
	 * 
	 * @param parent
	 *            The shell to parent from.
	 * @param labelProvider
	 *            the label provider to render the entries
	 * @param contentProvider
	 *            the content provider to evaluate the tree structure
	 */
	public CloneEditorDialog(Shell parent, CloneEditorViewLabelProvider labelProvider,
			CloneEditorViewContentProvider contentProvider, EObject input) {
		super(parent);
		fLabelProvider = labelProvider;
		fContentProvider = contentProvider;
		setResult(new ArrayList(0));
		setStatusLineAboveButtons(true);
		fContainerMode = true;
		fExpandedElements = null;
		int shellStyle = getShellStyle();
		setShellStyle(shellStyle | SWT.MAX | SWT.RESIZE);
		setTitle("Clone Editor");
		setMessage(null);
		setContainerMode(true);
		setSize(60, 18);
		setInput(input);
	}

	/**
	 * If set, the checked /gray state of containers (inner nodes) is derived
	 * from the checked state of its leaf nodes.
	 * 
	 * @param containerMode
	 *            The containerMode to set
	 */
	public void setContainerMode(boolean containerMode) {
		fContainerMode = containerMode;
	}

	public boolean isModifyMode() {
		return fModifyMode;
	}

	public void setModifyMode(boolean modifyMode) {
		fModifyMode = modifyMode;
	}

	/**
	 * Sets the initial selection. Convenience method.
	 * 
	 * @param selection
	 *            the initial selection.
	 */
	public void setInitialSelection(Object selection) {
		setInitialSelections(new Object[] { selection });
	}

	/**
	 * Sets the message to be displayed if the list is empty.
	 * 
	 * @param message
	 *            the message to be displayed.
	 */
	// public void setEmptyListMessage(String message) {
	// fEmptyListMessage = message;
	// }

	/**
	 * Sets the sorter used by the tree viewer.
	 * 
	 * @param sorter
	 * @deprecated since 3.3, use {@link CloneEditorDialog#setComparator(ViewerComparator)} instead
	 */
	@Deprecated
	public void setSorter(ViewerSorter sorter) {
		fComparator = sorter;
	}

	/**
	 * Sets the comparator used by the tree viewer.
	 * 
	 * @param comparator
	 * @since 3.3
	 */
	public void setComparator(ViewerComparator comparator) {
		fComparator = comparator;
	}

	/**
	 * Adds a filter to the tree viewer.
	 * 
	 * @param filter
	 *            a filter.
	 */
	public void addFilter(ViewerFilter filter) {
		if (fFilters == null) {
			fFilters = new ArrayList(4);
		}
		fFilters.add(filter);
	}

	/**
	 * Sets an optional validator to check if the selection is valid. The
	 * validator is invoked whenever the selection changes.
	 * 
	 * @param validator
	 *            the validator to validate the selection.
	 */
	public void setValidator(ISelectionStatusValidator validator) {
		fValidator = validator;
	}

	/**
	 * Sets the tree input.
	 * 
	 * @param input
	 *            the tree input.
	 */
	public void setInput(Object input) {
		fInput = input;

		List<Property> structuralProperties = new ArrayList<Property>();
		if (fInput instanceof Class) {
			for (Property property : ((Class) fInput).getOwnedAttributes()) {
				if (RIMUtil.isStructuralAttribute(property.getName())) {
					structuralProperties.add(property);
				}
			}
		}
		setInitialElementSelections(structuralProperties);
	}

	/**
	 * Expands elements in the tree.
	 * 
	 * @param elements
	 *            The elements that will be expanded.
	 */
	public void setExpandedElements(Object[] elements) {
		fExpandedElements = elements;
	}

	/**
	 * Sets the size of the tree in unit of characters.
	 * 
	 * @param width
	 *            the width of the tree.
	 * @param height
	 *            the height of the tree.
	 */
	public void setSize(int width, int height) {
		fWidth = width;
		fHeight = height;
	}

	/**
	 * Validate the receiver and update the status with the result.
	 * 
	 */
	protected void updateOKStatus() {
		if (!fIsEmpty) {
			if (fValidator != null) {
				fCurrStatus = fValidator.validate(fViewer.getCheckedElements());
				updateStatus(fCurrStatus);
			} else if (!fCurrStatus.isOK()) {
				fCurrStatus = new Status(IStatus.OK, PlatformUI.PLUGIN_ID, IStatus.OK, "", //$NON-NLS-1$
				null);
			}
		} else {
			// fCurrStatus = new Status(IStatus.ERROR, PlatformUI.PLUGIN_ID,
			// IStatus.OK, fEmptyListMessage, null);
		}
		updateStatus(fCurrStatus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.window.Window#open()
	 */
	@Override
	public int open() {
		fIsEmpty = evaluateIfTreeEmpty(fInput);
		super.open();
		return getReturnCode();
	}

	private void access$superCreate() {
		super.create();
	}

	/**
	 * Handles cancel button pressed event.
	 */
	@Override
	protected void cancelPressed() {
		setResult(null);
		super.cancelPressed();
	}

	/*
	 * @see SelectionStatusDialog#computeResult()
	 */
	@Override
	protected void computeResult() {
		setResult(Arrays.asList(fViewer.getCheckedElements()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.window.Window#create()
	 */
	@Override
	public void create() {
		BusyIndicator.showWhile(null, new Runnable() {
			public void run() {
				access$superCreate();
				fViewer.setCheckedElements(getInitialElementSelections().toArray());
				if (fViewer instanceof CloneEditorTreeViewer) {
					((CloneEditorTreeViewer) fViewer).setDoneInitialSelections(true);
				}
				if (fExpandedElements != null) {
					fViewer.setExpandedElements(fExpandedElements);
				}
				updateOKStatus();
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Label messageLabel = createMessageArea(composite);
		CheckboxTreeViewer treeViewer = createTreeViewer(composite);
		Control buttonComposite = createSelectionButtons(composite);
		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = convertWidthInCharsToPixels(fWidth);
		data.heightHint = convertHeightInCharsToPixels(fHeight);
		Tree treeWidget = treeViewer.getTree();
		treeWidget.setLayoutData(data);
		treeWidget.setFont(parent.getFont());
		if (fIsEmpty) {
			messageLabel.setEnabled(false);
			treeWidget.setEnabled(false);
			buttonComposite.setEnabled(false);
		}
		return composite;
	}

	/**
	 * Creates the tree viewer.
	 * 
	 * @param parent
	 *            the parent composite
	 * @return the tree viewer
	 */
	protected CheckboxTreeViewer createTreeViewer(Composite parent) {
		initializeDialogUnits(parent);
		ViewerPane pane = new ViewerPane(parent, SWT.BORDER | SWT.FLAT);
		pane.setText("Select the attributes for your clone class:");
		// //////////////////////////////////
		if (fContainerMode) {
			fViewer = new CloneEditorTreeViewer(pane, SWT.BORDER);
			if (isModifyMode()) {
				((CloneEditorTreeViewer) fViewer).setModifyMode(true);
			}
		} else {
			fViewer = new CheckboxTreeViewer(parent, SWT.BORDER);
		}
		fViewer.setContentProvider(fContentProvider);
		fViewer.setLabelProvider(fLabelProvider);
		fViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				updateOKStatus();
			}
		});
		fViewer.setComparator(fComparator);
		if (fFilters != null) {
			for (int i = 0; i != fFilters.size(); i++) {
				fViewer.addFilter((ViewerFilter) fFilters.get(i));
			}
		}
		fViewer.setInput(fInput);
		// /////////////////////////////////////
		pane.setContent(fViewer.getControl());
		GridLayout paneLayout = new GridLayout();
		paneLayout.marginHeight = 0;
		paneLayout.marginWidth = 0;
		paneLayout.numColumns = 1;
		pane.setLayout(paneLayout);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = convertWidthInCharsToPixels(55);
		gd.heightHint = convertHeightInCharsToPixels(15);
		pane.setLayoutData(gd);
		ToolBarManager manager = pane.getToolBarManager();
		manager.add(new OverrideFlatTreeAction()); // create after tree is created
		manager.update(true);

		// //////////////////////////////////////
		fViewer.getTree().setFocus();

		return fViewer;
	}

	/**
	 * Returns the tree viewer.
	 * 
	 * @return the tree viewer
	 */
	protected CheckboxTreeViewer getTreeViewer() {
		return fViewer;
	}

	/**
	 * Adds the selection and deselection buttons to the dialog.
	 * 
	 * @param composite
	 *            the parent composite
	 * @return Composite the composite the buttons were created in.
	 */
	protected Composite createSelectionButtons(Composite composite) {
		Composite buttonComposite = new Composite(composite, SWT.RIGHT);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		buttonComposite.setLayout(layout);
		buttonComposite.setFont(composite.getFont());
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.GRAB_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		composite.setData(data);

		return buttonComposite;
	}

	private boolean evaluateIfTreeEmpty(Object input) {
		Object[] elements = fContentProvider.getElements(input);
		if (elements.length > 0) {
			if (fFilters != null) {
				for (int i = 0; i < fFilters.size(); i++) {
					ViewerFilter curr = (ViewerFilter) fFilters.get(i);
					elements = curr.filter(fViewer, input, elements);
				}
			}
		}
		return elements.length == 0;
	}

	/*
	 * @see org.eclipse.jdt.internal.ui.dialogs.SourceActionDialog#createLinkControl(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createLinkControl(Composite composite) {
		Link link = new Link(composite, SWT.WRAP);
		link.setText("Link control message");
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// openCodeTemplatePage(CodeTemplateContextType.OVERRIDECOMMENT_ID);
			}
		});
		link.setToolTipText("Tool tip");

		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.widthHint = convertWidthInCharsToPixels(40);
		link.setLayoutData(gridData);
		return link;
	}

	protected void openCodeTemplatePage(String id) {
		// HashMap arg= new HashMap();
		// arg.put(CodeTemplatePreferencePage.DATA_SELECT_TEMPLATE, id);
	}

	/*
	 * @see org.eclipse.jface.window.Window#configureShell(Shell)
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(newShell, IJavaHelpContextIds.OVERRIDE_TREE_SELECTION_DIALOG);
	}

	public Class getSelectedClass() {
		return (fContentProvider.getViewer()).getSelectedClass();
	}

}
