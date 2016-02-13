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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.notation.NotationUtil;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.mdht.uml.edit.provider.operations.NamedElementOperations;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.edit.providers.ConstraintItemProvider;

/**
 *
 * @version $Id: $
 */
public class ConstraintExtItemProvider extends ConstraintItemProvider
		implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public ConstraintExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.CommentItemProvider#getImage(java.lang.Object)
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
	 * @see org.eclipse.uml2.uml.provider.CommentItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = getName((Constraint) object);
		return label == null || label.length() == 0
				? getString("_UI_Constraint_type") //$NON-NLS-1$
				: label;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Element> getChildren(Object object) {
		Constraint constraint = (Constraint) object;
		List<Element> children = new ArrayList<Element>();
		children.addAll(constraint.getOwnedComments());

		return children;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.CommentItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		// any change to Constraint should refresh the view
		// (e.g. stereotype assigned or stereotype property changed)
		fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		Constraint constraint = (Constraint) object;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotationImage(constraint);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		Constraint constraint = (Constraint) object;

		String body = null;
		String languages = "";
		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			for (int i = 0; i < ((OpaqueExpression) spec).getLanguages().size(); i++) {
				String lang = ((OpaqueExpression) spec).getLanguages().get(i);
				if (languages.length() > 0) {
					languages += ", ";
				}
				languages += lang;
				if (body == null) {
					body = ((OpaqueExpression) spec).getBodies().get(i);
				}
			}
		}

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getText(object);
			case IUMLTableProperties.ANNOTATION_INDEX:
				return languages;
			case IUMLTableProperties.DEFAULT_VALUE_INDEX:
				return (body != null)
						? body
						: "";
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
		Constraint constraint = (Constraint) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return constraint.getName();
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
