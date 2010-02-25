/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cts.ui.properties;

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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.cts.core.util.CTSProfileUtil;
import org.openhealthtools.mdht.uml.cts.core.util.ICTSProfileConstants;
import org.openhealthtools.mdht.uml.cts.ui.internal.Logger;

/**
 * The profile properties section for Value Set Constraint.
 */
public class ValueSetConstraintSection extends AbstractModelerPropertySection {

	private Property property;
	
	private Text idText;
	private boolean idModified = false;
	private Text nameText;
	private boolean nameModified = false;
	private Text versionDateText;
	private boolean versionDateModified = false;
	private CCombo bindingCombo;
	private boolean bindingModified = false;

	private CLabel valueSetRefLabel;
	private Button valueSetRefButton;
	private Button valueSetRefDeleteButton;
	
    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (idText == event.getSource()) {
				idModified = true;
			}
			if (nameText == event.getSource()) {
				nameModified = true;
			}
			if (versionDateText == event.getSource()) {
				versionDateModified = true;
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
		if (!(idModified || nameModified || versionDateModified
				|| bindingModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile ctsProfile = CTSProfileUtil.getCTSProfile(property.eResource().getResourceSet());
					if (ctsProfile == null) {
						return Status.CANCEL_STATUS;
					}
					Enumeration bindingKind = (Enumeration)
						ctsProfile.getOwnedType(ICTSProfileConstants.BINDING_KIND);
					
					Stereotype stereotype = CTSProfileUtil.getAppliedCTSStereotype(
							property, ICTSProfileConstants.VALUE_SET_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					else if (idModified) {
						idModified = false;
						this.setLabel("Set Value Set ID");

						if (stereotype != null) {
							String value = idText.getText().trim();
							property.setValue(stereotype, 
									ICTSProfileConstants.VALUE_SET_CONSTRAINT_ID,
									value.length()>0 ? value : null);

						}
					}
					else if (nameModified) {
						nameModified = false;
						this.setLabel("Set Value Set Name");

						if (stereotype != null) {
							String value = nameText.getText().trim();
							property.setValue(stereotype, 
									ICTSProfileConstants.VALUE_SET_CONSTRAINT_NAME,
									value.length()>0 ? value : null);

						}
					}
					else if (versionDateModified) {
						versionDateModified = false;
						this.setLabel("Set Value Set Version");

						if (stereotype != null) {
							String value = versionDateText.getText().trim();
							property.setValue(stereotype, 
									ICTSProfileConstants.VALUE_SET_CONSTRAINT_VERSION,
									value.length()>0 ? value : null);

						}
					}
					else if (bindingModified) {
						bindingModified = false;
						this.setLabel("Set Coding Strength");
						if (stereotype != null && bindingKind != null) {
							if (bindingCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								property.setValue(stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_BINDING, null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) bindingKind.getOwnedLiterals()
									.get(bindingCombo.getSelectionIndex());
								property.setValue(stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_BINDING, literal);
							}
						}
					}
					else {
						return Status.CANCEL_STATUS;
					}

					updateViews();

					
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

	private void addValueSetReference() {
		final Enumeration valueSet = (Enumeration) DialogLaunchUtil.chooseElement(
				new java.lang.Class[] {Enumeration.class},
				property.eResource().getResourceSet(), 
				getPart().getSite().getShell());
		
		if (valueSet == null) {
			return;
		}
		final Stereotype valueSetStereotype = CTSProfileUtil.getAppliedCTSStereotype(
				valueSet, ICTSProfileConstants.VALUE_SET_VERSION);
		if (valueSetStereotype == null) {
			MessageDialog.openError(getPart().getSite().getShell(), 
					"Invalid Enumeration", "The selected Enumertion must be a <<ValueSet>>");
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = CTSProfileUtil.getAppliedCTSStereotype(
							property, ICTSProfileConstants.VALUE_SET_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set ValueSet reference");

					if (stereotype != null) {
						CTSProfileUtil.setStereotypeApplicationValue(property, stereotype, 
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_REFERENCE, 
								valueSet, ICTSProfileConstants.VALUE_SET_VERSION);
						
						String valueSetId = (String) valueSet.getValue(valueSetStereotype, ICTSProfileConstants.VALUE_SET_VERSION_ID);
						String valueSetName = (String) valueSet.getValue(valueSetStereotype, ICTSProfileConstants.VALUE_SET_VERSION_NAME);
						String valueSetVersion = (String) valueSet.getValue(valueSetStereotype, ICTSProfileConstants.VALUE_SET_VERSION_VERSION);
						EnumerationLiteral valueSetBinding = (EnumerationLiteral) valueSet.getValue(valueSetStereotype, ICTSProfileConstants.VALUE_SET_VERSION_BINDING);
						
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_ID, valueSetId);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_NAME, valueSetName);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_VERSION, valueSetVersion);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_BINDING, valueSetBinding);
							
						refresh();
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

	private void deleteValueSetReference() {
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = CTSProfileUtil.getAppliedCTSStereotype(
							property, ICTSProfileConstants.VALUE_SET_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Remove ValueSet reference");

					if (stereotype != null) {
						property.setValue(stereotype, 
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_REFERENCE, null);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_ID, null);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_NAME, null);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_VERSION, null);
						property.setValue(stereotype,
								ICTSProfileConstants.VALUE_SET_CONSTRAINT_BINDING, null);
						refresh();
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
				.createGroup(parent, "Value Set");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);

        int numberOfRows = 3;
		FormData data = null;

		/* ------ ValueSet reference ------ */
		valueSetRefLabel = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

        valueSetRefButton = getWidgetFactory().createButton(composite,
            "Select Value Set...", SWT.PUSH); //$NON-NLS-1$
        valueSetRefButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
            	addValueSetReference();
            }
        });
        
