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
 * A representation of the model object '<em><b>Specialization Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A class that is a specialization of another class and which may itself have specializations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSpecializationClass()
 * @model extendedMetaData="name='SpecializationClass' kind='elementOnly'"
 * @generated
 */
public interface SpecializationClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates any classes that specialize the current class (if the current class is a Choice).
	 * UML: Points to classes of which the current class is a generalization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSpecializationClass_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecializationClass> getClass_();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the class, CMET or Stub
	 * UML: The name of the class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSpecializationClass_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SpecializationClass
