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

import java.util.List;

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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * The profile properties section for NamedElement.
 * 
 * $Id: $
 */
public class HL7DefinitionSection extends AbstractModelerPropertySection {

	private NamedElement namedElement;

	private Text businessNameText;

	private boolean businessNameModified = false;

	private Text sortKeyText;

	private boolean sortKeyModified = false;

	/**
	 * Get the appropriate specialization of HL7ModelElement.
	 */
	private Stereotype getHL7Stereotype(Element element) {
		Stereotype stereotype = null;

		if (element instanceof Package) {
			stereotype = HL7ResourceUtil.getAppliedHDFStereotype(namedElement, IHDFProfileConstants.HDF_PACKAGE);
		} else if (element instanceof Class) {
			stereotype = HL7ResourceUtil.getAppliedHDFStereotype(namedElement, IHDFProfileConstants.HDF_CLASS);
		} else if (element instanceof Property) {
			stereotype = HL7ResourceUtil.getAppliedHDFStereotype(namedElement, IHDFProfileConstants.HDF_ATTRIBUTE);

			if (stereotype == null) {
				stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
					namedElement, IHDFProfileConstants.HDF_ASSOCIATION_END);
			}
		}

		return stereotype;
	}

	/**
	 * Apply the appropriate specialization of HL7ModelElement.
	 */
	private Stereotype applyHL7Stereotype(Element element) {
		Stereotype stereotype = null;

		if (element instanceof Package) {
			stereotype = HL7ResourceUtil.applyHDFStereotype(namedElement, IHDFProfileConstants.HDF_PACKAGE);
		} else if (element instanceof Class) {
			stereotype = HL7ResourceUtil.applyHDFStereotype(namedElement, IHDFProfileConstants.HDF_CLASS);
		} else if (element instanceof Property && ((Property) element).getAssociation() != null) {
			stereotype = HL7ResourceUtil.applyHDFStereotype(namedElement, IHDFProfileConstants.HDF_ASSOCIATION_END);
		} else if (element instanceof Property) {
			stereotype = HL7ResourceUtil.applyHDFStereotype(namedElement, IHDFProfileConstants.HDF_ATTRIBUTE);
		}

		return stereotype;
	}

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (businessNameText == event.getSource()) {
				businessNameModified = true;
			} else if (sortKeyText == event.getSource()) {
				sortKeyModified = true;
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
		if (!(businessNameModified || sortKeyModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Stereotype stereotype = applyHL7Stereotype(namedElement);

					if (businessNameModified) {
						businessNameModified = false;
						this.setLabel("Set Business Name");

						// TODO remove fixed lang value, add Language field to form
						if (stereotype != null) {
							setFirstBusinessName(namedElement, stereotype, businessNameText.getText().trim(), "en");
						}
					} else if (sortKeyModified) {
						sortKeyModified = false;
						this.setLabel("Set SortKey");

						if (stereotype != null) {
							namedElement.setValue(
								stereotype, IHDFProfileConstants.SORT_KEY, sortKeyText.getText().trim());
						}
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

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

	private String getFirstBusinessName(Element umlElement, Stereotype hdfStereotype) {
		String name = null;
		if (hdfStereotype == null || umlElement.getAppliedSubstereotypes(hdfStereotype) == null) {
			return null;
		}
		Object value = umlElement.getValue(hdfStereotype, IHDFProfileConstants.BUSINESS_NAMES);
		if (value instanceof List && ((List) value).size() > 0) {
			String member = IHDFProfileConstants.BUSINESS_NAMES + "[0]";
			String nameProperty = member + NamedElement.SEPARATOR + IHDFProfileConstants.BUSINESS_NAME_NAME;
			// String langProperty = member + NamedElement.SEPARATOR + IHDFProfileConstants.BUSINESS_NAME_LANG;

			name = (String) umlElement.getValue(hdfStereotype, nameProperty);
			// String lang = (String) umlElement.getValue(hdfStereotype, langProperty);
		}

		return name;
	}

	private void setFirstBusinessName(Element umlElement, Stereotype hdfStereotype, String name, String lang) {
		String member = IHDFProfileConstants.BUSINESS_NAMES + "[0]";
		String nameProperty = member + NamedElement.SEPARATOR + IHDFProfileConstants.BUSINESS_NAME_NAME;
		String langProperty = member + NamedElement.SEPARATOR + IHDFProfileConstants.BUSINESS_NAME_LANG;

		umlElement.setValue(hdfStereotype, nameProperty, name);
		umlElement.setValue(hdfStereotype, langProperty, lang);

		// assign the first business name to UML alias name, to appear on class diagrams
		UMLUtil.addAliasName(umlElement, name);
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		/* ------ sort key ------- */
		sortKeyText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel sortKeyLabel = getWidgetFactory().createCLabel(composite, "Sort Key:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(sortKeyText, 0, SWT.CENTER);
		sortKeyLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(sortKeyLabel, 0);
		data.width = 60;
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		sortKeyText.setLayoutData(data);

		/* ------ business name ------- */
		businessNameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel businessNameLabel = getWidgetFactory().createCLabel(composite, "Business Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(sortKeyText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(businessNameText, 0, SWT.CENTER);
		businessNameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(businessNameLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		businessNameText.setLayoutData(data);

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
		this.namedElement = (NamedElement) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		Stereotype stereotype = getHL7Stereotype(namedElement);

		businessNameText.removeModifyListener(modifyListener);
		businessNameText.removeKeyListener(keyListener);
		businessNameText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String name = getFirstBusinessName(namedElement, stereotype);
			businessNameText.setText(name != null
					? name
					: "");
		} else {
			businessNameText.setText("");
		}
		businessNameText.addModifyListener(modifyListener);
		businessNameText.addKeyListener(keyListener);
		businessNameText.addFocusListener(focusListener);

		sortKeyText.removeModifyListener(modifyListener);
		sortKeyText.removeKeyListener(keyListener);
		sortKeyText.removeFocusListener(focusListener);
		if (stereotype != null) {
			String sortKey = (String) namedElement.getValue(stereotype, IHDFProfileConstants.SORT_KEY);
			sortKeyText.setText(sortKey != null
					? sortKey
					: "");
		} else {
			sortKeyText.setText("");
		}
		sortKeyText.addModifyListener(modifyListener);
		sortKeyText.addKeyListener(keyListener);
		sortKeyText.addFocusListener(focusListener);

		if (isReadOnly()) {
			businessNameText.setEnabled(false);
			sortKeyText.setEnabled(false);
		} else {
			businessNameText.setEnabled(true);
			sortKeyText.setEnabled(true);
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
					if (!isDisposed() && namedElement.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

}
