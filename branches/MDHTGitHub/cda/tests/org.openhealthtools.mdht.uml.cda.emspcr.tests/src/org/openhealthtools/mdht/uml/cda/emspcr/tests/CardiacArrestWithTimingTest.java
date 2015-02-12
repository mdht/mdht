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
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestWithTimingOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest With Timing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestWithTimingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestWithTimingTemplateId() {
		OperationsTestCase<CardiacArrestWithTiming> validateCardiacArrestWithTimingTemplateIdTestCase = new OperationsTestCase<CardiacArrestWithTiming>(
			"validateCardiacArrestWithTimingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestWithTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestWithTiming target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingTemplateId(
					(CardiacArrestWithTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestWithTimingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestWithTimingMoodCode() {
		OperationsTestCase<CardiacArrestWithTiming> validateCardiacArrestWithTimingMoodCodeTestCase = new OperationsTestCase<CardiacArrestWithTiming>(
			"validateCardiacArrestWithTimingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestWithTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestWithTiming target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingMoodCode(
					(CardiacArrestWithTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestWithTimingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestWithTimingCode() {
		OperationsTestCase<CardiacArrestWithTiming> validateCardiacArrestWithTimingCodeTestCase = new OperationsTestCase<CardiacArrestWithTiming>(
			"validateCardiacArrestWithTimingCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestWithTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestWithTiming target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingCode(
					(CardiacArrestWithTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestWithTimingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestWithTimingValue() {
		OperationsTestCase<CardiacArrestWithTiming> validateCardiacArrestWithTimingValueTestCase = new OperationsTestCase<CardiacArrestWithTiming>(
			"validateCardiacArrestWithTimingValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestWithTiming target) {

			}

			@Override
			protected void updateToPass(CardiacArrestWithTiming target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingValue(
					(CardiacArrestWithTiming) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestWithTimingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacArrestWithTimingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrestWithTiming> {
		public CardiacArrestWithTiming create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrestWithTiming();
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
	private static class ConstructorTestClass extends CardiacArrestWithTimingOperations {
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

} // CardiacArrestWithTimingOperations
