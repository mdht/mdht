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
 * A representation of the model object '<em><b>Environmental Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the nature of the environmental occurrence which causes this trigger event
 * UML: description of SignalEvent or TimeEvent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence#getRelatedStateTransition <em>Related State Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEnvironmentalOccurrence()
 * @model extendedMetaData="name='EnvironmentalOccurrence' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentalOccurrence extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the nature of the environmental occurrence which causes this trigger event
	 * UML: description of SignalEvent or TimeEvent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEnvironmentalOccurrence_Text()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getText();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Related State Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the state transition which is associated with this environmental occurrence (e.g. being requested, for which fulfillment is requested, etc.)
	 * UML: Complex tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related State Transition</em>' containment reference.
	 * @see #setRelatedStateTransition(TransitionRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEnvironmentalOccurrence_RelatedStateTransition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relatedStateTransition' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionRef getRelatedStateTransition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence#getRelatedStateTransition <em>Related State Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related State Transition</em>' containment reference.
	 * @see #getRelatedStateTransition()
	 * @generated
	 */
	void setRelatedStateTransition(TransitionRef value);

} // EnvironmentalOccurrence
