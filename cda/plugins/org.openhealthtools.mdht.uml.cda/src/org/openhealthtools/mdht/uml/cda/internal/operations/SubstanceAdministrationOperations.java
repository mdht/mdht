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
package org.openhealthtools.mdht.uml.cda.internal.operations;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addAct(org.openhealthtools.mdht.uml.cda.Act) <em>Add Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addEncounter(org.openhealthtools.mdht.uml.cda.Encounter) <em>Add Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addObservation(org.openhealthtools.mdht.uml.cda.Observation) <em>Add Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addObservationMedia(org.openhealthtools.mdht.uml.cda.ObservationMedia) <em>Add Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addOrganizer(org.openhealthtools.mdht.uml.cda.Organizer) <em>Add Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addProcedure(org.openhealthtools.mdht.uml.cda.Procedure) <em>Add Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addRegionOfInterest(org.openhealthtools.mdht.uml.cda.RegionOfInterest) <em>Add Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addSubstanceAdministration(org.openhealthtools.mdht.uml.cda.SubstanceAdministration) <em>Add Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#addSupply(org.openhealthtools.mdht.uml.cda.Supply) <em>Add Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getAct() <em>Get Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getEncounter() <em>Get Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getObservation() <em>Get Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getObservationMedia() <em>Get Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getOrganizer() <em>Get Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getProcedure() <em>Get Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getRegionOfInterest() <em>Get Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getSubstanceAdministration() <em>Get Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#getSupply() <em>Get Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasActTemplate(java.lang.String) <em>Has Act Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasCode(java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasEncounterTemplate(java.lang.String) <em>Has Encounter Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasObservationMediaTemplate(java.lang.String) <em>Has Observation Media Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasObservationTemplate(java.lang.String) <em>Has Observation Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasOrganizerTemplate(java.lang.String) <em>Has Organizer Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasProcedureTemplate(java.lang.String) <em>Has Procedure Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasRegionOfInterestTemplate(java.lang.String) <em>Has Region Of Interest Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasSubstanceAdministrationTemplate(java.lang.String) <em>Has Substance Administration Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasSupplyTemplate(java.lang.String) <em>Has Supply Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration#hasTemplateId(java.lang.String) <em>Has Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceAdministrationOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAdministrationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addAct(SubstanceAdministration substanceAdministration, Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addEncounter(SubstanceAdministration substanceAdministration, Encounter encounter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addObservation(SubstanceAdministration substanceAdministration, Observation observation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addObservationMedia(SubstanceAdministration substanceAdministration, ObservationMedia observationMedia) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addOrganizer(SubstanceAdministration substanceAdministration, Organizer organizer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addProcedure(SubstanceAdministration substanceAdministration, Procedure procedure) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addRegionOfInterest(SubstanceAdministration substanceAdministration, RegionOfInterest regionOfInterest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addSubstanceAdministration(SubstanceAdministration substanceAdministration, SubstanceAdministration newSubstanceAdministration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addSupply(SubstanceAdministration substanceAdministration, Supply supply) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getAct(SubstanceAdministration) <em>Get Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT__EOCL_EXP = "self.entryRelationship.act";

	/**
	 * The cached OCL query for the '{@link #getAct(SubstanceAdministration) <em>Get Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.act
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Act> getAct(SubstanceAdministration substanceAdministration) {
		if (GET_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(9));
			try {
				GET_ACT__EOCL_QRY = helper.createQuery(GET_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Act> result = (Collection<Act>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<Act>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounter(SubstanceAdministration) <em>Get Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER__EOCL_EXP = "self.entryRelationship.encounter";

	/**
	 * The cached OCL query for the '{@link #getEncounter(SubstanceAdministration) <em>Get Encounter</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.encounter
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Encounter> getEncounter(SubstanceAdministration substanceAdministration) {
		if (GET_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(10));
			try {
				GET_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_ENCOUNTER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservation(SubstanceAdministration) <em>Get Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION__EOCL_EXP = "self.entryRelationship.observation";

	/**
	 * The cached OCL query for the '{@link #getObservation(SubstanceAdministration) <em>Get Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Observation> getObservation(SubstanceAdministration substanceAdministration) {
		if (GET_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(11));
			try {
				GET_OBSERVATION__EOCL_QRY = helper.createQuery(GET_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Observation> result = (Collection<Observation>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<Observation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservationMedia(SubstanceAdministration) <em>Get Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION_MEDIA__EOCL_EXP = "self.entryRelationship.observationMedia";

	/**
	 * The cached OCL query for the '{@link #getObservationMedia(SubstanceAdministration) <em>Get Observation Media</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION_MEDIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observationMedia
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ObservationMedia> getObservationMedia(SubstanceAdministration substanceAdministration) {
		if (GET_OBSERVATION_MEDIA__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(12));
			try {
				GET_OBSERVATION_MEDIA__EOCL_QRY = helper.createQuery(GET_OBSERVATION_MEDIA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION_MEDIA__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ObservationMedia> result = (Collection<ObservationMedia>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<ObservationMedia>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getOrganizer(SubstanceAdministration) <em>Get Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ORGANIZER__EOCL_EXP = "self.entryRelationship.organizer";

	/**
	 * The cached OCL query for the '{@link #getOrganizer(SubstanceAdministration) <em>Get Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.organizer
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Organizer> getOrganizer(SubstanceAdministration substanceAdministration) {
		if (GET_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(13));
			try {
				GET_ORGANIZER__EOCL_QRY = helper.createQuery(GET_ORGANIZER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ORGANIZER__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Organizer> result = (Collection<Organizer>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<Organizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedure(SubstanceAdministration) <em>Get Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE__EOCL_EXP = "self.entryRelationship.procedure";

	/**
	 * The cached OCL query for the '{@link #getProcedure(SubstanceAdministration) <em>Get Procedure</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.procedure
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getProcedure(SubstanceAdministration substanceAdministration) {
		if (GET_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(14));
			try {
				GET_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PROCEDURE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRegionOfInterest(SubstanceAdministration) <em>Get Region Of Interest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REGION_OF_INTEREST__EOCL_EXP = "self.entryRelationship.regionOfInterest";

	/**
	 * The cached OCL query for the '{@link #getRegionOfInterest(SubstanceAdministration) <em>Get Region Of Interest</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REGION_OF_INTEREST__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.regionOfInterest
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<RegionOfInterest> getRegionOfInterest(SubstanceAdministration substanceAdministration) {
		if (GET_REGION_OF_INTEREST__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(15));
			try {
				GET_REGION_OF_INTEREST__EOCL_QRY = helper.createQuery(GET_REGION_OF_INTEREST__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REGION_OF_INTEREST__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RegionOfInterest> result = (Collection<RegionOfInterest>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<RegionOfInterest>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceAdministration(SubstanceAdministration) <em>Get Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.entryRelationship.substanceAdministration";

	/**
	 * The cached OCL query for the '{@link #getSubstanceAdministration(SubstanceAdministration) <em>Get Substance Administration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.substanceAdministration
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<SubstanceAdministration> getSubstanceAdministration(SubstanceAdministration substanceAdministration) {
		if (GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(16));
			try {
				GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceAdministration> result = (Collection<SubstanceAdministration>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<SubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupply(SubstanceAdministration) <em>Get Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLY__EOCL_EXP = "self.entryRelationship.supply";

	/**
	 * The cached OCL query for the '{@link #getSupply(SubstanceAdministration) <em>Get Supply</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply(SubstanceAdministration)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.supply
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Supply> getSupply(SubstanceAdministration substanceAdministration) {
		if (GET_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(17));
			try {
				GET_SUPPLY__EOCL_QRY = helper.createQuery(GET_SUPPLY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Supply> result = (Collection<Supply>) query.evaluate(substanceAdministration);
		return new BasicEList.UnmodifiableEList<Supply>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #hasActTemplate(SubstanceAdministration, java.lang.String) <em>Has Act Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasActTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ACT_TEMPLATE__STRING__EOCL_EXP = "self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasActTemplate(SubstanceAdministration, java.lang.String) <em>Has Act Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasActTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ACT_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasActTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_ACT_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(18));
			try {
				HAS_ACT_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasCode(SubstanceAdministration, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(SubstanceAdministration, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_CODE__STRING_STRING_STRING__EOCL_EXP = "self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName";

	/**
	 * The cached OCL query for the '{@link #hasCode(SubstanceAdministration, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(SubstanceAdministration, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_CODE__STRING_STRING_STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasCode(SubstanceAdministration substanceAdministration, String code, String codeSystem, String codeSystemName) {
		if (HAS_CODE__STRING_STRING_STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(19));
			try {
				HAS_CODE__STRING_STRING_STRING__EOCL_QRY = helper.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("code", code);
		environment.add("codeSystem", codeSystem);
		environment.add("codeSystemName", codeSystemName);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasEncounterTemplate(SubstanceAdministration, java.lang.String) <em>Has Encounter Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasEncounterTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP = "self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasEncounterTemplate(SubstanceAdministration, java.lang.String) <em>Has Encounter Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasEncounterTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasEncounterTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(20));
			try {
				HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationMediaTemplate(SubstanceAdministration, java.lang.String) <em>Has Observation Media Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationMediaTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP = "self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationMediaTemplate(SubstanceAdministration, java.lang.String) <em>Has Observation Media Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationMediaTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasObservationMediaTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(21));
			try {
				HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationTemplate(SubstanceAdministration, java.lang.String) <em>Has Observation Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP = "self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationTemplate(SubstanceAdministration, java.lang.String) <em>Has Observation Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasObservationTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(22));
			try {
				HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasOrganizerTemplate(SubstanceAdministration, java.lang.String) <em>Has Organizer Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOrganizerTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP = "self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasOrganizerTemplate(SubstanceAdministration, java.lang.String) <em>Has Organizer Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOrganizerTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasOrganizerTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(23));
			try {
				HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasProcedureTemplate(SubstanceAdministration, java.lang.String) <em>Has Procedure Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasProcedureTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP = "self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasProcedureTemplate(SubstanceAdministration, java.lang.String) <em>Has Procedure Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasProcedureTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasProcedureTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(24));
			try {
				HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasRegionOfInterestTemplate(SubstanceAdministration, java.lang.String) <em>Has Region Of Interest Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasRegionOfInterestTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP = "self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasRegionOfInterestTemplate(SubstanceAdministration, java.lang.String) <em>Has Region Of Interest Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasRegionOfInterestTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasRegionOfInterestTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(25));
			try {
				HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSubstanceAdministrationTemplate(SubstanceAdministration, java.lang.String) <em>Has Substance Administration Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSubstanceAdministrationTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP = "self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSubstanceAdministrationTemplate(SubstanceAdministration, java.lang.String) <em>Has Substance Administration Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSubstanceAdministrationTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSubstanceAdministrationTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(26));
			try {
				HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSupplyTemplate(SubstanceAdministration, java.lang.String) <em>Has Supply Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSupplyTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP = "self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSupplyTemplate(SubstanceAdministration, java.lang.String) <em>Has Supply Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSupplyTemplate(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSupplyTemplate(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(27));
			try {
				HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasTemplateId(SubstanceAdministration, java.lang.String) <em>Has Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_TEMPLATE_ID__STRING__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = templateId)";

	/**
	 * The cached OCL query for the '{@link #hasTemplateId(SubstanceAdministration, java.lang.String) <em>Has Template Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(SubstanceAdministration, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_TEMPLATE_ID__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = templateId)
	 * @param substanceAdministration The receiving '<em><b>Substance Administration</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasTemplateId(SubstanceAdministration substanceAdministration, String templateId) {
		if (HAS_TEMPLATE_ID__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSubstanceAdministration(), CDAPackage.eINSTANCE.getSubstanceAdministration().getEAllOperations().get(28));
			try {
				HAS_TEMPLATE_ID__STRING__EOCL_QRY = helper.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(substanceAdministration)).booleanValue();
	}

} // SubstanceAdministrationOperations