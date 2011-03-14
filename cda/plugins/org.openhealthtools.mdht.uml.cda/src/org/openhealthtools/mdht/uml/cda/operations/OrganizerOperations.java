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
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addOrganizer(org.openhealthtools.mdht.uml.cda.Organizer) <em>Add Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addAct(org.openhealthtools.mdht.uml.cda.Act) <em>Add Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addEncounter(org.openhealthtools.mdht.uml.cda.Encounter) <em>Add Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addObservation(org.openhealthtools.mdht.uml.cda.Observation) <em>Add Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addObservationMedia(org.openhealthtools.mdht.uml.cda.ObservationMedia) <em>Add Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addProcedure(org.openhealthtools.mdht.uml.cda.Procedure) <em>Add Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addRegionOfInterest(org.openhealthtools.mdht.uml.cda.RegionOfInterest) <em>Add Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addSubstanceAdministration(org.openhealthtools.mdht.uml.cda.SubstanceAdministration) <em>Add Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#addSupply(org.openhealthtools.mdht.uml.cda.Supply) <em>Add Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getActs() <em>Get Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getEncounters() <em>Get Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getObservations() <em>Get Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getObservationMedia() <em>Get Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getOrganizers() <em>Get Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getProcedures() <em>Get Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getRegionsOfInterest() <em>Get Regions Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getSubstanceAdministrations() <em>Get Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getSupplies() <em>Get Supplies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship, java.lang.Object) <em>Get Entry Relationship Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Organizer#getEntryRelationshipTargets(java.lang.Object) <em>Get Entry Relationship Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizerOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizerOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addAct(Organizer organizer, Act act) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setAct(act);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addEncounter(Organizer organizer, Encounter encounter) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setEncounter(encounter);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addObservation(Organizer organizer, Observation observation) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setObservation(observation);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addObservationMedia(Organizer organizer, ObservationMedia observationMedia) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setObservationMedia(observationMedia);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addOrganizer(Organizer organizer, Organizer newOrganizer) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setOrganizer(newOrganizer);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addProcedure(Organizer organizer, Procedure procedure) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setProcedure(procedure);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addRegionOfInterest(Organizer organizer, RegionOfInterest regionOfInterest) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setRegionOfInterest(regionOfInterest);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addSubstanceAdministration(Organizer organizer, SubstanceAdministration substanceAdministration) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setSubstanceAdministration(substanceAdministration);
		organizer.getComponents().add(component4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addSupply(Organizer organizer, Supply supply) {
		Component4 component4 = CDAFactory.eINSTANCE.createComponent4();
		component4.setSupply(supply);
		organizer.getComponents().add(component4);
	}

	/**
	 * The cached OCL expression body for the '{@link #getActs(Organizer) <em>Get Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActs(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACTS__EOCL_EXP = "self.component.act->select(act : cda::Act | not act.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getActs(Organizer) <em>Get Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActs(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.act->select(act : cda::Act | not act.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Act> getActs(Organizer organizer) {
		if (GET_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(25));
			try {
				GET_ACTS__EOCL_QRY = helper.createQuery(GET_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Act> result = (Collection<Act>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<Act>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounters(Organizer) <em>Get Encounters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounters(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS__EOCL_EXP = "self.component.encounter->select(enc : cda::Encounter | not enc.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getEncounters(Organizer) <em>Get Encounters</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounters(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.encounter->select(enc : cda::Encounter | not enc.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Encounter> getEncounters(Organizer organizer) {
		if (GET_ENCOUNTERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(27));
			try {
				GET_ENCOUNTERS__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservations(Organizer) <em>Get Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATIONS__EOCL_EXP = "self.component.observation->select(obs : cda::Observation | not obs.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getObservations(Organizer) <em>Get Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.observation->select(obs : cda::Observation | not obs.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Observation> getObservations(Organizer organizer) {
		if (GET_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(30));
			try {
				GET_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Observation> result = (Collection<Observation>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<Observation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservationMedia(Organizer) <em>Get Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION_MEDIA__EOCL_EXP = "self.component.observationMedia->select(media : cda::ObservationMedia | not media.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getObservationMedia(Organizer) <em>Get Observation Media</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION_MEDIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.observationMedia->select(media : cda::ObservationMedia | not media.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ObservationMedia> getObservationMedia(Organizer organizer) {
		if (GET_OBSERVATION_MEDIA__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(31));
			try {
				GET_OBSERVATION_MEDIA__EOCL_QRY = helper.createQuery(GET_OBSERVATION_MEDIA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION_MEDIA__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ObservationMedia> result = (Collection<ObservationMedia>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<ObservationMedia>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getOrganizers(Organizer) <em>Get Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizers(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ORGANIZERS__EOCL_EXP = "self.component.organizer->select(org : cda::Organizer | not org.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getOrganizers(Organizer) <em>Get Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizers(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.organizer->select(org : cda::Organizer | not org.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Organizer> getOrganizers(Organizer organizer) {
		if (GET_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(32));
			try {
				GET_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Organizer> result = (Collection<Organizer>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<Organizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedures(Organizer) <em>Get Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES__EOCL_EXP = "self.component.procedure->select(proc : cda::Procedure | not proc.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getProcedures(Organizer) <em>Get Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.procedure->select(proc : cda::Procedure | not proc.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getProcedures(Organizer organizer) {
		if (GET_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(33));
			try {
				GET_PROCEDURES__EOCL_QRY = helper.createQuery(GET_PROCEDURES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRegionsOfInterest(Organizer) <em>Get Regions Of Interest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionsOfInterest(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REGIONS_OF_INTEREST__EOCL_EXP = "self.component.regionOfInterest->select(reg : cda::RegionOfInterest | not reg.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getRegionsOfInterest(Organizer) <em>Get Regions Of Interest</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionsOfInterest(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REGIONS_OF_INTEREST__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.regionOfInterest->select(reg : cda::RegionOfInterest | not reg.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<RegionOfInterest> getRegionsOfInterest(Organizer organizer) {
		if (GET_REGIONS_OF_INTEREST__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(34));
			try {
				GET_REGIONS_OF_INTEREST__EOCL_QRY = helper.createQuery(GET_REGIONS_OF_INTEREST__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REGIONS_OF_INTEREST__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RegionOfInterest> result = (Collection<RegionOfInterest>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<RegionOfInterest>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceAdministrations(Organizer) <em>Get Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministrations(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.component.substanceAdministration->select(sub : cda::SubstanceAdministration | not sub.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getSubstanceAdministrations(Organizer) <em>Get Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministrations(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.substanceAdministration->select(sub : cda::SubstanceAdministration | not sub.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<SubstanceAdministration> getSubstanceAdministrations(Organizer organizer) {
		if (GET_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(36));
			try {
				GET_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceAdministration> result = (Collection<SubstanceAdministration>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<SubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplies(Organizer) <em>Get Supplies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLIES__EOCL_EXP = "self.component.supply->select(sup : cda::Supply | not sup.oclIsUndefined())";

	/**
	 * The cached OCL query for the '{@link #getSupplies(Organizer) <em>Get Supplies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies(Organizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.supply->select(sup : cda::Supply | not sup.oclIsUndefined())
	 * @param organizer The receiving '<em><b>Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Supply> getSupplies(Organizer organizer) {
		if (GET_SUPPLIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.ORGANIZER, CDAPackage.Literals.ORGANIZER.getEAllOperations().get(37));
			try {
				GET_SUPPLIES__EOCL_QRY = helper.createQuery(GET_SUPPLIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Supply> result = (Collection<Supply>) query.evaluate(organizer);
		return new BasicEList.UnmodifiableEList<Supply>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<ClinicalStatement> getEntryRelationshipTargets(Organizer organizer, x_ActRelationshipEntryRelationship typeCode, Object targetClass) {
		throw new UnsupportedOperationException("This clinical statement does not have entryRelationship");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<ClinicalStatement> getEntryRelationshipTargets(Organizer organizer, Object targetClass) {
		throw new UnsupportedOperationException("This clinical statement does not have entryRelationship");
	}

} // OrganizerOperations