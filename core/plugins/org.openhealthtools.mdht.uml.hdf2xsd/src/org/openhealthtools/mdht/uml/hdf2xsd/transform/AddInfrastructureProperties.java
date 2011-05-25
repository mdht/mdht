/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import java.util.Comparator;

import net.sourceforge.xmlmodeling.uml.xsd.profile.IXSDProfileConstants;
import net.sourceforge.xmlmodeling.uml.xsd.profile.XSDProfileUtil;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.XSDDatatypeUtil;

public class AddInfrastructureProperties extends UMLSwitch {

	private XSDTransformerOptions transformerOptions;

	public AddInfrastructureProperties(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public Object caseClass(Class umlClass) {
		// sort before adding infrastructure attributes
		ECollections.sort(umlClass.getOwnedAttributes(), new SortKeyComparator());

		// don't add infrastructure properties to choice group
		Stereotype groupStereotype = XSDProfileUtil.getAppliedXSDStereotype(umlClass, IXSDProfileConstants.GROUP);
		if (groupStereotype != null) {
			return null;
		}

		// don't add infrastructure properties to global property class
		Stereotype globalStereotype = XSDProfileUtil.getAppliedXSDStereotype(
			umlClass, IXSDProfileConstants.GLOBAL_PROPERTY);
		if (globalStereotype != null) {
			return null;
		}

		// don't add infrastructure properties to nested classes (anonymous XSD types)
		if (umlClass.getOwner() instanceof Class) {
			return null;
		}

		Model model = umlClass.getModel();

		Classifier type_InfrastructureRootElements = XSDDatatypeUtil.getDatatypeByName(
			model, "InfrastructureRootElements");
		Classifier type_InfrastructureRootAttributes = XSDDatatypeUtil.getDatatypeByName(
			model, "InfrastructureRootAttributes");
		Classifier type_NullFlavor = XSDDatatypeUtil.getVocabularyByName(model, "NullFlavor");

		Property property;

		// insert as first property
		property = UMLFactory.eINSTANCE.createProperty();
		property.setName("infrastructureElements");
		property.setType(type_InfrastructureRootElements);
		umlClass.getOwnedAttributes().add(0, property);

		// add these XSD attribute content at end of ownedAttributes
		property = UMLFactory.eINSTANCE.createProperty();
		property.setName("infrastructureAttributes");
		property.setType(type_InfrastructureRootAttributes);
		umlClass.getOwnedAttributes().add(property);

		property = UMLFactory.eINSTANCE.createProperty();
		property.setName("nullFlavor");
		property.setType(type_NullFlavor);
		property.setLower(0);
		umlClass.getOwnedAttributes().add(property);
		XSDProfileUtil.applyXSDStereotype(property, IXSDProfileConstants.ATTRIBUTE);

		return umlClass;
	}

	@Override
	public Object caseProperty(Property property) {
		// set nillable=true, what are criteria? Every association end, but not attributes
		Stereotype propertyStereotype = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.HDF_ASSOCIATION_END);

		if (propertyStereotype != null) {
			Model model = property.getModel();
			XSDProfileUtil.applyXSDProfile(model);
			Stereotype xsdStereotype = XSDProfileUtil.applyXSDStereotype(property, IXSDProfileConstants.ELEMENT);
			if (xsdStereotype != null) {
				property.setValue(xsdStereotype, IXSDProfileConstants.ELEMENT_NILLABLE, Boolean.TRUE);
			}
		}

		return property;
	}

	private class SortKeyComparator implements Comparator {

		public int compare(Object o1, Object o2) {
			if (!(o1 instanceof Property && o2 instanceof Property)) {
				return 0;
			}

			Property p1 = (Property) o1;
			Property p2 = (Property) o2;

			// sort by origin end when part of an AssociationClass
			if (p1.getAssociation() instanceof AssociationClass) {
				p1 = p1.getOtherEnd();
			}
			if (p2.getAssociation() instanceof AssociationClass) {
				p2 = p2.getOtherEnd();
			}

			// in corrupt models, getOtherEnd() may return null
			if (p1 == null || p2 == null) {
				return 0;
			}

			// attributes before associations
			if (p1.getAssociation() == null && p2.getAssociation() != null) {
				return -1;
			}
			if (p1.getAssociation() != null && p2.getAssociation() == null) {
				return 1;
			}

			Stereotype p1Stereotype = HL7ResourceUtil.getAppliedHDFStereotype(p1, IHDFProfileConstants.HDF_ATTRIBUTE);
			if (p1Stereotype == null) {
				p1Stereotype = HL7ResourceUtil.getAppliedHDFStereotype(p1, IHDFProfileConstants.HDF_ASSOCIATION_END);
			}
			Stereotype p2Stereotype = HL7ResourceUtil.getAppliedHDFStereotype(p2, IHDFProfileConstants.HDF_ATTRIBUTE);
			if (p2Stereotype == null) {
				p2Stereotype = HL7ResourceUtil.getAppliedHDFStereotype(p2, IHDFProfileConstants.HDF_ASSOCIATION_END);
			}

			if (p1Stereotype == null || p2Stereotype == null) {
				return 0;
			}

			String p1SortKey = (String) p1.getValue(p1Stereotype, "sortKey");
			String p2SortKey = (String) p2.getValue(p1Stereotype, "sortKey");

			// create sortKey for association end, if missing
			if (p1SortKey == null && p1.getAssociation() != null) {
				p1SortKey = "BZ";
			}
			if (p2SortKey == null && p2.getAssociation() != null) {
				p2SortKey = "BZ";
			}

			if (p1SortKey == null || p2SortKey == null) {
				return 0;
			}

			try {
				// must convert to int so that we don't get alpha order: 1, 11, 2
				return Integer.valueOf(p1SortKey).compareTo(Integer.valueOf(p2SortKey));
			} catch (NumberFormatException e) {
				// one or both sortKey is not an integer, use alpha sort
			}

			if (p1.getAssociation() != null && p1.getType() != null) {
				p1SortKey += p1.getType().getName();
			}
			if (p2.getAssociation() != null && p2.getType() != null) {
				p2SortKey += p2.getType().getName();
			}

			return p1SortKey.compareTo(p2SortKey);
		}

	}

}
