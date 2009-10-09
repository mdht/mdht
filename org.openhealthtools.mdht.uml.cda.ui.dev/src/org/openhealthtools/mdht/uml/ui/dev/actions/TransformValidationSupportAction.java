/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
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
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.filters.CodedAttributeFilter;
import org.openhealthtools.mdht.uml.cda.ui.filters.TextAttributeFilter;

public class TransformValidationSupportAction implements IObjectActionDelegate {
	private NamedElement namedElement;
	
	public TransformValidationSupportAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Transform Validation Support") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					TreeIterator iterator = EcoreUtil.getAllContents(
							Collections.singletonList(namedElement));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof NamedElement) {
							NamedElement childElement = (NamedElement) child;
							Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(childElement, ICDAProfileConstants.VALIDATION_SUPPORT);
							if (validationSupport != null) {
								String message = (String) childElement.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_MESSAGE);
								EnumerationLiteral literal = (EnumerationLiteral) childElement.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_SEVERITY);
								String severity = (literal != null) ? literal.getName() : null;
								
								Stereotype validation = applyValidationStereotype(childElement);
								if (validation != null) {
									childElement.setValue(validation, ICDAProfileConstants.VALIDATION_SEVERITY, severity);
									childElement.setValue(validation, ICDAProfileConstants.VALIDATION_MESSAGE, message);
									
									childElement.unapplyStereotype(validationSupport);
								}
								else {
									System.err.println("Error: could not migrate ValidationSupport on " + childElement.getQualifiedName());
								}
							}
							
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

	private Stereotype applyValidationStereotype(Element element) {
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(element.eResource().getResourceSet());
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				element, ICDAProfileConstants.VALIDATION);
		
		if (stereotype == null && cdaProfile != null) {
			if (element instanceof Association) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.ASSOCIATION_VALIDATION);
			}
			else if (element instanceof Class) {
				stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.CLASS_VALIDATION);
			}
			else if (element instanceof Property) {
				if (new CodedAttributeFilter().select(element))
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.VOCAB_SPECIFICATION);
				else if (new TextAttributeFilter().select(element))
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.TEXT_VALUE);
				else
					stereotype = CDAProfileUtil.applyCDAStereotype(element, ICDAProfileConstants.PROPERTY_VALIDATION);
			}
		}
		
		return stereotype;
	}

}
