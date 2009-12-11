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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.edit.providers.DependencyItemProvider;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;

/**
 *
 * @version $Id: $
 */
public class DependencyExtItemProvider extends DependencyItemProvider
	implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public DependencyExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.DependencyItemProvider#getImage(java.lang.Object)
	 */
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.DependencyItemProvider#getText(java.lang.Object)
	 */
	public String getText(Object object) {
		Dependency dependency = (Dependency) object;
		StringBuffer label = new StringBuffer();
		for (Iterator iter = dependency.getSuppliers().iterator(); iter.hasNext();) {
			NamedElement element = (NamedElement) iter.next();
			if (label.length() > 0)
				label.append(", ");
			label.append(element.getName());
		}
		return label.length() == 0 ?
			getString("_UI_Dependency_type") : //$NON-NLS-1$
			label.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection getChildren(Object object) {
		Dependency dependency = (Dependency) object;
		List children = new ArrayList();

		children.addAll(dependency.getOwnedComments());
		
		return children;
	}

	public Object getColumnImage(Object object, int columnIndex) {
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getImage(object);
		default:
			return null;
		}
	}

	public String getColumnText(Object object, int columnIndex) {
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getText(object);
		default:
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
//		Dependency dependency = (Dependency) element;
//		
//		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
//			
//		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
//		Dependency dependency = (Dependency) element;
//		
//		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
//			
//		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		
	}

}
