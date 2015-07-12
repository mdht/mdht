/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Component Production Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceComponentProductionSpecification#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponentProductionSpecification#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponentProductionSpecification#getProductionSpec <em>Production Spec</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProductionSpecification()
 * @model extendedMetaData="name='DeviceComponent.ProductionSpecification' kind='elementOnly'"
 * @generated
 */
public interface DeviceComponentProductionSpecification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec Type</em>' containment reference.
	 * @see #setSpecType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProductionSpecification_SpecType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponentProductionSpecification#getSpecType <em>Spec Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' containment reference.
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Id</em>' containment reference.
	 * @see #setComponentId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProductionSpecification_ComponentId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getComponentId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponentProductionSpecification#getComponentId <em>Component Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' containment reference.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Production Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the printable string defining the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Production Spec</em>' containment reference.
	 * @see #setProductionSpec(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProductionSpecification_ProductionSpec()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productionSpec' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductionSpec();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponentProductionSpecification#getProductionSpec <em>Production Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Spec</em>' containment reference.
	 * @see #getProductionSpec()
	 * @generated
	 */
	void setProductionSpec(org.hl7.fhir.String value);

} // DeviceComponentProductionSpecification
