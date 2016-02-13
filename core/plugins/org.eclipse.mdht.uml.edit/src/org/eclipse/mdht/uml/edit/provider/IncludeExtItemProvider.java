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
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.edit.providers.IncludeItemProvider;

/**
 *
 */
public class IncludeExtItemProvider extends IncludeItemProvider implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public IncludeExtItemProvider(AdapterFactory adapterFactory) {
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
		Include include = (Include) object;
		StringBuffer label = new StringBuffer();
		if (include.getAddition() != null) {
			UseCase addition = include.getAddition();
			String qname = UMLUtil.isSameModel(include, addition)
					? addition.getName()
					: addition.getQualifiedName();
			label.append(qname);
		}

		return label.length() == 0
				? getString("_UI_Include_type") //$NON-NLS-1$
				: label.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Element> getChildren(Object object) {
		Include include = (Include) object;
		List<Element> children = new ArrayList<Element>();

		children.addAll(include.getOwnedComments());

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
		// Include dependency = (Include) element;
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
		// Include dependency = (Include) element;
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
