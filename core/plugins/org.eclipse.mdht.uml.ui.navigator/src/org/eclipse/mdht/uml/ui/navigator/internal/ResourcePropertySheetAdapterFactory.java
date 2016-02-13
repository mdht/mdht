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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * An property sheet page adapter factory for the Project Explorer.
 *
 */
public class ResourcePropertySheetAdapterFactory implements IAdapterFactory {

	final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {

		public String getContributorId() {
			return "org.eclipse.ui.navigator.ProjectExplorer"; //$NON-NLS-1$
		}
	};

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 * java.lang.Class)
	 */
	public Object getAdapter(Object adaptableObject, Class adapterType) {

		if (adaptableObject instanceof IResource && ITabbedPropertySheetPageContributor.class == adapterType) {
			return propertySheetPageContributor;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	public Class[] getAdapterList() {
		return new Class[] { ITabbedPropertySheetPageContributor.class };
	}

}
