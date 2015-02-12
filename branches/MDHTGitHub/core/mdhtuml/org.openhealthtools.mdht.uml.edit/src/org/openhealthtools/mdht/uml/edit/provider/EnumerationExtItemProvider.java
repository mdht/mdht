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
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.EnumerationItemProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;

/**
 * 
 * @version $Id: $
 */
public class EnumerationExtItemProvider extends EnumerationItemProvider implements ITableItemLabelProvider,
		ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public EnumerationExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.EnumerationItemProvider#getImage(java.lang.Object)
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
	 * @see org.eclipse.uml2.uml.provider.EnumerationItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = getName((Enumeration) object);
		return label == null || label.length() == 0
				? getString("_UI_Enumeration_type") : //$NON-NLS-1$
				label;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Object> getChildren(Object object) {
		Enumeration datatype = (Enumeration) object;
		List<Object> children = new ArrayList<Object>();

		/* Applied Stereotypes */
		// for (EObject stereotypeApplication : datatype.getStereotypeApplications()) {
		// children.add(stereotypeApplication);
		// }

		children.addAll(datatype.getOwnedComments());
		children.addAll(datatype.getOwnedRules());
		children.addAll(datatype.getGeneralizations());
		children.addAll(datatype.getOwnedAttributes());
		children.addAll(datatype.getOwnedLiterals());
		children.addAll(datatype.getClientDependencies());

		return children;
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotationImage((Classifier) object);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		Classifier classifier = (Classifier) element;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getName(classifier);
			case IUMLTableProperties.VISIBILITY_INDEX:
				if (VisibilityKind.PUBLIC_LITERAL == classifier.getVisibility()) {
					return "";
				} else {
					return classifier.getVisibility().getName();
				}
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotation(classifier);
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
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
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
		Classifier classifier = (Classifier) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return classifier.getName();
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return new Integer(classifier.getVisibility().getValue());
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
