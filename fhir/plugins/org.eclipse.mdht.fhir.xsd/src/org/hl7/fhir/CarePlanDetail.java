/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Detail</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getProhibited <em>Prohibited</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getScheduledTiming <em>Scheduled Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getScheduledString <em>Scheduled String</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanDetail#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail()
 * @model extendedMetaData="name='CarePlan.Detail' kind='elementOnly'"
 * @generated
 */
public interface CarePlanDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High-level categorization of the type of activity in a care plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CarePlanActivityCategory)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlanActivityCategory getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CarePlanActivityCategory value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed description of the type of planned activity.  E.g. What lab test, what procedure, what kind of encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #setReasonCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_ReasonCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getReasonCodeableConcept <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #getReasonCodeableConcept()
	 * @generated
	 */
	void setReasonCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference.
	 * @see #setReasonReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getReasonReference <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Reference</em>' containment reference.
	 * @see #getReasonReference()
	 * @generated
	 */
	void setReasonReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getGoal();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what progress is being made for the specific activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CarePlanActivityStatus)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlanActivityStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CarePlanActivityStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Prohibited</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prohibited</em>' containment reference.
	 * @see #setProhibited(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Prohibited()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='prohibited' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getProhibited();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getProhibited <em>Prohibited</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prohibited</em>' containment reference.
	 * @see #getProhibited()
	 * @generated
	 */
	void setProhibited(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduled Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Timing</em>' containment reference.
	 * @see #setScheduledTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_ScheduledTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getScheduledTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getScheduledTiming <em>Scheduled Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Timing</em>' containment reference.
	 * @see #getScheduledTiming()
	 * @generated
	 */
	void setScheduledTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Scheduled Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Period</em>' containment reference.
	 * @see #setScheduledPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_ScheduledPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getScheduledPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getScheduledPeriod <em>Scheduled Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Period</em>' containment reference.
	 * @see #getScheduledPeriod()
	 * @generated
	 */
	void setScheduledPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Scheduled String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled String</em>' containment reference.
	 * @see #setScheduledString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_ScheduledString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getScheduledString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getScheduledString <em>Scheduled String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled String</em>' containment reference.
	 * @see #getScheduledString()
	 * @generated
	 */
	void setScheduledString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the facility where the activity will occur.  E.g. home, hospital, specific clinic, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who's expected to be involved in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPerformer();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the food, drug or other product to be consumed or supplied in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Product()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Reference value);

	/**
	 * Returns the value of the '<em><b>Daily Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the quantity expected to be consumed in a given day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daily Amount</em>' containment reference.
	 * @see #setDailyAmount(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_DailyAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dailyAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDailyAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getDailyAmount <em>Daily Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Amount</em>' containment reference.
	 * @see #getDailyAmount()
	 * @generated
	 */
	void setDailyAmount(Quantity value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the quantity expected to be supplied, addministered or consumed by the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanDetail_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanDetail#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.hl7.fhir.String value);

} // CarePlanDetail
