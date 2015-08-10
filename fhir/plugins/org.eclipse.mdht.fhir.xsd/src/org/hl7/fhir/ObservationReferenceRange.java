/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurements and simple assertions made about a patient, device or other subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange()
 * @model extendedMetaData="name='Observation.ReferenceRange' kind='elementOnly'"
 * @generated
 */
public interface ObservationReferenceRange extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the low bound of the reference range. If this element is omitted, the low bound of the reference range is assumed to be meaningless. (e.g. reference range is <2.3)  If the low.comparator element is missing, it is assumed to be '>'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Low()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getLow();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the high bound of the reference range. If this element is omitted, the high bound of the reference range is assumed to be meaningless. (e.g. reference range is > 5)  If the low.comparator element is missing , it is assumed to be '<'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_High()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getHigh();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code for the meaning of the reference range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meaning</em>' containment reference.
	 * @see #setMeaning(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Meaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meaning' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getMeaning <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' containment reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Range)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Age()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='age' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of 'normals'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

} // ObservationReferenceRange
