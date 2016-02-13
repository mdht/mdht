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
import org.eclipse.mdht.uml.cda.core.profile.Inline;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
import org.eclipse.swt.SWT;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The profile properties section for CDA Template.
 */
public class InlineSection extends ResettableModelerPropertySection {

	protected Element modelElement;

	private Button isInlinePublication;

	private boolean isInlinePublicationModified = false;

	private Text filterText;

	private boolean isFilterTextModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (filterText == event.getSource()) {
				isFilterTextModified = true;
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
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Class);
		this.modelElement = (Class) element;
	}

	protected void modifyFields() {
		if (!(isInlinePublicationModified || isFilterTextModified)) {
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
						stereotype = CDAProfileUtil.applyCDAStereotype(modelElement, ICDAProfileConstants.INLINE);
					}
					if (isInlinePublicationModified) {
						isInlinePublicationModified = false;
						// this.setLabel("Set CDA Template ID");

						Inline inline = CDAProfileUtil.getInline((Class) modelElement);

						if (inline != null) {
							inline.setPublishSeperately(isInlinePublication.getSelection());
						}
					}

					if (isFilterTextModified) {
						isFilterTextModified = false;

						Inline inline = CDAProfileUtil.getInline((Class) modelElement);

						if (inline != null) {
							inline.setFilter(filterText.getText());
							;
						}

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

		Composite composite = getWidgetFactory().createGroup(parent, "Inline Section");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		filterText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel filterLabel = getWidgetFactory().createCLabel(composite, "Filter : "); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(filterText, 0, SWT.CENTER);
		filterLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(filterLabel, 0);
		data.width = 200;
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		filterText.setLayoutData(data);

		isInlinePublication = getWidgetFactory().createButton(composite, "Publish As Separate Topic", SWT.CHECK);

		isInlinePublication.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isInlinePublicationModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isInlinePublicationModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(filterText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(isInlinePublication, 0, SWT.CENTER);
		isInlinePublication.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(isInlinePublication, 0, SWT.RIGHT);
		restoreDefaultsButton.setLayoutData(data);

	}

	@Override
	public void refresh() {
		super.refresh();

		Inline inline = CDAProfileUtil.getInline((Class) modelElement);

		if (inline != null) {
			isInlinePublication.setSelection(inline.isPublishSeperately());
		} else {
			isInlinePublication.setSelection(false);
		}

		filterText.removeModifyListener(modifyListener);
		filterText.removeKeyListener(keyListener);
		filterText.removeFocusListener(focusListener);
		if (inline != null) {
			filterText.setText(inline.getFilter() != null
					? inline.getFilter()
					: "");
		} else {
			filterText.setText("");
		}
		filterText.addModifyListener(modifyListener);
		filterText.addKeyListener(keyListener);
		filterText.addFocusListener(focusListener);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection#resetFields()
	 */
	@Override
	protected void resetFields() {
		// TODO Auto-generated method stub

	}

}
