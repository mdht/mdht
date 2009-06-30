/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.ui.properties;


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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.ui.internal.l10n.Messages;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * The general properties section for Property.
 * 
 * $Id: $
 */
public class HL7PropertySection extends AbstractModelerPropertySection {

	private Property property;

	private Button isMandatory;
	private boolean isMandatoryModified = false;
	private CCombo conformanceCombo;
	private boolean conformanceModified = false;

	private void modifyFields() {
		if (!(isMandatoryModified || conformanceModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
							property, IHDFProfileConstants.HDF_ATTRIBUTE);
					if (stereotype == null) {
						stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
							property, IHDFProfileConstants.HDF_ASSOCIATION_END);
					}
					
					if (stereotype == null) {
						if (property.getAssociation() != null) {
							stereotype = HL7ResourceUtil.applyHDFStereotype(
									property, IHDFProfileConstants.HDF_ASSOCIATION_END);
						}
						else {
							stereotype = HL7ResourceUtil.applyHDFStereotype(
									property, IHDFProfileConstants.HDF_ATTRIBUTE);
						}
					}

					Profile hdfProfile = HL7ResourceUtil.applyHDFProfile(UMLUtil.getTopPackage(property));
					Enumeration conformanceKind = (Enumeration)
						hdfProfile.getOwnedType(IHDFProfileConstants.CONFORMANCE_KIND);
					
					if (conformanceModified) {
						conformanceModified = false;
						this.setLabel("Set Conformance");
						if (stereotype != null && conformanceKind != null) {
							if (conformanceCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								property.setValue(stereotype, IHDFProfileConstants.CONFORMANCE, null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) conformanceKind.getOwnedLiterals()
									.get(conformanceCombo.getSelectionIndex());
								property.setValue(stereotype, IHDFProfileConstants.CONFORMANCE, literal);
							}
						}
					}
					else if (isMandatoryModified) {
						isMandatoryModified = false;
						this.setLabel("Set Mandatory");
						if (stereotype != null)
							property.setValue(stereotype, 
									IHDFProfileConstants.IS_MANDATORY, 
								Boolean.valueOf(isMandatory.getSelection()));
					}
					else {
						return Status.CANCEL_STATUS;
					}

					// fire notification for any stereotype property changes to update views
					// this is a bogus notification of change to property name, but can't find a better option
					Notification notification = new NotificationImpl(
							Notification.SET, null, property.getName()) {
						public Object getNotifier() {
							return property;
						}
						public int getFeatureID(Class expectedClass) {
							return UMLPackage.PROPERTY__NAME;
						}
					};
					property.eNotify(notification);
					
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
		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);
		FormData data = null;

        int numberOfLines = 1;
        
        /* ========== Line 1 =========== */
		/* ---- Mandatory checkbox ---- */
		isMandatory = getWidgetFactory().createButton(composite, 
				"Mandatory", SWT.CHECK);
		isMandatory.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isMandatoryModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				isMandatoryModified = true;
				modifyFields();
			}
		});
		
		/* ---- conformance combo ---- */
		conformanceCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY);
		conformanceCombo.setItems(new String[] {
				"",
				Messages.Conformance_I_label,
				Messages.Conformance_NP_label,
				Messages.Conformance_R_label
		});
		conformanceCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				conformanceModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				conformanceModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0,5);
		data.top = new FormAttachment(conformanceCombo, 0, SWT.CENTER);
		isMandatory.setLayoutData(data);
		
		CLabel conformanceLabel = getWidgetFactory()
				.createCLabel(composite, "Conformance:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(isMandatory, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(conformanceCombo, 0, SWT.CENTER);
		conformanceLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(conformanceLabel, 0);
		data.top = new FormAttachment(0,numberOfLines, ITabbedPropertyConstants.VSPACE);
		conformanceCombo.setLayoutData(data);

	}

	protected boolean isReadOnly() {
		if (property != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
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
		Assert.isTrue(element instanceof Property);
		this.property = (Property) element;
	}

	public void dispose() {
		super.dispose();
		property = null;
	}

	public void refresh() {
		Enumeration conformanceKind = null;
		Profile hdfProfile = HL7ResourceUtil.getAppliedHDFProfile(property.getModel());
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.HDF_ATTRIBUTE);
		if (stereotype == null) {
			stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.HDF_ASSOCIATION_END);
		}
		if (hdfProfile != null) {
			conformanceKind = (Enumeration)
				hdfProfile.getOwnedType(IHDFProfileConstants.CONFORMANCE_KIND);
		}
		
		conformanceCombo.select(0);
		if (stereotype != null) {
			EnumerationLiteral literal = (EnumerationLiteral) property.getValue(
					stereotype, IHDFProfileConstants.CONFORMANCE);
			if (conformanceKind != null && literal != null) {
				int index = conformanceKind.getOwnedLiterals().indexOf(literal);
				conformanceCombo.select(index);
			}
		}

		if (stereotype != null) {
			boolean isChecked = Boolean.TRUE.equals(
				(Boolean) property.getValue(stereotype, 
						IHDFProfileConstants.IS_MANDATORY));
			isMandatory.setSelection(isChecked);
		}
		else {
			isMandatory.setSelection(false);
		}

		if (isReadOnly()) {
			isMandatory.setEnabled(false);
			conformanceCombo.setEnabled(false);
		}
		else {
			isMandatory.setEnabled(true);
			conformanceCombo.setEnabled(true);
		}
	}

	/**
	 * Update if nessesary, upon receiving the model event.
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
					if (!isDisposed() && property.eResource() != null)
						refresh();
				}
			});
		}
	}

}
