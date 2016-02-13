/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;

/**
 * The general properties section for ElementImport.
 *
 * $Id: $
 */
public class ElementImportSection extends WrapperAwareModelerPropertySection {

	private ElementImport elementImport;

	private CLabel importedElementName;

	private Button importButton;

	private void openImportedElementDialog() {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(elementImport);

		final Classifier type = (Classifier) DialogLaunchUtil.chooseElement(
			new java.lang.Class[] { Class.class, Enumeration.class }, editingDomain.getResourceSet(),
			getPart().getSite().getShell());

		if (type != null) {
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Set Imported Element") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					elementImport.setImportedElement(type);

					return Status.OK_STATUS;
				}
			};

			execute(operation);
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		gc.dispose();
		shell.dispose();

		// Base type
		CLabel elementLabel = getWidgetFactory().createCLabel(composite, "Element:"); //$NON-NLS-1$
		importedElementName = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

		importButton = getWidgetFactory().createButton(composite, "Select Element...", SWT.PUSH); //$NON-NLS-1$
		importButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				openImportedElementDialog();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(importedElementName, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 1, 0);
		elementLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 2);
		data.right = new FormAttachment(importButton, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 1, 0);
		importedElementName.setLayoutData(data);

		data = new FormData();
		data.right = new FormAttachment(80, 0);
		data.top = new FormAttachment(0, 1, 0);
		data.height = buttonHeight;
		importButton.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (elementImport != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(elementImport);
			if (editingDomain != null && editingDomain.isReadOnly(elementImport.eResource())) {
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
		if (element instanceof View) {
			element = ((View) element).getElement();
		}
		Assert.isTrue(element instanceof ElementImport);
		this.elementImport = (ElementImport) element;
	}

	@Override
	public void dispose() {
		super.dispose();
		elementImport = null;
	}

	@Override
	public void refresh() {
		if (elementImport.getImportedElement() != null) {
			importedElementName.setText(elementImport.getImportedElement().getQualifiedName());
		} else {
			importedElementName.setText("");
		}

		if (isReadOnly()) {
			importButton.setEnabled(false);
		} else {
			importButton.setEnabled(true);
		}
	}

	/**
	 * Update if nessesary, upon receiving the model event.
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
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

}
