/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.cdt.*;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.PlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.ProgressNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDTFactoryImpl extends EFactoryImpl implements CDTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDTFactory init() {
		try {
			CDTFactory theCDTFactory = (CDTFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/cdt"); 
			if (theCDTFactory != null) {
				return theCDTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTFactoryImpl() {
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
			case CDTPackage.GENERAL_HEADER_CONSTRAINTS: return createGeneralHeaderConstraints();
			case CDTPackage.HISTORY_AND_PHYSICAL: return createHistoryAndPhysical();
			case CDTPackage.HISTORY_OF_PRESENT_ILLNESS: return createHistoryOfPresentIllness();
			case CDTPackage.PAST_MEDICAL_HISTORY_SECTION: return createPastMedicalHistorySection();
			case CDTPackage.REVIEW_OF_SYSTEMS_SECTION_IHE: return createReviewOfSystemsSectionIHE();
			case CDTPackage.PHYSICAL_EXAMINATION_SECTION: return createPhysicalExaminationSection();
			case CDTPackage.VITAL_SIGNS_SECTION: return createVitalSignsSection();
			case CDTPackage.GENERAL_STATUS_SECTION: return createGeneralStatusSection();
			case CDTPackage.CONSULTATION_NOTE: return createConsultationNote();
			case CDTPackage.PAST_MEDICAL_HISTORY_SECTION_CONSULT: return createPastMedicalHistorySectionConsult();
			case CDTPackage.REVIEW_OF_SYSTEMS_SECTION: return createReviewOfSystemsSection();
			case CDTPackage.REASON_FOR_REFERRAL_SECTION: return createReasonForReferralSection();
			case CDTPackage.REASON_FOR_VISIT_SECTION_CONSULT: return createReasonForVisitSectionConsult();
			case CDTPackage.LEVEL_ONE_CONFORMANCE: return createLevelOneConformance();
			case CDTPackage.LEVEL_TWO_CONFORMANCE: return createLevelTwoConformance();
			case CDTPackage.LEVEL_THREE_CONFORMANCE: return createLevelThreeConformance();
			case CDTPackage.DIAGNOSTIC_FINDINGS: return createDiagnosticFindings();
			case CDTPackage.ASSESSMENT_SECTION: return createAssessmentSection();
			case CDTPackage.PLAN_SECTION: return createPlanSection();
			case CDTPackage.ASSESSMENT_AND_PLAN_SECTION: return createAssessmentAndPlanSection();
			case CDTPackage.REASON_FOR_VISIT_SECTION: return createReasonForVisitSection();
			case CDTPackage.CHIEF_COMPLAINT_SECTION: return createChiefComplaintSection();
			case CDTPackage.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION: return createReasonForVisitAndChiefComplaintSection();
			case CDTPackage.PROGRESS_NOTE: return createProgressNote();
			case CDTPackage.ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE: return createAssessmentAndPlanSectionProcNote();
			case CDTPackage.ASSESSMENT_SECTION_PROC_NOTE: return createAssessmentSectionProcNote();
			case CDTPackage.CHIEF_COMPLAINT_SECTION_PROC_NOTE: return createChiefComplaintSectionProcNote();
			case CDTPackage.OBJECTIVE_SECTION: return createObjectiveSection();
			case CDTPackage.SUBJECTIVE_SECTION: return createSubjectiveSection();
			case CDTPackage.CDT_REGISTRY_DELEGATE: return createCDTRegistryDelegate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysical createHistoryAndPhysical() {
		HistoryAndPhysicalImpl historyAndPhysical = new HistoryAndPhysicalImpl();
		return historyAndPhysical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationNote createConsultationNote() {
		ConsultationNoteImpl consultationNote = new ConsultationNoteImpl();
		return consultationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelThreeConformance createLevelThreeConformance() {
		LevelThreeConformanceImpl levelThreeConformance = new LevelThreeConformanceImpl();
		return levelThreeConformance;
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
	public ReasonForVisitSectionConsult createReasonForVisitSectionConsult() {
		ReasonForVisitSectionConsultImpl reasonForVisitSectionConsult = new ReasonForVisitSectionConsultImpl();
		return reasonForVisitSectionConsult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection createReasonForVisitSection() {
		ReasonForVisitSectionImpl reasonForVisitSection = new ReasonForVisitSectionImpl();
		return reasonForVisitSection;
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
	public ReasonForVisitAndChiefComplaintSection createReasonForVisitAndChiefComplaintSection() {
		ReasonForVisitAndChiefComplaintSectionImpl reasonForVisitAndChiefComplaintSection = new ReasonForVisitAndChiefComplaintSectionImpl();
		return reasonForVisitAndChiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote createProgressNote() {
		ProgressNoteImpl progressNote = new ProgressNoteImpl();
		return progressNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSectionProcNote createAssessmentAndPlanSectionProcNote() {
		AssessmentAndPlanSectionProcNoteImpl assessmentAndPlanSectionProcNote = new AssessmentAndPlanSectionProcNoteImpl();
		return assessmentAndPlanSectionProcNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSectionProcNote createAssessmentSectionProcNote() {
		AssessmentSectionProcNoteImpl assessmentSectionProcNote = new AssessmentSectionProcNoteImpl();
		return assessmentSectionProcNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSectionProcNote createChiefComplaintSectionProcNote() {
		ChiefComplaintSectionProcNoteImpl chiefComplaintSectionProcNote = new ChiefComplaintSectionProcNoteImpl();
		return chiefComplaintSectionProcNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection createObjectiveSection() {
		ObjectiveSectionImpl objectiveSection = new ObjectiveSectionImpl();
		return objectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveSection createSubjectiveSection() {
		SubjectiveSectionImpl subjectiveSection = new SubjectiveSectionImpl();
		return subjectiveSection;
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
	public PastMedicalHistorySectionConsult createPastMedicalHistorySectionConsult() {
		PastMedicalHistorySectionConsultImpl pastMedicalHistorySectionConsult = new PastMedicalHistorySectionConsultImpl();
		return pastMedicalHistorySectionConsult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOneConformance createLevelOneConformance() {
		LevelOneConformanceImpl levelOneConformance = new LevelOneConformanceImpl();
		return levelOneConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelTwoConformance createLevelTwoConformance() {
		LevelTwoConformanceImpl levelTwoConformance = new LevelTwoConformanceImpl();
		return levelTwoConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExaminationSection createPhysicalExaminationSection() {
		PhysicalExaminationSectionImpl physicalExaminationSection = new PhysicalExaminationSectionImpl();
		return physicalExaminationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastMedicalHistorySection createPastMedicalHistorySection() {
		PastMedicalHistorySectionImpl pastMedicalHistorySection = new PastMedicalHistorySectionImpl();
		return pastMedicalHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSectionIHE createReviewOfSystemsSectionIHE() {
		ReviewOfSystemsSectionIHEImpl reviewOfSystemsSectionIHE = new ReviewOfSystemsSectionIHEImpl();
		return reviewOfSystemsSectionIHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection createGeneralStatusSection() {
		GeneralStatusSectionImpl generalStatusSection = new GeneralStatusSectionImpl();
		return generalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticFindings createDiagnosticFindings() {
		DiagnosticFindingsImpl diagnosticFindings = new DiagnosticFindingsImpl();
		return diagnosticFindings;
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
	public AssessmentSection createAssessmentSection() {
		AssessmentSectionImpl assessmentSection = new AssessmentSectionImpl();
		return assessmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanSection createPlanSection() {
		PlanSectionImpl planSection = new PlanSectionImpl();
		return planSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRegistryDelegate createCDTRegistryDelegate() {
		CDTRegistryDelegateImpl cdtRegistryDelegate = new CDTRegistryDelegateImpl();
		return cdtRegistryDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTPackage getCDTPackage() {
		return (CDTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDTPackage getPackage() {
		return CDTPackage.eINSTANCE;
	}

} //CDTFactoryImpl
