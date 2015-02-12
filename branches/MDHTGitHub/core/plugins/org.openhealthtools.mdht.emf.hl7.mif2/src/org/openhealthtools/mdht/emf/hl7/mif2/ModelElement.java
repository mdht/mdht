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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The base type for all 'semantic' elements in the MIF
 * UML: ModelElement stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ModelElement#getHistoryItem <em>History Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getModelElement()
 * @model abstract="true"
 *        extendedMetaData="name='ModelElement' kind='elementOnly'"
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>History Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the list of 'events' that have occurred against this particular model element.
	 * UML: Object-typed Tag value on ModelElement stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History Item</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getModelElement_HistoryItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='historyItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistoryItem> getHistoryItem();

} // ModelElement
