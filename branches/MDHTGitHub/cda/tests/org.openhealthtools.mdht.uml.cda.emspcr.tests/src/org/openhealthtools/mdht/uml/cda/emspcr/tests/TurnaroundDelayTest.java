/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TurnaroundDelayOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Turnaround Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay#validateTurnaroundDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Turnaround Delay Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TurnaroundDelayTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTurnaroundDelayTemplateId() {
		OperationsTestCase<TurnaroundDelay> validateTurnaroundDelayTemplateIdTestCase = new OperationsTestCase<TurnaroundDelay>(
			"validateTurnaroundDelayTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TURNAROUND_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TurnaroundDelay target) {

			}

			@Override
			protected void updateToPass(TurnaroundDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TurnaroundDelayOperations.validateTurnaroundDelayTemplateId(
					(TurnaroundDelay) objectToTest, diagnostician, map);
			}

		};

		validateTurnaroundDelayTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTurnaroundDelayMoodCode() {
		OperationsTestCase<TurnaroundDelay> validateTurnaroundDelayMoodCodeTestCase = new OperationsTestCase<TurnaroundDelay>(
			"validateTurnaroundDelayMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TURNAROUND_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TurnaroundDelay target) {

			}

			@Override
			protected void updateToPass(TurnaroundDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TurnaroundDelayOperations.validateTurnaroundDelayMoodCode(
					(TurnaroundDelay) objectToTest, diagnostician, map);
			}

		};

		validateTurnaroundDelayMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTurnaroundDelayCodeP() {
		OperationsTestCase<TurnaroundDelay> validateTurnaroundDelayCodePTestCase = new OperationsTestCase<TurnaroundDelay>(
			"validateTurnaroundDelayCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TURNAROUND_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TurnaroundDelay target) {

			}

			@Override
			protected void updateToPass(TurnaroundDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TurnaroundDelayOperations.validateTurnaroundDelayCodeP(
					(TurnaroundDelay) objectToTest, diagnostician, map);
			}

		};

		validateTurnaroundDelayCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTurnaroundDelayCode() {
		OperationsTestCase<TurnaroundDelay> validateTurnaroundDelayCodeTestCase = new OperationsTestCase<TurnaroundDelay>(
			"validateTurnaroundDelayCode",
			operationsForOCL.getOCLValue("VALIDATE_TURNAROUND_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TurnaroundDelay target) {

			}

			@Override
			protected void updateToPass(TurnaroundDelay target) {
				target.init();

			}

			@Override
			protected void setDependency(TurnaroundDelay target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelayCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TurnaroundDelayOperations.validateTurnaroundDelayCode(
					(TurnaroundDelay) objectToTest, diagnostician, map);
			}

		};

		validateTurnaroundDelayCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTurnaroundDelayValue() {
		OperationsTestCase<TurnaroundDelay> validateTurnaroundDelayValueTestCase = new OperationsTestCase<TurnaroundDelay>(
			"validateTurnaroundDelayValue",
			operationsForOCL.getOCLValue("VALIDATE_TURNAROUND_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TurnaroundDelay target) {

			}

			@Override
			protected void updateToPass(TurnaroundDelay target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TurnaroundDelayOperations.validateTurnaroundDelayValue(
					(TurnaroundDelay) objectToTest, diagnostician, map);
			}

		};

		validateTurnaroundDelayValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTurnaroundDelayValueP() {
		OperationsTestCase<TurnaroundDelay> validateTurnaroundDelayValuePTestCase = new OperationsTestCase<TurnaroundDelay>(
			"validateTurnaroundDelayValueP",
			operationsForOCL.getOCLValue("VALIDATE_TURNAROUND_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TurnaroundDelay target) {

			}

			@Override
			protected void updateToPass(TurnaroundDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TurnaroundDelayOperations.validateTurnaroundDelayValueP(
					(TurnaroundDelay) objectToTest, diagnostician, map);
			}

		};

		validateTurnaroundDelayValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TurnaroundDelayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TurnaroundDelay> {
		public TurnaroundDelay create() {
			return EmspcrFactory.eINSTANCE.createTurnaroundDelay();
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
	private static class ConstructorTestClass extends TurnaroundDelayOperations {
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

} // TurnaroundDelayOperations
