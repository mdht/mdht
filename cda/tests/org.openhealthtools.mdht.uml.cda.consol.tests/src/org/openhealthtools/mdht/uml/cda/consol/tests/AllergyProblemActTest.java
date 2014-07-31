/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - added tests for SITE-495 Errata 219 artf3820 CONC or 48765-2
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCodeAndCodeSystemValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#getAllergyObservations() <em>Get Allergy Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyProblemActTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTimeHigh() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeHighTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
				IVL_TS pt = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				pt.setHigh(high);
				target.setEffectiveTime(pt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeHigh(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTimeLow() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeLowTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));
			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				et.setLow(low);
				target.setEffectiveTime(et);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeLow(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActTemplateId() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActTemplateIdTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActTemplateId(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActClassCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActClassCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActClassCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActMoodCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActMoodCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActMoodCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActId() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActIdTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActId(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActStatusCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActStatusCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActStatusCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTime() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTime(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActAllergyObservation() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyObservationTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyObservation(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeAndCodeSystemValues() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCDCodeAndCodeSystemValues",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyProblemAct target) {
						// fully inaccurate values
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(
							CDAValidationTest.BAD_CODE_VALUE, CDAValidationTest.BAD_CODESYSTEM_ID));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyProblemAct target) {
						// @code and @codeSystem swapped 1
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("48765-2", "2.16.840.1.113883.5.6"));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyProblemAct target) {
						// @code and @codeSystem swapped 2
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("CONC", CDAValidationTest.LOINC_ID));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyProblemAct target) {
						// Concern (new)
						// code element with @codeSystem = ???2.16.840.1.113883.5.6??? and @code = ???CONC???
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("CONC", "2.16.840.1.113883.5.6"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyProblemAct target) {
						// 48765-2 (old)
						// code element with @codeSystem = ???2.16.840.1.113883.6.1??? and @code = ???48765-2???
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("48765-2", CDAValidationTest.LOINC_ID));
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCDCodeAndCodeSystemValues(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCDCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCDCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCDCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.getCode().setCode("hasACode");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCDCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeSystem() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCDCodeSystemTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.getCode().setCodeSystem("hasACodeSystem");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCDCodeSystem(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyObservations() {

		AllergyProblemAct target = objectFactory.create();
		target.getAllergyObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyProblemActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyProblemAct> {
		public AllergyProblemAct create() {
			return ConsolFactory.eINSTANCE.createAllergyProblemAct();
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
	private static class ConstructorTestClass extends AllergyProblemActOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AllergyProblemActOperations
