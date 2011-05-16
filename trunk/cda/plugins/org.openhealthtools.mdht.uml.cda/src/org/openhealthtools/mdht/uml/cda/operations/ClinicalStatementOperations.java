/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     David A Carlson - getEntryRelationshipTargets
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Statement</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addAct(org.openhealthtools.mdht.uml.cda.Act) <em>Add Act</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addEncounter(org.openhealthtools.mdht.uml.cda.Encounter) <em>Add Encounter</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addObservation(org.openhealthtools.mdht.uml.cda.Observation) <em>Add Observation
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addObservationMedia(org.openhealthtools.mdht.uml.cda.ObservationMedia) <em>Add
 * Observation Media</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addOrganizer(org.openhealthtools.mdht.uml.cda.Organizer) <em>Add Organizer</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addProcedure(org.openhealthtools.mdht.uml.cda.Procedure) <em>Add Procedure</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addRegionOfInterest(org.openhealthtools.mdht.uml.cda.RegionOfInterest) <em>Add Region
 * Of Interest</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addSubstanceAdministration(org.openhealthtools.mdht.uml.cda.SubstanceAdministration)
 * <em>Add Substance Administration</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#addSupply(org.openhealthtools.mdht.uml.cda.Supply) <em>Add Supply</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getActs() <em>Get Acts</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getClinicalDocument() <em>Get Clinical Document</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getEncounters() <em>Get Encounters</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship, java.lang.Object)
 * <em>Get Entry Relationship Targets</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getEntryRelationshipTargets(java.lang.Object) <em>Get Entry Relationship Targets
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getObservations() <em>Get Observations</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getObservationMedia() <em>Get Observation Media</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getOrganizers() <em>Get Organizers</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getProcedures() <em>Get Procedures</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getRegionsOfInterest() <em>Get Regions Of Interest</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getSection() <em>Get Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getSubstanceAdministrations() <em>Get Substance Administrations</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getSupplies() <em>Get Supplies</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasActTemplate(java.lang.String) <em>Has Act Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasCode(java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasEncounterTemplate(java.lang.String) <em>Has Encounter Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasObservationMediaTemplate(java.lang.String) <em>Has Observation Media Template
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasObservationTemplate(java.lang.String) <em>Has Observation Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasOrganizerTemplate(java.lang.String) <em>Has Organizer Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasProcedureTemplate(java.lang.String) <em>Has Procedure Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasRegionOfInterestTemplate(java.lang.String) <em>Has Region Of Interest Template
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasSubstanceAdministrationTemplate(java.lang.String) <em>Has Substance Administration
 * Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasSupplyTemplate(java.lang.String) <em>Has Supply Template</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#hasTemplateId(java.lang.String) <em>Has Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClinicalStatementOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClinicalStatementOperations() {
		super();
	}

	@SuppressWarnings("unchecked")
	private static List<EntryRelationship> getEntryRelationships(ClinicalStatement clinicalStatement) {
		return ((List<EntryRelationship>) clinicalStatement.eGet(clinicalStatement.eClass().getEStructuralFeature(
			"entryRelationship")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addAct(ClinicalStatement clinicalStatement, Act act) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setAct(act);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addEncounter(ClinicalStatement clinicalStatement, Encounter encounter) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setEncounter(encounter);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addObservation(ClinicalStatement clinicalStatement, Observation observation) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setObservation(observation);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addObservationMedia(ClinicalStatement clinicalStatement, ObservationMedia observationMedia) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setObservationMedia(observationMedia);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addOrganizer(ClinicalStatement clinicalStatement, Organizer organizer) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setOrganizer(organizer);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addProcedure(ClinicalStatement clinicalStatement, Procedure procedure) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setProcedure(procedure);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addRegionOfInterest(ClinicalStatement clinicalStatement, RegionOfInterest regionOfInterest) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setRegionOfInterest(regionOfInterest);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addSubstanceAdministration(ClinicalStatement clinicalStatement,
			SubstanceAdministration substanceAdministration) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setSubstanceAdministration(substanceAdministration);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static void addSupply(ClinicalStatement clinicalStatement, Supply supply) {
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
		entryRelationship.setSupply(supply);
		getEntryRelationships(clinicalStatement).add(entryRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<Act> getActs(ClinicalStatement clinicalStatement) {
		List<Act> acts = new ArrayList<Act>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getAct() != null) {
				acts.add(entryRelationship.getAct());
			}
		}
		return new BasicEList.UnmodifiableEList<Act>(acts.size(), acts.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static ClinicalDocument getClinicalDocument(ClinicalStatement clinicalStatement) {
		return CDAUtil.getClinicalDocument(clinicalStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<Encounter> getEncounters(ClinicalStatement clinicalStatement) {
		List<Encounter> encounters = new ArrayList<Encounter>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getEncounter() != null) {
				encounters.add(entryRelationship.getEncounter());
			}
		}
		return new BasicEList.UnmodifiableEList<Encounter>(encounters.size(), encounters.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<ClinicalStatement> getEntryRelationshipTargets(ClinicalStatement clinicalStatement,
			x_ActRelationshipEntryRelationship typeCode, Object targetClass) {
		if (targetClass != null && !(targetClass instanceof EClass))
			throw new IllegalArgumentException("targetClass must be an EClass");

		return CDAUtil.getEntryRelationshipTargets(clinicalStatement, typeCode, (EClass) targetClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<ClinicalStatement> getEntryRelationshipTargets(ClinicalStatement clinicalStatement,
			Object targetClass) {
		return getEntryRelationshipTargets(clinicalStatement, null, targetClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<Observation> getObservations(ClinicalStatement clinicalStatement) {
		List<Observation> observations = new ArrayList<Observation>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getObservation() != null) {
				observations.add(entryRelationship.getObservation());
			}
		}
		return new BasicEList.UnmodifiableEList<Observation>(observations.size(), observations.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<ObservationMedia> getObservationMedia(ClinicalStatement clinicalStatement) {
		List<ObservationMedia> observationMedia = new ArrayList<ObservationMedia>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getObservationMedia() != null) {
				observationMedia.add(entryRelationship.getObservationMedia());
			}
		}
		return new BasicEList.UnmodifiableEList<ObservationMedia>(observationMedia.size(), observationMedia.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<Organizer> getOrganizers(ClinicalStatement clinicalStatement) {
		List<Organizer> organizers = new ArrayList<Organizer>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getOrganizer() != null) {
				organizers.add(entryRelationship.getOrganizer());
			}
		}
		return new BasicEList.UnmodifiableEList<Organizer>(organizers.size(), organizers.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<Procedure> getProcedures(ClinicalStatement clinicalStatement) {
		List<Procedure> procedures = new ArrayList<Procedure>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getProcedure() != null) {
				procedures.add(entryRelationship.getProcedure());
			}
		}
		return new BasicEList.UnmodifiableEList<Procedure>(procedures.size(), procedures.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<RegionOfInterest> getRegionsOfInterest(ClinicalStatement clinicalStatement) {
		List<RegionOfInterest> regionsOfInterest = new ArrayList<RegionOfInterest>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getRegionOfInterest() != null) {
				regionsOfInterest.add(entryRelationship.getRegionOfInterest());
			}
		}
		return new BasicEList.UnmodifiableEList<RegionOfInterest>(regionsOfInterest.size(), regionsOfInterest.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static Section getSection(ClinicalStatement clinicalStatement) {
		return CDAUtil.getSection(clinicalStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<SubstanceAdministration> getSubstanceAdministrations(ClinicalStatement clinicalStatement) {
		List<SubstanceAdministration> substanceAdministrations = new ArrayList<SubstanceAdministration>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getSubstanceAdministration() != null) {
				substanceAdministrations.add(entryRelationship.getSubstanceAdministration());
			}
		}
		return new BasicEList.UnmodifiableEList<SubstanceAdministration>(
			substanceAdministrations.size(), substanceAdministrations.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<Supply> getSupplies(ClinicalStatement clinicalStatement) {
		List<Supply> supplies = new ArrayList<Supply>();
		for (EntryRelationship entryRelationship : getEntryRelationships(clinicalStatement)) {
			if (entryRelationship.getSupply() != null) {
				supplies.add(entryRelationship.getSupply());
			}
		}
		return new BasicEList.UnmodifiableEList<Supply>(supplies.size(), supplies.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #hasActTemplate(ClinicalStatement, java.lang.String) <em>Has Act Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasActTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ACT_TEMPLATE__STRING__EOCL_EXP = "self.getActs()->exists(act : cda::Act | act.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasActTemplate(ClinicalStatement, java.lang.String) <em>Has Act Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasActTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ACT_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasActTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_ACT_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(38));
			try {
				HAS_ACT_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static boolean hasCode(ClinicalStatement clinicalStatement, String code, String codeSystem,
			String codeSystemName) {
		CD cd = (CD) clinicalStatement.eGet(clinicalStatement.eClass().getEStructuralFeature("code"));
		if (cd == null || code == null || codeSystem == null || codeSystemName == null) {
			return false;
		}
		return code.equals(cd.getCode()) && codeSystem.equals(cd.getCodeSystem()) &&
				codeSystemName.equals(cd.getCodeSystemName());
	}

	/**
	 * The cached OCL expression body for the '{@link #hasEncounterTemplate(ClinicalStatement, java.lang.String) <em>Has Encounter Template</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasEncounterTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP = "self.getEncounters()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasEncounterTemplate(ClinicalStatement, java.lang.String) <em>Has Encounter Template</em>}' query
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasEncounterTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasEncounterTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(40));
			try {
				HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationMediaTemplate(ClinicalStatement, java.lang.String)
	 * <em>Has Observation Media Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasObservationMediaTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP = "self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationMediaTemplate(ClinicalStatement, java.lang.String) <em>Has Observation Media Template</em>}
	 * ' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasObservationMediaTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasObservationMediaTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(41));
			try {
				HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationTemplate(ClinicalStatement, java.lang.String) <em>Has Observation Template</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasObservationTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationTemplate(ClinicalStatement, java.lang.String) <em>Has Observation Template</em>}' query
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasObservationTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasObservationTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(42));
			try {
				HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasOrganizerTemplate(ClinicalStatement, java.lang.String) <em>Has Organizer Template</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasOrganizerTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP = "self.getOrganizers()->exists(org : cda::Organizer | org.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasOrganizerTemplate(ClinicalStatement, java.lang.String) <em>Has Organizer Template</em>}' query
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasOrganizerTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasOrganizerTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(43));
			try {
				HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasProcedureTemplate(ClinicalStatement, java.lang.String) <em>Has Procedure Template</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasProcedureTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP = "self.getProcedures()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasProcedureTemplate(ClinicalStatement, java.lang.String) <em>Has Procedure Template</em>}' query
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasProcedureTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasProcedureTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(44));
			try {
				HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasRegionOfInterestTemplate(ClinicalStatement, java.lang.String)
	 * <em>Has Region Of Interest Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasRegionOfInterestTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP = "self.getRegionsOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasRegionOfInterestTemplate(ClinicalStatement, java.lang.String)
	 * <em>Has Region Of Interest Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasRegionOfInterestTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionsOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasRegionOfInterestTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(45));
			try {
				HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSubstanceAdministrationTemplate(ClinicalStatement, java.lang.String)
	 * <em>Has Substance Administration Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasSubstanceAdministrationTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP = "self.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSubstanceAdministrationTemplate(ClinicalStatement, java.lang.String)
	 * <em>Has Substance Administration Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasSubstanceAdministrationTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasSubstanceAdministrationTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(46));
			try {
				HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSupplyTemplate(ClinicalStatement, java.lang.String) <em>Has Supply Template</em>}'
	 * operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasSupplyTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP = "self.getSupplies()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSupplyTemplate(ClinicalStatement, java.lang.String) <em>Has Supply Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #hasSupplyTemplate(ClinicalStatement, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * 
	 * @param clinicalStatement
	 *            The receiving '<em><b>Clinical Statement</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasSupplyTemplate(ClinicalStatement clinicalStatement, String templateId) {
		if (HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_STATEMENT,
				CDAPackage.Literals.CLINICAL_STATEMENT.getEAllOperations().get(47));
			try {
				HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalStatement)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public static boolean hasTemplateId(ClinicalStatement clinicalStatement, String templateId) {
		for (II ii : (List<II>) clinicalStatement.eGet(clinicalStatement.eClass().getEStructuralFeature("templateId"))) {
			if (templateId.equals(ii.getRoot())) {
				return true;
			}
		}
		return false;
	}

} // ClinicalStatementOperations
