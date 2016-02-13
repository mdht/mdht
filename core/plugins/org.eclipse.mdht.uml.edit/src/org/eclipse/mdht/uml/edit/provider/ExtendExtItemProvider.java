/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.edit.providers.ExtendItemProvider;

/**
 *
 */
public class ExtendExtItemProvider extends ExtendItemProvider implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public ExtendExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.DependencyItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.DependencyItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		Extend extend = (Extend) object;
		StringBuffer label = new StringBuffer();
		if (extend.getExtendedCase() != null) {
			UseCase extendedCase = extend.getExtendedCase();
			String qname = UMLUtil.isSameModel(extend, extendedCase)
					? extendedCase.getName()
					: extendedCase.getQualifiedName();
			label.append(qname);
		}

		return label.length() == 0
				? getString("_UI_Extend_type") //$NON-NLS-1$
				: label.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Element> getChildren(Object object) {
		Extend extend = (Extend) object;
		List<Element> children = new ArrayList<Element>();

		children.addAll(extend.getOwnedComments());

		return children;
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getText(object);
			default:
				return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		// Extend dependency = (Extend) element;
		//
		// if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
		//
		// }
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		// Extend dependency = (Extend) element;
		//
		// if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
		//
		// }
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {

	}

}
