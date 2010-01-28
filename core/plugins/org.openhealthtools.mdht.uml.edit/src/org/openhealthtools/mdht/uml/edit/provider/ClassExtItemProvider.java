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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.ClassItemProvider;
import org.openhealthtools.mdht.uml.common.notation.ClassNotationUtil;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;


/**
 *
 * @version $Id: $
 */
public class ClassExtItemProvider extends ClassItemProvider
	implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public ClassExtItemProvider(AdapterFactory adapterFactory) {
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
		String label = ((org.eclipse.uml2.uml.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") : //$NON-NLS-1$
			label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection getChildren(Object object) {
		Class clazz = (Class) object;
		List children = new ArrayList();
		children.addAll(clazz.getOwnedComments());
		for (Property property : clazz.getOwnedAttributes()) {
			if (property.getAssociation() == null) {
				children.add(property);
			}
		}
		// include associations after attributes
		for (Property property : clazz.getOwnedAttributes()) {
			if (property.getAssociation() != null
					&& property.getOtherEnd().getType() == clazz) {
				children.add(property.getAssociation());
			}
		}
		children.addAll(clazz.getOwnedOperations());
		children.addAll(clazz.getNestedClassifiers());
		children.addAll(clazz.getClientDependencies());
		children.addAll(clazz.getOwnedRules());
		children.addAll(clazz.getGeneralizations());
		
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
		Class classifier = (Class) element;
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return classifier.getName();
		case IUMLTableProperties.VISIBILITY_INDEX:
			if (VisibilityKind.PUBLIC_LITERAL == classifier.getVisibility())
				return "";
			else
				return classifier.getVisibility().getName();
		case IUMLTableProperties.ANNOTATION_INDEX: {
			for (Profile profile : classifier.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotation(classifier);
					}
				}
			}
			return ClassNotationUtil.getCustomLabel(classifier,
					IUMLNotation.DEFAULT_UML_CLASS_ANNOTATIONS);
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
