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
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription;
import org.openhealthtools.mdht.uml.cda.ccd.CoveredParty;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.PayerEntity;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCDFactoryImpl extends EFactoryImpl implements CCDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CCDFactory init() {
		try {
			CCDFactory theCCDFactory = (CCDFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd"); 
			if (theCCDFactory != null) {
				return theCCDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CCDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CCDPackage.MEDICATIONS_SECTION: return createMedicationsSection();
			case CCDPackage.MEDICATION_ACTIVITY: return createMedicationActivity();
			case CCDPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: return createMedicationSeriesNumberObservation();
			case CCDPackage.MEDICATION_STATUS_OBSERVATION: return createMedicationStatusObservation();
			case CCDPackage.STATUS_OBSERVATION: return createStatusObservation();
			case CCDPackage.PATIENT_INSTRUCTION: return createPatientInstruction();
			case CCDPackage.REACTION_OBSERVATION: return createReactionObservation();
			case CCDPackage.SEVERITY_OBSERVATION: return createSeverityObservation();
			case CCDPackage.SUPPLY_ACTIVITY: return createSupplyActivity();
			case CCDPackage.FULFILLMENT_INSTRUCTION: return createFulfillmentInstruction();
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT: return createContinuityOfCareDocument();
			case CCDPackage.PROBLEM_SECTION: return createProblemSection();
			case CCDPackage.PROBLEM_ACT: return createProblemAct();
			case CCDPackage.EPISODE_OBSERVATION: return createEpisodeObservation();
			case CCDPackage.PROBLEM_OBSERVATION: return createProblemObservation();
			case CCDPackage.PROBLEM_STATUS_OBSERVATION: return createProblemStatusObservation();
			case CCDPackage.PROBLEM_HEALTH_STATUS_OBSERVATION: return createProblemHealthStatusObservation();
			case CCDPackage.AGE_OBSERVATION: return createAgeObservation();
			case CCDPackage.FAMILY_HISTORY_SECTION: return createFamilyHistorySection();
			case CCDPackage.SOCIAL_HISTORY_SECTION: return createSocialHistorySection();
			case CCDPackage.ALERTS_SECTION: return createAlertsSection();
			case CCDPackage.RESULTS_SECTION: return createResultsSection();
			case CCDPackage.RESULT_ORGANIZER: return createResultOrganizer();
			case CCDPackage.RESULT_OBSERVATION: return createResultObservation();
			case CCDPackage.PROCEDURES_SECTION: return createProceduresSection();
			case CCDPackage.ENCOUNTERS_SECTION: return createEncountersSection();
			case CCDPackage.PLAN_OF_CARE_SECTION: return createPlanOfCareSection();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY: return createPlanOfCareActivity();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ACT: return createPlanOfCareActivityAct();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: return createPlanOfCareActivityEncounter();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: return createPlanOfCareActivityObservation();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: return createPlanOfCareActivityProcedure();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: return createPlanOfCareActivitySubstanceAdministration();
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: return createPlanOfCareActivitySupply();
			case CCDPackage.IMMUNIZATIONS_SECTION: return createImmunizationsSection();
			case CCDPackage.VITAL_SIGNS_SECTION: return createVitalSignsSection();
			case CCDPackage.VITAL_SIGNS_ORGANIZER: return createVitalSignsOrganizer();
			case CCDPackage.MEDICAL_EQUIPMENT_SECTION: return createMedicalEquipmentSection();
			case CCDPackage.FUNCTIONAL_STATUS_SECTION: return createFunctionalStatusSection();
			case CCDPackage.ADVANCE_DIRECTIVES_SECTION: return createAdvanceDirectivesSection();
			case CCDPackage.ADVANCE_DIRECTIVE_OBSERVATION: return createAdvanceDirectiveObservation();
			case CCDPackage.PAYERS_SECTION: return createPayersSection();
			case CCDPackage.COVERAGE_ACTIVITY: return createCoverageActivity();
			case CCDPackage.POLICY_ACTIVITY: return createPolicyActivity();
			case CCDPackage.PURPOSE_SECTION: return createPurposeSection();
			case CCDPackage.PURPOSE_ACTIVITY: return createPurposeActivity();
			case CCDPackage.PATIENT_AWARENESS: return createPatientAwareness();
			case CCDPackage.FAMILY_HISTORY_OBSERVATION: return createFamilyHistoryObservation();
			case CCDPackage.FAMILY_HISTORY_ORGANIZER: return createFamilyHistoryOrganizer();
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION: return createSocialHistoryObservation();
			case CCDPackage.ENCOUNTERS_ACTIVITY: return createEncountersActivity();
			case CCDPackage.ALERT_OBSERVATION: return createAlertObservation();
			case CCDPackage.ALERT_STATUS_OBSERVATION: return createAlertStatusObservation();
			case CCDPackage.CAUSE_OF_DEATH_OBSERVATION: return createCauseOfDeathObservation();
			case CCDPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case CCDPackage.PRODUCT: return createProduct();
			case CCDPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: return createAdvanceDirectiveStatusObservation();
			case CCDPackage.ADVANCE_DIRECTIVE_VERIFICATION: return createAdvanceDirectiveVerification();
			case CCDPackage.AUTHORIZATION_ACTIVITY: return createAuthorizationActivity();
			case CCDPackage.PROCEDURE_ACTIVITY: return createProcedureActivity();
			case CCDPackage.FUNCTIONAL_STATUS_OBSERVATION: return createFunctionalStatusObservation();
			case CCDPackage.PRODUCT_INSTANCE: return createProductInstance();
			case CCDPackage.PROCEDURE_ACTIVITY_ACT: return createProcedureActivityAct();
			case CCDPackage.PROCEDURE_ACTIVITY_OBSERVATION: return createProcedureActivityObservation();
			case CCDPackage.PROCEDURE_ACTIVITY_PROCEDURE: return createProcedureActivityProcedure();
			case CCDPackage.PAYER_ENTITY: return createPayerEntity();
			case CCDPackage.COVERED_PARTY: return createCoveredParty();
			case CCDPackage.POLICY_SUBSCRIBER: return createPolicySubscriber();
			case CCDPackage.COVERAGE_PLAN_DESCRIPTION: return createCoveragePlanDescription();
			case CCDPackage.SUPPORT_PARTICIPANT: return createSupportParticipant();
			case CCDPackage.SUPPORT_GUARDIAN: return createSupportGuardian();
			case CCDPackage.COMMENT: return createComment();
			case CCDPackage.CCD_REGISTRY_DELEGATE: return createCCDRegistryDelegate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument createContinuityOfCareDocument() {
		ContinuityOfCareDocumentImpl continuityOfCareDocument = new ContinuityOfCareDocumentImpl();
		return continuityOfCareDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemAct createProblemAct() {
		ProblemActImpl problemAct = new ProblemActImpl();
		return problemAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation createProblemObservation() {
		ProblemObservationImpl problemObservation = new ProblemObservationImpl();
		return problemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection createProblemSection() {
		ProblemSectionImpl problemSection = new ProblemSectionImpl();
		return problemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation createProblemStatusObservation() {
		ProblemStatusObservationImpl problemStatusObservation = new ProblemStatusObservationImpl();
		return problemStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAwareness createPatientAwareness() {
		PatientAwarenessImpl patientAwareness = new PatientAwarenessImpl();
		return patientAwareness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer createFamilyHistoryOrganizer() {
		FamilyHistoryOrganizerImpl familyHistoryOrganizer = new FamilyHistoryOrganizerImpl();
		return familyHistoryOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservation createResultObservation() {
		ResultObservationImpl resultObservation = new ResultObservationImpl();
		return resultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation createSocialHistoryObservation() {
		SocialHistoryObservationImpl socialHistoryObservation = new SocialHistoryObservationImpl();
		return socialHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersActivity createEncountersActivity() {
		EncountersActivityImpl encountersActivity = new EncountersActivityImpl();
		return encountersActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity createMedicationActivity() {
		MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
		return medicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyActivity createSupplyActivity() {
		SupplyActivityImpl supplyActivity = new SupplyActivityImpl();
		return supplyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsSection createAlertsSection() {
		AlertsSectionImpl alertsSection = new AlertsSectionImpl();
		return alertsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertObservation createAlertObservation() {
		AlertObservationImpl alertObservation = new AlertObservationImpl();
		return alertObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation createSeverityObservation() {
		SeverityObservationImpl severityObservation = new SeverityObservationImpl();
		return severityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertStatusObservation createAlertStatusObservation() {
		AlertStatusObservationImpl alertStatusObservation = new AlertStatusObservationImpl();
		return alertStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseOfDeathObservation createCauseOfDeathObservation() {
		CauseOfDeathObservationImpl causeOfDeathObservation = new CauseOfDeathObservationImpl();
		return causeOfDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection createResultsSection() {
		ResultsSectionImpl resultsSection = new ResultsSectionImpl();
		return resultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation createMedicationStatusObservation() {
		MedicationStatusObservationImpl medicationStatusObservation = new MedicationStatusObservationImpl();
		return medicationStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection createProceduresSection() {
		ProceduresSectionImpl proceduresSection = new ProceduresSectionImpl();
		return proceduresSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivity createPlanOfCareActivity() {
		PlanOfCareActivityImpl planOfCareActivity = new PlanOfCareActivityImpl();
		return planOfCareActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeSection createPurposeSection() {
		PurposeSectionImpl purposeSection = new PurposeSectionImpl();
		return purposeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeActivity createPurposeActivity() {
		PurposeActivityImpl purposeActivity = new PurposeActivityImpl();
		return purposeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation createAdvanceDirectiveObservation() {
		AdvanceDirectiveObservationImpl advanceDirectiveObservation = new AdvanceDirectiveObservationImpl();
		return advanceDirectiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation() {
		AdvanceDirectiveStatusObservationImpl advanceDirectiveStatusObservation = new AdvanceDirectiveStatusObservationImpl();
		return advanceDirectiveStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveVerification createAdvanceDirectiveVerification() {
		AdvanceDirectiveVerificationImpl advanceDirectiveVerification = new AdvanceDirectiveVerificationImpl();
		return advanceDirectiveVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivity createCoverageActivity() {
		CoverageActivityImpl coverageActivity = new CoverageActivityImpl();
		return coverageActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity createPolicyActivity() {
		PolicyActivityImpl policyActivity = new PolicyActivityImpl();
		return policyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerEntity createPayerEntity() {
		PayerEntityImpl payerEntity = new PayerEntityImpl();
		return payerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredParty createCoveredParty() {
		CoveredPartyImpl coveredParty = new CoveredPartyImpl();
		return coveredParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySubscriber createPolicySubscriber() {
		PolicySubscriberImpl policySubscriber = new PolicySubscriberImpl();
		return policySubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity createAuthorizationActivity() {
		AuthorizationActivityImpl authorizationActivity = new AuthorizationActivityImpl();
		return authorizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityAct createPlanOfCareActivityAct() {
		PlanOfCareActivityActImpl planOfCareActivityAct = new PlanOfCareActivityActImpl();
		return planOfCareActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivity createProcedureActivity() {
		ProcedureActivityImpl procedureActivity = new ProcedureActivityImpl();
		return procedureActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientInstruction createPatientInstruction() {
		PatientInstructionImpl patientInstruction = new PatientInstructionImpl();
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentInstruction createFulfillmentInstruction() {
		FulfillmentInstructionImpl fulfillmentInstruction = new FulfillmentInstructionImpl();
		return fulfillmentInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusObservation createFunctionalStatusObservation() {
		FunctionalStatusObservationImpl functionalStatusObservation = new FunctionalStatusObservationImpl();
		return functionalStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityObservation createPlanOfCareActivityObservation() {
		PlanOfCareActivityObservationImpl planOfCareActivityObservation = new PlanOfCareActivityObservationImpl();
		return planOfCareActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter createPlanOfCareActivityEncounter() {
		PlanOfCareActivityEncounterImpl planOfCareActivityEncounter = new PlanOfCareActivityEncounterImpl();
		return planOfCareActivityEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityProcedure createPlanOfCareActivityProcedure() {
		PlanOfCareActivityProcedureImpl planOfCareActivityProcedure = new PlanOfCareActivityProcedureImpl();
		return planOfCareActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration() {
		PlanOfCareActivitySubstanceAdministrationImpl planOfCareActivitySubstanceAdministration = new PlanOfCareActivitySubstanceAdministrationImpl();
		return planOfCareActivitySubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySupply createPlanOfCareActivitySupply() {
		PlanOfCareActivitySupplyImpl planOfCareActivitySupply = new PlanOfCareActivitySupplyImpl();
		return planOfCareActivitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct createProcedureActivityAct() {
		ProcedureActivityActImpl procedureActivityAct = new ProcedureActivityActImpl();
		return procedureActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation createProcedureActivityObservation() {
		ProcedureActivityObservationImpl procedureActivityObservation = new ProcedureActivityObservationImpl();
		return procedureActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure createProcedureActivityProcedure() {
		ProcedureActivityProcedureImpl procedureActivityProcedure = new ProcedureActivityProcedureImpl();
		return procedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveragePlanDescription createCoveragePlanDescription() {
		CoveragePlanDescriptionImpl coveragePlanDescription = new CoveragePlanDescriptionImpl();
		return coveragePlanDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportParticipant createSupportParticipant() {
		SupportParticipantImpl supportParticipant = new SupportParticipantImpl();
		return supportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportGuardian createSupportGuardian() {
		SupportGuardianImpl supportGuardian = new SupportGuardianImpl();
		return supportGuardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDRegistryDelegate createCCDRegistryDelegate() {
		CCDRegistryDelegateImpl ccdRegistryDelegate = new CCDRegistryDelegateImpl();
		return ccdRegistryDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusObservation createStatusObservation() {
		StatusObservationImpl statusObservation = new StatusObservationImpl();
		return statusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemHealthStatusObservation createProblemHealthStatusObservation() {
		ProblemHealthStatusObservationImpl problemHealthStatusObservation = new ProblemHealthStatusObservationImpl();
		return problemHealthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDPackage getCCDPackage() {
		return (CCDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CCDPackage getPackage() {
		return CCDPackage.eINSTANCE;
	}

} //CCDFactoryImpl
