/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Valued Item1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getEntityCodeableConcept <em>Entity Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getEntityReference <em>Entity Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractValuedItem1#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1()
 * @model extendedMetaData="name='Contract.ValuedItem1' kind='elementOnly'"
 * @generated
 */
public interface ContractValuedItem1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Entity Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Codeable Concept</em>' containment reference.
	 * @see #setEntityCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_EntityCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entityCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEntityCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getEntityCodeableConcept <em>Entity Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Codeable Concept</em>' containment reference.
	 * @see #getEntityCodeableConcept()
	 * @generated
	 */
	void setEntityCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Entity Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Reference</em>' containment reference.
	 * @see #setEntityReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_EntityReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entityReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEntityReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getEntityReference <em>Entity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Reference</em>' containment reference.
	 * @see #getEntityReference()
	 * @generated
	 */
	void setEntityReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a Contract Provision Valued Item instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the time during which this Contract Term ValuedItem information is effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Time</em>' containment reference.
	 * @see #setEffectiveTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_EffectiveTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getEffectiveTime <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Time</em>' containment reference.
	 * @see #getEffectiveTime()
	 * @generated
	 */
	void setEffectiveTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Contract Provision Valued Item unit valuation measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference.
	 * @see #setPoints(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_Points()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='points' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPoints();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getPoints <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' containment reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.fhir.FhirPackage#getContractValuedItem1_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractValuedItem1#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

} // ContractValuedItem1
