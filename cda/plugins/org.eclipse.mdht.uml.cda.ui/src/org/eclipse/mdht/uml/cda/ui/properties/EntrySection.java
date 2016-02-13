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
 *     Christian W. Damus - implement handling of live validation roll-back (artf3318)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The profile properties section for CDA Entry.
 */
public class EntrySection extends ResettableModelerPropertySection {

	private NamedElement namedElement;

	private CCombo typeCodeCombo;

	private boolean typeCodeModified = false;

	/**
	 * Duplicate copy of private field in superclass. I'd like to remove this,
	 * but can't find another way to refresh all page sections.
	 */
	private TabbedPropertySheetPage myTabbedPropertySheetPage;

	private void modifyFields() {
		if (!(typeCodeModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype associationSterotype = CDAProfileUtil.getAppliedCDAStereotype(
						namedElement, ICDAProfileConstants.ASSOCIATION_VALIDATION);
					Stereotype entryStereotype = CDAProfileUtil.getAppliedCDAStereotype(
						namedElement, ICDAProfileConstants.ENTRY);

					if (entryStereotype == null) {
						entryStereotype = CDAProfileUtil.applyCDAStereotype(namedElement, ICDAProfileConstants.ENTRY);

						if (associationSterotype != null) {
							// copy values and remove
							namedElement.setValue(
								entryStereotype, ICDAProfileConstants.VALIDATION_SEVERITY,
								namedElement.getValue(associationSterotype, ICDAProfileConstants.VALIDATION_SEVERITY));
							namedElement.setValue(
								entryStereotype, ICDAProfileConstants.VALIDATION_MESSAGE,
								namedElement.getValue(associationSterotype, ICDAProfileConstants.VALIDATION_MESSAGE));
							namedElement.unapplyStereotype(associationSterotype);
						}
					}
					Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
					Enumeration entryKind = (Enumeration) cdaProfile.getOwnedType(ICDAProfileConstants.ENTRY_KIND);

					if (typeCodeModified) {
						typeCodeModified = false;
						this.setLabel("Set Entry Type Code");
						if (entryStereotype != null && entryKind != null) {
							if (typeCodeCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								namedElement.setValue(entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE, null);
							} else {
								EnumerationLiteral literal = entryKind.getOwnedLiterals().get(
									typeCodeCombo.getSelectionIndex() - 1);
								namedElement.setValue(entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE, literal);
							}
						}
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			execute(operation);

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
					Stereotype entryStereotype = CDAProfileUtil.getAppliedCDAStereotype(
						namedElement, ICDAProfileConstants.ENTRY);

					if (entryStereotype == null) {
						return Status.CANCEL_STATUS;
					}

					namedElement.unapplyStereotype(entryStereotype);

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

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void fillTypeCodeCombo() {
		Enumeration entryKind = null;
		if (namedElement != null) {
			Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
			entryKind = (Enumeration) cdaProfile.getOwnedType(ICDAProfileConstants.ENTRY_KIND);
		}

		if (entryKind == null) {
			typeCodeCombo.setItems(new String[] {});
		} else {
			List<String> items = new ArrayList<String>();
			items.add("");
			for (EnumerationLiteral literal : entryKind.getOwnedLiterals()) {
				items.add(literal.getLabel(true));
			}
			typeCodeCombo.setItems(items.toArray(new String[items.size()]));
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		myTabbedPropertySheetPage = aTabbedPropertySheetPage;

		Composite composite = getWidgetFactory().createGroup(parent, "Entry");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		/* ---- literals combo ---- */
		typeCodeCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		fillTypeCodeCombo();
		typeCodeCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				typeCodeModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				typeCodeModified = true;
				modifyFields();
			}
		});

		CLabel typeCodeLabel = getWidgetFactory().createCLabel(composite, "Type Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0, 1);
		typeCodeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(typeCodeLabel, 0);
		data.top = new FormAttachment(typeCodeLabel, 0, SWT.CENTER);
		typeCodeCombo.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(typeCodeLabel, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

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
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(namedElement, ICDAProfileConstants.ENTRY);

		Enumeration entryKind = null;
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
		if (cdaProfile != null) {
			entryKind = (Enumeration) cdaProfile.getOwnedType(ICDAProfileConstants.ENTRY_KIND);
		}

		fillTypeCodeCombo();
		typeCodeCombo.select(0);
		if (stereotype != null) {
			Object value = namedElement.getValue(stereotype, ICDAProfileConstants.ENTRY_TYPE_CODE);
			String typeCode = null;
			if (value instanceof EnumerationLiteral) {
				typeCode = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				typeCode = ((Enumerator) value).getName();
			}

			if (typeCode != null) {
				EnumerationLiteral literal = entryKind.getOwnedLiteral(typeCode);
				if (literal != null) {
					int index = entryKind.getOwnedLiterals().indexOf(literal);
					typeCodeCombo.select(index + 1);
				}
			}
		}

		if (isReadOnly()) {
			typeCodeCombo.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			typeCodeCombo.setEnabled(true);
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
