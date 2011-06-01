/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription;

import org.openhealthtools.mdht.uml.cda.ccd.operations.CoveragePlanDescriptionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Plan Description</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription#validateCoveragePlanDescriptionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription#validateCoveragePlanDescriptionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription#validateCoveragePlanDescriptionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CoveragePlanDescriptionTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoveragePlanDescriptionClassCode() {
		OperationsTestCase<CoveragePlanDescription> validateCoveragePlanDescriptionClassCodeTestCase = new OperationsTestCase<CoveragePlanDescription>(
				"validateCoveragePlanDescriptionClassCode",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoveragePlanDescription target) {

			}

			@Override
			protected void updateToPass(CoveragePlanDescription target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoveragePlanDescriptionOperations
						.validateCoveragePlanDescriptionClassCode(
								(CoveragePlanDescription) objectToTest,
								diagnostician, map);
			}

		};

		validateCoveragePlanDescriptionClassCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoveragePlanDescriptionId() {
		OperationsTestCase<CoveragePlanDescription> validateCoveragePlanDescriptionIdTestCase = new OperationsTestCase<CoveragePlanDescription>(
				"validateCoveragePlanDescriptionId",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoveragePlanDescription target) {

			}

			@Override
			protected void updateToPass(CoveragePlanDescription target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoveragePlanDescriptionOperations
						.validateCoveragePlanDescriptionId(
								(CoveragePlanDescription) objectToTest,
								diagnostician, map);
			}

		};

		validateCoveragePlanDescriptionIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateCoveragePlanDescriptionMoodCode() {
		OperationsTestCase<CoveragePlanDescription> validateCoveragePlanDescriptionMoodCodeTestCase = new OperationsTestCase<CoveragePlanDescription>(
				"validateCoveragePlanDescriptionMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CoveragePlanDescription target) {

			}

			@Override
			protected void updateToPass(CoveragePlanDescription target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoveragePlanDescriptionOperations
						.validateCoveragePlanDescriptionMoodCode(
								(CoveragePlanDescription) objectToTest,
								diagnostician, map);
			}

		};

		validateCoveragePlanDescriptionMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			CoveragePlanDescriptionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<CoveragePlanDescription> {
		public CoveragePlanDescription create() {
			return CCDFactory.eINSTANCE.createCoveragePlanDescription();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // CoveragePlanDescriptionOperations