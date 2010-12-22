/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Trigger Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Expresses how trigger events are or should be implemented in applications claiming compliance to the conformance profile
 * UML: Constraints on the Event representing the trigger.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getInternalMapping <em>Internal Mapping</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getStateTransition <em>State Transition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getEnvironmentalOccurrence <em>Environmental Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceTriggerEvents()
 * @model extendedMetaData="name='ConformanceTriggerEvents' kind='elementOnly'"
 * @generated
 */
public interface ConformanceTriggerEvents extends PackageRef {
	/**
	 * Returns the value of the '<em><b>Internal Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a detailed indication of the circumstances in which the trigger event fires (e.g. What screen is the button on for a user-invoked environmental trigger), as well as any information on ability to configure or otherwise control the trigger event.  May also give an idea of how 'real-time' the firing is.
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Mapping</em>' containment reference.
	 * @see #setInternalMapping(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceTriggerEvents_InternalMapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='internalMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getInternalMapping();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getInternalMapping <em>Internal Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Mapping</em>' containment reference.
	 * @see #getInternalMapping()
	 * @generated
	 */
	void setInternalMapping(ComplexMarkupWithLanguage value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceTriggerEvents_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getInteraction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getInteraction <em>Interaction</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceTriggerEvents_StateTransition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stateTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionRef getStateTransition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getStateTransition <em>State Transition</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceTriggerEvents_EnvironmentalOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentalOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentalOccurrence getEnvironmentalOccurrence();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents#getEnvironmentalOccurrence <em>Environmental Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Occurrence</em>' containment reference.
	 * @see #getEnvironmentalOccurrence()
	 * @generated
	 */
	void setEnvironmentalOccurrence(EnvironmentalOccurrence value);

} // ConformanceTriggerEvents
