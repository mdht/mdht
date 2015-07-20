/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centres, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Account#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getActivePeriod <em>Active Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getCoveragePeriod <em>Coverage Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Account#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAccount()
 * @model extendedMetaData="name='Account' kind='elementOnly'"
 * @generated
 */
public interface Account extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier used to reference the account.  May or may not be intended for human use.  (E.g. credit card number).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAccount_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name used for the account when displaying it to humans in reports, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorizes the account for reporting and searching purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the account is presently used/useable or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AccountStatus)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AccountStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AccountStatus value);

	/**
	 * Returns the value of the '<em><b>Active Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the period of time over which the account is allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Period</em>' containment reference.
	 * @see #setActivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getAccount_ActivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getActivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getActivePeriod <em>Active Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Period</em>' containment reference.
	 * @see #getActivePeriod()
	 * @generated
	 */
	void setActivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the currency to which transactions must be converted when crediting or debiting the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(Coding)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Currency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currency' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCurrency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Coding value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance</em>' containment reference.
	 * @see #setBalance(Money)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Balance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='balance' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getBalance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getBalance <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' containment reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(Money value);

	/**
	 * Returns the value of the '<em><b>Coverage Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the period of time the account applies to.  E.g. accounts created per fiscal year, quarter, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Period</em>' containment reference.
	 * @see #setCoveragePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getAccount_CoveragePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coveragePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getCoveragePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getCoveragePeriod <em>Coverage Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Period</em>' containment reference.
	 * @see #getCoveragePeriod()
	 * @generated
	 */
	void setCoveragePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the patient, device, practitioner, location or other object the account is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the organization, department, etc. with responsibility for the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information about what the account tracks and how it is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAccount_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Account#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

} // Account
