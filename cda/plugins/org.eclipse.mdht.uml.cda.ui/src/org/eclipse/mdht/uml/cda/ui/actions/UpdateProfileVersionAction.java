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
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.common.ui.search.IElementFilter;
import org.eclipse.mdht.uml.common.ui.search.ModelSearch;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

public class UpdateProfileVersionAction implements IObjectActionDelegate {
	private NamedElement namedElement;

	private List<CodeSystemVersion> codeSystems = new ArrayList<CodeSystemVersion>();

	private List<ValueSetVersion> valueSets = new ArrayList<ValueSetVersion>();

	public UpdateProfileVersionAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		cacheTerminology();

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Update CDA Profile") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections.singletonList(namedElement));

					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Package) {
							Package umlPackage = (Package) child;
							Profile cdaProfile = CDAProfileUtil.getCDAProfile(umlPackage.eResource().getResourceSet());
							try {
								umlPackage.applyProfile(cdaProfile);
							} catch (Exception e) {
								// occurs if latest version of profile is re-applied
							}
						}
						if (child instanceof Property) {
							Property property = (Property) child;
							Stereotype vocabSpec = CDAProfileUtil.getAppliedCDAStereotype(
								property, ICDAProfileConstants.VOCAB_SPECIFICATION);

							if (vocabSpec != null) {
								updateVocabSpecification(property);
							}

							iterator.prune();
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

	private void cacheTerminology() {
		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(namedElement.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		final Stereotype codeSystemVersionStereotype = (Stereotype) ctsProfile.getOwnedType(
			ITermProfileConstants.CODE_SYSTEM_VERSION);
		final Stereotype valueSetVersionStereotype = (Stereotype) ctsProfile.getOwnedType(
			ITermProfileConstants.VALUE_SET_VERSION);
		IElementFilter codeSystemFilter = new IElementFilter() {
			public boolean accept(Element element) {
				return (element instanceof Enumeration) && element.isStereotypeApplied(codeSystemVersionStereotype);
			}
		};
		IElementFilter valueSetFilter = new IElementFilter() {
			public boolean accept(Element element) {
				return (element instanceof Enumeration) && element.isStereotypeApplied(valueSetVersionStereotype);
			}
		};

		List<Element> codeSystemEnums = ModelSearch.findAllOf(
			namedElement.eResource().getResourceSet(), codeSystemFilter);
		List<Element> valueSetEnums = ModelSearch.findAllOf(namedElement.eResource().getResourceSet(), valueSetFilter);

		for (Element element : codeSystemEnums) {
			CodeSystemVersion codeSystemVersion = (CodeSystemVersion) element.getStereotypeApplication(
				codeSystemVersionStereotype);
			if (codeSystemVersion != null) {
				codeSystems.add(codeSystemVersion);
			}
		}
		for (Element element : valueSetEnums) {
			ValueSetVersion valueSetVersion = (ValueSetVersion) element.getStereotypeApplication(
				valueSetVersionStereotype);
			if (valueSetVersion != null) {
				valueSets.add(valueSetVersion);
			}
		}
	}

	private CodeSystemVersion findCodeSystem(String identifier) {
		if (identifier != null) {
			for (CodeSystemVersion codeSystem : codeSystems) {
				if (codeSystem.getIdentifier().equals(identifier)) {
					return codeSystem;
				}
			}
		}
		return null;
	}

	private ValueSetVersion findValueSet(String identifier) {
		if (identifier != null) {
			for (ValueSetVersion valueSet : valueSets) {
				if (valueSet.getIdentifier().equals(identifier)) {
					return valueSet;
				}
			}
		}
		return null;
	}

	private void updateVocabSpecification(Property property) {
		Profile cdaProfile = CDAProfileUtil.getAppliedCDAProfile(property);
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		String identifier = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
		String name = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
		String version = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
		String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
		String displayName = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);
		Object severity = property.getValue(vocabSpecification, ICDAProfileConstants.VALIDATION_SEVERITY);
		String message = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VALIDATION_MESSAGE);

		Stereotype propertyValidation = cdaProfile.getOwnedStereotype(ICDAProfileConstants.PROPERTY_VALIDATION);
		Stereotype codeSystemConstraint = cdaProfile.getOwnedStereotype(ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSetConstraint = cdaProfile.getOwnedStereotype(ITermProfileConstants.VALUE_SET_CONSTRAINT);
		if (codeSystemConstraint == null || valueSetConstraint == null) {
			return;
		}

		CodeSystemVersion codeSystemVersion = findCodeSystem(identifier);
		ValueSetVersion valueSetVersion = findValueSet(identifier);

		if (property.isStereotypeApplicable(codeSystemConstraint) && (code != null || codeSystemVersion != null)) {
			property.applyStereotype(codeSystemConstraint);

			if (codeSystemVersion != null) {
				property.setValue(
					codeSystemConstraint, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_REFERENCE, codeSystemVersion);
			} else {
				System.err.println("Cannot find code system: " + name + " ID: " + identifier);
				property.setValue(codeSystemConstraint, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_ID, identifier);
				property.setValue(codeSystemConstraint, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_NAME, name);
				property.setValue(codeSystemConstraint, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_VERSION, version);
			}
			property.setValue(codeSystemConstraint, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_CODE, code);
			property.setValue(
				codeSystemConstraint, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT_DISPLAY_NAME, displayName);
			property.setValue(codeSystemConstraint, ICDAProfileConstants.VALIDATION_SEVERITY, severity);
			property.setValue(codeSystemConstraint, ICDAProfileConstants.VALIDATION_MESSAGE, message);

			property.unapplyStereotype(vocabSpecification);
		} else if (property.isStereotypeApplicable(valueSetConstraint) && (identifier != null || name != null)) {
			property.applyStereotype(valueSetConstraint);

			if (valueSetVersion != null) {
				property.setValue(
					valueSetConstraint, ITermProfileConstants.VALUE_SET_CONSTRAINT_REFERENCE, valueSetVersion);
			} else {
				System.err.println("Cannot find value set: " + name + " ID: " + identifier);
				property.setValue(valueSetConstraint, ITermProfileConstants.VALUE_SET_CONSTRAINT_ID, identifier);
				property.setValue(valueSetConstraint, ITermProfileConstants.VALUE_SET_CONSTRAINT_NAME, name);
				property.setValue(valueSetConstraint, ITermProfileConstants.VALUE_SET_CONSTRAINT_VERSION, version);
			}
			property.setValue(valueSetConstraint, ICDAProfileConstants.VALIDATION_SEVERITY, severity);
			property.setValue(valueSetConstraint, ICDAProfileConstants.VALIDATION_MESSAGE, message);

			property.unapplyStereotype(vocabSpecification);
		} else if (property.isStereotypeApplicable(propertyValidation) &&
				!property.isStereotypeApplied(propertyValidation)) {
			property.applyStereotype(propertyValidation);
			property.setValue(propertyValidation, ICDAProfileConstants.VALIDATION_SEVERITY, severity);
			property.setValue(propertyValidation, ICDAProfileConstants.VALIDATION_MESSAGE, message);

			property.unapplyStereotype(vocabSpecification);
		}
	}

}