        valueSetRefDeleteButton = getWidgetFactory().createButton(composite,
                "X", SWT.PUSH); //$NON-NLS-1$
        valueSetRefDeleteButton.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent event) {
                	deleteValueSetReference();
                }
            });

        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.height = buttonHeight;
		data.top = new FormAttachment(0,numberOfRows);
        valueSetRefButton.setLayoutData(data);

        data = new FormData();
        data.left = new FormAttachment(valueSetRefButton, 0);
        data.height = buttonHeight;
		data.top = new FormAttachment(valueSetRefButton, 0, SWT.CENTER);
        valueSetRefDeleteButton.setLayoutData(data);

        data = new FormData();
        data.left = new FormAttachment(valueSetRefDeleteButton, 0);
        data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(valueSetRefButton, 0, SWT.CENTER);
        valueSetRefLabel.setLayoutData(data);

		/* ------ Name field ------ */
		nameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel nameLabel = getWidgetFactory()
				.createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(nameLabel, 0);
		data.right = new FormAttachment(30, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		nameText.setLayoutData(data);

		/* ------ ID field ------ */
		idText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel idLabel = getWidgetFactory()
				.createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(nameText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		idLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(idLabel, 0);
		data.right = new FormAttachment(60, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		idText.setLayoutData(data);

		/* ---- binding combo ---- */
		bindingCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		bindingCombo.setItems(new String[] {
				"Static", 
				"Dynamic"
		});
		bindingCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				bindingModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				bindingModified = true;
				modifyFields();
			}
		});

		CLabel bindingLabel = getWidgetFactory()
				.createCLabel(composite, "Binding:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(bindingCombo, 0, SWT.CENTER);
		bindingLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(bindingLabel, 0);
		data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
		bindingCombo.setLayoutData(data);

		/* ------ Version Date field ------ */
		versionDateText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory()
				.createCLabel(composite, "Version Date:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bindingCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(versionDateText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(60, 0);
		data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
		versionDateText.setLayoutData(data);

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
		Assert.isTrue(element instanceof NamedElement);
		this.property = (Property) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
		Profile ctsProfile = CTSProfileUtil.getCTSProfile(property.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		Enumeration bindingKind = (Enumeration)
			ctsProfile.getOwnedType(ICTSProfileConstants.BINDING_KIND);
		
		Stereotype stereotype = CTSProfileUtil.getAppliedCTSStereotype(property, 
				ICTSProfileConstants.VALUE_SET_CONSTRAINT);
		Enumeration reference = (Enumeration) CTSProfileUtil.getStereotypeApplicationValue(
				property, ICTSProfileConstants.VALUE_SET_CONSTRAINT, 
				ICTSProfileConstants.VALUE_SET_CONSTRAINT_REFERENCE);
		if (reference != null) {
			valueSetRefLabel.setText(reference.getQualifiedName());
			valueSetRefLabel.layout();
		}
		else {
			valueSetRefLabel.setText("");
		}

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_ID);
			idText.setText(name!=null ? name : "");
		}
		else {
			idText.setText("");
		}
		idText.addModifyListener(modifyListener);
		idText.addKeyListener(keyListener);
		idText.addFocusListener(focusListener);

		nameText.removeModifyListener(modifyListener);
		nameText.removeKeyListener(keyListener);
		nameText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_NAME);
			nameText.setText(name!=null ? name : "");
		}
		else {
			nameText.setText("");
		}
		nameText.addModifyListener(modifyListener);
		nameText.addKeyListener(keyListener);
		nameText.addFocusListener(focusListener);

		versionDateText.removeModifyListener(modifyListener);
		versionDateText.removeKeyListener(keyListener);
		versionDateText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_VERSION);
			versionDateText.setText(name!=null ? name : "");
		}
		else {
			versionDateText.setText("");
		}
		versionDateText.addModifyListener(modifyListener);
		versionDateText.addKeyListener(keyListener);
		versionDateText.addFocusListener(focusListener);

		bindingCombo.select(0);
		if (stereotype != null && property.hasValue(
				stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_BINDING)) {
			Object value = property.getValue(stereotype, ICTSProfileConstants.VALUE_SET_CONSTRAINT_BINDING);
			String binding = null;
			if (value instanceof EnumerationLiteral) {
				binding = ((EnumerationLiteral)value).getName();
			}
			else if (value instanceof Enumerator) {
				binding = ((Enumerator)value).getName();
			}
			
			if (bindingKind != null && binding != null) {
				EnumerationLiteral literal = bindingKind.getOwnedLiteral(binding);
				int index = bindingKind.getOwnedLiterals().indexOf(literal);
				bindingCombo.select(index);
			}
		}

		if (isReadOnly()) {
			valueSetRefLabel.setEnabled(false);
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionDateText.setEnabled(false);
			bindingCombo.setEnabled(false);
		}
		else if (reference != null) {
			valueSetRefLabel.setEnabled(true);
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionDateText.setEnabled(false);
			bindingCombo.setEnabled(false);
		}
		else {
			valueSetRefLabel.setEnabled(true);
			idText.setEnabled(true);
			nameText.setEnabled(true);
			versionDateText.setEnabled(true);
			bindingCombo.setEnabled(true);
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

	protected void updateViews() {
		// fire notification for any stereotype property changes to update views
		// this is a bogus notification of change to property name, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, property.getName()) {
			public Object getNotifier() {
				return property;
			}

			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		property.eNotify(notification);
	}
}
