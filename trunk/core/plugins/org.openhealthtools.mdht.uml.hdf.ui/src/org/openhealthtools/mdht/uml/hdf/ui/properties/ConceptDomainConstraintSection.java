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
 * The profile properties section for Concept Domain Constraint.
 * 
 * $Id: $
 */
public class ConceptDomainConstraintSection extends AbstractConstraintSection {


	private Text conceptDomainNameText;
	private boolean conceptDomainNameModified = false;

    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (conceptDomainNameText == event.getSource()) {
				conceptDomainNameModified = true;
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
		if (!(conceptDomainNameModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
							property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					if (conceptDomainNameModified) {
						conceptDomainNameModified = false;
						this.setLabel("Set Concept Domain Name");

						if (stereotype != null) {
							String value = conceptDomainNameText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.CONCEPT_DOMAIN_NAME,
									value.length()>0 ? value : null);
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

	public void createControls(final Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory()
				.createGroup(parent, "Concept Domain");
        FormLayout layout = new FormLayout();
        layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
        layout.marginHeight = ITabbedPropertyConstants.VSPACE;
        layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
        composite.setLayout(layout);
		
		FormData data = null;

		conceptDomainNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel nameLabel = getWidgetFactory()
				.createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(conceptDomainNameText, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);
		
		data = new FormData();
		data.left = new FormAttachment(nameLabel, 0);
		data.width = 200;
		data.top = new FormAttachment(0,2, ITabbedPropertyConstants.VSPACE);
		conceptDomainNameText.setLayoutData(data);
		
		if (hasVocabularyExtension()) {
			vocabularyBrowseButton = getWidgetFactory().createButton(composite, "Browse...", SWT.PUSH); //$NON-NLS-1$
			
			vocabularyBrowseButton.addSelectionListener(new SelectionAdapter() {
				
				public void widgetSelected(SelectionEvent event) {
					IVocabularySelectionDelegate.IConceptConstraint conceptConstraint = (IVocabularySelectionDelegate.IConceptConstraint) browseVocabulary(IVocabularySelectionDelegate.Constraint.CONCEPTS);

					if (conceptConstraint != null) {
						HDFUIUtil.setStereoPropertyValue(property, 
														IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT, 
														new String[] { IHDFProfileConstants.CONCEPT_DOMAIN_NAME }, 
														new Object[] {conceptConstraint.getConcept()}, 
														getPart());
					}
				}
			});

			data = new FormData();
			data.left = new FormAttachment(conceptDomainNameText, 0);
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
				property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);

		conceptDomainNameText.removeModifyListener(modifyListener);
		conceptDomainNameText.removeKeyListener(keyListener);
		conceptDomainNameText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.CONCEPT_DOMAIN_NAME);
			conceptDomainNameText.setText(name!=null ? name : "");
		}
		else {
			conceptDomainNameText.setText("");
		}
		conceptDomainNameText.addModifyListener(modifyListener);
		conceptDomainNameText.addKeyListener(keyListener);
		conceptDomainNameText.addFocusListener(focusListener);

		if (isReadOnly()) {
			conceptDomainNameText.setEnabled(false);
		}
		else {
			conceptDomainNameText.setEnabled(true);
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
	
	
//	private void openElementSelectionDialog() {
//
//		try {
//
//			IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IVocabularySelectionDelegate.EXTENSION_POINT);
//
//			for (final IConfigurationElement configrationElement : config) {
//
//				final Object vocabularyDelegateTarget = configrationElement.createExecutableExtension(IVocabularySelectionDelegate.SELECTION_DELEGATE);
//
//				IVocabularySelectionDelegate vocabularySelectionDelegate = (IVocabularySelectionDelegate) vocabularyDelegateTarget;
//
//				final IVocabularySelectionDelegate.IConceptConstraint conceptConstraint = (IVocabularySelectionDelegate.IConceptConstraint) vocabularySelectionDelegate.chooseVocabularyConstraint(getPart().getSite().getShell(), null,
//						IVocabularySelectionDelegate.Constraint.CONCEPTS);
//
//				if (conceptConstraint != null) {
//					HDFUIUtil.setStereoPropertyValue(property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT, IHDFProfileConstants.CONCEPT_DOMAIN_NAME, conceptConstraint.getConcept(), getPart());
//				}
//
//			}
//
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}