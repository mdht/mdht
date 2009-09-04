package org.openhealthtools.mdht.uml.cda.resources.util;

public interface ICDAProfileConstants {

	public static final String CDA_PROFILE_NAME = "CDA";

	/*
	 * Validation Support Stereotype and Properties
	 */
	public static final String VALIDATION_SUPPORT = "ValidationSupport";
	public static final String VALIDATION_SUPPORT_MESSAGE = "message";
	public static final String VALIDATION_SUPPORT_SEVERITY = "severity";
	
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
	
	/*
	 * CDA Template Stereotype and Properties
	 */
	public static final String CDA_TEMPLATE = "CDATemplate";
	public static final String CDA_TEMPLATE_TEMPLATE_ID = "templateId";
}