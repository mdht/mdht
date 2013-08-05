/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacRhythmOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Rhythm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacRhythmTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmParticipant1() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmParticipant1TestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmParticipant1(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmTemplateId() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmTemplateIdTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmTemplateId(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmCodeP() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmCodePTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmCodeP(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmCode() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmCodeTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmCode(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmMethodCode() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmMethodCodeTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmMethodCode(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmMethodCodeP() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmMethodCodePTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmMethodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmMethodCodeP(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmMethodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmValue() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmValueTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmValue(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmValueP() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmValuePTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmValueP",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmValueP(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmEffectiveTime() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmEffectiveTimeTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmEffectiveTime(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacRhythmMoodCode() {
		OperationsTestCase<CardiacRhythm> validateCardiacRhythmMoodCodeTestCase = new OperationsTestCase<CardiacRhythm>(
			"validateCardiacRhythmMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacRhythm target) {

			}

			@Override
			protected void updateToPass(CardiacRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacRhythmOperations.validateCardiacRhythmMoodCode(
					(CardiacRhythm) objectToTest, diagnostician, map);
			}

		};

		validateCardiacRhythmMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacRhythmOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacRhythm> {
		public CardiacRhythm create() {
			return EmspcrFactory.eINSTANCE.createCardiacRhythm();
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
	private static class ConstructorTestClass extends CardiacRhythmOperations {
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

} // CardiacRhythmOperations
