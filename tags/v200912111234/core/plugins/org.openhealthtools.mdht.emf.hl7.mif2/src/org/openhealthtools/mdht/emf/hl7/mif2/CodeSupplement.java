/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A supplement to a specific code or mnemonic that is part of a code system
 * UML: EnumerationItem
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement#getSupplementalCodeProperty <em>Supplemental Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSupplement()
 * @model extendedMetaData="name='CodeSupplement' kind='elementOnly'"
 * @generated
 */
public interface CodeSupplement extends EObject {
	/**
	 * Returns the value of the '<em><b>Print Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional alternative print names for this particular code in a specified language.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSupplement_PrintName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='printName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrintName> getPrintName();

	/**
	 * Returns the value of the '<em><b>Supplemental Code Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional property of the concept expressed as a coded name with an associated value.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Code Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSupplement_SupplementalCodeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalCodeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptProperty> getSupplementalCodeProperty();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mnemonic or id of the code being supplemented.
	 * UML: Corresponds to EnumerationItem.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSupplement_Code()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // CodeSupplement
