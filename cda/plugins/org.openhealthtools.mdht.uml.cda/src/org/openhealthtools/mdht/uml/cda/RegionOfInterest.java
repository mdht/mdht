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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getValues <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getEntryRelationships <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getReferences <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getPreconditions <em>Precondition</em>}</li>
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
public interface RegionOfInterest extends ClinicalStatement {
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
	 *        extendedMetaData="namespace='##targetNamespace'"
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
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
	 *        extendedMetaData="namespace='##targetNamespace'"
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Id()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
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
	 * @see #setCode(CS)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_Code()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
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
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegionOfInterestValue> getValues();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Specimen> getSpecimens();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Performer2> getPerformers();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Author> getAuthors();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Informant12> getInformants();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Participant2> getParticipants();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryRelationship> getEntryRelationships();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReferences();

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
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Precondition> getPreconditions();

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
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor <em>Null Flavor</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getNullFlavor <em>Null Flavor</em>}' attribute is set.
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
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #setClassCode(ActClass)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_ClassCode()
	 * @model default="ROIOVL" unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	ActClass getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(ActClass value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(ActClass)
	 * @generated
	 */
	void unsetClassCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getClassCode <em>Class Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Code</em>' attribute is set.
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(ActClass)
	 * @generated
	 */
	boolean isSetClassCode();

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
	 * @see #isSetMoodCode()
	 * @see #unsetMoodCode()
	 * @see #setMoodCode(ActMood)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterest_MoodCode()
	 * @model default="EVN" unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	ActMood getMoodCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @see #isSetMoodCode()
	 * @see #unsetMoodCode()
	 * @see #getMoodCode()
	 * @generated
	 */
	void setMoodCode(ActMood value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoodCode()
	 * @see #getMoodCode()
	 * @see #setMoodCode(ActMood)
	 * @generated
	 */
	void unsetMoodCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterest#getMoodCode <em>Mood Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mood Code</em>' attribute is set.
	 * @see #unsetMoodCode()
	 * @see #getMoodCode()
	 * @see #setMoodCode(ActMood)
	 * @generated
	 */
	boolean isSetMoodCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isClassCodeDefined() implies self.classCode=vocab::ActClass::ROIOVL
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isClassCodeDefined() implies self.classCode=vocab::ActClass::ROIOVL'"
	 * @generated
	 */
	boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isMoodCodeDefined() implies self.moodCode=vocab::ActMood::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isMoodCodeDefined() implies self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * self.entryRelationship.act->select(act : cda::Act | not act.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.act->select(act : cda::Act | not act.oclIsUndefined())'"
	 * @generated
	 */
	EList<Act> getActs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ClinicalDocument getClinicalDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.encounter->select(enc : cda::Encounter | not enc.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.encounter->select(enc : cda::Encounter | not enc.oclIsUndefined())'"
	 * @generated
	 */
	EList<Encounter> getEncounters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation->select(obs : cda::Observation | not obs.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.observation->select(obs : cda::Observation | not obs.oclIsUndefined())'"
	 * @generated
	 */
	EList<Observation> getObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observationMedia->select(media : cda::ObservationMedia | not media.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.observationMedia->select(media : cda::ObservationMedia | not media.oclIsUndefined())'"
	 * @generated
	 */
	EList<ObservationMedia> getObservationMedia();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.organizer->select(org : cda::Organizer | not org.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.organizer->select(org : cda::Organizer | not org.oclIsUndefined())'"
	 * @generated
	 */
	EList<Organizer> getOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.procedure->select(proc : cda::Procedure | not proc.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.procedure->select(proc : cda::Procedure | not proc.oclIsUndefined())'"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.regionOfInterest->select(reg : cda::RegionOfInterest | not reg.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.regionOfInterest->select(reg : cda::RegionOfInterest | not reg.oclIsUndefined())'"
	 * @generated
	 */
	EList<RegionOfInterest> getRegionsOfInterest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Section getSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.substanceAdministration->select(sub : cda::SubstanceAdministration | not sub.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.substanceAdministration->select(sub : cda::SubstanceAdministration | not sub.oclIsUndefined())'"
	 * @generated
	 */
	EList<SubstanceAdministration> getSubstanceAdministrations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.supply->select(sup : cda::Supply | not sup.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.supply->select(sup : cda::Supply | not sup.oclIsUndefined())'"
	 * @generated
	 */
	EList<Supply> getSupplies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(act : cda::Act | act.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasActTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" codeRequired="true" codeOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.code = code'"
	 * @generated
	 */
	boolean hasCode(String code);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))'"
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
	 * self.getObservations()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasObservationTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->exists(org : cda::Organizer | org.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasOrganizerTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasProcedureTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionsOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getRegionsOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasRegionOfInterestTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasSubstanceAdministrationTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))'"
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