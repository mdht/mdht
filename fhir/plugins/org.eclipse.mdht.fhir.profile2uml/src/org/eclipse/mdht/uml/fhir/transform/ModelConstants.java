/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.transform;

public interface ModelConstants {

	public static final String FHIR_STRUCTURE_URI_BASE = "http://hl7.org/fhir/StructureDefinition/";
	public static final String FHIR_VALUESET_URI_BASE = "http://hl7.org/fhir/ValueSet/";
	public static final String MDHT_STRUCTURE_URI_BASE = "http://eclipse.org/mdht/fhir/StructureDefinition/";

	public static final String ELEMENT_CLASS_NAME = "Element";
	public static final String BACKBONE_ELEMENT_CLASS_NAME = "BackboneElement";
	public static final String RESOURCE_CLASS_NAME = "Resource";
	
	// Non-specification class Base, abstract parent for Element and Resource, using MDHT_STRUCTURE_URI_BASE
	public static final String BASE_CLASS_NAME = "Base";

	// Non-specification class DataType, abstract parent for all 'datatype' StructureDefinitions, using MDHT_STRUCTURE_URI_BASE
	public static final String DATATYPE_CLASS_NAME = "DataType";

	public static final String UML_LIBRARIES_PATH = "org.eclipse.uml2.uml.resources/libraries/";
	public static final String XML_PRIMITIVE_TYPES_LIBRARY = UML_LIBRARIES_PATH + "XMLPrimitiveTypes.library.uml";
	
	//TODO Make this a variable preference setting
	public static final String TERMINOLOGY_SERVER = "http://fhir-dev.healthintersections.com.au/open/";
	
	public static final String VALUESET_ID_RESOURCE_TYPES = "resource-types";
	public static final String VALUESET_ID_DATA_TYPES = "data-types";
	public static final String VALUESET_ID_DEFINED_TYPES = "defined-types";
	
	/*
	 * Package names
	 */
	public static final String PACKAGE_NAME_RESOURCES = "Resources";
	public static final String PACKAGE_NAME_DATATYPES = "DataTypes";
	public static final String PACKAGE_NAME_VALUESETS = "ValueSets";
	public static final String PACKAGE_NAME_EXTENSIONS = "Extensions";
	public static final String PACKAGE_NAME_PROFILES = "Profiles";

	/*
	 * Extension URIs
	 */
	public static final String EXTENSION_EXPLICIT_TYPE_NAME = "http://hl7.org/fhir/StructureDefinition/structuredefinition-explicit-type-name";
	public static final String EXTENSION_FMM = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm";
	
}
