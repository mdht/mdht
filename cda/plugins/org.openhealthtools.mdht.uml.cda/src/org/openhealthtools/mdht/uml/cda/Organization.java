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

import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getStandardIndustryClassCode <em>Standard Industry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getAsOrganizationPartOf <em>As Organization Part Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organization#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends EObject {
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_RealmCode()
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_TypeId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Organization#getTypeId <em>Type Id</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_TemplateId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<II> getTemplateId();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_Id()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<II> getId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ON}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_Name()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ON> getName();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_Telecom()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TEL> getTelecom();

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.AD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_Addr()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AD> getAddr();

	/**
	 * Returns the value of the '<em><b>Standard Industry Class Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Industry Class Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Industry Class Code</em>' containment reference.
	 * @see #setStandardIndustryClassCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_StandardIndustryClassCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CE getStandardIndustryClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Organization#getStandardIndustryClassCode <em>Standard Industry Class Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Industry Class Code</em>' containment reference.
	 * @see #getStandardIndustryClassCode()
	 * @generated
	 */
	void setStandardIndustryClassCode(CE value);

	/**
	 * Returns the value of the '<em><b>As Organization Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Organization Part Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Organization Part Of</em>' containment reference.
	 * @see #setAsOrganizationPartOf(OrganizationPartOf)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_AsOrganizationPartOf()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OrganizationPartOf getAsOrganizationPartOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Organization#getAsOrganizationPartOf <em>As Organization Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Organization Part Of</em>' containment reference.
	 * @see #getAsOrganizationPartOf()
	 * @generated
	 */
	void setAsOrganizationPartOf(OrganizationPartOf value);

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_NullFlavor()
	 * @model ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Organization#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The default value is <code>"ORG"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization
	 * @see #setClassCode(EntityClassOrganization)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_ClassCode()
	 * @model default="ORG" ordered="false"
	 * @generated
	 */
	EntityClassOrganization getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Organization#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(EntityClassOrganization value);

	/**
	 * Returns the value of the '<em><b>Determiner Code</b></em>' attribute.
	 * The default value is <code>"INSTANCE"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Determiner Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Determiner Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getOrganization_DeterminerCode()
	 * @model default="INSTANCE" ordered="false"
	 * @generated
	 */
	EntityDeterminer getDeterminerCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Organization#getDeterminerCode <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determiner Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #getDeterminerCode()
	 * @generated
	 */
	void setDeterminerCode(EntityDeterminer value);

} // Organization
