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
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
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
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection;
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
	private EClass immunizationsSectionEClass = null;

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
	private EClass codedResultsSectionEClass = null;

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
	private EClass carePlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMedicalHistorySectionEClass = null;

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
	private EClass encounterHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalDevicesSectionEClass = null;

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
	public EClass getImmunizationsSection() {
		return immunizationsSectionEClass;
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
	public EClass getCodedResultsSection() {
		return codedResultsSectionEClass;
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
	public EClass getCarePlanSection() {
		return carePlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMedicalHistorySection() {
		return familyMedicalHistorySectionEClass;
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
	public EClass getEncounterHistorySection() {
		return encounterHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalDevicesSection() {
		return medicalDevicesSectionEClass;
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
		immunizationsSectionEClass = createEClass(IMMUNIZATIONS_SECTION);

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

		reviewOfSystemsSectionEClass = createEClass(REVIEW_OF_SYSTEMS_SECTION);

		hospitalCourseSectionEClass = createEClass(HOSPITAL_COURSE_SECTION);

		codedResultsSectionEClass = createEClass(CODED_RESULTS_SECTION);

		assessmentAndPlanSectionEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION);

		carePlanSectionEClass = createEClass(CARE_PLAN_SECTION);

		familyMedicalHistorySectionEClass = createEClass(FAMILY_MEDICAL_HISTORY_SECTION);

		socialHistorySectionEClass = createEClass(SOCIAL_HISTORY_SECTION);

		encounterHistorySectionEClass = createEClass(ENCOUNTER_HISTORY_SECTION);

		medicalDevicesSectionEClass = createEClass(MEDICAL_DEVICES_SECTION);
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
		CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		immunizationsSectionEClass.getESuperTypes().add(theCCDPackage.getImmunizationsSection());
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
		reviewOfSystemsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		hospitalCourseSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		codedResultsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		assessmentAndPlanSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		carePlanSectionEClass.getESuperTypes().add(theCCDPackage.getPlanOfCareSection());
		familyMedicalHistorySectionEClass.getESuperTypes().add(theCCDPackage.getFamilyHistorySection());
		socialHistorySectionEClass.getESuperTypes().add(theCCDPackage.getSocialHistorySection());
		encounterHistorySectionEClass.getESuperTypes().add(theCCDPackage.getEncountersSection());
		medicalDevicesSectionEClass.getESuperTypes().add(theCCDPackage.getMedicalEquipmentSection());

		// Initialize classes and features; add operations and parameters
		initEClass(immunizationsSectionEClass, ImmunizationsSection.class, "ImmunizationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateIHEImmunizationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationsAdministeredSectionEClass, MedicationsAdministeredSection.class, "MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsAdministeredSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsAdministeredSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concernEntryEClass, ConcernEntry.class, "ConcernEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(concernEntryEClass, ecorePackage.getEBoolean(), "validateConcernEntryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concernEntryEClass, ecorePackage.getEBoolean(), "validateConcernEntryEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicalDocumentEClass, MedicalDocument.class, "MedicalDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicalDocumentEClass, ecorePackage.getEBoolean(), "validateMedicalDocumentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activeProblemsSectionEClass, ActiveProblemsSection.class, "ActiveProblemsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(activeProblemsSectionEClass, ecorePackage.getEBoolean(), "validateActiveProblemsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activeProblemsSectionEClass, ecorePackage.getEBoolean(), "validateActiveProblemsSectionProblemConcernEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(problemConcernEntryEClass, ProblemConcernEntry.class, "ProblemConcernEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemConcernEntryEClass, ecorePackage.getEBoolean(), "validateProblemConcernEntryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemConcernEntryEClass, ecorePackage.getEBoolean(), "validateProblemConcernEntryProblemEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(problemEntryEClass, ProblemEntry.class, "ProblemEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemEntryEClass, ecorePackage.getEBoolean(), "validateProblemEntryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemEntryEClass, ecorePackage.getEBoolean(), "validateProblemEntryText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemEntryEClass, ecorePackage.getEBoolean(), "validateProblemEntryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationEClass, Medication.class, "Medication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationEClass, ecorePackage.getEBoolean(), "validateMedicationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationsSectionEClass, MedicationsSection.class, "MedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergyIntoleranceConcernEClass, AllergyIntoleranceConcern.class, "AllergyIntoleranceConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergyIntoleranceConcernEClass, ecorePackage.getEBoolean(), "validateAllergyIntoleranceConcernTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergyIntoleranceEClass, AllergyIntolerance.class, "AllergyIntolerance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergyIntoleranceEClass, ecorePackage.getEBoolean(), "validateAllergyIntoleranceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allergiesReactionsSectionEClass, AllergiesReactionsSection.class, "AllergiesReactionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(allergiesReactionsSectionEClass, ecorePackage.getEBoolean(), "validateAllergiesReactionsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(normalDosingEClass, NormalDosing.class, "NormalDosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(normalDosingEClass, ecorePackage.getEBoolean(), "validateNormalDosingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taperedDoseEClass, TaperedDose.class, "TaperedDose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(taperedDoseEClass, ecorePackage.getEBoolean(), "validateTaperedDoseTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(splitDosingEClass, SplitDosing.class, "SplitDosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(splitDosingEClass, ecorePackage.getEBoolean(), "validateSplitDosingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionalDosingEClass, ConditionalDosing.class, "ConditionalDosing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(conditionalDosingEClass, ecorePackage.getEBoolean(), "validateConditionalDosingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(combinationMedicationEClass, CombinationMedication.class, "CombinationMedication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(combinationMedicationEClass, ecorePackage.getEBoolean(), "validateCombinationMedicationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsSectionEClass, VitalSignsSection.class, "VitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateIHEVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codedVitalSignsSectionEClass, CodedVitalSignsSection.class, "CodedVitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateCodedVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(codedVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateCodedVitalSignsSectionVitalSignsOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignObservationEClass, VitalSignObservation.class, "VitalSignObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "validateVitalSignObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "validateVitalSignObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "validateVitalSignObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "validateVitalSignObservationInterpretationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "validateVitalSignObservationMethodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignObservationEClass, ecorePackage.getEBoolean(), "validateVitalSignObservationTargetSiteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleObservationEClass, SimpleObservation.class, "SimpleObservation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(simpleObservationEClass, ecorePackage.getEBoolean(), "validateSimpleObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleObservationEClass, ecorePackage.getEBoolean(), "validateSimpleObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simpleObservationEClass, ecorePackage.getEBoolean(), "validateSimpleObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsOrganizerEClass, VitalSignsOrganizer.class, "VitalSignsOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "validateIHEVitalSignsOrganizerTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "validateIHEVitalSignsOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "validateIHEVitalSignsOrganizerStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "validateIHEVitalSignsOrganizerEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "validateIHEVitalSignsOrganizerVitalSignObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(payersSectionEClass, PayersSection.class, "PayersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validateIHEPayersSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyOfPastIllnessSectionEClass, HistoryOfPastIllnessSection.class, "HistoryOfPastIllnessSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(historyOfPastIllnessSectionEClass, ecorePackage.getEBoolean(), "validateHistoryOfPastIllnessSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(historyOfPastIllnessSectionEClass, ecorePackage.getEBoolean(), "validateHistoryOfPastIllnessSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(surgeriesSectionEClass, SurgeriesSection.class, "SurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(surgeriesSectionEClass, ecorePackage.getEBoolean(), "validateSurgeriesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codedSurgeriesSectionEClass, CodedSurgeriesSection.class, "CodedSurgeriesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedSurgeriesSectionEClass, ecorePackage.getEBoolean(), "validateCodedSurgeriesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalAdmissionDiagnosisSectionEClass, HospitalAdmissionDiagnosisSection.class, "HospitalAdmissionDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalAdmissionDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateHospitalAdmissionDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hospitalAdmissionDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateHospitalAdmissionDiagnosisSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dischargeDiagnosisSectionEClass, DischargeDiagnosisSection.class, "DischargeDiagnosisSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dischargeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateDischargeDiagnosisSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dischargeDiagnosisSectionEClass, ecorePackage.getEBoolean(), "validateDischargeDiagnosisSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(admissionMedicationHistorySectionEClass, AdmissionMedicationHistorySection.class, "AdmissionMedicationHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(admissionMedicationHistorySectionEClass, ecorePackage.getEBoolean(), "validateAdmissionMedicationHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(admissionMedicationHistorySectionEClass, ecorePackage.getEBoolean(), "validateAdmissionMedicationHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hospitalDischargeMedicationsSectionEClass, HospitalDischargeMedicationsSection.class, "HospitalDischargeMedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalDischargeMedicationsSectionEClass, ecorePackage.getEBoolean(), "validateHospitalDischargeMedicationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hospitalDischargeMedicationsSectionEClass, ecorePackage.getEBoolean(), "validateHospitalDischargeMedicationsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codedAdvanceDirectivesSectionEClass, CodedAdvanceDirectivesSection.class, "CodedAdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateCodedAdvanceDirectivesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(advanceDirectivesSectionEClass, AdvanceDirectivesSection.class, "AdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(advanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateIHEAdvanceDirectivesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalExamNarrativeSectionEClass, PhysicalExamNarrativeSection.class, "PhysicalExamNarrativeSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(physicalExamNarrativeSectionEClass, ecorePackage.getEBoolean(), "validatePhysicalExamNarrativeSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(physicalExamNarrativeSectionEClass, ecorePackage.getEBoolean(), "validatePhysicalExamNarrativeSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalExamSectionEClass, PhysicalExamSection.class, "PhysicalExamSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(physicalExamSectionEClass, ecorePackage.getEBoolean(), "validatePhysicalExamSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(hospitalCourseSectionEClass, HospitalCourseSection.class, "HospitalCourseSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hospitalCourseSectionEClass, ecorePackage.getEBoolean(), "validateHospitalCourseSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hospitalCourseSectionEClass, ecorePackage.getEBoolean(), "validateHospitalCourseSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codedResultsSectionEClass, CodedResultsSection.class, "CodedResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(codedResultsSectionEClass, ecorePackage.getEBoolean(), "validateCodedResultsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(codedResultsSectionEClass, ecorePackage.getEBoolean(), "validateCodedResultsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(carePlanSectionEClass, CarePlanSection.class, "CarePlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(carePlanSectionEClass, ecorePackage.getEBoolean(), "validateCarePlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(familyMedicalHistorySectionEClass, FamilyMedicalHistorySection.class, "FamilyMedicalHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(familyMedicalHistorySectionEClass, ecorePackage.getEBoolean(), "validateFamilyMedicalHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(socialHistorySectionEClass, SocialHistorySection.class, "SocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateIHESocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encounterHistorySectionEClass, EncounterHistorySection.class, "EncounterHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encounterHistorySectionEClass, ecorePackage.getEBoolean(), "validateEncounterHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicalDevicesSectionEClass, MedicalDevicesSection.class, "MedicalDevicesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicalDevicesSectionEClass, ecorePackage.getEBoolean(), "validateMedicalDevicesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (immunizationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "IHEImmunizationsSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.23"
		   });							
		addAnnotation
		  (medicationsAdministeredSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MedicationsAdministeredSectionTemplateId MedicationsAdministeredSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.21",
			 "code.displayName", "MEDICATION ADMINISTERED",
			 "code.code", "18610-6"
		   });										
		addAnnotation
		  (concernEntryEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ConcernEntryTemplateId ConcernEntryEffectiveTime",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5.1"
		   });											
		addAnnotation
		  (medicalDocumentEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.1",
			 "constraints.validation.error", "MedicalDocumentTemplateId"
		   });						
		addAnnotation
		  (activeProblemsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.6",
			 "constraints.validation.error", "ActiveProblemsSectionTemplateId ActiveProblemsSectionProblemConcernEntry"
		   });												
		addAnnotation
		  (problemConcernEntryEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5.2",
			 "constraints.validation.error", "ProblemConcernEntryTemplateId ProblemConcernEntryProblemEntry"
		   });											
		addAnnotation
		  (problemEntryEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5",
			 "constraints.validation.error", "ProblemEntryTemplateId ProblemEntryText ProblemEntryValue"
		   });															
		addAnnotation
		  (medicationEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MedicationTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.7"
		   });							
		addAnnotation
		  (medicationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MedicationsSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.19"
		   });							
		addAnnotation
		  (allergyIntoleranceConcernEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AllergyIntoleranceConcernTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.5.3"
		   });							
		addAnnotation
		  (allergyIntoleranceEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AllergyIntoleranceTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.6"
		   });								
		addAnnotation
		  (allergiesReactionsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AllergiesReactionsSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.13"
		   });							
		addAnnotation
		  (normalDosingEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.7.1",
			 "constraints.validation.error", "NormalDosingTemplateId"
		   });							
		addAnnotation
		  (taperedDoseEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "TaperedDoseTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.8"
		   });						
		addAnnotation
		  (splitDosingEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.9",
			 "constraints.validation.error", "SplitDosingTemplateId"
		   });						
		addAnnotation
		  (conditionalDosingEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.10",
			 "constraints.validation.error", "ConditionalDosingTemplateId"
		   });						
		addAnnotation
		  (combinationMedicationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.11",
			 "constraints.validation.error", "CombinationMedicationTemplateId"
		   });							
		addAnnotation
		  (vitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "IHEVitalSignsSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.25"
		   });							
		addAnnotation
		  (codedVitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.2",
			 "constraints.validation.error", "CodedVitalSignsSectionTemplateId CodedVitalSignsSectionVitalSignsOrganizer"
		   });										
		addAnnotation
		  (vitalSignObservationEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.info", "VitalSignObservationInterpretationCode VitalSignObservationMethodCode VitalSignObservationTargetSiteCode",
			 "constraints.validation.error", "VitalSignObservationTemplateId VitalSignObservationCode VitalSignObservationValue",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.13.2"
		   });																											
		addAnnotation
		  (simpleObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.13",
			 "constraints.validation.error", "SimpleObservationTemplateId SimpleObservationId SimpleObservationStatusCode",
			 "statusCode.code", "completed"
		   });														
		addAnnotation
		  (vitalSignsOrganizerEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.4.13.1",
			 "constraints.validation.error", "IHEVitalSignsOrganizerTemplateId IHEVitalSignsOrganizerCode IHEVitalSignsOrganizerStatusCode IHEVitalSignsOrganizerEffectiveTime IHEVitalSignsOrganizerVitalSignObservation",
			 "code.displayName", "Vital signs",
			 "statusCode.code", "completed",
			 "code.code", "46680005"
		   });																							
		addAnnotation
		  (payersSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "IHEPayersSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7"
		   });							
		addAnnotation
		  (historyOfPastIllnessSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HistoryOfPastIllnessSectionTemplateId HistoryOfPastIllnessSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.8",
			 "code.displayName", "HISTORY OF PAST ILLNESS",
			 "code.code", "11348-0"
		   });											
		addAnnotation
		  (chiefComplaintSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ChiefComplaintSectionTemplateId ChiefComplaintSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.13.2.1",
			 "code.displayName", "CHIEF COMPLAINT",
			 "code.code", "10154-3"
		   });											
		addAnnotation
		  (reasonForReferralSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ReasonForReferralSectionTemplateId ReasonForReferralSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.1",
			 "code.displayName", "REASON FOR REFERRAL",
			 "code.code", "42349-1"
		   });											
		addAnnotation
		  (historyOfPresentIllnessEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HistoryOfPresentIllnessTemplateId HistoryOfPresentIllnessCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.4",
			 "code.displayName", "HISTORY OF PRESENT ILLNESS",
			 "code.code", "10164-2"
		   });											
		addAnnotation
		  (surgeriesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "SurgeriesSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.11"
		   });							
		addAnnotation
		  (codedSurgeriesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "CodedSurgeriesSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.12"
		   });							
		addAnnotation
		  (hospitalAdmissionDiagnosisSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HospitalAdmissionDiagnosisSectionTemplateId HospitalAdmissionDiagnosisSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.3",
			 "code.displayName", "HOSPITAL ADMISSION DX",
			 "code.code", "46241-6"
		   });											
		addAnnotation
		  (dischargeDiagnosisSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "DischargeDiagnosisSectionTemplateId DischargeDiagnosisSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.7",
			 "code.displayName", "HOSPITAL DISCHARGE DX",
			 "code.code", "11535-2"
		   });											
		addAnnotation
		  (admissionMedicationHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AdmissionMedicationHistorySectionTemplateId AdmissionMedicationHistorySectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.20",
			 "code.displayName", "MEDICATIONS ON ADMISSION",
			 "code.code", "42346-7"
		   });											
		addAnnotation
		  (hospitalDischargeMedicationsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HospitalDischargeMedicationsSectionTemplateId HospitalDischargeMedicationsSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.22",
			 "code.displayName", "HOSPITAL DISCHARGE MEDICATIONS",
			 "code.code", "10183-2"
		   });										
		addAnnotation
		  (codedAdvanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.35",
			 "constraints.validation.error", "CodedAdvanceDirectivesSectionTemplateId"
		   });							
		addAnnotation
		  (advanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "IHEAdvanceDirectivesSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.34"
		   });							
		addAnnotation
		  (physicalExamNarrativeSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "PhysicalExamNarrativeSectionTemplateId PhysicalExamNarrativeSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.24",
			 "code.displayName", "PHYSICAL EXAMINATION",
			 "code.code", "29545-1"
		   });											
		addAnnotation
		  (physicalExamSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "PhysicalExamSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.9.15"
		   });							
		addAnnotation
		  (reviewOfSystemsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "ReviewOfSystemsSectionTemplateId ReviewOfSystemsSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.18",
			 "code.displayName", "REVIEW OF SYSTEMS",
			 "code.code", "10187-3"
		   });											
		addAnnotation
		  (hospitalCourseSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "HospitalCourseSectionTemplateId HospitalCourseSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.5",
			 "code.displayName", "HOSPITAL COURSE",
			 "code.code", "8648-8"
		   });											
		addAnnotation
		  (codedResultsSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "CodedResultsSectionTemplateId CodedResultsSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.28",
			 "code.displayName", "STUDIES SUMMARY",
			 "code.code", "30954-2"
		   });											
		addAnnotation
		  (assessmentAndPlanSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "AssessmentAndPlanSectionTemplateId AssessmentAndPlanSectionCode",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.13.2.5",
			 "code.displayName", "ASSESSMENT AND PLAN",
			 "code.code", "51847-2"
		   });											
		addAnnotation
		  (carePlanSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "CarePlanSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.31"
		   });							
		addAnnotation
		  (familyMedicalHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "FamilyMedicalHistorySectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.14"
		   });							
		addAnnotation
		  (socialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "IHESocialHistorySectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.3.16"
		   });							
		addAnnotation
		  (encounterHistorySectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "EncounterHistorySectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.3"
		   });							
		addAnnotation
		  (medicalDevicesSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MedicalDevicesSectionTemplateId",
			 "templateId.root", "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.5"
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

} //IHEPackageImpl
