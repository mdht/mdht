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
package org.openhealthtools.mdht.uml.cda.core.util;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.ModelFilter;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

/**
 * @author dcarlson
 * 
 */
public class CDAModelFilter extends ModelFilter {

	private Package valueSetPackage;

	private GreenDatatypesUtil greenDatatypesUtil;

	public CDAModelFilter(Package sourcePackage, Package filteredPackage) {
		super(sourcePackage, filteredPackage);

		greenDatatypesUtil = new GreenDatatypesUtil();
		greenDatatypesUtil.loadGreenDatatypesFromBase(
			sourcePackage.eResource().getResourceSet(), sourcePackage.eResource().getURI().trimSegments(1));
	}

	public Package getValueSetPackage() {
		return valueSetPackage;
	}

	@Override
	public Class filterClass(Class sourceClass) {
		Class filteredClass = super.filterClass(sourceClass);

		return filteredClass;
	}

	@Override
	protected void replacePropertyType(Property property) {
		Classifier newType = null;

		ValueSetConstraint constraint = TermProfileUtil.getValueSetConstraint(property);
		if (constraint != null) {
			ValueSetVersion valueSet = constraint.getReference();
			if (valueSet != null && valueSet.getBase_Enumeration().getOwnedLiterals().size() > 0) {
				Enumeration filteredEnum = addValueSetEnum(valueSet);
				newType = filteredEnum;
			}
		}

		if (newType == null) {
			newType = greenDatatypesUtil.getGreenTypeFor((Classifier) property.getType());
		}

		if (newType != null) {
			property.setType(newType);
		}
	}

	private Enumeration addValueSetEnum(ValueSetVersion valueSet) {
		if (valueSetPackage == null) {
			// valueSetPackage = getFilteredPackage().createNestedPackage(
			// getFilteredPackage().getName() + "-" + "ValueSets");

			valueSetPackage = getFilteredPackage();
		}

		Enumeration valueSetEnum = EcoreUtil.copy(valueSet.getBase_Enumeration());
		valueSetPackage.getOwnedTypes().add(valueSetEnum);
		UMLUtil.cloneStereotypes(valueSet.getBase_Enumeration(), valueSetEnum);

		return valueSetEnum;
	}
}
