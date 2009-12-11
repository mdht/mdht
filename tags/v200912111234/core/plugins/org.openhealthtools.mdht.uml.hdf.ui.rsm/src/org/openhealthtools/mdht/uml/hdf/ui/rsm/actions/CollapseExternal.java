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
package org.openhealthtools.mdht.uml.hdf.ui.rsm.actions;


import java.util.Collections;
import java.util.Iterator;

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
import org.eclipse.gmf.runtime.notation.Diagram;
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
import org.openhealthtools.mdht.uml.hdf.ui.rsm.internal.Logger;

import com.ibm.xtools.umlnotation.UMLParentDisplay;
import com.ibm.xtools.umlnotation.UMLShapeStyle;
import com.ibm.xtools.umlnotation.UmlnotationFactory;
import com.ibm.xtools.umlnotation.UmlnotationPackage;

public class CollapseExternal implements IObjectActionDelegate {

	public static String RSM_PACKAGE_VIEW_TYPE = "";
	public static String RSM_CLASS_VIEW_TYPE = "";
	public static String RSM_ATTRIBUTE_COMPARTMENT_VIEW_TYPE = "AttributeCompartment";
	public static String RSM_OPERATION_COMPARTMENT_VIEW_TYPE = "OperationCompartment";
	public static String RSM_ENUMERATION_COMPARTMENT_VIEW_TYPE = "EnumerationCompartment";
	public static String RSM_NOTE_VIEW_TYPE = "Note";

	//TODO see UMLEditPartFactory
	public static String UML2Tools_PACKAGE_VIEW_TYPE = "2002";	//TODO
	public static String UML2Tools_CLASS_VIEW_TYPE = "2001";
	public static String UML2Tools_ENUMERATION_VIEW_TYPE = "2003";
	public static String UML2Tools_DATATYPE_VIEW_TYPE = "2004";
	public static String UML2Tools_ATTRIBUTE_COMPARTMENT_VIEW_TYPE = "7001";
	public static String UML2Tools_OPERATION_COMPARTMENT_VIEW_TYPE = "7002";
	public static String UML2Tools_ENUMERATION_COMPARTMENT_VIEW_TYPE = "7013";
	public static String UML2Tools_NOTE_VIEW_TYPE = "Note";		//TODO
	
	private EObject eObject;
	
	public CollapseExternal() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(eObject);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Collapse External") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					TreeIterator iterator = EcoreUtil.getAllContents(
							Collections.singletonList(eObject));
					
					Package diagramPackage = null;
					if (eObject instanceof View) {
						Diagram diagram = ((View)eObject).getDiagram();
						Element semanticElement = getSemanticElement(diagram);
						if (semanticElement instanceof Package)
							diagramPackage = (Package) semanticElement;
					}
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (View.class.isInstance(child)) {
							View view = (View) child;
							EObject element = view.getElement();
							if (element instanceof Classifier
									&& ((Classifier)element).getNearestPackage() != diagramPackage) {
								
								setParentNameStyle(view, true);
								
								for (Iterator iter = view.getChildren().iterator(); iter.hasNext();) {
									View childView = (View) iter.next();
									if (isAttributeCompartment(childView)
											|| isOperationCompartment(childView)
											|| isEnumerationCompartment(childView)) {
										childView.setVisible(false);
									}
								}
							}
						}
//						else if (!(child instanceof Namespace)
//								&& !(child instanceof EAnnotation)) {
//							iterator.prune();
//						}
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

//	private boolean isNote(View view) {
//		String type = view.getType();
//		return RSM_NOTE_VIEW_TYPE.equals(type) 
//				|| UML2Tools_NOTE_VIEW_TYPE.equals(type);
//	}

//	private boolean isPackage(View view) {
//		String type = view.getType();
//		return RSM_PACKAGE_VIEW_TYPE.equals(type) 
//				|| UML2Tools_PACKAGE_VIEW_TYPE.equals(type);
//	}

//	private boolean isClassifier(View view) {
//		String type = view.getType();
//		return RSM_CLASS_VIEW_TYPE.equals(type) 
//				|| UML2Tools_CLASS_VIEW_TYPE.equals(type) 
//				|| UML2Tools_DATATYPE_VIEW_TYPE.equals(type)
//				|| UML2Tools_ENUMERATION_VIEW_TYPE.equals(type);
//	}

	private boolean isAttributeCompartment(View view) {
		String type = view.getType();
		return RSM_ATTRIBUTE_COMPARTMENT_VIEW_TYPE.equals(type) 
				|| UML2Tools_ATTRIBUTE_COMPARTMENT_VIEW_TYPE.equals(type);
	}

	private boolean isOperationCompartment(View view) {
		String type = view.getType();
		return RSM_OPERATION_COMPARTMENT_VIEW_TYPE.equals(type) 
				|| UML2Tools_OPERATION_COMPARTMENT_VIEW_TYPE.equals(type);
	}

	private boolean isEnumerationCompartment(View view) {
		String type = view.getType();
		return RSM_ENUMERATION_COMPARTMENT_VIEW_TYPE.equals(type) 
				|| UML2Tools_ENUMERATION_COMPARTMENT_VIEW_TYPE.equals(type);
	}
	
	private void setParentNameStyle(View view, boolean showParentName) {
		UMLShapeStyle style = (UMLShapeStyle) view.getStyle(UmlnotationPackage.Literals.UML_SHAPE_STYLE);
		if (style == null) {
			style = UmlnotationFactory.eINSTANCE.createUMLShapeStyle();
			view.getStyles().add(style);
		}
		if (showParentName)
			style.setShowParent(UMLParentDisplay.NAME_LITERAL);
		else
			style.setShowParent(UMLParentDisplay.NONE_LITERAL);
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
		
		action.setEnabled(eObject != null);
	}

}
