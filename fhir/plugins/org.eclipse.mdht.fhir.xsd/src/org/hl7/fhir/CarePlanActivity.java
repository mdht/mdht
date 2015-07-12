/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getActionResulting <em>Action Resulting</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity()
 * @model extendedMetaData="name='CarePlan.Activity' kind='elementOnly'"
 * @generated
 */
public interface CarePlanActivity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Resulting</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Resulting</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_ActionResulting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionResulting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getActionResulting();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes about the execution of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNotes();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanActivity#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the proposed activity represented in a specific resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanActivity#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(CarePlanDetail)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlanDetail getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanActivity#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(CarePlanDetail value);

} // CarePlanActivity
