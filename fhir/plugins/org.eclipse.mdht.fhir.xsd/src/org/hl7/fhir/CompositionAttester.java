/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Attester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CompositionAttester#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionAttester#getTime <em>Time</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionAttester#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCompositionAttester()
 * @model extendedMetaData="name='Composition.Attester' kind='elementOnly'"
 * @generated
 */
public interface CompositionAttester extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CompositionAttestationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of attestation the authenticator offers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCompositionAttester_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompositionAttestationMode> getMode();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When composition was attested by the party.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCompositionAttester_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionAttester#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who attested the composition in the specified way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCompositionAttester_Party()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionAttester#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

} // CompositionAttester
