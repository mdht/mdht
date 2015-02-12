/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Version Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * a reference to a map version and the corresponding map, if known
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.MapVersionReference#getMapVersion <em>Map Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.MapVersionReference#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getMapVersionReference()
 * @model extendedMetaData="name='MapVersionReference' kind='elementOnly'"
 * @generated
 */
public interface MapVersionReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Map Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Version</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Map Version</em>' containment reference.
	 * @see #setMapVersion(NameAndMeaningReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getMapVersionReference_MapVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mapVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	NameAndMeaningReference getMapVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.MapVersionReference#getMapVersion <em>Map Version</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Map Version</em>' containment reference.
	 * @see #getMapVersion()
	 * @generated
	 */
	void setMapVersion(NameAndMeaningReference value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the corresponding map. Must be present if it is known the implementing CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(MapReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getMapVersionReference_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	MapReference getMap();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.MapVersionReference#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(MapReference value);

} // MapVersionReference
