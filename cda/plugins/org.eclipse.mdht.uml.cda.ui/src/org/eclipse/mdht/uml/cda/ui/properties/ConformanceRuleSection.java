/*******************************************************************************
 * Copyright (c) 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.properties;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
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

/**
 * Display CDA conformance rule text generated from model structure.
 */
public class ConformanceRuleSection extends ResettableModelerPropertySection {

	private Element modelElement;

	private Text messageDisplay;

	/**
	 * Duplicate copy of private field in superclass. I'd like to remove this,
	 * but can't find another way to refresh all page sections.
	 */
	private TabbedPropertySheetPage myTabbedPropertySheetPage;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {

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

	}

	@Override
	protected void resetFields() {

	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		myTabbedPropertySheetPage = aTabbedPropertySheetPage;

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int charHeight = point.y;
		gc.dispose();
		shell.dispose();

		Composite composite = getWidgetFactory().createGroup(parent, "Conformance Rule");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		/* ---- message display ---- */
		messageDisplay = getWidgetFactory().createText(composite, "", SWT.V_SCROLL | SWT.WRAP | SWT.READ_ONLY); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		// if I set the width AND right, then I get proper wrapping for long text... whatever.
		data.width = 300;
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 1, ITabbedPropertyConstants.VSPACE);
		data.height = charHeight * 3;
		messageDisplay.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (modelElement != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(modelElement);
			if (editingDomain != null && editingDomain.isReadOnly(modelElement.eResource())) {
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
		Assert.isTrue(element instanceof Element);
		this.modelElement = (Element) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		// Toggle Append Conformance
		CDAModelUtil.isAppendConformanceRules = true;
		String computedMessage = CDAModelUtil.computeConformanceMessage(modelElement, false);
		CDAModelUtil.isAppendConformanceRules = false;
		messageDisplay.setText(computedMessage != null
				? computedMessage
				: "");

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
					if (!isDisposed() && modelElement.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

}
