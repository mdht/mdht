/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to pay for or reimburse for health care products and services.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Coverage#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getBin <em>Bin</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverage()
 * @model extendedMetaData="name='Coverage' kind='elementOnly'"
 * @generated
 */
public interface Coverage extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program or plan underwriter or payor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Issuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Reference value);

	/**
	 * Returns the value of the '<em><b>Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Identification Number (BIN number) used to identify the routing  of eclaims if the insurer themselves don't have a BIN number for all of their business.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bin</em>' containment reference.
	 * @see #setBin(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Bin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bin' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getBin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getBin <em>Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin</em>' containment reference.
	 * @see #getBin()
	 * @generated
	 */
	void setBin(Identifier value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Subscriber Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id issued to the subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriber Id</em>' containment reference.
	 * @see #setSubscriberId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_SubscriberId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscriberId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSubscriberId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubscriberId <em>Subscriber Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Id</em>' containment reference.
	 * @see #getSubscriberId()
	 * @generated
	 */
	void setSubscriberId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Plan</em>' containment reference.
	 * @see #setSubPlan(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_SubPlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subPlan' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubPlan <em>Sub Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Plan</em>' containment reference.
	 * @see #getSubPlan()
	 * @generated
	 */
	void setSubPlan(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a dependent under the coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference.
	 * @see #setDependent(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Dependent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDependent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getDependent <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' containment reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference.
	 * @see #setSubscriber(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Subscriber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubscriber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubscriber <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' containment reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for a community of providers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Identifier value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The policy(s) which constitute this insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getContract();

} // Coverage
