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
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.rim.Role;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getAddrs <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getSDTCPatient <em>SDTC Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getAssignedPerson <em>Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getRepresentedOrganizations <em>Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity()
 * @model
 * @generated
 */
public interface AssignedEntity extends Role {
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='realmCode' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='typeId' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getTypeId <em>Type Id</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='templateId' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<II> getTemplateIds();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_Id()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='id' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_Code()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='code' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CE value);

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_Addr()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='addr' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<AD> getAddrs();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_Telecom()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='telecom' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<TEL> getTelecoms();

	/**
	 * Returns the value of the '<em><b>SDTC Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Patient</em>' containment reference.
	 * @see #setSDTCPatient(SDTCPatient)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_SDTCPatient()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='patient' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	SDTCPatient getSDTCPatient();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getSDTCPatient <em>SDTC Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Patient</em>' containment reference.
	 * @see #getSDTCPatient()
	 * @generated
	 */
	void setSDTCPatient(SDTCPatient value);

	/**
	 * Returns the value of the '<em><b>Assigned Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Person</em>' containment reference.
	 * @see #setAssignedPerson(Person)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_AssignedPerson()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='assignedPerson' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	Person getAssignedPerson();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getAssignedPerson <em>Assigned Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Person</em>' containment reference.
	 * @see #getAssignedPerson()
	 * @generated
	 */
	void setAssignedPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Represented Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Organization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Organization</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_RepresentedOrganization()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='representedOrganization' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<Organization> getRepresentedOrganizations();

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
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='nullFlavor' kind='attribute'"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getNullFlavor <em>Null Flavor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Flavor</em>' attribute is set.
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	boolean isSetNullFlavor();

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The default value is <code>"ASSIGNED"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #setClassCode(RoleClassAssignedEntity)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getAssignedEntity_ClassCode()
	 * @model default="ASSIGNED" unsettable="true" ordered="false"
	 *        extendedMetaData="name='classCode' kind='attribute'"
	 * @generated
	 */
	RoleClassAssignedEntity getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(RoleClassAssignedEntity value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(RoleClassAssignedEntity)
	 * @generated
	 */
	void unsetClassCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.AssignedEntity#getClassCode <em>Class Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Code</em>' attribute is set.
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(RoleClassAssignedEntity)
	 * @generated
	 */
	boolean isSetClassCode();

} // AssignedEntity
