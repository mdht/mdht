/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getSupportedReleases <em>Supported Releases</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getSupportedITS <em>Supported ITS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getAdditionalDatatypeModel <em>Additional Datatype Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getDatatypeLimitation <em>Datatype Limitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getAdditionalVocabularyModel <em>Additional Vocabulary Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints#getVocabularyLimitation <em>Vocabulary Limitation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints()
 * @model extendedMetaData="name='ImplementationConstraints' kind='elementOnly'"
 * @generated
 */
public interface ImplementationConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Supported Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ReleaseList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a set of supported releases for this element.  Influences what datatypes, vocabulary and RIM version is supported
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Releases</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_SupportedReleases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedReleases' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReleaseList> getSupportedReleases();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_Context()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Context:1'"
	 * @generated
	 */
	FeatureMap getContext();

	/**
	 * Returns the value of the '<em><b>Realm Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RealmElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the affiliate or sub-realm associated with the element.  If none is specified, the affiliate associated with the package is assumed.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realm Namespace</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_RealmNamespace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realmNamespace' namespace='##targetNamespace' group='#Context:1'"
	 * @generated
	 */
	EList<RealmElement> getRealmNamespace();

	/**
	 * Returns the value of the '<em><b>Supported ITS</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the implementation technology specifications supported by the system.  If version is not specified, the assumption is that all versions present in the supported releases are supported
	 * UML: Tag on InteractionProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported ITS</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_SupportedITS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedITS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getSupportedITS();

	/**
	 * Returns the value of the '<em><b>Additional Datatype Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any additional datatype flavors required to express limitations in ability to express datatypes
	 * UML: Datatypes used by Classes within the models used by this artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Datatype Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_AdditionalDatatypeModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalDatatypeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeModelLibrary> getAdditionalDatatypeModel();

	/**
	 * Returns the value of the '<em><b>Datatype Limitation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates datatypes not fully supported and what the limitations on those datatypes are.  Cascades through all static models supported by this element.
	 * UML: Tag on ConformanceProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype Limitation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_DatatypeLimitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datatypeLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeLimitation> getDatatypeLimitation();

	/**
	 * Returns the value of the '<em><b>Additional Vocabulary Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any additional tables, domains, valuesets or bindings required to express limitations in ability to express datatypes
	 * UML: VocabularyDependencies of attributes and datatype properties within the models used by this artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Vocabulary Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_AdditionalVocabularyModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalVocabularyModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyModel> getAdditionalVocabularyModel();

	/**
	 * Returns the value of the '<em><b>Vocabulary Limitation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates domains, valuesets and code systems not fully supported and what the limitations on those vocabulary elements are.  Cascades through all static models supported by this element.
	 * UML: Tag on ConformanceProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vocabulary Limitation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationConstraints_VocabularyLimitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vocabularyLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyLimitation> getVocabularyLimitation();

} // ImplementationConstraints
