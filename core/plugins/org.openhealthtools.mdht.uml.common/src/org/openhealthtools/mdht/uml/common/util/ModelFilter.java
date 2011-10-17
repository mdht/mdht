/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
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
package org.openhealthtools.mdht.uml.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class ModelFilter {
	private Package sourcePackage;

	private Package filteredPackage;

	private Map<String, Class> filteredMapping;

	public ModelFilter(Package sourcePackage, Package filteredPackage) {
		this.sourcePackage = sourcePackage;
		this.filteredPackage = filteredPackage;
		filteredMapping = new HashMap<String, Class>();

		// assure that all proxies are resolved.
		if (sourcePackage != null) {
			EcoreUtil.resolveAll(sourcePackage.eResource());
		}
		if (filteredPackage != null) {
			EcoreUtil.resolveAll(filteredPackage.eResource());
		}
	}

	protected boolean isXMLAttribute(Property property) {
		Stereotype eAttribute = property.getAppliedStereotype("Ecore::EAttribute");
		return (eAttribute != null)
				? true
				: false;
	}

	public Class filterClass(Class sourceClass) {
		Class filteredClass = filteredMapping.get(EcoreUtil.getURI(sourceClass).toString());
		if (filteredClass == null) {
			filteredClass = EcoreUtil.copy(sourceClass);
			filteredPackage.getOwnedTypes().add(filteredClass);
			UMLUtil.cloneStereotypes(sourceClass, filteredClass);
			filteredMapping.put(EcoreUtil.getURI(sourceClass).toString(), filteredClass);

			// rename using business name (use sourceClass to get corresponding .properties)
			String businessName = NamedElementUtil.getBusinessName(sourceClass);
			if (businessName != null) {
				businessName = UML2Util.getValidJavaIdentifier(businessName);
				businessName = businessName.substring(0, 1).toUpperCase() + businessName.substring(1);

				filteredClass.setName(businessName);
			}

			List<Property> sourceAttributes = new ArrayList<Property>(sourceClass.getOwnedAttributes());
			for (Property property : sourceAttributes) {
				Property mappedProperty = filteredClass.getOwnedAttribute(property.getName(), property.getType());
				if (mappedProperty == null) {
					// this should never happen
					continue;
				}

				// remove filtered properties
				if (NamedElementUtil.isFiltered(property)) {
					filteredClass.getOwnedAttributes().remove(mappedProperty);
					mappedProperty.destroy();
					continue;
				}

				Type filteredType = null;
				if (property.getType() instanceof Class &&
						property.getType().getNearestPackage() == property.getNearestPackage()) {
					filteredType = filterClass((Class) property.getType());
					mappedProperty.setType(filteredType);
				} else {
					filteredType = property.getType();
				}

				// copy association
				if (property.getAssociation() != null) {
					Association assocClone = (Association) filteredPackage.createOwnedType(
						null, UMLPackage.Literals.ASSOCIATION);
					assocClone.getMemberEnds().add(mappedProperty);
					Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
					ownedEnd.setType(filteredClass);
					assocClone.getOwnedEnds().add(ownedEnd);

					UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
				}

				// rename using business name (use sourceClass property to get corresponding .properties)
				businessName = NamedElementUtil.getBusinessName(property);
				if (businessName != null) {
					businessName = UML2Util.getValidJavaIdentifier(businessName);
					businessName = businessName.substring(0, 1).toLowerCase() + businessName.substring(1);

					mappedProperty.setName(businessName);
				}
			}
		}

		return filteredClass;
	}

}
