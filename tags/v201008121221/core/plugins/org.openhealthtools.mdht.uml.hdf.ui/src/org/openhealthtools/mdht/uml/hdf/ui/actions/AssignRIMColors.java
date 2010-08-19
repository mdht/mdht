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
package org.openhealthtools.mdht.uml.hdf.ui.actions;


import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.ui.util.RIMColorUtil;

public class AssignRIMColors implements IObjectActionDelegate {
	
	private EObject eObject;
	
	public AssignRIMColors() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(eObject);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Assign RIM Colors") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	if (eObject instanceof Diagram) {
			    		for (Iterator iterator = ((Diagram)eObject).getPersistedChildren().iterator(); iterator.hasNext();) {
							Node node = (Node) iterator.next();
							assignNodeColor(node);
						}
			    		for (Iterator iterator = ((Diagram)eObject).getPersistedEdges().iterator(); iterator.hasNext();) {
							Edge edge = (Edge) iterator.next();
							assignNodeColor(edge);
						}
			    	}
			    	else if (eObject instanceof View) {
			    		assignNodeColor((View)eObject);
			    	}
			    	
			        return Status.OK_STATUS;
			    }};

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
	
	private boolean assignNodeColor(View view) {
		if (!(view.getElement() instanceof Element))
			return false;

		Element element = (Element)view.getElement();
		boolean assigned = false;
		
		// special case for RIM metamodel
		Package topPackage = UMLUtil.getTopPackage(element.getNearestPackage());
		if (element instanceof Classifier
				&& "RIM".equals(topPackage.getName())) {
			assigned = RIMColorUtil.assignRIMColor(view, (Classifier)element);
			
			if (!assigned) {
				RIMColorUtil.assignNonCoreColor(view);
				assigned = true;
			}
		}
		else {
			for (Iterator iter = element.getAppliedStereotypes().iterator(); iter.hasNext();) {
				Stereotype stereotype = (Stereotype) iter.next();
				assigned = RIMColorUtil.assignRIMColor(view, stereotype);
				
				if (assigned)
					break;
			}
		}
		
		if (!assigned) {
			// when testing keywords, cannot use RIM generalization to determine type
			assigned = RIMColorUtil.assignRIMColorFromKeywords(view, element);
		}
		
		return assigned;
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
		eObject = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof Element || selected instanceof View) {
				eObject = (EObject) selected;
			}
		}
		
		if (eObject != null) {
			Element element = null;
			if (eObject instanceof Element)
				element = (Element) eObject;
			else if (eObject instanceof View)
				element = getSemanticElement(eObject);

			// special case for RIM model
			Package topPackage = UMLUtil.getTopPackage(element.getNearestPackage());
			if (element != null && 
					("RIM".equals(topPackage.getName())
					 || "RIM Diagrams".equals(topPackage.getName()))) {
				action.setEnabled(true);
				return;
			}
			if (element != null && topPackage.getAppliedProfile("RIM", true) != null) {
				action.setEnabled(true);
				return;
			}
		}

		action.setEnabled(false);
	}

	private Element getSemanticElement(EObject eObject) {
		if (eObject instanceof View
				&& ((View)eObject).getElement() instanceof Element)
			return (Element) ((View)eObject).getElement();
		
		// if semantic element is not assigned, look for container
		Element owner = null;
		while (owner == null && eObject.eContainer() != null) {
			eObject = eObject.eContainer();
			if (eObject instanceof Element)
				owner = (Element) eObject;
		}
		return owner;
	}
}
