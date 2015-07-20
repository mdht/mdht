/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for a collection of resources.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Bundle#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Bundle#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.Bundle#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.Bundle#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.Bundle#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBundle()
 * @model extendedMetaData="name='Bundle' kind='elementOnly'"
 * @generated
 */
public interface Bundle extends Resource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the purpose of this bundle- how it was intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(BundleType)
	 * @see org.hl7.fhir.FhirPackage#getBundle_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	BundleType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Bundle#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(BundleType value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getBundle_Total()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getTotal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Bundle#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BundleLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of links that provide context to this bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBundle_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BundleLink> getLink();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BundleEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBundle_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BundleEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Digital Signature - base64 encoded. XML DigSIg or a JWT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getBundle_Signature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='signature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Bundle#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

} // Bundle
