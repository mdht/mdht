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

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;

public class EObjectItemProvider extends ReflectiveItemProvider implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public EObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	@Override
	public Collection<?> getChildren(Object object) {
		return super.getChildren(object);
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		switch (columnIndex) {
			case 0:
				return getImage(object);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		EObject eObject = (EObject) element;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getText(eObject);
			case IUMLTableProperties.VISIBILITY_INDEX:
				return null;
			case IUMLTableProperties.ANNOTATION_INDEX:
				// return NotationUtil.getAnnotation(eObject);
				return null;
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
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
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
