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
package org.openhealthtools.mdht.emf.w3c.xhtml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getObjectName()
 * @model extendedMetaData="name='ObjectName'"
 * @generated
 */
public enum ObjectName implements Enumerator {
	/**
	 * The '<em><b>Constructed Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTED_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTED_ELEMENT(0, "constructedElement", "constructedElement"),

	/**
	 * The '<em><b>Footnote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOTNOTE_VALUE
	 * @generated
	 * @ordered
	 */
	FOOTNOTE(1, "footnote", "footnote"),

	/**
	 * The '<em><b>Requirement Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENT_REF_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENT_REF(2, "requirementRef", "requirementRef"),

	/**
	 * The '<em><b>External Spec Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_SPEC_REF_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_SPEC_REF(3, "externalSpecRef", "externalSpecRef"),

	/**
	 * The '<em><b>Figure Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIGURE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	FIGURE_REF(4, "figureRef", "figureRef"),

	/**
	 * The '<em><b>Table Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_REF(5, "tableRef", "tableRef"),

	/**
	 * The '<em><b>Item Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_NAME(6, "itemName", "itemName"),

	/**
	 * The '<em><b>Annotation Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION_REF_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATION_REF(7, "annotationRef", "annotationRef"),

	/**
	 * The '<em><b>Artifact Group Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTIFACT_GROUP_REF_VALUE
	 * @generated
	 * @ordered
	 */
	ARTIFACT_GROUP_REF(8, "artifactGroupRef", "artifactGroupRef"),

	/**
	 * The '<em><b>Package Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_REF(9, "packageRef", "packageRef"),

	/**
	 * The '<em><b>Domain Analysis Model Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_ANALYSIS_MODEL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_ANALYSIS_MODEL_REF(10, "domainAnalysisModelRef", "domainAnalysisModelRef"),

	/**
	 * The '<em><b>Domain Instance Example Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_INSTANCE_EXAMPLE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_INSTANCE_EXAMPLE_REF(11, "domainInstanceExampleRef", "domainInstanceExampleRef"),

	/**
	 * The '<em><b>Glossary Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOSSARY_REF_VALUE
	 * @generated
	 * @ordered
	 */
	GLOSSARY_REF(12, "glossaryRef", "glossaryRef"),

	/**
	 * The '<em><b>Glossary Term Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOSSARY_TERM_REF_VALUE
	 * @generated
	 * @ordered
	 */
	GLOSSARY_TERM_REF(13, "glossaryTermRef", "glossaryTermRef"),

	/**
	 * The '<em><b>Storyboard Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORYBOARD_REF_VALUE
	 * @generated
	 * @ordered
	 */
	STORYBOARD_REF(14, "storyboardRef", "storyboardRef"),

	/**
	 * The '<em><b>Freehand Document Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEHAND_DOCUMENT_REF_VALUE
	 * @generated
	 * @ordered
	 */
	FREEHAND_DOCUMENT_REF(15, "freehandDocumentRef", "freehandDocumentRef"),

	/**
	 * The '<em><b>Publication Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICATION_REF_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLICATION_REF(16, "publicationRef", "publicationRef"),

	/**
	 * The '<em><b>Datatype Model Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_MODEL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE_MODEL_REF(17, "datatypeModelRef", "datatypeModelRef"),

	/**
	 * The '<em><b>Datatype Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE_REF(18, "datatypeRef", "datatypeRef"),

	/**
	 * The '<em><b>Property Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_REF_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_REF(19, "propertyRef", "propertyRef"),

	/**
	 * The '<em><b>Static Model Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_MODEL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_MODEL_REF(20, "staticModelRef", "staticModelRef"),

	/**
	 * The '<em><b>Subject Area Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_AREA_REF_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT_AREA_REF(21, "subjectAreaRef", "subjectAreaRef"),

	/**
	 * The '<em><b>Class Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_REF_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_REF(22, "classRef", "classRef"),

	/**
	 * The '<em><b>State Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_REF(23, "stateRef", "stateRef"),

	/**
	 * The '<em><b>Transition Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSITION_REF_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITION_REF(24, "transitionRef", "transitionRef"),

	/**
	 * The '<em><b>Attribute Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE_REF(25, "attributeRef", "attributeRef"),

	/**
	 * The '<em><b>Association End Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_END_REF_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION_END_REF(26, "associationEndRef", "associationEndRef"),

	/**
	 * The '<em><b>Trigger Event Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_EVENT_REF_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER_EVENT_REF(27, "triggerEventRef", "triggerEventRef"),

	/**
	 * The '<em><b>Application Role Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_ROLE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_ROLE_REF(28, "applicationRoleRef", "applicationRoleRef"),

	/**
	 * The '<em><b>Interaction Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTION_REF_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTION_REF(29, "interactionRef", "interactionRef"),

	/**
	 * The '<em><b>Vocabulary Model Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOCABULARY_MODEL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	VOCABULARY_MODEL_REF(30, "vocabularyModelRef", "vocabularyModelRef"),

	/**
	 * The '<em><b>Concept Domain Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DOMAIN_REF_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_DOMAIN_REF(31, "conceptDomainRef", "conceptDomainRef"),

	/**
	 * The '<em><b>Vocabulary Code System Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOCABULARY_CODE_SYSTEM_REF_VALUE
	 * @generated
	 * @ordered
	 */
	VOCABULARY_CODE_SYSTEM_REF(32, "vocabularyCodeSystemRef", "vocabularyCodeSystemRef"),

