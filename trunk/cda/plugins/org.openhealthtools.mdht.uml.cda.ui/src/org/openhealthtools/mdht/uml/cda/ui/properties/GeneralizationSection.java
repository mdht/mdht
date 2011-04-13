/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;


/**
 * The properties section for Generalization.
 * 
 * $Id: $
 */
public class GeneralizationSection extends ResettableModelerPropertySection {

	private Generalization generalization;

	private Button isParentIdRequired;
	private boolean isParentIdRequiredModified = false;

	/**
	 * Duplicate copy of private field in superclass.  I'd like to remove this,
	 * but can't find another way to refresh all page sections.
	 */
	private TabbedPropertySheetPage myTabbedPropertySheetPage;

	private void modifyFields() {
		if (!(isParentIdRequiredModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(generalization);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype conformsToStereotype = CDAProfileUtil.getAppliedCDAStereotype(
							generalization, ICDAProfileConstants.CONFORMS_TO);

					if (conformsToStereotype == null) {
						conformsToStereotype = CDAProfileUtil.applyCDAStereotype(
								generalization, ICDAProfileConstants.CONFORMS_TO);
					}
					ConformsTo conformsTo = CDAProfileUtil.getConformsTo(generalization);
					
					if (conformsTo != null) {
						if (isParentIdRequiredModified) {
							isParentIdRequiredModified = false;
							this.setLabel("Set RequiresParentId");
							conformsTo.setRequiresParentId(isParentIdRequired.getSelection());
						}
						else {
							return Status.CANCEL_STATUS;
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

	protected void resetFields() {

		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(generalization);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	Stereotype conformsToStereotype = CDAProfileUtil.getAppliedCDAStereotype(
							generalization, ICDAProfileConstants.CONFORMS_TO);

			    	if (conformsToStereotype == null) {
			    		return Status.CANCEL_STATUS;
			    	}

			    	generalization.unapplyStereotype(conformsToStereotype);

					/*
					 * Refresh all sections on this tabbed page, especially the filtered stereotype specific sections.
					 * To force this, I had to change the selection to empty, then back to current object.
					 */
					ISelection currentSelection = getSelection();
					myTabbedPropertySheetPage.selectionChanged(getPart(), new StructuredSelection());
					myTabbedPropertySheetPage.selectionChanged(getPart(), currentSelection);

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

	public void createControls(final Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		myTabbedPropertySheetPage = aTabbedPropertySheetPage;

		Composite composite = getWidgetFactory()
				.createGroup(parent, "Generalization");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);

        FormData data = null;

		// Parent required checkbox
		isParentIdRequired = getWidgetFactory().createButton(composite, 
				"Requires Parent Template ID", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0,1, ITabbedPropertyConstants.VSPACE);
		isParentIdRequired.setLayoutData(data);
		isParentIdRequired.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isParentIdRequiredModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				isParentIdRequiredModified = true;
				modifyFields();
			}
		});

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(isParentIdRequired, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

	}

	protected boolean isReadOnly() {
		if (generalization != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(generalization);
			if (editingDomain != null && editingDomain.isReadOnly(generalization.eResource())) {
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
		if (element instanceof View) {
			element = ((View)element).getElement();
		}
		Assert.isTrue(element instanceof Generalization);
		this.generalization = (Generalization) element;
	}

	public void dispose() {
		super.dispose();
		generalization = null;
	}

	public void refresh() {
		ConformsTo conformsTo = CDAProfileUtil.getConformsTo(generalization);
		if (conformsTo != null) {
			isParentIdRequired.setSelection(conformsTo.isRequiresParentId());
		}
		else {
			isParentIdRequired.setSelection(false);
		}
		
		if (isReadOnly()) {
			isParentIdRequired.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		}
		else {
			isParentIdRequired.setEnabled(true);
			restoreDefaultsButton.setEnabled(conformsTo != null);
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
					if (!isDisposed() && !isNotifierDeleted(notification))
						refresh();
				}
			});
		}
	}

}