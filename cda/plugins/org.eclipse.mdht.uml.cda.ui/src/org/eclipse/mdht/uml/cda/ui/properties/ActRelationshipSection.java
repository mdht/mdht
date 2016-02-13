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
 *                        - implement handling of live validation roll-back (artf3318)
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
import org.eclipse.mdht.uml.cda.core.profile.ActRelationship;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.cda.core.util.RIMModelUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The profile properties section for CDA ActRelationship.
 */
public class ActRelationshipSection extends WrapperAwareModelerPropertySection {

	private Association association;

	private List<Class> associationTypes = new ArrayList<Class>();

	private CCombo associationTypeCombo;

	private boolean associationTypeModified = false;

	private CCombo typeCodeCombo;

	private boolean typeCodeModified = false;

	private void modifyFields() {
		if (!(associationTypeModified || typeCodeModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(association);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype actRelationshipStereotype = CDAProfileUtil.getAppliedCDAStereotype(
						association, ICDAProfileConstants.ACT_RELATIONSHIP);

					if (actRelationshipStereotype == null) {
						actRelationshipStereotype = CDAProfileUtil.applyCDAStereotype(
							association, ICDAProfileConstants.ACT_RELATIONSHIP);
					}
					ActRelationship actRelationship = CDAProfileUtil.getActRelationship(association);
					if (actRelationship == null) {
						return Status.CANCEL_STATUS;
					}

					if (associationTypeModified) {
						associationTypeModified = false;
						this.setLabel("Set Association Type");

					}
					if (typeCodeModified) {
						typeCodeModified = false;
						this.setLabel("Set Type Code");
						// if (actRelationshipStereotype != null && entryKind != null) {
						// if (typeCodeCombo.getSelectionIndex() == 0) {
						// // remove stereotype property
						// namedElement.setValue(actRelationshipStereotype, ICDAProfileConstants.ACT_RELATIONSHIP_TYPE_CODE, null);
						// }
						// else {
						// EnumerationLiteral literal = (EnumerationLiteral) entryKind.getOwnedLiterals()
						// .get(typeCodeCombo.getSelectionIndex() - 1);
						// namedElement.setValue(actRelationshipStereotype, ICDAProfileConstants.ACT_RELATIONSHIP_TYPE_CODE, literal);
						// }
						// }
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

	private void fillAssociationTypeCombo() {
		associationTypes = RIMModelUtil.getAssociationTypes(association);

		if (associationTypes.isEmpty()) {
			associationTypeCombo.setItems(new String[] {});
		} else {
			List<String> items = new ArrayList<String>();
			items.add("");
			for (Class type : associationTypes) {
				items.add(type.getLabel(true));
			}
			associationTypeCombo.setItems(items.toArray(new String[items.size()]));
		}
	}

	private void fillTypeCodeCombo() {
		Class associationType = null;
		if (associationTypeCombo.getSelectionIndex() > 0) {
			associationType = associationTypes.get(associationTypeCombo.getSelectionIndex() - 1);
		}

		List<EnumerationLiteral> typeCodes = RIMModelUtil.getTypeCodes(associationType);

		if (typeCodes.isEmpty()) {
			typeCodeCombo.setItems(new String[] {});
		} else {
			List<String> items = new ArrayList<String>();
			items.add("");
			for (EnumerationLiteral literal : typeCodes) {
				items.add(literal.getLabel(true));
			}
			typeCodeCombo.setItems(items.toArray(new String[items.size()]));
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		/* ---- association type combo ---- */
		associationTypeCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY);
		associationTypeCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				associationTypeModified = true;
				modifyFields();
				fillTypeCodeCombo();
			}

			public void widgetSelected(SelectionEvent e) {
				associationTypeModified = true;
				modifyFields();
				fillTypeCodeCombo();
			}
		});

		CLabel associationTypeLabel = getWidgetFactory().createCLabel(composite, "Association Type:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(associationTypeCombo, 0, SWT.CENTER);
		associationTypeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(associationTypeLabel, 0);
		data.top = new FormAttachment(associationTypeCombo, 0, SWT.CENTER);
		associationTypeCombo.setLayoutData(data);

		/* ---- literals combo ---- */
		typeCodeCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY);
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
		data.left = new FormAttachment(associationTypeCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(typeCodeCombo, 0, SWT.CENTER);
		typeCodeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(typeCodeLabel, 0);
		data.top = new FormAttachment(typeCodeCombo, 0, SWT.CENTER);
		typeCodeCombo.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (association != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(association);
			if (editingDomain != null && editingDomain.isReadOnly(association.eResource())) {
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
		this.association = (Association) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			association, ICDAProfileConstants.ENTRY_RELATIONSHIP);

		Enumeration entryRelKind = null;
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(association.eResource().getResourceSet());
		if (cdaProfile != null) {
			entryRelKind = (Enumeration) cdaProfile.getOwnedType(ICDAProfileConstants.ENTRY_RELATIONSHIP_KIND);
		}

		fillAssociationTypeCombo();

		fillTypeCodeCombo();
		typeCodeCombo.select(0);
		if (stereotype != null) {
			Object value = association.getValue(stereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			String typeCode = null;
			if (value instanceof EnumerationLiteral) {
				typeCode = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				typeCode = ((Enumerator) value).getName();
			}

			if (typeCode != null) {
				EnumerationLiteral literal = entryRelKind.getOwnedLiteral(typeCode);
				if (literal != null) {
					int index = entryRelKind.getOwnedLiterals().indexOf(literal);
					typeCodeCombo.select(index + 1);
				}
			}
		}

		if (isReadOnly()) {
			typeCodeCombo.setEnabled(false);
		} else {
			typeCodeCombo.setEnabled(true);
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
					if (!isDisposed() && association.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

}
