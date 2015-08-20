/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Medication#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getIsBrand <em>Is Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedication()
 * @model extendedMetaData="name='Medication' kind='elementOnly'"
 * @generated
 */
public interface Medication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the item is attributable to a specific manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Brand</em>' containment reference.
	 * @see #setIsBrand(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedication_IsBrand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isBrand' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsBrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getIsBrand <em>Is Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Brand</em>' containment reference.
	 * @see #getIsBrand()
	 * @generated
	 */
	void setIsBrand(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the details of the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medications are either a single administrable product or a package that contains one or more products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(MedicationKind)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Kind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKind getKind();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MedicationKind value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that only applies to products (not packages).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(MedicationProduct)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Product()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationProduct getProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(MedicationProduct value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that only applies to packages (not products).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(MedicationPackage)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Package()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationPackage getPackage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(MedicationPackage value);

} // Medication
