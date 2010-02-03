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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.edit.providers.ConstraintItemProvider;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;

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

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.CommentItemProvider#getImage(java.lang.Object)
	 */
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.CommentItemProvider#getText(java.lang.Object)
	 */
	public String getText(Object object) {
		String label = ((Constraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Constraint_type") : //$NON-NLS-1$
			label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection getChildren(Object object) {
		Constraint constraint = (Constraint) object;
		List children = new ArrayList();
		children.addAll(constraint.getOwnedComments());
		
		return children;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.CommentItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		// any change to Constraint should refresh the view 
		// (e.g. stereotype assigned or stereotype property changed)
		fireNotifyChanged(new ViewerNotification(notification, notification
				.getNotifier(), true, true));
	}

	public Object getColumnImage(Object object, int columnIndex) {
		Constraint constraint = (Constraint) object;
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getImage(object);
		case IUMLTableProperties.ANNOTATION_INDEX: {
			// eResource is null for deleted elements
			if (constraint.eResource() != null) {
				for (Profile profile : constraint.getNearestPackage().getAllAppliedProfiles()) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotationImage(constraint);
					}
				}
			}
		}
		default:
			return null;
		}
	}

	public String getColumnText(Object object, int columnIndex) {
		Constraint constraint = (Constraint) object;

		String body = null;
		String languages = "";
		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			for (int i=0; i<((OpaqueExpression) spec).getLanguages().size(); i++) {
				String lang = ((OpaqueExpression) spec).getLanguages().get(i);
				if (languages.length() > 0)
					languages += ", ";
				languages += lang;
				if (body == null)
					body = ((OpaqueExpression) spec).getBodies().get(i);
			}
		}
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getText(object);
		case IUMLTableProperties.ANNOTATION_INDEX:
			return languages;
		case IUMLTableProperties.DEFAULT_VALUE_INDEX:
			return (body != null) ? body : "";
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
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Constraint constraint = (Constraint) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return constraint.getName();
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
