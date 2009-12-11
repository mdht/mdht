/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A Derivation stereotype to an Association
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation#getAssociationEndName <em>Association End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndDerivation()
 * @model extendedMetaData="name='AssociationEndDerivation' kind='empty'"
 * @generated
 */
public interface AssociationEndDerivation extends ClassDerivation {
	/**
	 * Returns the value of the '<em><b>Association End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the association in the other model.
	 * UML: Name of 'supplier' association end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End Name</em>' attribute.
	 * @see #setAssociationEndName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndDerivation_AssociationEndName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='associationEndName'"
	 * @generated
	 */
	String getAssociationEndName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation#getAssociationEndName <em>Association End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End Name</em>' attribute.
	 * @see #getAssociationEndName()
	 * @generated
	 */
	void setAssociationEndName(String value);

} // AssociationEndDerivation
