/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for restoring defaults
 *     Christian W. Damus - implement handling of live validation roll-back (artf3318)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.ui.properties;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.search.IElementFilter;
import org.eclipse.mdht.uml.common.ui.util.UMLUIUtil;
import org.eclipse.mdht.uml.term.core.profile.BindingKind;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
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

/**
 * The profile properties section for Code System Constraint.
 */
public class CodeSystemConstraintSection extends ResettableModelerPropertySection {

	private Property property;

	private Text idText;

	private boolean idModified = false;

	private Text nameText;

	private boolean nameModified = false;

	private Text versionText;

	private boolean versionModified = false;

	private Text codeText;

	private boolean codeModified = false;

	private Text displayNameText;

	private boolean displayNameModified = false;

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
			if (codeText == event.getSource()) {
				codeModified = true;
			}
			if (displayNameText == event.getSource()) {
				displayNameModified = true;
			}
		}
	};

	private KeyListener keyListener = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			// do nothing
		}

		public void keyReleased(KeyEvent e) {
			if (SWT.CR == e.character || SWT.KEYPAD_CR == e.character) {
				modifyFields();
			}
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
		if (!(idModified || nameModified || versionModified || codeModified || displayNameModified ||
				bindingModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile ctsProfile = TermProfileUtil.getTerminologyProfile(property.eResource().getResourceSet());
					if (ctsProfile == null) {
						return Status.CANCEL_STATUS;
					}
					Enumeration bindingKind = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.BINDING_KIND);

					Stereotype stereotype = TermProfileUtil.getAppliedStereotype(
						property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					} else if (idModified) {
						idModified = false;
						this.setLabel("Set Code System ID");

						if (stereotype != null) {
							String value = idText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_ID, value.length() > 0
										? value
										: null);
						}
					} else if (nameModified) {
						nameModified = false;
						this.setLabel("Set Code System Name");

						if (stereotype != null) {
							String value = nameText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_NAME, value.length() > 0
										? value
										: null);
						}
					} else if (versionModified) {
						versionModified = false;
						this.setLabel("Set Code System Version");

						if (stereotype != null) {
							String value = versionText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_VERSION, value.length() > 0
										? value
										: null);
						}
					} else if (codeModified) {
						codeModified = false;
						this.setLabel("Set Code");

						if (stereotype != null) {
							String value = codeText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_CODE, value.length() > 0
										? value
										: null);
						}
					} else if (displayNameModified) {
						displayNameModified = false;
						this.setLabel("Set Code Display Name");

						if (stereotype != null) {
							String value = displayNameText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_DISPLAY_NAME,
								value.length() > 0
										? value
										: null);
						}
					} else if (bindingModified) {
						bindingModified = false;
						this.setLabel("Set Binding");
						if (stereotype != null && bindingKind != null) {
							if (bindingCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								property.setValue(
									stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_BINDING, null);
							} else {
								EnumerationLiteral literal = bindingKind.getOwnedLiterals().get(
									bindingCombo.getSelectionIndex());
								property.setValue(
									stereotype, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_BINDING, literal);
							}
						}
					} else {
						return Status.CANCEL_STATUS;
					}

					// fire notification for any stereotype property changes to update views
					updateViews();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	protected void resetFields() {

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);

					if (codeSystemConstraint == null) {
						return Status.CANCEL_STATUS;
					}

					codeSystemConstraint.eUnset(TermPackage.Literals.CODE_SYSTEM_CONSTRAINT__IDENTIFIER);
					codeSystemConstraint.eUnset(TermPackage.Literals.CODE_SYSTEM_CONSTRAINT__NAME);
					codeSystemConstraint.eUnset(TermPackage.Literals.CODE_SYSTEM_CONSTRAINT__VERSION);
					codeSystemConstraint.eUnset(TermPackage.Literals.CODE_SYSTEM_CONSTRAINT__CODE);
					codeSystemConstraint.eUnset(TermPackage.Literals.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME);
					codeSystemConstraint.eUnset(TermPackage.Literals.CODE_SYSTEM_CONSTRAINT__BINDING);

					updateViews();
					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void addCodeSystemReference() {

		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				if ((element instanceof Enumeration) &&
						TermProfileUtil.getCodeSystemVersion((Enumeration) element) != null) {
					return true;
				}
				return false;
			}
		};

		final Enumeration codeSystemEnum = (Enumeration) DialogLaunchUtil.chooseElement(
			filter, UMLUIUtil.loadModelsfromWorkspace(), getPart().getSite().getShell(), null, "Select a Code System");

		if (codeSystemEnum == null) {
			return;
		}
		final Stereotype codeSystemStereotype = TermProfileUtil.getAppliedStereotype(
			codeSystemEnum, ITermProfileConstants.CODE_SYSTEM_VERSION);
		if (codeSystemStereotype == null) {
			MessageDialog.openError(
				getPart().getSite().getShell(), "Invalid Enumeration",
				"The selected Enumertion must be a <<CodeSystemVersion>>");
			return;
		}
		final CodeSystemVersion codeSystem = (CodeSystemVersion) codeSystemEnum.getStereotypeApplication(
			codeSystemStereotype);

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
					if (codeSystemConstraint == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set CodeSystem reference");
					codeSystemConstraint.setReference(codeSystem);

					codeSystemConstraint.setIdentifier(null);
					codeSystemConstraint.setName(null);
					codeSystemConstraint.setVersion(null);

					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void deleteCodeSystemReference() {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
					if (codeSystemConstraint == null || codeSystemConstraint.getReference() == null) {
						return Status.CANCEL_STATUS;
					}

					this.setLabel("Remove CodeSystem reference");
					codeSystemConstraint.setReference(null);

					codeSystemConstraint.setIdentifier(null);
					codeSystemConstraint.setName(null);
					codeSystemConstraint.setVersion(null);

					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		gc.dispose();
		shell.dispose();

		Composite composite = getWidgetFactory().createGroup(parent, "Code System");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		int numberOfRows = 3;
		FormData data = null;

		/* ------ CodeSystem reference ------ */
		codeSystemRefLabel = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

		codeSystemRefButton = getWidgetFactory().createButton(composite, "Select Code System...", SWT.PUSH); //$NON-NLS-1$
		codeSystemRefButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				addCodeSystemReference();
			}
		});

		codeSystemRefDeleteButton = getWidgetFactory().createButton(composite, "X", SWT.PUSH); //$NON-NLS-1$
		codeSystemRefDeleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				deleteCodeSystemReference();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(0, numberOfRows);
		codeSystemRefButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeSystemRefButton, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(codeSystemRefButton, 0, SWT.CENTER);
		codeSystemRefDeleteButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeSystemRefDeleteButton, 0);
		data.top = new FormAttachment(codeSystemRefButton, 0, SWT.CENTER);
		codeSystemRefLabel.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(codeSystemRefLabel, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		/* ------ Name field ------ */
		nameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel nameLabel = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(nameLabel, 0);
		data.right = new FormAttachment(35, 0);
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE);
		nameText.setLayoutData(data);

		/* ------ ID field ------ */
		idText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel idLabel = getWidgetFactory().createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(nameText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(idText, 0, SWT.CENTER);
		idLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(idLabel, 0);
		data.right = new FormAttachment(70, 0);
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE);
		idText.setLayoutData(data);

		/* ------ Version field ------ */
		versionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory().createCLabel(composite, "Version:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(idText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(versionText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE);
		versionText.setLayoutData(data);

		/* ---- binding combo ---- */
		bindingCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		bindingCombo.setItems(new String[] { "Static", "Dynamic" });
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

		CLabel bindingLabel = getWidgetFactory().createCLabel(composite, "Binding:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(bindingCombo, 0, SWT.CENTER);
		bindingLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(bindingLabel, 0);
		data.top = new FormAttachment(2, numberOfRows, ITabbedPropertyConstants.VSPACE);
		bindingCombo.setLayoutData(data);

		/* ------ Code field ------ */
		codeText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel codeLabel = getWidgetFactory().createCLabel(composite, "Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bindingCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(codeText, 0, SWT.CENTER);
		codeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeLabel, 0);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(2, numberOfRows, ITabbedPropertyConstants.VSPACE);
		codeText.setLayoutData(data);

		/* ------ Code Display Name field ------ */
		displayNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel codeNameLabel = getWidgetFactory().createCLabel(composite, "Code Display Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(codeText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(displayNameText, 0, SWT.CENTER);
		codeNameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(codeNameLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(2, numberOfRows, ITabbedPropertyConstants.VSPACE);
		displayNameText.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (property != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);
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
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@Override
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof NamedElement);
		this.property = (Property) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(property.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		Enumeration bindingKind = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.BINDING_KIND);

		CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
		CodeSystemVersion codeSystem = null;
		Enumeration referenceEnum = null;
		if (codeSystemConstraint != null && codeSystemConstraint.getReference() != null) {
			codeSystem = codeSystemConstraint.getReference();
			referenceEnum = codeSystem.getBase_Enumeration();
			codeSystemRefLabel.setText(codeSystem.getEnumerationQualifiedName());
		} else {
			codeSystemRefLabel.setText("");
		}

		codeSystemRefLabel.layout();

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (codeSystemConstraint != null) {
			String id = codeSystem == null
					? codeSystemConstraint.getIdentifier()
					: codeSystem.getIdentifier();
			idText.setText(id != null
					? id
					: "");
		} else {
			idText.setText("");
		}
		idText.addModifyListener(modifyListener);
		idText.addKeyListener(keyListener);
		idText.addFocusListener(focusListener);

		nameText.removeModifyListener(modifyListener);
		nameText.removeKeyListener(keyListener);
		nameText.removeFocusListener(focusListener);
		if (codeSystemConstraint != null) {
			String name = codeSystem == null
					? codeSystemConstraint.getName()
					: codeSystem.getEnumerationName();
			nameText.setText(name != null
					? name
					: "");
		} else {
			nameText.setText("");
		}
		nameText.addModifyListener(modifyListener);
		nameText.addKeyListener(keyListener);
		nameText.addFocusListener(focusListener);

		versionText.removeModifyListener(modifyListener);
		versionText.removeKeyListener(keyListener);
		versionText.removeFocusListener(focusListener);
		if (codeSystemConstraint != null) {
			String version = codeSystem == null
					? codeSystemConstraint.getVersion()
					: codeSystem.getVersion();
			versionText.setText(version != null
					? version
					: "");
		} else {
			versionText.setText("");
		}
		versionText.addModifyListener(modifyListener);
		versionText.addKeyListener(keyListener);
		versionText.addFocusListener(focusListener);

		codeText.removeModifyListener(modifyListener);
		codeText.removeKeyListener(keyListener);
		codeText.removeFocusListener(focusListener);
		if (codeSystemConstraint != null) {
			String code = codeSystemConstraint.getCode();
			codeText.setText(code != null
					? code
					: "");
		} else {
			codeText.setText("");
		}
		codeText.addModifyListener(modifyListener);
		codeText.addKeyListener(keyListener);
		codeText.addFocusListener(focusListener);

		displayNameText.removeModifyListener(modifyListener);
		displayNameText.removeKeyListener(keyListener);
		displayNameText.removeFocusListener(focusListener);
		if (codeSystemConstraint != null) {
			String displayName = codeSystemConstraint.getDisplayName();
			displayNameText.setText(displayName != null
					? displayName
					: "");
		} else {
			displayNameText.setText("");
		}
		displayNameText.addModifyListener(modifyListener);
		displayNameText.addKeyListener(keyListener);
		displayNameText.addFocusListener(focusListener);

		bindingCombo.select(0);
		if (codeSystemConstraint != null) {
			BindingKind binding = codeSystemConstraint.getBinding();

			if (bindingKind != null && binding != null) {
				EnumerationLiteral literal = bindingKind.getOwnedLiteral(binding.getName());
				int index = bindingKind.getOwnedLiterals().indexOf(literal);
				bindingCombo.select(index);
			}
		}

		if (isReadOnly()) {
			codeSystemRefLabel.setEnabled(false);
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionText.setEnabled(false);
			codeText.setEnabled(false);
			displayNameText.setEnabled(false);
			bindingCombo.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			codeSystemRefLabel.setEnabled(true);
			idText.setEnabled(referenceEnum == null);
			nameText.setEnabled(referenceEnum == null);
			versionText.setEnabled(referenceEnum == null);
			codeText.setEnabled(true);
			displayNameText.setEnabled(true);
			bindingCombo.setEnabled(true);
			restoreDefaultsButton.setEnabled(codeSystemConstraint != null);
		}

	}

	/**
	 * Update if nessesary, upon receiving the model event.
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            -
	 *            even notification
	 * @param element
	 *            -
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && property.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

	protected void updateViews() {
		Notification notification = new NotificationImpl(Notification.SET, null, property.getName()) {
			@Override
			public Object getNotifier() {
				return property;
			}

			@Override
			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		property.eNotify(notification);
	}
}