	/**
	 * The '<em><b>Vocabulary Code Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOCABULARY_CODE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	VOCABULARY_CODE_REF(33, "vocabularyCodeRef", "vocabularyCodeRef"),

	/**
	 * The '<em><b>Vocabulary Value Set Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOCABULARY_VALUE_SET_REF_VALUE
	 * @generated
	 * @ordered
	 */
	VOCABULARY_VALUE_SET_REF(34, "vocabularyValueSetRef", "vocabularyValueSetRef"),

	/**
	 * The '<em><b>Test Scenario Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_SCENARIO_REF_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_SCENARIO_REF(35, "testScenarioRef", "testScenarioRef"),

	/**
	 * The '<em><b>Test Case Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_CASE_REF_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_CASE_REF(36, "testCaseRef", "testCaseRef");

	/**
	 * The '<em><b>Constructed Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows insertion of a pre-defined complex structure (e.g. auto-generated table or diagram) to be inserted
	 * <!-- end-model-doc -->
	 * @see #CONSTRUCTED_ELEMENT
	 * @model name="constructedElement"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTED_ELEMENT_VALUE = 0;

	/**
	 * The '<em><b>Footnote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting content that should be referenced within the document, but displayed at the end of the page or document section.
	 * <!-- end-model-doc -->
	 * @see #FOOTNOTE
	 * @model name="footnote"
	 * @generated
	 * @ordered
	 */
	public static final int FOOTNOTE_VALUE = 1;

	/**
	 * The '<em><b>Requirement Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows linkage to an externally-defined requirement by number or id.
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENT_REF
	 * @model name="requirementRef"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_REF_VALUE = 2;

	/**
	 * The '<em><b>External Spec Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an externally defined specification.
	 * <!-- end-model-doc -->
	 * @see #EXTERNAL_SPEC_REF
	 * @model name="externalSpecRef"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SPEC_REF_VALUE = 3;

	/**
	 * The '<em><b>Figure Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows referencing an 'img' in the markup associated with this or some other element within the current model or package.
	 * <!-- end-model-doc -->
	 * @see #FIGURE_REF
	 * @model name="figureRef"
	 * @generated
	 * @ordered
	 */
	public static final int FIGURE_REF_VALUE = 4;

