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
 * A representation of the model object '<em><b>Interaction Profile App Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains complex comments relating to an interaction profile.  (Complex comments are those with additional XML elements, above and beyond the 'type' of comment.)
 * UML: A collector for 'complex' commments associated with a model element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAppInfo#getChangeRequest <em>Change Request</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAppInfo#getDeprecationInfo <em>Deprecation Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfileAppInfo()
 * @model extendedMetaData="name='InteractionProfileAppInfo' kind='elementOnly'"
 * @generated
 */
public interface InteractionProfileAppInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Change Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request to change the element.  This is an implementation-focused annotation enabling the association of change requests directly to elements within a specification.  Its purpose is to *support* existing change management processes and is not intended to provide full change management documentation, merely the ability to tag certain information related to a change request to the relevant parts of the specification driving the change.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Request</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfileAppInfo_ChangeRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangeRequest> getChangeRequest();

	/**
	 * Returns the value of the '<em><b>Deprecation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information relating to the deprecation of the element, including instructions on why the element is no longer required and/or how the same information should now be handled.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecation Info</em>' containment reference.
	 * @see #setDeprecationInfo(DeprecationInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfileAppInfo_DeprecationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DeprecationInfo getDeprecationInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAppInfo#getDeprecationInfo <em>Deprecation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecation Info</em>' containment reference.
	 * @see #getDeprecationInfo()
	 * @generated
	 */
	void setDeprecationInfo(DeprecationInfo value);

} // InteractionProfileAppInfo
