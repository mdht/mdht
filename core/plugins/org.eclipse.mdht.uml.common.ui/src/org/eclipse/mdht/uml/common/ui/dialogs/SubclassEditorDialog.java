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
package org.eclipse.mdht.uml.common.ui.dialogs;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.mdht.uml.common.ui.internal.Activator;
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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * A class to select elements out of a tree structure.
 *
 */
public class SubclassEditorDialog extends SelectionStatusDialog {

	private Label messageLabel;

	private CheckboxTreeViewer fViewer;

	private SubclassEditorViewLabelProvider fLabelProvider;

	private SubclassEditorViewContentProvider fContentProvider;

	private ISelectionStatusValidator fValidator = null;

	private ViewerComparator fComparator;

	private IStatus fCurrStatus = new Status(IStatus.OK, PlatformUI.PLUGIN_ID, 0, "", null); //$NON-NLS-1$

	private List fFilters;

	private Class subclass;

	private boolean fIsEmpty;

	private int fWidth = 60;

	private int fHeight = 18;

	private boolean fContainerMode;

	private boolean fModifyMode = false;

	private Object[] fExpandedElements;

	private final static String ICONS_PATH = "/icons/full";

	private class SelectBaseTypeAction extends Action {

		public SelectBaseTypeAction() {
			super("Select Type...", IAction.AS_PUSH_BUTTON);
			setToolTipText("Select base type");

			URL enableURL = Activator.getDefault().getBundle().getEntry(ICONS_PATH + "/elcl16/Class.gif");
			ImageDescriptor enableImage = ImageDescriptor.createFromURL(enableURL);
			setHoverImageDescriptor(enableImage);
			setImageDescriptor(enableImage);

		}

		@Override
		public void run() {
			if (subclass instanceof Class) {
				Class baseClass = (Class) DialogLaunchUtil.chooseElement(
					new java.lang.Class[] { Class.class }, ((EObject) subclass).eResource().getResourceSet(),
					getShell());

				if (baseClass != null) {
					// create new generalization
					subclass.getGenerals().clear();
					subclass.createGeneralization(baseClass);

					// update attribute list
					fViewer.refresh();

					// update UI to set viewer base type
					updateMessage();

				}
			}
		}
	}

	private class OverrideFlatTreeAction extends Action {

		private boolean fToggle;

		public OverrideFlatTreeAction() {
			setToolTipText("Show superclass hierarchy");
			URL disableURL = Activator.getDefault().getBundle().getEntry(ICONS_PATH + "/dlcl16/impl_co.gif");
			ImageDescriptor disableImage = ImageDescriptor.createFromURL(disableURL);
			setDisabledImageDescriptor(disableImage);

			URL enableURL = Activator.getDefault().getBundle().getEntry(ICONS_PATH + "/elcl16/impl_co.gif");
			ImageDescriptor enableImage = ImageDescriptor.createFromURL(enableURL);
			setHoverImageDescriptor(enableImage);
			setImageDescriptor(enableImage);

			fToggle = getSubclassEditorContentProvider().isShowTypes();
			setChecked(fToggle);
		}

		private SubclassEditorViewContentProvider getSubclassEditorContentProvider() {
			return fContentProvider;
		}

		@Override
		public void run() {
			fToggle = !fToggle;
			setChecked(fToggle);
			getSubclassEditorContentProvider().setShowTypes(fToggle);
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
	public SubclassEditorDialog(Shell parent, SubclassEditorViewLabelProvider labelProvider,
			SubclassEditorViewContentProvider contentProvider, Class input) {
		super(parent);
		fLabelProvider = labelProvider;
		fContentProvider = contentProvider;
		setResult(new ArrayList(0));
		setStatusLineAboveButtons(true);
		fContainerMode = true;
		fExpandedElements = null;
		int shellStyle = getShellStyle();
		setShellStyle(shellStyle | SWT.MAX | SWT.RESIZE);
		setTitle("Subclass Editor");
		setMessage(null);
		setContainerMode(true);
		setSize(60, 18);
		setInput(input);
	}

	/**
	 * If set, the checked /gray state of containers (inner nodes) is derived from the checked state
	 * of its leaf nodes.
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
	 * Sets the comparator used by the tree viewer.
	 *
	 * @param comparator
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
	 * Sets an optional validator to check if the selection is valid. The validator is invoked
	 * whenever the selection changes.
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
	public void setInput(Class input) {
		subclass = input;

		List<Property> structuralProperties = new ArrayList<Property>();
		// if (subclass instanceof Class) {
		// for (Property property : ((Class)subclass).getOwnedAttributes()) {
		// if (RIMUtil.isStructuralAttribute(property.getName()))
		// structuralProperties.add(property);
		// }
		// }
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

	@Override
	public int open() {
		fIsEmpty = evaluateIfTreeEmpty(subclass);
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

	@Override
	protected void computeResult() {
		setResult(Arrays.asList(fViewer.getCheckedElements()));
	}

	@Override
	public void create() {
		BusyIndicator.showWhile(null, new Runnable() {
			public void run() {
				access$superCreate();
				fViewer.setCheckedElements(getInitialElementSelections().toArray());
				if (fViewer instanceof SubclassEditorTreeViewer) {
					((SubclassEditorTreeViewer) fViewer).setDoneInitialSelections(true);
				}
				if (fExpandedElements != null) {
					fViewer.setExpandedElements(fExpandedElements);
				}
				updateOKStatus();
			}
		});
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		messageLabel = createMessageArea(composite);
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

	@Override
	public void setMessage(String text) {
		super.setMessage(text);
		if (messageLabel != null) {
			messageLabel.setText(text);
			messageLabel.pack(true);
		}
	}

	protected void updateMessage() {
		StringBuffer message = new StringBuffer();
		message.append(subclass.getQualifiedName());
		boolean first = true;
		if (!subclass.getGenerals().isEmpty()) {
			message.append("\n   extends ");
			for (Classifier general : subclass.getGenerals()) {
				if (!first) {
					message.append(", ");
					first = false;
				}
				message.append(general.getQualifiedName());
			}
		}

		setMessage(message.toString());
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

		// String subclassName = (subclass instanceof Class) ? ((Class) subclass).getQualifiedName() : "";
		// pane.setText(subclassName);
		updateMessage();

		// //////////////////////////////////
		if (fContainerMode) {
			fViewer = new SubclassEditorTreeViewer(pane, SWT.BORDER);
			if (isModifyMode()) {
				((SubclassEditorTreeViewer) fViewer).setModifyMode(true);
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
		fViewer.setInput(subclass);
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

		// TODO radio buttons: Inherit, Clone

		manager.add(new SelectBaseTypeAction()); // create after tree is created
		// manager.add(new OverrideFlatTreeAction()); // create after tree is created

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

	public Class getSelectedClass() {
		return (fContentProvider.getViewer()).getSelectedClass();
	}

}
