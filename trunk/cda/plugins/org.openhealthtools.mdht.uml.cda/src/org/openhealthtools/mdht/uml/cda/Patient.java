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
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClass;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getNames <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getAdministrativeGenderCode <em>Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getBirthTime <em>Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getMaritalStatusCode <em>Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getReligiousAffiliationCode <em>Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getRaceCode <em>Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getSDTCRaceCodes <em>SDTC Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getEthnicGroupCode <em>Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getGuardians <em>Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getBirthplace <em>Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getLanguageCommunications <em>Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Patient#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends EObject {
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_RealmCode()
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='typeId' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getTypeId <em>Type Id</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='templateId' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(II)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_Id()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='id' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	II getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(II value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.PN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_Name()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='name' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<PN> getNames();

	/**
	 * Returns the value of the '<em><b>Administrative Gender Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrative Gender Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrative Gender Code</em>' containment reference.
	 * @see #setAdministrativeGenderCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_AdministrativeGenderCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='administrativeGenderCode' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getAdministrativeGenderCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getAdministrativeGenderCode <em>Administrative Gender Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Gender Code</em>' containment reference.
	 * @see #getAdministrativeGenderCode()
	 * @generated
	 */
	void setAdministrativeGenderCode(CE value);

	/**
	 * Returns the value of the '<em><b>Birth Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Time</em>' containment reference.
	 * @see #setBirthTime(TS)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_BirthTime()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='birthTime' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	TS getBirthTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getBirthTime <em>Birth Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Time</em>' containment reference.
	 * @see #getBirthTime()
	 * @generated
	 */
	void setBirthTime(TS value);

	/**
	 * Returns the value of the '<em><b>Marital Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marital Status Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marital Status Code</em>' containment reference.
	 * @see #setMaritalStatusCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_MaritalStatusCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='maritalStatusCode' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getMaritalStatusCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getMaritalStatusCode <em>Marital Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital Status Code</em>' containment reference.
	 * @see #getMaritalStatusCode()
	 * @generated
	 */
	void setMaritalStatusCode(CE value);

	/**
	 * Returns the value of the '<em><b>Religious Affiliation Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Religious Affiliation Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Religious Affiliation Code</em>' containment reference.
	 * @see #setReligiousAffiliationCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_ReligiousAffiliationCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='religiousAffiliationCode' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getReligiousAffiliationCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getReligiousAffiliationCode <em>Religious Affiliation Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Religious Affiliation Code</em>' containment reference.
	 * @see #getReligiousAffiliationCode()
	 * @generated
	 */
	void setReligiousAffiliationCode(CE value);

	/**
	 * Returns the value of the '<em><b>Race Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Race Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Race Code</em>' containment reference.
	 * @see #setRaceCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_RaceCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='raceCode' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getRaceCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getRaceCode <em>Race Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race Code</em>' containment reference.
	 * @see #getRaceCode()
	 * @generated
	 */
	void setRaceCode(CE value);

	/**
	 * Returns the value of the '<em><b>SDTC Race Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Race Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Race Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_SDTCRaceCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='raceCode' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<CE> getSDTCRaceCodes();

	/**
	 * Returns the value of the '<em><b>Ethnic Group Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ethnic Group Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethnic Group Code</em>' containment reference.
	 * @see #setEthnicGroupCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_EthnicGroupCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='ethnicGroupCode' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getEthnicGroupCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getEthnicGroupCode <em>Ethnic Group Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethnic Group Code</em>' containment reference.
	 * @see #getEthnicGroupCode()
	 * @generated
	 */
	void setEthnicGroupCode(CE value);

	/**
	 * Returns the value of the '<em><b>Guardian</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Guardian}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guardian</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guardian</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_Guardian()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='guardian' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<Guardian> getGuardians();

	/**
	 * Returns the value of the '<em><b>Birthplace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthplace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthplace</em>' containment reference.
	 * @see #setBirthplace(Birthplace)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_Birthplace()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='birthplace' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	Birthplace getBirthplace();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getBirthplace <em>Birthplace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthplace</em>' containment reference.
	 * @see #getBirthplace()
	 * @generated
	 */
	void setBirthplace(Birthplace value);

	/**
	 * Returns the value of the '<em><b>Language Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.LanguageCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Communication</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_LanguageCommunication()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='languageCommunication' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<LanguageCommunication> getLanguageCommunications();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='nullFlavor' kind='attribute'"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getNullFlavor <em>Null Flavor</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getNullFlavor <em>Null Flavor</em>}' attribute is set.
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
	 * The default value is <code>"PSN"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #setClassCode(EntityClass)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_ClassCode()
	 * @model default="PSN" unsettable="true" ordered="false"
	 *        extendedMetaData="name='classCode' kind='attribute'"
	 * @generated
	 */
	EntityClass getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(EntityClass value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(EntityClass)
	 * @generated
	 */
	void unsetClassCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getClassCode <em>Class Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Code</em>' attribute is set.
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(EntityClass)
	 * @generated
	 */
	boolean isSetClassCode();

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
	 * @see #isSetDeterminerCode()
	 * @see #unsetDeterminerCode()
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getPatient_DeterminerCode()
	 * @model default="INSTANCE" unsettable="true" ordered="false"
	 *        extendedMetaData="name='determinerCode' kind='attribute'"
	 * @generated
	 */
	EntityDeterminer getDeterminerCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getDeterminerCode <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determiner Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #isSetDeterminerCode()
	 * @see #unsetDeterminerCode()
	 * @see #getDeterminerCode()
	 * @generated
	 */
	void setDeterminerCode(EntityDeterminer value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getDeterminerCode <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeterminerCode()
	 * @see #getDeterminerCode()
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @generated
	 */
	void unsetDeterminerCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Patient#getDeterminerCode <em>Determiner Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Determiner Code</em>' attribute is set.
	 * @see #unsetDeterminerCode()
	 * @see #getDeterminerCode()
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @generated
	 */
	boolean isSetDeterminerCode();

} // Patient