	/**
	 * The '<em><b>Table Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows referencing an 'table' in the markup associated with this or some other element within the current model or package.
	 * <!-- end-model-doc -->
	 * @see #TABLE_REF
	 * @model name="tableRef"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_REF_VALUE = 5;

	/**
	 * The '<em><b>Item Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inserts the name of the current element or the name of one of it's ancestors.
	 * <!-- end-model-doc -->
	 * @see #ITEM_NAME
	 * @model name="itemName"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_NAME_VALUE = 6;

	/**
	 * The '<em><b>Annotation Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an annotation on the current element or one of its parents
	 * <!-- end-model-doc -->
	 * @see #ANNOTATION_REF
	 * @model name="annotationRef"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_REF_VALUE = 7;

	/**
	 * The '<em><b>Artifact Group Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a collection of artifacts of a particular type
	 * <!-- end-model-doc -->
	 * @see #ARTIFACT_GROUP_REF
	 * @model name="artifactGroupRef"
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT_GROUP_REF_VALUE = 8;

	/**
	 * The '<em><b>Package Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a particular package
	 * <!-- end-model-doc -->
	 * @see #PACKAGE_REF
	 * @model name="packageRef"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_REF_VALUE = 9;

	/**
	 * The '<em><b>Domain Analysis Model Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific domain analysis model
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_ANALYSIS_MODEL_REF
	 * @model name="domainAnalysisModelRef"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_ANALYSIS_MODEL_REF_VALUE = 10;

	/**
	 * The '<em><b>Domain Instance Example Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific domain instance example
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_INSTANCE_EXAMPLE_REF
	 * @model name="domainInstanceExampleRef"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_INSTANCE_EXAMPLE_REF_VALUE = 11;

	/**
	 * The '<em><b>Glossary Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific glossary
	 * <!-- end-model-doc -->
	 * @see #GLOSSARY_REF
	 * @model name="glossaryRef"
	 * @generated
	 * @ordered
	 */
	public static final int GLOSSARY_REF_VALUE = 12;

	/**
	 * The '<em><b>Glossary Term Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific term within a glossary
	 * <!-- end-model-doc -->
	 * @see #GLOSSARY_TERM_REF
	 * @model name="glossaryTermRef"
	 * @generated
	 * @ordered
	 */
	public static final int GLOSSARY_TERM_REF_VALUE = 13;

	/**
	 * The '<em><b>Storyboard Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific storyboard model
	 * <!-- end-model-doc -->
	 * @see #STORYBOARD_REF
	 * @model name="storyboardRef"
	 * @generated
	 * @ordered
	 */
	public static final int STORYBOARD_REF_VALUE = 14;

	/**
	 * The '<em><b>Freehand Document Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific document (e.g. ITS, transport protocol, etc.)
	 * <!-- end-model-doc -->
	 * @see #FREEHAND_DOCUMENT_REF
	 * @model name="freehandDocumentRef"
	 * @generated
	 * @ordered
	 */
	public static final int FREEHAND_DOCUMENT_REF_VALUE = 15;

	/**
	 * The '<em><b>Publication Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific publication (e.g. ballot, normative edition, etc.)
	 * <!-- end-model-doc -->
	 * @see #PUBLICATION_REF
	 * @model name="publicationRef"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLICATION_REF_VALUE = 16;

	/**
	 * The '<em><b>Datatype Model Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a datatype model
	 * <!-- end-model-doc -->
	 * @see #DATATYPE_MODEL_REF
	 * @model name="datatypeModelRef"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_MODEL_REF_VALUE = 17;

	/**
	 * The '<em><b>Datatype Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a datatype definition
	 * <!-- end-model-doc -->
	 * @see #DATATYPE_REF
	 * @model name="datatypeRef"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_REF_VALUE = 18;

	/**
	 * The '<em><b>Property Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific property of a datatype definition
	 * <!-- end-model-doc -->
	 * @see #PROPERTY_REF
	 * @model name="propertyRef"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_REF_VALUE = 19;

	/**
	 * The '<em><b>Static Model Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific static model
	 * <!-- end-model-doc -->
	 * @see #STATIC_MODEL_REF
	 * @model name="staticModelRef"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_MODEL_REF_VALUE = 20;

	/**
	 * The '<em><b>Subject Area Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific subject area in a static model
	 * <!-- end-model-doc -->
	 * @see #SUBJECT_AREA_REF
	 * @model name="subjectAreaRef"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_AREA_REF_VALUE = 21;

	/**
	 * The '<em><b>Class Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific class in a static model
	 * <!-- end-model-doc -->
	 * @see #CLASS_REF
	 * @model name="classRef"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_REF_VALUE = 22;

	/**
	 * The '<em><b>State Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific state for a class in a static model
	 * <!-- end-model-doc -->
	 * @see #STATE_REF
	 * @model name="stateRef"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_REF_VALUE = 23;

	/**
	 * The '<em><b>Transition Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific state transition for a class in a static model
	 * <!-- end-model-doc -->
	 * @see #TRANSITION_REF
	 * @model name="transitionRef"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_REF_VALUE = 24;

	/**
	 * The '<em><b>Attribute Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific attribute for a class in a static model
	 * <!-- end-model-doc -->
	 * @see #ATTRIBUTE_REF
	 * @model name="attributeRef"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_REF_VALUE = 25;

	/**
	 * The '<em><b>Association End Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific association end for a class in a static model
	 * <!-- end-model-doc -->
	 * @see #ASSOCIATION_END_REF
	 * @model name="associationEndRef"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_END_REF_VALUE = 26;

	/**
	 * The '<em><b>Trigger Event Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific trigger event
	 * <!-- end-model-doc -->
	 * @see #TRIGGER_EVENT_REF
	 * @model name="triggerEventRef"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_EVENT_REF_VALUE = 27;

	/**
	 * The '<em><b>Application Role Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific application role
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_ROLE_REF
	 * @model name="applicationRoleRef"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_ROLE_REF_VALUE = 28;

	/**
	 * The '<em><b>Interaction Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific interaction
	 * <!-- end-model-doc -->
	 * @see #INTERACTION_REF
	 * @model name="interactionRef"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTION_REF_VALUE = 29;

	/**
	 * The '<em><b>Vocabulary Model Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific vocabulary model
	 * <!-- end-model-doc -->
	 * @see #VOCABULARY_MODEL_REF
	 * @model name="vocabularyModelRef"
	 * @generated
	 * @ordered
	 */
	public static final int VOCABULARY_MODEL_REF_VALUE = 30;

