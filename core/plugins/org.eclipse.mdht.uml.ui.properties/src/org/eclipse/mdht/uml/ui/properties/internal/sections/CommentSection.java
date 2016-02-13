/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
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
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * The properties section for a Comment.
 *
 * $Id: $
 */
public class CommentSection extends WrapperAwareModelerPropertySection {

	protected Element umlElement;

	private Text bodyText;

	private boolean bodyModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (bodyText == event.getSource()) {
				bodyModified = true;
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
		if (!(bodyModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (bodyModified) {
						bodyModified = false;
						String commentText = removeNonXMLCharacters(bodyText.getText().trim());

						Comment comment = null;
						if (umlElement instanceof Comment) {
							comment = (Comment) umlElement;
						} else {
							// get first comment
							for (Comment c : umlElement.getOwnedComments()) {
								comment = c;
								break;
							}
						}

						if (comment != null && commentText.length() == 0) {
							comment.destroy();
							comment = null;
							return Status.OK_STATUS;
						}
						if (commentText.length() == 0) {
							return Status.CANCEL_STATUS;
						}
						if (comment == null) {
							comment = umlElement.createOwnedComment();
						}

						this.setLabel("Set Comment Text");
						comment.setBody(commentText);
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

	private String removeNonXMLCharacters(String text) {
		StringBuffer newText = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			// test for unicode characters from copy/paste of MS Word text
			if (text.charAt(i) == '\u201D') {
				newText.append("\"");
			} else if (text.charAt(i) == '\u201C') {
				newText.append("\"");
			} else if (text.charAt(i) == '\u2019') {
				newText.append("'");
			} else if (text.charAt(i) == '\u2018') {
				newText.append("'");
			} else {
				newText.append(text.charAt(i));
			}
		}

		return newText.toString();
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		bodyText = getWidgetFactory().createText(composite, "", SWT.V_SCROLL | SWT.WRAP);
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		// if I set the width AND right, then I get proper wrapping for long text... whatever.
		data.width = 300;
		data.right = new FormAttachment(100, 0);
		// if I set the top AND height, then I get vertical scroll within the tab page
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		data.height = 50;
		data.bottom = new FormAttachment(100, 0);
		bodyText.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (umlElement != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlElement);
			if (editingDomain != null && editingDomain.isReadOnly(umlElement.eResource())) {
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
		Assert.isTrue(element instanceof Element);
		this.umlElement = (Element) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		Comment comment = null;
		if (umlElement instanceof Comment) {
			comment = (Comment) umlElement;
		} else {
			// get first comment
			for (Comment c : umlElement.getOwnedComments()) {
				comment = c;
				break;
			}
		}

		String commentText = null;
		if (comment != null) {
			commentText = comment.getBody();
		}
		if (commentText == null) {
			commentText = "";
		}

		bodyText.removeModifyListener(modifyListener);
		bodyText.removeFocusListener(focusListener);
		if (commentText != null) {
			bodyText.setText(commentText);
		}
		bodyText.addModifyListener(modifyListener);
		bodyText.addFocusListener(focusListener);

		if (isReadOnly()) {
			bodyText.setEnabled(false);
		} else {
			bodyText.setEnabled(true);
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
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

}
