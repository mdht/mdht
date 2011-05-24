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
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an individual test as part of a scenario.
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Test#getInteractionTest <em>Interaction Test</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Test#getDocumentTest <em>Document Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTest()
 * @model extendedMetaData="name='Test' kind='elementOnly'"
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Interaction Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents an interaction that should be sent between two system
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Test</em>' containment reference.
	 * @see #setInteractionTest(InteractionTest)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTest_InteractionTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactionTest' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionTest getInteractionTest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Test#getInteractionTest <em>Interaction Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Test</em>' containment reference.
	 * @see #getInteractionTest()
	 * @generated
	 */
	void setInteractionTest(InteractionTest value);

	/**
	 * Returns the value of the '<em><b>Document Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a document that should be created or consumed by a system
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Test</em>' containment reference.
	 * @see #setDocumentTest(DocumentTest)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTest_DocumentTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentTest' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentTest getDocumentTest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Test#getDocumentTest <em>Document Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Test</em>' containment reference.
	 * @see #getDocumentTest()
	 * @generated
	 */
	void setDocumentTest(DocumentTest value);

} // Test
