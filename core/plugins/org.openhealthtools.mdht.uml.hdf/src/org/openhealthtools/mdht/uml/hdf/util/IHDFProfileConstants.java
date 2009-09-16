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
package org.openhealthtools.mdht.uml.hdf.util;

public interface IHDFProfileConstants {

	public static final String HDF_PROFILE_NAME = "HDF";

	/*
	 * HDF Modeling Stereotypes
	 */
	/** Abstract general stereotype for HDF */
	public static final String HDF_MODEL_ELEMENT = "HDFModelElement";

	public static final String HDF_PACKAGE = "HDFPackage";
	public static final String HDF_CLASS = "HDFClass";
	public static final String HDF_ATTRIBUTE = "HDFAttribute";
	public static final String HDF_ASSOCIATION_END = "HDFAssociationEnd";
	public static final String ENTRY_POINT = "EntryPoint";
	public static final String SUBSETS_GENERALIZATION = "SubsetsGeneralization";
	public static final String RESTRICTION = "Restriction";
	public static final String EXCLUDED_PROPERTY = "ExcludedProperty";

	/*
	 * HL7 Template stereotype and properties
	 */
	public static final String HL7_TEMPLATE = "HL7Template";
	public static final String HL7_TEMPLATE_ID = "id";
	
	/*
	 * Choice group stereotypes and properties
	 */
	public static final String CHOICE_GROUP = "ChoiceGroup";
	
	// stereotype on an association to a ChoiceGroup
	public static final String CHOICE_CONTENT = "ChoiceContent";
	public static final String CHOICE_MEMBERS = "choiceMembers";
	
	// complex stereotype property value
	public static final String CHOICE_MEMBER_CLASS = "ChoiceMember";
	public static final String CHOICE_TARGET = "target";
	public static final String TRAVERSAL_NAME = "traversalName";

	/*
	 * Business name class and properties
	 */
	// property of HDFModelElement stereotype
	public static final String BUSINESS_NAMES = "businessNames";
	
	// complex stereotype property value
	public static final String BUSINESS_NAME_CLASS = "BusinessName";
	public static final String BUSINESS_NAME_NAME = "name";
	public static final String BUSINESS_NAME_LANG = "language";

	/*
	 * Vocabulary definition stereotypes and properties
	 */
	public static final String CONCEPT_DOMAIN = "ConceptDomain";
	public static final String CODE_SYSTEM = "CodeSystem";
	public static final String VALUE_SET = "ValueSet";
	
	/*
	 * Vocabulary Constraint stereotypes and properties
	 */
	public static final String CONCEPT_DOMAIN_CONSTRAINT = "ConceptDomainConstraint";
	public static final String CODE_SYSTEM_CONSTRAINT = "CodeSystemConstraint";
	public static final String VALUE_SET_CONSTRAINT = "ValueSetConstraint";
	public static final String ENUMERATION_CONSTRAINT = "EnumerationConstraint";

	public static final String CONCEPT_DOMAIN_NAME = "name";

	public static final String CODE_SYSTEM_OID = "id";
	public static final String CODE_SYSTEM_NAME = "name";
	public static final String CODE_SYSTEM_VERSION = "versionDate";
	public static final String CODE = "code";
	public static final String CODE_PRINT_NAME = "codePrintName";

	public static final String VALUE_SET_OID = "id";
	public static final String VALUE_SET_NAME = "name";
	public static final String VALUE_SET_VERSION_DATE = "versionDate";
	public static final String VALUE_SET_VERSION_TIME = "versionTime";
	public static final String VALUE_SET_CODING_STRENGTH = "codingStrength";
	public static final String VALUE_SET_REVISION_FREQUENCY = "revisionFrequency";
	public static final String VALUE_SET_MINIMUM_OID = "minimumValueSetId";
	public static final String VALUE_SET_IGNORED_OID = "ignoredValueSetId";
	public static final String VALUE_SET_ROOT_CODE = "rootCode";

	public static final String ENUMERATION_VALUE = "value";
	public static final String ENUMERATION_CODE = "code";

	/*
	 * Null Flavor Constraint stereotypes and properties
	 */
	public static final String NULL_FLAVOR_CONSTRAINT = "NullFlavorConstraint";

	public static final String NULL_FLAVOR_VALUE = "nullFlavor";
	
	/*
	 * Package Stereotype properties
	 */
	public static final String PACKAGE_TITLE = "title";
	public static final String PACKAGE_KIND = "packageKind";
	public static final String PACKAGE_CONFORMANCE_LEVEL = "conformanceLevel";
	public static final String PACKAGE_REALM_NAMESPACE = "realmNamespace";
	public static final String PACKAGE_ARTIFACT = "artifact";
	public static final String PACKAGE_SUB_ARTIFACT = "subArtifact";
	public static final String PACKAGE_ROOT = "root";
	public static final String PACKAGE_SECTION = "section";
	public static final String PACKAGE_SUB_SECTION = "subSection";
	public static final String PACKAGE_DOMAIN = "domain";
	public static final String PACKAGE_ID = "id";
	public static final String PACKAGE_COMBINED_ID = "combinedId";
	public static final String PACKAGE_VERSION = "version";
	public static final String PACKAGE_RELEASE_DATE = "releaseDate";
	
	/*
	 * HDF documentation stereotypes
	 */
	public static final String DEFINITION = "Definition";
	public static final String DESCRIPTION = "Description";
	public static final String USAGE_NOTES = "UsageNotes";
	public static final String RATIONALE = "Rationale";
	public static final String REQUIREMENTS = "Requirements";
	public static final String DESIGN_COMMENTS = "DesignComments";
	public static final String WALKTHROUGH = "Walkthrough";
	public static final String OPEN_ISSUES = "OpenIssues";
	public static final String OTHER_ANNOTATION = "OtherAnnotation";
	public static final String APPENDIX = "Appendix";
	public static final String APP_INFO = "AppInfo";
	public static final String REFERENCES = "References";

	/*
	 * HDF Modeling Stereotype Properties
	 */
	public static final String SORT_KEY = "sortKey";
	public static final String HISTORY_ITEM = "historyItem";
	
	public static final String TITLE = "title";

	public static final String DERIVATION_SUPPLIER = "derivationSupplier";
	public static final String SUPPLIER_STRUCTURAL_DOMAIN = "supplierStructuralDomain";
	
	public static final String CONFORMANCE = "conformance";
	public static final String DEFAULT_FROM = "defaultFrom";
	public static final String IS_MANDATORY = "isMandatory";
	public static final String MAXIMUM_LENGTH = "maximumLength";
	public static final String MINIMUM_LENGTH = "minimumLength";
	public static final String REFERENCE_HISTORY = "referenceHistory";
	public static final String UPDATE_MODE_DEFAULT = "updateModeDefault";
	public static final String UPDATE_MODES_ALLOWED = "updateModesAllowed";
	public static final String IS_IMMUTABLE = "isImmutable";
	public static final String USE_KIND = "useKind";
	public static final String IS_COMPLETE = "isComplete";
	
	/*
	 * HDF Modeling Enumerations
	 */
	public static final String CONFORMANCE_KIND = "ConformanceKind";
	public static final String UPDATE_MODE_KIND = "UpdateModeKind";
	public static final String DEFAULT_DETERMINER_KIND = "DefaultDeterminerKind";
	public static final String STATIC_MODEL_USE_KIND = "StaticModelUseKind";
	public static final String CODING_STRENGTH_KIND = "CodingStrengthKind";
	public static final String REVISION_FREQUENCY_KIND = "RevisionFrequencyKind";
	
}
