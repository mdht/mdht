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
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.internal.UMLExtEditPlugin;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;


/**
 *
 * @version $Id: $
 */
public class AssociationExtItemProvider extends AssociationItemProvider
	implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public AssociationExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object getImage(Object object) {
		boolean navigable = false;

		for (Property memberEnd : ((Association) object).getMemberEnds()) {
			if (memberEnd.isNavigable())
				navigable = true;
		}

		if (navigable) {
			return overlayImage(object,UMLExtEditPlugin.INSTANCE.getImage(
					"full/obj16/Association_navigable")); //$NON-NLS-1$
		}
		else {
			return super.getImage(object);
		}
	}

	public String getText(Object object) {
		String label = ((Association)object).getName();
		if (label == null) {
			StringBuffer labelBuffer = new StringBuffer();
			for (Property end : ((Association)object).getMemberEnds()) {
				if (end.isNavigable()) {
					if (labelBuffer.length() > 0)
						labelBuffer.append("_");
					
					if (end.getName() != null)
						labelBuffer.append(end.getName());
					else if (end.getType() != null)
						labelBuffer.append(end.getType().getName());
					else
						labelBuffer.append("NULL");
				}
			}
			label = labelBuffer.toString();
		}
		return label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection getChildren(Object object) {
		Association association = (Association) object;
		List children = new ArrayList();
		children.addAll(association.getOwnedComments());
		children.addAll(association.getOwnedRules());
		children.addAll(association.getGeneralizations());
		// show only navigable ends
		for (Property end : association.getMemberEnds()) {
			if (end.isNavigable())
				children.add(end);
		}
		children.addAll(association.getClientDependencies());
		
		return children;
	}

	public Object getColumnImage(Object object, int columnIndex) {
		Association association = (Association) object;
		if (association.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getImage(object);
		case IUMLTableProperties.ANNOTATION_INDEX: {
			for (Profile profile : association.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotationImage(association);
					}
				}
			}
		}
		default:
			return null;
		}
	}

	public String getColumnText(Object element, int columnIndex) {
		Association association = (Association) element;
		if (association.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getText(element);
		case IUMLTableProperties.VISIBILITY_INDEX:
			if (VisibilityKind.PUBLIC_LITERAL == association.getVisibility())
				return "";
			else
				return association.getVisibility().getName();
		case IUMLTableProperties.ANNOTATION_INDEX: {
			for (Profile profile : association.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotation(association);
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
