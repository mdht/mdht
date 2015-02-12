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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
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
import org.openhealthtools.mdht.uml.cda.ccd.Support;
import org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCDPackageImpl extends EPackageImpl implements CCDPackage {
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
	private EClass continuityOfCareDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAwarenessEClass = null;

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
	private EClass familyHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultObservationEClass = null;

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
	private EClass socialHistoryObservationEClass = null;

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
	private EClass immunizationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causeOfDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSeriesNumberObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionEClass = null;

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
	private EClass planOfCareActivityEClass = null;

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
	private EClass medicalEquipmentSectionEClass = null;

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
	private EClass advanceDirectivesSectionEClass = null;

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
	private EClass purposeSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeActivityEClass = null;

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
	private EClass advanceDirectiveObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payerEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coveredPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policySubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityEncounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coveragePlanDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportGuardianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccdRegistryDelegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemHealthStatusObservationEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CCDPackageImpl() {
		super(eNS_URI, CCDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CCDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CCDPackage init() {
		if (isInited) return (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

		// Obtain or create and register package
		CCDPackageImpl theCCDPackage = (CCDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CCDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CCDPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCCDPackage.createPackageContents();

		// Initialize created meta-data
		theCCDPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCCDPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CCDValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCCDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CCDPackage.eNS_URI, theCCDPackage);
		return theCCDPackage;
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
	public EClass getContinuityOfCareDocument() {
		return continuityOfCareDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemAct() {
		return problemActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemObservation() {
		return problemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSection() {
		return problemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatusObservation() {
		return problemStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeObservation() {
		return episodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAwareness() {
		return patientAwarenessEClass;
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
	public EClass getFamilyHistoryObservation() {
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer() {
		return familyHistoryOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultOrganizer() {
		return resultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultObservation() {
		return resultObservationEClass;
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
	public EClass getSocialHistoryObservation() {
		return socialHistoryObservationEClass;
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
	public EClass getImmunizationsSection() {
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersActivity() {
		return encountersActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationActivity() {
		return medicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyActivity() {
		return supplyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertsSection() {
		return alertsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertObservation() {
		return alertObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionObservation() {
		return reactionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverityObservation() {
		return severityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertStatusObservation() {
		return alertStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCauseOfDeathObservation() {
		return causeOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSection() {
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSeriesNumberObservation() {
		return medicationSeriesNumberObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatusObservation() {
		return medicationStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSection() {
		return proceduresSectionEClass;
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
	public EClass getPlanOfCareActivity() {
		return planOfCareActivityEClass;
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
	public EClass getMedicalEquipmentSection() {
		return medicalEquipmentSectionEClass;
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
	public EClass getAdvanceDirectivesSection() {
		return advanceDirectivesSectionEClass;
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
	public EClass getPurposeSection() {
		return purposeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeActivity() {
		return purposeActivityEClass;
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
	public EClass getAdvanceDirectiveObservation() {
		return advanceDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveStatusObservation() {
		return advanceDirectiveStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveVerification() {
		return advanceDirectiveVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageActivity() {
		return coverageActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyActivity() {
		return policyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntity() {
		return payerEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveredParty() {
		return coveredPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicySubscriber() {
		return policySubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationActivity() {
		return authorizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityAct() {
		return planOfCareActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivity() {
		return procedureActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientInstruction() {
		return patientInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentInstruction() {
		return fulfillmentInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusObservation() {
		return functionalStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityObservation() {
		return planOfCareActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityEncounter() {
		return planOfCareActivityEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityProcedure() {
		return planOfCareActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySubstanceAdministration() {
		return planOfCareActivitySubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySupply() {
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityAct() {
		return procedureActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityObservation() {
		return procedureActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityProcedure() {
		return procedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveragePlanDescription() {
		return coveragePlanDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportParticipant() {
		return supportParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportGuardian() {
		return supportGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCCDRegistryDelegate() {
		return ccdRegistryDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusObservation() {
		return statusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemHealthStatusObservation() {
		return problemHealthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDFactory getCCDFactory() {
		return (CCDFactory)getEFactoryInstance();
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
		medicationsSectionEClass = createEClass(MEDICATIONS_SECTION);

		medicationActivityEClass = createEClass(MEDICATION_ACTIVITY);

		medicationSeriesNumberObservationEClass = createEClass(MEDICATION_SERIES_NUMBER_OBSERVATION);

		medicationStatusObservationEClass = createEClass(MEDICATION_STATUS_OBSERVATION);

		statusObservationEClass = createEClass(STATUS_OBSERVATION);

		patientInstructionEClass = createEClass(PATIENT_INSTRUCTION);

		reactionObservationEClass = createEClass(REACTION_OBSERVATION);

		severityObservationEClass = createEClass(SEVERITY_OBSERVATION);

		supplyActivityEClass = createEClass(SUPPLY_ACTIVITY);

		fulfillmentInstructionEClass = createEClass(FULFILLMENT_INSTRUCTION);

		continuityOfCareDocumentEClass = createEClass(CONTINUITY_OF_CARE_DOCUMENT);

		problemSectionEClass = createEClass(PROBLEM_SECTION);

		problemActEClass = createEClass(PROBLEM_ACT);

		episodeObservationEClass = createEClass(EPISODE_OBSERVATION);

		problemObservationEClass = createEClass(PROBLEM_OBSERVATION);

		problemStatusObservationEClass = createEClass(PROBLEM_STATUS_OBSERVATION);

		problemHealthStatusObservationEClass = createEClass(PROBLEM_HEALTH_STATUS_OBSERVATION);

		ageObservationEClass = createEClass(AGE_OBSERVATION);

		familyHistorySectionEClass = createEClass(FAMILY_HISTORY_SECTION);

		socialHistorySectionEClass = createEClass(SOCIAL_HISTORY_SECTION);

		alertsSectionEClass = createEClass(ALERTS_SECTION);

		resultsSectionEClass = createEClass(RESULTS_SECTION);

		resultOrganizerEClass = createEClass(RESULT_ORGANIZER);

		resultObservationEClass = createEClass(RESULT_OBSERVATION);

		proceduresSectionEClass = createEClass(PROCEDURES_SECTION);

		encountersSectionEClass = createEClass(ENCOUNTERS_SECTION);

		planOfCareSectionEClass = createEClass(PLAN_OF_CARE_SECTION);

		planOfCareActivityEClass = createEClass(PLAN_OF_CARE_ACTIVITY);

		planOfCareActivityActEClass = createEClass(PLAN_OF_CARE_ACTIVITY_ACT);

		planOfCareActivityEncounterEClass = createEClass(PLAN_OF_CARE_ACTIVITY_ENCOUNTER);

		planOfCareActivityObservationEClass = createEClass(PLAN_OF_CARE_ACTIVITY_OBSERVATION);

		planOfCareActivityProcedureEClass = createEClass(PLAN_OF_CARE_ACTIVITY_PROCEDURE);

		planOfCareActivitySubstanceAdministrationEClass = createEClass(PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION);

		planOfCareActivitySupplyEClass = createEClass(PLAN_OF_CARE_ACTIVITY_SUPPLY);

		immunizationsSectionEClass = createEClass(IMMUNIZATIONS_SECTION);

		vitalSignsSectionEClass = createEClass(VITAL_SIGNS_SECTION);

		vitalSignsOrganizerEClass = createEClass(VITAL_SIGNS_ORGANIZER);

		medicalEquipmentSectionEClass = createEClass(MEDICAL_EQUIPMENT_SECTION);

		functionalStatusSectionEClass = createEClass(FUNCTIONAL_STATUS_SECTION);

		advanceDirectivesSectionEClass = createEClass(ADVANCE_DIRECTIVES_SECTION);

		advanceDirectiveObservationEClass = createEClass(ADVANCE_DIRECTIVE_OBSERVATION);

		payersSectionEClass = createEClass(PAYERS_SECTION);

		coverageActivityEClass = createEClass(COVERAGE_ACTIVITY);

		policyActivityEClass = createEClass(POLICY_ACTIVITY);

		purposeSectionEClass = createEClass(PURPOSE_SECTION);

		purposeActivityEClass = createEClass(PURPOSE_ACTIVITY);

		patientAwarenessEClass = createEClass(PATIENT_AWARENESS);

		familyHistoryObservationEClass = createEClass(FAMILY_HISTORY_OBSERVATION);

		familyHistoryOrganizerEClass = createEClass(FAMILY_HISTORY_ORGANIZER);

		socialHistoryObservationEClass = createEClass(SOCIAL_HISTORY_OBSERVATION);

		encountersActivityEClass = createEClass(ENCOUNTERS_ACTIVITY);

		alertObservationEClass = createEClass(ALERT_OBSERVATION);

		alertStatusObservationEClass = createEClass(ALERT_STATUS_OBSERVATION);

		causeOfDeathObservationEClass = createEClass(CAUSE_OF_DEATH_OBSERVATION);

		encounterLocationEClass = createEClass(ENCOUNTER_LOCATION);

		productEClass = createEClass(PRODUCT);

		advanceDirectiveStatusObservationEClass = createEClass(ADVANCE_DIRECTIVE_STATUS_OBSERVATION);

		advanceDirectiveVerificationEClass = createEClass(ADVANCE_DIRECTIVE_VERIFICATION);

		authorizationActivityEClass = createEClass(AUTHORIZATION_ACTIVITY);

		procedureActivityEClass = createEClass(PROCEDURE_ACTIVITY);

		functionalStatusObservationEClass = createEClass(FUNCTIONAL_STATUS_OBSERVATION);

		productInstanceEClass = createEClass(PRODUCT_INSTANCE);

		procedureActivityActEClass = createEClass(PROCEDURE_ACTIVITY_ACT);

		procedureActivityObservationEClass = createEClass(PROCEDURE_ACTIVITY_OBSERVATION);

		procedureActivityProcedureEClass = createEClass(PROCEDURE_ACTIVITY_PROCEDURE);

		payerEntityEClass = createEClass(PAYER_ENTITY);

		coveredPartyEClass = createEClass(COVERED_PARTY);

		policySubscriberEClass = createEClass(POLICY_SUBSCRIBER);

		coveragePlanDescriptionEClass = createEClass(COVERAGE_PLAN_DESCRIPTION);

		supportParticipantEClass = createEClass(SUPPORT_PARTICIPANT);

		supportEClass = createEClass(SUPPORT);

		supportGuardianEClass = createEClass(SUPPORT_GUARDIAN);

		commentEClass = createEClass(COMMENT);

		ccdRegistryDelegateEClass = createEClass(CCD_REGISTRY_DELEGATE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		medicationsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		medicationActivityEClass.getESuperTypes().add(theCDAPackage.getSubstanceAdministration());
		medicationSeriesNumberObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		medicationStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		statusObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		patientInstructionEClass.getESuperTypes().add(theCDAPackage.getAct());
		reactionObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		severityObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		supplyActivityEClass.getESuperTypes().add(theCDAPackage.getSupply());
		fulfillmentInstructionEClass.getESuperTypes().add(theCDAPackage.getAct());
		continuityOfCareDocumentEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		problemSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		problemActEClass.getESuperTypes().add(theCDAPackage.getAct());
		episodeObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		problemObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		problemStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		problemHealthStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		ageObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		familyHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		socialHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		alertsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		resultsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		resultOrganizerEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
		resultObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		proceduresSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		encountersSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		planOfCareSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		planOfCareActivityActEClass.getESuperTypes().add(theCDAPackage.getAct());
		planOfCareActivityActEClass.getESuperTypes().add(this.getPlanOfCareActivity());
		planOfCareActivityEncounterEClass.getESuperTypes().add(theCDAPackage.getEncounter());
		planOfCareActivityEncounterEClass.getESuperTypes().add(this.getPlanOfCareActivity());
		planOfCareActivityObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		planOfCareActivityObservationEClass.getESuperTypes().add(this.getPlanOfCareActivity());
		planOfCareActivityProcedureEClass.getESuperTypes().add(theCDAPackage.getProcedure());
		planOfCareActivityProcedureEClass.getESuperTypes().add(this.getPlanOfCareActivity());
		planOfCareActivitySubstanceAdministrationEClass.getESuperTypes().add(theCDAPackage.getSubstanceAdministration());
		planOfCareActivitySubstanceAdministrationEClass.getESuperTypes().add(this.getPlanOfCareActivity());
		planOfCareActivitySupplyEClass.getESuperTypes().add(theCDAPackage.getSupply());
		planOfCareActivitySupplyEClass.getESuperTypes().add(this.getPlanOfCareActivity());
		immunizationsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		vitalSignsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		vitalSignsOrganizerEClass.getESuperTypes().add(this.getResultOrganizer());
		medicalEquipmentSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		functionalStatusSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		advanceDirectivesSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		advanceDirectiveObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		payersSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		coverageActivityEClass.getESuperTypes().add(theCDAPackage.getAct());
		policyActivityEClass.getESuperTypes().add(theCDAPackage.getAct());
		purposeSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		purposeActivityEClass.getESuperTypes().add(theCDAPackage.getAct());
		patientAwarenessEClass.getESuperTypes().add(theCDAPackage.getParticipant2());
		familyHistoryObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		familyHistoryOrganizerEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
		socialHistoryObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		encountersActivityEClass.getESuperTypes().add(theCDAPackage.getEncounter());
		alertObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		alertStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		causeOfDeathObservationEClass.getESuperTypes().add(this.getFamilyHistoryObservation());
		encounterLocationEClass.getESuperTypes().add(theCDAPackage.getParticipant2());
		productEClass.getESuperTypes().add(theCDAPackage.getManufacturedProduct());
		advanceDirectiveStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		advanceDirectiveVerificationEClass.getESuperTypes().add(theCDAPackage.getParticipant2());
		authorizationActivityEClass.getESuperTypes().add(theCDAPackage.getAct());
		functionalStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		productInstanceEClass.getESuperTypes().add(theCDAPackage.getParticipantRole());
		procedureActivityActEClass.getESuperTypes().add(theCDAPackage.getAct());
		procedureActivityActEClass.getESuperTypes().add(this.getProcedureActivity());
		procedureActivityObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		procedureActivityObservationEClass.getESuperTypes().add(this.getProcedureActivity());
		procedureActivityProcedureEClass.getESuperTypes().add(theCDAPackage.getProcedure());
		procedureActivityProcedureEClass.getESuperTypes().add(this.getProcedureActivity());
		payerEntityEClass.getESuperTypes().add(theCDAPackage.getAssignedEntity());
		coveredPartyEClass.getESuperTypes().add(theCDAPackage.getParticipantRole());
		policySubscriberEClass.getESuperTypes().add(theCDAPackage.getParticipantRole());
		coveragePlanDescriptionEClass.getESuperTypes().add(theCDAPackage.getAct());
		supportParticipantEClass.getESuperTypes().add(theCDAPackage.getParticipant1());
		supportParticipantEClass.getESuperTypes().add(this.getSupport());
		supportGuardianEClass.getESuperTypes().add(theCDAPackage.getGuardian());
		supportGuardianEClass.getESuperTypes().add(this.getSupport());
		commentEClass.getESuperTypes().add(theCDAPackage.getAct());
		ccdRegistryDelegateEClass.getESuperTypes().add(theCDAPackage.getRegistryDelegate());

		// Initialize classes and features; add operations and parameters
		initEClass(medicationsSectionEClass, MedicationsSection.class, "MedicationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsSectionHasMedicationOrSupplyActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationsSectionEClass, ecorePackage.getEBoolean(), "validateMedicationsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(medicationsSectionEClass, this.getMedicationActivity(), "getMedicationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(medicationsSectionEClass, this.getSupplyActivity(), "getSupplyActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(medicationActivityEClass, MedicationActivity.class, "MedicationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityHasDoseQuantityOrRateQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityHasConsents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityHasPreconditionCriterion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityHasReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityHasReasonProblem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityHasProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityMaxDoseQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityRouteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityMedicationSeriesNumberObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityMedicationStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityPatientInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityReactionObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(medicationActivityEClass, this.getMedicationSeriesNumberObservation(), "getMedicationSeriesNumberObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(medicationActivityEClass, this.getMedicationStatusObservation(), "getMedicationStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(medicationActivityEClass, this.getPatientInstruction(), "getPatientInstructions", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(medicationActivityEClass, this.getReactionObservation(), "getReactionObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(medicationSeriesNumberObservationEClass, MedicationSeriesNumberObservation.class, "MedicationSeriesNumberObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicationSeriesNumberObservationEClass, ecorePackage.getEBoolean(), "validateMedicationSeriesNumberObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationSeriesNumberObservationEClass, ecorePackage.getEBoolean(), "validateMedicationSeriesNumberObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationSeriesNumberObservationEClass, ecorePackage.getEBoolean(), "validateMedicationSeriesNumberObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationSeriesNumberObservationEClass, ecorePackage.getEBoolean(), "validateMedicationSeriesNumberObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationSeriesNumberObservationEClass, ecorePackage.getEBoolean(), "validateMedicationSeriesNumberObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicationSeriesNumberObservationEClass, ecorePackage.getEBoolean(), "validateMedicationSeriesNumberObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicationStatusObservationEClass, MedicationStatusObservation.class, "MedicationStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statusObservationEClass, StatusObservation.class, "StatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationNoAdditionalParticipants", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statusObservationEClass, ecorePackage.getEBoolean(), "validateStatusObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(patientInstructionEClass, PatientInstruction.class, "PatientInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(patientInstructionEClass, ecorePackage.getEBoolean(), "validatePatientInstructionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patientInstructionEClass, ecorePackage.getEBoolean(), "validatePatientInstructionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reactionObservationEClass, ReactionObservation.class, "ReactionObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reactionObservationEClass, ecorePackage.getEBoolean(), "validateReactionObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reactionObservationEClass, ecorePackage.getEBoolean(), "validateReactionObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reactionObservationEClass, ecorePackage.getEBoolean(), "validateReactionObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reactionObservationEClass, ecorePackage.getEBoolean(), "validateReactionObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reactionObservationEClass, ecorePackage.getEBoolean(), "validateReactionObservationSeverityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(reactionObservationEClass, this.getSeverityObservation(), "getSeverityObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(severityObservationEClass, SeverityObservation.class, "SeverityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(severityObservationEClass, ecorePackage.getEBoolean(), "validateSeverityObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(severityObservationEClass, ecorePackage.getEBoolean(), "validateSeverityObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(severityObservationEClass, ecorePackage.getEBoolean(), "validateSeverityObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(severityObservationEClass, ecorePackage.getEBoolean(), "validateSeverityObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(severityObservationEClass, ecorePackage.getEBoolean(), "validateSeverityObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(severityObservationEClass, ecorePackage.getEBoolean(), "validateSeverityObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(supplyActivityEClass, SupplyActivity.class, "SupplyActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityHasAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityHasPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityHasParticipantLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityHasProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityQuantity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityRepeatNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityMedicationStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(supplyActivityEClass, ecorePackage.getEBoolean(), "validateSupplyActivityFulfillmentInstruction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(supplyActivityEClass, this.getMedicationStatusObservation(), "getMedicationStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(supplyActivityEClass, this.getFulfillmentInstruction(), "getFulfillmentInstructions", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(fulfillmentInstructionEClass, FulfillmentInstruction.class, "FulfillmentInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fulfillmentInstructionEClass, ecorePackage.getEBoolean(), "validateFulfillmentInstructionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fulfillmentInstructionEClass, ecorePackage.getEBoolean(), "validateFulfillmentInstructionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(continuityOfCareDocumentEClass, ContinuityOfCareDocument.class, "ContinuityOfCareDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentServiceEventRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentServiceEventClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentServiceEventEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentNoTemplateIdExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentOneOrTwoRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentHasAssignedAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentHasInformationRecipient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentFamilyHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentAlertsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentEncountersSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentMedicalEquipmentSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentFunctionalStatusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentAdvanceDirectivesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentPayersSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuityOfCareDocumentEClass, ecorePackage.getEBoolean(), "validateContinuityOfCareDocumentPurposeSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getFamilyHistorySection(), "getFamilyHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getAlertsSection(), "getAlertsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getEncountersSection(), "getEncountersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getMedicalEquipmentSection(), "getMedicalEquipmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getAdvanceDirectivesSection(), "getAdvanceDirectivesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getPayersSection(), "getPayersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(continuityOfCareDocumentEClass, this.getPurposeSection(), "getPurposeSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(problemSectionEClass, ProblemSection.class, "ProblemSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemSectionEClass, ecorePackage.getEBoolean(), "validateProblemSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemSectionEClass, ecorePackage.getEBoolean(), "validateProblemSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemSectionEClass, ecorePackage.getEBoolean(), "validateProblemSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemSectionEClass, ecorePackage.getEBoolean(), "validateProblemSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemSectionEClass, ecorePackage.getEBoolean(), "validateProblemSectionProblemAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(problemSectionEClass, this.getProblemAct(), "getProblemActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(problemActEClass, ProblemAct.class, "ProblemAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActEntryRelationshipRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActSubjectOfTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActContainsProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActContainsAlertObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActContainsPatientAwareness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActCodeNullFlavor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemActEClass, ecorePackage.getEBoolean(), "validateProblemActEpisodeObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(problemActEClass, this.getEpisodeObservation(), "getEpisodeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(problemActEClass, this.getProblemObservation(), "getProblemObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(episodeObservationEClass, EpisodeObservation.class, "EpisodeObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationOneEntryRelationshipSUBJ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationExistsEntryRelationshipSAS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(episodeObservationEClass, ecorePackage.getEBoolean(), "validateEpisodeObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(problemObservationEClass, ProblemObservation.class, "ProblemObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationContainsPatientAwareness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationProblemStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationProblemHealthStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(problemObservationEClass, ecorePackage.getEBoolean(), "validateProblemObservationAgeObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(problemObservationEClass, this.getProblemStatusObservation(), "getProblemStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(problemObservationEClass, this.getProblemHealthStatusObservation(), "getProblemHealthStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(problemObservationEClass, this.getAgeObservation(), "getAgeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(problemStatusObservationEClass, ProblemStatusObservation.class, "ProblemStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(problemHealthStatusObservationEClass, ProblemHealthStatusObservation.class, "ProblemHealthStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ageObservationEClass, AgeObservation.class, "AgeObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ageObservationEClass, ecorePackage.getEBoolean(), "validateAgeObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ageObservationEClass, ecorePackage.getEBoolean(), "validateAgeObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ageObservationEClass, ecorePackage.getEBoolean(), "validateAgeObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ageObservationEClass, ecorePackage.getEBoolean(), "validateAgeObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ageObservationEClass, ecorePackage.getEBoolean(), "validateAgeObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ageObservationEClass, ecorePackage.getEBoolean(), "validateAgeObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(familyHistorySectionEClass, FamilyHistorySection.class, "FamilyHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(familyHistorySectionEClass, ecorePackage.getEBoolean(), "validateFamilyHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(familyHistorySectionEClass, ecorePackage.getEBoolean(), "validateFamilyHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(familyHistorySectionEClass, ecorePackage.getEBoolean(), "validateFamilyHistorySectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(socialHistorySectionEClass, SocialHistorySection.class, "SocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSocialHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSocialHistorySectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alertsSectionEClass, AlertsSection.class, "AlertsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(alertsSectionEClass, ecorePackage.getEBoolean(), "validateAlertsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertsSectionEClass, ecorePackage.getEBoolean(), "validateAlertsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertsSectionEClass, ecorePackage.getEBoolean(), "validateAlertsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertsSectionEClass, ecorePackage.getEBoolean(), "validateAlertsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertsSectionEClass, ecorePackage.getEBoolean(), "validateAlertsSectionProblemAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(alertsSectionEClass, this.getProblemAct(), "getProblemActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(resultsSectionEClass, ResultsSection.class, "ResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateResultsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateResultsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateResultsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateResultsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateResultsSectionResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resultsSectionEClass, this.getResultOrganizer(), "getResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(resultOrganizerEClass, ResultOrganizer.class, "ResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerComponentElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateResultOrganizerResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resultOrganizerEClass, this.getResultObservation(), "getResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(resultObservationEClass, ResultObservation.class, "ResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationReferenceRangeRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationNoObservationRangeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationMethodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationInterpretationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateResultObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(proceduresSectionEClass, ProceduresSection.class, "ProceduresSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(proceduresSectionEClass, ecorePackage.getEBoolean(), "validateProceduresSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(proceduresSectionEClass, ecorePackage.getEBoolean(), "validateProceduresSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(proceduresSectionEClass, ecorePackage.getEBoolean(), "validateProceduresSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encountersSectionEClass, EncountersSection.class, "EncountersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encountersSectionEClass, ecorePackage.getEBoolean(), "validateEncountersSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encountersSectionEClass, ecorePackage.getEBoolean(), "validateEncountersSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encountersSectionEClass, ecorePackage.getEBoolean(), "validateEncountersSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareSectionEClass, PlanOfCareSection.class, "PlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionPlanOfCareActivityAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionPlanOfCareActivityEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionPlanOfCareActivityProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validatePlanOfCareSectionPlanOfCareActivitySupply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivity(), "getPlanOfCareActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivityAct(), "getPlanOfCareActivityAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivityEncounter(), "getPlanOfCareActivityEncounter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivityObservation(), "getPlanOfCareActivityObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivityProcedure(), "getPlanOfCareActivityProcedure", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivitySubstanceAdministration(), "getPlanOfCareActivitySubstanceAdministration", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(planOfCareSectionEClass, this.getPlanOfCareActivitySupply(), "getPlanOfCareActivitySupply", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(planOfCareActivityEClass, PlanOfCareActivity.class, "PlanOfCareActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planOfCareActivityActEClass, PlanOfCareActivityAct.class, "PlanOfCareActivityAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareActivityActEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityActMoodCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityActEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityActEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityActId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityActEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareActivityEncounterEClass, PlanOfCareActivityEncounter.class, "PlanOfCareActivityEncounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityEncounterMoodCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityEncounterTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityEncounterId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityEncounterEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityEncounterMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareActivityObservationEClass, PlanOfCareActivityObservation.class, "PlanOfCareActivityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityObservationMoodCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityObservationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareActivityProcedureEClass, PlanOfCareActivityProcedure.class, "PlanOfCareActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityProcedureMoodCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityProcedureTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityProcedureId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivityProcedureEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivityProcedureMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareActivitySubstanceAdministrationEClass, PlanOfCareActivitySubstanceAdministration.class, "PlanOfCareActivitySubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySubstanceAdministrationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySubstanceAdministrationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivitySubstanceAdministrationEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySubstanceAdministrationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planOfCareActivitySupplyEClass, PlanOfCareActivitySupply.class, "PlanOfCareActivitySupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(planOfCareActivitySupplyEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySupplyMoodCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivitySupplyEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySupplyTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivitySupplyEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySupplyId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(planOfCareActivitySupplyEClass, ecorePackage.getEBoolean(), "validatePlanOfCareActivitySupplyMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(immunizationsSectionEClass, ImmunizationsSection.class, "ImmunizationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateImmunizationsSectionClinicalStatements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateImmunizationsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateImmunizationsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateImmunizationsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(immunizationsSectionEClass, ecorePackage.getEBoolean(), "validateImmunizationsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vitalSignsSectionEClass, VitalSignsSection.class, "VitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		op = addEOperation(vitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateVitalSignsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		addEOperation(vitalSignsSectionEClass, this.getVitalSignsOrganizer(), "getVitalSignsOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(vitalSignsOrganizerEClass, VitalSignsOrganizer.class, "VitalSignsOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(vitalSignsOrganizerEClass, ecorePackage.getEBoolean(), "validateVitalSignsOrganizerInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medicalEquipmentSectionEClass, MedicalEquipmentSection.class, "MedicalEquipmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(medicalEquipmentSectionEClass, ecorePackage.getEBoolean(), "validateMedicalEquipmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicalEquipmentSectionEClass, ecorePackage.getEBoolean(), "validateMedicalEquipmentSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(medicalEquipmentSectionEClass, ecorePackage.getEBoolean(), "validateMedicalEquipmentSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functionalStatusSectionEClass, FunctionalStatusSection.class, "FunctionalStatusSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateFunctionalStatusSectionClinicalStatements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateFunctionalStatusSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateFunctionalStatusSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(functionalStatusSectionEClass, ecorePackage.getEBoolean(), "validateFunctionalStatusSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(advanceDirectivesSectionEClass, AdvanceDirectivesSection.class, "AdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(advanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectivesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectivesSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectivesSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectivesSectionAdvanceDirectiveObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(advanceDirectivesSectionEClass, this.getAdvanceDirectiveObservation(), "getAdvanceDirectiveObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(advanceDirectiveObservationEClass, AdvanceDirectiveObservation.class, "AdvanceDirectiveObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(advanceDirectiveObservationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveObservationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveObservationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveObservationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveObservationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveObservationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(payersSectionEClass, PayersSection.class, "PayersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validatePayersSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validatePayersSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validatePayersSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validatePayersSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(payersSectionEClass, ecorePackage.getEBoolean(), "validatePayersSectionCoverageActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(payersSectionEClass, this.getCoverageActivity(), "getCoverageActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coverageActivityEClass, CoverageActivity.class, "CoverageActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivitySequenceNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coverageActivityEClass, ecorePackage.getEBoolean(), "validateCoverageActivityPolicyActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coverageActivityEClass, this.getPolicyActivity(), "getPolicyActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(policyActivityEClass, PolicyActivity.class, "PolicyActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityPayerEntityIsRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityCoveredPartyIsRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityCoveredPartyTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivitySubscriberIsAllowed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivitySubscriberTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityEntryRelationshipREFR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityEntryRelationshipTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityPayerEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityCoveredParty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(policyActivityEClass, ecorePackage.getEBoolean(), "validatePolicyActivityPolicySubscriber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(policyActivityEClass, theCDAPackage.getAssignedEntity(), "getPayerEntity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(policyActivityEClass, theCDAPackage.getParticipantRole(), "getCoveredParty", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(policyActivityEClass, theCDAPackage.getParticipantRole(), "getSubscriber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(purposeSectionEClass, PurposeSection.class, "PurposeSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(purposeSectionEClass, ecorePackage.getEBoolean(), "validatePurposeSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeSectionEClass, ecorePackage.getEBoolean(), "validatePurposeSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeSectionEClass, ecorePackage.getEBoolean(), "validatePurposeSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeSectionEClass, ecorePackage.getEBoolean(), "validatePurposeSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeSectionEClass, ecorePackage.getEBoolean(), "validatePurposeSectionPurposeActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(purposeSectionEClass, this.getPurposeActivity(), "getPurposeActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(purposeActivityEClass, PurposeActivity.class, "PurposeActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityHasReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityReasonType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(purposeActivityEClass, ecorePackage.getEBoolean(), "validatePurposeActivityStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(patientAwarenessEClass, PatientAwareness.class, "PatientAwareness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(patientAwarenessEClass, ecorePackage.getEBoolean(), "validatePatientAwarenessParticipantRoleId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patientAwarenessEClass, ecorePackage.getEBoolean(), "validatePatientAwarenessTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patientAwarenessEClass, ecorePackage.getEBoolean(), "validatePatientAwarenessTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patientAwarenessEClass, ecorePackage.getEBoolean(), "validatePatientAwarenessAwarenessCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(familyHistoryObservationEClass, FamilyHistoryObservation.class, "FamilyHistoryObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(familyHistoryObservationEClass, ecorePackage.getEBoolean(), "validateFamilyHistoryObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, ecorePackage.getEBoolean(), "validateFamilyHistoryObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, ecorePackage.getEBoolean(), "validateFamilyHistoryObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(familyHistoryOrganizerEClass, FamilyHistoryOrganizer.class, "FamilyHistoryOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(familyHistoryOrganizerEClass, ecorePackage.getEBoolean(), "validateFamilyHistoryOrganizerTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(familyHistoryOrganizerEClass, ecorePackage.getEBoolean(), "validateFamilyHistoryOrganizerStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(socialHistoryObservationEClass, SocialHistoryObservation.class, "SocialHistoryObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(socialHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSocialHistoryObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encountersActivityEClass, EncountersActivity.class, "EncountersActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encountersActivityEClass, ecorePackage.getEBoolean(), "validateEncountersActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encountersActivityEClass, ecorePackage.getEBoolean(), "validateEncountersActivityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encountersActivityEClass, ecorePackage.getEBoolean(), "validateEncountersActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encountersActivityEClass, ecorePackage.getEBoolean(), "validateEncountersActivityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encountersActivityEClass, ecorePackage.getEBoolean(), "validateEncountersActivityEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alertObservationEClass, AlertObservation.class, "AlertObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationInformationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationAgentRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationPlayingEntityRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationAlertStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alertObservationEClass, ecorePackage.getEBoolean(), "validateAlertObservationReactionObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(alertObservationEClass, this.getAlertStatusObservation(), "getAlertStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(alertObservationEClass, this.getReactionObservation(), "getReactionObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(alertStatusObservationEClass, AlertStatusObservation.class, "AlertStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(causeOfDeathObservationEClass, CauseOfDeathObservation.class, "CauseOfDeathObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encounterLocationEClass, EncounterLocation.class, "EncounterLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encounterLocationEClass, ecorePackage.getEBoolean(), "validateEncounterLocationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(encounterLocationEClass, ecorePackage.getEBoolean(), "validateEncounterLocationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(productEClass, ecorePackage.getEBoolean(), "validateProductHasMaterial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(productEClass, ecorePackage.getEBoolean(), "validateProductHasMaterialCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(productEClass, ecorePackage.getEBoolean(), "validateProductHasMaterialCodeOriginalText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(productEClass, ecorePackage.getEBoolean(), "validateProductHasMaterialName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(productEClass, ecorePackage.getEBoolean(), "validateProductTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(advanceDirectiveStatusObservationEClass, AdvanceDirectiveStatusObservation.class, "AdvanceDirectiveStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(advanceDirectiveVerificationEClass, AdvanceDirectiveVerification.class, "AdvanceDirectiveVerification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(advanceDirectiveVerificationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveVerificationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveVerificationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveVerificationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(advanceDirectiveVerificationEClass, ecorePackage.getEBoolean(), "validateAdvanceDirectiveVerificationTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authorizationActivityEClass, AuthorizationActivity.class, "AuthorizationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(authorizationActivityEClass, ecorePackage.getEBoolean(), "validateAuthorizationActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(authorizationActivityEClass, ecorePackage.getEBoolean(), "validateAuthorizationActivityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(authorizationActivityEClass, ecorePackage.getEBoolean(), "validateAuthorizationActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(authorizationActivityEClass, ecorePackage.getEBoolean(), "validateAuthorizationActivityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(procedureActivityEClass, ProcedureActivity.class, "ProcedureActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalStatusObservationEClass, FunctionalStatusObservation.class, "FunctionalStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productInstanceEClass, ProductInstance.class, "ProductInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(productInstanceEClass, ecorePackage.getEBoolean(), "validateProductInstanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(productInstanceEClass, ecorePackage.getEBoolean(), "validateProductInstanceClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(procedureActivityActEClass, ProcedureActivityAct.class, "ProcedureActivityAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(procedureActivityActEClass, ecorePackage.getEBoolean(), "validateProcedureActivityActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(procedureActivityObservationEClass, ProcedureActivityObservation.class, "ProcedureActivityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(procedureActivityObservationEClass, ecorePackage.getEBoolean(), "validateProcedureActivityObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(procedureActivityProcedureEClass, ProcedureActivityProcedure.class, "ProcedureActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(procedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateProcedureActivityProcedureTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(payerEntityEClass, PayerEntity.class, "PayerEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(payerEntityEClass, ecorePackage.getEBoolean(), "validatePayerEntityId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coveredPartyEClass, CoveredParty.class, "CoveredParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coveredPartyEClass, ecorePackage.getEBoolean(), "validateCoveredPartyId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coveredPartyEClass, ecorePackage.getEBoolean(), "validateCoveredPartyCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(policySubscriberEClass, PolicySubscriber.class, "PolicySubscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(policySubscriberEClass, ecorePackage.getEBoolean(), "validatePolicySubscriberId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coveragePlanDescriptionEClass, CoveragePlanDescription.class, "CoveragePlanDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coveragePlanDescriptionEClass, ecorePackage.getEBoolean(), "validateCoveragePlanDescriptionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coveragePlanDescriptionEClass, ecorePackage.getEBoolean(), "validateCoveragePlanDescriptionId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coveragePlanDescriptionEClass, ecorePackage.getEBoolean(), "validateCoveragePlanDescriptionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(supportParticipantEClass, SupportParticipant.class, "SupportParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportEClass, Support.class, "Support", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportGuardianEClass, SupportGuardian.class, "SupportGuardian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(commentEClass, ecorePackage.getEBoolean(), "validateCommentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commentEClass, ecorePackage.getEBoolean(), "validateCommentClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commentEClass, ecorePackage.getEBoolean(), "validateCommentMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commentEClass, ecorePackage.getEBoolean(), "validateCommentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ccdRegistryDelegateEClass, CCDRegistryDelegate.class, "CCDRegistryDelegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
		  (medicationStatusObservationEClass, 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
		addAnnotation
		  (problemStatusObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (problemHealthStatusObservationEClass, 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																																																																																																																																																																																																																																																																		
		addAnnotation
		  (vitalSignsOrganizerEClass, 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																																																																																																																																																																																																																					
		addAnnotation
		  (alertStatusObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (causeOfDeathObservationEClass, 
		   source, 
		   new String[] {
		   });																																	
		addAnnotation
		  (advanceDirectiveStatusObservationEClass, 
		   source, 
		   new String[] {
		   });																																		
		addAnnotation
		  (functionalStatusObservationEClass, 
		   source, 
		   new String[] {
		   });																																																																									
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
			 "registryDelegate", "CCDRegistryDelegate"
		   });			
		addAnnotation
		  (medicationsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.1.8",
			 "code.displayName", "History of medication use",
			 "constraints.validation.error", "MedicationsSectionTemplateId MedicationsSectionCode MedicationsSectionTitle MedicationsSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "MedicationsSectionHasMedicationOrSupplyActivity",
			 "code.code", "10160-0"
		   });																											
		addAnnotation
		  (medicationActivityEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.24",
			 "constraints.validation.error", "MedicationActivityTemplateId MedicationActivityMoodCode MedicationActivityInformationSource MedicationActivityHasReasonProblem MedicationActivityHasProduct MedicationActivityId",
			 "routeCode.codeSystem", "2.16.840.1.113883.5.112",
			 "constraints.validation.warning", "MedicationActivityHasDoseQuantityOrRateQuantity MedicationActivityStatusCode MedicationActivityEffectiveTime MedicationActivityRouteCode",
			 "routeCode.codeSystemName", "HL7 RouteOfAdministration",
			 "constraints.validation.info", "MedicationActivityHasConsents MedicationActivityHasPreconditionCriterion MedicationActivityHasReason MedicationActivityMaxDoseQuantity MedicationActivityMedicationSeriesNumberObservation MedicationActivityMedicationStatusObservation MedicationActivityPatientInstruction MedicationActivityReactionObservation"
		   });																																																																																			
		addAnnotation
		  (medicationSeriesNumberObservationEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Dose number",
			 "templateId.root", "2.16.840.1.113883.10.20.1.46",
			 "constraints.validation.error", "MedicationSeriesNumberObservationTemplateId MedicationSeriesNumberObservationClassCode MedicationSeriesNumberObservationMoodCode MedicationSeriesNumberObservationStatusCode MedicationSeriesNumberObservationCode MedicationSeriesNumberObservationValue",
			 "code.codeSystemName", "LOINC",
			 "classCode", "OBS",
			 "code.code", "30973-2",
			 "moodCode", "EVN"
		   });																										
		addAnnotation
		  (medicationStatusObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.47",
			 "constraints.validation.error", "MedicationStatusObservationTemplateId"
		   });			
		addAnnotation
		  (statusObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Status",
			 "templateId.root", "2.16.840.1.113883.10.20.1.57",
			 "constraints.validation.error", "StatusObservationTemplateId StatusObservationNoAdditionalParticipants StatusObservationClassCode StatusObservationMoodCode StatusObservationCode StatusObservationStatusCode StatusObservationValue",
			 "code.codeSystemName", "LOINC",
			 "classCode", "OBS",
			 "code.code", "33999-4",
			 "moodCode", "EVN"
		   });																															
		addAnnotation
		  (patientInstructionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.49",
			 "constraints.validation.error", "PatientInstructionTemplateId PatientInstructionMoodCode",
			 "moodCode", "INT"
		   });										
		addAnnotation
		  (reactionObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.54",
			 "constraints.validation.error", "ReactionObservationTemplateId ReactionObservationClassCode ReactionObservationMoodCode ReactionObservationStatusCode",
			 "classCode", "OBS",
			 "constraints.validation.info", "ReactionObservationSeverityObservation",
			 "moodCode", "EVN"
		   });																								
		addAnnotation
		  (severityObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.5.4",
			 "code.displayName", "Severity observation",
			 "templateId.root", "2.16.840.1.113883.10.20.1.55",
			 "constraints.validation.error", "SeverityObservationTemplateId SeverityObservationClassCode SeverityObservationMoodCode SeverityObservationCode SeverityObservationStatusCode SeverityObservationValue",
			 "code.codeSystemName", "ActCode",
			 "classCode", "OBS",
			 "code.code", "SEV",
			 "moodCode", "EVN"
		   });																										
		addAnnotation
		  (supplyActivityEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.34",
			 "constraints.validation.error", "SupplyActivityTemplateId SupplyActivityMoodCode SupplyActivityInformationSource SupplyActivityId",
			 "constraints.validation.warning", "SupplyActivityStatusCode SupplyActivityEffectiveTime",
			 "constraints.validation.info", "SupplyActivityHasAuthor SupplyActivityHasPerformer SupplyActivityHasParticipantLocation SupplyActivityHasProduct SupplyActivityQuantity SupplyActivityRepeatNumber SupplyActivityMedicationStatusObservation SupplyActivityFulfillmentInstruction"
		   });																																																															
		addAnnotation
		  (fulfillmentInstructionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.43",
			 "constraints.validation.error", "FulfillmentInstructionTemplateId FulfillmentInstructionMoodCode",
			 "moodCode", "INT"
		   });										
		addAnnotation
		  (continuityOfCareDocumentEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Summarization of episode note",
			 "templateId.root", "2.16.840.1.113883.10.20.1",
			 "constraints.validation.error", "ContinuityOfCareDocumentTemplateId ContinuityOfCareDocumentServiceEventRequired ContinuityOfCareDocumentServiceEventClassCode ContinuityOfCareDocumentServiceEventEffectiveTime ContinuityOfCareDocumentNoTemplateIdExtension ContinuityOfCareDocumentOneOrTwoRecordTarget ContinuityOfCareDocumentHasAssignedAuthorNullFlavor ContinuityOfCareDocumentCode ContinuityOfCareDocumentLanguageCode",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "ContinuityOfCareDocumentHasAssignedAuthor ContinuityOfCareDocumentProblemSection ContinuityOfCareDocumentFamilyHistorySection ContinuityOfCareDocumentSocialHistorySection ContinuityOfCareDocumentAlertsSection ContinuityOfCareDocumentMedicationsSection ContinuityOfCareDocumentResultsSection ContinuityOfCareDocumentProceduresSection ContinuityOfCareDocumentEncountersSection ContinuityOfCareDocumentPlanOfCareSection ContinuityOfCareDocumentImmunizationsSection ContinuityOfCareDocumentVitalSignsSection ContinuityOfCareDocumentMedicalEquipmentSection ContinuityOfCareDocumentFunctionalStatusSection ContinuityOfCareDocumentAdvanceDirectivesSection ContinuityOfCareDocumentPayersSection",
			 "code.code", "34133-9",
			 "constraints.validation.info", "ContinuityOfCareDocumentHasInformationRecipient ContinuityOfCareDocumentPurposeSection"
		   });																																																																																																																																														
		addAnnotation
		  (problemSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Problem list",
			 "templateId.root", "2.16.840.1.113883.10.20.1.11",
			 "constraints.validation.error", "ProblemSectionTemplateId ProblemSectionCode ProblemSectionTitle ProblemSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "ProblemSectionProblemAct",
			 "code.code", "11450-4"
		   });																								
		addAnnotation
		  (problemActEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.27",
			 "constraints.validation.error", "ProblemActTemplateId ProblemActEntryRelationshipRequired ProblemActClassCode ProblemActMoodCode ProblemActId ProblemActCodeNullFlavor",
			 "code.nullFlavor", "NA",
			 "classCode", "ACT",
			 "constraints.validation.warning", "ProblemActSubjectOfTarget ProblemActContainsProblemObservation ProblemActContainsAlertObservation",
			 "moodCode", "EVN",
			 "constraints.validation.info", "ProblemActContainsPatientAwareness ProblemActEffectiveTime ProblemActEpisodeObservation"
		   });																																																						
		addAnnotation
		  (episodeObservationEClass, 
		   source, 
		   new String[] {
			 "value.codeSystemName", "SNOMEDCT",
			 "code.codeSystem", "2.16.840.1.113883.5.4",
			 "templateId.root", "2.16.840.1.113883.10.20.1.41",
			 "constraints.validation.error", "EpisodeObservationTemplateId EpisodeObservationOneEntryRelationshipSUBJ EpisodeObservationClassCode EpisodeObservationMoodCode EpisodeObservationStatusCode",
			 "code.code", "ASSERTION",
			 "constraints.validation.info", "EpisodeObservationExistsEntryRelationshipSAS",
			 "value.displayName", "Clinical finding",
			 "statusCode.code", "completed",
			 "value.code", "404684003",
			 "code.codeSystemName", "ActCode",
			 "constraints.validation.warning", "EpisodeObservationCode EpisodeObservationValue",
			 "classCode", "OBS",
			 "moodCode", "EVN",
			 "value.codeSystem", "2.16.840.1.113883.6.96"
		   });																																		
		addAnnotation
		  (problemObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.28",
			 "constraints.validation.error", "ProblemObservationTemplateId ProblemObservationInformationSource ProblemObservationMoodCode ProblemObservationStatusCode",
			 "classCode", "OBS",
			 "constraints.validation.warning", "ProblemObservationEffectiveTime",
			 "constraints.validation.info", "ProblemObservationContainsPatientAwareness ProblemObservationProblemStatusObservation ProblemObservationProblemHealthStatusObservation ProblemObservationAgeObservation",
			 "moodCode", "EVN"
		   });																																												
		addAnnotation
		  (problemStatusObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.50",
			 "constraints.validation.error", "ProblemStatusObservationTemplateId"
		   });			
		addAnnotation
		  (problemHealthStatusObservationEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.1.51",
			 "code.displayName", "Health status",
			 "constraints.validation.error", "ProblemHealthStatusObservationTemplateId StatusObservationCode",
			 "code.codeSystemName", "LOINC",
			 "code.code", "11323-3"
		   });			
		addAnnotation
		  (ageObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "code.displayName", "Age",
			 "templateId.root", "2.16.840.1.113883.10.20.1.38",
			 "constraints.validation.error", "AgeObservationTemplateId AgeObservationClassCode AgeObservationMoodCode AgeObservationCode AgeObservationStatusCode AgeObservationValue",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "OBS",
			 "code.code", "397659008",
			 "moodCode", "EVN"
		   });																											
		addAnnotation
		  (familyHistorySectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "History of family member diseases",
			 "templateId.root", "2.16.840.1.113883.10.20.1.4",
			 "constraints.validation.error", "FamilyHistorySectionTemplateId FamilyHistorySectionCode FamilyHistorySectionTitle",
			 "code.codeSystemName", "LOINC",
			 "code.code", "10157-6"
		   });															
		addAnnotation
		  (socialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Social history",
			 "templateId.root", "2.16.840.1.113883.10.20.1.15",
			 "constraints.validation.error", "SocialHistorySectionTemplateId SocialHistorySectionCode",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "SocialHistorySectionTitle",
			 "code.code", "29762-2"
		   });															
		addAnnotation
		  (alertsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Allergies, adverse reactions, alerts",
			 "templateId.root", "2.16.840.1.113883.10.20.1.2",
			 "constraints.validation.error", "AlertsSectionTemplateId AlertsSectionCode AlertsSectionTitle AlertsSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "AlertsSectionProblemAct",
			 "code.code", "48765-2"
		   });																									
		addAnnotation
		  (resultsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Relevant diagnostic tests and/or laboratory data",
			 "templateId.root", "2.16.840.1.113883.10.20.1.14",
			 "constraints.validation.error", "ResultsSectionTemplateId ResultsSectionCode ResultsSectionTitle ResultsSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "ResultsSectionResultOrganizer",
			 "code.code", "30954-2"
		   });																									
		addAnnotation
		  (resultOrganizerEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.32",
			 "constraints.validation.error", "ResultOrganizerTemplateId ResultOrganizerComponentElement ResultOrganizerInformationSource ResultOrganizerMoodCode ResultOrganizerId ResultOrganizerCode ResultOrganizerStatusCode ResultOrganizerResultObservation",
			 "moodCode", "EVN"
		   });																																				
		addAnnotation
		  (resultObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.31",
			 "constraints.validation.error", "ResultObservationTemplateId ResultObservationNoObservationRangeCode ResultObservationInformationSource ResultObservationMoodCode ResultObservationId ResultObservationStatusCode ResultObservationCode ResultObservationValue",
			 "constraints.validation.warning", "ResultObservationReferenceRangeRequired ResultObservationEffectiveTime ResultObservationInterpretationCode",
			 "constraints.validation.info", "ResultObservationMethodCode",
			 "moodCode", "EVN"
		   });																																																			
		addAnnotation
		  (proceduresSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "History of procedures",
			 "templateId.root", "2.16.840.1.113883.10.20.1.12",
			 "constraints.validation.error", "ProceduresSectionTemplateId ProceduresSectionCode ProceduresSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "code.code", "47519-4"
		   });															
		addAnnotation
		  (encountersSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "History of encounters",
			 "templateId.root", "2.16.840.1.113883.10.20.1.3",
			 "constraints.validation.error", "EncountersSectionTemplateId EncountersSectionCode EncountersSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "code.code", "46240-8"
		   });															
		addAnnotation
		  (planOfCareSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.1.10",
			 "code.displayName", "Treatment plan",
			 "constraints.validation.error", "PlanOfCareSectionTemplateId PlanOfCareSectionCode PlanOfCareSectionTitle PlanOfCareSectionText",
			 "code.codeSystemName", "LOINC",
			 "code.code", "18776-5",
			 "constraints.validation.info", "PlanOfCareSectionPlanOfCareActivityAct PlanOfCareSectionPlanOfCareActivityEncounter PlanOfCareSectionPlanOfCareActivityObservation PlanOfCareSectionPlanOfCareActivityProcedure PlanOfCareSectionPlanOfCareActivitySubstanceAdministration PlanOfCareSectionPlanOfCareActivitySupply"
		   });																																																						
		addAnnotation
		  (planOfCareActivityActEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.25",
			 "constraints.validation.error", "PlanOfCareActivityActTemplateId PlanOfCareActivityActMoodCodeValue PlanOfCareActivityActId PlanOfCareActivityActMoodCode"
		   });																		
		addAnnotation
		  (planOfCareActivityEncounterEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.25",
			 "constraints.validation.error", "PlanOfCareActivityEncounterTemplateId PlanOfCareActivityEncounterMoodCodeValue PlanOfCareActivityEncounterId PlanOfCareActivityEncounterMoodCode"
		   });																		
		addAnnotation
		  (planOfCareActivityObservationEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.25",
			 "constraints.validation.error", "PlanOfCareActivityObservationTemplateId PlanOfCareActivityObservationMoodCodeValue PlanOfCareActivityObservationId PlanOfCareActivityObservationMoodCode"
		   });																		
		addAnnotation
		  (planOfCareActivityProcedureEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.25",
			 "constraints.validation.error", "PlanOfCareActivityProcedureTemplateId PlanOfCareActivityProcedureMoodCodeValue PlanOfCareActivityProcedureId PlanOfCareActivityProcedureMoodCode"
		   });																		
		addAnnotation
		  (planOfCareActivitySubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.25",
			 "constraints.validation.error", "PlanOfCareActivitySubstanceAdministrationTemplateId PlanOfCareActivitySubstanceAdministrationMoodCodeValue PlanOfCareActivitySubstanceAdministrationId PlanOfCareActivitySubstanceAdministrationMoodCode"
		   });																		
		addAnnotation
		  (planOfCareActivitySupplyEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.25",
			 "constraints.validation.error", "PlanOfCareActivitySupplyTemplateId PlanOfCareActivitySupplyMoodCodeValue PlanOfCareActivitySupplyId PlanOfCareActivitySupplyMoodCode"
		   });																		
		addAnnotation
		  (immunizationsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.1.6",
			 "code.displayName", "History of immunizations",
			 "constraints.validation.error", "ImmunizationsSectionTemplateId ImmunizationsSectionCode ImmunizationsSectionTitle ImmunizationsSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "ImmunizationsSectionClinicalStatements",
			 "code.code", "11369-6"
		   });																							
		addAnnotation
		  (vitalSignsSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Vital signs",
			 "templateId.root", "2.16.840.1.113883.10.20.1.16",
			 "constraints.validation.error", "VitalSignsSectionTemplateId VitalSignsSectionCode VitalSignsSectionTitle VitalSignsSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "VitalSignsSectionVitalSignsOrganizer",
			 "code.code", "8716-3"
		   });																								
		addAnnotation
		  (vitalSignsOrganizerEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.35",
			 "constraints.validation.error", "VitalSignsOrganizerTemplateId VitalSignsOrganizerInformationSource"
		   });								
		addAnnotation
		  (medicalEquipmentSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "History of medical device use",
			 "templateId.root", "2.16.840.1.113883.10.20.1.7",
			 "constraints.validation.error", "MedicalEquipmentSectionTemplateId MedicalEquipmentSectionCode MedicalEquipmentSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "code.code", "46264-8"
		   });															
		addAnnotation
		  (functionalStatusSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Functional status assessment",
			 "templateId.root", "2.16.840.1.113883.10.20.1.5",
			 "constraints.validation.error", "FunctionalStatusSectionTemplateId FunctionalStatusSectionCode FunctionalStatusSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "FunctionalStatusSectionClinicalStatements",
			 "code.code", "47420-5"
		   });																		
		addAnnotation
		  (advanceDirectivesSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.1.1",
			 "code.displayName", "Advance directives",
			 "constraints.validation.error", "AdvanceDirectivesSectionTemplateId AdvanceDirectivesSectionCode AdvanceDirectivesSectionTitle AdvanceDirectivesSectionAdvanceDirectiveObservation",
			 "code.codeSystemName", "LOINC",
			 "code.code", "42348-3"
		   });																				
		addAnnotation
		  (advanceDirectiveObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.17",
			 "constraints.validation.error", "AdvanceDirectiveObservationTemplateId AdvanceDirectiveObservationClassCode AdvanceDirectiveObservationMoodCode AdvanceDirectiveObservationId AdvanceDirectiveObservationStatusCode",
			 "constraints.validation.warning", "AdvanceDirectiveObservationEffectiveTime",
			 "classCode", "OBS",
			 "moodCode", "EVN"
		   });																											
		addAnnotation
		  (payersSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Payment sources",
			 "templateId.root", "2.16.840.1.113883.10.20.1.9",
			 "constraints.validation.error", "PayersSectionTemplateId PayersSectionCode PayersSectionTitle PayersSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "PayersSectionCoverageActivity",
			 "code.code", "48768-6"
		   });																								
		addAnnotation
		  (coverageActivityEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Payment sources",
			 "templateId.root", "2.16.840.1.113883.10.20.1.20",
			 "constraints.validation.error", "CoverageActivityTemplateId CoverageActivityInformationSource CoverageActivityClassCode CoverageActivityMoodCode CoverageActivityId CoverageActivityStatusCode CoverageActivityCode CoverageActivityPolicyActivity",
			 "code.codeSystemName", "LOINC",
			 "classCode", "ACT",
			 "code.code", "48768-6",
			 "constraints.validation.info", "CoverageActivitySequenceNumber",
			 "moodCode", "DEF"
		   });																																								
		addAnnotation
		  (policyActivityEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.26",
			 "constraints.validation.error", "PolicyActivityTemplateId PolicyActivityPayerEntityIsRequired PolicyActivityCoveredPartyIsRequired PolicyActivityEntryRelationshipREFR PolicyActivityEntryRelationshipTarget PolicyActivityClassCode PolicyActivityMoodCode PolicyActivityId PolicyActivityStatusCode PolicyActivityPayerEntity PolicyActivityCoveredParty",
			 "classCode", "ACT",
			 "constraints.validation.info", "PolicyActivityCoveredPartyTime PolicyActivitySubscriberIsAllowed PolicyActivitySubscriberTime PolicyActivityPolicySubscriber",
			 "moodCode", "EVN"
		   });																																																																					
		addAnnotation
		  (purposeSectionEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Summary purpose",
			 "templateId.root", "2.16.840.1.113883.10.20.1.13",
			 "constraints.validation.error", "PurposeSectionTemplateId PurposeSectionCode PurposeSectionTitle PurposeSectionText",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "PurposeSectionPurposeActivity",
			 "code.code", "48764-5"
		   });																									
		addAnnotation
		  (purposeActivityEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "templateId.root", "2.16.840.1.113883.10.20.1.30",
			 "code.displayName", "Documentation procedure",
			 "constraints.validation.error", "PurposeActivityTemplateId PurposeActivityHasReason PurposeActivityReasonType PurposeActivityClassCode PurposeActivityMoodCode PurposeActivityCode PurposeActivityStatusCode",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "ACT",
			 "code.code", "23745001",
			 "moodCode", "EVN"
		   });																														
		addAnnotation
		  (patientAwarenessEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.48",
			 "constraints.validation.error", "PatientAwarenessTemplateId PatientAwarenessParticipantRoleId PatientAwarenessTypeCode PatientAwarenessAwarenessCode",
			 "typeCode", "SBJ"
		   });																		
		addAnnotation
		  (familyHistoryObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.22",
			 "constraints.validation.error", "FamilyHistoryObservationTemplateId FamilyHistoryObservationId FamilyHistoryObservationStatusCode"
		   });														
		addAnnotation
		  (familyHistoryOrganizerEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.23",
			 "constraints.validation.error", "FamilyHistoryOrganizerTemplateId FamilyHistoryOrganizerStatusCode"
		   });										
		addAnnotation
		  (socialHistoryObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.33",
			 "constraints.validation.error", "SocialHistoryObservationTemplateId"
		   });						
		addAnnotation
		  (encountersActivityEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.21",
			 "constraints.validation.error", "EncountersActivityTemplateId EncountersActivityClassCode EncountersActivityMoodCode EncountersActivityId",
			 "classCode", "ENC",
			 "constraints.validation.info", "EncountersActivityEffectiveTime",
			 "moodCode", "EVN"
		   });																						
		addAnnotation
		  (alertObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "templateId.root", "2.16.840.1.113883.10.20.1.18",
			 "constraints.validation.error", "AlertObservationTemplateId AlertObservationInformationSource AlertObservationPlayingEntityRequired AlertObservationMoodCode AlertObservationStatusCode",
			 "constraints.validation.warning", "AlertObservationAgentRepresentation",
			 "constraints.validation.info", "AlertObservationEffectiveTime AlertObservationAlertStatusObservation AlertObservationReactionObservation",
			 "moodCode", "EVN"
		   });																																										
		addAnnotation
		  (alertStatusObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.39",
			 "constraints.validation.error", "AlertStatusObservationTemplateId"
		   });			
		addAnnotation
		  (causeOfDeathObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.42",
			 "constraints.validation.error", "CauseOfDeathObservationTemplateId"
		   });			
		addAnnotation
		  (encounterLocationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.45",
			 "constraints.validation.error", "EncounterLocationTemplateId EncounterLocationTypeCode",
			 "typeCode", "LOC"
		   });										
		addAnnotation
		  (productEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.53",
			 "constraints.validation.error", "ProductTemplateId ProductHasMaterial ProductHasMaterialCode ProductHasMaterialCodeOriginalText",
			 "constraints.validation.info", "ProductHasMaterialName"
		   });																						
		addAnnotation
		  (advanceDirectiveStatusObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.37",
			 "constraints.validation.error", "AdvanceDirectiveStatusObservationTemplateId"
		   });			
		addAnnotation
		  (advanceDirectiveVerificationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.58",
			 "constraints.validation.error", "AdvanceDirectiveVerificationTemplateId AdvanceDirectiveVerificationTypeCode",
			 "constraints.validation.warning", "AdvanceDirectiveVerificationTime",
			 "typeCode", "VRF"
		   });														
		addAnnotation
		  (authorizationActivityEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.19",
			 "constraints.validation.error", "AuthorizationActivityTemplateId AuthorizationActivityClassCode AuthorizationActivityMoodCode AuthorizationActivityId",
			 "classCode", "ACT",
			 "moodCode", "EVN"
		   });																		
		addAnnotation
		  (procedureActivityEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed"
		   });		
		addAnnotation
		  (functionalStatusObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.44",
			 "constraints.validation.error", "FunctionalStatusObservationTemplateId"
		   });			
		addAnnotation
		  (productInstanceEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.1.52",
			 "constraints.validation.error", "ProductInstanceTemplateId ProductInstanceClassCode",
			 "classCode", "MANU"
		   });										
		addAnnotation
		  (procedureActivityActEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.29",
			 "constraints.validation.error", "ProcedureActivityActTemplateId"
		   });						
		addAnnotation
		  (procedureActivityObservationEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.29",
			 "constraints.validation.error", "ProcedureActivityObservationTemplateId"
		   });						
		addAnnotation
		  (procedureActivityProcedureEClass, 
		   source, 
		   new String[] {
			 "contextDependent", "true",
			 "templateId.root", "2.16.840.1.113883.10.20.1.29",
			 "constraints.validation.error", "ProcedureActivityProcedureTemplateId"
		   });						
		addAnnotation
		  (payerEntityEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "PayerEntityId"
		   });						
		addAnnotation
		  (coveredPartyEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.warning", "CoveredPartyId CoveredPartyCode"
		   });										
		addAnnotation
		  (policySubscriberEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.warning", "PolicySubscriberId"
		   });						
		addAnnotation
		  (coveragePlanDescriptionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "CoveragePlanDescriptionClassCode CoveragePlanDescriptionId CoveragePlanDescriptionMoodCode",
			 "classCode", "ACT",
			 "moodCode", "DEF"
		   });														
		addAnnotation
		  (commentEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.1.40",
			 "code.displayName", "Annotation comment",
			 "constraints.validation.error", "CommentTemplateId CommentClassCode CommentMoodCode CommentCode",
			 "code.codeSystemName", "LOINC",
			 "classCode", "ACT",
			 "code.code", "48767-8",
			 "moodCode", "EVN"
		   });																
	}

} //CCDPackageImpl
