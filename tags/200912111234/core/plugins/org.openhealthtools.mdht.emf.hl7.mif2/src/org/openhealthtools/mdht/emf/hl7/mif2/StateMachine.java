/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: StateMachine
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getSubState <em>Sub State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getStateAttributeName <em>State Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateMachine()
 * @model extendedMetaData="name='StateMachine' kind='elementOnly'"
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a state machine.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(StateMachineAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateMachine_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StateMachineAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(StateMachineAnnotations value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A graphical representation of the states and state transitions in a state engine.
	 * UML: Tag on StateMachine stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(Img)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateMachine_Figure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace'"
	 * @generated
	 */
	Img getFigure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(Img value);

	/**
	 * Returns the value of the '<em><b>Sub State</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a 'mode' in which instantiations of the class can exist.
	 * UML: The subVertexes of the 'Top' state (which we don't bother to model)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub State</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateMachine_SubState()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='subState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<State> getSubState();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a permitted movement between states of a class object.  States may only shift along defined states.
	 * UML: Transition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateMachine_Transition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the class attribute which represent's the state of the class (and whose value set is drawn from the list of states in the class state engine.)
	 * UML: A the name of the target 'StateAttribute' dependency between the attribute and the stateMachine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Attribute Name</em>' attribute.
	 * @see #setStateAttributeName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStateMachine_StateAttributeName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='stateAttributeName'"
	 * @generated
	 */
	String getStateAttributeName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine#getStateAttributeName <em>State Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Attribute Name</em>' attribute.
	 * @see #getStateAttributeName()
	 * @generated
	 */
	void setStateAttributeName(String value);

} // StateMachine
