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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getApplicationRole <em>Application Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getArtifactXrefSummary <em>Artifact Xref Summary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getCodeSystemSupplement <em>Code System Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getConformanceProfile <em>Conformance Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDatatypeModelLibrary <em>Datatype Model Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDerivedStaticModel <em>Derived Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDerivedStaticModels <em>Derived Static Models</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDomainAnalysisModel <em>Domain Analysis Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDomainInstanceExample <em>Domain Instance Example</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getFreehandDocument <em>Freehand Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getInteractionProfile <em>Interaction Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getMifChanges <em>Mif Changes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getPackage <em>Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getSerializedStaticModel <em>Serialized Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getSerializedStaticModels <em>Serialized Static Models</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStaticModel <em>Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStaticModelInterfacePackage <em>Static Model Interface Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStaticModels <em>Static Models</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStoryboard <em>Storyboard</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStructuredDocument <em>Structured Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTestScenario <em>Test Scenario</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTxtComplex <em>Txt Complex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTxtComplexWithLanguage <em>Txt Complex With Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTxtInlineOnly <em>Txt Inline Only</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getVocabularyModel <em>Vocabulary Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Application Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a system capable of sending and/or receiving HL7 interactions
	 * UML: A stereotype on Interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Role</em>' containment reference.
	 * @see #setApplicationRole(GlobalApplicationRole)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_ApplicationRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='applicationRole' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalApplicationRole getApplicationRole();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getApplicationRole <em>Application Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Role</em>' containment reference.
	 * @see #getApplicationRole()
	 * @generated
	 */
	void setApplicationRole(GlobalApplicationRole value);

	/**
	 * Returns the value of the '<em><b>Artifact Xref Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a set of cross-references .
	 * UML: An instance of a Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Xref Summary</em>' containment reference.
	 * @see #setArtifactXrefSummary(GlobalArtifactXRefSummary)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_ArtifactXrefSummary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifactXrefSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalArtifactXRefSummary getArtifactXrefSummary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getArtifactXrefSummary <em>Artifact Xref Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Xref Summary</em>' containment reference.
	 * @see #getArtifactXrefSummary()
	 * @generated
	 */
	void setArtifactXrefSummary(GlobalArtifactXRefSummary value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a code system that is referenced by one or mode value sets.  Created to allow code systems to be maintained as separate files
	 * UML: Stereotype on package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(GlobalCodeSystem)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_CodeSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalCodeSystem getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getCodeSystem <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(GlobalCodeSystem value);

	/**
	 * Returns the value of the '<em><b>Code System Supplement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about an extension to a code system that is referenced by one or mode value sets.  Created to allow code system extensions to be maintained as separate files
	 * UML: Stereotype on package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Supplement</em>' containment reference.
	 * @see #setCodeSystemSupplement(GlobalCodeSystemSupplement)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_CodeSystemSupplement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='codeSystemSupplement' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalCodeSystemSupplement getCodeSystemSupplement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getCodeSystemSupplement <em>Code System Supplement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Supplement</em>' containment reference.
	 * @see #getCodeSystemSupplement()
	 * @generated
	 */
	void setCodeSystemSupplement(GlobalCodeSystemSupplement value);

	/**
	 * Returns the value of the '<em><b>Conformance Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of the set of behaviors a particular system or type of system has or is expected to have.
	 * UML: A stereotype of Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Profile</em>' containment reference.
	 * @see #setConformanceProfile(GlobalConformanceProfile)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_ConformanceProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conformanceProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalConformanceProfile getConformanceProfile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getConformanceProfile <em>Conformance Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Profile</em>' containment reference.
	 * @see #getConformanceProfile()
	 * @generated
	 */
	void setConformanceProfile(GlobalConformanceProfile value);

	/**
	 * Returns the value of the '<em><b>Datatype Model Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A datatype model
	 * UML: A Package with a DatatypeModel stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype Model Library</em>' containment reference.
	 * @see #setDatatypeModelLibrary(GlobalDatatypeModelLibrary)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_DatatypeModelLibrary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='datatypeModelLibrary' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalDatatypeModelLibrary getDatatypeModelLibrary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDatatypeModelLibrary <em>Datatype Model Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Model Library</em>' containment reference.
	 * @see #getDatatypeModelLibrary()
	 * @generated
	 */
	void setDatatypeModelLibrary(GlobalDatatypeModelLibrary value);

	/**
	 * Returns the value of the '<em><b>Derived Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation expressed as a set of changes applied to a prior static model.  Used for RIM, CIM, LIM, etc.
	 * UML: An instance of a StaticModel stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Static Model</em>' containment reference.
	 * @see #setDerivedStaticModel(GlobalDerivedStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_DerivedStaticModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derivedStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalDerivedStaticModel getDerivedStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDerivedStaticModel <em>Derived Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Static Model</em>' containment reference.
	 * @see #getDerivedStaticModel()
	 * @generated
	 */
	void setDerivedStaticModel(GlobalDerivedStaticModel value);

	/**
	 * Returns the value of the '<em><b>Derived Static Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Static Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Static Models</em>' containment reference.
	 * @see #setDerivedStaticModels(DerivedStaticModelsType)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_DerivedStaticModels()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derivedStaticModels' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivedStaticModelsType getDerivedStaticModels();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDerivedStaticModels <em>Derived Static Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Static Models</em>' containment reference.
	 * @see #getDerivedStaticModels()
	 * @generated
	 */
	void setDerivedStaticModels(DerivedStaticModelsType value);

	/**
	 * Returns the value of the '<em><b>Domain Analysis Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A representation of an information model in terms familiar to business experts
	 * UML: A stereotype on Model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Analysis Model</em>' containment reference.
	 * @see #setDomainAnalysisModel(GlobalDomainAnalysisModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_DomainAnalysisModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainAnalysisModel' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalDomainAnalysisModel getDomainAnalysisModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDomainAnalysisModel <em>Domain Analysis Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Analysis Model</em>' containment reference.
	 * @see #getDomainAnalysisModel()
	 * @generated
	 */
	void setDomainAnalysisModel(GlobalDomainAnalysisModel value);

	/**
	 * Returns the value of the '<em><b>Domain Instance Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of abstract examples identifying the types of data that might be exchanged
	 * UML: A stereotype on Instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Instance Example</em>' containment reference.
	 * @see #setDomainInstanceExample(GlobalDomainInstanceExample)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_DomainInstanceExample()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainInstanceExample' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalDomainInstanceExample getDomainInstanceExample();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getDomainInstanceExample <em>Domain Instance Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Instance Example</em>' containment reference.
	 * @see #getDomainInstanceExample()
	 * @generated
	 */
	void setDomainInstanceExample(GlobalDomainInstanceExample value);

	/**
	 * Returns the value of the '<em><b>Freehand Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the content of a single free-hand document, maintained as an independent entity.  It is similar to an annotation, but stands alone as opposed to being part of another artifact.
	 * UML: A stereotype of Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freehand Document</em>' containment reference.
	 * @see #setFreehandDocument(GlobalFreehandDocument)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_FreehandDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='freehandDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalFreehandDocument getFreehandDocument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getFreehandDocument <em>Freehand Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freehand Document</em>' containment reference.
	 * @see #getFreehandDocument()
	 * @generated
	 */
	void setFreehandDocument(GlobalFreehandDocument value);

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of terms and definitions used within HL7 or within a particular domain
	 * UML: Stereotype on Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference.
	 * @see #setGlossary(GlobalGlossary)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_Glossary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossary' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalGlossary getGlossary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getGlossary <em>Glossary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' containment reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(GlobalGlossary value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a transmission of data for a particular reason with a set of expected behaviors
	 * UML: A stereotype on Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(GlobalInteraction)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_Interaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalInteraction getInteraction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(GlobalInteraction value);

	/**
	 * Returns the value of the '<em><b>Interaction Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of how a particular system or type of system supports a specific interaction including both static and dynamic behavior.
	 * UML: A stereotype of Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Profile</em>' containment reference.
	 * @see #setInteractionProfile(GlobalInteractionProfile)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_InteractionProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interactionProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalInteractionProfile getInteractionProfile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getInteractionProfile <em>Interaction Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Profile</em>' containment reference.
	 * @see #getInteractionProfile()
	 * @generated
	 */
	void setInteractionProfile(GlobalInteractionProfile value);

	/**
	 * Returns the value of the '<em><b>Mif Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of changes that have occurred between an original artifact and a resulting revised artifact
	 * UML: Does not directly correspond to UML.  It would be a complex tag, except that it's a stand-alone artifact . . .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mif Changes</em>' containment reference.
	 * @see #setMifChanges(GlobalMifChanges)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_MifChanges()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mifChanges' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalMifChanges getMifChanges();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getMifChanges <em>Mif Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mif Changes</em>' containment reference.
	 * @see #getMifChanges()
	 * @generated
	 */
	void setMifChanges(GlobalMifChanges value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a "collection" of artifacts within a particular namespace.
	 * UML: An instance of a Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(GlobalGenericPackage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_Package()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalGenericPackage getPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(GlobalGenericPackage value);

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a particular organization and rendering of a collection of artifacts.
	 * UML: An instance of a Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication</em>' containment reference.
	 * @see #setPublication(GlobalPublicationPackage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_Publication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publication' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalPublicationPackage getPublication();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getPublication <em>Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication</em>' containment reference.
	 * @see #getPublication()
	 * @generated
	 */
	void setPublication(GlobalPublicationPackage value);

	/**
	 * Returns the value of the '<em><b>Serialized Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation.  Used for CIM, LIM, etc.
	 * UML: An instance of a SerializedStaticModel stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serialized Static Model</em>' containment reference.
	 * @see #setSerializedStaticModel(GlobalSerializedStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_SerializedStaticModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serializedStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalSerializedStaticModel getSerializedStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getSerializedStaticModel <em>Serialized Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Static Model</em>' containment reference.
	 * @see #getSerializedStaticModel()
	 * @generated
	 */
	void setSerializedStaticModel(GlobalSerializedStaticModel value);

	/**
	 * Returns the value of the '<em><b>Serialized Static Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialized Static Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialized Static Models</em>' containment reference.
	 * @see #setSerializedStaticModels(SerializedStaticModelsType)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_SerializedStaticModels()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serializedStaticModels' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedStaticModelsType getSerializedStaticModels();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getSerializedStaticModels <em>Serialized Static Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Static Models</em>' containment reference.
	 * @see #getSerializedStaticModels()
	 * @generated
	 */
	void setSerializedStaticModels(SerializedStaticModelsType value);

	/**
	 * Returns the value of the '<em><b>Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation.  Used for RIM, CIM, LIM, etc.
	 * UML: An instance of a StaticModel stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Model</em>' containment reference.
	 * @see #setStaticModel(GlobalStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_StaticModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalStaticModel getStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStaticModel <em>Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Model</em>' containment reference.
	 * @see #getStaticModel()
	 * @generated
	 */
	void setStaticModel(GlobalStaticModel value);

	/**
	 * Returns the value of the '<em><b>Static Model Interface Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of CMETs and stubs available to a StaticModel that imports it.  Equivalent to pre-MIF concept of "CMETInfo.txt" file
	 * UML: A package of Common model element and stub interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Model Interface Package</em>' containment reference.
	 * @see #setStaticModelInterfacePackage(GlobalStaticModelInterfacePackage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_StaticModelInterfacePackage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticModelInterfacePackage' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalStaticModelInterfacePackage getStaticModelInterfacePackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStaticModelInterfacePackage <em>Static Model Interface Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Model Interface Package</em>' containment reference.
	 * @see #getStaticModelInterfacePackage()
	 * @generated
	 */
	void setStaticModelInterfacePackage(GlobalStaticModelInterfacePackage value);

	/**
	 * Returns the value of the '<em><b>Static Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Models</em>' containment reference.
	 * @see #setStaticModels(StaticModelsType)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_StaticModels()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticModels' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelsType getStaticModels();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStaticModels <em>Static Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Models</em>' containment reference.
	 * @see #getStaticModels()
	 * @generated
	 */
	void setStaticModels(StaticModelsType value);

	/**
	 * Returns the value of the '<em><b>Storyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptions of scenarios intended to be addressed by standards
	 * UML: A stereotype on UseCase
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storyboard</em>' containment reference.
	 * @see #setStoryboard(GlobalStoryboard)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_Storyboard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='storyboard' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalStoryboard getStoryboard();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStoryboard <em>Storyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storyboard</em>' containment reference.
	 * @see #getStoryboard()
	 * @generated
	 */
	void setStoryboard(GlobalStoryboard value);

	/**
	 * Returns the value of the '<em><b>Structured Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a transmission of data for a particular reason with a set of expected behaviors
	 * UML: A stereotype on Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Document</em>' containment reference.
	 * @see #setStructuredDocument(GlobalStructuredDocument)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_StructuredDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structuredDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalStructuredDocument getStructuredDocument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getStructuredDocument <em>Structured Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Document</em>' containment reference.
	 * @see #getStructuredDocument()
	 * @generated
	 */
	void setStructuredDocument(GlobalStructuredDocument value);

	/**
	 * Returns the value of the '<em><b>Test Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a sequence of tests intended to verify a particular set of behavior
	 * UML: Does not directly correspond to UML.  It would be a complex tag, except that it's a stand-alone artifact . . .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Scenario</em>' containment reference.
	 * @see #setTestScenario(GlobalTestScenario)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_TestScenario()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='testScenario' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalTestScenario getTestScenario();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTestScenario <em>Test Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Scenario</em>' containment reference.
	 * @see #getTestScenario()
	 * @generated
	 */
	void setTestScenario(GlobalTestScenario value);

	/**
	 * Returns the value of the '<em><b>Trigger Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reasons why information is exchanged
	 * UML: A stereotype on Event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Event</em>' containment reference.
	 * @see #setTriggerEvent(GlobalTriggerEvent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_TriggerEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='triggerEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalTriggerEvent getTriggerEvent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTriggerEvent <em>Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' containment reference.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(GlobalTriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Txt Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows direct editing and validating of full markup content
	 * UML: Definition of content for an annotation or complex tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Txt Complex</em>' containment reference.
	 * @see #setTxtComplex(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_TxtComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='txtComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getTxtComplex();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTxtComplex <em>Txt Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Complex</em>' containment reference.
	 * @see #getTxtComplex()
	 * @generated
	 */
	void setTxtComplex(Flow value);

	/**
	 * Returns the value of the '<em><b>Txt Complex With Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows direct editing and validating of full markup content, including language
	 * UML: Definition of content for an annotation or complex tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Txt Complex With Language</em>' containment reference.
	 * @see #setTxtComplexWithLanguage(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_TxtComplexWithLanguage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='txtComplexWithLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getTxtComplexWithLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTxtComplexWithLanguage <em>Txt Complex With Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Complex With Language</em>' containment reference.
	 * @see #getTxtComplexWithLanguage()
	 * @generated
	 */
	void setTxtComplexWithLanguage(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Txt Inline Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows direct editing and validating of inline markup content
	 * UML: Definition of content for an annotation or complex tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Txt Inline Only</em>' containment reference.
	 * @see #setTxtInlineOnly(Inline)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_TxtInlineOnly()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='txtInlineOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	Inline getTxtInlineOnly();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getTxtInlineOnly <em>Txt Inline Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Inline Only</em>' containment reference.
	 * @see #getTxtInlineOnly()
	 * @generated
	 */
	void setTxtInlineOnly(Inline value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a value set that implements a vocabulary domain in one or more contexts.  Created to allow value sets to be maintained as separate files
	 * UML: Stereotype on package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(GlobalValueSet)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_ValueSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(GlobalValueSet value);

	/**
	 * Returns the value of the '<em><b>Vocabulary Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about one or more vocabulary domains, code systems and/or value sets.
	 * UML: Stereotype on package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vocabulary Model</em>' containment reference.
	 * @see #setVocabularyModel(GlobalVocabularyModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentRoot_VocabularyModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vocabularyModel' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalVocabularyModel getVocabularyModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot#getVocabularyModel <em>Vocabulary Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary Model</em>' containment reference.
	 * @see #getVocabularyModel()
	 * @generated
	 */
	void setVocabularyModel(GlobalVocabularyModel value);

} // DocumentRoot
