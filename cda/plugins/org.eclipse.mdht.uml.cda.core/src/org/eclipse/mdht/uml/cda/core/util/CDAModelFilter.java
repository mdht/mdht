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
package org.eclipse.mdht.uml.cda.core.util;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.profile.SeverityKind;
import org.eclipse.mdht.uml.cda.core.profile.Validation;
import org.eclipse.mdht.uml.common.util.ModelFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

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
	protected boolean isDefaultHidden(NamedElement element) {
		boolean hidden = false;

		if (element instanceof Property) {
			Property property = (Property) element;

			// structural attribute: classCode, moodCode, etc.
			if (property.getType() instanceof Enumeration) {
				hidden = true;
			}

			// 'text' and 'title' properties are omitted
			if ("text".equals(element.getName()) || "title".equals(element.getName())) {
				hidden = true;
			}

			// fixed code value
			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null && codeSystemConstraint.getCode() != null) {
				hidden = true;
			}

			// optional properties that do not have validation stereotype
			// severity = INFO
			Validation validation = CDAProfileUtil.getValidation(property);
			if (validation == null && property.getLower() == 0) {
				hidden = true;
			}
			if (validation != null && SeverityKind.INFO == validation.getSeverity()) {
				hidden = true;
			} else if (property.getAssociation() != null) {
				validation = CDAProfileUtil.getValidation(property.getAssociation());
				if (validation != null && SeverityKind.INFO == validation.getSeverity()) {
					hidden = true;
				}
			}
		}

		if (element instanceof Association) {
			Association association = (Association) element;

			// severity = INFO
			Validation validation = CDAProfileUtil.getValidation(association);
			if (validation != null && SeverityKind.INFO == validation.getSeverity()) {
				hidden = true;
			}
		}

		return hidden;
	}

	@Override
	protected boolean isDefaultCollapsed(NamedElement element) {
		boolean collapsed = false;

		// if (element instanceof Property) {
		// Property property = (Property) element;
		//
		// // associations with multiplicity upper bound = 1
		// if (property.getAssociation() != null && property.getUpper() == 1) {
		// collapsed = true;
		// }
		//
		// }

		return collapsed;
	}

	@Override
	public Class filterClass(Class sourceClass) {
		Class filteredClass = super.filterClass(sourceClass);

		return filteredClass;
	}

	@Override
	protected void assignFilteredNamespaceURI(Package sourcePackage, Package filteredPackage) {
		// "urn:hl7-org:greencda:" + packageName
	}

	@Override
	protected Classifier getFilteredPropertyType(Property property) {
		// super checks for specific override of property type
		Classifier newType = super.getFilteredPropertyType(property);

		if (newType == null) {
			// use enumeration for value sets
			ValueSetConstraint constraint = TermProfileUtil.getValueSetConstraint(property);
			if (constraint != null) {
				ValueSetVersion valueSet = constraint.getReference();
				if (valueSet != null && valueSet.getBase_Enumeration() != null &&
						valueSet.getBase_Enumeration().getOwnedLiterals().size() > 0) {
					Enumeration filteredEnum = addValueSetEnum(valueSet);
					newType = filteredEnum;
				}
			}
		}

		if (newType == null) {
			// use green datatype
			newType = greenDatatypesUtil.getGreenTypeFor((Classifier) property.getType());
		}

		return newType;
	}

	private Enumeration addValueSetEnum(ValueSetVersion valueSet) {
		if (valueSetPackage == null) {
			// valueSetPackage = getFilteredPackage().createNestedPackage(
			// getFilteredPackage().getName() + "-" + "ValueSets");

			valueSetPackage = getFilteredPackage();
		}

		Enumeration valueSetEnum = null;
		if (valueSet.getBase_Enumeration() != null) {
			String normalizedName = normalizeCodeName(valueSet.getBase_Enumeration().getName());
			String enumName = UML2Util.getValidJavaIdentifier(normalizedName);
			enumName = enumName.substring(0, 1).toUpperCase() + enumName.substring(1);

			valueSetEnum = (Enumeration) valueSetPackage.getOwnedType(
				enumName, false, UMLPackage.eINSTANCE.getEnumeration(), false);
			if (valueSetEnum == null) {
				valueSetEnum = EcoreUtil.copy(valueSet.getBase_Enumeration());
				valueSetEnum.setName(enumName);
				valueSetPackage.getOwnedTypes().add(valueSetEnum);
				UMLUtil.cloneStereotypes(valueSet.getBase_Enumeration(), valueSetEnum);
			}
		}

		return valueSetEnum;
	}

	@Override
	protected List<Property> getCollapsedContent(Property property) {
		// List<Property> collapsedContent = new ArrayList<Property>();
		List<Property> collapsedContent = super.getCollapsedContent(property);

		return collapsedContent;
	}
}
