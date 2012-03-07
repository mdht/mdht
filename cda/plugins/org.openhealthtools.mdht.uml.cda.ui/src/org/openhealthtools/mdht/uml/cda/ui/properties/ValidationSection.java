/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
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

import java.util.StringTokenizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;

/**
 * The profile properties section for CDA Validation.
 */
public abstract class ValidationSection extends ResettableModelerPropertySection {

	protected Element modelElement;

	protected CCombo severityCombo;

	protected boolean severityModified = false;

	protected Text ruleIdText;

	protected boolean ruleIdModified = false;

	/**
	 * Duplicate copy of private field in superclass. I'd like to remove this,
	 * but can't find another way to refresh all page sections.
	 */
	protected TabbedPropertySheetPage myTabbedPropertySheetPage;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (ruleIdText == event.getSource()) {
				ruleIdModified = true;
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

	/**
	 * Stereotype must be subclass of Validation stereotype.
	 */
	protected abstract Stereotype getValidationStereotype();

	protected void modifyFields() {
		if (!(ruleIdModified || severityModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = getValidationStereotype();

					Enumeration severityKind = null;
					Profile cdaProfile = CDAProfileUtil.getCDAProfile(modelElement.eResource().getResourceSet());
					if (cdaProfile != null) {
						severityKind = (Enumeration) cdaProfile.getOwnedType(ICDAProfileConstants.SEVERITY_KIND);
					}

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					if (!modelElement.isStereotypeApplied(stereotype)) {
						modelElement.applyStereotype(stereotype);
					}

					if (severityModified) {
						severityModified = false;
						this.setLabel("Set Validation Severity");
						if (severityKind != null) {
							if (severityCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								modelElement.setValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY, null);
							} else {
								EnumerationLiteral literal = severityKind.getOwnedLiterals().get(
									severityCombo.getSelectionIndex() - 1);
								modelElement.setValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY, literal);
							}
						}
					} else if (ruleIdModified) {
						ruleIdModified = false;
						this.setLabel("Set Validation Rule ID");

						Validation validation = (Validation) modelElement.getStereotypeApplication(stereotype);
						validation.getRuleId().clear();

						String value = ruleIdText.getText().trim();
						StringTokenizer tokenizer = new StringTokenizer(value, ",; ");
						while (tokenizer.hasMoreTokens()) {
							validation.getRuleId().add(tokenizer.nextToken());
						}
					} else {
						return Status.CANCEL_STATUS;
					}

					updateViews();
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
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = getValidationStereotype();

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}

					if (modelElement.isStereotypeApplied(stereotype)) {
						modelElement.unapplyStereotype(stereotype);
					}

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

	protected void addValidationControls(final Composite composite, int numerator, int offset) {
		FormData data = null;

		/* ---- severity combo ---- */
		severityCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		severityCombo.setItems(new String[] { "", "SHALL", "SHOULD", "MAY" });
		severityCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				severityModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				severityModified = true;
				modifyFields();
			}
		});

		CLabel severityLabel = getWidgetFactory().createCLabel(composite, "Severity:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(severityCombo, 0, SWT.CENTER);
		severityLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(severityLabel, 0);
		data.top = new FormAttachment(numerator, offset, ITabbedPropertyConstants.VSPACE);
		severityCombo.setLayoutData(data);

		/* ---- Rule Id text ---- */
		ruleIdText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel ruleIdLabel = getWidgetFactory().createCLabel(composite, "Rule ID(s):"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(severityCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(severityCombo, 0, SWT.CENTER);
		ruleIdLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(ruleIdLabel, 0);
		data.width = 300;
		data.top = new FormAttachment(severityCombo, 0, SWT.CENTER);
		ruleIdText.setLayoutData(data);

	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		myTabbedPropertySheetPage = aTabbedPropertySheetPage;

		// Composite composite = getWidgetFactory().createGroup(parent, "Validation");
		// FormLayout layout = new FormLayout();
		// layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		// layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		// layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		// composite.setLayout(layout);
		//
		// addValidationControls(composite, 0, 1);
	}

	@Override
	public void refresh() {
		Stereotype stereotype = getValidationStereotype();

		Enumeration severityKind = null;
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(modelElement.eResource().getResourceSet());
		if (cdaProfile != null) {
			severityKind = (Enumeration) cdaProfile.getOwnedType(ICDAProfileConstants.SEVERITY_KIND);
		}

		ruleIdText.removeModifyListener(modifyListener);
		ruleIdText.removeKeyListener(keyListener);
		ruleIdText.removeFocusListener(focusListener);
		Object ruleIds = null;
		if (stereotype != null && modelElement.isStereotypeApplied(stereotype)) {
			ruleIds = modelElement.getValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID);
		}
		if (ruleIds != null) {
			StringBuffer ruleIdDisplay = new StringBuffer();
			Validation validation = (Validation) modelElement.getStereotypeApplication(stereotype);
			for (String ruleId : validation.getRuleId()) {
				if (ruleIdDisplay.length() > 0) {
					ruleIdDisplay.append(", ");
				}
				ruleIdDisplay.append(ruleId);
			}
			ruleIdText.setText(ruleIdDisplay.toString());
		} else {
			ruleIdText.setText("");
		}
		ruleIdText.addModifyListener(modifyListener);
		ruleIdText.addKeyListener(keyListener);
		ruleIdText.addFocusListener(focusListener);

		severityCombo.select(0);
		if (stereotype != null && modelElement.isStereotypeApplied(stereotype)) {
			Object value = modelElement.getValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY);
			String severity = null;
			if (value instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				severity = ((Enumerator) value).getName();
			}

			if (severityKind != null && severity != null) {
				EnumerationLiteral literal = severityKind.getOwnedLiteral(severity);
				if (literal != null) {
					int index = severityKind.getOwnedLiterals().indexOf(literal);
					severityCombo.select(index + 1);
				}
			}
		}

		if (isReadOnly()) {
			severityCombo.setEnabled(false);
			ruleIdText.setEnabled(false);
		} else {
			severityCombo.setEnabled(true);
			ruleIdText.setEnabled(true);
		}

	}

	@Override
	protected boolean isReadOnly() {
		if (modelElement != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);
			if (editingDomain != null && editingDomain.isReadOnly(modelElement.eResource())) {
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
		Assert.isTrue(element instanceof Element);
		this.modelElement = (Element) element;
	}

	@Override
	public void dispose() {
		super.dispose();

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
					if (!isDisposed() && modelElement.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

	protected void updateViews() {
		// fire notification for any stereotype umlEnumeration changes to update views
		// this is a bogus notification of change to modelElement comments, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, modelElement.getOwnedComments()) {
			@Override
			public Object getNotifier() {
				return modelElement;
			}

			@Override
			public int getFeatureID(java.lang.Class<?> expectedClass) {
				return UMLPackage.ELEMENT__OWNED_COMMENT;
			}
		};
		modelElement.eNotify(notification);
	}
}
