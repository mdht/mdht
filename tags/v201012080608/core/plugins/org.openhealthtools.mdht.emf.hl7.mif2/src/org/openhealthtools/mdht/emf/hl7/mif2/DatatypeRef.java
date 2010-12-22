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
 * A representation of the model object '<em><b>Datatype Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a datatype definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getArgumentDatatype <em>Argument Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeRef()
 * @model extendedMetaData="name='DatatypeRef' kind='elementOnly'"
 * @generated
 */
public interface DatatypeRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a datatype to bind to one of the referenced datatypes templateParameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Datatype</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeRef_ArgumentDatatype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='argumentDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeRef> getArgumentDatatype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the datatype being referenced
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeRef_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.DatatypeName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * The default value is <code>"datatype"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeQualifierKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers whether the reference is to a datatype, parameter, difference datatype for the parameter or difference datatype for the base datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeQualifierKind
	 * @see #isSetQualifier()
	 * @see #unsetQualifier()
	 * @see #setQualifier(DatatypeQualifierKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeRef_Qualifier()
	 * @model default="datatype" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='qualifier'"
	 * @generated
	 */
	DatatypeQualifierKind getQualifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeQualifierKind
	 * @see #isSetQualifier()
	 * @see #unsetQualifier()
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(DatatypeQualifierKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualifier()
	 * @see #getQualifier()
	 * @see #setQualifier(DatatypeQualifierKind)
	 * @generated
	 */
	void unsetQualifier();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef#getQualifier <em>Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualifier</em>' attribute is set.
	 * @see #unsetQualifier()
	 * @see #getQualifier()
	 * @see #setQualifier(DatatypeQualifierKind)
	 * @generated
	 */
	boolean isSetQualifier();

} // DatatypeRef
