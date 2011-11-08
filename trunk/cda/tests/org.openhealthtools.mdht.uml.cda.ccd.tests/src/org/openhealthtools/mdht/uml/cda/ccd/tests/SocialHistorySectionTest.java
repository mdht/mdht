/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Social History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionMaritalStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Marital Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionReligiousAffiliation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Religious Affiliation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientRace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientRaceCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientEthnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientEthnicityCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#getSocialHistoryObservations() <em>Get Social History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionMaritalStatus() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionMaritalStatusTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionMaritalStatus",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {
				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				clinicalDocument.addPatient(patient);
				clinicalDocument.addSection(target.init());
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {

				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();

				patient.setMaritalStatusCode(DatatypesFactory.eINSTANCE.createCE("code", "codesystem"));

				clinicalDocument.addPatient(patient);

				target.init();

				clinicalDocument.addSection(target);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionMaritalStatus(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionMaritalStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionReligiousAffiliation() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionReligiousAffiliationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionReligiousAffiliation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {
				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				clinicalDocument.addPatient(patient);
				clinicalDocument.addSection(target.init());
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				for (Patient patient : target.getClinicalDocument().getPatients()) {
					patient.setReligiousAffiliationCode(DatatypesFactory.eINSTANCE.createCE("code", "codeSystem"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionReligiousAffiliation(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionReligiousAffiliationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionPatientRace() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionPatientRaceTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionPatientRace",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {
				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				clinicalDocument.addPatient(patient);
				clinicalDocument.addSection(target.init());
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				for (Patient patient : target.getClinicalDocument().getPatients()) {
					patient.setRaceCode(DatatypesFactory.eINSTANCE.createCE("code", "codeSystem"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionPatientRace(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionPatientRaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionPatientRaceCodeSystem() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionPatientRaceCodeSystemTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionPatientRaceCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {
				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				clinicalDocument.addPatient(patient);
				clinicalDocument.addSection(target.init());
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				for (Patient patient : target.getClinicalDocument().getPatients()) {
					patient.setRaceCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.5.104"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionPatientRaceCodeSystem(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionPatientRaceCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionPatientEthnicity() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionPatientEthnicityTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionPatientEthnicity",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {
				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				clinicalDocument.addPatient(patient);
				clinicalDocument.addSection(target.init());
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				for (Patient patient : target.getClinicalDocument().getPatients()) {
					patient.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE("code", "codesystem"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionPatientEthnicity(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionPatientEthnicityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionPatientEthnicityCodeSystem() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionPatientEthnicityCodeSystemTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionPatientEthnicityCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {
				ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				clinicalDocument.addPatient(patient);
				clinicalDocument.addSection(target.init());
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				for (Patient patient : target.getClinicalDocument().getPatients()) {
					patient.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.5.50"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionPatientEthnicityCodeSystem(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionPatientEthnicityCodeSystemTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionCode(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistorySectionTitle() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTitleTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTitle(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionText() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTextTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionText(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionSocialHistoryObservation() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionSocialHistoryObservationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionSocialHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createSocialHistoryObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionSocialHistoryObservation(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionSocialHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistoryObservations() {

		SocialHistorySection target = objectFactory.create();
		target.getSocialHistoryObservations();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistorySection> {
		public SocialHistorySection create() {
			return CCDFactory.eINSTANCE.createSocialHistorySection();
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
	private static class ConstructorTestClass extends SocialHistorySectionOperations {
	}

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

} // SocialHistorySectionOperations
