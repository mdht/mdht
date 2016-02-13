/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - using qualified name in text if different model
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
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.edit.providers.PackageImportItemProvider;
import org.eclipse.uml2.uml.edit.providers.PackageItemProvider;

/**
 *
 * @version $Id: $
 */
public class PackageImportExtItemProvider extends PackageImportItemProvider
		implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public PackageImportExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		PackageImport pkgImport = (PackageImport) object;
		StringBuffer label = new StringBuffer();
		label.append("(");
		try {
			if (pkgImport.getImportedPackage() != null) {
				org.eclipse.uml2.uml.Package importedPkg = pkgImport.getImportedPackage();
				String qname = UMLUtil.isSameModel(pkgImport, importedPkg)
						? importedPkg.getName()
						: importedPkg.getQualifiedName();
				label.append(qname);
			}
		} catch (Exception e) {

		}
		label.append(")");

		return label.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Object> getChildren(Object object) {
		PackageImport pkgImport = (PackageImport) object;
		List<Object> children = new ArrayList<Object>();

		if (pkgImport.getImportedPackage() != null) {
			PackageItemProvider provider = (PackageItemProvider) ((UML2ExtendedAdapterFactory) this.adapterFactory).createPackageAdapter();
			children.addAll(provider.getChildren(pkgImport.getImportedPackage()));
		}
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
		// PackageImport pkgImport = (PackageImport) element;
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
		// PackageImport pkgImport = (PackageImport) element;
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
