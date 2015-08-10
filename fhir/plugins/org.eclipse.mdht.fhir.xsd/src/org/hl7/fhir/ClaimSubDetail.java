/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Sub Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSubDetail#getUdi <em>Udi</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail()
 * @model extendedMetaData="name='Claim.SubDetail' kind='elementOnly'"
 * @generated
 */
public interface ClaimSubDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fee for an addittional service or product or charge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Coding value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of repetitions of a service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getQuantity <em>Quantity</em>}' containment reference.
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
	 * The fee for an addittional service or product or charge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getUnitPrice <em>Unit Price</em>}' containment reference.
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
	 * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getFactor <em>Factor</em>}' containment reference.
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
	 * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference.
	 * @see #setPoints(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Points()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='points' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPoints();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getPoints <em>Points</em>}' containment reference.
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
	 * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference.
	 * @see #setUdi(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimSubDetail_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getUdi();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSubDetail#getUdi <em>Udi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi</em>' containment reference.
	 * @see #getUdi()
	 * @generated
	 */
	void setUdi(Coding value);

} // ClaimSubDetail
