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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.notation.NotationUtil;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.mdht.uml.edit.provider.operations.NamedElementOperations;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.ComponentItemProvider;

/**
 *
 */
public class ComponentExtItemProvider extends ComponentItemProvider implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public ComponentExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.ClassItemProvider#getImage(java.lang.Object)
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
	 * @see org.eclipse.uml2.uml.provider.ClassItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = getName((org.eclipse.uml2.uml.Class) object);
		return label == null || label.length() == 0
				? getString("_UI_Component_type") //$NON-NLS-1$
				: label;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Element> getChildren(Object object) {
		Component component = (Component) object;
		List<Element> children = new ArrayList<Element>();
		children.addAll(component.getOwnedComments());
		for (Property property : component.getOwnedAttributes()) {
			if (property.getAssociation() == null) {
				children.add(property);
			}
		}
		// include associations after attributes
		for (Property property : component.getOwnedAttributes()) {
			if (property.getAssociation() != null && property.getOtherEnd().getType() == component) {
				children.add(property.getAssociation());
			}
		}
		children.addAll(component.getOwnedOperations());
		children.addAll(component.getNestedClassifiers());
		children.addAll(component.getClientDependencies());
		children.addAll(component.getOwnedRules());
		children.addAll(component.getGeneralizations());

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
		Class classifier = (Class) element;

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
