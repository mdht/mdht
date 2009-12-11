/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ui.properties;


import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;

/**
 * The profile properties section for CDA EntryRelationship.
 */
public class EntryRelationshipSection extends AbstractModelerPropertySection {

	private NamedElement namedElement;

	private CCombo typeCodeCombo;
	private boolean typeCodeModified = false;

	private void modifyFields() {
		if (!(typeCodeModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(namedElement);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype associationSterotype = CDAProfileUtil.getAppliedCDAStereotype(
							namedElement, ICDAProfileConstants.ASSOCIATION_VALIDATION);
					Stereotype entryRelationshipStereotype = CDAProfileUtil.getAppliedCDAStereotype(
							namedElement, ICDAProfileConstants.ENTRY_RELATIONSHIP);

					if (entryRelationshipStereotype == null) {
						entryRelationshipStereotype = CDAProfileUtil.applyCDAStereotype(
								namedElement, ICDAProfileConstants.ENTRY_RELATIONSHIP);
						
						if (associationSterotype != null) {
							// copy values and remove
							namedElement.setValue(entryRelationshipStereotype, ICDAProfileConstants.VALIDATION_SEVERITY,
									namedElement.getValue(associationSterotype, ICDAProfileConstants.VALIDATION_SEVERITY));
							namedElement.setValue(entryRelationshipStereotype, ICDAProfileConstants.VALIDATION_MESSAGE,
									namedElement.getValue(associationSterotype, ICDAProfileConstants.VALIDATION_MESSAGE));
							namedElement.unapplyStereotype(associationSterotype);
						}
					}
					Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
					Enumeration entryKind = (Enumeration)
						cdaProfile.getOwnedType(ICDAProfileConstants.ENTRY_RELATIONSHIP_KIND);
					
					if (typeCodeModified) {
						typeCodeModified = false;
						this.setLabel("Set Entry Relationship Type Code");
						if (entryRelationshipStereotype != null && entryKind != null) {
							if (typeCodeCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								namedElement.setValue(entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE, null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) entryKind.getOwnedLiterals()
									.get(typeCodeCombo.getSelectionIndex() - 1);
								namedElement.setValue(entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE, literal);
							}
						}
					}
					else {
						return Status.CANCEL_STATUS;
					}
					
			        return Status.OK_STATUS;
			    }};

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

	private void fillTypeCodeCombo() {
		Enumeration entryKind = null;
		if (namedElement != null) {
			Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
			entryKind = (Enumeration)
				cdaProfile.getOwnedType(ICDAProfileConstants.ENTRY_RELATIONSHIP_KIND);
		}
		
		if (entryKind == null) {
			typeCodeCombo.setItems(new String[] {});
		}
		else {
			List<String> items = new ArrayList<String>();
			items.add("");
			for (EnumerationLiteral literal : entryKind.getOwnedLiterals()) {
				items.add(literal.getLabel(true));
			}
			typeCodeCombo.setItems(items.toArray(new String[items.size()]));
		}
	}
	
	public void createControls(final Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		/* ---- literals combo ---- */
        typeCodeCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY);
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

		CLabel typeCodeLabel = getWidgetFactory()
				.createCLabel(composite, "Entry Relationship Type Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(typeCodeCombo, 0, SWT.CENTER);
		typeCodeLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(typeCodeLabel, 0);
		data.top = new FormAttachment(typeCodeCombo, 0, SWT.CENTER);
		typeCodeCombo.setLayoutData(data);

	}

	protected boolean isReadOnly() {
		if (namedElement != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(namedElement);
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
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof NamedElement);
		this.namedElement = (NamedElement) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				namedElement, ICDAProfileConstants.ENTRY_RELATIONSHIP);

        fillTypeCodeCombo();
        typeCodeCombo.select(0);
        if (stereotype != null) {
			EnumerationLiteral code = (EnumerationLiteral) namedElement.getValue(
					stereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			if (code != null) {
				int index = code.getEnumeration().getOwnedLiterals().indexOf(code);
				typeCodeCombo.select(index + 1);
			}
        }

		if (isReadOnly()) {
			typeCodeCombo.setEnabled(false);
		}
		else {
			typeCodeCombo.setEnabled(true);
		}

	}

	/**
	 * Update if necessary, upon receiving the model event.
	 * 
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification -
	 *            even notification
	 * @param element -
	 *            element that has changed
	 */
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && namedElement.eResource() != null)
						refresh();
				}
			});
		}
	}

}
