/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for restoring defaults
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.ui.properties;

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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.ITermProfileConstants;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;
import org.openhealthtools.mdht.uml.term.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;

/**
 * The profile properties section for Value Set Code.
 */
public class ValueSetCodeSection extends ResettableModelerPropertySection {

	private EnumerationLiteral umlEnumerationLiteral;

	private Text conceptCodeText;
	private boolean conceptCodeModified = false;
	private Text conceptNameText;
	private boolean conceptNameModified = false;
	private Text usageNoteText;
	private boolean usageNoteModified = false;

	private CLabel codeSystemRefLabel;
	private Button codeSystemRefButton;
	private Button codeSystemRefDeleteButton;

	private Button addNewCodeButton;
	
    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (conceptNameText == event.getSource()) {
				conceptNameModified = true;
			}
			if (conceptCodeText == event.getSource()) {
				conceptCodeModified = true;
			}
			if (usageNoteText == event.getSource()) {
				usageNoteModified = true;
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
		if (!(conceptNameModified || conceptCodeModified || usageNoteModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumerationLiteral);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(umlEnumerationLiteral);
					
					if (valueSetCode == null) {
						return Status.CANCEL_STATUS;
					}
					else if (conceptNameModified) {
						conceptNameModified = false;
						this.setLabel("Set Concept Name");
						String value = conceptNameText.getText().trim();
						valueSetCode.setConceptName(value.length()>0 ? value : null);

					}
					else if (conceptCodeModified) {
						conceptCodeModified = false;
						this.setLabel("Set Concept Code");
						String value = conceptCodeText.getText().trim();
						// set the EnumerationLiteral name
						valueSetCode.getBase_EnumerationLiteral().setName(value.length()>0 ? value : null);
						
					}
					else if (usageNoteModified) {
						usageNoteModified = false;
						this.setLabel("Set Usage Note");
						String value = usageNoteText.getText().trim();
						valueSetCode.setUsageNote(value.length()>0 ? value : null);
						
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

	protected void resetFields() {

		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumerationLiteral);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(umlEnumerationLiteral);
			    	
					if (valueSetCode == null) {
						return Status.CANCEL_STATUS;
					}

					valueSetCode.eUnset(TermPackage.Literals.VALUE_SET_CODE__CONCEPT_NAME);
					valueSetCode.eUnset(TermPackage.Literals.VALUE_SET_CODE__CODE_SYSTEM);
					valueSetCode.eUnset(TermPackage.Literals.VALUE_SET_CODE__USAGE_NOTE);

					updateViews();
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

	private void addCodeSystemReference() {
		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(umlEnumerationLiteral.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		final Stereotype codeSystemVersionStereotype = (Stereotype)
			ctsProfile.getOwnedType(ITermProfileConstants.CODE_SYSTEM_VERSION);
		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				return (element instanceof Enumeration)
					&& element.isStereotypeApplied(codeSystemVersionStereotype);
			}
		};
		
		final Enumeration codeSystemEnum = (Enumeration) DialogLaunchUtil.chooseElement(
				filter,
				umlEnumerationLiteral.eResource().getResourceSet(), 
				getPart().getSite().getShell(), null,
				"Select a Code System");
		
		if (codeSystemEnum == null) {
			return;
		}
		final Stereotype codeSystemStereotype = TermProfileUtil.getAppliedStereotype(
				codeSystemEnum, ITermProfileConstants.CODE_SYSTEM_VERSION);
		if (codeSystemStereotype == null) {
			MessageDialog.openError(getPart().getSite().getShell(), 
					"Invalid Enumeration", "The selected Enumertion must be a <<CodeSystemVersion>>");
			return;
		}
		final CodeSystemVersion codeSystem = (CodeSystemVersion) codeSystemEnum.getStereotypeApplication(codeSystemStereotype);

		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumerationLiteral);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(umlEnumerationLiteral);
					if (valueSetCode == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set CodeSystem reference");
					valueSetCode.setCodeSystem(codeSystem);
					
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
				TransactionUtil.getEditingDomain(umlEnumerationLiteral);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(umlEnumerationLiteral);
					if (valueSetCode == null) {
						return Status.CANCEL_STATUS;
					}
					
					this.setLabel("Remove CodeSystem reference");
					valueSetCode.setCodeSystem(null);
					
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

	private void addNewCode() {
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumerationLiteral);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(umlEnumerationLiteral);
					if (valueSetCode == null) {
						return Status.CANCEL_STATUS;
					}
					
					this.setLabel("Add new code");
	            	EnumerationLiteral newCode = umlEnumerationLiteral.getEnumeration().createOwnedLiteral("NewCode");
	            	TermProfileUtil.applyStereotype(newCode, ITermProfileConstants.VALUE_SET_CODE);
	            	
	            	setInput(getPart(), new StructuredSelection(newCode));
					
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
				.createGroup(parent, "Value Set Code");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);

        int numberOfRows = 4;
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

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(codeSystemRefLabel, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

        data = new FormData();
        data.left = new FormAttachment(codeSystemRefDeleteButton, 0);
        data.right = new FormAttachment(restoreDefaultsButton, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(codeSystemRefButton, 0, SWT.CENTER);
        codeSystemRefLabel.setLayoutData(data);

		/* ------ Concept Code field ------ */
		conceptCodeText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel conceptCodeLabel = getWidgetFactory()
				.createCLabel(composite, "Concept Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(conceptCodeText, 0, SWT.CENTER);
		conceptCodeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(conceptCodeLabel, 0);
		data.right = new FormAttachment(40, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		conceptCodeText.setLayoutData(data);

		/* ------ Concept Name field ------ */
		conceptNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel conceptNameLabel = getWidgetFactory()
				.createCLabel(composite, "Concept Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(conceptCodeText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(conceptCodeText, 0, SWT.CENTER);
		conceptNameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(conceptNameLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		conceptNameText.setLayoutData(data);

		/* ------ Usage Note field ------ */
		usageNoteText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel usageNoteLabel = getWidgetFactory()
				.createCLabel(composite, "Usage Note:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(usageNoteText, 0, SWT.CENTER);
		usageNoteLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(usageNoteLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
		usageNoteText.setLayoutData(data);

		/* ------ Add Next Code button ------ */
        addNewCodeButton = getWidgetFactory().createButton(composite,
            "Add New Code", SWT.PUSH); //$NON-NLS-1$
        addNewCodeButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
            	addNewCode();
            }
        });

        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.height = buttonHeight;
		data.top = new FormAttachment(3,numberOfRows, ITabbedPropertyConstants.VSPACE);
		addNewCodeButton.setLayoutData(data);

	}
	
	protected boolean isReadOnly() {
		if (umlEnumerationLiteral != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(umlEnumerationLiteral);
			if (editingDomain != null && editingDomain.isReadOnly(umlEnumerationLiteral.eResource())) {
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
		Assert.isTrue(element instanceof EnumerationLiteral);
		this.umlEnumerationLiteral = (EnumerationLiteral) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
    	ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(umlEnumerationLiteral);
    	boolean isDefaultCodeSystem = false;
    	CodeSystemVersion codeSystemVersion = null;
    	if (valueSetCode != null) {
    		codeSystemVersion = valueSetCode.getCodeSystem();
    		if (codeSystemVersion == null) {
    			ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumerationLiteral.getEnumeration());
    			if (valueSetVersion != null) {
    				codeSystemVersion = valueSetVersion.getCodeSystem();
    				isDefaultCodeSystem = true;
    			}
    		}
    	}
		
		if (codeSystemVersion != null) {
			codeSystemRefLabel.setText((isDefaultCodeSystem ? "(default) " : "") + codeSystemVersion.getEnumerationQualifiedName());
			codeSystemRefLabel.layout();
		}
		else {
			codeSystemRefLabel.setText("");
		}

		conceptNameText.removeModifyListener(modifyListener);
		conceptNameText.removeKeyListener(keyListener);
		conceptNameText.removeFocusListener(focusListener);
		if (valueSetCode != null) {
			String conceptName = valueSetCode.getConceptName();
			conceptNameText.setText(conceptName!=null ? conceptName : "");
		}
		else {
			conceptNameText.setText("");
		}
		conceptNameText.addModifyListener(modifyListener);
		conceptNameText.addKeyListener(keyListener);
		conceptNameText.addFocusListener(focusListener);

		conceptCodeText.removeModifyListener(modifyListener);
		conceptCodeText.removeKeyListener(keyListener);
		conceptCodeText.removeFocusListener(focusListener);
		if (valueSetCode != null) {
			String conceptCode = valueSetCode.getBase_EnumerationLiteral().getName();
			conceptCodeText.setText(conceptCode!=null ? conceptCode : "");
		}
		else {
			conceptCodeText.setText("");
		}
		conceptCodeText.addModifyListener(modifyListener);
		conceptCodeText.addKeyListener(keyListener);
		conceptCodeText.addFocusListener(focusListener);

		usageNoteText.removeModifyListener(modifyListener);
		usageNoteText.removeKeyListener(keyListener);
		usageNoteText.removeFocusListener(focusListener);
		if (valueSetCode != null) {
			String usageNote = valueSetCode.getUsageNote();
			usageNoteText.setText(usageNote!=null ? usageNote : "");
		}
		else {
			usageNoteText.setText("");
		}
		usageNoteText.addModifyListener(modifyListener);
		usageNoteText.addKeyListener(keyListener);
		usageNoteText.addFocusListener(focusListener);

		if (isReadOnly()) {
			codeSystemRefLabel.setEnabled(false);
			conceptNameText.setEnabled(false);
			conceptCodeText.setEnabled(false);
			usageNoteText.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		}
		else {
			codeSystemRefLabel.setEnabled(true);
			conceptNameText.setEnabled(true);
			conceptCodeText.setEnabled(true);
			usageNoteText.setEnabled(true);
			restoreDefaultsButton.setEnabled(valueSetCode != null);
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
					if (!isDisposed() && umlEnumerationLiteral.eResource() != null)
						refresh();
				}
			});
		}
	}

	protected void updateViews() {
		// fire notification for any stereotype umlEnumeration changes to update views
		// this is a bogus notification of change to umlEnumeration name, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, umlEnumerationLiteral.getName()) {
			public Object getNotifier() {
				return umlEnumerationLiteral;
			}

			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		umlEnumerationLiteral.eNotify(notification);
	}
}
