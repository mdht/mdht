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
package org.openhealthtools.mdht.uml.edit.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

/**
 *
 * @version $Id: $
 */
public class ResourceExtendedAdapterFactory extends
		ResourceItemProviderAdapterFactory {

	public ResourceExtendedAdapterFactory() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory#createResourceAdapter()
	 */
	public Adapter createResourceAdapter() {
	    return new ResourceExtItemProvider(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory#createResourceSetAdapter()
	 */
	public Adapter createResourceSetAdapter() {
	    return new ResourceSetExtItemProvider(this);
	}

}
