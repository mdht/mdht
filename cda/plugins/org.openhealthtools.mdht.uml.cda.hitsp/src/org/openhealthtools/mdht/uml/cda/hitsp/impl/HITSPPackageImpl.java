/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HITSPPackageImpl extends EPackageImpl implements HITSPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyDrugSensitivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesReactionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemListSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPastIllnessSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForReferralSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPresentIllnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surgeriesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionMedicationHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExamSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewOfSystemsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalCourseSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticResultsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAndPlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalEquipmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEntryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HITSPPackageImpl() {
		super(eNS_URI, HITSPFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HITSPPackage init() {
		if (isInited) return (HITSPPackage)EPackage.Registry.INSTANCE.getEPackage(HITSPPackage.eNS_URI);

		// Obtain or create and register package
		HITSPPackageImpl theHITSPPackage = (HITSPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof HITSPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new HITSPPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IHEPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHITSPPackage.createPackageContents();

		// Initialize created meta-data
		theHITSPPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHITSPPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HITSPValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHITSPPackage.freeze();

		return theHITSPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyDrugSensitivity() {
		return allergyDrugSensitivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientSummary() {
		return patientSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSign() {
		return vitalSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesReactionsSection() {
		return allergiesReactionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemListSection() {
		return problemListSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPastIllnessSection() {
		return historyOfPastIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintSection() {
		return chiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForReferralSection() {
		return reasonForReferralSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPresentIllness() {
		return historyOfPresentIllnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurgeriesSection() {
		return surgeriesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusSection() {
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosisSection() {
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiagnosisSection() {
		return dischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmissionMedicationHistorySection() {
		return admissionMedicationHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSection() {
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExamSection() {
		return physicalExamSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewOfSystemsSection() {
		return reviewOfSystemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalCourseSection() {
		return hospitalCourseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticResultsSection() {
		return diagnosticResultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSection() {
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection() {
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSection() {
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalEquipmentSection() {
		return medicalEquipmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEntry() {
		return conditionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HITSPFactory getHITSPFactory() {
		return (HITSPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allergyDrugSensitivityEClass = createEClass(ALLERGY_DRUG_SENSITIVITY);

		medicationEClass = createEClass(MEDICATION);

		conditionEClass = createEClass(CONDITION);

		conditionEntryEClass = createEClass(CONDITION_ENTRY);

		patientSummaryEClass = createEClass(PATIENT_SUMMARY);

		problemListSectionEClass = createEClass(PROBLEM_LIST_SECTION);

		medicationsSectionEClass = createEClass(MEDICATIONS_SECTION);

		vitalSignsSectionEClass = createEClass(VITAL_SIGNS_SECTION);

		vitalSignEClass = createEClass(VITAL_SIGN);

		payersSectionEClass = createEClass(PAYERS_SECTION);

		allergiesReactionsSectionEClass = createEClass(ALLERGIES_REACTIONS_SECTION);

		historyOfPastIllnessSectionEClass = createEClass(HISTORY_OF_PAST_ILLNESS_SECTION);

		chiefComplaintSectionEClass = createEClass(CHIEF_COMPLAINT_SECTION);

		reasonForReferralSectionEClass = createEClass(REASON_FOR_REFERRAL_SECTION);

		historyOfPresentIllnessEClass = createEClass(HISTORY_OF_PRESENT_ILLNESS);

		surgeriesSectionEClass = createEClass(SURGERIES_SECTION);

		functionalStatusSectionEClass = createEClass(FUNCTIONAL_STATUS_SECTION);

		hospitalAdmissionDiagnosisSectionEClass = createEClass(HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);

		dischargeDiagnosisSectionEClass = createEClass(DISCHARGE_DIAGNOSIS_SECTION);

		admissionMedicationHistorySectionEClass = createEClass(ADMISSION_MEDICATION_HISTORY_SECTION);

		hospitalDischargeMedicationsSectionEClass = createEClass(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);

		medicationsAdministeredSectionEClass = createEClass(MEDICATIONS_ADMINISTERED_SECTION);

		advanceDirectivesSectionEClass = createEClass(ADVANCE_DIRECTIVES_SECTION);

		immunizationsSectionEClass = createEClass(IMMUNIZATIONS_SECTION);

		physicalExamSectionEClass = createEClass(PHYSICAL_EXAM_SECTION);

		reviewOfSystemsSectionEClass = createEClass(REVIEW_OF_SYSTEMS_SECTION);

		hospitalCourseSectionEClass = createEClass(HOSPITAL_COURSE_SECTION);

		diagnosticResultsSectionEClass = createEClass(DIAGNOSTIC_RESULTS_SECTION);

		assessmentAndPlanSectionEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION);

		planOfCareSectionEClass = createEClass(PLAN_OF_CARE_SECTION);

		familyHistorySectionEClass = createEClass(FAMILY_HISTORY_SECTION);

		socialHistorySectionEClass = createEClass(SOCIAL_HISTORY_SECTION);

		encountersSectionEClass = createEClass(ENCOUNTERS_SECTION);

		medicalEquipmentSectionEClass = createEClass(MEDICAL_EQUIPMENT_SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IHEPackage theIHEPackage = (IHEPackage)EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI);
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
		CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allergyDrugSensitivityEClass.getESuperTypes().add(theIHEPackage.getAllergyIntoleranceConcern());
		medicationEClass.getESuperTypes().add(theIHEPackage.getMedication());
		conditionEClass.getESuperTypes().add(theIHEPackage.getProblemConcernEntry());
		conditionEntryEClass.getESuperTypes().add(theIHEPackage.getProblemEntry());
		patientSummaryEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		problemListSectionEClass.getESuperTypes().add(theIHEPackage.getActiveProblemsSection());
		medicationsSectionEClass.getESuperTypes().add(theIHEPackage.getMedicationsSection());
		vitalSignsSectionEClass.getESuperTypes().add(theIHEPackage.getCodedVitalSignsSection());
		vitalSignEClass.getESuperTypes().add(theIHEPackage.getVitalSignObservation());
		payersSectionEClass.getESuperTypes().add(theIHEPackage.getPayersSection());
		allergiesReactionsSectionEClass.getESuperTypes().add(theIHEPackage.getAllergiesReactionsSection());
		historyOfPastIllnessSectionEClass.getESuperTypes().add(theIHEPackage.getHistoryOfPastIllnessSection());
		chiefComplaintSectionEClass.getESuperTypes().add(theIHEPackage.getChiefComplaintSection());
		reasonForReferralSectionEClass.getESuperTypes().add(theIHEPackage.getReasonForReferralSection());
		historyOfPresentIllnessEClass.getESuperTypes().add(theIHEPackage.getHistoryOfPresentIllness());
		surgeriesSectionEClass.getESuperTypes().add(theIHEPackage.getCodedSurgeriesSection());
		functionalStatusSectionEClass.getESuperTypes().add(theCCDPackage.getFunctionalStatusSection());
		hospitalAdmissionDiagnosisSectionEClass.getESuperTypes().add(theIHEPackage.getHospitalAdmissionDiagnosisSection());
		dischargeDiagnosisSectionEClass.getESuperTypes().add(theIHEPackage.getDischargeDiagnosisSection());
		admissionMedicationHistorySectionEClass.getESuperTypes().add(theIHEPackage.getAdmissionMedicationHistorySection());
		hospitalDischargeMedicationsSectionEClass.getESuperTypes().add(theIHEPackage.getHospitalDischargeMedicationsSection());
		medicationsAdministeredSectionEClass.getESuperTypes().add(theIHEPackage.getMedicationsAdministeredSection());
		advanceDirectivesSectionEClass.getESuperTypes().add(theIHEPackage.getCodedAdvanceDirectivesSection());
		immunizationsSectionEClass.getESuperTypes().add(theIHEPackage.getImmunizationsSection());
		physicalExamSectionEClass.getESuperTypes().add(theIHEPackage.getPhysicalExamSection());
		reviewOfSystemsSectionEClass.getESuperTypes().add(theIHEPackage.getReviewOfSystemsSection());
		hospitalCourseSectionEClass.getESuperTypes().add(theIHEPackage.getHospitalCourseSection());
		diagnosticResultsSectionEClass.getESuperTypes().add(theIHEPackage.getCodedResultsSection());
		assessmentAndPlanSectionEClass.getESuperTypes().add(theIHEPackage.getAssessmentAndPlanSection());
		planOfCareSectionEClass.getESuperTypes().add(theIHEPackage.getCarePlanSection());
		familyHistorySectionEClass.getESuperTypes().add(theIHEPackage.getFamilyMedicalHistorySection());
		socialHistorySectionEClass.getESuperTypes().add(theIHEPackage.getSocialHistorySection());
		encountersSectionEClass.getESuperTypes().add(theIHEPackage.getEncounterHistorySection());
		medicalEquipmentSectionEClass.getESuperTypes().add(theIHEPackage.getMedicalDevicesSection());

		// Initialize classes and features; add operations and parameters
		initEClass(allergyDrugSensitivityEClass, AllergyDrugSensitivity.class, "AllergyDrugSensitivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(allergyDrugSensitivityEClass, ecorePackage.getEBoolean(), "validateAllergyDrugSensitivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationEClass, Medication.class, "Medication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationEClass, ecorePackage.getEBoolean(), "validateHITSPMedicationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(conditionEClass, ecorePackage.getEBoolean(), "validateConditionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conditionEClass, ecorePackage.getEBoolean(), "validateConditionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conditionEClass, ecorePackage.getEBoolean(), "validateConditionConditionEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conditionEClass, this.getConditionEntry(), "createConditionEntry", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(conditionEntryEClass, ConditionEntry.class, "ConditionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(conditionEntryEClass, ecorePackage.getEBoolean(), "validateConditionEntryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conditionEntryEClass, ecorePackage.getEBoolean(), "validateConditionEntryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conditionEntryEClass, ecorePackage.getEBoolean(), "validateConditionEntryEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(patientSummaryEClass, PatientSummary.class, "PatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(patientSummaryEClass, ecorePackage.getEBoolean(), "validatePatientSummaryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(patientSummaryEClass, this.getProblemListSection(), "createProblemListSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(patientSummaryEClass, this.getMedicationsSection(), "createMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(problemListSectionEClass, ProblemListSection.class, "ProblemListSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemListSectionEClass, ecorePackage.getEBoolean(), "validateProblemListSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemListSectionEClass, ecorePackage.getEBoolean(), "validateProblemListSectionCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationsSectionEClass, MedicationsSection.class, "MedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPMedicationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsSectionEClass, VitalSignsSection.class, "VitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPVitalSignsSectionVitalSigns", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignEClass, VitalSign.class, "VitalSign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignEClass, ecorePackage.getEBoolean(), "validateVitalSignTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignEClass, ecorePackage.getEBoolean(), "validateVitalSignCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(payersSectionEClass, PayersSection.class, "PayersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validateHITSPPayersSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergiesReactionsSectionEClass, AllergiesReactionsSection.class, "AllergiesReactionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergiesReactionsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPAllergiesReactionsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyOfPastIllnessSectionEClass, HistoryOfPastIllnessSection.class, "HistoryOfPastIllnessSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyOfPastIllnessSectionEClass, ecorePackage.getEBoolean(), "validateHITSPHistoryOfPastIllnessSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chiefComplaintSectionEClass, ChiefComplaintSection.class, "ChiefComplaintSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(chiefComplaintSectionEClass, ecorePackage.getEBoolean(), "validateHITSPChiefComplaintSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reasonForReferralSectionEClass, ReasonForReferralSection.class, "ReasonForReferralSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonForReferralSectionEClass, ecorePackage.getEBoolean(), "validateHITSPReasonForReferralSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyOfPresentIllnessEClass, HistoryOfPresentIllness.class, "HistoryOfPresentIllness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyOfPresentIllnessEClass, ecorePackage.getEBoolean(), "validateHITSPHistoryOfPresentIllnessTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(surgeriesSectionEClass, SurgeriesSection.class, "SurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(surgeriesSectionEClass, ecorePackage.getEBoolean(), "validateHITSPSurgeriesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functionalStatusSectionEClass, FunctionalStatusSection.class, "FunctionalStatusSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateHITSPFunctionalStatusSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalAdmissionDiagnosisSectionEClass, HospitalAdmissionDiagnosisSection.class, "HospitalAdmissionDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalAdmissionDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateHITSPHospitalAdmissionDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dischargeDiagnosisSectionEClass, DischargeDiagnosisSection.class, "DischargeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dischargeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateHITSPDischargeDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(admissionMedicationHistorySectionEClass, AdmissionMedicationHistorySection.class, "AdmissionMedicationHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(admissionMedicationHistorySectionEClass, ecorePackage.getEBoolean(), "validateHITSPAdmissionMedicationHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalDischargeMedicationsSectionEClass, HospitalDischargeMedicationsSection.class, "HospitalDischargeMedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalDischargeMedicationsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPHospitalDischargeMedicationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationsAdministeredSectionEClass, MedicationsAdministeredSection.class, "MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateHITSPMedicationsAdministeredSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(advanceDirectivesSectionEClass, AdvanceDirectivesSection.class, "AdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(advanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateHITSPAdvanceDirectivesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(immunizationsSectionEClass, ImmunizationsSection.class, "ImmunizationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPImmunizationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalExamSectionEClass, PhysicalExamSection.class, "PhysicalExamSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(physicalExamSectionEClass, ecorePackage.getEBoolean(), "validateHITSPPhysicalExamSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reviewOfSystemsSectionEClass, ReviewOfSystemsSection.class, "ReviewOfSystemsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reviewOfSystemsSectionEClass, ecorePackage.getEBoolean(), "validateHITSPReviewOfSystemsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalCourseSectionEClass, HospitalCourseSection.class, "HospitalCourseSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalCourseSectionEClass, ecorePackage.getEBoolean(), "validateHITSPHospitalCourseSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diagnosticResultsSectionEClass, DiagnosticResultsSection.class, "DiagnosticResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(diagnosticResultsSectionEClass, ecorePackage.getEBoolean(), "validateDiagnosticResultsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assessmentAndPlanSectionEClass, AssessmentAndPlanSection.class, "AssessmentAndPlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assessmentAndPlanSectionEClass, ecorePackage.getEBoolean(), "validateHITSPAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareSectionEClass, PlanOfCareSection.class, "PlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validateHITSPPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(familyHistorySectionEClass, FamilyHistorySection.class, "FamilyHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(familyHistorySectionEClass, ecorePackage.getEBoolean(), "validateHITSPFamilyHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(socialHistorySectionEClass, SocialHistorySection.class, "SocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateHITSPSocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encountersSectionEClass, EncountersSection.class, "EncountersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encountersSectionEClass, ecorePackage.getEBoolean(), "validateHITSPEncountersSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicalEquipmentSectionEClass, MedicalEquipmentSection.class, "MedicalEquipmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicalEquipmentSectionEClass, ecorePackage.getEBoolean(), "validateHITSPMedicalEquipmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// uml2.alias
		createUml2Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";			
		addAnnotation
		  (allergyDrugSensitivityEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AllergyDrugSensitivityTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.6"
		   });							
		addAnnotation
		  (medicationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.8",
			 "constraints.validation.error", "HITSPMedicationTemplateId"
		   });						
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.7",
			 "constraints.validation.error", "ConditionTemplateId ConditionText ConditionConditionEntry"
		   });														
		addAnnotation
		  (conditionEntryEClass, 
		   source, 
		   new String[] {
			 "value.codeSystemName", "Problem Value Set",
			 "code.codeSystemName", "Problem Type Value Set",
			 "value.codeSystem", "2.16.840.1.113883.3.88.12.3221.7.4",
			 "constraints.validation.error", "ConditionEntryCode ConditionEntryValue",
			 "code.codeSystem", "2.16.840.1.113883.3.88.12.3221.7.2",
			 "constraints.validation.warning", "ConditionEntryEffectiveTime"
		   });															
		addAnnotation
		  (patientSummaryEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.3.88.11.32.1",
			 "constraints.validation.error", "PatientSummaryTemplateId"
		   });							
		addAnnotation
		  (problemListSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.103",
			 "constraints.validation.error", "ProblemListSectionTemplateId ProblemListSectionCondition"
		   });											
		addAnnotation
		  (medicationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPMedicationsSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.112"
		   });							
		addAnnotation
		  (vitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.119",
			 "constraints.validation.error", "HITSPVitalSignsSectionTemplateId HITSPVitalSignsSectionVitalSigns"
		   });										
		addAnnotation
		  (vitalSignEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "VitalSignTemplateId VitalSignCode",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.14"
		   });											
		addAnnotation
		  (payersSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPPayersSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.101"
		   });							
		addAnnotation
		  (allergiesReactionsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPAllergiesReactionsSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.102"
		   });							
		addAnnotation
		  (historyOfPastIllnessSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPHistoryOfPastIllnessSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.104"
		   });							
		addAnnotation
		  (chiefComplaintSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPChiefComplaintSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.105"
		   });							
		addAnnotation
		  (reasonForReferralSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPReasonForReferralSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.106"
		   });							
		addAnnotation
		  (historyOfPresentIllnessEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPHistoryOfPresentIllnessTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.107"
		   });						
		addAnnotation
		  (surgeriesSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.108",
			 "constraints.validation.error", "HITSPSurgeriesSectionTemplateId"
		   });							
		addAnnotation
		  (functionalStatusSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPFunctionalStatusSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.109"
		   });							
		addAnnotation
		  (hospitalAdmissionDiagnosisSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPHospitalAdmissionDiagnosisSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.110"
		   });							
		addAnnotation
		  (dischargeDiagnosisSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPDischargeDiagnosisSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.111"
		   });							
		addAnnotation
		  (admissionMedicationHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPAdmissionMedicationHistorySectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.113"
		   });							
		addAnnotation
		  (hospitalDischargeMedicationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPHospitalDischargeMedicationsSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.114"
		   });							
		addAnnotation
		  (medicationsAdministeredSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPMedicationsAdministeredSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.115"
		   });							
		addAnnotation
		  (advanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPAdvanceDirectivesSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.116"
		   });							
		addAnnotation
		  (immunizationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPImmunizationsSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.117"
		   });							
		addAnnotation
		  (physicalExamSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPPhysicalExamSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.118"
		   });							
		addAnnotation
		  (reviewOfSystemsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPReviewOfSystemsSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.120"
		   });							
		addAnnotation
		  (hospitalCourseSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPHospitalCourseSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.121"
		   });							
		addAnnotation
		  (diagnosticResultsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "DiagnosticResultsSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.122"
		   });							
		addAnnotation
		  (assessmentAndPlanSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPAssessmentAndPlanSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.123"
		   });							
		addAnnotation
		  (planOfCareSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPPlanOfCareSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.124"
		   });							
		addAnnotation
		  (familyHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPFamilyHistorySectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.125"
		   });							
		addAnnotation
		  (socialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPSocialHistorySectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.126"
		   });							
		addAnnotation
		  (encountersSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPEncountersSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.127"
		   });							
		addAnnotation
		  (medicalEquipmentSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HITSPMedicalEquipmentSectionTemplateId",
			 "templateId.root", "2.16.840.1.113883.3.88.11.83.128"
		   });				
	}

	/**
	 * Initializes the annotations for <b>uml2.alias</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUml2Annotations() {
		String source = "uml2.alias";				
		addAnnotation
		  (allergyDrugSensitivityEClass, 
		   source, 
		   new String[] {
			 "Allergies and Drug Sensitivities", null,
			 "Allergy and Drug Sensitivity", null
		   });																																																																																																																																																																																																																																	
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";																																								
		addAnnotation
		  (patientSummaryEClass, 
		   source, 
		   new String[] {
			 "name", "ClinicalDocument"
		   });																																																																																																																																																																																													
	}

} //HITSPPackageImpl
