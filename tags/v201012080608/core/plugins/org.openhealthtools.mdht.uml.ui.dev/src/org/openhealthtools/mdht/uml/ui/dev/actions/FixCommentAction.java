/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class FixCommentAction implements IObjectActionDelegate {
	public static final String RSM_DEFAULT_PROFILE_URI = "pathmap://UML2_MSL_PROFILES/Default.epx";

	public static final String RSM_DOCUMENTATION_STEREOTYPE_QNAME = "Default::Documentation";

	private NamedElement element;
	
	public FixCommentAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(element);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Fix comments") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					
					// if necessary, apply Default profile
			    	applyRSMDefaultProfile(UMLUtil.getTopPackage(element));
					
					// apply documentation stereotype to selection and its children
			    	// if multiple comments, only apply stereotype to first one
					TreeIterator iterator = EcoreUtil.getAllContents(
							Collections.singletonList(element));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (Element.class.isInstance(child)) {
							if (((Element)child).getOwnedComments().size() >= 1) {
								Comment comment = (Comment) ((Element)child).getOwnedComments().get(0);
								Stereotype rsaDocStereotype = comment.getApplicableStereotype(RSM_DOCUMENTATION_STEREOTYPE_QNAME);
								if (rsaDocStereotype != null && !comment.isStereotypeApplied(rsaDocStereotype)) {
									comment.applyStereotype(rsaDocStereotype);
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
//			        Logger.logException(ee);
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
		element = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				element = (NamedElement) selected;
			}
		}
		
		action.setEnabled(element != null);
	}

	private Profile applyRSMDefaultProfile(Package model) {
		Resource defaultProfileResource = null;
		Profile defaultProfile = null;
		
		try {
			ResourceSet resourceSet = model.eResource().getResourceSet();
			defaultProfileResource = resourceSet.getResource(URI
					.createURI(RSM_DEFAULT_PROFILE_URI), true);
			
			if (defaultProfileResource != null) {
				defaultProfile = (Profile) EcoreUtil.getObjectByType(
						defaultProfileResource.getContents(), 
						UMLPackage.eINSTANCE.getProfile());

				if (defaultProfile != null && !model.isProfileApplied(defaultProfile)) {
					model.applyProfile(defaultProfile);
				}
			}

		} catch (WrappedException we) {
			//Logger.logException(we);
		}
		
		return defaultProfile;
	}

}
