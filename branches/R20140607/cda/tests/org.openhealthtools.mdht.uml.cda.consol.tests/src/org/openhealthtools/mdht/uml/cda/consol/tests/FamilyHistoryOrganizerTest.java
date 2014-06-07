/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Ai) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#getFamilyHistoryObservations() <em>Get Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerTemplateId() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerTemplateIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerTemplateId(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerClassCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerClassCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerClassCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerMoodCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerMoodCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerMoodCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerFamilyHistoryObservation() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerFamilyHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createFamilyHistoryObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerFamilyHistoryObservation(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubject() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {

				target.setSubject(CDAFactory.eINSTANCE.createSubject());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubject(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);
				target.getSubject().setRelatedSubject(relatedSubject);
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.getSubject().getRelatedSubject().getSubject().setAdministrativeGenderCode(
					DatatypesFactory.eINSTANCE.createCE("F", "2.16.840.1.113883.5.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodePTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);
				target.getSubject().setRelatedSubject(relatedSubject);
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				target.getSubject().setRelatedSubject(relatedSubject);
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);
				relatedSubject.getSubject().setAdministrativeGenderCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTimeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);

				target.getSubject().setRelatedSubject(relatedSubject);
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.getSubject().getRelatedSubject().getSubject().setBirthTime(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedIndTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);

				target.getSubject().setRelatedSubject(relatedSubject);
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				BL indBL = DatatypesFactory.eINSTANCE.createBL(true);
				target.getSubject().getRelatedSubject().getSubject().setSDTCDeceasedInd(indBL);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTimeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);

				target.getSubject().setRelatedSubject(relatedSubject);
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				TS timeTS = DatatypesFactory.eINSTANCE.createTS("1999");
				target.getSubject().getRelatedSubject().getSubject().setSDTCDeceasedTime(timeTS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				relatedSubject.setSubject(subjectPerson);
				target.getSubject().setRelatedSubject(relatedSubject);

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				II idII = DatatypesFactory.eINSTANCE.createII("root", "extension");
				idII.setAssigningAuthorityName("assigningAuthorityName");
				idII.setDisplayable(false);
				target.getSubject().getRelatedSubject().getSubject().getSDTCIds().add(idII);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				relatedSubject.setClassCode(x_DocumentSubject.PAT);
				target.getSubject().setRelatedSubject(relatedSubject);

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.getSubject().getRelatedSubject().setClassCode(x_DocumentSubject.PRS);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				target.getSubject().setRelatedSubject(relatedSubject);

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.getSubject().getRelatedSubject().setCode(
					DatatypesFactory.eINSTANCE.createCE("CHILD", "2.16.840.1.113883.5.111"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectCodePTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				target.getSubject().setRelatedSubject(relatedSubject);

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.getSubject().getRelatedSubject().setCode(
					DatatypesFactory.eINSTANCE.createCE("1234", "2.16.840.1.113883.5.111"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubjectSubject() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();
				target.setSubject(subject);
				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				target.getSubject().setRelatedSubject(relatedSubject);

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();
				target.getSubject().getRelatedSubject().setSubject(subjectPerson);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubjectRelatedSubject() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectRelatedSubjectTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubjectRelatedSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
				Subject subject = CDAFactory.eINSTANCE.createSubject();

				target.setSubject(subject);
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {

				RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();
				target.getSubject().setRelatedSubject(relatedSubject);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubject(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectRelatedSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryObservations() {

		FamilyHistoryOrganizer target = objectFactory.create();
		target.getFamilyHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryOrganizerOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryOrganizer> {
		public FamilyHistoryOrganizer create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends FamilyHistoryOrganizerOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FamilyHistoryOrganizerOperations
