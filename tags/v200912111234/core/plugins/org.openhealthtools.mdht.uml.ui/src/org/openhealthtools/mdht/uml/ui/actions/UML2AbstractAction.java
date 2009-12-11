/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.ui.actions;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.ui.util.EditingDomainUtil;

public abstract class UML2AbstractAction
		implements IObjectActionDelegate, IViewActionDelegate, IEditorActionDelegate {

	protected IWorkbenchPart activePart;
	protected ISelection currentSelection;
	protected TransactionalEditingDomain editingDomain;
	
	public UML2AbstractAction() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	public void init(IViewPart view) {
		activePart = view;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		activePart = targetEditor;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;

		editingDomain = EditingDomainUtil.getEditingDomain(
				((IStructuredSelection)selection).toList());
		action.setEnabled(editingDomain != null);
	}

	protected boolean isReadOnly() {
		if (editingDomain != null) {
			for (Iterator elements = ((IStructuredSelection) currentSelection)
					.iterator(); elements.hasNext();) {
	
				Object element = elements.next();
				if (element instanceof EObject
						&& editingDomain.isReadOnly(((EObject)element).eResource())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	protected View getSelectedView() {
		for (Iterator elements = ((IStructuredSelection) currentSelection)
				.iterator(); elements.hasNext();) {

			Object element = elements.next();
			View view = (View) ((IAdaptable) element)
					.getAdapter(View.class);

			if (view != null) {
				return view;
			}
		}
		
		return null;
	}

	protected Element getSelectedElement() {
		for (Iterator elements = ((IStructuredSelection) currentSelection)
				.iterator(); elements.hasNext();) {

			Object element = elements.next();
			EObject eObject = null;
			if (element instanceof IAdaptable) {
				// Try to adapt to View first, since Notation OK
				eObject = (EObject) ((IAdaptable) element)
						.getAdapter(View.class);
	
				if (eObject == null) {
					eObject = (EObject) ((IAdaptable) element)
							.getAdapter(EObject.class);
				}
			}
			else if (element instanceof EObject) {
				eObject = (EObject) element;
			}
			
			if (View.class.isInstance(eObject)) {
				eObject = ((View)eObject).getElement();
			}
			
			if (Element.class.isInstance(eObject)) {
				return (Element) eObject;
			}
		}
		
		return null;
	}

	/**
	 * Find next unused property name, using 'name' as the base.
	 */
	protected String getUniquePropertyName(Class owner, String name) {
		int seqNo = 2;
		String uniqueName = name;

		while (null != owner.getOwnedMember(uniqueName, false, UMLPackage.eINSTANCE.getProperty())) {
			uniqueName = name + String.valueOf(seqNo++);
		}

		return uniqueName;
	}

	/**
	 * Find next unused property name, using 'name' as the base.
	 */
	protected String getUniquePropertyName(DataType owner, String name) {
		int seqNo = 1;
		String uniqueName;

		do {
			uniqueName = name + String.valueOf(seqNo++);
		} while (null != owner.getOwnedMember(uniqueName, false, UMLPackage.eINSTANCE.getProperty()));

		return uniqueName;
	}
	
	/**
	 * Find next unused type name, using 'name' as the base.
	 */
	protected String getUniqueTypeName(Package owner, String name) {
		int seqNo = 1;
		String uniqueName;

		do {
			uniqueName = name + String.valueOf(seqNo++);
		} while (null != owner.getOwnedType(uniqueName));

		return uniqueName;
	}

	/**
	 * Find next unused type name, using 'name' as the base.
	 */
	protected String getUniqueTypeName(Class owner, String name) {
		int seqNo = 1;
		String uniqueName;

		do {
			uniqueName = name + String.valueOf(seqNo++);
		} while (null != owner.getNestedClassifier(uniqueName));

		return uniqueName;
	}
	
	/**
	 * Find next unused package name, using 'name' as the base.
	 */
	protected String getUniquePackageName(Package owner, String name) {
		int seqNo = 1;
		String uniqueName;

		do {
			uniqueName = name + String.valueOf(seqNo++);
		} while (null != owner.getNestedPackage(uniqueName));

		return uniqueName;
	}
	
}
