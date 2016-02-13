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
package org.eclipse.mdht.uml.edit.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceSetItemProvider;

/**
 *
 * @version $Id: $
 */
public class ResourceSetExtItemProvider extends ResourceSetItemProvider {

	/**
	 * @param adapterFactory
	 */
	public ResourceSetExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.resource.ResourceSetItemProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Collection getChildren(Object object) {
		return super.getChildren(object);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.resource.ResourceSetItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		// return UMLExtEditPlugin.INSTANCE.getImage("full/obj16/ResourceSet");
		return super.getImage(object);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.resource.ResourceSetItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

}
