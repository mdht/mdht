/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is one of the interactions communicated as part of the storyboard
 * UML: Message
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getReceivingSystem <em>Receiving System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getSendingSystem <em>Sending System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getExampleInteraction()
 * @model extendedMetaData="name='ExampleInteraction' kind='elementOnly'"
 * @generated
 */
public interface ExampleInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual interaction being referenced
	 * UML: CallAction.  (Not sure how to tie this to Message)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getExampleInteraction_Interaction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getInteraction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Receiving System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system which receives the interaction.
	 * UML: ClassifierRole receiver
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiving System</em>' attribute.
	 * @see #setReceivingSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getExampleInteraction_ReceivingSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='receivingSystem'"
	 * @generated
	 */
	String getReceivingSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getReceivingSystem <em>Receiving System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving System</em>' attribute.
	 * @see #getReceivingSystem()
	 * @generated
	 */
	void setReceivingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Sending System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system which originates the interaction
	 * UML: ClassifierRole sender
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sending System</em>' attribute.
	 * @see #setSendingSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getExampleInteraction_SendingSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='sendingSystem'"
	 * @generated
	 */
	String getSendingSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getSendingSystem <em>Sending System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending System</em>' attribute.
	 * @see #getSendingSystem()
	 * @generated
	 */
	void setSendingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative position of this interaction in the sequence of interactions exchanged
	 * UML: order implied by predecessor/successor relationship of messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getExampleInteraction_Sequence()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='sequence'"
	 * @generated
	 */
	BigInteger getSequence();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(BigInteger value);

} // ExampleInteraction
