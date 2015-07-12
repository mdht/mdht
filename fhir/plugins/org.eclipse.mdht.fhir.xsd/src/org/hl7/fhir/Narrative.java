/**
 */
package org.hl7.fhir;

import org.w3._1999.xhtml.DivType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Narrative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A human-readable formatted text, including images.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Narrative#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Narrative#getDiv <em>Div</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNarrative()
 * @model extendedMetaData="name='Narrative' kind='elementOnly'"
 * @generated
 */
public interface Narrative extends Element {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(NarrativeStatus)
	 * @see org.hl7.fhir.FhirPackage#getNarrative_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	NarrativeStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Narrative#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(NarrativeStatus value);

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual narrative content, a stripped down version of XHTML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(DivType)
	 * @see org.hl7.fhir.FhirPackage#getNarrative_Div()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='div' namespace='http://www.w3.org/1999/xhtml'"
	 * @generated
	 */
	DivType getDiv();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Narrative#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(DivType value);

} // Narrative
