/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for "business name" values
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.properties.internal.sections;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;

/**
 * The general properties section for NamedElement.
 *
 * $Id: $
 */
public class NamedElementSection extends WrapperAwareModelerPropertySection {

	/**
	 * Duplicate copy of private field in superclass. I'd like to remove this,
	 * but can't find another way to refresh page title.
	 */
	private TabbedPropertySheetPage tabbedPropertySheetPage;

	protected NamedElement namedElement;

	private Text localNameText;

	private boolean localNameModified = false;

	private Text businessNameText;

	private boolean businessNameModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (localNameText == event.getSource()) {
				localNameModified = true;
			}
			if (businessNameText == event.getSource()) {
				businessNameModified = true;
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
		if (!(localNameModified || businessNameModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {

				URI propertiesURI = null;

				String properties = null;

				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					if (!(localNameModified || businessNameModified)) {
						return Status.CANCEL_STATUS;
					}

					propertiesURI = UMLUtil.getPropertiesURI(namedElement.eResource());
					properties = UMLUtil.readProperties(propertiesURI);

					if (localNameModified) {
						localNameModified = false;
						this.setLabel("Set Name");

						String oldPropertyKey = NamedElementUtil.getLabelPropertyKey(namedElement);
						Map<String, String> parsedProperties = properties != null
								? UMLUtil.parseProperties(properties)
								: new LinkedHashMap<String, String>();
						String oldProperty = parsedProperties.remove(oldPropertyKey);

						namedElement.setName(localNameText.getText());

						if (oldProperty != null) {
							String newPropertyKey = NamedElementUtil.getLabelPropertyKey(namedElement);
							parsedProperties.put(newPropertyKey, oldProperty.replace(oldPropertyKey, newPropertyKey));

							UMLUtil.writeProperties(propertiesURI, parsedProperties);
						}

						refreshBusinessNameText();
					} else if (businessNameModified) {
						businessNameModified = false;
						this.setLabel("Set Business Name");

						if (!NamedElementUtil.setBusinessName(namedElement, businessNameText.getText())) {
							refreshBusinessNameText();
							return Status.CANCEL_STATUS;
						}
						String name = businessNameText.getText();

						// trigger the changed notification so saving can happen
						// without actually changing the namedElement
						namedElement.eNotify(new ENotificationImpl(
							(InternalEObject) namedElement, Notification.SET, UMLPackage.NAMED_ELEMENT__NAME, name,
							name, true));

					}

					return Status.OK_STATUS;
				}

				@Override
				protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					IStatus result = super.doUndo(monitor, info);

					if (result.isOK()) {
						URIConverter uriConverter = getEditingDomain().getResourceSet().getURIConverter();

						if (uriConverter.exists(propertiesURI, null)) {

							if (properties == null) {
								properties = UMLUtil.readProperties(propertiesURI);

								try {
									uriConverter.delete(propertiesURI, null);
								} catch (IOException ioe) {
									return Status.CANCEL_STATUS;
								}
							} else {
								Map<String, String> parsedProperties = UMLUtil.parseProperties(properties);
								properties = UMLUtil.readProperties(propertiesURI);
								UMLUtil.writeProperties(propertiesURI, parsedProperties);
							}
						}

						if (!businessNameText.isDisposed()) {
							refreshBusinessNameText();
						}
					}

					return result;
				}

				@Override
				protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					IStatus result = super.doRedo(monitor, info);

					if (result.isOK()) {

						if (properties != null) {
							Map<String, String> parsedProperties = UMLUtil.parseProperties(properties);
							properties = UMLUtil.readProperties(propertiesURI);
							UMLUtil.writeProperties(propertiesURI, parsedProperties);
						}

						if (!businessNameText.isDisposed()) {
							refreshBusinessNameText();
						}
					}

					return result;
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
		this.tabbedPropertySheetPage = aTabbedPropertySheetPage;

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		localNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE + 2);
		localNameText.setLayoutData(data);

		CLabel localNameLabel = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(localNameText, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(localNameText, 0, SWT.CENTER);
		localNameLabel.setLayoutData(data);

		businessNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(1, 2, ITabbedPropertyConstants.VSPACE + 2);
		businessNameText.setLayoutData(data);

		CLabel businessNameLabel = getWidgetFactory().createCLabel(composite, "Business Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(businessNameText, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(businessNameText, 0, SWT.CENTER);
		businessNameLabel.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (namedElement != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			if (editingDomain != null && editingDomain.isReadOnly(namedElement.eResource())) {
				return true;
			}
		}

		return super.isReadOnly();
	}

	/*
	 * Override super implementation to allow for objects that are not
	 * IAdaptable.
	 *
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.
	 * AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
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
		Assert.isTrue(element instanceof NamedElement);
		this.namedElement = (NamedElement) element;
	}

	@Override
	public void dispose() {
		super.dispose();
		namedElement = null;
	}

	protected void refreshBusinessNameText() {
		businessNameText.removeModifyListener(modifyListener);
		businessNameText.removeKeyListener(keyListener);
		businessNameText.removeFocusListener(focusListener);
		if (namedElement.getName() != null) {
			businessNameText.setText(NamedElementUtil.getBusinessName(namedElement));
		} else {
			businessNameText.setText("");
		}
		businessNameText.addModifyListener(modifyListener);
		businessNameText.addKeyListener(keyListener);
		businessNameText.addFocusListener(focusListener);

		businessNameText.setEnabled(!isReadOnly());
	}

	@Override
	public void refresh() {
		localNameText.removeModifyListener(modifyListener);
		localNameText.removeKeyListener(keyListener);
		localNameText.removeFocusListener(focusListener);
		if (namedElement.getName() != null) {
			localNameText.setText(namedElement.getName());
		} else {
			localNameText.setText("");
		}
		localNameText.addModifyListener(modifyListener);
		localNameText.addKeyListener(keyListener);
		localNameText.addFocusListener(focusListener);

		localNameText.setEnabled(!isReadOnly());

		refreshBusinessNameText();

		// TODO there should be a better way to force tabbed page label update
		tabbedPropertySheetPage.labelProviderChanged(new LabelProviderChangedEvent(new LabelProvider()));
	}

}
