/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * The profile properties section for Enumeration Constraint.
 */
public class EnumerationConstraintSection extends AbstractModelerPropertySection {

	private Property property;

	private CLabel enumerationValue;
	private Button enumerationValueButton;

	private void openElementSelectionDialog() {
		final NamedElement element = DialogLaunchUtil.chooseElement(
				new java.lang.Class[] {Enumeration.class},
				property.eResource().getResourceSet(), 
				getPart().getSite().getShell());
		
		if (element == null) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
							property, IHDFProfileConstants.ENUMERATION_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set Enumeration value");

					if (stereotype != null) {
						property.setValue(stereotype, 
								IHDFProfileConstants.ENUMERATION_VALUE,
								(Enumeration)element);
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

        Shell shell = new Shell();
        GC gc = new GC(shell);
        gc.setFont(shell.getFont());
        Point point = gc.textExtent("");//$NON-NLS-1$
        int buttonHeight = point.y + 10;
        gc.dispose();
        shell.dispose();

		Composite composite = getWidgetFactory()
				.createGroup(parent, "Enumeration Constraint");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);
		
		FormData data = null;

		/* value */
		enumerationValue = getWidgetFactory().createCLabel(composite, "", SWT.BORDER); //$NON-NLS-1$

        enumerationValueButton = getWidgetFactory().createButton(composite,
            "Select...", SWT.PUSH); //$NON-NLS-1$
        enumerationValueButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
            	openElementSelectionDialog();
            }
        });

        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.height = buttonHeight;
        enumerationValueButton.setLayoutData(data);

        data = new FormData();
        data.left = new FormAttachment(enumerationValueButton, 0);
        data.right = new FormAttachment(100, 0);
        enumerationValue.setLayoutData(data);

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
		Assert.isTrue(element instanceof Property);
		this.property = (Property) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
		final AdapterFactory adapterFactory = new UMLItemProviderAdapterFactory();
		final ILabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.ENUMERATION_CONSTRAINT);

		Enumeration value = (Enumeration) property.getValue(
				stereotype, IHDFProfileConstants.ENUMERATION_VALUE);
		if (value != null) {
			enumerationValue.setText(labelProvider.getText(value));
			enumerationValue.layout();
		}
		else {
			enumerationValue.setText("");
		}

		if (isReadOnly()) {
			enumerationValueButton.setEnabled(false);
		}
		else {
			enumerationValueButton.setEnabled(true);
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
					if (!isDisposed() && property.eResource() != null)
						refresh();
				}
			});
		}
	}

}
