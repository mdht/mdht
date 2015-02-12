/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Artifact Group Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A list of the types of groups of artifacts that can be referenced
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactGroupKind()
 * @model extendedMetaData="name='ArtifactGroupKind'"
 * @generated
 */
public enum ArtifactGroupKind implements Enumerator {
	/**
	 * The '<em><b>Footnotes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOTNOTES_VALUE
	 * @generated
	 * @ordered
	 */
	FOOTNOTES(0, "Footnotes", "Footnotes"),

	/**
	 * The '<em><b>Packages</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGES_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGES(1, "Packages", "Packages"),

	/**
	 * The '<em><b>Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER(2, "Header", "Header"),

	/**
	 * The '<em><b>Annotations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATIONS(3, "Annotations", "Annotations"),

	/**
	 * The '<em><b>History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY(4, "History", "History"),

	/**
	 * The '<em><b>Derivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVATION(5, "Derivation", "Derivation"),

	/**
	 * The '<em><b>Properties</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTIES(6, "Properties", "Properties"),

	/**
	 * The '<em><b>Static Models</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_MODELS_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_MODELS(7, "StaticModels", "StaticModels"),

	/**
	 * The '<em><b>Subject Areas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_AREAS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT_AREAS(8, "SubjectAreas", "SubjectAreas"),

	/**
	 * The '<em><b>Classes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSES_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSES(9, "Classes", "Classes"),

	/**
	 * The '<em><b>State Engines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_ENGINES_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_ENGINES(10, "StateEngines", "StateEngines"),

	/**
	 * The '<em><b>States</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATES_VALUE
	 * @generated
	 * @ordered
	 */
	STATES(11, "States", "States"),

	/**
	 * The '<em><b>State Transitions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_TRANSITIONS_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_TRANSITIONS(12, "StateTransitions", "StateTransitions"),

	/**
	 * The '<em><b>Associations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATIONS(13, "Associations", "Associations"),

	/**
	 * The '<em><b>Attributes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTES_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTES(14, "Attributes", "Attributes"),

	/**
	 * The '<em><b>Trigger Events</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_EVENTS_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER_EVENTS(15, "TriggerEvents", "TriggerEvents"),

	/**
	 * The '<em><b>Application Roles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_ROLES_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_ROLES(16, "ApplicationRoles", "ApplicationRoles"),

	/**
	 * The '<em><b>Interactions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTIONS(17, "Interactions", "Interactions"),

	/**
	 * The '<em><b>Receiver Responsibilities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVER_RESPONSIBILITIES_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVER_RESPONSIBILITIES(18, "ReceiverResponsibilities", "ReceiverResponsibilities"),

	/**
	 * The '<em><b>Concept Domains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DOMAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_DOMAINS(19, "ConceptDomains", "ConceptDomains"),

	/**
	 * The '<em><b>Vocabulary Codes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOCABULARY_CODES_VALUE
	 * @generated
	 * @ordered
	 */
	VOCABULARY_CODES(20, "VocabularyCodes", "VocabularyCodes"),

	/**
	 * The '<em><b>Templates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATES_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATES(21, "Templates", "Templates"),

	/**
	 * The '<em><b>Communication Protocols</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_PROTOCOLS_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_PROTOCOLS(22, "CommunicationProtocols", "CommunicationProtocols"),

	/**
	 * The '<em><b>Implementation Technology Specifications</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS(23, "ImplementationTechnologySpecifications",
			"ImplementationTechnologySpecifications");

	/**
	 * The '<em><b>Footnotes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the footnotes defined within the artifact.
	 * <!-- end-model-doc -->
	 * @see #FOOTNOTES
	 * @model name="Footnotes"
	 * @generated
	 * @ordered
	 */
	public static final int FOOTNOTES_VALUE = 0;

