/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<Act> getActs(Organizer organizer) {
		List<Act> acts = new ArrayList<Act>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getAct() != null) {
				acts.add(component.getAct());
			}
		}
		return new BasicEList.UnmodifiableEList<Act>(acts.size(), acts.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<Encounter> getEncounters(Organizer organizer) {
		List<Encounter> encounters = new ArrayList<Encounter>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getEncounter() != null) {
				encounters.add(component.getEncounter());
			}
		}
		return new BasicEList.UnmodifiableEList<Encounter>(encounters.size(), encounters.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<Observation> getObservations(Organizer organizer) {
		List<Observation> observations = new ArrayList<Observation>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getObservation() != null) {
				observations.add(component.getObservation());
			}
		}
		return new BasicEList.UnmodifiableEList<Observation>(observations.size(), observations.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<ObservationMedia> getObservationMedia(Organizer organizer) {
		List<ObservationMedia> observationMedia = new ArrayList<ObservationMedia>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getObservationMedia() != null) {
				observationMedia.add(component.getObservationMedia());
			}
		}
		return new BasicEList.UnmodifiableEList<ObservationMedia>(observationMedia.size(), observationMedia.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<Organizer> getOrganizers(Organizer organizer) {
		List<Organizer> organizers = new ArrayList<Organizer>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getOrganizer() != null) {
				organizers.add(component.getOrganizer());
			}
		}
		return new BasicEList.UnmodifiableEList<Organizer>(organizers.size(), organizers.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<Procedure> getProcedures(Organizer organizer) {
		List<Procedure> procedures = new ArrayList<Procedure>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getProcedure() != null) {
				procedures.add(component.getProcedure());
			}
		}
		return new BasicEList.UnmodifiableEList<Procedure>(procedures.size(), procedures.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<RegionOfInterest> getRegionsOfInterest(Organizer organizer) {
		List<RegionOfInterest> regionsOfInterest = new ArrayList<RegionOfInterest>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getRegionOfInterest() != null) {
				regionsOfInterest.add(component.getRegionOfInterest());
			}
		}
		return new BasicEList.UnmodifiableEList<RegionOfInterest>(regionsOfInterest.size(), regionsOfInterest.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<SubstanceAdministration> getSubstanceAdministrations(Organizer organizer) {
		List<SubstanceAdministration> substanceAdministrations = new ArrayList<SubstanceAdministration>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getSubstanceAdministration() != null) {
				substanceAdministrations.add(component.getSubstanceAdministration());
			}
		}
		return new BasicEList.UnmodifiableEList<SubstanceAdministration>(substanceAdministrations.size(), substanceAdministrations.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<Supply> getSupplies(Organizer organizer) {
		List<Supply> supplies = new ArrayList<Supply>();
		for (Component4 component : organizer.getComponents()) {
			if (component.getSupply() != null) {
				supplies.add(component.getSupply());
			}
		}
		return new BasicEList.UnmodifiableEList<Supply>(supplies.size(), supplies.toArray());
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