/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.*;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IHEFactoryImpl extends EFactoryImpl implements IHEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IHEFactory init() {
		try {
			IHEFactory theIHEFactory = (IHEFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe"); 
			if (theIHEFactory != null) {
				return theIHEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IHEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEFactoryImpl() {
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
			case IHEPackage.IMMUNIZATIONS_SECTION: return createImmunizationsSection();
			case IHEPackage.MEDICATIONS_ADMINISTERED_SECTION: return createMedicationsAdministeredSection();
			case IHEPackage.CONCERN_ENTRY: return createConcernEntry();
			case IHEPackage.MEDICAL_DOCUMENT: return createMedicalDocument();
			case IHEPackage.ACTIVE_PROBLEMS_SECTION: return createActiveProblemsSection();
			case IHEPackage.PROBLEM_CONCERN_ENTRY: return createProblemConcernEntry();
			case IHEPackage.PROBLEM_ENTRY: return createProblemEntry();
			case IHEPackage.MEDICATION: return createMedication();
			case IHEPackage.MEDICATIONS_SECTION: return createMedicationsSection();
			case IHEPackage.ALLERGY_INTOLERANCE_CONCERN: return createAllergyIntoleranceConcern();
			case IHEPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case IHEPackage.ALLERGIES_REACTIONS_SECTION: return createAllergiesReactionsSection();
			case IHEPackage.NORMAL_DOSING: return createNormalDosing();
			case IHEPackage.TAPERED_DOSE: return createTaperedDose();
			case IHEPackage.SPLIT_DOSING: return createSplitDosing();
			case IHEPackage.CONDITIONAL_DOSING: return createConditionalDosing();
			case IHEPackage.COMBINATION_MEDICATION: return createCombinationMedication();
			case IHEPackage.VITAL_SIGNS_SECTION: return createVitalSignsSection();
			case IHEPackage.CODED_VITAL_SIGNS_SECTION: return createCodedVitalSignsSection();
			case IHEPackage.VITAL_SIGN_OBSERVATION: return createVitalSignObservation();
			case IHEPackage.VITAL_SIGNS_ORGANIZER: return createVitalSignsOrganizer();
			case IHEPackage.PAYERS_SECTION: return createPayersSection();
			case IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION: return createHistoryOfPastIllnessSection();
			case IHEPackage.CHIEF_COMPLAINT_SECTION: return createChiefComplaintSection();
			case IHEPackage.REASON_FOR_REFERRAL_SECTION: return createReasonForReferralSection();
			case IHEPackage.HISTORY_OF_PRESENT_ILLNESS: return createHistoryOfPresentIllness();
			case IHEPackage.SURGERIES_SECTION: return createSurgeriesSection();
			case IHEPackage.CODED_SURGERIES_SECTION: return createCodedSurgeriesSection();
			case IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: return createHospitalAdmissionDiagnosisSection();
			case IHEPackage.DISCHARGE_DIAGNOSIS_SECTION: return createDischargeDiagnosisSection();
			case IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION: return createAdmissionMedicationHistorySection();
			case IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: return createHospitalDischargeMedicationsSection();
			case IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION: return createCodedAdvanceDirectivesSection();
			case IHEPackage.ADVANCE_DIRECTIVES_SECTION: return createAdvanceDirectivesSection();
			case IHEPackage.PHYSICAL_EXAM_NARRATIVE_SECTION: return createPhysicalExamNarrativeSection();
			case IHEPackage.PHYSICAL_EXAM_SECTION: return createPhysicalExamSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public MedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernEntry createConcernEntry() {
		ConcernEntryImpl concernEntry = new ConcernEntryImpl();
		return concernEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalDocument createMedicalDocument() {
		MedicalDocumentImpl medicalDocument = new MedicalDocumentImpl();
		return medicalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveProblemsSection createActiveProblemsSection() {
		ActiveProblemsSectionImpl activeProblemsSection = new ActiveProblemsSectionImpl();
		return activeProblemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernEntry createProblemConcernEntry() {
		ProblemConcernEntryImpl problemConcernEntry = new ProblemConcernEntryImpl();
		return problemConcernEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry createProblemEntry() {
		ProblemEntryImpl problemEntry = new ProblemEntryImpl();
		return problemEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
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
	public AllergyIntoleranceConcern createAllergyIntoleranceConcern() {
		AllergyIntoleranceConcernImpl allergyIntoleranceConcern = new AllergyIntoleranceConcernImpl();
		return allergyIntoleranceConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection createAllergiesReactionsSection() {
		AllergiesReactionsSectionImpl allergiesReactionsSection = new AllergiesReactionsSectionImpl();
		return allergiesReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDosing createNormalDosing() {
		NormalDosingImpl normalDosing = new NormalDosingImpl();
		return normalDosing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaperedDose createTaperedDose() {
		TaperedDoseImpl taperedDose = new TaperedDoseImpl();
		return taperedDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitDosing createSplitDosing() {
		SplitDosingImpl splitDosing = new SplitDosingImpl();
		return splitDosing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDosing createConditionalDosing() {
		ConditionalDosingImpl conditionalDosing = new ConditionalDosingImpl();
		return conditionalDosing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationMedication createCombinationMedication() {
		CombinationMedicationImpl combinationMedication = new CombinationMedicationImpl();
		return combinationMedication;
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
	public CodedVitalSignsSection createCodedVitalSignsSection() {
		CodedVitalSignsSectionImpl codedVitalSignsSection = new CodedVitalSignsSectionImpl();
		return codedVitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignObservation createVitalSignObservation() {
		VitalSignObservationImpl vitalSignObservation = new VitalSignObservationImpl();
		return vitalSignObservation;
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
	public PayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllness createHistoryOfPresentIllness() {
		HistoryOfPresentIllnessImpl historyOfPresentIllness = new HistoryOfPresentIllnessImpl();
		return historyOfPresentIllness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodedSurgeriesSection createCodedSurgeriesSection() {
		CodedSurgeriesSectionImpl codedSurgeriesSection = new CodedSurgeriesSectionImpl();
		return codedSurgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection createDischargeDiagnosisSection() {
		DischargeDiagnosisSectionImpl dischargeDiagnosisSection = new DischargeDiagnosisSectionImpl();
		return dischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedicationHistorySection createAdmissionMedicationHistorySection() {
		AdmissionMedicationHistorySectionImpl admissionMedicationHistorySection = new AdmissionMedicationHistorySectionImpl();
		return admissionMedicationHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodedAdvanceDirectivesSection createCodedAdvanceDirectivesSection() {
		CodedAdvanceDirectivesSectionImpl codedAdvanceDirectivesSection = new CodedAdvanceDirectivesSectionImpl();
		return codedAdvanceDirectivesSection;
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
	public PhysicalExamNarrativeSection createPhysicalExamNarrativeSection() {
		PhysicalExamNarrativeSectionImpl physicalExamNarrativeSection = new PhysicalExamNarrativeSectionImpl();
		return physicalExamNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEPackage getIHEPackage() {
		return (IHEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IHEPackage getPackage() {
		return IHEPackage.eINSTANCE;
	}

} //IHEFactoryImpl
