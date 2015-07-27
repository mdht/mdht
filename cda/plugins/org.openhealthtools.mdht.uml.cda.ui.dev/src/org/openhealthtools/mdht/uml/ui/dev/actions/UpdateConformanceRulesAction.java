/*******************************************************************************
 * Copyright (c) 2015 Dan Brown.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Dan Brown (Audacious Inquiry) - initial API and implementation
 *     David A Carlson (XMLmodeling.com) - wrote AssignConformanceRuleIdsAction.java which provided an outline for this implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.dev.actions;

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
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;

public class UpdateConformanceRulesAction implements IObjectActionDelegate {

	private static final String OPERATION_NAME = "Update Conformance Rules";

	private static final String IG_RULE_AND_UNIQUE_RULE_SEPARATOR = "-";

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	protected Element selectedElement;

	private String ruleHeader;

	// e.g. CONF:oldIgRulePrefix-1234 to CONF:newIgRulePrefix-1234
	private boolean updateIGRulePrefix;

	// TODO: make these values selectable the user eventually in some sort of input field or menu
	private String oldIgRulePrefix;

	private String newIgRulePrefix;

	// TODO: implement this
	// determines parent class and updates that too - specifically useful for updating the CcdaVersionPrefix
	private boolean updateParent;

	// e.g. 2.0= to 2.1=
	private boolean updateCcdaVersionPrefix;

	// TODO: make these values selectable by the user eventually in some sort of input field popup
	private String oldCcdaVersionPrefix;

	private String newCcdaVersionPrefix;

	// e.g. CONF:1234 to CONF:newIgRulePrefix-1234
	// for a V2 template this could be useful at the same time as updateIGRulePrefix and addIgRulePrefix (for missed ones)
	// However, the CONFs found and updated may be old UNIMPLEMENTABLE constraints or ones with no severity
	// for a V1 template, this will likely add prefixes we didn't want
	// It should never be true at the same time as updateParent as we only want to add to the current template
	// above is covered in setRuleId check - could cover in GUI options as well
	// for safety, should probably just use this alone, w/o updateIGRulePrefix or addIgRulePrefix on a case by case basis
	private boolean addIgRulePrefix = false;

	public UpdateConformanceRulesAction() {
		super();
		setDefaults();
	}

	// good for a reset to default button
	private void setDefaults() {
		updateIGRulePrefix = true;
		updateParent = false;
		updateCcdaVersionPrefix = true;
		addIgRulePrefix = false;
		ruleHeader = "CONF:";
		oldIgRulePrefix = "1098";
		newIgRulePrefix = "1198";
		oldCcdaVersionPrefix = "R2.0=";
		newCcdaVersionPrefix = "R2.1=";
	}

	private void updateAllConformanceRules(Element element) {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				@Override
				public Object caseClass(org.eclipse.uml2.uml.Class umlClass) {
					// If the current class has a templateId, then it is the template class or an inline class
					if (CDAModelUtil.getTemplateId(umlClass) != null) {
						setRuleId(umlClass);
					}
					return umlClass;
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

				@Override
				public Object caseAssociation(Association association) {
					setRuleId(association);
					return association;
				}

				@Override
				public Object caseConstraint(Constraint constraint) {
					setRuleId(constraint);
					return constraint;
				}

				@Override
				public Object caseGeneralization(Generalization generalization) {
					setRuleId(generalization);
					return generalization;
				}

			};
			umlSwitch.doSwitch(child);
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
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, OPERATION_NAME) {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					System.out.println();

					updateAllConformanceRules(selectedElement);

					if (updateParent) {
						updateParent();
					}

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

	private void setRuleId(Element element) {
		List<Stereotype> appliedStereotypes = CDAProfileUtil.getAppliedStereotypes(
			element, ICDAProfileConstants.VALIDATION);
		for (Stereotype stereotype : appliedStereotypes) {
			Object value = element.getValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID);
			// we only want to look at rules that have content
			if (value != null || (value instanceof List && (!((List) value).isEmpty()))) {
				List<String> ruleList = new ArrayList<String>();
				String rules = CDAModelUtil.getConformanceRuleIds(element, stereotype);
				if (rules != null && !rules.trim().isEmpty()) {
					if (updateIGRulePrefix) {
						rules = replaceIGRulePrefix(rules);
					}
					if (updateCcdaVersionPrefix) {
						rules = replaceCcdaVersionPrefix(rules);
					}
					if (addIgRulePrefix && !updateParent) {
						if (!rules.contains("-")) {
							rules = addIgRulePrefix(rules);
						}
					}
					ruleList.add(rules);
					element.setValue(stereotype, ICDAProfileConstants.VALIDATION_RULE_ID, ruleList);
				} else {
					System.out.println("There are no rules! stereotype: " + stereotype.getName());
				}
			}
		}
	}

	/**
	 * e.g. CONF:oldIgRulePrefix-1234 to CONF:newIgRulePrefix-1234
	 * 
	 * @param rules
	 *            conformance rules
	 * @return
	 *         updated conformance rules
	 */
	private String replaceIGRulePrefix(String rules) {
		System.out.println("Performing replaceIGRulePrefix operation");
		final String OLD_RULE = ruleHeader + oldIgRulePrefix + IG_RULE_AND_UNIQUE_RULE_SEPARATOR;
		final String NEW_RULE = ruleHeader + newIgRulePrefix + IG_RULE_AND_UNIQUE_RULE_SEPARATOR;
		return updateCurrentRules(
			rules, OLD_RULE, NEW_RULE, "No IG Rule Prefixes were updated in the following String: " + rules);
	}

	/**
	 * e.g. 2.0= to 2.1=
	 * 
	 * @param rules
	 *            conformance rules
	 * @return
	 *         updated conformance rules
	 */
	private String replaceCcdaVersionPrefix(String rules) {
		System.out.println("Performing replaceCcdaVersionPrefix operation");
		return updateCurrentRules(rules, oldCcdaVersionPrefix, newCcdaVersionPrefix, "No CcdaVersionPrefix of '" +
				oldCcdaVersionPrefix + "' was found or updated in the following String: " + rules);
	}

	/**
	 * e.g. CONF:1234 to CONF:newIgRulePrefix-1234 <br />
	 * this 'CONF:' is replaced with this 'CONF:newIgRulePrefix-' <br />
	 * Note: oldIgRulePrefix is ignored in this case since there is none <br />
	 * if there isn't a hyphen then we insert the specified prefix
	 * 
	 * @param rules
	 *            conformance rules
	 * @return
	 *         updated conformance rules
	 */
	private String addIgRulePrefix(String rules) {
		System.out.println("Performing addIgRulePrefix operation");
		final String OLD_RULE = ruleHeader;
		final String NEW_RULE = ruleHeader + newIgRulePrefix + IG_RULE_AND_UNIQUE_RULE_SEPARATOR;
		return updateCurrentRules(
			rules,
			OLD_RULE,
			NEW_RULE,
			"an old prefixless rule similar to the format CONF:1234 was not found or updated in the following String: " +
					rules);
	}

	@SuppressWarnings("unused")
	private static String updateRules(String rules, final String oldRule, final String newRule) {
		return updateCurrentRules(rules, oldRule, newRule, null);
	}

	private static String updateCurrentRules(String rules, final String oldRule, final String newRule,
			String noUpdateMessage) {
		if (rules.contains(oldRule)) {
			System.out.println("Replacing: " + rules);
			rules = rules.replaceAll(oldRule, newRule);
			System.out.println("With: " + rules);
		} else {
			System.out.println(noUpdateMessage == null
					? "No rules were updated in the following String: " + rules
					: noUpdateMessage);
		}
		return rules;
	}

	/**
	 * Not yet implemented <br />
	 * Recursively updates all of the classes (templates) the selected class (template) inherits from as well
	 */
	private void updateParent() {
		throw new UnsupportedOperationException("Error: The method updateParent is not yet implemented in " +
				getClass().getSimpleName());
	}

	/**
	 * For testing purposes...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}
}
