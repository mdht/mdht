/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetReference <em>Value Set Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSetBinding()
 * @model
 * @generated
 */
public interface ValueSetBinding extends EObject {
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
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSetBinding_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.fhir.BindingStrengthKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
	 * @see #setStrength(BindingStrengthKind)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSetBinding_Strength()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BindingStrengthKind getStrength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(BindingStrengthKind value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSetBinding_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value Set Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Uri</em>' attribute.
	 * @see #setValueSetUri(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSetBinding_ValueSetUri()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValueSetUri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetUri <em>Value Set Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Uri</em>' attribute.
	 * @see #getValueSetUri()
	 * @generated
	 */
	void setValueSetUri(String value);

	/**
	 * Returns the value of the '<em><b>Value Set Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Reference</em>' attribute.
	 * @see #setValueSetReference(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSetBinding_ValueSetReference()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValueSetReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetReference <em>Value Set Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Reference</em>' attribute.
	 * @see #getValueSetReference()
	 * @generated
	 */
	void setValueSetReference(String value);

} // ValueSetBinding
