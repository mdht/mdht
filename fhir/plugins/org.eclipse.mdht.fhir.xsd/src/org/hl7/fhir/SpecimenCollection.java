/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sample for analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getCollectedDateTime <em>Collected Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getCollectedPeriod <em>Collected Period</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getBodySite <em>Body Site</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection()
 * @model extendedMetaData="name='Specimen.Collection' kind='elementOnly'"
 * @generated
 */
public interface SpecimenCollection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who collected the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference.
	 * @see #setCollector(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Collector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collector' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCollector();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getCollector <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' containment reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Reference value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To communicate any details or issues encountered during the specimen collection procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getComment();

	/**
	 * Returns the value of the '<em><b>Collected Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collected Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collected Date Time</em>' containment reference.
	 * @see #setCollectedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_CollectedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCollectedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getCollectedDateTime <em>Collected Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected Date Time</em>' containment reference.
	 * @see #getCollectedDateTime()
	 * @generated
	 */
	void setCollectedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Collected Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collected Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collected Period</em>' containment reference.
	 * @see #setCollectedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_CollectedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getCollectedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getCollectedPeriod <em>Collected Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected Period</em>' containment reference.
	 * @see #getCollectedPeriod()
	 * @generated
	 */
	void setCollectedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value specifying the technique that is used to perform the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

} // SpecimenCollection