	/**
	 * The '<em><b>Concept Domain Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific vocabulary domain
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_DOMAIN_REF
	 * @model name="conceptDomainRef"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_DOMAIN_REF_VALUE = 31;

	/**
	 * The '<em><b>Vocabulary Code System Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific code system
	 * <!-- end-model-doc -->
	 * @see #VOCABULARY_CODE_SYSTEM_REF
	 * @model name="vocabularyCodeSystemRef"
	 * @generated
	 * @ordered
	 */
	public static final int VOCABULARY_CODE_SYSTEM_REF_VALUE = 32;

	/**
	 * The '<em><b>Vocabulary Code Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific code within a code system
	 * <!-- end-model-doc -->
	 * @see #VOCABULARY_CODE_REF
	 * @model name="vocabularyCodeRef"
	 * @generated
	 * @ordered
	 */
	public static final int VOCABULARY_CODE_REF_VALUE = 33;

	/**
	 * The '<em><b>Vocabulary Value Set Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific value-set
	 * <!-- end-model-doc -->
	 * @see #VOCABULARY_VALUE_SET_REF
	 * @model name="vocabularyValueSetRef"
	 * @generated
	 * @ordered
	 */
	public static final int VOCABULARY_VALUE_SET_REF_VALUE = 34;

	/**
	 * The '<em><b>Test Scenario Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test Scenario Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_SCENARIO_REF
	 * @model name="testScenarioRef"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_SCENARIO_REF_VALUE = 35;

	/**
	 * The '<em><b>Test Case Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a specific value-set
	 * <!-- end-model-doc -->
	 * @see #TEST_CASE_REF
	 * @model name="testCaseRef"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CASE_REF_VALUE = 36;

	/**
	 * An array of all the '<em><b>Object Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectName[] VALUES_ARRAY = new ObjectName[] {
			CONSTRUCTED_ELEMENT, FOOTNOTE, REQUIREMENT_REF, EXTERNAL_SPEC_REF, FIGURE_REF, TABLE_REF, ITEM_NAME,
			ANNOTATION_REF, ARTIFACT_GROUP_REF, PACKAGE_REF, DOMAIN_ANALYSIS_MODEL_REF, DOMAIN_INSTANCE_EXAMPLE_REF,
			GLOSSARY_REF, GLOSSARY_TERM_REF, STORYBOARD_REF, FREEHAND_DOCUMENT_REF, PUBLICATION_REF,
			DATATYPE_MODEL_REF, DATATYPE_REF, PROPERTY_REF, STATIC_MODEL_REF, SUBJECT_AREA_REF, CLASS_REF, STATE_REF,
			TRANSITION_REF, ATTRIBUTE_REF, ASSOCIATION_END_REF, TRIGGER_EVENT_REF, APPLICATION_ROLE_REF,
			INTERACTION_REF, VOCABULARY_MODEL_REF, CONCEPT_DOMAIN_REF, VOCABULARY_CODE_SYSTEM_REF, VOCABULARY_CODE_REF,
			VOCABULARY_VALUE_SET_REF, TEST_SCENARIO_REF, TEST_CASE_REF, };

	/**
	 * A public read-only list of all the '<em><b>Object Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectName get(int value) {
		switch (value) {
			case CONSTRUCTED_ELEMENT_VALUE:
				return CONSTRUCTED_ELEMENT;
			case FOOTNOTE_VALUE:
				return FOOTNOTE;
			case REQUIREMENT_REF_VALUE:
				return REQUIREMENT_REF;
			case EXTERNAL_SPEC_REF_VALUE:
				return EXTERNAL_SPEC_REF;
			case FIGURE_REF_VALUE:
				return FIGURE_REF;
			case TABLE_REF_VALUE:
				return TABLE_REF;
			case ITEM_NAME_VALUE:
				return ITEM_NAME;
			case ANNOTATION_REF_VALUE:
				return ANNOTATION_REF;
			case ARTIFACT_GROUP_REF_VALUE:
				return ARTIFACT_GROUP_REF;
			case PACKAGE_REF_VALUE:
				return PACKAGE_REF;
			case DOMAIN_ANALYSIS_MODEL_REF_VALUE:
				return DOMAIN_ANALYSIS_MODEL_REF;
			case DOMAIN_INSTANCE_EXAMPLE_REF_VALUE:
				return DOMAIN_INSTANCE_EXAMPLE_REF;
			case GLOSSARY_REF_VALUE:
				return GLOSSARY_REF;
			case GLOSSARY_TERM_REF_VALUE:
				return GLOSSARY_TERM_REF;
			case STORYBOARD_REF_VALUE:
				return STORYBOARD_REF;
			case FREEHAND_DOCUMENT_REF_VALUE:
				return FREEHAND_DOCUMENT_REF;
			case PUBLICATION_REF_VALUE:
				return PUBLICATION_REF;
			case DATATYPE_MODEL_REF_VALUE:
				return DATATYPE_MODEL_REF;
			case DATATYPE_REF_VALUE:
				return DATATYPE_REF;
			case PROPERTY_REF_VALUE:
				return PROPERTY_REF;
			case STATIC_MODEL_REF_VALUE:
				return STATIC_MODEL_REF;
			case SUBJECT_AREA_REF_VALUE:
				return SUBJECT_AREA_REF;
			case CLASS_REF_VALUE:
				return CLASS_REF;
			case STATE_REF_VALUE:
				return STATE_REF;
			case TRANSITION_REF_VALUE:
				return TRANSITION_REF;
			case ATTRIBUTE_REF_VALUE:
				return ATTRIBUTE_REF;
			case ASSOCIATION_END_REF_VALUE:
				return ASSOCIATION_END_REF;
			case TRIGGER_EVENT_REF_VALUE:
				return TRIGGER_EVENT_REF;
			case APPLICATION_ROLE_REF_VALUE:
				return APPLICATION_ROLE_REF;
			case INTERACTION_REF_VALUE:
				return INTERACTION_REF;
			case VOCABULARY_MODEL_REF_VALUE:
				return VOCABULARY_MODEL_REF;
			case CONCEPT_DOMAIN_REF_VALUE:
				return CONCEPT_DOMAIN_REF;
			case VOCABULARY_CODE_SYSTEM_REF_VALUE:
				return VOCABULARY_CODE_SYSTEM_REF;
			case VOCABULARY_CODE_REF_VALUE:
				return VOCABULARY_CODE_REF;
			case VOCABULARY_VALUE_SET_REF_VALUE:
				return VOCABULARY_VALUE_SET_REF;
			case TEST_SCENARIO_REF_VALUE:
				return TEST_SCENARIO_REF;
			case TEST_CASE_REF_VALUE:
				return TEST_CASE_REF;
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
	private ObjectName(int value, String name, String literal) {
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

} // ObjectName
