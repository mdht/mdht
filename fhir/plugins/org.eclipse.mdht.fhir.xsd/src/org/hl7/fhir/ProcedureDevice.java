/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedureDevice#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureDevice#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedureDevice()
 * @model extendedMetaData="name='Procedure.Device' kind='elementOnly'"
 * @generated
 */
public interface ProcedureDevice extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of change that happened to the device during the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedureDevice_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureDevice#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manipulated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device that was manipulated (changed) during the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manipulated</em>' containment reference.
	 * @see #setManipulated(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureDevice_Manipulated()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manipulated' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManipulated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureDevice#getManipulated <em>Manipulated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulated</em>' containment reference.
	 * @see #getManipulated()
	 * @generated
	 */
	void setManipulated(Reference value);

} // ProcedureDevice
