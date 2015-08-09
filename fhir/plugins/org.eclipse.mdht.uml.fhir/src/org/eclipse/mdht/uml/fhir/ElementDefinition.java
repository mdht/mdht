/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#isMustSupport <em>Must Support</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends Element {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' attribute.
	 * @see #isSetMustSupport()
	 * @see #unsetMustSupport()
	 * @see #setMustSupport(boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_MustSupport()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMustSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#isMustSupport <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' attribute.
	 * @see #isSetMustSupport()
	 * @see #unsetMustSupport()
	 * @see #isMustSupport()
	 * @generated
	 */
	void setMustSupport(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#isMustSupport <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustSupport()
	 * @see #isMustSupport()
	 * @see #setMustSupport(boolean)
	 * @generated
	 */
	void unsetMustSupport();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#isMustSupport <em>Must Support</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Support</em>' attribute is set.
	 * @see #unsetMustSupport()
	 * @see #isMustSupport()
	 * @see #setMustSupport(boolean)
	 * @generated
	 */
	boolean isSetMustSupport();

} // ElementDefinition
