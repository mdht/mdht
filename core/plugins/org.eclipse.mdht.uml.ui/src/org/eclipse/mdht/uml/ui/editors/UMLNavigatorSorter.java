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
package org.eclipse.mdht.uml.ui.editors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

public class UMLNavigatorSorter extends ViewerSorter {

	private static final int ASSOCIATIONS_CATEGORY = 1001;

	@Override
	public int category(Object element) {
		if (element instanceof UMLDomainNavigatorItem) {
			UMLDomainNavigatorItem item = (UMLDomainNavigatorItem) element;
			if (item.getEObject() instanceof Association) {
				return ASSOCIATIONS_CATEGORY;
			}
		}
		return 0;
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		// if (e1 instanceof UMLNavigatorGroup && e2 instanceof UMLDomainNavigatorItem) {
		// return -1;
		// }
		if (e1 instanceof UMLDomainNavigatorItem && e2 instanceof UMLDomainNavigatorItem) {
			EClass e1Class = ((UMLDomainNavigatorItem) e1).getEObject().eClass();
			EClass e2Class = ((UMLDomainNavigatorItem) e2).getEObject().eClass();
			if (e1Class != e2Class) {
				return getComparator().compare(e1Class.getName(), e2Class.getName());
			}
		}
		if (e1 instanceof EObject && e2 instanceof EObject) {
			EClass e1Class = ((EObject) e1).eClass();
			EClass e2Class = ((EObject) e2).eClass();
			if (e1Class != e2Class) {
				return getComparator().compare(e1Class.getName(), e2Class.getName());
			}
		}
		if (e1 instanceof Property && e2 instanceof Property) {
			// don't sort properties
			return 0;
		}

		return super.compare(viewer, e1, e2);
	}

}
