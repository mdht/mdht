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
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.AssociationClassItemProvider;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;


/**
 *
 * @version $Id: $
 */
public class AssociationClassExtItemProvider extends AssociationClassItemProvider
	implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public AssociationClassExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.ClassItemProvider#getImage(java.lang.Object)
	 */
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.ClassItemProvider#getText(java.lang.Object)
	 */
	public String getText(Object object) {
		String label = ((AssociationClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AssociationClass_type") : //$NON-NLS-1$
			label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection getChildren(Object object) {
		AssociationClass clazz = (AssociationClass) object;
		List children = new ArrayList();
		children.addAll(clazz.getOwnedComments());
		children.addAll(clazz.getOwnedRules());
		children.addAll(clazz.getGeneralizations());
		children.addAll(clazz.getOwnedAttributes());
		children.addAll(clazz.getOwnedEnds());
		children.addAll(clazz.getOwnedOperations());
		children.addAll(clazz.getNestedClassifiers());
		children.addAll(clazz.getClientDependencies());
		
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

	public String getColumnText(Object element, int columnIndex) {
		Classifier classifier = (Classifier) element;
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return classifier.getName();
		case IUMLTableProperties.VISIBILITY_INDEX:
			if (VisibilityKind.PUBLIC_LITERAL == classifier.getVisibility())
				return "";
			else
				return classifier.getVisibility().getName();
		default:
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		}
		else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Classifier classifier = (Classifier) element;
		
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return classifier.getName();
		}
		else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return new Integer(classifier.getVisibility().getValue());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		NamedElementOperations.modify(element, property, value);
	}

}
