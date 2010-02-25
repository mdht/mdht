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
package org.openhealthtools.mdht.uml.cda.ui.actions;

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
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cts.core.util.ICTSProfileConstants;

public class UpdateProfileVersionAction implements IObjectActionDelegate {
	private NamedElement namedElement;
	
	public UpdateProfileVersionAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Update CDA Profile") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					TreeIterator iterator = EcoreUtil.getAllContents(
							Collections.singletonList(namedElement));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Package) {
							Package umlPackage = (Package)child;
							Profile cdaProfile = CDAProfileUtil.getCDAProfile(umlPackage.eResource().getResourceSet());
							umlPackage.applyProfile(cdaProfile);
							
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
			    }};

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
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				namedElement = (NamedElement) selected;
			}
		}
		
		action.setEnabled(namedElement != null);
	}

	private void updateVocabSpecification(Property property) {
		Profile cdaProfile = CDAProfileUtil.getAppliedCDAProfile(property);
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		String codeSystem = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
		String codeSystemName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
		String codeSystemVersion = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
		String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
		String displayName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);
		Object severity = property.getValue(vocabSpecification, ICDAProfileConstants.VALIDATION_SEVERITY);
		String message = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VALIDATION_MESSAGE);
		
		Stereotype codeSystemConstraint = cdaProfile.getOwnedStereotype(ICTSProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSetConstraint = cdaProfile.getOwnedStereotype(ICTSProfileConstants.VALUE_SET_CONSTRAINT);
		if (codeSystemConstraint == null || valueSetConstraint == null) {
			return;
		}
		
		if (code != null && property.isStereotypeApplicable(codeSystemConstraint)) {
			property.applyStereotype(codeSystemConstraint);
			property.setValue(codeSystemConstraint,
					ICTSProfileConstants.CODE_SYSTEM_CONSTRAINT_ID, codeSystem);
			property.setValue(codeSystemConstraint,
					ICTSProfileConstants.CODE_SYSTEM_CONSTRAINT_NAME, codeSystemName);
			property.setValue(codeSystemConstraint,
					ICTSProfileConstants.CODE_SYSTEM_CONSTRAINT_VERSION, codeSystemVersion);
			property.setValue(codeSystemConstraint,
					ICTSProfileConstants.CODE_SYSTEM_CONSTRAINT_CODE, code);
			property.setValue(codeSystemConstraint,
					ICTSProfileConstants.CODE_SYSTEM_CONSTRAINT_DISPLAY_NAME, displayName);
			property.setValue(codeSystemConstraint,
					ICDAProfileConstants.VALIDATION_SEVERITY, severity);
			property.setValue(codeSystemConstraint,
					ICDAProfileConstants.VALIDATION_MESSAGE, message);
			
			property.unapplyStereotype(vocabSpecification);
		}
		else if (property.isStereotypeApplicable(valueSetConstraint)) {
			property.applyStereotype(valueSetConstraint);
			property.setValue(valueSetConstraint,
					ICTSProfileConstants.VALUE_SET_CONSTRAINT_ID, codeSystem);
			property.setValue(valueSetConstraint,
					ICTSProfileConstants.VALUE_SET_CONSTRAINT_NAME, codeSystemName);
			property.setValue(valueSetConstraint,
					ICTSProfileConstants.VALUE_SET_CONSTRAINT_VERSION, codeSystemVersion);
			property.setValue(valueSetConstraint,
					ICDAProfileConstants.VALIDATION_SEVERITY, severity);
			property.setValue(valueSetConstraint,
					ICDAProfileConstants.VALIDATION_MESSAGE, message);
			
			property.unapplyStereotype(vocabSpecification);
		}
	}

}
