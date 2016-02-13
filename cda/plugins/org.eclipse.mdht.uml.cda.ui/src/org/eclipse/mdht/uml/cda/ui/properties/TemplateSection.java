/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for restoring defaults
 *     Christian W. Damus - implement handling of live validation roll-back (artf3318)
 *     Sarp Kaya (NEHTA)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.properties;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.CDATemplateComputeBuilder;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The profile properties section for CDA Template.
 */
public class TemplateSection extends ValidationSection {

	private Text templateIdText;

	private boolean templateIdModified = false;

	private Text templateVersionText;

	private boolean templateVersionModified = false;

	private Text assigningAuthorityText;

	private boolean assigningAuthorityModified = false;

	private CCombo multiplicityCombo;

	private boolean templateMultiplicityModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (templateIdText == event.getSource()) {
				templateIdModified = true;
			}
			if (assigningAuthorityText == event.getSource()) {
				assigningAuthorityModified = true;
			}
			if (templateVersionText == event.getSource()) {
				templateVersionModified = true;
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

	@Override
	protected Stereotype getValidationStereotype() {
		String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR +
				ICDAProfileConstants.CDA_TEMPLATE;
		Stereotype stereotype = modelElement.getApplicableStereotype(qname);
		return stereotype;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Class);
		this.modelElement = (Class) element;
	}

