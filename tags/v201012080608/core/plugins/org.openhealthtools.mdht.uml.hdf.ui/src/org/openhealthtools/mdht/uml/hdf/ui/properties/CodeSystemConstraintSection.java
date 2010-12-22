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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ISelection;
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
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * The profile properties section for Code System Constraint.
 * 
 * $Id: $
 */
public class CodeSystemConstraintSection extends AbstractConstraintSection {

	private Text idText;
	private boolean idModified = false;
	private Text nameText;
	private boolean nameModified = false;
	private Text versionDateText;
	private boolean versionDateModified = false;
	private Text codeText;
	private boolean codeModified = false;
	private Text codePrintNameText;
	private boolean codePrintNameModified = false;

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
			if (codeText == event.getSource()) {
				codeModified = true;
			}
			if (codePrintNameText == event.getSource()) {
				codePrintNameModified = true;
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
				|| codeModified || codePrintNameModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
							property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					else if (idModified) {
						idModified = false;
						this.setLabel("Set Code System ID");

						if (stereotype != null) {
							String value = idText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.CODE_SYSTEM_OID,
									value.length()>0 ? value : null);
						}
					}
					else if (nameModified) {
						nameModified = false;
						this.setLabel("Set Code System Name");

						if (stereotype != null) {
							String value = nameText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.CODE_SYSTEM_NAME,
									value.length()>0 ? value : null);
						}
					}
					else if (versionDateModified) {
						versionDateModified = false;
						this.setLabel("Set Code System Version");

						if (stereotype != null) {
							String value = versionDateText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.CODE_SYSTEM_VERSION,
									value.length()>0 ? value : null);
						}
					}
					else if (codeModified) {
						codeModified = false;
						this.setLabel("Set Code");

						if (stereotype != null) {
							String value = codeText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.CODE,
									value.length()>0 ? value : null);
						}
					}
					else if (codePrintNameModified) {
						codePrintNameModified = false;
						this.setLabel("Set Code Print Name");

						if (stereotype != null) {
							String value = codePrintNameText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.CODE_PRINT_NAME,
									value.length()>0 ? value : null);
						}
					}
					else {
						return Status.CANCEL_STATUS;
					}

					// fire notification for any stereotype property changes to update views
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

	public void createControls(final Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		
		Composite composite = getWidgetFactory()
				.createGroup(parent, "Code System");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);

        int numberOfRows = hasVocabularyExtension() ? 3 : 2;
		FormData data = null;

		/* ------ ID field ------ */
		idText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel idLabel = getWidgetFactory()
				.createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(idText, 0, SWT.CENTER);
		idLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(idLabel, 0);
		data.right = new FormAttachment(30, 0);
		data.top = new FormAttachment(0,numberOfRows, ITabbedPropertyConstants.VSPACE);
		idText.setLayoutData(data);

		/* ------ Name field ------ */
		nameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel nameLabel = getWidgetFactory()
				.createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(idText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(nameLabel, 0);
		data.right = new FormAttachment(60, 0);
		data.top = new FormAttachment(0,numberOfRows, ITabbedPropertyConstants.VSPACE);
		nameText.setLayoutData(data);

		/* ------ Version Date field ------ */
		versionDateText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory()
				.createCLabel(composite, "Version Date:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(nameText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(versionDateText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0,numberOfRows, ITabbedPropertyConstants.VSPACE);
		versionDateText.setLayoutData(data);

		/* ------ Code field ------ */
		codeText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel codeLabel = getWidgetFactory()
				.createCLabel(composite, "Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(codeText, 0, SWT.CENTER);
		codeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeLabel, 0);
		data.right = new FormAttachment(30, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		codeText.setLayoutData(data);

		/* ------ Code Print Name field ------ */
		codePrintNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel codeNameLabel = getWidgetFactory()
				.createCLabel(composite, "Code Print Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(codeText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(codePrintNameText, 0, SWT.CENTER);
		codeNameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeNameLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		codePrintNameText.setLayoutData(data);
		
		if (hasVocabularyExtension()) {
			vocabularyBrowseButton = getWidgetFactory().createButton(composite, "Browse...", SWT.PUSH); //$NON-NLS-1$
			
			vocabularyBrowseButton.addSelectionListener(new SelectionAdapter() {
				
				public void widgetSelected(SelectionEvent event) {
					IVocabularySelectionDelegate.ICodeSystemConstraint codeSystemConstraint = (IVocabularySelectionDelegate.ICodeSystemConstraint) browseVocabulary(IVocabularySelectionDelegate.Constraint.CODESYSTEMS);

					if (codeSystemConstraint != null) {
						HDFUIUtil.setStereoPropertyValue(property, 
													IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT, 
													new String[] {
														IHDFProfileConstants.CODE_SYSTEM_OID, 
														IHDFProfileConstants.CODE_SYSTEM_NAME,
														IHDFProfileConstants.CODE_SYSTEM_VERSION, 
														IHDFProfileConstants.CODE, 
														IHDFProfileConstants.CODE_PRINT_NAME}, 												
													new Object[] { 
														codeSystemConstraint.getSystemOid(),
														codeSystemConstraint.getSystemName(),
														codeSystemConstraint.getSystemVersion(),
														codeSystemConstraint.getCode(),
														codeSystemConstraint.getCodePrintName()},
													getPart());
					}
				}
			});

			data = new FormData();
			data.top = new FormAttachment(2,numberOfRows, ITabbedPropertyConstants.VSPACE);
			data.left = new FormAttachment(0, 0);
			data.height = getButtonHeight();
			vocabularyBrowseButton.setLayoutData(data);
		} 
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
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.CODE_SYSTEM_OID);
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
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.CODE_SYSTEM_NAME);
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
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.CODE_SYSTEM_VERSION);
			versionDateText.setText(name!=null ? name : "");
		}
		else {
			versionDateText.setText("");
		}
		versionDateText.addModifyListener(modifyListener);
		versionDateText.addKeyListener(keyListener);
		versionDateText.addFocusListener(focusListener);

		codeText.removeModifyListener(modifyListener);
		codeText.removeKeyListener(keyListener);
		codeText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.CODE);
			codeText.setText(name!=null ? name : "");
		}
		else {
			codeText.setText("");
		}
		codeText.addModifyListener(modifyListener);
		codeText.addKeyListener(keyListener);
		codeText.addFocusListener(focusListener);

		codePrintNameText.removeModifyListener(modifyListener);
		codePrintNameText.removeKeyListener(keyListener);
		codePrintNameText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.CODE_PRINT_NAME);
			codePrintNameText.setText(name!=null ? name : "");
		}
		else {
			codePrintNameText.setText("");
		}
		codePrintNameText.addModifyListener(modifyListener);
		codePrintNameText.addKeyListener(keyListener);
		codePrintNameText.addFocusListener(focusListener);

		if (isReadOnly()) {
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionDateText.setEnabled(false);
			codeText.setEnabled(false);
			codePrintNameText.setEnabled(false);
		}
		else {
			idText.setEnabled(true);
			nameText.setEnabled(true);
			versionDateText.setEnabled(true);
			codeText.setEnabled(true);
			codePrintNameText.setEnabled(true);
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
