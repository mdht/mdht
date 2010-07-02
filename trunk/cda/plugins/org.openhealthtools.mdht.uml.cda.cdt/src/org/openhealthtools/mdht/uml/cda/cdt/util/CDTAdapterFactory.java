/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.PlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.hl7.rim.RIMAct;
import org.openhealthtools.mdht.uml.hl7.rim.RIMInfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTPackage
 * @generated
 */
public class CDTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CDTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDTSwitch<Adapter> modelSwitch =
		new CDTSwitch<Adapter>() {
			@Override
			public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
				return createGeneralHeaderConstraintsAdapter();
			}
			@Override
			public Adapter caseHistoryAndPhysical(HistoryAndPhysical object) {
				return createHistoryAndPhysicalAdapter();
			}
			@Override
			public Adapter caseConsultationNote(ConsultationNote object) {
				return createConsultationNoteAdapter();
			}
			@Override
			public Adapter caseReasonForReferralSection(ReasonForReferralSection object) {
				return createReasonForReferralSectionAdapter();
			}
			@Override
			public Adapter caseReasonForVisitSectionConsult(ReasonForVisitSectionConsult object) {
				return createReasonForVisitSectionConsultAdapter();
			}
			@Override
			public Adapter caseLevelOneConformance(LevelOneConformance object) {
				return createLevelOneConformanceAdapter();
			}
			@Override
			public Adapter caseLevelTwoConformance(LevelTwoConformance object) {
				return createLevelTwoConformanceAdapter();
			}
			@Override
			public Adapter caseLevelThreeConformance(LevelThreeConformance object) {
				return createLevelThreeConformanceAdapter();
			}
			@Override
			public Adapter casePhysicalExaminationSection(PhysicalExaminationSection object) {
				return createPhysicalExaminationSectionAdapter();
			}
			@Override
			public Adapter casePastMedicalHistorySection(PastMedicalHistorySection object) {
				return createPastMedicalHistorySectionAdapter();
			}
			@Override
			public Adapter caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
				return createReviewOfSystemsSectionAdapter();
			}
			@Override
			public Adapter caseGeneralStatusSection(GeneralStatusSection object) {
				return createGeneralStatusSectionAdapter();
			}
			@Override
			public Adapter caseDiagnosticFindings(DiagnosticFindings object) {
				return createDiagnosticFindingsAdapter();
			}
			@Override
			public Adapter caseVitalSignsSection(VitalSignsSection object) {
				return createVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentSection(AssessmentSection object) {
				return createAssessmentSectionAdapter();
			}
			@Override
			public Adapter casePlanSection(PlanSection object) {
				return createPlanSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
				return createAssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter caseReasonForVisitSection(ReasonForVisitSection object) {
				return createReasonForVisitSectionAdapter();
			}
			@Override
			public Adapter caseChiefComplaintSection(ChiefComplaintSection object) {
				return createChiefComplaintSectionAdapter();
			}
			@Override
			public Adapter caseReasonForVisitAndChiefComplaintSection(ReasonForVisitAndChiefComplaintSection object) {
				return createReasonForVisitAndChiefComplaintSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
				return createHistoryOfPresentIllnessAdapter();
			}
			@Override
			public Adapter casePastMedicalHistorySectionConsult(PastMedicalHistorySectionConsult object) {
				return createPastMedicalHistorySectionConsultAdapter();
			}
			@Override
			public Adapter caseCDTRegistryDelegate(CDTRegistryDelegate object) {
				return createCDTRegistryDelegateAdapter();
			}
			@Override
			public Adapter caseRIMInfrastructureRoot(RIMInfrastructureRoot object) {
				return createRIMInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseRIMAct(RIMAct object) {
				return createRIMActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseResultsSection(ResultsSection object) {
				return createResultsSectionAdapter();
			}
			@Override
			public Adapter caseIHE_HistoryOfPresentIllness(org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness object) {
				return createIHE_HistoryOfPresentIllnessAdapter();
			}
			@Override
			public Adapter caseRegistryDelegate(RegistryDelegate object) {
				return createRegistryDelegateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical <em>History And Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical
	 * @generated
	 */
	public Adapter createHistoryAndPhysicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote <em>Consultation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote
	 * @generated
	 */
	public Adapter createConsultationNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance <em>Level Three Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance
	 * @generated
	 */
	public Adapter createLevelThreeConformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult <em>Reason For Visit Section Consult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult
	 * @generated
	 */
	public Adapter createReasonForVisitSectionConsultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection <em>Reason For Visit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection
	 * @generated
	 */
	public Adapter createReasonForVisitSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection <em>Reason For Visit And Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection
	 * @generated
	 */
	public Adapter createReasonForVisitAndChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult <em>Past Medical History Section Consult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult
	 * @generated
	 */
	public Adapter createPastMedicalHistorySectionConsultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance <em>Level One Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance
	 * @generated
	 */
	public Adapter createLevelOneConformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance <em>Level Two Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance
	 * @generated
	 */
	public Adapter createLevelTwoConformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection <em>Physical Examination Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection
	 * @generated
	 */
	public Adapter createPhysicalExaminationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection <em>Past Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection
	 * @generated
	 */
	public Adapter createPastMedicalHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection <em>General Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection
	 * @generated
	 */
	public Adapter createGeneralStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings <em>Diagnostic Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings
	 * @generated
	 */
	public Adapter createDiagnosticFindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection <em>Assessment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection
	 * @generated
	 */
	public Adapter createAssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.PlanSection <em>Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.PlanSection
	 * @generated
	 */
	public Adapter createPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate <em>Registry Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate
	 * @generated
	 */
	public Adapter createCDTRegistryDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMInfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMInfrastructureRoot
	 * @generated
	 */
	public Adapter createRIMInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.RIMAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMAct
	 * @generated
	 */
	public Adapter createRIMActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultsSection
	 * @generated
	 */
	public Adapter createResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createIHE_HistoryOfPresentIllnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.RegistryDelegate <em>Registry Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.RegistryDelegate
	 * @generated
	 */
	public Adapter createRegistryDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CDTAdapterFactory