	/**
	 * The '<em><b>Packages</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the packages defined within the artifact.  Only applies to packages.
	 * <!-- end-model-doc -->
	 * @see #PACKAGES
	 * @model name="Packages"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGES_VALUE = 1;

	/**
	 * The '<em><b>Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the header information associated with the artifact.
	 * <!-- end-model-doc -->
	 * @see #HEADER
	 * @model name="Header"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_VALUE = 2;

	/**
	 * The '<em><b>Annotations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the annotations defined within the artifact.
	 * <!-- end-model-doc -->
	 * @see #ANNOTATIONS
	 * @model name="Annotations"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATIONS_VALUE = 3;

	/**
	 * The '<em><b>History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the history associated with the artifact.
	 * <!-- end-model-doc -->
	 * @see #HISTORY
	 * @model name="History"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_VALUE = 4;

	/**
	 * The '<em><b>Derivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the derivations associated with the artifact.
	 * <!-- end-model-doc -->
	 * @see #DERIVATION
	 * @model name="Derivation"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVATION_VALUE = 5;

	/**
	 * The '<em><b>Properties</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the properties within the artifact.  (Only applies to DatatypeDefinitions.)
	 * <!-- end-model-doc -->
	 * @see #PROPERTIES
	 * @model name="Properties"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTIES_VALUE = 6;

	/**
	 * The '<em><b>Static Models</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the static models defined within the artifact.  (Only applies to Packages.)
	 * <!-- end-model-doc -->
	 * @see #STATIC_MODELS
	 * @model name="StaticModels"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_MODELS_VALUE = 7;

	/**
	 * The '<em><b>Subject Areas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the subject areas defined within the artifact.  (Only applies to static models.)
	 * <!-- end-model-doc -->
	 * @see #SUBJECT_AREAS
	 * @model name="SubjectAreas"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_AREAS_VALUE = 8;

	/**
	 * The '<em><b>Classes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the classes defined within the artifact.  (Only applies to static models.)
	 * <!-- end-model-doc -->
	 * @see #CLASSES
	 * @model name="Classes"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSES_VALUE = 9;

	/**
	 * The '<em><b>State Engines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the state engines defined within the artifact.  (Only applies to static models.)
	 * <!-- end-model-doc -->
	 * @see #STATE_ENGINES
	 * @model name="StateEngines"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_ENGINES_VALUE = 10;

	/**
	 * The '<em><b>States</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the states defined within the class.  (Only applies to classes within static models.)
	 * <!-- end-model-doc -->
	 * @see #STATES
	 * @model name="States"
	 * @generated
	 * @ordered
	 */
	public static final int STATES_VALUE = 11;

	/**
	 * The '<em><b>State Transitions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the state transitions defined within the class.  (Only applies to classes within static models.)
	 * <!-- end-model-doc -->
	 * @see #STATE_TRANSITIONS
	 * @model name="StateTransitions"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITIONS_VALUE = 12;

	/**
	 * The '<em><b>Associations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the associations defined within the class.  (Only applies to classes within static models.)
	 * <!-- end-model-doc -->
	 * @see #ASSOCIATIONS
	 * @model name="Associations"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATIONS_VALUE = 13;

	/**
	 * The '<em><b>Attributes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the attributes defined within the class.  (Only applies to classes within static models.)
	 * <!-- end-model-doc -->
	 * @see #ATTRIBUTES
	 * @model name="Attributes"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES_VALUE = 14;

	/**
	 * The '<em><b>Trigger Events</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the trigger events defined within the artifact.  (Only applies to dynamic models.)
	 * <!-- end-model-doc -->
	 * @see #TRIGGER_EVENTS
	 * @model name="TriggerEvents"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_EVENTS_VALUE = 15;

	/**
	 * The '<em><b>Application Roles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the application roles defined within the artifact.  (Only applies to dynamic models.)
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_ROLES
	 * @model name="ApplicationRoles"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_ROLES_VALUE = 16;

	/**
	 * The '<em><b>Interactions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the interactions defined within the artifact.  (Only applies to dynamic models.)
	 * <!-- end-model-doc -->
	 * @see #INTERACTIONS
	 * @model name="Interactions"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTIONS_VALUE = 17;

	/**
	 * The '<em><b>Receiver Responsibilities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the xxx defined within the artifact.  (Only applies to interactions.)
	 * <!-- end-model-doc -->
	 * @see #RECEIVER_RESPONSIBILITIES
	 * @model name="ReceiverResponsibilities"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVER_RESPONSIBILITIES_VALUE = 18;

	/**
	 * The '<em><b>Concept Domains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the vocabulary domains defined within the artifact.  (Only applies to vocabulary models.)
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_DOMAINS
	 * @model name="ConceptDomains"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_DOMAINS_VALUE = 19;

	/**
	 * The '<em><b>Vocabulary Codes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the vocabulary codes defined within the artifact.  (Only applies to vocabulary models.)
	 * <!-- end-model-doc -->
	 * @see #VOCABULARY_CODES
	 * @model name="VocabularyCodes"
	 * @generated
	 * @ordered
	 */
	public static final int VOCABULARY_CODES_VALUE = 20;

