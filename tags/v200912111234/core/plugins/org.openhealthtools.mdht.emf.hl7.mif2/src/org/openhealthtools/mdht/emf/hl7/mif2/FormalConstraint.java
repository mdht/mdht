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
 * A representation of the model object '<em><b>Formal Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Constraint stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getBody <em>Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getAlternateFormalExpression <em>Alternate Formal Expression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalConstraint()
 * @model extendedMetaData="name='FormalConstraint' kind='elementOnly'"
 * @generated
 */
public interface FormalConstraint extends CascadableAnnotation {
	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalConstraint_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Derivation Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the constraint from which the current constraint was derived.
	 * UML: supplier association from ModelElement to Derivation stereotype on Dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Supplier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalConstraint_DerivationSupplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivationSupplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationDerivation> getDerivationSupplier();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal OCL expression of the constraint
	 * UML: body attribute on Constraint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(VariousMixedContent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalConstraint_Body()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	VariousMixedContent getBody();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(VariousMixedContent value);

	/**
	 * Returns the value of the '<em><b>Alternate Formal Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate (non-OCL) expression of the constraint.  Should be maintained at the same time as the OCL expression
	 * UML: tag on Constraint stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Formal Expression</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalConstraint_AlternateFormalExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternateFormalExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormalExpression> getAlternateFormalExpression();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the constraint
	 * UML: name attribute inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFormalConstraint_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FormalConstraint
