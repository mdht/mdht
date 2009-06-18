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

import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Of Interest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRegionOfInterestId <em>Region Of Interest Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest()
 * @model
 * @generated
 */
public interface RegionOfInterest extends EObject {
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_RealmCode()
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_TypeId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTypeId <em>Type Id</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_TemplateId()
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Id()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<II> getId();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CS)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Code()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CS getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CS value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.RegionOfInterestValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RegionOfInterestValue> getValue();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Subject)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Subject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Specimen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Specimen()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Specimen> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Performer2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Performer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Performer2> getPerformer();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Author()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Author> getAuthor();

	/**
	 * Returns the value of the '<em><b>Informant</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Informant12}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informant</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Informant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Informant12> getInformant();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Participant2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Participant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Participant2> getParticipant();

	/**
	 * Returns the value of the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.EntryRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Relationship</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_EntryRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EntryRelationship> getEntryRelationship();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Reference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Precondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Precondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Region Of Interest Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Of Interest Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Of Interest Id</em>' attribute.
	 * @see #setRegionOfInterestId(String)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_RegionOfInterestId()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="name='ID' kind='attribute'"
	 * @generated
	 */
	String getRegionOfInterestId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRegionOfInterestId <em>Region Of Interest Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Of Interest Id</em>' attribute.
	 * @see #getRegionOfInterestId()
	 * @generated
	 */
	void setRegionOfInterestId(String value);

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_NullFlavor()
	 * @model ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor <em>Null Flavor</em>}' attribute.
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
	 * The default value is <code>"ROIOVL"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ActClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @see #setClassCode(ActClass)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_ClassCode()
	 * @model default="ROIOVL" required="true" ordered="false"
	 * @generated
	 */
	ActClass getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(ActClass value);

	/**
	 * Returns the value of the '<em><b>Mood Code</b></em>' attribute.
	 * The default value is <code>"EVN"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ActMood}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mood Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @see #setMoodCode(ActMood)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_MoodCode()
	 * @model default="EVN" required="true" ordered="false"
	 * @generated
	 */
	ActMood getMoodCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @see #getMoodCode()
	 * @generated
	 */
	void setMoodCode(ActMood value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model actRequired="true" actOrdered="false"
	 * @generated
	 */
	void addAct(Act act);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model encounterRequired="true" encounterOrdered="false"
	 * @generated
	 */
	void addEncounter(Encounter encounter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model observationRequired="true" observationOrdered="false"
	 * @generated
	 */
	void addObservation(Observation observation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model observationMediaRequired="true" observationMediaOrdered="false"
	 * @generated
	 */
	void addObservationMedia(ObservationMedia observationMedia);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model organizerRequired="true" organizerOrdered="false"
	 * @generated
	 */
	void addOrganizer(Organizer organizer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model procedureRequired="true" procedureOrdered="false"
	 * @generated
	 */
	void addProcedure(Procedure procedure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newRegionOfInterestRequired="true" newRegionOfInterestOrdered="false"
	 * @generated
	 */
	void addRegionOfInterest(RegionOfInterest newRegionOfInterest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model substanceAdministrationRequired="true" substanceAdministrationOrdered="false"
	 * @generated
	 */
	void addSubstanceAdministration(SubstanceAdministration substanceAdministration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model supplyRequired="true" supplyOrdered="false"
	 * @generated
	 */
	void addSupply(Supply supply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.act
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.act'"
	 * @generated
	 */
	EList<Act> getAct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.encounter
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.encounter'"
	 * @generated
	 */
	EList<Encounter> getEncounter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.observation'"
	 * @generated
	 */
	EList<Observation> getObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observationMedia
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.observationMedia'"
	 * @generated
	 */
	EList<ObservationMedia> getObservationMedia();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.organizer
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.organizer'"
	 * @generated
	 */
	EList<Organizer> getOrganizer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.procedure
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.procedure'"
	 * @generated
	 */
	EList<Procedure> getProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.regionOfInterest
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.regionOfInterest'"
	 * @generated
	 */
	EList<RegionOfInterest> getRegionOfInterest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.substanceAdministration
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.substanceAdministration'"
	 * @generated
	 */
	EList<SubstanceAdministration> getSubstanceAdministration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.supply
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.supply'"
	 * @generated
	 */
	EList<Supply> getSupply();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasActTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" codeRequired="true" codeOrdered="false" codeSystemRequired="true" codeSystemOrdered="false" codeSystemNameRequired="true" codeSystemNameOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName'"
	 * @generated
	 */
	boolean hasCode(String code, String codeSystem, String codeSystemName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasEncounterTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasObservationMediaTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasObservationTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasOrganizerTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasProcedureTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasRegionOfInterestTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasSubstanceAdministrationTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasSupplyTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = templateId)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = templateId)'"
	 * @generated
	 */
	boolean hasTemplateId(String templateId);

} // RegionOfInterest