	/**
	 * The '<em><b>Templates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the templates defined within the artifact.  (Only applies to packages.)
	 * <!-- end-model-doc -->
	 * @see #TEMPLATES
	 * @model name="Templates"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATES_VALUE = 21;

	/**
	 * The '<em><b>Communication Protocols</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the communication protocols defined within the artifact.  (Only applies to packages.)
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_PROTOCOLS
	 * @model name="CommunicationProtocols"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_PROTOCOLS_VALUE = 22;

	/**
	 * The '<em><b>Implementation Technology Specifications</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to all of the implementation technology specifications defined within the artifact.  (Only applies to implementation technology specifications.)
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS
	 * @model name="ImplementationTechnologySpecifications"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS_VALUE = 23;

	/**
	 * An array of all the '<em><b>Artifact Group Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactGroupKind[] VALUES_ARRAY = new ArtifactGroupKind[] {
			FOOTNOTES, PACKAGES, HEADER, ANNOTATIONS, HISTORY, DERIVATION, PROPERTIES, STATIC_MODELS, SUBJECT_AREAS,
			CLASSES, STATE_ENGINES, STATES, STATE_TRANSITIONS, ASSOCIATIONS, ATTRIBUTES, TRIGGER_EVENTS,
			APPLICATION_ROLES, INTERACTIONS, RECEIVER_RESPONSIBILITIES, CONCEPT_DOMAINS, VOCABULARY_CODES, TEMPLATES,
			COMMUNICATION_PROTOCOLS, IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS, };

	/**
	 * A public read-only list of all the '<em><b>Artifact Group Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactGroupKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Group Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactGroupKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactGroupKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Group Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactGroupKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactGroupKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Group Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactGroupKind get(int value) {
		switch (value) {
			case FOOTNOTES_VALUE:
				return FOOTNOTES;
			case PACKAGES_VALUE:
				return PACKAGES;
			case HEADER_VALUE:
				return HEADER;
			case ANNOTATIONS_VALUE:
				return ANNOTATIONS;
			case HISTORY_VALUE:
				return HISTORY;
			case DERIVATION_VALUE:
				return DERIVATION;
			case PROPERTIES_VALUE:
				return PROPERTIES;
			case STATIC_MODELS_VALUE:
				return STATIC_MODELS;
			case SUBJECT_AREAS_VALUE:
				return SUBJECT_AREAS;
			case CLASSES_VALUE:
				return CLASSES;
			case STATE_ENGINES_VALUE:
				return STATE_ENGINES;
			case STATES_VALUE:
				return STATES;
			case STATE_TRANSITIONS_VALUE:
				return STATE_TRANSITIONS;
			case ASSOCIATIONS_VALUE:
				return ASSOCIATIONS;
			case ATTRIBUTES_VALUE:
				return ATTRIBUTES;
			case TRIGGER_EVENTS_VALUE:
				return TRIGGER_EVENTS;
			case APPLICATION_ROLES_VALUE:
				return APPLICATION_ROLES;
			case INTERACTIONS_VALUE:
				return INTERACTIONS;
			case RECEIVER_RESPONSIBILITIES_VALUE:
				return RECEIVER_RESPONSIBILITIES;
			case CONCEPT_DOMAINS_VALUE:
				return CONCEPT_DOMAINS;
			case VOCABULARY_CODES_VALUE:
				return VOCABULARY_CODES;
			case TEMPLATES_VALUE:
				return TEMPLATES;
			case COMMUNICATION_PROTOCOLS_VALUE:
				return COMMUNICATION_PROTOCOLS;
			case IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS_VALUE:
				return IMPLEMENTATION_TECHNOLOGY_SPECIFICATIONS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArtifactGroupKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ArtifactGroupKind
