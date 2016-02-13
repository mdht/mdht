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
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.ValueSetType;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
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
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The profile properties section for Value Set Version.
 */
public class ValueSetVersionSection extends ResettableModelerPropertySection {

	private Enumeration umlEnumeration;

	private Text idText;

	private boolean idModified = false;

	private Text nameText;

	private boolean nameModified = false;

	private Text fullNameText;

	private boolean fullNameModified = false;

	private Text versionText;

	private boolean versionModified = false;

	private Text sourceText;

	private boolean sourceModified = false;

	private Text urlText;

	private boolean urlModified = false;

	private CCombo typeCombo;

	private boolean typeModified = false;

	private CCombo bindingCombo;

	private boolean bindingModified = false;

	private Text effectiveDateText;

	private boolean effectiveDateModified = false;

	private Text releaseDateText;

	private boolean releaseDateModified = false;

	private Text definitionText;

	private boolean definitionModified = false;

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
			if (fullNameText == event.getSource()) {
				fullNameModified = true;
			}
			if (sourceText == event.getSource()) {
				sourceModified = true;
			}
			if (urlText == event.getSource()) {
				urlModified = true;
			}
			if (effectiveDateText == event.getSource()) {
				effectiveDateModified = true;
			}
			if (releaseDateText == event.getSource()) {
				releaseDateModified = true;
			}
			if (definitionText == event.getSource()) {
				definitionModified = true;
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
		if (!(idModified || nameModified || versionModified || fullNameModified || sourceModified || urlModified ||
				effectiveDateModified || releaseDateModified || typeModified || bindingModified ||
				definitionModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile ctsProfile = TermProfileUtil.getTerminologyProfile(
						umlEnumeration.eResource().getResourceSet());
					if (ctsProfile == null) {
						return Status.CANCEL_STATUS;
					}
					Enumeration bindingKind = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.BINDING_KIND);
					Enumeration valueSetType = (Enumeration) ctsProfile.getOwnedType(
						ITermProfileConstants.VALUE_SET_TYPE);

					ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);

					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					} else if (idModified) {
						idModified = false;
						this.setLabel("Set ValueSet ID");
						String value = idText.getText().trim();
						valueSetVersion.setIdentifier(value.length() > 0
								? value
								: null);

					} else if (nameModified) {
						nameModified = false;
						this.setLabel("Set ValueSet Name");
						String value = nameText.getText().trim();
						// set the Enumeration name
						valueSetVersion.setEnumerationName(value.length() > 0
								? value
								: null);

					} else if (fullNameModified) {
						fullNameModified = false;
						this.setLabel("Set ValueSet Full Name");
						String value = fullNameText.getText().trim();
						valueSetVersion.setFullName(value.length() > 0
								? value
								: null);

					} else if (versionModified) {
						versionModified = false;
						this.setLabel("Set Value Set Version");
						String value = versionText.getText().trim();
						valueSetVersion.setVersion(value.length() > 0
								? value
								: null);

					} else if (sourceModified) {
						sourceModified = false;
						this.setLabel("Set ValueSet Source");
						String value = sourceText.getText().trim();
						valueSetVersion.setSource(value.length() > 0
								? value
								: null);

					} else if (urlModified) {
						urlModified = false;
						this.setLabel("Set ValueSet URL");
						String value = urlText.getText().trim();
						valueSetVersion.setUrl(value.length() > 0
								? value
								: null);

					} else if (effectiveDateModified) {
						effectiveDateModified = false;
						this.setLabel("Set ValueSet Effective Date");
						String value = effectiveDateText.getText().trim();
						valueSetVersion.setEffectiveDate(value.length() > 0
								? value
								: null);

					} else if (releaseDateModified) {
						releaseDateModified = false;
						this.setLabel("Set ValueSet Release Date");
						String value = releaseDateText.getText().trim();
						valueSetVersion.setReleaseDate(value.length() > 0
								? value
								: null);

					} else if (definitionModified) {
						definitionModified = false;
						this.setLabel("Set ValueSet Definition");
						String value = definitionText.getText().trim();
						valueSetVersion.setDefinition(value.length() > 0
								? value
								: null);

					} else if (typeModified && valueSetType != null) {
						typeModified = false;
						this.setLabel("Set Value Set Type");
						if (typeCombo.getSelectionIndex() == 0) {
							// remove stereotype umlEnumeration
							valueSetVersion.setType(null);
						} else {
							EnumerationLiteral literal = valueSetType.getOwnedLiterals().get(
								typeCombo.getSelectionIndex());
							valueSetVersion.setType(ValueSetType.getByName(literal.getName()));
						}
					} else if (bindingModified && bindingKind != null) {
						bindingModified = false;
						this.setLabel("Set Binding");
						if (bindingCombo.getSelectionIndex() == 0) {
							// remove stereotype umlEnumeration
							valueSetVersion.setBinding(null);
						} else {
							EnumerationLiteral literal = bindingKind.getOwnedLiterals().get(
								bindingCombo.getSelectionIndex());
							valueSetVersion.setBinding(BindingKind.getByName(literal.getName()));
						}
					} else {
						return Status.CANCEL_STATUS;
					}

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
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);

					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					}

					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__IDENTIFIER);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__FULL_NAME);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__VERSION);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__SOURCE);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__URL);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__EFFECTIVE_DATE);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__RELEASE_DATE);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__DEFINITION);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__TYPE);
					valueSetVersion.eUnset(TermPackage.Literals.VALUE_SET_VERSION__BINDING);

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
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set CodeSystem reference");
					valueSetVersion.setCodeSystem(codeSystem);

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
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
					if (valueSetVersion == null) {
						return Status.CANCEL_STATUS;
					}

					this.setLabel("Remove CodeSystem reference");
					valueSetVersion.setCodeSystem(null);

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
		int charHeight = point.y;
		gc.dispose();
		shell.dispose();

		Composite composite = getWidgetFactory().createGroup(parent, "Value Set Version");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		int numberOfRows = 10;
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
		// data.top = new FormAttachment(0,numberOfRows);
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

		/* ------ Name field ------ */
		nameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel nameLabel = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(nameLabel, 0);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE);
		nameText.setLayoutData(data);

		/* ------ ID field ------ */
		idText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel idLabel = getWidgetFactory().createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(nameText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		idLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(idLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE);
		idText.setLayoutData(data);

		/* ------ Full Name field ------ */
		fullNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel fullNameLabel = getWidgetFactory().createCLabel(composite, "Full Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(fullNameText, 0, SWT.CENTER);
		fullNameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(fullNameLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(2, numberOfRows, ITabbedPropertyConstants.VSPACE);
		fullNameText.setLayoutData(data);

		/* ------ Source field ------ */
		sourceText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel sourceLabel = getWidgetFactory().createCLabel(composite, "Source:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(sourceText, 0, SWT.CENTER);
		sourceLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(sourceLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(3, numberOfRows, ITabbedPropertyConstants.VSPACE);
		sourceText.setLayoutData(data);

		/* ------ URL field ------ */
		urlText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel urlLabel = getWidgetFactory().createCLabel(composite, "URL:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(urlText, 0, SWT.CENTER);
		urlLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(urlLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(4, numberOfRows, ITabbedPropertyConstants.VSPACE);
		urlText.setLayoutData(data);

		/* ---- type combo ---- */
		typeCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		typeCombo.setItems(new String[] { "Extensional", "Intensional" });
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

		CLabel typeLabel = getWidgetFactory().createCLabel(composite, "Type:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(typeCombo, 0, SWT.CENTER);
		typeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(typeLabel, 0);
		data.top = new FormAttachment(5, numberOfRows, ITabbedPropertyConstants.VSPACE);
		typeCombo.setLayoutData(data);

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
		data.left = new FormAttachment(typeCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(bindingCombo, 0, SWT.CENTER);
		bindingLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(bindingLabel, 0);
		data.top = new FormAttachment(5, numberOfRows, ITabbedPropertyConstants.VSPACE);
		bindingCombo.setLayoutData(data);

		/* ------ Version field ------ */
		versionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory().createCLabel(composite, "Version:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bindingCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(versionText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(70, 0);
		data.top = new FormAttachment(5, numberOfRows, ITabbedPropertyConstants.VSPACE);
		versionText.setLayoutData(data);

		/* ------ Release Date field ------ */
		releaseDateText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel releaseDateLabel = getWidgetFactory().createCLabel(composite, "Release Date:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(releaseDateText, 0, SWT.CENTER);
		releaseDateLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(releaseDateLabel, 0);
		data.right = new FormAttachment(25, 0);
		data.top = new FormAttachment(6, numberOfRows, ITabbedPropertyConstants.VSPACE);
		releaseDateText.setLayoutData(data);

		/* ------ Effective Date field ------ */
		effectiveDateText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel effectiveDateLabel = getWidgetFactory().createCLabel(composite, "Effective Date:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(releaseDateText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(releaseDateText, 0, SWT.CENTER);
		effectiveDateLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(effectiveDateLabel, 0);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(6, numberOfRows, ITabbedPropertyConstants.VSPACE);
		effectiveDateText.setLayoutData(data);

		/* ---- definition text ---- */
		definitionText = getWidgetFactory().createText(composite, "", SWT.V_SCROLL | SWT.WRAP);
		CLabel definitionLabel = getWidgetFactory().createCLabel(composite, "Definition:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(releaseDateText, 0, SWT.BOTTOM);
		definitionLabel.setLayoutData(data);

		// 2 lines height allocated to this widget
		data = new FormData();
		data.left = new FormAttachment(definitionLabel, 0);
		// if I set the width AND right, then I get proper wrapping for long text... whatever.
		data.width = 300;
		data.right = new FormAttachment(100, 0);
		// if I set the top AND height, then I get vertical scroll within the tab page
		data.top = new FormAttachment(releaseDateText, 0, SWT.BOTTOM);
		data.height = charHeight * 4;
		definitionText.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (umlEnumeration != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);
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
		Assert.isTrue(element instanceof Enumeration);
		this.umlEnumeration = (Enumeration) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(umlEnumeration.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		Enumeration bindingKindEnum = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.BINDING_KIND);
		Enumeration valueSetTypeEnum = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.VALUE_SET_TYPE);

		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);

		CodeSystemVersion codeSystem = null;
		if (valueSetVersion != null && valueSetVersion.getCodeSystem() != null) {
			codeSystem = valueSetVersion.getCodeSystem();
			codeSystemRefLabel.setText(codeSystem.getEnumerationQualifiedName());
			codeSystemRefLabel.layout();
		} else {
			codeSystemRefLabel.setText("");
		}

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String id = valueSetVersion.getIdentifier();
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
		if (valueSetVersion != null) {
			String name = valueSetVersion.getEnumerationName();
			nameText.setText(name != null
					? name
					: "");
		} else {
			nameText.setText("");
		}
		nameText.addModifyListener(modifyListener);
		nameText.addKeyListener(keyListener);
		nameText.addFocusListener(focusListener);

		fullNameText.removeModifyListener(modifyListener);
		fullNameText.removeKeyListener(keyListener);
		fullNameText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String name = valueSetVersion.getFullName();
			fullNameText.setText(name != null
					? name
					: "");
		} else {
			fullNameText.setText("");
		}
		fullNameText.addModifyListener(modifyListener);
		fullNameText.addKeyListener(keyListener);
		fullNameText.addFocusListener(focusListener);

		sourceText.removeModifyListener(modifyListener);
		sourceText.removeKeyListener(keyListener);
		sourceText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String source = valueSetVersion.getSource();
			sourceText.setText(source != null
					? source
					: "");
		} else {
			sourceText.setText("");
		}
		sourceText.addModifyListener(modifyListener);
		sourceText.addKeyListener(keyListener);
		sourceText.addFocusListener(focusListener);

		urlText.removeModifyListener(modifyListener);
		urlText.removeKeyListener(keyListener);
		urlText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String url = valueSetVersion.getUrl();
			urlText.setText(url != null
					? url
					: "");
		} else {
			urlText.setText("");
		}
		urlText.addModifyListener(modifyListener);
		urlText.addKeyListener(keyListener);
		urlText.addFocusListener(focusListener);

		versionText.removeModifyListener(modifyListener);
		versionText.removeKeyListener(keyListener);
		versionText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String version = valueSetVersion.getVersion();
			versionText.setText(version != null
					? version
					: "");
		} else {
			versionText.setText("");
		}
		versionText.addModifyListener(modifyListener);
		versionText.addKeyListener(keyListener);
		versionText.addFocusListener(focusListener);

		releaseDateText.removeModifyListener(modifyListener);
		releaseDateText.removeKeyListener(keyListener);
		releaseDateText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String date = valueSetVersion.getReleaseDate();
			releaseDateText.setText(date != null
					? date
					: "");
		} else {
			releaseDateText.setText("");
		}
		releaseDateText.addModifyListener(modifyListener);
		releaseDateText.addKeyListener(keyListener);
		releaseDateText.addFocusListener(focusListener);

		effectiveDateText.removeModifyListener(modifyListener);
		effectiveDateText.removeKeyListener(keyListener);
		effectiveDateText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String date = valueSetVersion.getEffectiveDate();
			effectiveDateText.setText(date != null
					? date
					: "");
		} else {
			effectiveDateText.setText("");
		}
		effectiveDateText.addModifyListener(modifyListener);
		effectiveDateText.addKeyListener(keyListener);
		effectiveDateText.addFocusListener(focusListener);

		definitionText.removeModifyListener(modifyListener);
		definitionText.removeKeyListener(keyListener);
		definitionText.removeFocusListener(focusListener);
		if (valueSetVersion != null) {
			String definition = valueSetVersion.getDefinition();
			definitionText.setText(definition != null
					? definition
					: "");
		} else {
			definitionText.setText("");
		}
		definitionText.addModifyListener(modifyListener);
		definitionText.addKeyListener(keyListener);
		definitionText.addFocusListener(focusListener);

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
			fullNameText.setEnabled(false);
			sourceText.setEnabled(false);
			urlText.setEnabled(false);
			versionText.setEnabled(false);
			releaseDateText.setEnabled(false);
			effectiveDateText.setEnabled(false);
			definitionText.setEnabled(false);
			typeCombo.setEnabled(false);
			bindingCombo.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			codeSystemRefLabel.setEnabled(true);
			idText.setEnabled(true);
			nameText.setEnabled(true);
			fullNameText.setEnabled(true);
			sourceText.setEnabled(true);
			urlText.setEnabled(true);
			versionText.setEnabled(true);
			releaseDateText.setEnabled(true);
			effectiveDateText.setEnabled(true);
			definitionText.setEnabled(true);
			typeCombo.setEnabled(true);
			bindingCombo.setEnabled(true);
			restoreDefaultsButton.setEnabled(valueSetVersion != null);
		}

	}

	/**
	 * Update if necessary, upon receiving the model event.
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
					if (!isDisposed() && umlEnumeration.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

	protected void updateViews() {
		// fire notification for any stereotype umlEnumeration changes to update views
		// this is a bogus notification of change to umlEnumeration name, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, umlEnumeration.getName()) {
			@Override
			public Object getNotifier() {
				return umlEnumeration;
			}

			@Override
			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		umlEnumeration.eNotify(notification);
	}
}
