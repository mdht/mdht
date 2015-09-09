/*******************************************************************************
 * Copyright (c) 2015 Dan Brown.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Dan Brown (Audacious Inquiry) - initial API and implementation
 * 	   David A Carlson (XMLmodeling.com) - wrote AssignConformanceRuleIdsAction.java which provided a basis for some of the UI-specific methods in this class
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.dev.util;

import java.util.ArrayList;
import java.util.Collections;
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

//How to update functionality for future versions: 
//If adding new prefixes or versions for new C-CDA versions we will need to:
//-add a new Action class using the existing simple outlines provided (e.g. UpdateIGRulePrefixesAction)
//-link it to the appropriate non-default init method and pass in the custom requirements
//-add that call to the run() switch with a new representative enum added to ConfUpdateType
//-link the code with the UI (update plugin.xml with a new action in the appropriate sub-menu group)
//Note:
//-we may want to update the 4 DEFAULT_ strings as well to stay in sync with what the current 'default' might be
//either way though, the specific sub-menu selections will get the user what they need, so it isn't necessary
//-Or, for a very quick update, we could simply update the DEFAULT_ strings to whatever is needed, and if seeking clarity, 
//the menus could textually reflect that they are updating to the latest spec (edit plugin.properties)
public final class ConfRulesUtil {

	public static final String IG_RULE_AND_UNIQUE_RULE_SEPARATOR = "-";

	public static final String RULE_HEADER = "CONF:";

	private static final String DEFAULT_OLD_IG_RULE_PREFIX = "1098";

	private static final String DEFAULT_NEW_IG_RULE_PREFIX = "1198";

	private static final String DEFAULT_OLD_CCDA_VERSION_PREFIX = "R2.0=";

	private static final String DEFAULT_NEW_CCDA_VERSION_PREFIX = "R2.1=";

	// e.g. CONF:oldIgRulePrefix-1234 to CONF:newIgRulePrefix-1234
	private static boolean updateIGRulePrefix = true;

	private static String oldIgRulePrefix = DEFAULT_OLD_IG_RULE_PREFIX;

	private static String newIgRulePrefix = DEFAULT_NEW_IG_RULE_PREFIX;

	// TODO: implement the method associated with this boolean
	// determines parent class and updates that too - specifically useful for updating the CcdaVersionPrefix
	private static boolean updateParent;

	// e.g. 2.0= to 2.1=
	private static boolean updateCcdaVersionPrefix = true;

	private static String oldCcdaVersionPrefix = DEFAULT_OLD_CCDA_VERSION_PREFIX;

	private static String newCcdaVersionPrefix = DEFAULT_NEW_CCDA_VERSION_PREFIX;

	// e.g. CONF:1234 to CONF:newIgRulePrefix-1234
	// Original use is to make an update from C-CDA R1.0/1.1 to C-CDA 2.0/2+ in a new V2 template
	// Other/combined/future uses:
	// for a current V2/V2+ template this could be useful before running updateIGRulePrefix (for missed ones)
	// for new templates which inherit from R1.1 templates it will serve its original purpose
	private static boolean addIgRulePrefix;

	private ConfRulesUtil() {
	}

	public static boolean isUpdateParent() {
		return updateParent;
	}

	/**
	 * sets a default old rule prefix {@value #DEFAULT_OLD_IG_RULE_PREFIX} and a default new rule prefix, {@value #DEFAULT_NEW_IG_RULE_PREFIX} and
	 * initializes the class to run this option
	 */
	public static void initUpdateRulePrefixesOnly() {
		initUpdateRulePrefixesOnly(DEFAULT_OLD_IG_RULE_PREFIX, DEFAULT_NEW_IG_RULE_PREFIX);
	}

	/**
	 * sets a custom old and new rule prefix and initializes the class to run this option
	 */
	public static void initUpdateRulePrefixesOnly(String oldIgRulePrefix, String newIgRulePrefix) {
		init(
			true, oldIgRulePrefix, newIgRulePrefix, false, false, DEFAULT_OLD_CCDA_VERSION_PREFIX,
			DEFAULT_NEW_CCDA_VERSION_PREFIX, false);
	}

	/**
	 * sets a default old rule prefix {@value #DEFAULT_OLD_IG_RULE_PREFIX}, a default new rule prefix, {@value #DEFAULT_NEW_IG_RULE_PREFIX} a default
	 * old version {@value #DEFAULT_OLD_CCDA_VERSION_PREFIX}, a default new version {@value #DEFAULT_NEW_CCDA_VERSION_PREFIX}, and initializes the
	 * class to run this option
	 */
	public static void initUpdateRulePrefixesAndVersion() {
		initUpdateRulePrefixesAndVersion(
			DEFAULT_OLD_IG_RULE_PREFIX, DEFAULT_NEW_IG_RULE_PREFIX, DEFAULT_OLD_CCDA_VERSION_PREFIX,
			DEFAULT_NEW_CCDA_VERSION_PREFIX);
	}

	/**
	 * sets a custom old and new rule prefix and version and initializes the class to run this option
	 */
	public static void initUpdateRulePrefixesAndVersion(String oldIgRulePrefix, String newIgRulePrefix,
			String oldCcdaVersionPrefix, String newCcdaVersionPrefix) {
		init(true, oldIgRulePrefix, newIgRulePrefix, false, true, oldCcdaVersionPrefix, newCcdaVersionPrefix, false);
	}

	/**
	 * sets the {@value #DEFAULT_NEW_IG_RULE_PREFIX} prefix by default and initializes the class to run this option
	 */
	public static void initAddRulePrefixes() {
		initAddRulePrefixes(DEFAULT_NEW_IG_RULE_PREFIX);
	}

	/**
	 * sets a custom prefix and initializes the class to run this option
	 * 
	 * @param prefixToAdd
	 *            provide a rule prefix to add (without the hyphen) <br />
	 *            e.g. {@value #DEFAULT_NEW_IG_RULE_PREFIX}
	 */
	public static void initAddRulePrefixes(String prefixToAdd) {
		init(
			false, DEFAULT_OLD_IG_RULE_PREFIX, prefixToAdd, false, false, DEFAULT_OLD_CCDA_VERSION_PREFIX,
			DEFAULT_NEW_CCDA_VERSION_PREFIX, true);
	}

	private static void init(boolean updateIGRulePrefix, String oldIgRulePrefix, String newIgRulePrefix,
			boolean updateParent, boolean updateCcdaVersionPrefix, String oldCcdaVersionPrefix,
			String newCcdaVersionPrefix, boolean addIgRulePrefix) {
		ConfRulesUtil.updateIGRulePrefix = updateIGRulePrefix;
		ConfRulesUtil.oldIgRulePrefix = oldIgRulePrefix;
		ConfRulesUtil.newIgRulePrefix = newIgRulePrefix;
		ConfRulesUtil.updateParent = updateParent;
		ConfRulesUtil.updateCcdaVersionPrefix = updateCcdaVersionPrefix;
		ConfRulesUtil.oldCcdaVersionPrefix = oldCcdaVersionPrefix;
		ConfRulesUtil.newCcdaVersionPrefix = newCcdaVersionPrefix;
		ConfRulesUtil.addIgRulePrefix = addIgRulePrefix;
	}

	public static void updateAllConformanceRules(Element element) {
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

	private static void setRuleId(Element element) {
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
						rules = addIgRulePrefix(rules);
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
	private static String replaceIGRulePrefix(String rules) {
		System.out.println("Performing replaceIGRulePrefix operation");
		final String OLD_RULE = RULE_HEADER + oldIgRulePrefix + IG_RULE_AND_UNIQUE_RULE_SEPARATOR;
		final String NEW_RULE = RULE_HEADER + newIgRulePrefix + IG_RULE_AND_UNIQUE_RULE_SEPARATOR;
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
	private static String replaceCcdaVersionPrefix(String rules) {
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
	private static String addIgRulePrefix(String rules) {
		System.out.println("Performing addIgRulePrefix operation");
		if (!rules.contains("-")) {
			final String NEW_RULE = RULE_HEADER + newIgRulePrefix + IG_RULE_AND_UNIQUE_RULE_SEPARATOR;
			return updateCurrentRules(
				rules,
				RULE_HEADER,
				NEW_RULE,
				"An old prefixless rule similar to the format CONF:1234 was not found or updated in the following String: " +
						rules);
		} else {
			System.out.println("The following rule(s) weren't updated as they are already versioned: " + rules);
			return rules;
		}
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
	public static void updateParent(Element selectedElement) {
		throw new UnsupportedOperationException("Error: The method updateParent is not yet implemented in " +
				ConfRulesUtil.class.getSimpleName());
	}

	public static Element selectionChanged(IAction action, ISelection selection) {
		Element selectedElement = null;

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

		return selectedElement;
	}

	public static enum ConfUpdateType {
		ADD_RULE_PREFIX, UPDATE_PREFIX_ONLY, UPDATE_PREFIX_AND_VERSION;
	}

	public static void run(IAction action, final Element selectedElement, final String operationName,
			final ConfUpdateType type) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, operationName) {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					System.out.println();

					switch (type) {
						case ADD_RULE_PREFIX:
							initAddRulePrefixes();
							break;
						case UPDATE_PREFIX_ONLY:
							initUpdateRulePrefixesOnly();
							break;
						case UPDATE_PREFIX_AND_VERSION:
							initUpdateRulePrefixesAndVersion();
							break;
					}

					updateAllConformanceRules(selectedElement);

					if (updateParent) {
						updateParent(selectedElement);
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
	 * For testing purposes...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
