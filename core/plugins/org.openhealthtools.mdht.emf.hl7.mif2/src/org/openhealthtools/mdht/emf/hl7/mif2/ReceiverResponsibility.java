/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a possible set of actions to be taken in response to the receipt of an interaction.
 * UML: An internal state that can be entered because of the CallEvent, and the ActionSequence resulting from entering that state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility#getReason <em>Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility#getInvokeInteraction <em>Invoke Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility#getInvokeTriggerEvent <em>Invoke Trigger Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReceiverResponsibility()
 * @model extendedMetaData="name='ReceiverResponsibility' kind='elementOnly'"
 * @generated
 */
public interface ReceiverResponsibility extends EObject {
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the conditions under which this receiver responsibility should be chosen.  Should be mutually exclusive with the conditions of all other receiver responsibilities for this interaction.  Also, the combined reasons for all receiver responsibilities should be complete.  I.e. There should be no circumstance that doesn't fit into the reason of one and one receiver responsibility.
	 * UML: A description of the guard conditions governing the entering of the internal state represented by this responsibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReceiverResponsibility_Reason()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getReason();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Invoke Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an interaction that should be returned to the sender (or respond to) of the original interaction as an application acknowledgement.
	 * UML: Indicates a CallAction as part of the ActionSequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoke Interaction</em>' containment reference.
	 * @see #setInvokeInteraction(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReceiverResponsibility_InvokeInteraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='invokeInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getInvokeInteraction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility#getInvokeInteraction <em>Invoke Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Interaction</em>' containment reference.
	 * @see #getInvokeInteraction()
	 * @generated
	 */
	void setInvokeInteraction(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Invoke Trigger Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the specified trigger event should be fired, along with any interactions associated with that trigger event and supported by any of the receiving system's application roles.
	 * UML: Indicates a TriggerEvent ActionSequence as part of the ActionSequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoke Trigger Event</em>' containment reference.
	 * @see #setInvokeTriggerEvent(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReceiverResponsibility_InvokeTriggerEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='invokeTriggerEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getInvokeTriggerEvent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility#getInvokeTriggerEvent <em>Invoke Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Trigger Event</em>' containment reference.
	 * @see #getInvokeTriggerEvent()
	 * @generated
	 */
	void setInvokeTriggerEvent(PackageRef value);

} // ReceiverResponsibility
