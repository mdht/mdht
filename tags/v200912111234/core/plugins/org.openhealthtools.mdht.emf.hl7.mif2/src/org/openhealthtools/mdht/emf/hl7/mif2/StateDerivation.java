/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A Derivation stereotype to a State
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StateDerivation#getStateName <em>State Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateDerivation()
 * @model extendedMetaData="name='StateDerivation' kind='empty'"
 * @generated
 */
public interface StateDerivation extends ClassDerivation {
	/**
	 * Returns the value of the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the corresponding state in the 'parent' model.
	 * UML: Name of the supplier state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Name</em>' attribute.
	 * @see #setStateName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateDerivation_StateName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='stateName'"
	 * @generated
	 */
	String getStateName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateDerivation#getStateName <em>State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Name</em>' attribute.
	 * @see #getStateName()
	 * @generated
	 */
	void setStateName(String value);

} // StateDerivation
