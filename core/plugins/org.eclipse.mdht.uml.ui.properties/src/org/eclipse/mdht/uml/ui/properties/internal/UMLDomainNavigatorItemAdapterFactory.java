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
package org.eclipse.mdht.uml.ui.properties.internal;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * An adapter factory for UMLDomainNavigatorItem.
 *
 */
public class UMLDomainNavigatorItemAdapterFactory implements IAdapterFactory {

	final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {

		public String getContributorId() {
			return "org.eclipse.mdht.uml.ui.properties"; //$NON-NLS-1$
		}
	};

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 * java.lang.Class)
	 */
	public Object getAdapter(Object adaptableObject, java.lang.Class adapterType) {
		if (adapterType == ITabbedPropertySheetPageContributor.class) {
			return propertySheetPageContributor;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	public java.lang.Class[] getAdapterList() {
		return new java.lang.Class[] { ITabbedPropertySheetPageContributor.class };
	}

}
