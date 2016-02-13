/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - factor out CDA dependencies from UML-to-Ecore transformation (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.util;

public interface ICDAProfileConstants {

	public static final String CDA_PROFILE_NAME = "CDA";

	/*
	 * Entry Stereotype and Properties
	 */
	/**
	 * @deprecated
	 */
	@Deprecated
	public static final String ENTRY = "Entry";

	/**
	 * @deprecated
	 */
	@Deprecated
	public static final String ENTRY_TYPE_CODE = "typeCode";

	/*
	 * Entry Relationship Stereotype and Properties
	 */
	/**
	 * @deprecated
	 */
	@Deprecated
	public static final String ENTRY_RELATIONSHIP = "EntryRelationship";

	/**
	 * @deprecated
	 */
	@Deprecated
	public static final String ENTRY_RELATIONSHIP_TYPE_CODE = "typeCode";

	/*
	 * Validation Stereotype and Properties
	 */
	public static final String VALIDATION = "Validation";

	public static final String VALIDATION_MESSAGE = "message";

	public static final String VALIDATION_SEVERITY = "severity";

	public static final String VALIDATION_NEGATION_INDICATOR = "negationIndicator";

	public static final String VALIDATION_RULE_ID = "ruleId";

	public static final String VALIDATION_MANDATORY = "mandatory";

	/*
	 * Property Validation Stereotype and properties
	 */
	public static final String PROPERTY_VALIDATION = "PropertyValidation";

	/*
	 * Association Validation Stereotype and Properties
	 */
	public static final String ASSOCIATION_VALIDATION = "AssociationValidation";

	/*
	 * Association Stereotype and Properties, may be used with AssociationValidation.
	 */
	public static final String ACT_RELATIONSHIP = "ActRelationship";

	public static final String ACT_RELATIONSHIP_ASSOCIATION_TYPE = "associationType";

	public static final String ACT_RELATIONSHIP_TYPE_CODE = "typeCode";

	public static final String PARTICIPATION = "Participation";

	public static final String PARTICIPATION_ASSOCIATION_TYPE = "associationType";

	public static final String PARTICIPATION_TYPE_CODE = "typeCode";

	/*
	 * Class Validation Stereotype and Properties
	 */
	public static final String CLASS_VALIDATION = "ClassValidation";

	/*
	 * Constraint Validation Stereotype and Properties
	 */
	public static final String CONSTRAINT_VALIDATION = "ConstraintValidation";

	public static final String LOGICAL_CONSTRAINT = "LogicalConstraint";

	public static final String INLINE = "Inline";

	public static final String CONSTRAINT_DITA_ENABLED = "enabledDitaForConstraints";

	/*
	 * Vocab Specification Stereotype and Properties
	 */
	/**
	 * @deprecated
	 */
	@Deprecated
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

	public static final String CDA_TEMPLATE_VERSION = "templateVersion";

	public static final String CDA_TEMPLATE_ASSIGNING_AUTHORITY_NAME = "assigningAuthorityName";

	public static final String CDA_TEMPLATE_CONTEXT_DEPENDENT = "contextDependent";

	public static final String CDA_TEMPLATE_MULTIPLICITY = "templateMultiplicity";

	/*
	 * ConformsTo Stereotype
	 */
	public static final String CONFORMS_TO = "ConformsTo";

	public static final String CONFORMS_TO_REQUIRES_PARENT_ID = "requiresParentId";

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

	/**
	 * @deprecated
	 */
	@Deprecated
	public static final String ENTRY_KIND = "EntryKind";

	/**
	 * @deprecated
	 */
	@Deprecated
	public static final String ENTRY_RELATIONSHIP_KIND = "EntryRelationshipKind";

	/**
	 * Base source URI for CDA code-generation annotations.
	 */
	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";

	public static final String VALIDATION_KIND = "ValidationKind";

	public static final String KIND = "kind";

	public static final String STRICT = "strict";

}
