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
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
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
			case CCDPackage.MEDICATION_SECTION: return createMedicationSection();
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT: return createContinuityOfCareDocument();
			case CCDPackage.PROBLEM_ACT: return createProblemAct();
			case CCDPackage.PROBLEM_OBSERVATION: return createProblemObservation();
			case CCDPackage.PROBLEM_SECTION: return createProblemSection();
			case CCDPackage.PROBLEM_STATUS: return createProblemStatus();
			case CCDPackage.STATUS_OBSERVATION: return createStatusObservation();
			case CCDPackage.PROBLEM_HEALTH_STATUS: return createProblemHealthStatus();
			case CCDPackage.EPISODE_OBSERVATION: return createEpisodeObservation();
			case CCDPackage.PATIENT_AWARENESS: return createPatientAwareness();
			case CCDPackage.FAMILY_HISTORY_SECTION: return createFamilyHistorySection();
			case CCDPackage.FAMILY_HISTORY_OBSERVATION: return createFamilyHistoryObservation();
			case CCDPackage.FAMILY_HISTORY_ORGANIZER: return createFamilyHistoryOrganizer();
			case CCDPackage.RESULT_ORGANIZER: return createResultOrganizer();
			case CCDPackage.RESULT_OBSERVATION: return createResultObservation();
			case CCDPackage.SOCIAL_HISTORY_SECTION: return createSocialHistorySection();
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION: return createSocialHistoryObservation();
			case CCDPackage.ENCOUNTERS_SECTION: return createEncountersSection();
			case CCDPackage.IMMUNIZATIONS_SECTION: return createImmunizationsSection();
			case CCDPackage.ENCOUNTERS_ACTIVITY: return createEncountersActivity();
			case CCDPackage.MEDICATION_ACTIVITY: return createMedicationActivity();
			case CCDPackage.SUPPLY_ACTIVITY: return createSupplyActivity();
			case CCDPackage.ALERTS_SECTION: return createAlertsSection();
			case CCDPackage.ALERT_OBSERVATION: return createAlertObservation();
			case CCDPackage.REACTION_OBSERVATION: return createReactionObservation();
			case CCDPackage.SEVERITY_OBSERVATION: return createSeverityObservation();
			case CCDPackage.ALERT_STATUS_OBSERVATION: return createAlertStatusObservation();
			case CCDPackage.CAUSE_OF_DEATH_OBSERVATION: return createCauseOfDeathObservation();
			case CCDPackage.RESULTS_SECTION: return createResultsSection();
			case CCDPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: return createMedicationSeriesNumberObservation();
			case CCDPackage.MEDICATION_STATUS_OBSERVATION: return createMedicationStatusObservation();
			case CCDPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case CCDPackage.PRODUCT: return createProduct();
			case CCDPackage.PROCEDURES_SECTION: return createProceduresSection();
			case CCDPackage.PLAN_OF_CARE_SECTION: return createPlanOfCareSection();
			case CCDPackage.VITAL_SIGNS_SECTION: return createVitalSignsSection();
			case CCDPackage.MEDICAL_EQUIPMENT_SECTION: return createMedicalEquipmentSection();
			case CCDPackage.FUNCTIONAL_STATUS_SECTION: return createFunctionalStatusSection();
			case CCDPackage.ADVANCE_DIRECTIVES_SECTION: return createAdvanceDirectivesSection();
			case CCDPackage.PAYERS_SECTION: return createPayersSection();
			case CCDPackage.PURPOSE_SECTION: return createPurposeSection();
			case CCDPackage.PURPOSE_ACTIVITY: return createPurposeActivity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSection createMedicationSection() {
		MedicationSectionImpl medicationSection = new MedicationSectionImpl();
		return medicationSection;
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
	public ProblemStatus createProblemStatus() {
		ProblemStatusImpl problemStatus = new ProblemStatusImpl();
		return problemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemHealthStatus createProblemHealthStatus() {
		ProblemHealthStatusImpl problemHealthStatus = new ProblemHealthStatusImpl();
		return problemHealthStatus;
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
	public StatusObservation createStatusObservation() {
		StatusObservationImpl statusObservation = new StatusObservationImpl();
		return statusObservation;
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
