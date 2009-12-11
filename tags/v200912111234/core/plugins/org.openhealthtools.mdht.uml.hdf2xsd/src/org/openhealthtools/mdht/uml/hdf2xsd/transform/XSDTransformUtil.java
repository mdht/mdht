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

import net.sourceforge.xmlmodeling.uml.xsd.profile.IXSDGenerationConstants;
import net.sourceforge.xmlmodeling.uml.xsd.profile.IXSDProfileConstants;
import net.sourceforge.xmlmodeling.uml.xsd.profile.XMLmodelingResource;
import net.sourceforge.xmlmodeling.uml.xsd.profile.XSDProfileUtil;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7Resource;


public abstract class XSDTransformUtil {

	public static void initializeModel(Package umlModel) {
		// assign stereotype and targetNamespace
		Stereotype schemaStereotype = 
			XSDProfileUtil.applyXSDStereotype(umlModel, IXSDProfileConstants.SCHEMA);
		if (schemaStereotype != null) {
			umlModel.setValue(schemaStereotype, 
					IXSDProfileConstants.SCHEMA_TARGET_NAMESPACE, 
					"urn:hl7-org:v3");
		}

		// assign xsdGen stereotype and elementNameMapping property
		Stereotype xsdGenStereotype = 
			XSDProfileUtil.applyXSDGenerationStereotype(umlModel, 
					IXSDGenerationConstants.SCHEMA_GEN);
		if (xsdGenStereotype != null) {
			umlModel.setValue(xsdGenStereotype, 
					IXSDGenerationConstants.SCHEMA_GEN_ELEMENT_NAME_MAPPING, 
					IXSDGenerationConstants.LITERAL_OMIT_ELEMENT);
		}
	}
	
	public static boolean isXSDAttribute(Property property) {
		return getAppliedXSDStereotype(property, IXSDProfileConstants.ATTRIBUTE) != null;
	}

	public static boolean isProhibited(Property property) {
		boolean prohibited = false;
		Stereotype attr = getAppliedXSDStereotype(property, IXSDProfileConstants.ATTRIBUTE);
		if (attr != null) {
			Boolean value = (Boolean) property.getValue(attr, IXSDProfileConstants.ATTRIBUTE_PROHIBITED);
			if (value != null)
				prohibited = value.booleanValue();
		}
		return prohibited;
	}
	
	public static Stereotype getAppliedXSDStereotype(Element element, String name) {
		return element.getAppliedStereotype("XMLSchema" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + name);
	}

	public static Stereotype getXSDStereotype(EObject eObject, String name) {
		Profile xsdProfile = getXSDProfile(eObject);

		return xsdProfile != null
			? xsdProfile.getOwnedStereotype(name)
			: null;
	}

	public static Profile getXSDProfile(EObject eObject) {
		Resource eResource = eObject.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return (Profile) UMLUtil.load(resourceSet, URI
					.createURI(XMLmodelingResource.XSD_PROFILE_URI),
					UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

	public static Stereotype getAppliedHDFStereotype(Element element, String name) {
		return element.getAppliedStereotype("HDF" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + name);
	}

	public static Stereotype getHDFStereotype(EObject eObject, String name) {
		Profile hdfProfile = getHDFProfile(eObject);

		return hdfProfile != null
			? hdfProfile.getOwnedStereotype(name)
			: null;
	}

	public static Profile getHDFProfile(EObject eObject) {
		Resource eResource = eObject.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return (Profile) UMLUtil.load(resourceSet, URI
					.createURI(HL7Resource.HDF_PROFILE_URI),
					UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

	/**
	 * Change first substring of uppercase characters to lower case.
	 * e.g. change 'DSLCustomer' to 'dslCustomer'.
	 */
	public static String toLowerCamelCase(String name) {
		if (name == null || name.length() < 2)
			return name;
		
		// first character only
		//return name.substring(0,1).toLowerCase() + name.substring(1);
		
		StringBuffer newName = new StringBuffer();
		int idx = 0;
		while (idx < name.length()
				&& Character.isUpperCase(name.charAt(idx))) {
			if (idx > 0 && (idx+1 < name.length()) 
					&& Character.isLowerCase(name.charAt(idx+1))) {
				// don't make this char lower
				break;
			}
			newName.append(Character.toLowerCase(name.charAt(idx++)));
		}
		if (idx < name.length())
			newName.append(name.substring(idx));
		
		return newName.toString();
	}

	public static String toUpperCamelCase(String name) {
		if (name == null || name.length() < 2)
			return name;
		
		String newName = name.substring(0,1).toUpperCase() + name.substring(1);
		
		return newName;
	}

	/**
	 * TODO: full XML name validation
	 */
	public static String getValidXMLName(String name) {
		if (name == null) {
			return "";
		}
		
		StringBuffer validName = new StringBuffer();
		boolean prevSpace = false;
		for (int i=0; i<name.length(); i++) {
			if (name.charAt(i) == ' ') {
				prevSpace = true;
			}
			else if (name.charAt(i) == '\'' || name.charAt(i) == '"') {
				// omit single or double quote character
			}
			else if (name.charAt(i) == '/' || name.charAt(i) == '\\' 
					|| name.charAt(i) == '<' || name.charAt(i) == '>'
					|| name.charAt(i) == ':') {
				validName.append('_');
			}
			else {
				char c = name.charAt(i);
				if (prevSpace) {
					c = Character.toUpperCase(c);
				}
				validName.append(c);
				prevSpace = false;
			}
		}
		
		return validName.toString();
	}
}
