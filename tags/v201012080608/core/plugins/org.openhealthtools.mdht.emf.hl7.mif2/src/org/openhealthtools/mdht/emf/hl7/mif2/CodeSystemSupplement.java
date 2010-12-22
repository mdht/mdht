/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a set of extensions to the semantics of an existing code system created by someone other than the author of the code system
 * UML: A stereotype of Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement#getCodeSystemVersionSupplement <em>Code System Version Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement#getSupplementId <em>Supplement Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemSupplement()
 * @model extendedMetaData="name='CodeSystemSupplement' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemSupplement extends CodeSystemBase {
	/**
	 * Returns the value of the '<em><b>Code System Version Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies extensions to a particular release associated with the code system.
	 * UML: A package contained within the current package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Version Supplement</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemSupplement_CodeSystemVersionSupplement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystemVersionSupplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemVersionSupplement> getCodeSystemVersionSupplement();

	/**
	 * Returns the value of the '<em><b>Supplement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the extension
	 * UML: Package.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement Id</em>' attribute.
	 * @see #setSupplementId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemSupplement_SupplementId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid" required="true"
	 *        extendedMetaData="kind='attribute' name='SupplementId'"
	 * @generated
	 */
	String getSupplementId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement#getSupplementId <em>Supplement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplement Id</em>' attribute.
	 * @see #getSupplementId()
	 * @generated
	 */
	void setSupplementId(String value);

} // CodeSystemSupplement
