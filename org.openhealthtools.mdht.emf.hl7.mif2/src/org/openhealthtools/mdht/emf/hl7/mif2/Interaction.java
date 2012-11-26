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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single exchange of data between systems for a particular reason with a set of expected response behaviors
 * UML: stereotype on Operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getInvokingTriggerEvent <em>Invoking Trigger Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getArgumentMessage <em>Argument Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getReceiverResponsibilities <em>Receiver Responsibilities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getSendingApplication <em>Sending Application</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getReceivingApplication <em>Receiving Application</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getInteractionType <em>Interaction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction()
 * @model extendedMetaData="name='Interaction' kind='elementOnly'"
 * @generated
 */
public interface Interaction extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments associated with an interaction.
	 * UML: A collector for the comments and constraints associated with an interaction.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(InteractionAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(InteractionAnnotations value);

	/**
	 * Returns the value of the '<em><b>Invoking Trigger Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the trigger event which causes the interaction to be sent.
	 * UML: Identifies the event causing the 'internal' state-transition which in turn fires the ActionSequence containing the CallAction for this operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoking Trigger Event</em>' containment reference.
	 * @see #setInvokingTriggerEvent(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_InvokingTriggerEvent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='invokingTriggerEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getInvokingTriggerEvent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getInvokingTriggerEvent <em>Invoking Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoking Trigger Event</em>' containment reference.
	 * @see #getInvokingTriggerEvent()
	 * @generated
	 */
	void setInvokingTriggerEvent(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Argument Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the fully-bound static model which defines the type for the content transmitted by the interaction.
	 * UML: The Classifier bound as a Parameter to the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Message</em>' containment reference.
	 * @see #setArgumentMessage(BoundStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_ArgumentMessage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='argumentMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundStaticModel getArgumentMessage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getArgumentMessage <em>Argument Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Message</em>' containment reference.
	 * @see #getArgumentMessage()
	 * @generated
	 */
	void setArgumentMessage(BoundStaticModel value);

	/**
	 * Returns the value of the '<em><b>Receiver Responsibilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the behaviors the receiver has the choice to choose between when receiving this interaction.  One and only one of the listed receiver responsibilities must be executed
	 * UML: Describes the internal state machine associated with the CallEvent triggered by invoking this operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Responsibilities</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_ReceiverResponsibilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiverResponsibilities' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReceiverResponsibility> getReceiverResponsibilities();

	/**
	 * Returns the value of the '<em><b>Sending Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of system which is capable of sending the interaction
	 * UML: Interfaces which have behaviors which invoke the operation
	 * Derive: Todo - All ApplicationRoles which identify this interaction as a 'sends' interaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sending Application</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_SendingApplication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sendingApplication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getSendingApplication();

	/**
	 * Returns the value of the '<em><b>Receiving Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of system which is capable of receiving the interaction
	 * UML: Interfaces which contain the operation
	 * Derive: Todo - All ApplicationRoles which identify this interaction as a 'receives' interaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiving Application</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_ReceivingApplication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receivingApplication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getReceivingApplication();

	/**
	 * Returns the value of the '<em><b>Interaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the general pattern this interaction conforms to
	 * UML: Tag on Interaction stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionKind
	 * @see #isSetInteractionType()
	 * @see #unsetInteractionType()
	 * @see #setInteractionType(InteractionKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteraction_InteractionType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interactionType'"
	 * @generated
	 */
	InteractionKind getInteractionType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getInteractionType <em>Interaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionKind
	 * @see #isSetInteractionType()
	 * @see #unsetInteractionType()
	 * @see #getInteractionType()
	 * @generated
	 */
	void setInteractionType(InteractionKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getInteractionType <em>Interaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInteractionType()
	 * @see #getInteractionType()
	 * @see #setInteractionType(InteractionKind)
	 * @generated
	 */
	void unsetInteractionType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction#getInteractionType <em>Interaction Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interaction Type</em>' attribute is set.
	 * @see #unsetInteractionType()
	 * @see #getInteractionType()
	 * @see #setInteractionType(InteractionKind)
	 * @generated
	 */
	boolean isSetInteractionType();

} // Interaction
