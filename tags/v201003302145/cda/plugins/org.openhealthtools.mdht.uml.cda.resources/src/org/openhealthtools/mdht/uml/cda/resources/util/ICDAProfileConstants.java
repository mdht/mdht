package org.openhealthtools.mdht.uml.cda.resources.util;

public interface ICDAProfileConstants {

	public static final String CDA_PROFILE_NAME = "CDA";

	/*
	 * Entry Stereotype and Properties
	 */
	public static final String ENTRY = "Entry";
	public static final String ENTRY_TYPE_CODE = "typeCode";
	
	/*
	 * Entry Relationship Stereotype and Properties
	 */
	public static final String ENTRY_RELATIONSHIP = "EntryRelationship";
	public static final String ENTRY_RELATIONSHIP_TYPE_CODE = "typeCode";

	/*
	 * Validation Stereotype and Properties
	 */
	public static final String VALIDATION = "Validation";
	public static final String VALIDATION_MESSAGE = "message";
	public static final String VALIDATION_SEVERITY = "severity";
	public static final String VALIDATION_RULE_ID = "ruleId";
	
	/*
	 * Property Validation Stereotype and properties
	 */
	public static final String PROPERTY_VALIDATION = "PropertyValidation";
	
	/*
	 * Association Validation Stereotype and Properties
	 */
	public static final String ASSOCIATION_VALIDATION = "AssociationValidation";
	
	/*
	 * Class Validation Stereotype and Properties
	 */
	public static final String CLASS_VALIDATION = "ClassValidation";

	/*
	 * Constraint Validation Stereotype and Properties
	 */
	public static final String CONSTRAINT_VALIDATION = "ConstraintValidation";
	
	/*
	 * Vocab Specification Stereotype and Properties
	 */
	public static final String VOCAB_SPECIFICATION = "VocabSpecification";
	public static final String VOCAB_SPECIFICATION_CODE = "code";
	public static final String VOCAB_SPECIFICATION_CODE_SYSTEM = "codeSystem";
	public static final String VOCAB_SPECIFICATION_CODE_SYSTEM_NAME = "codeSystemName";
	public static final String VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION = "codeSystemVersion";
	public static final String VOCAB_SPECIFICATION_DISPLAY_NAME = "displayName";
	
	/*
	 * Null Flavor Stereotype and Properties
	 */
	public static final String NULL_FLAVOR = "NullFlavor";
	public static final String NULL_FLAVOR_NULL_FLAVOR = "nullFlavor";
	
	/*
	 * Text Value Stereotype and Properties
	 */
	public static final String TEXT_VALUE = "TextValue";
	public static final String TEXT_VALUE_VALUE = "value";
	public static final String TEXT_VALUE_IGNORE_CASE = "ignoreCase";
	
	/*
	 * CDA Template Stereotype and Properties
	 */
	public static final String CDA_TEMPLATE = "CDATemplate";
	public static final String CDA_TEMPLATE_TEMPLATE_ID = "templateId";
	public static final String CDA_TEMPLATE_ASSIGNING_AUTHORITY_NAME = "assigningAuthorityName";
	public static final String CDA_TEMPLATE_CONTEXT_DEPENDENT = "contextDependent";

	/*
	 * ConformsTo Stereotype
	 */
	public static final String CONFORMS_TO = "ConformsTo";
	
	/*
	 * Codegen Support Stereotype and Properties
	 */
	public static final String CODEGEN_SUPPORT = "CodegenSupport";
	public static final String CODEGEN_SUPPORT_BASE_PACKAGE = "basePackage";
	public static final String CODEGEN_SUPPORT_NS_PREFIX = "nsPrefix";
	public static final String CODEGEN_SUPPORT_NS_URI = "nsURI";
	public static final String CODEGEN_SUPPORT_PACKAGE_NAME = "packageName";
	public static final String CODEGEN_SUPPORT_PREFIX = "prefix";
	
	/*
	 * CDA Enumerations
	 */
	public static final String SEVERITY_KIND = "SeverityKind";
	public static final String NULL_FLAVOR_KIND = "NullFlavorKind";
	public static final String ENTRY_KIND = "EntryKind";
	public static final String ENTRY_RELATIONSHIP_KIND = "EntryRelationshipKind";
	
}