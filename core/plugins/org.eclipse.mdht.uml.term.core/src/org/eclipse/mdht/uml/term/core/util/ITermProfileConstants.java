/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.eclipse.mdht.uml.term.core.util;

public interface ITermProfileConstants {

	public static final String TERM_PROFILE_NAME = "Terminology";

	/*
	 * ConceptDomainConstraint Stereotype and Properties
	 */
	public static final String CONCEPT_DOMAIN_CONSTRAINT = "ConceptDomainConstraint";

	public static final String CONCEPT_DOMAIN_CONSTRAINT_ID = "identifier";

	public static final String CONCEPT_DOMAIN_CONSTRAINT_NAME = "name";

	public static final String CONCEPT_DOMAIN_CONSTRAINT_REFERENCE = "reference";

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

	public static final String CODE_SYSTEM_CONSTRAINT_REFERENCE = "reference";

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

	public static final String CONCEPT_DOMAIN_NAME = "fullName";

	/*
	 * CodeSystemVersion Stereotype and Properties
	 */
	public static final String CODE_SYSTEM_VERSION = "CodeSystemVersion";

	public static final String CODE_SYSTEM_VERSION_ID = "identifier";

	public static final String CODE_SYSTEM_VERSION_NAME = "fullName";

	public static final String CODE_SYSTEM_VERSION_VERSION = "version";

	public static final String CODE_SYSTEM_VERSION_CODE_SYSTEM = "codeSystem";

	/*
	 * ValueSetVersion Stereotype and Properties
	 */
	public static final String VALUE_SET_VERSION = "ValueSetVersion";

	public static final String VALUE_SET_VERSION_ID = "identifier";

	public static final String VALUE_SET_VERSION_NAME = "fullName";

	public static final String VALUE_SET_VERSION_VERSION = "version";

	public static final String VALUE_SET_VERSION_BINDING = "binding";

	/*
	 * ValueSetCode Stereotype and Properties
	 */
	public static final String VALUE_SET_CODE = "ValueSetCode";

	public static final String VALUE_SET_CODE_CONCEPT_NAME = "conceptName";

	public static final String VALUE_SET_CODE_USAGE_NAME = "usageNote";

	public static final String VALUE_SET_CODE_CODE_SYSTEM = "codeSystem";

	/*
	 * Enumerations
	 */
	public static final String BINDING_KIND = "BindingKind";

	public static final String BINDING_KIND_STATIC = "Static";

	public static final String BINDING_KIND_DYNAMIC = "Dynamic";

	public static final String VALUE_SET_TYPE = "ValueSetType";

	public static final String VALUE_SET_TYPE_EXTENSIONAL = "Extensional";

	public static final String VALUE_SET_TYPE_INTENSIONAL = "Intensional";

	public static final String STATUS_KIND = "StatusKind";

	public static final String STATUS_KIND_ACTIVE = "Active";

	public static final String STATUS_KIND_INACTIVE = "Inactive";

}
