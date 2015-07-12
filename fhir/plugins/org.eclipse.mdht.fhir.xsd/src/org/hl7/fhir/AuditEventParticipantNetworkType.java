/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Participant Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of network access point of this participant in the audit event
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventParticipantNetworkType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventParticipantNetworkType()
 * @model extendedMetaData="name='AuditEventParticipantNetworkType' kind='elementOnly'"
 * @generated
 */
public interface AuditEventParticipantNetworkType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.AuditEventParticipantNetworkTypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.AuditEventParticipantNetworkTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(AuditEventParticipantNetworkTypeList)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventParticipantNetworkType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	AuditEventParticipantNetworkTypeList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventParticipantNetworkType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.AuditEventParticipantNetworkTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AuditEventParticipantNetworkTypeList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.AuditEventParticipantNetworkType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(AuditEventParticipantNetworkTypeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.AuditEventParticipantNetworkType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(AuditEventParticipantNetworkTypeList)
	 * @generated
	 */
	boolean isSetValue();

} // AuditEventParticipantNetworkType
