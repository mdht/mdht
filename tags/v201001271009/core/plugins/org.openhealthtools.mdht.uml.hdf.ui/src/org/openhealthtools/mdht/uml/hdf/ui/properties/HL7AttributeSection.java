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
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * The general properties section for Property.
 * 
 * $Id: $
 */
public class HL7AttributeSection extends AbstractModelerPropertySection {

	private Property property;

	private Button isImmutable;
	private boolean isImmutableModified = false;
	private Text minLengthText;
	private boolean minLengthModified = false;
	private Text maxLengthText;
	private boolean maxLengthModified = false;

    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (minLengthText == event.getSource()) {
				minLengthModified = true;
			}
			else if (maxLengthText == event.getSource()) {
				maxLengthModified = true;
			}
		}
	};

	private KeyListener keyListener = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			// do nothing
		}

		public void keyReleased(KeyEvent e) {
			if (SWT.CR == e.character || SWT.KEYPAD_CR == e.character)
				modifyFields();
		}
	};
	
	private FocusListener focusListener = new FocusListener() {
		public void focusGained(FocusEvent e) {
			// do nothing
		}

		public void focusLost(FocusEvent event) {
			modifyFields();
		}
	};
	
	private void modifyFields() {
		if (!(minLengthModified || maxLengthModified || isImmutableModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = HL7ResourceUtil.applyHDFStereotype(
							property, IHDFProfileConstants.HDF_ATTRIBUTE);
					
					if (minLengthModified) {
						minLengthModified = false;
						this.setLabel("Set Minimum Length");
						String newValue = minLengthText.getText();
						if (stereotype != null && newValue != null && newValue.trim().length() > 0) {
							property.setValue(stereotype, IHDFProfileConstants.MINIMUM_LENGTH, newValue.trim());
						}
						else {
							property.setValue(stereotype, IHDFProfileConstants.MINIMUM_LENGTH, null);
						}
					}
					else if (maxLengthModified) {
						maxLengthModified = false;
						this.setLabel("Set Maximum Length");
						String newValue = maxLengthText.getText();
						if (stereotype != null && newValue != null && newValue.trim().length() > 0) {
							property.setValue(stereotype, IHDFProfileConstants.MAXIMUM_LENGTH, newValue.trim());
						}
						else {
							property.setValue(stereotype, IHDFProfileConstants.MAXIMUM_LENGTH, null);
						}
					}
					else if (isImmutableModified) {
						isImmutableModified = false;
						this.setLabel("Set Structural");
						if (stereotype != null)
							property.setValue(stereotype, 
									IHDFProfileConstants.IS_IMMUTABLE, 
								Boolean.valueOf(isImmutable.getSelection()));
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
        
		/* ---- Immutable checkbox ---- */
		isImmutable = getWidgetFactory().createButton(composite, 
				"Immutable", SWT.CHECK);
		isImmutable.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isImmutableModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				isImmutableModified = true;
				modifyFields();
			}
		});

		/* ------ min and max length ------- */

		minLengthText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel minLengthLabel = getWidgetFactory()
				.createCLabel(composite, "Minimum Length:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(isImmutable, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(minLengthText, 0, SWT.CENTER);
		minLengthLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(minLengthLabel, 0);
		data.width = 30;
		data.top = new FormAttachment(0,numberOfLines, ITabbedPropertyConstants.VSPACE);
		minLengthText.setLayoutData(data);

		maxLengthText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel maxLengthLabel = getWidgetFactory()
				.createCLabel(composite, "Maximum Length:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(minLengthText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(maxLengthText, 0, SWT.CENTER);
		maxLengthLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(maxLengthLabel, 0);
		data.width = 30;
		data.top = new FormAttachment(0,numberOfLines, ITabbedPropertyConstants.VSPACE);
		maxLengthText.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0,5);
		data.top = new FormAttachment(minLengthText, 0, SWT.CENTER);
		isImmutable.setLayoutData(data);
		
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
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.HDF_ATTRIBUTE);
		
		minLengthText.removeModifyListener(modifyListener);
		minLengthText.removeKeyListener(keyListener);
		minLengthText.removeFocusListener(focusListener);
		if (stereotype != null) {
			Object value = property.getValue(stereotype, IHDFProfileConstants.MINIMUM_LENGTH);
			minLengthText.setText(value != null ? value.toString() : "");
		}
		else {
			minLengthText.setText("");
		}
		minLengthText.addModifyListener(modifyListener);
		minLengthText.addKeyListener(keyListener);
		minLengthText.addFocusListener(focusListener);

		maxLengthText.removeModifyListener(modifyListener);
		maxLengthText.removeKeyListener(keyListener);
		maxLengthText.removeFocusListener(focusListener);
		if (stereotype != null) {
			Object value = property.getValue(stereotype, IHDFProfileConstants.MAXIMUM_LENGTH);
			maxLengthText.setText(value != null ? value.toString() : "");
		}
		else {
			maxLengthText.setText("");
		}
		maxLengthText.addModifyListener(modifyListener);
		maxLengthText.addKeyListener(keyListener);
		maxLengthText.addFocusListener(focusListener);

		if (stereotype != null) {
			boolean isChecked = Boolean.TRUE.equals(
				(Boolean) property.getValue(stereotype, 
						IHDFProfileConstants.IS_IMMUTABLE));
			isImmutable.setSelection(isChecked);
		}
		else {
			isImmutable.setSelection(false);
		}

		if (isReadOnly()) {
			isImmutable.setEnabled(false);
			minLengthText.setEnabled(false);
			maxLengthText.setEnabled(false);
		}
		else {
			isImmutable.setEnabled(true);
			minLengthText.setEnabled(true);
			maxLengthText.setEnabled(true);
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
