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
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.properties;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The profile properties section for CDA TextValue.
 */
public class TextValueSection extends ValidationSection {

	private Text valueText;

	private boolean valueModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (valueText == event.getSource()) {
				valueModified = true;
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
		String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR + ICDAProfileConstants.TEXT_VALUE;
		Stereotype stereotype = modelElement.getApplicableStereotype(qname);
		return stereotype;
	}

	@Override
	protected void modifyFields() {
		super.modifyFields();

		if (!(valueModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = getValidationStereotype();

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}
					if (!modelElement.isStereotypeApplied(stereotype)) {
						modelElement.applyStereotype(stereotype);
					}
					if (valueModified) {
						valueModified = false;
						this.setLabel("Set Text Value");

						if (stereotype != null) {
							String value = valueText.getText().trim();
							modelElement.setValue(stereotype, ICDAProfileConstants.TEXT_VALUE_VALUE, value.length() > 0
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

		Composite composite = getWidgetFactory().createGroup(parent, "Text Value Validation");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		valueText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel valueLabel = getWidgetFactory().createCLabel(composite, "Constraint:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(valueText, 0, SWT.CENTER);
		valueLabel.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(valueText, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(valueLabel, 0);
		data.right = new FormAttachment(restoreDefaultsButton, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		valueText.setLayoutData(data);

		addValidationControls(composite, 1, 2);
	}

	@Override
	public void refresh() {
		super.refresh();

		Stereotype stereotype = getValidationStereotype();

		valueText.removeModifyListener(modifyListener);
		valueText.removeKeyListener(keyListener);
		valueText.removeFocusListener(focusListener);
		if (stereotype != null && modelElement.isStereotypeApplied(stereotype)) {
			String value = (String) modelElement.getValue(stereotype, ICDAProfileConstants.TEXT_VALUE_VALUE);
			valueText.setText(value != null
					? value
					: "");
		} else {
			valueText.setText("");
		}
		valueText.addModifyListener(modifyListener);
		valueText.addKeyListener(keyListener);
		valueText.addFocusListener(focusListener);

		if (isReadOnly()) {
			valueText.setEnabled(false);
			restoreDefaultsButton.setEnabled(false);
		} else {
			valueText.setEnabled(true);
			restoreDefaultsButton.setEnabled(stereotype != null && modelElement.isStereotypeApplied(stereotype));
		}

	}

}
