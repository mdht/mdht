/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation

 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.List;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * The general properties section for Property default value.
 *
 */
public class PropertyDefaultSection extends WrapperAwareModelerPropertySection {

	private Property property;

	private Text defaultValueText;

	private CCombo defaultValueCombo;

	private boolean defaultValueModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (defaultValueText == event.getSource()) {
				defaultValueModified = true;
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
		if (!(defaultValueModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (defaultValueModified) {
						defaultValueModified = false;
						this.setLabel("Set Default Value");
						if (property.getDefaultValue() != null) {
							property.getDefaultValue().destroy();
						}

						String newValue = null;
						if (property.getType() instanceof Enumeration) {
							newValue = defaultValueCombo.getText();
						} else {
							newValue = defaultValueText.getText();
						}

						if (newValue != null && newValue.trim().length() > 0) {
							// TODO check property type and create appropriate literal type
							LiteralString literal = UMLFactory.eINSTANCE.createLiteralString();
							literal.setValue(newValue);
							property.setDefaultValue(literal);
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
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		/* ----- Default Value ----- */
		defaultValueCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT);
		defaultValueCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				defaultValueModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				defaultValueModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		// TODO figure out how to set correct wider label width
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(30, 0);
		data.top = new FormAttachment(0, 1);
		defaultValueCombo.setLayoutData(data);

		defaultValueText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$

		data = new FormData();
		// TODO figure out how to set correct wider label width
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(70, 0);
		data.top = new FormAttachment(0, 1);
		defaultValueText.setLayoutData(data);

		CLabel defaultValueLabel = getWidgetFactory().createCLabel(composite, "Default Value:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(defaultValueCombo, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(defaultValueCombo, 0, SWT.CENTER);
		defaultValueLabel.setLayoutData(data);

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
		if (element instanceof View) {
			element = ((View) element).getElement();
		}

		if (element instanceof Association) {
			element = UMLUtil.getNavigableEnd((Association) element);
		}

		if (element instanceof Property) {
			this.property = (Property) element;
		} else {
			this.property = null;
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		property = null;
	}

	@Override
	public void refresh() {
		String defaultValue = "";
		if (property.getDefaultValue() != null && property.getDefaultValue().stringValue() != null) {
			defaultValue = property.getDefaultValue().stringValue();
		}

		if (property.getType() instanceof Enumeration) {
			List<EnumerationLiteral> literals = ((Enumeration) property.getType()).getOwnedLiterals();
			String[] literalLabels = new String[literals.size()];
			for (int i = 0; i < literals.size(); i++) {
				literalLabels[i] = literals.get(i).getName();
			}
			defaultValueCombo.setItems(literalLabels);
			defaultValueCombo.setText(defaultValue);

			defaultValueText.setVisible(false);
			defaultValueCombo.setVisible(true);

		} else {
			defaultValueText.removeModifyListener(modifyListener);
			defaultValueText.removeKeyListener(keyListener);
			defaultValueText.removeFocusListener(focusListener);
			if (property.getType() == null) {
				defaultValueText.setEditable(false);
			} else {
				defaultValueText.setEditable(true);
			}
			defaultValueText.setText(defaultValue);

			defaultValueText.addModifyListener(modifyListener);
			defaultValueText.addKeyListener(keyListener);
			defaultValueText.addFocusListener(focusListener);

			defaultValueCombo.setVisible(false);
			defaultValueText.setVisible(true);
		}

		if (isReadOnly()) {
			defaultValueText.setEnabled(false);
			defaultValueCombo.setEnabled(false);
		} else {
			defaultValueText.setEnabled(true);
			defaultValueCombo.setEnabled(true);
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
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

}
