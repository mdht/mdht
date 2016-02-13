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
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

public class UMLSheetLabelProvider extends DecoratingLabelProvider {

	public UMLSheetLabelProvider() {
		super(new AdapterFactoryLabelProvider(createAdapterFactory()), null);
	}

	protected static ComposedAdapterFactory createAdapterFactory() {
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	protected static void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new UMLItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	@Override
	public String getText(Object element) {
		Object selected = unwrap(element);
		// if (selected instanceof UMLNavigatorGroup) {
		// return ((UMLNavigatorGroup) selected).getGroupName();
		// }
		return super.getText(selected);
	}

	@Override
	public Image getImage(Object element) {
		return super.getImage(unwrap(element));
	}

	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return unwrap(((IStructuredSelection) element).getFirstElement());
		}
		if (element instanceof EditPart) {
			return unwrapEditPart((EditPart) element);
		}
		if (element instanceof IAdaptable) {
			EObject eObject = ((IAdaptable) element).getAdapter(EObject.class);
			if (eObject instanceof View) {
				eObject = unwrapView((View) eObject);
			}
			if (eObject != null) {
				return eObject;
			}
		}
		return element;
	}

	private Object unwrapEditPart(EditPart p) {
		if (p.getModel() instanceof View) {
			return unwrapView((View) p.getModel());
		}
		return p.getModel();
	}

	private EObject unwrapView(View view) {
		return view.getElement() == null
				? view
				: view.getElement();
	}
}
