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
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.AnnotationsUtil;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformUtil;
import org.openhealthtools.mdht.uml.cda.transform.PluginPropertiesUtil;

public class RemoveConstraintAnnotationsAction implements IObjectActionDelegate {
	public static final String VALIDATION_ERROR = "constraints.validation.error";
	public static final String VALIDATION_WARNING = "constraints.validation.warning";
	public static final String VALIDATION_INFO = "constraints.validation.info";

	public static final String SEVERITY_ERROR = "ERROR";
	public static final String SEVERITY_WARNING = "WARNING";
	public static final String SEVERITY_INFO = "INFO";

	private NamedElement namedElement;
	
	public RemoveConstraintAnnotationsAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Remove Constraint Annotations") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					TreeIterator iterator = EcoreUtil.getAllContents(
							Collections.singletonList(namedElement));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Class) {
							Class childClass = (Class) child;
							AnnotationsUtil annotationsUtil = new AnnotationsUtil(childClass);
							String warnings = annotationsUtil.getAnnotation(VALIDATION_WARNING);
							String infos = annotationsUtil.getAnnotation(VALIDATION_INFO);

							PluginPropertiesUtil propertiesUtil = new PluginPropertiesUtil(childClass.eResource());
							
							for (Constraint constraint : childClass.getOwnedRules()) {
								String severity = SEVERITY_ERROR;
								if (warnings != null && warnings.indexOf(constraint.getName()) != -1)
									severity = SEVERITY_WARNING;
								else if(infos != null && infos.indexOf(constraint.getName()) != -1)
									severity = SEVERITY_INFO;
								
								String message = propertiesUtil.getProperty(constraint.getName().trim());
								
								Stereotype validation = CDAProfileUtil.applyCDAStereotype(
										constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
								constraint.setValue(validation, ICDAProfileConstants.VALIDATION_SEVERITY, severity);
								constraint.setValue(validation, ICDAProfileConstants.VALIDATION_MESSAGE, message);
							}
							
							annotationsUtil.removeAnnotation(VALIDATION_ERROR);
							annotationsUtil.removeAnnotation(VALIDATION_WARNING);
							annotationsUtil.removeAnnotation(VALIDATION_INFO);
							annotationsUtil.saveAnnotations();

							Stereotype eClass = EcoreTransformUtil.getEcoreStereotype(childClass, UMLUtil.STEREOTYPE__E_CLASS);
							if (eClass != null) {
								List<String> annotations = (List<String>) childClass.getValue(eClass, "annotations");
								if (annotations.isEmpty()) {
									childClass.unapplyStereotype(eClass);
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

}
