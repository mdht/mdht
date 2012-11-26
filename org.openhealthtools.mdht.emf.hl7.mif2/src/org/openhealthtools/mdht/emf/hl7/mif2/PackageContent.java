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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of contents contained within a package
 * UML: A collection of the ownedElement aggregation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getFreehandDocument <em>Freehand Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getDomainAnalysisModel <em>Domain Analysis Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getDomainInstanceExample <em>Domain Instance Example</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getStoryboard <em>Storyboard</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getDatatypeModelLibrary <em>Datatype Model Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getStaticModelInterfacePackage <em>Static Model Interface Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getVocabularyModel <em>Vocabulary Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getStaticModel <em>Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getSerializedStaticModel <em>Serialized Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getDerivedStaticModel <em>Derived Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getStructuredDocument <em>Structured Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getApplicationRole <em>Application Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getInteractionProfile <em>Interaction Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getConformanceProfile <em>Conformance Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getTestScenario <em>Test Scenario</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent()
 * @model extendedMetaData="name='PackageContent' kind='elementOnly'"
 * @generated
 */
public interface PackageContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Freehand Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalFreehandDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the content of a single free-hand document, maintained as an independent entity.  It is similar to an annotation, but stands alone as opposed to being part of another artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freehand Document</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_FreehandDocument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='freehandDocument' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalFreehandDocument> getFreehandDocument();

	/**
	 * Returns the value of the '<em><b>Domain Analysis Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainAnalysisModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A representation of an information model in terms familiar to business experts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Analysis Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_DomainAnalysisModel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainAnalysisModel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalDomainAnalysisModel> getDomainAnalysisModel();

	/**
	 * Returns the value of the '<em><b>Domain Instance Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainInstanceExample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of abstract examples identifying the types of data that might be exchanged
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Instance Example</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_DomainInstanceExample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainInstanceExample' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalDomainInstanceExample> getDomainInstanceExample();

	/**
	 * Returns the value of the '<em><b>Storyboard</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStoryboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptions of scenarios intended to be addressed by standards
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storyboard</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_Storyboard()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='storyboard' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalStoryboard> getStoryboard();

	/**
	 * Returns the value of the '<em><b>Datatype Model Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDatatypeModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A datatype model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype Model Library</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_DatatypeModelLibrary()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='datatypeModelLibrary' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalDatatypeModelLibrary> getDatatypeModelLibrary();

	/**
	 * Returns the value of the '<em><b>Static Model Interface Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModelInterfacePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of CMETs and stubs available to a StaticModel that imports it.  Equivalent to pre-MIF concept of "CMETInfo.txt" file
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Model Interface Package</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_StaticModelInterfacePackage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticModelInterfacePackage' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalStaticModelInterfacePackage> getStaticModelInterfacePackage();

	/**
	 * Returns the value of the '<em><b>Vocabulary Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalVocabularyModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about one or more vocabulary domains, code systems and/or value sets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vocabulary Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_VocabularyModel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vocabularyModel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalVocabularyModel> getVocabularyModel();

	/**
	 * Returns the value of the '<em><b>Static Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation.  Used for RIM, CIM, LIM, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_StaticModel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticModel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalStaticModel> getStaticModel();

	/**
	 * Returns the value of the '<em><b>Serialized Static Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation.  Used for CIM, LIM, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serialized Static Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_SerializedStaticModel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serializedStaticModel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalSerializedStaticModel> getSerializedStaticModel();

	/**
	 * Returns the value of the '<em><b>Derived Static Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDerivedStaticModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation expressed as a set of changes applied to a prior static model.  Used for RIM, CIM, LIM, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Static Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_DerivedStaticModel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derivedStaticModel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalDerivedStaticModel> getDerivedStaticModel();

	/**
	 * Returns the value of the '<em><b>Structured Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStructuredDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a transmission of data for a particular reason with a set of expected behaviors
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Document</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_StructuredDocument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structuredDocument' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalStructuredDocument> getStructuredDocument();

	/**
	 * Returns the value of the '<em><b>Trigger Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalTriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reasons why information is exchanged
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Event</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_TriggerEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='triggerEvent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalTriggerEvent> getTriggerEvent();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a transmission of data for a particular reason with a set of expected behaviors
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_Interaction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalInteraction> getInteraction();

	/**
	 * Returns the value of the '<em><b>Application Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalApplicationRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a system capable of sending and/or receiving HL7 interactions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Role</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_ApplicationRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='applicationRole' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalApplicationRole> getApplicationRole();

	/**
	 * Returns the value of the '<em><b>Interaction Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteractionProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of how a particular system or type of system supports a specific interaction including both static and dynamic behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Profile</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_InteractionProfile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interactionProfile' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalInteractionProfile> getInteractionProfile();

	/**
	 * Returns the value of the '<em><b>Conformance Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalConformanceProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of the set of behaviors a particular system or type of system has or is expected to have.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Profile</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_ConformanceProfile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conformanceProfile' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalConformanceProfile> getConformanceProfile();

	/**
	 * Returns the value of the '<em><b>Test Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalTestScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a sequence of tests intended to verify a particular set of behavior
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Scenario</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_TestScenario()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='testScenario' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalTestScenario> getTestScenario();

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalPublicationPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a particular organization and rendering of a collection of artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_Publication()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publication' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalPublicationPackage> getPublication();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalGenericPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a "collection" of artifacts within a particular namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageContent_Package()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalGenericPackage> getPackage();

} // PackageContent
