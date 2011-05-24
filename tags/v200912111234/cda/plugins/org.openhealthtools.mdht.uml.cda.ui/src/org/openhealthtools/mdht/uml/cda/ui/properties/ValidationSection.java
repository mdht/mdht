/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ui.properties;


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
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.filters.CodedAttributeFilter;
import org.openhealthtools.mdht.uml.cda.ui.filters.TextAttributeFilter;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;

/**
 * The profile properties section for CDA Validation.
 */
public class ValidationSection extends AbstractModelerPropertySection {

	private NamedElement namedElement;

	private CCombo severityCombo;
	private boolean severityModified = false;
	private Text messageText;
	private boolean messageModified = false;

    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (messageText == event.getSource()) {
				messageModified = true;
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
		if (!(messageModified || severityModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(namedElement);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
							namedElement, ICDAProfileConstants.VALIDATION);

					Enumeration severityKind = null;
					Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
					if (cdaProfile != null) {
						severityKind = (Enumeration)
								cdaProfile.getOwnedType(ICDAProfileConstants.SEVERITY_KIND);
					}
					
					if (stereotype == null) {
						stereotype = applyValidationStereotype(namedElement);
					}
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					
					if (severityModified) {
						severityModified = false;
						this.setLabel("Set Validation Severity");
						if (severityKind != null) {
							if (severityCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								namedElement.setValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY, null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) severityKind.getOwnedLiterals()
									.get(severityCombo.getSelectionIndex() - 1);
								namedElement.setValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY, literal);
							}
						}
					}
					else if (messageModified) {
						messageModified = false;
						this.setLabel("Set Validation Message");

						String value = messageText.getText().trim();
						namedElement.setValue(stereotype, 
								ICDAProfileConstants.VALIDATION_MESSAGE,
								value.length()>0 ? value : null);
					}
					else {
						return Status.CANCEL_STATUS;
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
	
	private Stereotype applyValidationStereotype(Element element) {
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(element.eResource().getResourceSet());
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				element, ICDAProfileConstants.VALIDATION);
		
		if (stereotype == null && cdaProfile != null) {
			if (element instanceof Association) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.ASSOCIATION_VALIDATION);
			}
			else if (element instanceof Class) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.CLASS_VALIDATION);
			}
			else if (element instanceof Constraint) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.CONSTRAINT_VALIDATION);
			}
			else if (element instanceof Property) {
				if (new CodedAttributeFilter().select(element))
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.VOCAB_SPECIFICATION);
				else if (new TextAttributeFilter().select(element))
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.TEXT_VALUE);
				else
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.PROPERTY_VALIDATION);
			}
		}
		
		return stereotype;
	}

	public void createControls(final Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		
		Composite composite = getWidgetFactory()
				.createGroup(parent, "Validation");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);
		
		FormData data = null;

		/* ---- severity combo ---- */
		severityCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		severityCombo.setItems(new String[] {
				"",
				"Error",
				"Warning",
				"Info"
		});
		severityCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				severityModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				severityModified = true;
				modifyFields();
			}
		});

		CLabel severityLabel = getWidgetFactory()
				.createCLabel(composite, "Severity:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(severityCombo, 0, SWT.CENTER);
		severityLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(severityLabel, 0);
		data.top = new FormAttachment(0,2);
		severityCombo.setLayoutData(data);

		/* ---- message text ---- */
		messageText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel messageLabel = getWidgetFactory()
				.createCLabel(composite, "Message:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(messageText, 0, SWT.CENTER);
		messageLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(messageLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1,2, ITabbedPropertyConstants.VSPACE);
		messageText.setLayoutData(data);

	}

	protected boolean isReadOnly() {
		if (namedElement != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(namedElement);
			if (editingDomain != null && editingDomain.isReadOnly(namedElement.eResource())) {
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
		this.namedElement = (NamedElement) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				namedElement, ICDAProfileConstants.VALIDATION);

		Enumeration severityKind = null;
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(namedElement.eResource().getResourceSet());
		if (cdaProfile != null) {
			severityKind = (Enumeration)
					cdaProfile.getOwnedType(ICDAProfileConstants.SEVERITY_KIND);
		}
		
		messageText.removeModifyListener(modifyListener);
		messageText.removeKeyListener(keyListener);
		messageText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String message = (String) namedElement.getValue(stereotype, ICDAProfileConstants.VALIDATION_MESSAGE);
			messageText.setText(message!=null ? message : "");
		}
		else {
			messageText.setText("");
		}
		messageText.addModifyListener(modifyListener);
		messageText.addKeyListener(keyListener);
		messageText.addFocusListener(focusListener);

		severityCombo.select(0);
		if (stereotype != null) {
			EnumerationLiteral literal = (EnumerationLiteral) namedElement.getValue(
					stereotype, ICDAProfileConstants.VALIDATION_SEVERITY);
			if (severityKind != null && literal != null) {
				int index = severityKind.getOwnedLiterals().indexOf(literal);
				severityCombo.select(index + 1);
			}
		}

		if (isReadOnly()) {
			severityCombo.setEnabled(false);
			messageText.setEnabled(false);
		}
		else {
			severityCombo.setEnabled(true);
			messageText.setEnabled(true);
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
					if (!isDisposed() && namedElement.eResource() != null)
						refresh();
				}
			});
		}
	}

}