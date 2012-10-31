/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * a reference to a set of rules for constructing a value set along with the corresponding value set if known
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSet <em>Value Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getValueSetDefinitionReference()
 * @model extendedMetaData="name='ValueSetDefinitionReference' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefinitionReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #setValueSetDefinition(NameAndMeaningReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getValueSetDefinitionReference_ValueSetDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueSetDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	NameAndMeaningReference getValueSetDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSetDefinition
	 * <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	void setValueSetDefinition(NameAndMeaningReference value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the corresponding value set. Must be present if known to the implementing CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSetReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getValueSetDefinitionReference_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetReference getValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference#getValueSet <em>Value Set</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSetReference value);

} // ValueSetDefinitionReference
