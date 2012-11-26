/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
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
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.filters.TextAttributeFilter;
import org.openhealthtools.mdht.uml.term.core.util.ITermProfileConstants;
import org.openhealthtools.mdht.uml.term.ui.filters.CodedAttributeFilter;

public class MergePropertyStereotypesAction implements IObjectActionDelegate {
	private NamedElement namedElement;

	public MergePropertyStereotypesAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Transform Validation Support") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(namedElement));

					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Property) {
							Property property = (Property) child;
							Stereotype propertyStereotype = CDAProfileUtil.getAppliedCDAStereotype(
								property, ICDAProfileConstants.PROPERTY_VALIDATION);

							if (propertyStereotype != null) {
								Stereotype codeSystemStereotype = CDAProfileUtil.getAppliedCDAStereotype(
									property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
								Stereotype valueSetStereotype = CDAProfileUtil.getAppliedCDAStereotype(
									property, ITermProfileConstants.VALUE_SET_CONSTRAINT);

								if (codeSystemStereotype != null && valueSetStereotype != null) {
									System.err.println(property.getQualifiedName() +
											" -- cannot merge, has 3 stereotypes");
									continue;
								}

								Validation propertyValidation = (Validation) property.getStereotypeApplication(propertyStereotype);
								SeverityKind propertySeverity = propertyValidation.getSeverity();

								if (codeSystemStereotype != null) {
									Validation termValidation = (Validation) property.getStereotypeApplication(codeSystemStereotype);
									if (!propertySeverity.equals(termValidation.getSeverity())) {
										System.err.println(property.getQualifiedName() +
												" -- cannot merge, different severity");
										continue;
									}
									if (propertyValidation.isMandatory() != termValidation.isMandatory()) {
										System.err.println(property.getQualifiedName() +
												" -- cannot merge, different isMandatory flag");
										continue;
									}

									for (String ruleId : propertyValidation.getRuleId()) {
										if (!termValidation.getRuleId().contains(ruleId)) {
											termValidation.getRuleId().add(ruleId);
										}
									}
									property.unapplyStereotype(propertyStereotype);
									// System.out.println(property.getQualifiedName() + " -- merged");
								}

								if (valueSetStereotype != null) {
									Validation termValidation = (Validation) property.getStereotypeApplication(valueSetStereotype);
									if (!propertySeverity.equals(termValidation.getSeverity())) {
										System.err.println(property.getQualifiedName() +
												" -- cannot merge, different severity");
										continue;
									}
									if (propertyValidation.isMandatory() != termValidation.isMandatory()) {
										System.err.println(property.getQualifiedName() +
												" -- cannot merge, different isMandatory flag");
										continue;
									}

									for (String ruleId : propertyValidation.getRuleId()) {
										if (!termValidation.getRuleId().contains(ruleId)) {
											termValidation.getRuleId().add(ruleId);
										}
									}
									property.unapplyStereotype(propertyStereotype);
									// System.out.println(property.getQualifiedName() + " -- merged");
								}
							}
						}
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				ee.printStackTrace();
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		namedElement = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				namedElement = (NamedElement) selected;
			}
		}

		action.setEnabled(namedElement != null);
	}

	@SuppressWarnings({ "unused", "deprecation" })
	private Stereotype applyValidationStereotype(Element element) {
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(element.eResource().getResourceSet());
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);

		if (stereotype == null && cdaProfile != null) {
			if (element instanceof Association) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.ASSOCIATION_VALIDATION);
			} else if (element instanceof Class) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.CLASS_VALIDATION);
			} else if (element instanceof Property) {
				if (new CodedAttributeFilter().select(element)) {
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.VOCAB_SPECIFICATION);
				} else if (new TextAttributeFilter().select(element)) {
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.TEXT_VALUE);
				} else {
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.PROPERTY_VALIDATION);
				}
			}
		}

		return stereotype;
	}

}
