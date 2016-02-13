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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The profile properties section for Code System Version.
 */
public class CodeSystemVersionSection extends ResettableModelerPropertySection {

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

	private Text effectiveDateText;

	private boolean effectiveDateModified = false;

	private Text releaseDateText;

	private boolean releaseDateModified = false;

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
				effectiveDateModified || releaseDateModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					CodeSystemVersion codeSystemVersion = TermProfileUtil.getCodeSystemVersion(umlEnumeration);

					if (codeSystemVersion == null) {
						return Status.CANCEL_STATUS;
					} else if (idModified) {
						idModified = false;
						this.setLabel("Set CodeSystem ID");
						String value = idText.getText().trim();
						codeSystemVersion.setIdentifier(value.length() > 0
								? value
								: null);

					} else if (nameModified) {
						nameModified = false;
						this.setLabel("Set CodeSystem Name");
						String value = nameText.getText().trim();
						// set the Enumeration name

						codeSystemVersion.setEnumerationName(value.length() > 0
								? value
								: null);

					} else if (fullNameModified) {
						fullNameModified = false;
						this.setLabel("Set CodeSystem Full Name");
						String value = fullNameText.getText().trim();
						codeSystemVersion.setFullName(value.length() > 0
								? value
								: null);

					} else if (versionModified) {
						versionModified = false;
						this.setLabel("Set CodeSystem Version");
						String value = versionText.getText().trim();
						codeSystemVersion.setVersion(value.length() > 0
								? value
								: null);

					} else if (sourceModified) {
						sourceModified = false;
						this.setLabel("Set CodeSystem Source");
						String value = sourceText.getText().trim();
						codeSystemVersion.setSource(value.length() > 0
								? value
								: null);

					} else if (urlModified) {
						urlModified = false;
						this.setLabel("Set CodeSystem URL");
						String value = urlText.getText().trim();
						codeSystemVersion.setUrl(value.length() > 0
								? value
								: null);

					} else if (effectiveDateModified) {
						effectiveDateModified = false;
						this.setLabel("Set CodeSystem Effective Date");
						String value = effectiveDateText.getText().trim();
						codeSystemVersion.setEffectiveDate(value.length() > 0
								? value
								: null);

					} else if (releaseDateModified) {
						releaseDateModified = false;
						this.setLabel("Set CodeSystem Release Date");
						String value = releaseDateText.getText().trim();
						codeSystemVersion.setReleaseDate(value.length() > 0
								? value
								: null);

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
					CodeSystemVersion codeSystemVersion = TermProfileUtil.getCodeSystemVersion(umlEnumeration);

					if (codeSystemVersion == null) {
						return Status.CANCEL_STATUS;
					}

					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__IDENTIFIER);
					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__FULL_NAME);
					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__VERSION);
					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__SOURCE);
					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__URL);
					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__EFFECTIVE_DATE);
					codeSystemVersion.eUnset(TermPackage.Literals.CODE_SYSTEM_VERSION__RELEASE_DATE);

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

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		gc.textExtent("");
		gc.dispose();
		shell.dispose();

		Composite composite = getWidgetFactory().createGroup(parent, "Code System Version");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		int numberOfRows = 5;
		FormData data = null;

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
		data.top = new FormAttachment(0, numberOfRows, ITabbedPropertyConstants.VSPACE);
		nameText.setLayoutData(data);

		/* ------ ID field ------ */
		idText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel idLabel = getWidgetFactory().createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(nameText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		idLabel.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(idText, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(idLabel, 0);
		data.right = new FormAttachment(restoreDefaultsButton, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, numberOfRows, ITabbedPropertyConstants.VSPACE);
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
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE);
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
		data.top = new FormAttachment(2, numberOfRows, ITabbedPropertyConstants.VSPACE);
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
		data.top = new FormAttachment(3, numberOfRows, ITabbedPropertyConstants.VSPACE);
		urlText.setLayoutData(data);

		/* ------ Version field ------ */
		versionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory().createCLabel(composite, "Version:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(versionText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(25, 0);
		data.top = new FormAttachment(4, numberOfRows, ITabbedPropertyConstants.VSPACE);
		versionText.setLayoutData(data);

		/* ------ Release Date field ------ */
		releaseDateText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel releaseDateLabel = getWidgetFactory().createCLabel(composite, "Release Date:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(versionText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(releaseDateText, 0, SWT.CENTER);
		releaseDateLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(releaseDateLabel, 0);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(4, numberOfRows, ITabbedPropertyConstants.VSPACE);
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
		data.right = new FormAttachment(75, 0);
		data.top = new FormAttachment(4, numberOfRows, ITabbedPropertyConstants.VSPACE);
		effectiveDateText.setLayoutData(data);

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
		CodeSystemVersion codeSystemVersion = TermProfileUtil.getCodeSystemVersion(umlEnumeration);

		idText.removeModifyListener(modifyListener);
		idText.removeKeyListener(keyListener);
		idText.removeFocusListener(focusListener);
		if (codeSystemVersion != null) {
			String id = codeSystemVersion.getIdentifier();
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
		if (codeSystemVersion != null) {
			nameText.setText(codeSystemVersion.getEnumerationName());
		} else {
			nameText.setText("");
		}
		nameText.addModifyListener(modifyListener);
		nameText.addKeyListener(keyListener);
		nameText.addFocusListener(focusListener);

		fullNameText.removeModifyListener(modifyListener);
		fullNameText.removeKeyListener(keyListener);
		fullNameText.removeFocusListener(focusListener);
		if (codeSystemVersion != null) {
			String name = codeSystemVersion.getFullName();
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
		if (codeSystemVersion != null) {
			String source = codeSystemVersion.getSource();
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
		if (codeSystemVersion != null) {
			String url = codeSystemVersion.getUrl();
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
		if (codeSystemVersion != null) {
			String version = codeSystemVersion.getVersion();
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
		if (codeSystemVersion != null) {
			String date = codeSystemVersion.getReleaseDate();
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
		if (codeSystemVersion != null) {
			String date = codeSystemVersion.getEffectiveDate();
			effectiveDateText.setText(date != null
					? date
					: "");
		} else {
			effectiveDateText.setText("");
		}
		effectiveDateText.addModifyListener(modifyListener);
		effectiveDateText.addKeyListener(keyListener);
		effectiveDateText.addFocusListener(focusListener);

		if (isReadOnly()) {
			idText.setEnabled(false);
			nameText.setEnabled(false);
			fullNameText.setEnabled(false);
			sourceText.setEnabled(false);
			urlText.setEnabled(false);
			versionText.setEnabled(false);
			releaseDateText.setEnabled(false);
			effectiveDateText.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			idText.setEnabled(true);
			nameText.setEnabled(true);
			fullNameText.setEnabled(true);
			sourceText.setEnabled(true);
			urlText.setEnabled(true);
			versionText.setEnabled(true);
			releaseDateText.setEnabled(true);
			effectiveDateText.setEnabled(true);
			restoreDefaultsButton.setEnabled(codeSystemVersion != null);
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
