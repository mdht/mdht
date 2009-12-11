/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Binding Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A binding to a parameterized flat Static Model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgument#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBindingArgument()
 * @model extendedMetaData="name='ClassBindingArgument' kind='empty'"
 * @generated
 */
public interface ClassBindingArgument extends ClassBindingArgumentBase {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UML: A reference to the class being bound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBindingArgument_ClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='className'"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgument#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // ClassBindingArgument
