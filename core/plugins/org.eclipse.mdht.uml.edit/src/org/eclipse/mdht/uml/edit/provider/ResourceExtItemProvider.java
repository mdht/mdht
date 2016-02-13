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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.resource.ResourceItemProvider;

/**
 *
 * @version $Id: $
 */
public class ResourceExtItemProvider extends ResourceItemProvider {

	/**
	 * @param adapterFactory
	 */
	public ResourceExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		Collection<?> allChildren = super.getChildren(object);
		List<Object> children = new ArrayList<Object>();
		for (Object child : allChildren) {
			// filter out DynamicEObjectImpl used for stereotype instances
			if (!(child instanceof DynamicEObjectImpl)) {
				children.add(child);
			}
		}
		return children;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		Resource resource = (Resource) object;
		URI uri = resource.getURI();
		if (uri != null) {
			if ("uml".equals(uri.fileExtension())) {
				// return URI.createURI(getResourceLocator().getImage("full/obj16/ResourceUML").toString() + "#" + resource.getURI().fileExtension());
			}
		}

		return super.getImage(object);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.resource.ResourceItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		Resource resource = (Resource) object;
		// return resource.getURI() == null ? "" : resource.getURI().toString();
		String label = resource.getURI() == null
				? ""
				: resource.getURI().lastSegment();
		if (label == null) {
			// case where lastSegment() is null...
			label = resource.getURI().toString();
		}
		try {
			label = URLDecoder.decode(label, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// ignore and don't decode
		}

		if (resource.isModified()) {
			label = "* " + label;
		}
		return label;
	}

}