	@Override
	protected void modifyFields() {
		super.modifyFields();

		if (!(templateIdModified || templateVersionModified || assigningAuthorityModified ||
				templateMultiplicityModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
						modelElement, ICDAProfileConstants.CDA_TEMPLATE);

					if (stereotype == null) {
						stereotype = CDAProfileUtil.applyCDAStereotype(modelElement, ICDAProfileConstants.CDA_TEMPLATE);
					}
					if (templateIdModified) {
						templateIdModified = false;
						this.setLabel("Set CDA Template ID");

						if (stereotype != null) {
							String value = templateIdText.getText().trim();
							modelElement.setValue(
								stereotype, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, value.length() > 0
										? value
										: null);

						}
					} else if (templateVersionModified) {
						templateVersionModified = false;
						this.setLabel("Set CDA Template Version");

						if (stereotype != null) {
							String value = templateVersionText.getText().trim();
							modelElement.setValue(
								stereotype, ICDAProfileConstants.CDA_TEMPLATE_VERSION, value.length() > 0
										? value
										: null);

						}

					} else if (assigningAuthorityModified) {
						assigningAuthorityModified = false;
						this.setLabel("Set CDA Template Authority");

						if (stereotype != null) {
							String value = assigningAuthorityText.getText().trim();
							modelElement.setValue(
								stereotype, ICDAProfileConstants.CDA_TEMPLATE_ASSIGNING_AUTHORITY_NAME,
								value.length() > 0
										? value
										: null);

						}
					} else if (templateMultiplicityModified) {
						templateMultiplicityModified = false;
						this.setLabel("Set CDA Template Multiplicity");

						if (stereotype != null) {
							String value = multiplicityCombo.getText().trim();
							modelElement.setValue(
								stereotype, ICDAProfileConstants.CDA_TEMPLATE_MULTIPLICITY, value.length() > 0
										? value
										: null);

						}
					} else {
						return Status.CANCEL_STATUS;
					}

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

		Composite composite = getWidgetFactory().createGroup(parent, "CDA Template");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		// Template ID
		templateIdText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel templateIdLabel = getWidgetFactory().createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(templateIdText, 0, SWT.CENTER);
		templateIdLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(templateIdLabel, 0);
		data.width = 200;
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		templateIdText.setLayoutData(data);

		// Template Version
		templateVersionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel templateVersionLabel = getWidgetFactory().createCLabel(composite, "Template Version:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(templateIdText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(templateVersionText, 0, SWT.CENTER);
		templateVersionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(templateVersionLabel, 0);
		data.width = 100;
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		templateVersionText.setLayoutData(data);

		// Assigning Authority
		assigningAuthorityText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel assigningAuthorityLabel = getWidgetFactory().createCLabel(composite, "Assigning Authority:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(templateVersionText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(assigningAuthorityText, 0, SWT.CENTER);
		assigningAuthorityLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(assigningAuthorityLabel, 0);
		data.width = 200;
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		assigningAuthorityText.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(assigningAuthorityText, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		// templateId Multiplicity

		CLabel multiplicityLabel = getWidgetFactory().createCLabel(composite, "templateId Multiplicity:"); //$NON-NLS-1$
		multiplicityCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT);
		multiplicityCombo.setItems(new String[] { "1", "1..*" });
		multiplicityCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				multiplicitySet();
			}

			public void widgetSelected(SelectionEvent e) {
				multiplicitySet();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(assigningAuthorityText, 0, SWT.CENTER);
		data.top = new FormAttachment(assigningAuthorityText, ITabbedPropertyConstants.VSPACE);
		multiplicityLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(multiplicityLabel, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(multiplicityLabel, 0, SWT.CENTER);
		multiplicityCombo.setLayoutData(data);

		addValidationControls(composite, 1, 2);

	}

	@Override
	public void refresh() {
		super.refresh();

		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(modelElement, ICDAProfileConstants.CDA_TEMPLATE);

		templateIdText.removeModifyListener(modifyListener);
		templateIdText.removeKeyListener(keyListener);
		templateIdText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String id = (String) modelElement.getValue(stereotype, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
			templateIdText.setText(id != null
					? id
					: "");
		} else {
			templateIdText.setText("");
		}
		templateIdText.addModifyListener(modifyListener);
		templateIdText.addKeyListener(keyListener);
		templateIdText.addFocusListener(focusListener);

		templateVersionText.removeModifyListener(modifyListener);
		templateVersionText.removeKeyListener(keyListener);
		templateVersionText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String version = (String) modelElement.getValue(stereotype, ICDAProfileConstants.CDA_TEMPLATE_VERSION);
			templateVersionText.setText(version != null
					? version
					: "");
		} else {
			templateVersionText.setText("");
		}
		templateVersionText.addModifyListener(modifyListener);
		templateVersionText.addKeyListener(keyListener);
		templateVersionText.addFocusListener(focusListener);

		assigningAuthorityText.removeModifyListener(modifyListener);
		assigningAuthorityText.removeKeyListener(keyListener);
		assigningAuthorityText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String id = (String) modelElement.getValue(
				stereotype, ICDAProfileConstants.CDA_TEMPLATE_ASSIGNING_AUTHORITY_NAME);
			assigningAuthorityText.setText(id != null
					? id
					: "");
		} else {
			assigningAuthorityText.setText("");
		}
		assigningAuthorityText.addModifyListener(modifyListener);
		assigningAuthorityText.addKeyListener(keyListener);
		assigningAuthorityText.addFocusListener(focusListener);

		if (isReadOnly()) {
			templateIdText.setEnabled(false);
			templateVersionText.setEnabled(false);
			assigningAuthorityText.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			templateIdText.setEnabled(true);
			templateVersionText.setEnabled(true);
			assigningAuthorityText.setEnabled(true);
			restoreDefaultsButton.setEnabled(stereotype != null);
		}
		String multiplicityVal = null;
		if (stereotype != null) {
			multiplicityVal = (String) modelElement.getValue(
				stereotype, ICDAProfileConstants.CDA_TEMPLATE_MULTIPLICITY);
		}

		multiplicityCombo.setText(CDATemplateComputeBuilder.getMultiplicityRange(multiplicityVal));

	}

	private void multiplicitySet() {
		String selectedTxt = multiplicityCombo.getText();
		if ("1".equals(selectedTxt)) {
			multiplicityCombo.setText("1..1");
		}
		templateMultiplicityModified = true;
		modifyFields();

	}

}
