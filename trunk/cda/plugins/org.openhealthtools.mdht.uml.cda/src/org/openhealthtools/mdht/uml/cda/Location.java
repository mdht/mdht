/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Location#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Location#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Location#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Location#getHealthCareFacility <em>Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Location#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Location#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation_RealmCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CS> getRealmCode();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation_TypeId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Location#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation_TemplateId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<II> getTemplateId();

	/**
	 * Returns the value of the '<em><b>Health Care Facility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Care Facility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Care Facility</em>' containment reference.
	 * @see #setHealthCareFacility(HealthCareFacility)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation_HealthCareFacility()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HealthCareFacility getHealthCareFacility();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Location#getHealthCareFacility <em>Health Care Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Care Facility</em>' containment reference.
	 * @see #getHealthCareFacility()
	 * @generated
	 */
	void setHealthCareFacility(HealthCareFacility value);

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation_NullFlavor()
	 * @model ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Location#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The default value is <code>"LOC"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation
	 * @see #setTypeCode(ParticipationTargetLocation)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getLocation_TypeCode()
	 * @model default="LOC" ordered="false"
	 * @generated
	 */
	ParticipationTargetLocation getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Location#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(ParticipationTargetLocation value);

} // Location
