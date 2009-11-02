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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDosing;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IHEPackageImpl extends EPackageImpl implements IHEPackage {
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
	private EClass concernEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeProblemsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemConcernEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEntryEClass = null;

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
	private EClass medicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceConcernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceEClass = null;

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
	private EClass normalDosingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taperedDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitDosingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalDosingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationMedicationEClass = null;

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
	private EClass codedVitalSignsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizerEClass = null;

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
	private EClass codedSurgeriesSectionEClass = null;

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
	private EClass codedAdvanceDirectivesSectionEClass = null;

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
	private EClass physicalExamNarrativeSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExamSectionEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IHEPackageImpl() {
		super(eNS_URI, IHEFactory.eINSTANCE);
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
	public static IHEPackage init() {
		if (isInited) return (IHEPackage)EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI);

		// Obtain or create and register package
		IHEPackageImpl theIHEPackage = (IHEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof IHEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new IHEPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CCDPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIHEPackage.createPackageContents();

		// Initialize created meta-data
		theIHEPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIHEPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return IHEValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIHEPackage.freeze();

		return theIHEPackage;
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
	public EClass getConcernEntry() {
		return concernEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalDocument() {
		return medicalDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveProblemsSection() {
		return activeProblemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemConcernEntry() {
		return problemConcernEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemEntry() {
		return problemEntryEClass;
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
	public EClass getMedicationsSection() {
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceConcern() {
		return allergyIntoleranceConcernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		return allergyIntoleranceEClass;
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
	public EClass getNormalDosing() {
		return normalDosingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaperedDose() {
		return taperedDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitDosing() {
		return splitDosingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalDosing() {
		return conditionalDosingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationMedication() {
		return combinationMedicationEClass;
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
	public EClass getCodedVitalSignsSection() {
		return codedVitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignObservation() {
		return vitalSignObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleObservation() {
		return simpleObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		return vitalSignsOrganizerEClass;
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
	public EClass getCodedSurgeriesSection() {
		return codedSurgeriesSectionEClass;
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
	public EClass getCodedAdvanceDirectivesSection() {
		return codedAdvanceDirectivesSectionEClass;
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
	public EClass getPhysicalExamNarrativeSection() {
		return physicalExamNarrativeSectionEClass;
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
	public IHEFactory getIHEFactory() {
		return (IHEFactory)getEFactoryInstance();
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
		medicationsAdministeredSectionEClass = createEClass(MEDICATIONS_ADMINISTERED_SECTION);

		concernEntryEClass = createEClass(CONCERN_ENTRY);

		medicalDocumentEClass = createEClass(MEDICAL_DOCUMENT);

		activeProblemsSectionEClass = createEClass(ACTIVE_PROBLEMS_SECTION);

		problemConcernEntryEClass = createEClass(PROBLEM_CONCERN_ENTRY);

		problemEntryEClass = createEClass(PROBLEM_ENTRY);

		medicationEClass = createEClass(MEDICATION);

		medicationsSectionEClass = createEClass(MEDICATIONS_SECTION);

		allergyIntoleranceConcernEClass = createEClass(ALLERGY_INTOLERANCE_CONCERN);

		allergyIntoleranceEClass = createEClass(ALLERGY_INTOLERANCE);

		allergiesReactionsSectionEClass = createEClass(ALLERGIES_REACTIONS_SECTION);

		normalDosingEClass = createEClass(NORMAL_DOSING);

		taperedDoseEClass = createEClass(TAPERED_DOSE);

		splitDosingEClass = createEClass(SPLIT_DOSING);

		conditionalDosingEClass = createEClass(CONDITIONAL_DOSING);

		combinationMedicationEClass = createEClass(COMBINATION_MEDICATION);

		vitalSignsSectionEClass = createEClass(VITAL_SIGNS_SECTION);

		codedVitalSignsSectionEClass = createEClass(CODED_VITAL_SIGNS_SECTION);

		vitalSignObservationEClass = createEClass(VITAL_SIGN_OBSERVATION);

		simpleObservationEClass = createEClass(SIMPLE_OBSERVATION);

		vitalSignsOrganizerEClass = createEClass(VITAL_SIGNS_ORGANIZER);

		payersSectionEClass = createEClass(PAYERS_SECTION);

		historyOfPastIllnessSectionEClass = createEClass(HISTORY_OF_PAST_ILLNESS_SECTION);

		chiefComplaintSectionEClass = createEClass(CHIEF_COMPLAINT_SECTION);

		reasonForReferralSectionEClass = createEClass(REASON_FOR_REFERRAL_SECTION);

		historyOfPresentIllnessEClass = createEClass(HISTORY_OF_PRESENT_ILLNESS);

		surgeriesSectionEClass = createEClass(SURGERIES_SECTION);

		codedSurgeriesSectionEClass = createEClass(CODED_SURGERIES_SECTION);

		hospitalAdmissionDiagnosisSectionEClass = createEClass(HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);

		dischargeDiagnosisSectionEClass = createEClass(DISCHARGE_DIAGNOSIS_SECTION);

		admissionMedicationHistorySectionEClass = createEClass(ADMISSION_MEDICATION_HISTORY_SECTION);

		hospitalDischargeMedicationsSectionEClass = createEClass(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);

		codedAdvanceDirectivesSectionEClass = createEClass(CODED_ADVANCE_DIRECTIVES_SECTION);

		advanceDirectivesSectionEClass = createEClass(ADVANCE_DIRECTIVES_SECTION);

		physicalExamNarrativeSectionEClass = createEClass(PHYSICAL_EXAM_NARRATIVE_SECTION);

		physicalExamSectionEClass = createEClass(PHYSICAL_EXAM_SECTION);
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
		medicationsAdministeredSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		concernEntryEClass.getESuperTypes().add(theCCDPackage.getProblemAct());
		medicalDocumentEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		activeProblemsSectionEClass.getESuperTypes().add(theCCDPackage.getProblemSection());
		problemConcernEntryEClass.getESuperTypes().add(this.getConcernEntry());
		problemEntryEClass.getESuperTypes().add(theCCDPackage.getProblemObservation());
		medicationEClass.getESuperTypes().add(theCCDPackage.getMedicationActivity());
		medicationsSectionEClass.getESuperTypes().add(theCCDPackage.getMedicationSection());
		allergyIntoleranceConcernEClass.getESuperTypes().add(this.getConcernEntry());
		allergyIntoleranceEClass.getESuperTypes().add(this.getProblemEntry());
		allergiesReactionsSectionEClass.getESuperTypes().add(theCCDPackage.getAlertsSection());
		normalDosingEClass.getESuperTypes().add(this.getMedication());
		taperedDoseEClass.getESuperTypes().add(this.getMedication());
		splitDosingEClass.getESuperTypes().add(this.getMedication());
		conditionalDosingEClass.getESuperTypes().add(this.getMedication());
		combinationMedicationEClass.getESuperTypes().add(this.getMedication());
		vitalSignsSectionEClass.getESuperTypes().add(theCCDPackage.getVitalSignsSection());
		codedVitalSignsSectionEClass.getESuperTypes().add(this.getVitalSignsSection());
		vitalSignObservationEClass.getESuperTypes().add(theCCDPackage.getResultObservation());
		simpleObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		vitalSignsOrganizerEClass.getESuperTypes().add(theCCDPackage.getVitalSignsOrganizer());
		payersSectionEClass.getESuperTypes().add(theCCDPackage.getPayersSection());
		historyOfPastIllnessSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		chiefComplaintSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		reasonForReferralSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		historyOfPresentIllnessEClass.getESuperTypes().add(theCDAPackage.getSection());
		surgeriesSectionEClass.getESuperTypes().add(theCCDPackage.getProceduresSection());
		codedSurgeriesSectionEClass.getESuperTypes().add(this.getSurgeriesSection());
		hospitalAdmissionDiagnosisSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		dischargeDiagnosisSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		admissionMedicationHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		hospitalDischargeMedicationsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		codedAdvanceDirectivesSectionEClass.getESuperTypes().add(this.getAdvanceDirectivesSection());
		advanceDirectivesSectionEClass.getESuperTypes().add(theCCDPackage.getAdvanceDirectivesSection());
		physicalExamNarrativeSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		physicalExamSectionEClass.getESuperTypes().add(this.getPhysicalExamNarrativeSection());

		// Initialize classes and features; add operations and parameters
		initEClass(medicationsAdministeredSectionEClass, MedicationsAdministeredSection.class, "MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(medicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "MedicationsAdministeredSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concernEntryEClass, ConcernEntry.class, "ConcernEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(concernEntryEClass, ecorePackage.getEBoolean(), "ConcernEntry_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concernEntryEClass, ecorePackage.getEBoolean(), "ConcernEntry_effectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicalDocumentEClass, MedicalDocument.class, "MedicalDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicalDocumentEClass, ecorePackage.getEBoolean(), "MedicalDocument_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activeProblemsSectionEClass, ActiveProblemsSection.class, "ActiveProblemsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(activeProblemsSectionEClass, ecorePackage.getEBoolean(), "ActiveProblemsSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activeProblemsSectionEClass, ecorePackage.getEBoolean(), "ActiveProblemsSection_code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activeProblemsSectionEClass, ecorePackage.getEBoolean(), "ActiveProblemsSection_problemConcernEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(problemConcernEntryEClass, ProblemConcernEntry.class, "ProblemConcernEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemConcernEntryEClass, ecorePackage.getEBoolean(), "ProblemConcernEntry_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemConcernEntryEClass, ecorePackage.getEBoolean(), "ProblemConcernEntry_problemEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(problemEntryEClass, ProblemEntry.class, "ProblemEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemEntryEClass, ecorePackage.getEBoolean(), "ProblemEntry_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemEntryEClass, ecorePackage.getEBoolean(), "ProblemEntry_text", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemEntryEClass, ecorePackage.getEBoolean(), "ProblemEntry_value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationEClass, Medication.class, "Medication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationEClass, ecorePackage.getEBoolean(), "Medication_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationsSectionEClass, MedicationsSection.class, "MedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "MedicationsSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "MedicationsSection_code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergyIntoleranceConcernEClass, AllergyIntoleranceConcern.class, "AllergyIntoleranceConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergyIntoleranceConcernEClass, ecorePackage.getEBoolean(), "AllergyIntoleranceConcern_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergyIntoleranceEClass, AllergyIntolerance.class, "AllergyIntolerance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergyIntoleranceEClass, ecorePackage.getEBoolean(), "AllergyIntolerance_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergiesReactionsSectionEClass, AllergiesReactionsSection.class, "AllergiesReactionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergiesReactionsSectionEClass, ecorePackage.getEBoolean(), "AllergiesReactionsSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(allergiesReactionsSectionEClass, ecorePackage.getEBoolean(), "AllergiesReactionsSection_code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(normalDosingEClass, NormalDosing.class, "NormalDosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(normalDosingEClass, ecorePackage.getEBoolean(), "NormalDosing_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taperedDoseEClass, TaperedDose.class, "TaperedDose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(taperedDoseEClass, ecorePackage.getEBoolean(), "TaperedDose_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(splitDosingEClass, SplitDosing.class, "SplitDosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(splitDosingEClass, ecorePackage.getEBoolean(), "SplitDosing_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionalDosingEClass, ConditionalDosing.class, "ConditionalDosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(conditionalDosingEClass, ecorePackage.getEBoolean(), "ConditionalDosing_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(combinationMedicationEClass, CombinationMedication.class, "CombinationMedication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(combinationMedicationEClass, ecorePackage.getEBoolean(), "CombinationMedication_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsSectionEClass, VitalSignsSection.class, "VitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codedVitalSignsSectionEClass, CodedVitalSignsSection.class, "CodedVitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedVitalSignsSectionEClass, ecorePackage.getEBoolean(), "CodedVitalSignsSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(codedVitalSignsSectionEClass, ecorePackage.getEBoolean(), "CodedVitalSignsSection_vitalSignsOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignObservationEClass, VitalSignObservation.class, "VitalSignObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "VitalSignObservation_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "VitalSignObservation_code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "VitalSignObservation_value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleObservationEClass, SimpleObservation.class, "SimpleObservation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(simpleObservationEClass, ecorePackage.getEBoolean(), "SimpleObservation_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleObservationEClass, ecorePackage.getEBoolean(), "SimpleObservation_id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleObservationEClass, ecorePackage.getEBoolean(), "SimpleObservation_statusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsOrganizerEClass, VitalSignsOrganizer.class, "VitalSignsOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "VitalSignsOrganizer_code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "VitalSignsOrganizer_statusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "VitalSignsOrganizer_effectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "VitalSignsOrganizer_vitalSignObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(payersSectionEClass, PayersSection.class, "PayersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historyOfPastIllnessSectionEClass, HistoryOfPastIllnessSection.class, "HistoryOfPastIllnessSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyOfPastIllnessSectionEClass, ecorePackage.getEBoolean(), "HistoryOfPastIllnessSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chiefComplaintSectionEClass, ChiefComplaintSection.class, "ChiefComplaintSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(chiefComplaintSectionEClass, ecorePackage.getEBoolean(), "ChiefComplaintSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reasonForReferralSectionEClass, ReasonForReferralSection.class, "ReasonForReferralSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reasonForReferralSectionEClass, ecorePackage.getEBoolean(), "ReasonForReferralSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyOfPresentIllnessEClass, HistoryOfPresentIllness.class, "HistoryOfPresentIllness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyOfPresentIllnessEClass, ecorePackage.getEBoolean(), "HistoryOfPresentIllness_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(surgeriesSectionEClass, SurgeriesSection.class, "SurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(surgeriesSectionEClass, ecorePackage.getEBoolean(), "SurgeriesSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codedSurgeriesSectionEClass, CodedSurgeriesSection.class, "CodedSurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedSurgeriesSectionEClass, ecorePackage.getEBoolean(), "CodedSurgeriesSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalAdmissionDiagnosisSectionEClass, HospitalAdmissionDiagnosisSection.class, "HospitalAdmissionDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalAdmissionDiagnosisSectionEClass, ecorePackage.getEBoolean(), "HospitalAdmissionDiagnosisSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dischargeDiagnosisSectionEClass, DischargeDiagnosisSection.class, "DischargeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dischargeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "DischargeDiagnosisSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(admissionMedicationHistorySectionEClass, AdmissionMedicationHistorySection.class, "AdmissionMedicationHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(admissionMedicationHistorySectionEClass, ecorePackage.getEBoolean(), "AdmissionMedicationHistorySection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalDischargeMedicationsSectionEClass, HospitalDischargeMedicationsSection.class, "HospitalDischargeMedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalDischargeMedicationsSectionEClass, ecorePackage.getEBoolean(), "HospitalDischargeMedicationsSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codedAdvanceDirectivesSectionEClass, CodedAdvanceDirectivesSection.class, "CodedAdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "CodedAdvanceDirectivesSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(advanceDirectivesSectionEClass, AdvanceDirectivesSection.class, "AdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalExamNarrativeSectionEClass, PhysicalExamNarrativeSection.class, "PhysicalExamNarrativeSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(physicalExamNarrativeSectionEClass, ecorePackage.getEBoolean(), "PhysicalExamNarrativeSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalExamSectionEClass, PhysicalExamSection.class, "PhysicalExamSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(physicalExamSectionEClass, ecorePackage.getEBoolean(), "PhysicalExamSection_templateId", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// uml2.alias
		createUml2Annotations();
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
		  (medicationsAdministeredSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MedicationsAdministeredSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.21"
		   });						
		addAnnotation
		  (concernEntryEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ConcernEntry_templateId ConcernEntry_effectiveTime",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5.1"
		   });											
		addAnnotation
		  (medicalDocumentEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.1",
			 "constraints.validation.error", "MedicalDocument_templateId"
		   });						
		addAnnotation
		  (activeProblemsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystemName", "LOINC",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.6",
			 "constraints.validation.error", "ActiveProblemsSection_templateId ActiveProblemsSection_code ActiveProblemsSection_problemConcernEntry",
			 "code.displayName", "PROBLEM LIST",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.code", "11450-4"
		   });																
		addAnnotation
		  (problemConcernEntryEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5.2",
			 "constraints.validation.error", "ProblemConcernEntry_templateId ProblemConcernEntry_problemEntry"
		   });											
		addAnnotation
		  (problemEntryEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5",
			 "constraints.validation.error", "ProblemEntry_templateId ProblemEntry_text ProblemEntry_value"
		   });															
		addAnnotation
		  (medicationEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "Medication_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.7"
		   });							
		addAnnotation
		  (medicationsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.error", "MedicationsSection_templateId MedicationsSection_code",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.19",
			 "code.displayName", "HISTORY OF MEDICATION USE",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.code", "10160-0"
		   });											
		addAnnotation
		  (allergyIntoleranceConcernEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AllergyIntoleranceConcern_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5.3"
		   });							
		addAnnotation
		  (allergyIntoleranceEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AllergyIntolerance_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.6"
		   });								
		addAnnotation
		  (allergiesReactionsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.error", "AllergiesReactionsSection_templateId AllergiesReactionsSection_code",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.13",
			 "code.displayName", "Allergies, adverse reactions, alerts",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.code", "48765-2"
		   });												
		addAnnotation
		  (normalDosingEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "NormalDosing_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.7.1"
		   });							
		addAnnotation
		  (taperedDoseEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "TaperedDose_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.8"
		   });						
		addAnnotation
		  (splitDosingEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.9",
			 "constraints.validation.error", "SplitDosing_templateId"
		   });						
		addAnnotation
		  (conditionalDosingEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.10",
			 "constraints.validation.error", "ConditionalDosing_templateId"
		   });						
		addAnnotation
		  (combinationMedicationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.11",
			 "constraints.validation.error", "CombinationMedication_templateId"
		   });							
		addAnnotation
		  (vitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "VitalSignsSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.25"
		   });				
		addAnnotation
		  (codedVitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.2",
			 "constraints.validation.error", "CodedVitalSignsSection_templateId CodedVitalSignsSection_vitalSignsOrganizer"
		   });										
		addAnnotation
		  (vitalSignObservationEClass, 
		   source, 
		   new String[] {
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.error", "VitalSignObservation_templateId VitalSignObservation_code VitalSignObservation_value",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.13.2",
			 "code.codeSystem", "2.16.840.1.113883.6.1"
		   });															
		addAnnotation
		  (simpleObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.codeSystemName", "ActStatus",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.13",
			 "constraints.validation.error", "SimpleObservation_templateId SimpleObservation_id SimpleObservation_statusCode",
			 "statusCode.codeSystem", "2.16.840.1.113883.5.14",
			 "statusCode.code", "completed"
		   });														
		addAnnotation
		  (vitalSignsOrganizerEClass, 
		   source, 
		   new String[] {
			 "statusCode.codeSystemName", "ActStatus",
			 "code.codeSystemName", "SNOMED CT",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.13.1",
			 "constraints.validation.error", "VitalSignsOrganizer_templateId VitalSignsOrganizer_code VitalSignsOrganizer_statusCode VitalSignsOrganizer_effectiveTime VitalSignsOrganizer_vitalSignObservation",
			 "statusCode.codeSystem", "2.16.840.1.113883.5.14",
			 "code.displayName", "Vital signs",
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "code.code", "46680005"
		   });																				
		addAnnotation
		  (payersSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "PayersSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7"
		   });				
		addAnnotation
		  (historyOfPastIllnessSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HistoryOfPastIllnessSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.8"
		   });							
		addAnnotation
		  (chiefComplaintSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ChiefComplaintSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.13.2.1"
		   });							
		addAnnotation
		  (reasonForReferralSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ReasonForReferralSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.1"
		   });							
		addAnnotation
		  (historyOfPresentIllnessEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HistoryOfPresentIllness_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.4"
		   });							
		addAnnotation
		  (surgeriesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "SurgeriesSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.11"
		   });							
		addAnnotation
		  (codedSurgeriesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "CodedSurgeriesSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.12"
		   });							
		addAnnotation
		  (hospitalAdmissionDiagnosisSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HospitalAdmissionDiagnosisSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.3"
		   });							
		addAnnotation
		  (dischargeDiagnosisSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "DischargeDiagnosisSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.7"
		   });							
		addAnnotation
		  (admissionMedicationHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AdmissionMedicationHistorySection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.20"
		   });							
		addAnnotation
		  (hospitalDischargeMedicationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HospitalDischargeMedicationsSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.22"
		   });						
		addAnnotation
		  (codedAdvanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.35",
			 "constraints.validation.error", "CodedAdvanceDirectivesSection_templateId"
		   });							
		addAnnotation
		  (advanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AdvanceDirectivesSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.34"
		   });				
		addAnnotation
		  (physicalExamNarrativeSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "PhysicalExamNarrativeSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.24"
		   });							
		addAnnotation
		  (physicalExamSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "PhysicalExamSection_templateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.9.15"
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
		  (medicalDocumentEClass, 
		   source, 
		   new String[] {
			 "name", "ClinicalDocument"
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
		  (activeProblemsSectionEClass, 
		   source, 
		   new String[] {
			 "Active Problems Section", null
		   });																
		addAnnotation
		  (problemConcernEntryEClass, 
		   source, 
		   new String[] {
			 "Problem Concern Entry", null
		   });																																									
		addAnnotation
		  (allergyIntoleranceConcernEClass, 
		   source, 
		   new String[] {
			 "Allergy and Intolerance Concern", null
		   });							
		addAnnotation
		  (allergyIntoleranceEClass, 
		   source, 
		   new String[] {
			 "Allergies and Intolerances", null
		   });								
		addAnnotation
		  (allergiesReactionsSectionEClass, 
		   source, 
		   new String[] {
			 "Allergies and Other Adverse Reactions Section", null
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
		  (vitalSignsSectionEClass, 
		   source, 
		   new String[] {
		   });																																								
		addAnnotation
		  (vitalSignsOrganizerEClass, 
		   source, 
		   new String[] {
		   });																				
		addAnnotation
		  (payersSectionEClass, 
		   source, 
		   new String[] {
		   });																																																																					
		addAnnotation
		  (advanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
		   });												
	}

} //IHEPackageImpl
