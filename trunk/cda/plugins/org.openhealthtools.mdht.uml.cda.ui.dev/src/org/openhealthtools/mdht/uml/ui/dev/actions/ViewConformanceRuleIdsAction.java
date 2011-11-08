/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.dev.actions;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.text.View;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.FormDialog;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;

public class ViewConformanceRuleIdsAction implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	protected Element selectedElement;

	private String rulePrefix = "CONF-";

	private int lastId = 0;

	public ViewConformanceRuleIdsAction() {
		super();
	}

	private void assignConformanceRuleIds(Element element) {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				@Override
				public Object caseAssociation(Association association) {
					setRuleId(association);
					return association;
				}

				// public Object caseClass(Class umlClass) {
				// setRuleId(umlClass);
				// return umlClass;
				// }

				@Override
				public Object caseConstraint(Constraint constraint) {
					if (!CDAModelUtil.hasValidationSupport(constraint)) {
						CDAProfileUtil.applyCDAStereotype(constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
					}
					setRuleId(constraint);
					return constraint;
				}

				@Override
				public Object caseGeneralization(Generalization generalization) {
					// if (!CDAModelUtil.hasValidationSupport(generalization.getSpecific())) {
					// CDAProfileUtil.applyCDAStereotype(generalization.getSpecific(), ICDAProfileConstants.CDA_TEMPLATE);
					// setRuleId(generalization.getSpecific());
					// }

					// only succeeds if ConformsTo has been applied
					setRuleId(generalization);

					return generalization;
				}

				@Override
				public Object caseProperty(Property property) {
					setRuleId(property);

					Association association = property.getAssociation();
					if (association != null) {
						setRuleId(association);
					}

					return property;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}

	private void getRuleIds() {

		// Package p = UMLUtil.getTopPackage(selectedElement);

		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(selectedElement));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {
				@Override
				public Object caseElement(Element element) {

					if (element instanceof NamedElement) {
						// System.out.println(((NamedElement) element).getQualifiedName());
					} else {
						// System.out.println(element.toString());
					}

					for (String ruleId : CDAModelUtil.getConformanceRuleIdList(element)) {

						// System.out.println("rule >" + ruleId);

						int lastDash = ruleId.lastIndexOf("-");
						try {
							int ruleNumber = Integer.parseInt(ruleId.substring(lastDash + 1));

							rules.put(new Integer(ruleNumber), ruleId);

							// if (ruleNumber > lastId) {
							// lastId = ruleNumber;
							// }
						} catch (NumberFormatException e) {
							// ignore ill-formed ids.
						}
					}
					return element;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}

	SortedMap<Integer, String> rules = new TreeMap<Integer, String>();

	private void findRulePrefix() {
		String prefix = CDAModelUtil.getModelPrefix(selectedElement);
		if (prefix != null) {
			rulePrefix = "CONF-" + prefix + "-";
		}
	}

	protected View getSelectedView() {
		for (Iterator elements = ((IStructuredSelection) currentSelection).iterator(); elements.hasNext();) {

			Object element = elements.next();
			View view = (View) ((IAdaptable) element).getAdapter(View.class);

			if (view != null) {
				return view;
			}
		}

		return null;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		findRulePrefix();
		getRuleIds();

		rules.firstKey();

		final StringBuffer sb = new StringBuffer();

		for (int aa = 1; aa < rules.lastKey().intValue(); aa++) {
			if (!rules.containsKey(aa)) {
				// System.out.println(aa);

				sb.append(String.format("Missing %s \n", aa));

				System.out.println("Missing " + aa);
			}

		}

		FormDialog dialog = new FormDialog(activePart.getSite().getShell()) {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.ui.forms.FormDialog#createFormContent(org.eclipse.ui.forms.IManagedForm)
			 */
			@Override
			protected void createFormContent(IManagedForm mform) {

				mform.getForm().setText(sb.toString());
				// super.createFormContent(mform);

				// FormText text = mform.getToolkit().createFormText(mform.getForm().getBody(), true);

				// text.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", false, false);
				// super.createFormContent(mform);

				// final ScrolledForm scroll = mform.getForm();
				// final TableWrapLayout layout = new TableWrapLayout();
				// layout.numColumns = 2;
				// scroll.getBody().setLayout(layout);
				// final FormToolkit toolkit = mform.getToolkit();
				// // image
				// image = toolkit.createImageHyperlink(scroll.getBody(), SWT.NO_FOCUS);
				// image.setImage(getShell().getDisplay().getSystemImage(iconStyle));
				// image.setLayoutData(new TableWrapData(TableWrapData.CENTER));
				// // message
				// if (message != null) {
				// scroll.setText(message);
				// }
				// // text
				// if (status != null) {
				// text = toolkit.createFormText(scroll.getBody(), true);
				// text.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
				// String statusMessage = getStatusMessage(status);
				// try {
				// text.setWhitespaceNormalized(true);
				//						text.setColor("header", toolkit.getColors().getColor(IFormColors.TITLE)); //$NON-NLS-1$
				//						text.setFont("header", JFaceResources.getHeaderFont()); //$NON-NLS-1$
				//						text.setFont("code", JFaceResources.getTextFont()); //$NON-NLS-1$
				// text.setText(statusMessage, true, false);
				// } catch (Exception e) {// show plain unformatted text
				// text.setText(statusMessage, false, false);
				// }
				// text.addHyperlinkListener(new HyperlinkAdapter() {
				// public void linkActivated(final HyperlinkEvent e) {
				//							new OpenURLAction("Documentation") { //$NON-NLS-1$
				// @Override
				// protected String getURL() {
				// if (e.getHref() != null) {
				// return String.valueOf(e.getHref());
				// }
				// return null;
				// }
				// }.run();
				// }
				// });
				// }
			}

		};
		dialog.create();
		dialog.getShell().setSize(500, 500);
		dialog.open();

		// for (Integer i : rules.keySet()) {
		// System.out.println(i);
		// }

		// try {
		// TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);
		//
		// IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Remove Validation Messages") {
		// @Override
		// protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
		//
		//
		// // assignConformanceRuleIds(selectedElement);
		//
		// return Status.OK_STATUS;
		// }
		// };
		//
		// try {
		// IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
		// operation.addContext(commandStack.getDefaultUndoContext());
		// commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);
		//
		// } catch (ExecutionException ee) {
		// Logger.logException(ee);
		// }
		//
		// } catch (Exception e) {
		// throw new RuntimeException(e.getCause());
		// }
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;
		selectedElement = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View) selected).getElement();
			}

			if (selected instanceof Element) {
				selectedElement = (Element) selected;
			}
		}

		if (selectedElement != null && CDAProfileUtil.getAppliedCDAProfile(selectedElement) != null) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	private void setRuleId(Element element) {
		if (CDAModelUtil.hasValidationSupport(element) && CDAModelUtil.getConformanceRuleIdList(element).isEmpty()) {
			String ruleId = rulePrefix + ++lastId;
			CDAModelUtil.setValidationRuleId(element, ruleId);
		}
	}
}
