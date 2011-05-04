/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for restoring defaults
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.properties;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;

/**
 * The profile properties section for CDA TextValue.
 */
public class TextValueSection extends ResettableModelerPropertySection {

	private NamedElement namedElement;

	private Text valueText;

	private boolean valueModified = false;

	/**
	 * Duplicate copy of private field in superclass. I'd like to remove this,
	 * but can't find another way to refresh all page sections.
	 */
	private TabbedPropertySheetPage myTabbedPropertySheetPage;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (valueText == event.getSource()) {
				valueModified = true;
			}
		}
	};

	private KeyListener keyListener = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			// do nothing
		}

		public void keyReleased(KeyEvent e) {
			if (SWT.CR == e.character || SWT.KEYPAD_CR == e.character) {
				modifyFields();
			}
		}
	};

	private FocusListener focusListener = new FocusListener() {
		public void focusGained(FocusEvent e) {
			// do nothing
		}

		public void focusLost(FocusEvent event) {
			modifyFields();
		}
	};

	private void modifyFields() {
		if (!(valueModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
						namedElement, ICDAProfileConstants.TEXT_VALUE);

					if (stereotype == null) {
						stereotype = CDAProfileUtil.applyCDAStereotype(namedElement, ICDAProfileConstants.TEXT_VALUE);
					}
					if (valueModified) {
						valueModified = false;
						this.setLabel("Set Text Value");

						if (stereotype != null) {
							String value = valueText.getText().trim();
							namedElement.setValue(stereotype, ICDAProfileConstants.TEXT_VALUE_VALUE, value.length() > 0
									? value
									: null);

						}
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), getPart());

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	protected void resetFields() {

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype textValueStereotype = CDAProfileUtil.getAppliedCDAStereotype(
						namedElement, ICDAProfileConstants.TEXT_VALUE);

					if (textValueStereotype == null) {
						return Status.CANCEL_STATUS;
					}

					namedElement.unapplyStereotype(textValueStereotype);

					/*
					 * Refresh all sections on this tabbed page, especially the filtered stereotype specific sections.
					 * To force this, I had to change the selection to empty, then back to current object.
					 */
					ISelection currentSelection = getSelection();
					myTabbedPropertySheetPage.selectionChanged(getPart(), new StructuredSelection());
					myTabbedPropertySheetPage.selectionChanged(getPart(), currentSelection);

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), getPart());

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		myTabbedPropertySheetPage = aTabbedPropertySheetPage;

		Composite composite = getWidgetFactory().createGroup(parent, "Text Value");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		valueText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel valueLabel = getWidgetFactory().createCLabel(composite, "Constraint:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(valueText, 0, SWT.CENTER);
		valueLabel.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(valueText, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(valueLabel, 0);
		data.right = new FormAttachment(restoreDefaultsButton, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 1, ITabbedPropertyConstants.VSPACE);
		valueText.setLayoutData(data);
	}

	@Override
	protected boolean isReadOnly() {
		if (namedElement != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			if (editingDomain != null && editingDomain.isReadOnly(namedElement.eResource())) {
				return true;
			}
		}

		return super.isReadOnly();
	}

	/*
	 * Override super implementation to allow for objects that are not IAdaptable.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@Override
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof NamedElement);
		this.namedElement = (NamedElement) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(namedElement, ICDAProfileConstants.TEXT_VALUE);

		valueText.removeModifyListener(modifyListener);
		valueText.removeKeyListener(keyListener);
		valueText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String value = (String) namedElement.getValue(stereotype, ICDAProfileConstants.TEXT_VALUE_VALUE);
			valueText.setText(value != null
					? value
					: "");
		} else {
			valueText.setText("");
		}
		valueText.addModifyListener(modifyListener);
		valueText.addKeyListener(keyListener);
		valueText.addFocusListener(focusListener);

		if (isReadOnly()) {
			valueText.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			valueText.setEnabled(true);
			restoreDefaultsButton.setEnabled(stereotype != null);
		}

	}

	/**
	 * Update if necessary, upon receiving the model event.
	 * 
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            -
	 *            even notification
	 * @param element
	 *            -
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && namedElement.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

}
