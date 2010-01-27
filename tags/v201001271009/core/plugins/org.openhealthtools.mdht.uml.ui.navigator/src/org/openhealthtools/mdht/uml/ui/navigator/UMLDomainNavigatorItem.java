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
package org.openhealthtools.mdht.uml.ui.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

public class UMLDomainNavigatorItem extends UMLAbstractNavigatorItem {

	static {
		final Class[] supportedTypes = new Class[] { EObject.class, IPropertySource.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof UMLDomainNavigatorItem) {
					UMLDomainNavigatorItem domainNavigatorItem = (UMLDomainNavigatorItem) adaptableObject;
					EObject eObject = domainNavigatorItem.getEObject();
					if (adapterType == EObject.class) {
						return eObject;
					}
					if (adapterType == IPropertySource.class) {
						return domainNavigatorItem.getPropertySourceProvider().getPropertySource(eObject);
					}
				}

				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, UMLDomainNavigatorItem.class);
	}

	private EObject myEObject;

	private IPropertySourceProvider myPropertySourceProvider;

	public UMLDomainNavigatorItem(EObject eObject, Object parent, IPropertySourceProvider propertySourceProvider) {
		super(parent);
		myEObject = eObject;
		myPropertySourceProvider = propertySourceProvider;
	}

	public EObject getEObject() {
		return myEObject;
	}

	public IPropertySourceProvider getPropertySourceProvider() {
		return myPropertySourceProvider;
	}

	public boolean equals(Object obj) {
		if (obj instanceof UMLDomainNavigatorItem) {
			return EcoreUtil.getURI(getEObject()).equals(EcoreUtil.getURI(((UMLDomainNavigatorItem) obj).getEObject()));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return EcoreUtil.getURI(getEObject()).hashCode();
	}

}
