/*******************************************************************************
 * Copyright (c) 2013 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.reflection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.edit.provider.StereotypeApplicationExtItemProvider;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @author dcarlson
 *
 */
public class ExtendedReflectiveItemProviderAdapterFactory extends ReflectiveItemProviderAdapterFactory {

	public ExtendedReflectiveItemProviderAdapterFactory() {
		super();

		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ICellModifier.class);
	}

	protected StereotypeApplicationExtItemProvider stereotypeApplicationItemProviderAdapter;

	protected EObjectItemProvider eObjectItemProviderAdapter;

	@Override
	public Adapter createAdapter(Notifier target) {
		if (target instanceof EObject) {
			// Stereotype stereotype = UMLUtil.getStereotype((EObject)target);
			Element baseElement = UMLUtil.getBaseElement((EObject) target);
			if (baseElement != null) {
				if (stereotypeApplicationItemProviderAdapter == null) {
					stereotypeApplicationItemProviderAdapter = new StereotypeApplicationExtItemProvider(this);
				}
				return stereotypeApplicationItemProviderAdapter;
			} else {
				if (eObjectItemProviderAdapter == null) {
					eObjectItemProviderAdapter = new EObjectItemProvider(this);
				}
				return eObjectItemProviderAdapter;
			}
		}

		// else use general reflective provider
		return reflectiveItemProviderAdapter;
	}

}
