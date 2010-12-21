/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
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
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDTPackageImpl extends EPackageImpl implements CDTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyAndPhysicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelThreeConformanceEClass = null;

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
	private EClass reasonForVisitSectionConsultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForVisitSectionEClass = null;

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
	private EClass reasonForVisitAndChiefComplaintSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAndPlanSectionProcNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSectionProcNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintSectionProcNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectiveSectionEClass = null;

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
	private EClass pastMedicalHistorySectionConsultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOneConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelTwoConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExaminationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pastMedicalHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewOfSystemsSectionIHEEClass = null;

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
	private EClass generalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticFindingsEClass = null;

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
	private EClass assessmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planSectionEClass = null;

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
	private EClass cdtRegistryDelegateEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDTPackageImpl() {
		super(eNS_URI, CDTFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CDTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDTPackage init() {
		if (isInited) return (CDTPackage)EPackage.Registry.INSTANCE.getEPackage(CDTPackage.eNS_URI);

		// Obtain or create and register package
		CDTPackageImpl theCDTPackage = (CDTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CDTPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CCDPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDTPackage.createPackageContents();

		// Initialize created meta-data
		theCDTPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCDTPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CDTValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCDTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDTPackage.eNS_URI, theCDTPackage);
		return theCDTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints() {
		return generalHeaderConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryAndPhysical() {
		return historyAndPhysicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsultationNote() {
		return consultationNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelThreeConformance() {
		return levelThreeConformanceEClass;
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
	public EClass getReasonForVisitSectionConsult() {
		return reasonForVisitSectionConsultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForVisitSection() {
		return reasonForVisitSectionEClass;
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
	public EClass getReasonForVisitAndChiefComplaintSection() {
		return reasonForVisitAndChiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressNote() {
		return progressNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSectionProcNote() {
		return assessmentAndPlanSectionProcNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentSectionProcNote() {
		return assessmentSectionProcNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintSectionProcNote() {
		return chiefComplaintSectionProcNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveSection() {
		return objectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectiveSection() {
		return subjectiveSectionEClass;
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
	public EClass getPastMedicalHistorySectionConsult() {
		return pastMedicalHistorySectionConsultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelOneConformance() {
		return levelOneConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelTwoConformance() {
		return levelTwoConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExaminationSection() {
		return physicalExaminationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPastMedicalHistorySection() {
		return pastMedicalHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewOfSystemsSectionIHE() {
		return reviewOfSystemsSectionIHEEClass;
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
	public EClass getGeneralStatusSection() {
		return generalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticFindings() {
		return diagnosticFindingsEClass;
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
	public EClass getAssessmentSection() {
		return assessmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanSection() {
		return planSectionEClass;
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
	public EClass getCDTRegistryDelegate() {
		return cdtRegistryDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTFactory getCDTFactory() {
		return (CDTFactory)getEFactoryInstance();
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
		generalHeaderConstraintsEClass = createEClass(GENERAL_HEADER_CONSTRAINTS);

		historyAndPhysicalEClass = createEClass(HISTORY_AND_PHYSICAL);

		historyOfPresentIllnessEClass = createEClass(HISTORY_OF_PRESENT_ILLNESS);

		pastMedicalHistorySectionEClass = createEClass(PAST_MEDICAL_HISTORY_SECTION);

		reviewOfSystemsSectionIHEEClass = createEClass(REVIEW_OF_SYSTEMS_SECTION_IHE);

		physicalExaminationSectionEClass = createEClass(PHYSICAL_EXAMINATION_SECTION);

		vitalSignsSectionEClass = createEClass(VITAL_SIGNS_SECTION);

		generalStatusSectionEClass = createEClass(GENERAL_STATUS_SECTION);

		consultationNoteEClass = createEClass(CONSULTATION_NOTE);

		pastMedicalHistorySectionConsultEClass = createEClass(PAST_MEDICAL_HISTORY_SECTION_CONSULT);

		reviewOfSystemsSectionEClass = createEClass(REVIEW_OF_SYSTEMS_SECTION);

		reasonForReferralSectionEClass = createEClass(REASON_FOR_REFERRAL_SECTION);

		reasonForVisitSectionConsultEClass = createEClass(REASON_FOR_VISIT_SECTION_CONSULT);

		levelOneConformanceEClass = createEClass(LEVEL_ONE_CONFORMANCE);

		levelTwoConformanceEClass = createEClass(LEVEL_TWO_CONFORMANCE);

		levelThreeConformanceEClass = createEClass(LEVEL_THREE_CONFORMANCE);

		diagnosticFindingsEClass = createEClass(DIAGNOSTIC_FINDINGS);

		assessmentSectionEClass = createEClass(ASSESSMENT_SECTION);

		planSectionEClass = createEClass(PLAN_SECTION);

		assessmentAndPlanSectionEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION);

		reasonForVisitSectionEClass = createEClass(REASON_FOR_VISIT_SECTION);

		chiefComplaintSectionEClass = createEClass(CHIEF_COMPLAINT_SECTION);

		reasonForVisitAndChiefComplaintSectionEClass = createEClass(REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION);

		progressNoteEClass = createEClass(PROGRESS_NOTE);

		assessmentAndPlanSectionProcNoteEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE);

		assessmentSectionProcNoteEClass = createEClass(ASSESSMENT_SECTION_PROC_NOTE);

		chiefComplaintSectionProcNoteEClass = createEClass(CHIEF_COMPLAINT_SECTION_PROC_NOTE);

		objectiveSectionEClass = createEClass(OBJECTIVE_SECTION);

		subjectiveSectionEClass = createEClass(SUBJECTIVE_SECTION);

		cdtRegistryDelegateEClass = createEClass(CDT_REGISTRY_DELEGATE);
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
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
		CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		generalHeaderConstraintsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		historyAndPhysicalEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
		historyOfPresentIllnessEClass.getESuperTypes().add(theCDAPackage.getSection());
		pastMedicalHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		reviewOfSystemsSectionIHEEClass.getESuperTypes().add(theCDAPackage.getSection());
		physicalExaminationSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		vitalSignsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		generalStatusSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		consultationNoteEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
		pastMedicalHistorySectionConsultEClass.getESuperTypes().add(theCDAPackage.getSection());
		reviewOfSystemsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		reasonForReferralSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		reasonForVisitSectionConsultEClass.getESuperTypes().add(theCDAPackage.getSection());
		levelOneConformanceEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		levelTwoConformanceEClass.getESuperTypes().add(this.getLevelOneConformance());
		levelThreeConformanceEClass.getESuperTypes().add(this.getLevelTwoConformance());
		diagnosticFindingsEClass.getESuperTypes().add(theCCDPackage.getResultsSection());
		assessmentSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		planSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		assessmentAndPlanSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		reasonForVisitSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		chiefComplaintSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		reasonForVisitAndChiefComplaintSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		progressNoteEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
		assessmentAndPlanSectionProcNoteEClass.getESuperTypes().add(theCDAPackage.getSection());
		assessmentSectionProcNoteEClass.getESuperTypes().add(theCDAPackage.getSection());
		chiefComplaintSectionProcNoteEClass.getESuperTypes().add(theCDAPackage.getSection());
		objectiveSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		subjectiveSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		cdtRegistryDelegateEClass.getESuperTypes().add(theCDAPackage.getRegistryDelegate());

		// Initialize classes and features; add operations and parameters
		initEClass(generalHeaderConstraintsEClass, GeneralHeaderConstraints.class, "GeneralHeaderConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsPersonHasName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsOrganizationsHaveContactInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTimePreciseToDay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTimePreciseToYear", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTelephoneMatchesRegex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasTelephoneDialingDigits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTypeIdExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsOidLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsSetIdAndVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsSetIdAndIdAreUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsCopyTimeNotPresent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasRecordTargetPatientRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasPatientBirthTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasAdministrativeGenderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasProviderOrganization", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasAuthorTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasAssignedAuthorId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasDataEntererAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasDataEntererTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasInformant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTimePreciseToSecond", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTimePreciseToYearAndDay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyAndPhysicalEClass, HistoryAndPhysical.class, "HistoryAndPhysical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalAssessmentAndPlan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalBothAssessmentAndPlan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalReasonForVisitAndChiefComplaint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalHistoryOfPresentIllness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalPastMedicalHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalAlertsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalFamilyHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalReviewOfSystemsSectionIHE", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalPhysicalExaminationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalGeneralStatusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalDiagnosticFindings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyAndPhysicalEClass, ecorePackage.getEBoolean(), "validateHistoryAndPhysicalImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, this.getHistoryOfPresentIllness(), "getHistoryOfPresentIllness", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, this.getPastMedicalHistorySection(), "getPastMedicalHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getAlertsSection(), "getAlertsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getFamilyHistorySection(), "getFamilyHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, this.getReviewOfSystemsSectionIHE(), "getReviewOfSystemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, this.getPhysicalExaminationSection(), "getPhysicalExaminationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, this.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, this.getGeneralStatusSection(), "getGeneralStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getResultsSection(), "getDiagnosticFindings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(historyAndPhysicalEClass, theCCDPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(historyOfPresentIllnessEClass, HistoryOfPresentIllness.class, "HistoryOfPresentIllness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyOfPresentIllnessEClass, ecorePackage.getEBoolean(), "validateHistoryOfPresentIllnessTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyOfPresentIllnessEClass, ecorePackage.getEBoolean(), "validateHistoryOfPresentIllnessCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pastMedicalHistorySectionEClass, PastMedicalHistorySection.class, "PastMedicalHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionHasClinicalStatements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pastMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reviewOfSystemsSectionIHEEClass, ReviewOfSystemsSectionIHE.class, "ReviewOfSystemsSectionIHE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reviewOfSystemsSectionIHEEClass, ecorePackage.getEBoolean(), "validateReviewOfSystemsSectionIHETemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reviewOfSystemsSectionIHEEClass, ecorePackage.getEBoolean(), "validateReviewOfSystemsSectionIHECode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalExaminationSectionEClass, PhysicalExaminationSection.class, "PhysicalExaminationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(physicalExaminationSectionEClass, ecorePackage.getEBoolean(), "validatePhysicalExaminationSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(physicalExaminationSectionEClass, ecorePackage.getEBoolean(), "validatePhysicalExaminationSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsSectionEClass, VitalSignsSection.class, "VitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateVitalSignsSectionClinicalStatements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateVitalSignsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateVitalSignsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateVitalSignsSectionVitalSignsOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(vitalSignsSectionEClass, theCCDPackage.getVitalSignsOrganizer(), "getVitalSignsOrganizer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(generalStatusSectionEClass, GeneralStatusSection.class, "GeneralStatusSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(generalStatusSectionEClass, ecorePackage.getEBoolean(), "validateGeneralStatusSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalStatusSectionEClass, ecorePackage.getEBoolean(), "validateGeneralStatusSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(consultationNoteEClass, ConsultationNote.class, "ConsultationNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteReferralOrVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteHistoryOfPresentIllness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNotePhysicalExaminationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNotePastMedicalHistorySectionConsult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteAlertsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteFamilyHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteReviewOfSystemsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteGeneralStatusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(consultationNoteEClass, ecorePackage.getEBoolean(), "validateConsultationNoteDiagnosticFindings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(consultationNoteEClass, this.getHistoryOfPresentIllness(), "getHistoryOfPresentIllness", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, this.getPhysicalExaminationSection(), "getPhysicalExamination", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, this.getPastMedicalHistorySectionConsult(), "getPastMedicalHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getAlertsSection(), "getAlertsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getFamilyHistorySection(), "getFamilyHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, this.getReviewOfSystemsSection(), "getReviewOfSystemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, this.getGeneralStatusSection(), "getGeneralStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(consultationNoteEClass, theCCDPackage.getResultsSection(), "getDiagnosticFindings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(pastMedicalHistorySectionConsultEClass, PastMedicalHistorySectionConsult.class, "PastMedicalHistorySectionConsult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pastMedicalHistorySectionConsultEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionConsultTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pastMedicalHistorySectionConsultEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionConsultCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pastMedicalHistorySectionConsultEClass, ecorePackage.getEBoolean(), "validatePastMedicalHistorySectionConsultText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reviewOfSystemsSectionEClass, ReviewOfSystemsSection.class, "ReviewOfSystemsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reviewOfSystemsSectionEClass, ecorePackage.getEBoolean(), "validateReviewOfSystemsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reviewOfSystemsSectionEClass, ecorePackage.getEBoolean(), "validateReviewOfSystemsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reasonForReferralSectionEClass, ReasonForReferralSection.class, "ReasonForReferralSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonForReferralSectionEClass, ecorePackage.getEBoolean(), "validateReasonForReferralSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonForReferralSectionEClass, ecorePackage.getEBoolean(), "validateReasonForReferralSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reasonForVisitSectionConsultEClass, ReasonForVisitSectionConsult.class, "ReasonForVisitSectionConsult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonForVisitSectionConsultEClass, ecorePackage.getEBoolean(), "validateReasonForVisitSectionConsultTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonForVisitSectionConsultEClass, ecorePackage.getEBoolean(), "validateReasonForVisitSectionConsultCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(levelOneConformanceEClass, LevelOneConformance.class, "LevelOneConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(levelOneConformanceEClass, ecorePackage.getEBoolean(), "validateLevelOneConformanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(levelTwoConformanceEClass, LevelTwoConformance.class, "LevelTwoConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(levelThreeConformanceEClass, LevelThreeConformance.class, "LevelThreeConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagnosticFindingsEClass, DiagnosticFindings.class, "DiagnosticFindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(diagnosticFindingsEClass, ecorePackage.getEBoolean(), "validateDiagnosticFindingsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assessmentSectionEClass, AssessmentSection.class, "AssessmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assessmentSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assessmentSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planSectionEClass, PlanSection.class, "PlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planSectionEClass, ecorePackage.getEBoolean(), "validatePlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planSectionEClass, ecorePackage.getEBoolean(), "validatePlanSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assessmentAndPlanSectionEClass, AssessmentAndPlanSection.class, "AssessmentAndPlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assessmentAndPlanSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assessmentAndPlanSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentAndPlanSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reasonForVisitSectionEClass, ReasonForVisitSection.class, "ReasonForVisitSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonForVisitSectionEClass, ecorePackage.getEBoolean(), "validateReasonForVisitSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonForVisitSectionEClass, ecorePackage.getEBoolean(), "validateReasonForVisitSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chiefComplaintSectionEClass, ChiefComplaintSection.class, "ChiefComplaintSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(chiefComplaintSectionEClass, ecorePackage.getEBoolean(), "validateChiefComplaintSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(chiefComplaintSectionEClass, ecorePackage.getEBoolean(), "validateChiefComplaintSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reasonForVisitAndChiefComplaintSectionEClass, ReasonForVisitAndChiefComplaintSection.class, "ReasonForVisitAndChiefComplaintSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonForVisitAndChiefComplaintSectionEClass, ecorePackage.getEBoolean(), "validateReasonForVisitAndChiefComplaintSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reasonForVisitAndChiefComplaintSectionEClass, ecorePackage.getEBoolean(), "validateReasonForVisitAndChiefComplaintSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(progressNoteEClass, ProgressNote.class, "ProgressNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteAssessmentAndPlan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteBothAssessmentAndPlan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasServiceEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasServiceEventCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasServiceEventEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasComponentOfElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasEncompassingEncounterId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasEncompassingEncounterEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasEncompassingEncounterEffectiveTimeLow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteHasEncompassingEncounterFacilityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteAlertsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteChiefComplaintSectionProcNote", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteObjectiveSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNotePhysicalExaminationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteReviewOfSystemsSectionIHE", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(progressNoteEClass, ecorePackage.getEBoolean(), "validateProgressNoteSubjectiveSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(progressNoteEClass, this.getAssessmentAndPlanSectionProcNote(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getAssessmentSectionProcNote(), "getAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, theCCDPackage.getPlanOfCareSection(), "getPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, theCCDPackage.getAlertsSection(), "getAlertsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getChiefComplaintSectionProcNote(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, theCCDPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getObjectiveSection(), "getObjectiveSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getPhysicalExaminationSection(), "getPhysicalExaminationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, theCCDPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, theCCDPackage.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getReviewOfSystemsSectionIHE(), "getReviewOfSystemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(progressNoteEClass, this.getSubjectiveSection(), "getSubjectiveSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(assessmentAndPlanSectionProcNoteEClass, AssessmentAndPlanSectionProcNote.class, "AssessmentAndPlanSectionProcNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assessmentAndPlanSectionProcNoteEClass, ecorePackage.getEBoolean(), "validateAssessmentAndPlanSectionProcNoteTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assessmentAndPlanSectionProcNoteEClass, ecorePackage.getEBoolean(), "validateAssessmentAndPlanSectionProcNoteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assessmentSectionProcNoteEClass, AssessmentSectionProcNote.class, "AssessmentSectionProcNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assessmentSectionProcNoteEClass, ecorePackage.getEBoolean(), "validateAssessmentSectionProcNoteTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assessmentSectionProcNoteEClass, ecorePackage.getEBoolean(), "validateAssessmentSectionProcNoteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chiefComplaintSectionProcNoteEClass, ChiefComplaintSectionProcNote.class, "ChiefComplaintSectionProcNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(chiefComplaintSectionProcNoteEClass, ecorePackage.getEBoolean(), "validateChiefComplaintSectionProcNoteTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(chiefComplaintSectionProcNoteEClass, ecorePackage.getEBoolean(), "validateChiefComplaintSectionProcNoteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectiveSectionEClass, ObjectiveSection.class, "ObjectiveSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectiveSectionEClass, ecorePackage.getEBoolean(), "validateObjectiveSectionHasClinicalStatements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectiveSectionEClass, ecorePackage.getEBoolean(), "validateObjectiveSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectiveSectionEClass, ecorePackage.getEBoolean(), "validateObjectiveSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectiveSectionEClass, ecorePackage.getEBoolean(), "validateObjectiveSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectiveSectionEClass, ecorePackage.getEBoolean(), "validateObjectiveSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subjectiveSectionEClass, SubjectiveSection.class, "SubjectiveSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(subjectiveSectionEClass, ecorePackage.getEBoolean(), "validateSubjectiveSectionHasClinicalStatements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectiveSectionEClass, ecorePackage.getEBoolean(), "validateSubjectiveSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectiveSectionEClass, ecorePackage.getEBoolean(), "validateSubjectiveSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectiveSectionEClass, ecorePackage.getEBoolean(), "validateSubjectiveSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(subjectiveSectionEClass, ecorePackage.getEBoolean(), "validateSubjectiveSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cdtRegistryDelegateEClass, CDTRegistryDelegate.class, "CDTRegistryDelegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
		  (this, 
		   source, 
		   new String[] {
			 "registryDelegate", "CDTRegistryDelegate"
		   });		
		addAnnotation
		  (generalHeaderConstraintsEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.3",
			 "constraints.validation.error", "GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsPersonHasName GeneralHeaderConstraintsRolesShallHaveAddrAndTelecom GeneralHeaderConstraintsOrganizationsHaveContactInfo GeneralHeaderConstraintsTimePreciseToDay GeneralHeaderConstraintsTimePreciseToYear GeneralHeaderConstraintsTelephoneMatchesRegex GeneralHeaderConstraintsHasTelephoneDialingDigits GeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor GeneralHeaderConstraintsTypeIdExtension GeneralHeaderConstraintsOidLength GeneralHeaderConstraintsSetIdAndVersionNumber GeneralHeaderConstraintsSetIdAndIdAreUnique GeneralHeaderConstraintsCopyTimeNotPresent GeneralHeaderConstraintsHasRecordTargetPatientRole GeneralHeaderConstraintsHasPatientBirthTime GeneralHeaderConstraintsHasAdministrativeGenderCode GeneralHeaderConstraintsHasAuthorTime GeneralHeaderConstraintsHasAssignedAuthorId GeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice GeneralHeaderConstraintsHasDataEntererAssignedPerson GeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson GeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson GeneralHeaderConstraintsAuthenticatorHasAssignedPerson GeneralHeaderConstraintsCode GeneralHeaderConstraintsEffectiveTime GeneralHeaderConstraintsId GeneralHeaderConstraintsLanguageCode GeneralHeaderConstraintsRealmCode GeneralHeaderConstraintsTitle GeneralHeaderConstraintsTypeId",
			 "constraints.validation.warning", "GeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom GeneralHeaderConstraintsTimePreciseToSecond GeneralHeaderConstraintsTimePreciseToYearAndDay",
			 "realmCode.code", "US",
			 "constraints.validation.info", "GeneralHeaderConstraintsHasProviderOrganization GeneralHeaderConstraintsHasDataEntererTime GeneralHeaderConstraintsHasInformant"
		   });																																																																																																																																																						
		addAnnotation
		  (historyAndPhysicalEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2",
			 "constraints.validation.error", "HistoryAndPhysicalTemplateId HistoryAndPhysicalAssessmentAndPlan HistoryAndPhysicalBothAssessmentAndPlan HistoryAndPhysicalReasonForVisitAndChiefComplaint HistoryAndPhysicalBothReasonForVisitAndChiefComplaint GeneralHeaderConstraintsCode HistoryAndPhysicalHistoryOfPresentIllness HistoryAndPhysicalPastMedicalHistorySection HistoryAndPhysicalMedicationsSection HistoryAndPhysicalAlertsSection HistoryAndPhysicalSocialHistorySection HistoryAndPhysicalFamilyHistorySection HistoryAndPhysicalReviewOfSystemsSectionIHE HistoryAndPhysicalPhysicalExaminationSection HistoryAndPhysicalVitalSignsSection HistoryAndPhysicalGeneralStatusSection HistoryAndPhysicalDiagnosticFindings",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.info", "HistoryAndPhysicalProblemSection HistoryAndPhysicalProceduresSection HistoryAndPhysicalImmunizationsSection"
		   });																																																																																																							
		addAnnotation
		  (historyOfPresentIllnessEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.4",
			 "code.displayName", "HISTORY OF PRESENT ILLNESS",
			 "constraints.validation.error", "HistoryOfPresentIllnessTemplateId HistoryOfPresentIllnessCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10164-2"
		   });										
		addAnnotation
		  (pastMedicalHistorySectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "HISTORY OF PAST ILLNESS",
			 "templateId.root", "2.16.840.1.113883.10.20.2.9",
			 "constraints.validation.error", "PastMedicalHistorySectionTemplateId PastMedicalHistorySectionCode PastMedicalHistorySectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "PastMedicalHistorySectionHasClinicalStatements",
			 "code.code", "11348-0"
		   });																		
		addAnnotation
		  (reviewOfSystemsSectionIHEEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.18",
			 "code.displayName", "REVIEW OF SYSTEMS",
			 "constraints.validation.error", "ReviewOfSystemsSectionIHETemplateId ReviewOfSystemsSectionIHECode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10187-3"
		   });										
		addAnnotation
		  (physicalExaminationSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.10",
			 "code.displayName", "PHYSICAL FINDINGS",
			 "constraints.validation.error", "PhysicalExaminationSectionTemplateId PhysicalExaminationSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "29545-1"
		   });										
		addAnnotation
		  (vitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.4",
			 "code.displayName", "VITAL SIGNS",
			 "constraints.validation.error", "VitalSignsSectionTemplateId VitalSignsSectionCode VitalSignsSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "VitalSignsSectionClinicalStatements VitalSignsSectionVitalSignsOrganizer",
			 "code.code", "8716-3"
		   });																								
		addAnnotation
		  (generalStatusSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.5",
			 "code.displayName", "GENERAL STATUS, PHYSICAL FINDINGS",
			 "constraints.validation.error", "GeneralStatusSectionTemplateId GeneralStatusSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10210-3"
		   });										
		addAnnotation
		  (consultationNoteEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.4",
			 "constraints.validation.error", "ConsultationNoteTemplateId ConsultationNoteReferralOrVisit GeneralHeaderConstraintsCode ConsultationNoteHistoryOfPresentIllness ConsultationNotePhysicalExaminationSection",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.info", "ConsultationNoteProblemSection ConsultationNoteProceduresSection ConsultationNotePastMedicalHistorySectionConsult ConsultationNoteImmunizationsSection ConsultationNoteMedicationsSection ConsultationNoteAlertsSection ConsultationNoteSocialHistorySection ConsultationNoteFamilyHistorySection ConsultationNoteReviewOfSystemsSection ConsultationNoteVitalSignsSection ConsultationNoteGeneralStatusSection ConsultationNoteDiagnosticFindings"
		   });																																																																																											
		addAnnotation
		  (pastMedicalHistorySectionConsultEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "HISTORY OF PAST ILLNESS",
			 "templateId.root", "2.16.840.1.113883.10.20.4.9",
			 "constraints.validation.error", "PastMedicalHistorySectionConsultTemplateId PastMedicalHistorySectionConsultCode PastMedicalHistorySectionConsultText",
			 "code.codeSystemName", "LOINC",
			 "code.code", "11348-0"
		   });														
		addAnnotation
		  (reviewOfSystemsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.4.10",
			 "code.displayName", "REVIEW OF SYSTEMS",
			 "constraints.validation.error", "ReviewOfSystemsSectionTemplateId ReviewOfSystemsSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10187-3"
		   });										
		addAnnotation
		  (reasonForReferralSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.4.8",
			 "code.displayName", "REASON FOR REFERRAL",
			 "constraints.validation.error", "ReasonForReferralSectionTemplateId ReasonForReferralSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "42349-1"
		   });										
		addAnnotation
		  (reasonForVisitSectionConsultEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.4.8",
			 "code.displayName", "REASON FOR VISIT",
			 "constraints.validation.error", "ReasonForVisitSectionConsultTemplateId ReasonForVisitSectionConsultCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "29299-5"
		   });										
		addAnnotation
		  (levelOneConformanceEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.10",
			 "constraints.validation.error", "LevelOneConformanceTemplateId"
		   });						
		addAnnotation
		  (levelTwoConformanceEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.20",
			 "constraints.validation.error", "LevelTwoConformanceTemplateId"
		   });			
		addAnnotation
		  (levelThreeConformanceEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.30",
			 "constraints.validation.error", "LevelThreeConformanceTemplateId"
		   });			
		addAnnotation
		  (diagnosticFindingsEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "DiagnosticFindingsTitle"
		   });						
		addAnnotation
		  (assessmentSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.7",
			 "code.displayName", "Assessment",
			 "constraints.validation.error", "AssessmentSectionTemplateId AssessmentSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "51848-0"
		   });										
		addAnnotation
		  (planSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.7",
			 "code.displayName", "Plan",
			 "constraints.validation.error", "PlanSectionTemplateId PlanSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "18776-5"
		   });										
		addAnnotation
		  (assessmentAndPlanSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.7",
			 "code.displayName", "Assessment + Plan",
			 "constraints.validation.error", "AssessmentAndPlanSectionTemplateId AssessmentAndPlanSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "51847-2"
		   });										
		addAnnotation
		  (reasonForVisitSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.8",
			 "code.displayName", "Reason for visit",
			 "constraints.validation.error", "ReasonForVisitSectionTemplateId ReasonForVisitSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "29299-5"
		   });										
		addAnnotation
		  (chiefComplaintSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.8",
			 "code.displayName", "Chief complaint",
			 "constraints.validation.error", "ChiefComplaintSectionTemplateId ChiefComplaintSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10154-3"
		   });										
		addAnnotation
		  (reasonForVisitAndChiefComplaintSectionEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.2.8",
			 "code.displayName", "Reason for visit + Chief complaint",
			 "constraints.validation.error", "ReasonForVisitAndChiefComplaintSectionTemplateId ReasonForVisitAndChiefComplaintSectionCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "46239-0"
		   });										
		addAnnotation
		  (progressNoteEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.21.1",
			 "constraints.validation.error", "ProgressNoteTemplateId ProgressNoteAssessmentAndPlan ProgressNoteBothAssessmentAndPlan ProgressNoteHasServiceEventCode ProgressNoteHasComponentOfElement ProgressNoteHasEncompassingEncounterId ProgressNoteHasEncompassingEncounterEffectiveTime ProgressNoteHasEncompassingEncounterEffectiveTimeLow GeneralHeaderConstraintsCode",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "ProgressNoteHasServiceEvent ProgressNoteHasServiceEventEffectiveTime ProgressNoteHasEncompassingEncounterFacilityId",
			 "constraints.validation.info", "ProgressNoteAlertsSection ProgressNoteChiefComplaintSectionProcNote ProgressNoteMedicationsSection ProgressNoteObjectiveSection ProgressNotePhysicalExaminationSection ProgressNoteProblemSection ProgressNoteResultsSection ProgressNoteVitalSignsSection ProgressNoteReviewOfSystemsSectionIHE ProgressNoteSubjectiveSection"
		   });																																																																																																													
		addAnnotation
		  (assessmentAndPlanSectionProcNoteEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.18.2.14",
			 "code.displayName", "ASSESSMENT AND PLAN",
			 "constraints.validation.error", "AssessmentAndPlanSectionProcNoteTemplateId AssessmentAndPlanSectionProcNoteCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "51847-2"
		   });										
		addAnnotation
		  (assessmentSectionProcNoteEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.18.2.13",
			 "code.displayName", "ASSESSMENT",
			 "constraints.validation.error", "AssessmentSectionProcNoteTemplateId AssessmentSectionProcNoteCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "51848-0"
		   });										
		addAnnotation
		  (chiefComplaintSectionProcNoteEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.18.2.16",
			 "code.displayName", "CHIEF COMPLAINT",
			 "constraints.validation.error", "ChiefComplaintSectionProcNoteTemplateId ChiefComplaintSectionProcNoteCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10154-3"
		   });										
		addAnnotation
		  (objectiveSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.21.2.1",
			 "code.displayName", "OBJECTIVE DATA",
			 "constraints.validation.error", "ObjectiveSectionTemplateId ObjectiveSectionCode ObjectiveSectionText ObjectiveSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "ObjectiveSectionHasClinicalStatements",
			 "code.code", "OBJEC-X"
		   });																						
		addAnnotation
		  (subjectiveSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.21.2.2",
			 "code.displayName", "SUBJECTIVE DATA",
			 "constraints.validation.error", "SubjectiveSectionTemplateId SubjectiveSectionCode SubjectiveSectionText SubjectiveSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "SubjectiveSectionHasClinicalStatements",
			 "code.code", "SUBJ-X"
		   });																				
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";																																																																																																																																																									
		addAnnotation
		  (historyAndPhysicalEClass, 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																			
		addAnnotation
		  (consultationNoteEClass, 
		   source, 
		   new String[] {
		   });																																																																																																																																								
		addAnnotation
		  (levelTwoConformanceEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (levelThreeConformanceEClass, 
		   source, 
		   new String[] {
		   });																																																														
		addAnnotation
		  (progressNoteEClass, 
		   source, 
		   new String[] {
		   });																																																																																																																																																																															
	}

} //CDTPackageImpl
