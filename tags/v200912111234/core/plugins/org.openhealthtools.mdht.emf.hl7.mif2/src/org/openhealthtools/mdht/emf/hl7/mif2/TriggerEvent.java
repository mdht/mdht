/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates a reason for the exchange of information
 * UML: stereotype on Event
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getStateTransition <em>State Transition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getEnvironmentalOccurrence <em>Environmental Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTriggerEvent()
 * @model extendedMetaData="name='TriggerEvent' kind='elementOnly'"
 * @generated
 */
public interface TriggerEvent extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments associated with a trigger event.
	 * UML: A collector for the comments and constraints associated with a trigger event.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(TriggerEventAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTriggerEvent_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerEventAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(TriggerEventAnnotations value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the interaction which causes this trigger event
	 * UML: CallEvent associated operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTriggerEvent_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getInteraction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(PackageRef value);

	/**
	 * Returns the value of the '<em><b>State Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the state transition which causes this trigger event
	 * UML: ChangeEvent with a changeExpression identifying the state transition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Transition</em>' containment reference.
	 * @see #setStateTransition(TransitionRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTriggerEvent_StateTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stateTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionRef getStateTransition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getStateTransition <em>State Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition</em>' containment reference.
	 * @see #getStateTransition()
	 * @generated
	 */
	void setStateTransition(TransitionRef value);

	/**
	 * Returns the value of the '<em><b>Environmental Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the nature of the environmental occurrence which causes this trigger event
	 * UML: description of SignalEvent or TimeEvent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environmental Occurrence</em>' containment reference.
	 * @see #setEnvironmentalOccurrence(EnvironmentalOccurrence)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTriggerEvent_EnvironmentalOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentalOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentalOccurrence getEnvironmentalOccurrence();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent#getEnvironmentalOccurrence <em>Environmental Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Occurrence</em>' containment reference.
	 * @see #getEnvironmentalOccurrence()
	 * @generated
	 */
	void setEnvironmentalOccurrence(EnvironmentalOccurrence value);

} // TriggerEvent
