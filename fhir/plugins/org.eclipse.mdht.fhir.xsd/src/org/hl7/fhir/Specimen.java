/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sample for analysis.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Specimen#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getAccessionIdentifier <em>Accession Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getReceivedTime <em>Received Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.hl7.fhir.Specimen#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimen()
 * @model extendedMetaData="name='Specimen' kind='elementOnly'"
 * @generated
 */
public interface Specimen extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id for specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of material that forms the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Specimen#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of a another specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getParent();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the specimen came from. This may be from the patient(s) or from the environment or a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Specimen#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Accession Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accession Identifier</em>' containment reference.
	 * @see #setAccessionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_AccessionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getAccessionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Specimen#getAccessionIdentifier <em>Accession Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession Identifier</em>' containment reference.
	 * @see #getAccessionIdentifier()
	 * @generated
	 */
	void setAccessionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Received Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time when specimen was received for processing or testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Time</em>' containment reference.
	 * @see #setReceivedTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_ReceivedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receivedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getReceivedTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Specimen#getReceivedTime <em>Received Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Time</em>' containment reference.
	 * @see #getReceivedTime()
	 * @generated
	 */
	void setReceivedTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details concerning the specimen collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(SpecimenCollection)
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenCollection getCollection();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Specimen#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(SpecimenCollection value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenTreatment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details concerning treatment and processing steps for the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Treatment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='treatment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenTreatment> getTreatment();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimen_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenContainer> getContainer();

} // Specimen
