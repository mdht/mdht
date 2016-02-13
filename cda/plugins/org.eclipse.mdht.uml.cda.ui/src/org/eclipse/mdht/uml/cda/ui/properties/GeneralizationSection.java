/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
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

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.cda.core.profile.ConformsTo;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
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
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The properties section for Generalization.
 *
 * $Id: $
 */
public class GeneralizationSection extends ValidationSection {

	private Button isParentIdRequired;

	private boolean isParentIdRequiredModified = false;

	@Override
	protected Stereotype getValidationStereotype() {
		String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR +
				ICDAProfileConstants.CONFORMS_TO;
		Stereotype stereotype = modelElement.getApplicableStereotype(qname);
		return stereotype;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Generalization);
		this.modelElement = (Generalization) element;
	}

	@Override
	protected void modifyFields() {
		super.modifyFields();

		if (!(isParentIdRequiredModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype conformsToStereotype = CDAProfileUtil.getAppliedCDAStereotype(
						modelElement, ICDAProfileConstants.CONFORMS_TO);

					if (conformsToStereotype == null) {
						conformsToStereotype = CDAProfileUtil.applyCDAStereotype(
							modelElement, ICDAProfileConstants.CONFORMS_TO);
					}
					ConformsTo conformsTo = CDAProfileUtil.getConformsTo((Generalization) modelElement);

					if (conformsTo != null) {
						if (isParentIdRequiredModified) {
							isParentIdRequiredModified = false;
							this.setLabel("Set RequiresParentId");
							conformsTo.setRequiresParentId(isParentIdRequired.getSelection());
						} else {
							return Status.CANCEL_STATUS;
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
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createGroup(parent, "Generalization");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		addValidationControls(composite, 0, 1);

		// Parent required checkbox
		isParentIdRequired = getWidgetFactory().createButton(composite, "Requires Parent Template ID", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(ruleIdText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(ruleIdText, 0, SWT.CENTER);
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

	@Override
	public void refresh() {
		super.refresh();

		ConformsTo conformsTo = CDAProfileUtil.getConformsTo((Generalization) modelElement);
		if (conformsTo != null) {
			isParentIdRequired.setSelection(conformsTo.isRequiresParentId());
		} else {
			isParentIdRequired.setSelection(false);
		}

		if (isReadOnly()) {
			isParentIdRequired.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			isParentIdRequired.setEnabled(true);
			restoreDefaultsButton.setEnabled(conformsTo != null);
		}
	}

}
