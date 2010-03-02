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
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.common.ui.search.IElementFilter;
import org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind;
import org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType;
import org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion;
import org.openhealthtools.mdht.uml.cts.core.util.CTSProfileUtil;
import org.openhealthtools.mdht.uml.cts.core.util.ICTSProfileConstants;
import org.openhealthtools.mdht.uml.cts.ui.internal.Logger;

/**
 * The profile properties section for Value Set Version.
 */
public class ValueSetVersionSection extends AbstractModelerPropertySection {

	private Enumeration umlEnumeration;
	
	private Text idText;
	private boolean idModified = false;
	private Text nameText;
	private boolean nameModified = false;
	private Text versionText;
	private boolean versionModified = false;
	private CCombo typeCombo;
	private boolean typeModified = false;
	private CCombo bindingCombo;
	private boolean bindingModified = false;

	private CLabel codeSystemRefLabel;
	private Button codeSystemRefButton;
	private Button codeSystemRefDeleteButton;
	
    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (idText == event.getSource()) {
				idModified = true;
			}
			if (nameText == event.getSource()) {
				nameModified = true;
			}
			if (versionText == event.getSource()) {
				versionModified = true;
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
		if (!(idModified || nameModified || versionModified
				|| typeModified || bindingModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumeration);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile ctsProfile = CTSProfileUtil.getCTSProfile(umlEnumeration.eResource().getResourceSet());
					if (ctsProfile == null) {
						return Status.CANCEL_STATUS;
					}
					Enumeration bindingKind = (Enumeration)
						ctsProfile.getOwnedType(ICTSProfileConstants.BINDING_KIND);
					Enumeration valueSetType = (Enumeration)
					ctsProfile.getOwnedType(ICTSProfileConstants.VALUE_SET_TYPE);
					
					ValueSetVersion valueSetVersion = CTSProfileUtil.getValueSetVersion(umlEnumeration);
					
					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					}
					else if (idModified) {
						idModified = false;
						this.setLabel("Set Value Set ID");
						String value = idText.getText().trim();
						valueSetVersion.setIdentifier(value.length()>0 ? value : null);

					}
					else if (nameModified) {
						nameModified = false;
						this.setLabel("Set Value Set Full Name");
						String value = nameText.getText().trim();
						// set the Enumeration name
						valueSetVersion.getBase_Enumeration().setName(value.length()>0 ? value : null);
						
					}
					else if (versionModified) {
						versionModified = false;
						this.setLabel("Set Value Set Version");
						String value = versionText.getText().trim();
						valueSetVersion.setVersion(value.length()>0 ? value : null);
						
					}
					else if (typeModified && valueSetType != null) {
						typeModified = false;
						this.setLabel("Set Value Set Type");
							if (typeCombo.getSelectionIndex() == 0) {
								// remove stereotype umlEnumeration
								valueSetVersion.setType(null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) valueSetType.getOwnedLiterals()
									.get(typeCombo.getSelectionIndex());
								valueSetVersion.setType(ValueSetType.getByName(literal.getName()));
							}
					}
					else if (bindingModified && bindingKind != null) {
						bindingModified = false;
						this.setLabel("Set Binding");
							if (bindingCombo.getSelectionIndex() == 0) {
								// remove stereotype umlEnumeration
								valueSetVersion.setBinding(null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) bindingKind.getOwnedLiterals()
									.get(bindingCombo.getSelectionIndex());
								valueSetVersion.setBinding(BindingKind.getByName(literal.getName()));
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

	private void addCodeSystemReference() {
		Profile ctsProfile = CTSProfileUtil.getCTSProfile(umlEnumeration.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		final Stereotype codeSystemVersionStereotype = (Stereotype)
			ctsProfile.getOwnedType(ICTSProfileConstants.CODE_SYSTEM_VERSION);
		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				return (element instanceof Enumeration)
					&& element.isStereotypeApplied(codeSystemVersionStereotype);
			}
		};
		
		final Enumeration codeSystemEnum = (Enumeration) DialogLaunchUtil.chooseElement(
				filter,
				umlEnumeration.eResource().getResourceSet(), 
				getPart().getSite().getShell(), null,
				"Select a Code System");
		
		if (codeSystemEnum == null) {
			return;
		}
		final Stereotype codeSystemStereotype = CTSProfileUtil.getAppliedCTSStereotype(
				codeSystemEnum, ICTSProfileConstants.CODE_SYSTEM_VERSION);
		if (codeSystemStereotype == null) {
			MessageDialog.openError(getPart().getSite().getShell(), 
					"Invalid Enumeration", "The selected Enumertion must be a <<CodeSystemVersion>>");
			return;
		}
		final CodeSystemVersion codeSystem = (CodeSystemVersion) codeSystemEnum.getStereotypeApplication(codeSystemStereotype);

		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumeration);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	ValueSetVersion valueSetVersion = CTSProfileUtil.getValueSetVersion(umlEnumeration);
					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set CodeSystem reference");
					valueSetVersion.setCodeSystem(codeSystem);
					
					refresh();
					
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

	private void deleteCodeSystemReference() {
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumeration);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	ValueSetVersion valueSetVersion = CTSProfileUtil.getValueSetVersion(umlEnumeration);
					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					}
					
					this.setLabel("Remove CodeSystem reference");
					valueSetVersion.setCodeSystem(null);
					
					refresh();
					
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
				.createGroup(parent, "Value Set Version");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);

        int numberOfRows = 3;
		FormData data = null;

		/* ------ CodeSystem reference ------ */
		codeSystemRefLabel = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

