/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - UI for editing constrained elements (artf3318)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.util.EnumerationLabelProvider;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.mdht.uml.validation.Diagnostic;
import org.eclipse.mdht.uml.validation.EvaluationModeKind;
import org.eclipse.mdht.uml.validation.SeverityKind;
import org.eclipse.mdht.uml.validation.ValidationPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;

/**
 * The <tt>«diagnostic»</tt> stereotype property section for UML constraints.
 */
public class ConstraintDiagnosticSection extends WrapperAwareModelerPropertySection {

	private Constraint constraint;

	private Diagnostic diagnostic;

	private ComboViewer evaluationModePicker;

	private ComboViewer severityPicker;

	private Text messageText;

	private Text statusCodeText;

	private ISelectionChangedListener selectionListener = new ISelectionChangedListener() {

		public void selectionChanged(SelectionChangedEvent event) {
			dirty = true;
		}
	};

	private ModifyListener textListener = new ModifyListener() {

		public void modifyText(ModifyEvent e) {
			dirty = true;
		}
	};

	private KeyListener acceptListener = new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent e) {
			if ((e.character == SWT.CR) || (e.keyCode == SWT.KEYPAD_CR)) {
				updateModel();
			}
		}
	};

	private FocusListener focusListener = new FocusAdapter() {
		@Override
		public void focusLost(FocusEvent event) {
			updateModel();
		}
	};

	private VerifyListener intValidator = new VerifyListener() {

		public void verifyText(VerifyEvent e) {
			int len = e.text.length();

			if (len > 0) {
				int i = 0;

				if (e.text.charAt(i) == '-') {
					if (e.start > 0) {
						e.text = ""; // disallow the input
						return;
					}
					i++;
				}

				for (; i < len; i++) {
					char c = e.text.charAt(i);
					if ((c < '0') || (c > '9')) {
						e.text = ""; // disallow the input
						return;
					}
				}
			}
		}
	};

	private boolean dirty;

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		GC gc = new GC(parent);
		gc.setFont(parent.getFont());
		Point point = gc.textExtent("M");//$NON-NLS-1$
		final int charHeight = point.y;
		final int charWidth = point.x;
		gc.dispose();

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		CLabel label = getWidgetFactory().createCLabel(composite, "Evaluation Mode:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0, 0);
		label.setLayoutData(data);

		evaluationModePicker = new ComboViewer(new Combo(composite, SWT.READ_ONLY | SWT.DROP_DOWN));
		getWidgetFactory().adapt(evaluationModePicker.getControl(), true, false);
		data = new FormData();
		data.left = new FormAttachment(label, 0, SWT.RIGHT);
		data.top = new FormAttachment(label, 0, SWT.CENTER);
		evaluationModePicker.getControl().setLayoutData(data);

		evaluationModePicker.setContentProvider(new ArrayContentProvider());
		evaluationModePicker.setLabelProvider(
			EnumerationLabelProvider.of(EvaluationModeKind.class).label(EvaluationModeKind.BATCH, "Batch").label(
				EvaluationModeKind.LIVE, "Live"));
		evaluationModePicker.setInput(EvaluationModeKind.VALUES);

		label = getWidgetFactory().createCLabel(composite, "Severity:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(evaluationModePicker.getControl(), 0, SWT.RIGHT);
		data.top = new FormAttachment(0, 0);
		label.setLayoutData(data);

		severityPicker = new ComboViewer(new Combo(composite, SWT.READ_ONLY | SWT.DROP_DOWN));
		getWidgetFactory().adapt(severityPicker.getControl(), true, false);
		data = new FormData();
		data.left = new FormAttachment(label, 0, SWT.RIGHT);
		data.top = new FormAttachment(label, 0, SWT.CENTER);
		severityPicker.getControl().setLayoutData(data);

		severityPicker.setContentProvider(new ArrayContentProvider());
		severityPicker.setLabelProvider(
			EnumerationLabelProvider.of(SeverityKind.class).labels("Informational", "Warning", "Error"));
		severityPicker.setInput(SeverityKind.VALUES);

		label = getWidgetFactory().createCLabel(composite, "Status Code:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(severityPicker.getControl(), 0, SWT.RIGHT);
		data.top = new FormAttachment(0, 0);
		label.setLayoutData(data);

		statusCodeText = getWidgetFactory().createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(label, 0, SWT.RIGHT);
		data.top = new FormAttachment(label, 0, SWT.CENTER);
		data.width = 6 * charWidth;
		statusCodeText.setLayoutData(data);

		label = getWidgetFactory().createCLabel(composite, "Message:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(evaluationModePicker.getControl(), 0, SWT.BOTTOM);
		label.setLayoutData(data);

		messageText = getWidgetFactory().createText(composite, "", SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		data = new FormData();
		data.left = new FormAttachment(label, 0, SWT.RIGHT);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(label, 0, SWT.TOP);
		data.height = 5 * charHeight / 2;
		messageText.setLayoutData(data);
	}

	private void hookListeners() {
		evaluationModePicker.addSelectionChangedListener(selectionListener);
		severityPicker.addSelectionChangedListener(selectionListener);

		statusCodeText.addModifyListener(textListener);
		messageText.addModifyListener(textListener);

		statusCodeText.addKeyListener(acceptListener);
		messageText.addKeyListener(acceptListener);

		evaluationModePicker.getControl().addFocusListener(focusListener);
		severityPicker.getControl().addFocusListener(focusListener);
		statusCodeText.addFocusListener(focusListener);
		messageText.addFocusListener(focusListener);

		statusCodeText.addVerifyListener(intValidator);
	}

	private void unhookListeners() {
		evaluationModePicker.removeSelectionChangedListener(selectionListener);
		severityPicker.removeSelectionChangedListener(selectionListener);

		statusCodeText.removeModifyListener(textListener);
		messageText.removeModifyListener(textListener);

		statusCodeText.removeKeyListener(acceptListener);
		messageText.removeKeyListener(acceptListener);

		evaluationModePicker.getControl().removeFocusListener(focusListener);
		severityPicker.getControl().removeFocusListener(focusListener);
		statusCodeText.removeFocusListener(focusListener);
		messageText.removeFocusListener(focusListener);

		statusCodeText.removeVerifyListener(intValidator);
	}

	@Override
	protected boolean isReadOnly() {
		boolean result = super.isReadOnly();

		if (!result) {
			if (diagnostic == null) {
				result = true;
			} else {
				TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(constraint);
				if ((editingDomain != null) && editingDomain.isReadOnly(constraint.eResource())) {
					result = true;
				}
			}
		}

		return result;
	}

	/*
	 * Override super implementation to allow for objects that are not IAdaptable.
	 *
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
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
		Assert.isTrue(element instanceof Constraint);
		this.constraint = (Constraint) element;

		diagnostic = (Diagnostic) EcoreUtil.getObjectByType(
			constraint.getStereotypeApplications(), ValidationPackage.Literals.DIAGNOSTIC);
	}

	@Override
	public void refresh() {
		unhookListeners();

		if ((evaluationModePicker != null) && (diagnostic != null)) {
			evaluationModePicker.setSelection(new StructuredSelection(diagnostic.getEvaluationMode()));
			severityPicker.setSelection(new StructuredSelection(diagnostic.getSeverity()));
			statusCodeText.setText(diagnostic.isSetCode()
					? Integer.toString(diagnostic.getCode())
					: "");
			messageText.setText((diagnostic.getMessage() == null)
					? ""
					: diagnostic.getMessage().trim());

			if (!isReadOnly()) {
				hookListeners();
			}
		}

		boolean enable = !isReadOnly();
		evaluationModePicker.getControl().setEnabled(enable);
		severityPicker.getControl().setEnabled(enable);
		statusCodeText.setEnabled(enable);
		messageText.setEnabled(enable);
	}

	/**
	 * Update if necessary, upon receiving the model event.
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            event notification
	 * @param element
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && (constraint.eResource() != null)) {
						refresh();
					}
				}
			});
		}
	}

	private void updateModel() {
		if (dirty) {
			execute(
				new AbstractEMFOperation(TransactionUtil.getEditingDomain(constraint), "Change Diagnostic Properties") {

					@Override
					protected IStatus doExecute(IProgressMonitor arg0, IAdaptable arg1) throws ExecutionException {
						boolean changed = false;

						EvaluationModeKind evalMode = getSelectedValue(evaluationModePicker, EvaluationModeKind.class);
						if (diagnostic.getEvaluationMode() != evalMode) {
							changed = true;
							diagnostic.setEvaluationMode(evalMode);
						}

						SeverityKind sev = getSelectedValue(severityPicker, SeverityKind.class);
						if (diagnostic.getSeverity() != sev) {
							changed = true;
							diagnostic.setSeverity(sev);
						}

						String codeStr = statusCodeText.getText().trim();
						if (codeStr.length() == 0) {
							if (diagnostic.isSetCode()) {
								changed = true;
								diagnostic.unsetCode();
							}
						} else {
							int code = Integer.valueOf(codeStr);
							if (diagnostic.getCode() != code) {
								changed = true;
								diagnostic.setCode(code);
							}
						}

						String message = messageText.getText().trim();
						if (message.length() == 0) {
							if (diagnostic.getMessage() != null) {
								changed = true;
								diagnostic.setMessage(null);
							}
						} else {
							if (!UML2Util.safeEquals(diagnostic.getMessage(), message)) {
								changed = true;
								diagnostic.setMessage(message);
							}
						}

						return changed
								? Status.OK_STATUS
								: Status.CANCEL_STATUS;
					}
				});

			dirty = false;
		}
	}

	private <T> T getSelectedValue(ISelectionProvider selectionProvider, java.lang.Class<T> type) {
		IStructuredSelection sel = (IStructuredSelection) selectionProvider.getSelection();
		return sel.isEmpty()
				? null
				: type.cast(sel.getFirstElement());
	}
}
