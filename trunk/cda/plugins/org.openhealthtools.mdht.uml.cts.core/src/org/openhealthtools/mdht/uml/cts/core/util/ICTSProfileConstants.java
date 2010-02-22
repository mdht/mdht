package org.openhealthtools.mdht.uml.cts.core.util;

public interface ICTSProfileConstants {

	public static final String CTS_PROFILE_NAME = "CTS";

	/*
	 * ConceptDomainConstraint Stereotype and Properties
	 */
	public static final String CONCEPT_DOMAIN_CONSTRAINT = "ConceptDomainConstraint";
	public static final String CONCEPT_DOMAIN_CONSTRAINT_ID = "identifier";
	public static final String CONCEPT_DOMAIN_CONSTRAINT_NAME = "name";

	/*
	 * CodeSystemConstraint Stereotype and Properties
	 */
	public static final String CODE_SYSTEM_CONSTRAINT = "CodeSystemConstraint";
	public static final String CODE_SYSTEM_CONSTRAINT_ID = "identifier";
	public static final String CODE_SYSTEM_CONSTRAINT_NAME = "name";
	public static final String CODE_SYSTEM_CONSTRAINT_VERSION = "version";
	public static final String CODE_SYSTEM_CONSTRAINT_CODE = "code";
	public static final String CODE_SYSTEM_CONSTRAINT_DISPLAY_NAME = "displayName";
	public static final String CODE_SYSTEM_CONSTRAINT_BINDING = "binding";
	public static final String CODE_SYSTEM_CONSTRAINT_QUALIFIER = "qualifier";

	/*
	 * ValueSetConstraint Stereotype and Properties
	 */
	public static final String VALUE_SET_CONSTRAINT = "ValueSetConstraint";
	public static final String VALUE_SET_CONSTRAINT_ID = "identifier";
	public static final String VALUE_SET_CONSTRAINT_NAME = "name";
	public static final String VALUE_SET_CONSTRAINT_VERSION = "version";
	public static final String VALUE_SET_CONSTRAINT_BINDING = "binding";
	public static final String VALUE_SET_CONSTRAINT_REFERENCE = "reference";

	/*
	 * ConceptDomain Stereotype and Properties
	 */
	public static final String CONCEPT_DOMAIN = "ConceptDomain";
	public static final String CONCEPT_DOMAIN_ID = "identifier";
	public static final String CONCEPT_DOMAIN_NAME = "name";

	/*
	 * CodeSystem Stereotype and Properties
	 */
	public static final String CODE_SYSTEM = "CodeSystem";
	public static final String CODE_SYSTEM_ID = "identifier";
	public static final String CODE_SYSTEM_NAME = "name";
	public static final String CODE_SYSTEM_VERSION = "version";

	/*
	 * ValueSet Stereotype and Properties
	 */
	public static final String VALUE_SET = "ValueSet";
	public static final String VALUE_SET_ID = "identifier";
	public static final String VALUE_SET_NAME = "name";
	public static final String VALUE_SET_VERSION = "version";
	public static final String VALUE_SET_BINDING = "binding";
	
	/*
	 * CTS Enumerations
	 */
	public static final String BINDING_KIND = "BindingKind";
	public static final String BINDING_KIND_STATIC = "Static";
	public static final String BINDING_KIND_DYNAMIC = "Dynamic";
	
	public static final String VALUE_SET_TYPE = "ValueSetType";
	public static final String VALUE_SET_TYPE_EXTENSIONAL = "Extensional";
	public static final String VALUE_SET_TYPE_INTENSIONAL = "Intensional";
	
}