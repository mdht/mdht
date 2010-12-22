/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows referencing an existing element
 * UML: Part of a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getContextElement <em>Context Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getContextAttribute <em>Context Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getRepetition <em>Repetition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementRef()
 * @model extendedMetaData="name='ElementRef' kind='elementOnly'"
 * @generated
 */
public interface ElementRef extends Change {
	/**
	 * Returns the value of the '<em><b>Context Ref</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Ref</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Ref</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementRef_ContextRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContextRef:2'"
	 * @generated
	 */
	FeatureMap getContextRef();

	/**
	 * Returns the value of the '<em><b>Context Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ElementValueRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Element</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementRef_ContextElement()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contextElement' namespace='##targetNamespace' group='#ContextRef:2'"
	 * @generated
	 */
	EList<ElementValueRef> getContextElement();

	/**
	 * Returns the value of the '<em><b>Context Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeValueRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Attribute</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementRef_ContextAttribute()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contextAttribute' namespace='##targetNamespace' group='#ContextRef:2'"
	 * @generated
	 */
	EList<AttributeValueRef> getContextAttribute();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the element being referenced
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementRef_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repetition number of the element being referenced in the original specification
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repetition</em>' attribute.
	 * @see #isSetRepetition()
	 * @see #unsetRepetition()
	 * @see #setRepetition(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementRef_Repetition()
	 * @model default="1" unsettable="true" dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='repetition'"
	 * @generated
	 */
	BigInteger getRepetition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getRepetition <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition</em>' attribute.
	 * @see #isSetRepetition()
	 * @see #unsetRepetition()
	 * @see #getRepetition()
	 * @generated
	 */
	void setRepetition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getRepetition <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepetition()
	 * @see #getRepetition()
	 * @see #setRepetition(BigInteger)
	 * @generated
	 */
	void unsetRepetition();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef#getRepetition <em>Repetition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repetition</em>' attribute is set.
	 * @see #unsetRepetition()
	 * @see #getRepetition()
	 * @see #setRepetition(BigInteger)
	 * @generated
	 */
	boolean isSetRepetition();

} // ElementRef