        codeSystemRefButton = getWidgetFactory().createButton(composite,
            "Select Code System...", SWT.PUSH); //$NON-NLS-1$
        codeSystemRefButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
            	addCodeSystemReference();
            }
        });
        
        codeSystemRefDeleteButton = getWidgetFactory().createButton(composite,
                "X", SWT.PUSH); //$NON-NLS-1$
        codeSystemRefDeleteButton.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent event) {
                	deleteCodeSystemReference();
                }
            });

        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.height = buttonHeight;
		data.top = new FormAttachment(0,numberOfRows);
        codeSystemRefButton.setLayoutData(data);

        data = new FormData();
        data.left = new FormAttachment(codeSystemRefButton, 0);
        data.height = buttonHeight;
		data.top = new FormAttachment(codeSystemRefButton, 0, SWT.CENTER);
        codeSystemRefDeleteButton.setLayoutData(data);

        data = new FormData();
        data.left = new FormAttachment(codeSystemRefDeleteButton, 0);
        data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(codeSystemRefButton, 0, SWT.CENTER);
        codeSystemRefLabel.setLayoutData(data);

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
		data.right = new FormAttachment(50, 0);
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
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		idText.setLayoutData(data);

		/* ---- type combo ---- */
		typeCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		typeCombo.setItems(new String[] {
				"Extensional", 
				"Intensional"
		});
		typeCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				typeModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				typeModified = true;
				modifyFields();
			}
		});

		CLabel typeLabel = getWidgetFactory()
				.createCLabel(composite, "Type:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(typeCombo, 0, SWT.CENTER);
		typeLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(typeLabel, 0);
		data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
		typeCombo.setLayoutData(data);

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
		data.left = new FormAttachment(typeCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(bindingCombo, 0, SWT.CENTER);
		bindingLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(bindingLabel, 0);
		data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
		bindingCombo.setLayoutData(data);

		/* ------ Version field ------ */
		versionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory()
				.createCLabel(composite, "Version:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bindingCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(versionText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(70, 0);
		data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
		versionText.setLayoutData(data);

	}
	
	protected boolean isReadOnly() {
		if (umlEnumeration != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumeration);
			if (editingDomain != null && editingDomain.isReadOnly(umlEnumeration.eResource())) {
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
		Assert.isTrue(element instanceof Enumeration);
		this.umlEnumeration = (Enumeration) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
		Profile ctsProfile = CTSProfileUtil.getCTSProfile(umlEnumeration.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		Enumeration bindingKindEnum = (Enumeration)
			ctsProfile.getOwnedType(ICTSProfileConstants.BINDING_KIND);
		Enumeration valueSetTypeEnum = (Enumeration)
			ctsProfile.getOwnedType(ICTSProfileConstants.VALUE_SET_TYPE);

    	ValueSetVersion valueSetVersion = CTSProfileUtil.getValueSetVersion(umlEnumeration);
		
		CodeSystemVersion codeSystem = null;
		Enumeration codeSystemEnum = null;
		if (valueSetVersion != null && valueSetVersion.getCodeSystem() != null) {
			codeSystem = valueSetVersion.getCodeSystem();
			codeSystemEnum = (Enumeration) codeSystem.getBase_Enumeration();
			codeSystemRefLabel.setText(codeSystemEnum.getQualifiedName());
			codeSystemRefLabel.layout();
		}
		else {
			codeSystemRefLabel.setText("");
		}

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String id = valueSetVersion.getIdentifier();
			idText.setText(id!=null ? id : "");
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
		if (valueSetVersion != null) {
			String name = valueSetVersion.getBase_Enumeration().getName();
			nameText.setText(name!=null ? name : "");
		}
		else {
			nameText.setText("");
		}
		nameText.addModifyListener(modifyListener);
		nameText.addKeyListener(keyListener);
		nameText.addFocusListener(focusListener);

		versionText.removeModifyListener(modifyListener);
		versionText.removeKeyListener(keyListener);
		versionText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String version = valueSetVersion.getVersion();
			versionText.setText(version!=null ? version : "");
		}
		else {
			versionText.setText("");
		}
		versionText.addModifyListener(modifyListener);
		versionText.addKeyListener(keyListener);
		versionText.addFocusListener(focusListener);

		typeCombo.select(0);
		if (valueSetVersion != null) {
			ValueSetType valueSetType = valueSetVersion.getType();
			
			if (valueSetTypeEnum != null && valueSetType != null) {
				EnumerationLiteral literal = valueSetTypeEnum.getOwnedLiteral(valueSetType.getName());
				int index = valueSetTypeEnum.getOwnedLiterals().indexOf(literal);
				typeCombo.select(index);
			}
		}

		bindingCombo.select(0);
		if (valueSetVersion != null) {
			BindingKind binding = valueSetVersion.getBinding();
			
			if (bindingKindEnum != null && binding != null) {
				EnumerationLiteral literal = bindingKindEnum.getOwnedLiteral(binding.getName());
				int index = bindingKindEnum.getOwnedLiterals().indexOf(literal);
				bindingCombo.select(index);
			}
		}

		if (isReadOnly()) {
			codeSystemRefLabel.setEnabled(false);
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionText.setEnabled(false);
			typeCombo.setEnabled(false);
			bindingCombo.setEnabled(false);
		}
		else {
			codeSystemRefLabel.setEnabled(true);
			idText.setEnabled(true);
			nameText.setEnabled(true);
			versionText.setEnabled(true);
			typeCombo.setEnabled(true);
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
					if (!isDisposed() && umlEnumeration.eResource() != null)
						refresh();
				}
			});
		}
	}

	protected void updateViews() {
		// fire notification for any stereotype umlEnumeration changes to update views
		// this is a bogus notification of change to umlEnumeration name, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, umlEnumeration.getName()) {
			public Object getNotifier() {
				return umlEnumeration;
			}

			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		umlEnumeration.eNotify(notification);
	}
}
