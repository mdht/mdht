/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CaregiverCharacteristicsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Caregiver Characteristics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsValueCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CaregiverCharacteristicsTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsValueCodeSystem() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsValueCodeSystemTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsValueCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "1.2.3.4", "", ""));
			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.1", "", ""));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsValueCodeSystem(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsValueCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaregiverCharacteristicsTemplateId() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsTemplateIdTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsTemplateId(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaregiverCharacteristicsClassCode() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsClassCodeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsClassCode(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaregiverCharacteristicsMoodCode() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsMoodCodeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsMoodCode(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsId() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsIdTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsId",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsId(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsCode() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsCodeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsCode",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsCode(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaregiverCharacteristicsStatusCode() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsStatusCodeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsStatusCode(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaregiverCharacteristicsStatusCodeP() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsStatusCodePTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsStatusCodeP(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaregiverCharacteristicsValue() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsValueTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsValue",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsValue(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipant() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipant",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipant(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipantParticipantRoleClassCode() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantParticipantRoleClassCodeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipantParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CaregiverCharacteristics target) {
						// no content (classCode) within participantRole
						target.init();
						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CaregiverCharacteristics target) {
						// has classCode but classCode has the wrong default (PART instead of CAREGIVER)
						target.init();
						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						pr.setClassCode(RoleClassRoot.PART);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				// has classCode with CAREGIVER default
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.CAREGIVER);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipantTimeLow() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantTimeLowTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipantTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTimeLow(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipantTimeHigh() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantTimeHighTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipantTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTimeHigh(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipantTypeCode() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantTypeCodeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CaregiverCharacteristics target) {
						// has a participant without a typeCode
						target.init();
						Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
						target.getParticipants().add(p);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(CaregiverCharacteristics target) {
						// has a participant with a typeCode that has the wrong default
						target.init();
						Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
						target.getParticipants().add(p);
						p.setTypeCode(ParticipationType.ADM);
					}
				});

			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				// has a participant with a typeCode that has the correct default
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				p.setTypeCode(ParticipationType.IND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTypeCode(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipantTime() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantTimeTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipantTime",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTime(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCaregiverCharacteristicsParticipantParticipantRole() {
		OperationsTestCase<CaregiverCharacteristics> validateCaregiverCharacteristicsParticipantParticipantRoleTestCase = new OperationsTestCase<CaregiverCharacteristics>(
			"validateCaregiverCharacteristicsParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaregiverCharacteristics target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected void updateToPass(CaregiverCharacteristics target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantParticipantRole(
					(CaregiverCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateCaregiverCharacteristicsParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CaregiverCharacteristicsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CaregiverCharacteristics> {
		public CaregiverCharacteristics create() {
			return ConsolFactory.eINSTANCE.createCaregiverCharacteristics();
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
	private static class ConstructorTestClass extends CaregiverCharacteristicsOperations {
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

} // CaregiverCharacteristicsOperations
