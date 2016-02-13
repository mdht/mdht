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
package org.eclipse.mdht.uml.cda.ui.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.cda.ui.internal.Logger;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class AssignConformanceRuleIdsAction implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	protected Element selectedElement;

	private String rulePrefix = "CONF:";

	private int lastId = 0;

	public AssignConformanceRuleIdsAction() {
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

				@Override
				public Object caseClass(Class umlClass) {
					setRuleId(umlClass);
					return umlClass;
				}

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

	private void findLastId() {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
			Collections.singletonList(UMLUtil.getTopPackage(selectedElement)));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {
				@Override
				public Object caseElement(Element element) {
					for (String ruleId : CDAModelUtil.getConformanceRuleIdList(element)) {
						int lastDash = ruleId.lastIndexOf("-");
						int lastColon = ruleId.lastIndexOf(":");
						try {
							int ruleNumber = -1;
							if (lastDash >= 0) {
								ruleNumber = Integer.parseInt(ruleId.substring(lastDash + 1));
							} else if (lastColon >= 0) {
								ruleNumber = Integer.parseInt(ruleId.substring(lastColon + 1));
							}

							if (ruleNumber > lastId) {
								lastId = ruleNumber;
							}
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

	protected View getSelectedView() {
		for (Iterator elements = ((IStructuredSelection) currentSelection).iterator(); elements.hasNext();) {

			Object element = elements.next();
			View view = ((IAdaptable) element).getAdapter(View.class);

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
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Remove Validation Messages") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					findLastId();
					assignConformanceRuleIds(selectedElement);

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
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

	private void setRuleId(Class umlClass) {
		List<Stereotype> appliedStereotypes = CDAProfileUtil.getAppliedStereotypes(
			umlClass, ICDAProfileConstants.VALIDATION);

		for (Stereotype stereotype : appliedStereotypes) {
			Object value = umlClass.getValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID);
			if (value == null || (value instanceof List && ((List) value).isEmpty())) {
				String ruleId = rulePrefix + ++lastId;
				List<String> ruleIds = new ArrayList<String>();
				ruleIds.add(ruleId);
				umlClass.setValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID, ruleIds);
			}
		}

	}

	private void setRuleId(Element element) {
		List<Stereotype> appliedStereotypes = CDAProfileUtil.getAppliedStereotypes(
			element, ICDAProfileConstants.VALIDATION);

		for (Stereotype stereotype : appliedStereotypes) {
			Object value = element.getValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID);
			if (value == null || (value instanceof List && ((List) value).isEmpty())) {
				String ruleId = rulePrefix + ++lastId;
				List<String> ruleIds = new ArrayList<String>();
				ruleIds.add(ruleId);
				element.setValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID, ruleIds);
			}
		}
	}
}
