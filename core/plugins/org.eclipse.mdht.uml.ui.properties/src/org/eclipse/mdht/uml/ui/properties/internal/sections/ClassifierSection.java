/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adjusting alignmnent of field labels
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
import org.eclipse.mdht.uml.common.ui.search.GeneralizationTypeFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;

/**
 * The general properties section for Classifier.
 *
 * $Id: $
 */
public class ClassifierSection extends WrapperAwareModelerPropertySection {

	private Classifier classifier;

	private Button isAbstract;

	private boolean isAbstractModified = false;

	private CLabel baseTypeName;

	private Button typeButton;

	private void modifyFields() {
		if (!(isAbstractModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(classifier);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (isAbstractModified) {
						isAbstractModified = false;
						this.setLabel("Set Abstract");
						classifier.setIsAbstract(isAbstract.getSelection());
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

	private void openBaseTypeDialog() {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(classifier);

		final NamedElement type = DialogLaunchUtil.chooseElement(
			new GeneralizationTypeFilter(classifier), UMLUtil.getTopPackage(classifier),
			getPart().getSite().getShell());

		if (type != null) {
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Set Base Type") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (classifier.getGeneralizations().isEmpty()) {
						classifier.createGeneralization((Classifier) type);
					} else {
						Generalization generalization = classifier.getGeneralizations().get(0);
						generalization.setGeneral((Classifier) type);

						// refresh children, cause change notification to be sent
						Classifier owner = generalization.getSpecific();
						int position = owner.getGeneralizations().lastIndexOf(generalization);
						owner.getGeneralizations().remove(generalization);
						owner.getGeneralizations().add(position, generalization);
					}
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
		CLabel typeLabel = getWidgetFactory().createCLabel(composite, "Base Type:"); //$NON-NLS-1$
		baseTypeName = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

		typeButton = getWidgetFactory().createButton(composite, "Select Type...", SWT.PUSH); //$NON-NLS-1$
		typeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				openBaseTypeDialog();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(baseTypeName, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 2, 0);
		typeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(typeButton, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 2, 0);
		baseTypeName.setLayoutData(data);

		data = new FormData();
		data.right = new FormAttachment(60, 0);
		data.top = new FormAttachment(0, 2, 0);
		data.height = buttonHeight;
		typeButton.setLayoutData(data);

		// Is Abstract checkbox
		isAbstract = getWidgetFactory().createButton(composite, "Abstract", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(1, 2, ITabbedPropertyConstants.VSPACE + 2);
		isAbstract.setLayoutData(data);
		isAbstract.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isAbstractModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isAbstractModified = true;
				modifyFields();
			}
		});

	}

	@Override
	protected boolean isReadOnly() {
		if (classifier != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(classifier);
			if (editingDomain != null && editingDomain.isReadOnly(classifier.eResource())) {
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
		Assert.isTrue(element instanceof Classifier);
		this.classifier = (Classifier) element;
	}

	@Override
	public void dispose() {
		super.dispose();
		classifier = null;
	}

	@Override
	public void refresh() {
		isAbstract.setSelection(classifier.isAbstract());

		Classifier general = null;
		if (!classifier.getGeneralizations().isEmpty()) {
			Generalization generalization = classifier.getGeneralizations().get(0);
			general = generalization.getGeneral();
		}
		if (general != null) {
			baseTypeName.setText(general.getQualifiedName());
		} else {
			baseTypeName.setText("");
		}

		if (isReadOnly()) {
			isAbstract.setEnabled(false);
			typeButton.setEnabled(false);
		} else {
			isAbstract.setEnabled(true);
			typeButton.setEnabled(true);
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
