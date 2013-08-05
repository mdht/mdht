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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestTimingOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Timing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming#validateCardiacArrestTimingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Timing Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming#validateCardiacArrestTimingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Timing Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming#validateCardiacArrestTimingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Timing Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming#validateCardiacArrestTimingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Timing Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestTimingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestTimingTemplateId() {
		OperationsTestCase<CardiacArrestTiming> validateCardiacArrestTimingTemplateIdTestCase = new OperationsTestCase<CardiacArrestTiming>(
			"validateCardiacArrestTimingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestTiming target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestTimingOperations.validateCardiacArrestTimingTemplateId(
					(CardiacArrestTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestTimingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestTimingCode() {
		OperationsTestCase<CardiacArrestTiming> validateCardiacArrestTimingCodeTestCase = new OperationsTestCase<CardiacArrestTiming>(
			"validateCardiacArrestTimingCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestTiming target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestTimingOperations.validateCardiacArrestTimingCode(
					(CardiacArrestTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestTimingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestTimingValue() {
		OperationsTestCase<CardiacArrestTiming> validateCardiacArrestTimingValueTestCase = new OperationsTestCase<CardiacArrestTiming>(
			"validateCardiacArrestTimingValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestTiming target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestTimingOperations.validateCardiacArrestTimingValue(
					(CardiacArrestTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestTimingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestTimingMoodCode() {
		OperationsTestCase<CardiacArrestTiming> validateCardiacArrestTimingMoodCodeTestCase = new OperationsTestCase<CardiacArrestTiming>(
			"validateCardiacArrestTimingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestTiming target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestTimingOperations.validateCardiacArrestTimingMoodCode(
					(CardiacArrestTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestTimingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacArrestTimingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrestTiming> {
		public CardiacArrestTiming create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrestTiming();
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
	private static class ConstructorTestClass extends CardiacArrestTimingOperations {
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

} // CardiacArrestTimingOperations
