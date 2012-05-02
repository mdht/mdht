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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ISelection;
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
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;

/**
 * The profile properties section for CDA Validation.
 */
public class PropertySection extends ValidationSection {

	private Button mandatoryButton;

	private boolean mandatoryModified = false;

	@Override
	protected Stereotype getValidationStereotype() {
		String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR +
				ICDAProfileConstants.PROPERTY_VALIDATION;
		Stereotype stereotype = modelElement.getApplicableStereotype(qname);
		return stereotype;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Property);
		this.modelElement = (Property) element;
	}

	@Override
	protected void modifyFields() {
		super.modifyFields();

		if (!(mandatoryModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = getValidationStereotype();

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					if (!modelElement.isStereotypeApplied(stereotype)) {
						modelElement.applyStereotype(stereotype);
					}

					if (mandatoryModified) {
						mandatoryModified = false;
						this.setLabel("Set Validation Mandatory");
						modelElement.setValue(
							stereotype, ICDAProfileConstants.VALIDATION_MANDATORY, mandatoryButton.getSelection());
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
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createGroup(parent, "Property Validation (multiplicty, type)");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		addValidationControls(composite, 0, 1);

		FormData data = null;

		/* ---- mandatory checkbox ---- */
		mandatoryButton = getWidgetFactory().createButton(composite, "Mandatory", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(ruleIdText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(ruleIdText, 0, SWT.CENTER);
		mandatoryButton.setLayoutData(data);
		mandatoryButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				mandatoryModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				mandatoryModified = true;
				modifyFields();
			}
		});

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(mandatoryButton, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

	}

	@Override
	public void refresh() {
		super.refresh();

		Stereotype stereotype = getValidationStereotype();

		if (stereotype != null && modelElement.isStereotypeApplied(stereotype)) {
			Object value = modelElement.getValue(stereotype, ICDAProfileConstants.VALIDATION_MANDATORY);
			mandatoryButton.setSelection(Boolean.TRUE.equals(value));
		} else {
			mandatoryButton.setSelection(false);
		}

		if (isReadOnly()) {
			mandatoryButton.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			mandatoryButton.setEnabled(true);
			restoreDefaultsButton.setEnabled(stereotype != null && modelElement.isStereotypeApplied(stereotype));
		}

	}

}
