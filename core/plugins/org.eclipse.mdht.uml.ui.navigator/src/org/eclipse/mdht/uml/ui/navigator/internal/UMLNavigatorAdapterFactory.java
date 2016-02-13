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
package org.eclipse.mdht.uml.ui.navigator.internal;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.mdht.uml.common.ui.util.IResourceConstants;
import org.eclipse.ui.IActionFilter;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;

/**
 * An adapter factory for returning UML Element from UMLDomainNavigatorItem.
 *
 */
public class UMLNavigatorAdapterFactory implements IAdapterFactory {

	public static final String PROJECT_EXPLORER_ID = "org.eclipse.ui.navigator.ProjectExplorer"; //$NON-NLS-1$

	final IActionFilter umlActionFilter = new UMLActionFilter();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
	 */
	public Object getAdapter(Object adaptableObject, java.lang.Class adapterType) {
		if (adapterType == IActionFilter.class) {
			return umlActionFilter;
		}
		if (adapterType == IUndoContext.class) {
			TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
				IResourceConstants.EDITING_DOMAIN_ID);

			return ((IWorkspaceCommandStack) editingDomain.getCommandStack()).getDefaultUndoContext();
		}

		EObject eObject = null;
		if (adaptableObject instanceof IAdaptable) {
			eObject = ((IAdaptable) adaptableObject).getAdapter(EObject.class);

			if (adapterType == EObject.class) {
				return eObject;
			}
		}

		Element element = null;
		if (adaptableObject instanceof Element) {
			element = (Element) adaptableObject;
		}
		// don't want dependency on notation
		// else if (adaptableObject instanceof View) {
		// eObject = ((View) adaptableObject).getElement();
		// }

		if (eObject instanceof Element) {
			element = (Element) eObject;
		}
		if (element != null && adapterType.isAssignableFrom(element.getClass())) {
			return element;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	public java.lang.Class[] getAdapterList() {
		return new java.lang.Class[] { IActionFilter.class, IUndoContext.class,

				EObject.class, Element.class, NamedElement.class, Package.class, Classifier.class, Class.class,
				DataType.class, Interface.class, Enumeration.class, PrimitiveType.class, Property.class,
				Generalization.class };
	}

}
