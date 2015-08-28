/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSet#getBase_Enumeration <em>Base Enumeration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSet#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSet#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ValueSet#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSet()
 * @model
 * @generated
 */
public interface ValueSet extends Element {
	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBase_Enumeration(Enumeration)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSet_Base_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSet#getBase_Enumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSet_Uri()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSet#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSet_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSet_Publisher()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSet#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getValueSet_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ValueSet#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ValueSet
