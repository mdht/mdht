/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.Element#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.Element#getExtensions <em>Extension</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElement_Id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElement_Extension()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Extension> getExtensions();

} // Element
