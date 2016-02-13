/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Employ wrappers for non-owned elements (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.notation.NotationUtil;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.providers.GeneralizationItemProvider;

/**
 *
 * @version $Id: $
 */
public class GeneralizationExtItemProvider extends GeneralizationItemProvider
		implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public GeneralizationExtItemProvider(AdapterFactory adapterFactory) {
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

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = null;
		if (object != null) {
			Classifier general = ((Generalization) object).getGeneral();
			if (general != null) {
				label = UMLUtil.isSameModel((Generalization) object, general)
						? general.getName()
						: UMLUtil.getPackageQualifiedName(general);
			}
		}
		return label == null || label.length() == 0
				? getString("_UI_Generalization_type") //$NON-NLS-1$
				: label;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		Generalization generalization = (Generalization) object;
		List<Object> children = new ArrayList<Object>();

		// these are proper contents of the generalization. No wrapping!
		children.addAll(generalization.getOwnedComments());

		Classifier general = generalization.getGeneral();
		final EReference generalRef = UMLPackage.Literals.GENERALIZATION__GENERAL;
		if (general instanceof Class) {
			for (Property property : ((Class) general).getOwnedAttributes()) {
				if (property.getAssociation() == null) {
					children.add(wrap(generalization, generalRef, property, Notification.NO_INDEX));
				}
			}

			// include associations after attributes
			for (Property property : ((Class) general).getOwnedAttributes()) {
				if (property.getAssociation() != null && property.getOtherEnd() != null &&
						property.getOtherEnd().getType() == general) {
					children.add(wrap(generalization, generalRef, property.getAssociation(), Notification.NO_INDEX));
				}
			}

			for (Object next : general.getOwnedRules()) {
				children.add(wrap(generalization, generalRef, next, Notification.NO_INDEX));
			}
			for (Object next : general.getGeneralizations()) {
				children.add(wrap(generalization, generalRef, next, Notification.NO_INDEX));
			}
		}

		return children;
	}

	@Override
	protected boolean isWrappingNeeded(Object object) {
		// we wrap most children because they are cross-references (and not even direct ones, at that)
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Generalization.class)) {
			case UMLPackage.GENERALIZATION__GENERAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
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
		Generalization generalization = (Generalization) object;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getText(object);
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotation(generalization.getGeneral());
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
		// Generalization generalization = (Generalization) element;
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
		// Generalization generalization = (Generalization) element;
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
