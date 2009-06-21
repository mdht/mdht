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
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
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
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.ui.internal.l10n.Messages;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * The profile properties section for Code System Constraint.
 * 
 * $Id: $
 */
public class ValueSetConstraintSection extends AbstractConstraintSection {

	private Text idText;
	private boolean idModified = false;
	private Text nameText;
	private boolean nameModified = false;
	private Text versionDateText;
	private boolean versionDateModified = false;
	private CCombo codingStrengthCombo;
	private boolean codingStrengthModified = false;
	private CCombo revisionFrequencyCombo;
	private boolean revisionFrequencyModified = false;
	private Text codeText;
	private boolean codeModified = false;

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
				|| codingStrengthModified || revisionFrequencyModified
				|| codeModified)) {
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(property);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile hdfProfile = HL7ResourceUtil.applyHDFProfile(UMLUtil.getTopPackage(property));
					Enumeration codingStrengthKind = (Enumeration)
						hdfProfile.getOwnedType(IHDFProfileConstants.CODING_STRENGTH_KIND);
					Enumeration revisionFrequencyKind = (Enumeration)
						hdfProfile.getOwnedType(IHDFProfileConstants.REVISION_FREQUENCY_KIND);
					
					Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
							property, IHDFProfileConstants.VALUE_SET_CONSTRAINT);
					
					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					else if (idModified) {
						idModified = false;
						this.setLabel("Set Value Set ID");

						if (stereotype != null) {
							String value = idText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.VALUE_SET_OID,
									value.length()>0 ? value : null);

						}
					}
					else if (nameModified) {
						nameModified = false;
						this.setLabel("Set Value Set Name");

						if (stereotype != null) {
							String value = nameText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.VALUE_SET_NAME,
									value.length()>0 ? value : null);

						}
					}
					else if (versionDateModified) {
						versionDateModified = false;
						this.setLabel("Set Value Set Version");

						if (stereotype != null) {
							String value = versionDateText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.VALUE_SET_VERSION_DATE,
									value.length()>0 ? value : null);

						}
					}
					else if (codingStrengthModified) {
						codingStrengthModified = false;
						this.setLabel("Set Coding Strength");
						if (stereotype != null && codingStrengthKind != null) {
							if (codingStrengthCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								property.setValue(stereotype, IHDFProfileConstants.VALUE_SET_CODING_STRENGTH, null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) codingStrengthKind.getOwnedLiterals()
									.get(codingStrengthCombo.getSelectionIndex());
								property.setValue(stereotype, IHDFProfileConstants.VALUE_SET_CODING_STRENGTH, literal);
							}
						}
					}
					else if (revisionFrequencyModified) {
						revisionFrequencyModified = false;
						this.setLabel("Set Revision Frequency");
						if (stereotype != null && revisionFrequencyKind != null) {
							if (revisionFrequencyCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								property.setValue(stereotype, IHDFProfileConstants.VALUE_SET_REVISION_FREQUENCY, null);
							}
							else {
								EnumerationLiteral literal = (EnumerationLiteral) revisionFrequencyKind.getOwnedLiterals()
									.get(revisionFrequencyCombo.getSelectionIndex());
								property.setValue(stereotype, IHDFProfileConstants.VALUE_SET_REVISION_FREQUENCY, literal);
							}
						}
					}
					else if (codeModified) {
						codeModified = false;
						this.setLabel("Set Root Code");

						if (stereotype != null) {
							String value = codeText.getText().trim();
							property.setValue(stereotype, 
									IHDFProfileConstants.VALUE_SET_ROOT_CODE,
									value.length()>0 ? value : null);

						}
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
				.createGroup(parent, "Value Set");
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

		/* ------ Root Code field ------ */
		codeText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel codeLabel = getWidgetFactory()
				.createCLabel(composite, "Root Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(codeText, 0, SWT.CENTER);
		codeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeLabel, 0);
		data.right = new FormAttachment(30, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		codeText.setLayoutData(data);

		/* ---- coding strength combo ---- */
		codingStrengthCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		codingStrengthCombo.setItems(new String[] {
				"",
				Messages.VocabularyCodingStrength_CNE_label,
				Messages.VocabularyCodingStrength_CWE_label
		});
		codingStrengthCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				codingStrengthModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				codingStrengthModified = true;
				modifyFields();
			}
		});

		CLabel vocabCodingStrengthLabel = getWidgetFactory()
				.createCLabel(composite, "Coding Strength:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(codeText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(codingStrengthCombo, 0, SWT.CENTER);
		vocabCodingStrengthLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(vocabCodingStrengthLabel, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		codingStrengthCombo.setLayoutData(data);

		/* ---- revision frequency combo ---- */
		revisionFrequencyCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		revisionFrequencyCombo.setItems(new String[] {
				"",
				Messages.RevisionFrequency_Edition_label,
				Messages.RevisionFrequency_CodeSystem_label
		});
		revisionFrequencyCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				revisionFrequencyModified = true;
				modifyFields();
			}
			public void widgetSelected(SelectionEvent e) {
				revisionFrequencyModified = true;
				modifyFields();
			}
		});

		CLabel revisionFrequencyLabel = getWidgetFactory()
				.createCLabel(composite, "Revision Frequency:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(codingStrengthCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(revisionFrequencyCombo, 0, SWT.CENTER);
		revisionFrequencyLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(revisionFrequencyLabel, 0);
		data.top = new FormAttachment(1,numberOfRows, ITabbedPropertyConstants.VSPACE);
		revisionFrequencyCombo.setLayoutData(data);
		
		if (hasVocabularyExtension()) {
			vocabularyBrowseButton = getWidgetFactory().createButton(composite, "Browse...", SWT.PUSH); //$NON-NLS-1$
			
			vocabularyBrowseButton.addSelectionListener(new SelectionAdapter() {
				
				public void widgetSelected(SelectionEvent event) {
					IVocabularySelectionDelegate.IValueSetConstraint valueSetConstraint = (IVocabularySelectionDelegate.IValueSetConstraint) browseVocabulary(IVocabularySelectionDelegate.Constraint.VALUESSETS);

					if (valueSetConstraint!= null) {
						HDFUIUtil.setStereoPropertyValue(property, 
														IHDFProfileConstants.VALUE_SET_CONSTRAINT, 
														new String[] { 	IHDFProfileConstants.VALUE_SET_NAME,
																		IHDFProfileConstants.VALUE_SET_OID,
																		IHDFProfileConstants.VALUE_SET_VERSION_DATE}, 
														new Object[] {	valueSetConstraint.getName(),
																		valueSetConstraint.getID(),
																		valueSetConstraint.getVersionDate()}, 
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
		Profile hdfProfile = HL7ResourceUtil.applyHDFProfile(UMLUtil.getTopPackage(property));
		Enumeration codingStrengthKind = (Enumeration)
			hdfProfile.getOwnedType(IHDFProfileConstants.CODING_STRENGTH_KIND);
		Enumeration revisionFrequencyKind = (Enumeration)
		hdfProfile.getOwnedType(IHDFProfileConstants.REVISION_FREQUENCY_KIND);
		
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.VALUE_SET_CONSTRAINT);

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.VALUE_SET_OID);
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
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.VALUE_SET_NAME);
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
			String name = (String) property.getValue(stereotype, IHDFProfileConstants.VALUE_SET_VERSION_DATE);
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
			String rootCode = (String) property.getValue(stereotype, IHDFProfileConstants.VALUE_SET_ROOT_CODE);
			codeText.setText(rootCode!=null ? rootCode : "");
		}
		else {
			codeText.setText("");
		}
		codeText.addModifyListener(modifyListener);
		codeText.addKeyListener(keyListener);
		codeText.addFocusListener(focusListener);

		codingStrengthCombo.select(0);
		if (stereotype != null && property.hasValue(
				stereotype, IHDFProfileConstants.VALUE_SET_CODING_STRENGTH)) {
			EnumerationLiteral literal = (EnumerationLiteral) property.getValue(
					stereotype, IHDFProfileConstants.VALUE_SET_CODING_STRENGTH);
			if (codingStrengthKind != null && literal != null) {
				int index = codingStrengthKind.getOwnedLiterals().indexOf(literal);
				codingStrengthCombo.select(index);
			}
		}

		revisionFrequencyCombo.select(0);
		if (stereotype != null && property.hasValue(
				stereotype, IHDFProfileConstants.VALUE_SET_REVISION_FREQUENCY)) {
			EnumerationLiteral literal = (EnumerationLiteral) property.getValue(
					stereotype, IHDFProfileConstants.VALUE_SET_REVISION_FREQUENCY);
			if (revisionFrequencyKind != null && literal != null) {
				int index = revisionFrequencyKind.getOwnedLiterals().indexOf(literal);
				revisionFrequencyCombo.select(index);
			}
		}

		if (isReadOnly()) {
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionDateText.setEnabled(false);
			codingStrengthCombo.setEnabled(false);
			revisionFrequencyCombo.setEnabled(false);
		}
		else {
			idText.setEnabled(true);
			nameText.setEnabled(true);
			versionDateText.setEnabled(true);
			codingStrengthCombo.setEnabled(true);
			revisionFrequencyCombo.setEnabled(true);
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
