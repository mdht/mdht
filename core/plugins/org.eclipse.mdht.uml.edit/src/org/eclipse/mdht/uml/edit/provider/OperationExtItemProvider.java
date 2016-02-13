/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for showing business names (or not)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.mdht.uml.edit.provider.operations.NamedElementOperations;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.edit.providers.OperationItemProvider;

/**
 *
 * @version $Id: $
 */
public class OperationExtItemProvider extends OperationItemProvider implements ITableItemLabelProvider, ICellModifier {
	/**
	 * @param adapterFactory
	 */
	public OperationExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	protected String getName(NamedElement namedElement) {
		AdapterFactory adapterFactory = getAdapterFactory();
		return adapterFactory instanceof UML2ExtendedAdapterFactory &&
				((UML2ExtendedAdapterFactory) adapterFactory).isShowBusinessNames()
						? NamedElementUtil.getBusinessName(namedElement)
						: namedElement.getName();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = getName((Operation) object);
		return label == null || label.length() == 0
				? getString("_UI_Operation_type") //$NON-NLS-1$
				: label;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection getChildren(Object object) {
		// Operation operation = (Operation) object;
		// List<Element> children = new ArrayList<Element>();
		//
		// children.addAll(operation.getOwnedComments());
		// children.addAll(operation.getOwnedParameters());
		// children.add(operation.getReturnResult());
		//
		// return children;

		return super.getChildren(object);
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
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return ((NamedElement) element).getName();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		NamedElementOperations.modify(element, property, value);
	}
}
