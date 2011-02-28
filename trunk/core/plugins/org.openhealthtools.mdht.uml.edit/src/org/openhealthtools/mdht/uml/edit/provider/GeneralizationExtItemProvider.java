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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.providers.GeneralizationItemProvider;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;

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

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getImage(java.lang.Object)
	 */
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getText(java.lang.Object)
	 */
	public String getText(Object object) {
		Classifier general = ((Generalization)object).getGeneral();
		String label = UMLUtil.isSameModel((Generalization)object, general)
			? general.getName() : general.getQualifiedName();
		return label == null || label.length() == 0 ?
			getString("_UI_Generalization_type") : //$NON-NLS-1$
			label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection<Element> getChildren(Object object) {
		Generalization generalization = (Generalization) object;
		List<Element> children = new ArrayList<Element>();
		children.addAll(generalization.getOwnedComments());

		Classifier general = generalization.getGeneral();
		if (general instanceof Class) {
			for (Property property : ((Class)general).getOwnedAttributes()) {
				if (property.getAssociation() == null) {
					children.add(property);
				}
			}
			// include associations after attributes
			for (Property property : ((Class)general).getOwnedAttributes()) {
				if (property.getAssociation() != null && property.getOtherEnd() != null
						&& property.getOtherEnd().getType() == general) {
					children.add(property.getAssociation());
				}
			}
			children.addAll(general.getOwnedRules());
			children.addAll(general.getGeneralizations());
		}
		
		return children;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Generalization.class)) {
			case UMLPackage.GENERALIZATION__GENERAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
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
		Generalization generalization = (Generalization) object;
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getText(object);
		case IUMLTableProperties.ANNOTATION_INDEX: {
			for (Profile profile : generalization.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotation(generalization.getGeneral());
					}
				}
			}
		}
		default:
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
//		Generalization generalization = (Generalization) element;
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
//		Generalization generalization = (Generalization) element;
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
