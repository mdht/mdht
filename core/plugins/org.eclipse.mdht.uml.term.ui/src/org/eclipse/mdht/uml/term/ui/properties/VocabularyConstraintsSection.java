/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - making section groups consistent
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *                        - implement handling of live validation roll-back (artf3318)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.term.ui.properties;

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
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The general properties section for Property.
 */
public class VocabularyConstraintsSection extends WrapperAwareModelerPropertySection {

	/**
	 * Duplicate copy of private field in superclass. I'd like to remove this,
	 * but can't find another way to refresh all page sections.
	 */
	private TabbedPropertySheetPage myTabbedPropertySheetPage;

	private Property property;

	private Button isConceptDomainConstraint;

	private boolean isConceptDomainConstraintModified = false;

	private Button isCodeSystemConstraint;

	private boolean isCodeSystemConstraintModified = false;

	private Button isValueSetConstraint;

	private boolean isValueSetConstraintModified = false;

	/**
	 * Allow for other profiles to subclass Terminology stereotypes.
	 */
	private Stereotype getApplicableStereotype(Element element, String stereotypeName) {
		Stereotype stereotype = null;
		for (Stereotype applicable : element.getApplicableStereotypes()) {
			if (applicable.getName().equals(stereotypeName)) {
				stereotype = applicable;
				break;
			}
			Class superclass = applicable.getSuperClass(stereotypeName);
			if (superclass instanceof Stereotype) {
				stereotype = (Stereotype) superclass;
				break;
			}
		}

		return stereotype;
	}

	private void modifyFields() {
		if (!(isConceptDomainConstraintModified || isCodeSystemConstraintModified || isValueSetConstraintModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (isConceptDomainConstraintModified) {
						isConceptDomainConstraintModified = false;
						this.setLabel("Add ConceptDomainConstraint");
						Stereotype stereotype = getApplicableStereotype(
							property, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
						if (stereotype != null) {
							boolean isApplied = property.isStereotypeApplied(stereotype);
							if (isConceptDomainConstraint.getSelection() && !isApplied) {
								property.applyStereotype(stereotype);
							} else if (!isConceptDomainConstraint.getSelection() && isApplied) {
								property.unapplyStereotype(stereotype);
							}
						}
					} else if (isCodeSystemConstraintModified) {
						isCodeSystemConstraintModified = false;
						this.setLabel("Add CodeSystemConstraint");
						Stereotype stereotype = getApplicableStereotype(
							property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
						if (stereotype != null) {
							boolean isApplied = property.isStereotypeApplied(stereotype);
							if (isCodeSystemConstraint.getSelection() && !isApplied) {
								property.applyStereotype(stereotype);
							} else if (!isCodeSystemConstraint.getSelection() && isApplied) {
								property.unapplyStereotype(stereotype);
							}
						}
					} else if (isValueSetConstraintModified) {
						isValueSetConstraintModified = false;
						this.setLabel("Add ValueSetConstraint");
						Stereotype stereotype = getApplicableStereotype(
							property, ITermProfileConstants.VALUE_SET_CONSTRAINT);
						if (stereotype != null) {
							boolean isApplied = property.isStereotypeApplied(stereotype);
							if (isValueSetConstraint.getSelection() && !isApplied) {
								property.applyStereotype(stereotype);
							} else if (!isValueSetConstraint.getSelection() && isApplied) {
								property.unapplyStereotype(stereotype);
							}
						}
					} else {
						return Status.CANCEL_STATUS;
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

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		myTabbedPropertySheetPage = aTabbedPropertySheetPage;

		Composite composite = getWidgetFactory().createGroup(parent, "Vocabulary Constraints");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		/* ---- Concept Domain checkbox ---- */
		isConceptDomainConstraint = getWidgetFactory().createButton(composite, "Concept Domain", SWT.CHECK);
		isConceptDomainConstraint.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isConceptDomainConstraintModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isConceptDomainConstraintModified = true;
				modifyFields();
			}
		});

		/* ---- Code System checkbox ---- */
		isCodeSystemConstraint = getWidgetFactory().createButton(composite, "Code System", SWT.CHECK);
		isCodeSystemConstraint.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isCodeSystemConstraintModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isCodeSystemConstraintModified = true;
				modifyFields();
			}
		});

		/* ----Value Set checkbox ---- */
		isValueSetConstraint = getWidgetFactory().createButton(composite, "Value Set", SWT.CHECK);
		isValueSetConstraint.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isValueSetConstraintModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isValueSetConstraintModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.top = new FormAttachment(0, 0);
		isConceptDomainConstraint.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(isConceptDomainConstraint, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		isCodeSystemConstraint.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(isCodeSystemConstraint, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		isValueSetConstraint.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (property != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);
			if (editingDomain != null && editingDomain.isReadOnly(property.eResource())) {
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
		Assert.isTrue(element instanceof Property);
		this.property = (Property) element;
	}

	@Override
	public void dispose() {
		super.dispose();
		property = null;
	}

	@Override
	public void refresh() {
		boolean isChecked = TermProfileUtil.getAppliedStereotype(
			property, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT) != null;
		isConceptDomainConstraint.setSelection(isChecked);

		isChecked = TermProfileUtil.getAppliedStereotype(
			property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT) != null;
		isCodeSystemConstraint.setSelection(isChecked);

		isChecked = TermProfileUtil.getAppliedStereotype(property, ITermProfileConstants.VALUE_SET_CONSTRAINT) != null;
		isValueSetConstraint.setSelection(isChecked);

		if (isReadOnly()) {
			isConceptDomainConstraint.setEnabled(false);
			isCodeSystemConstraint.setEnabled(false);
			isValueSetConstraint.setEnabled(false);
		} else {
			isConceptDomainConstraint.setEnabled(true);
			isCodeSystemConstraint.setEnabled(true);
			isValueSetConstraint.setEnabled(true);
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
					if (!isDisposed() && property.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

}
