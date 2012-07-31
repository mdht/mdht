/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SusceptibilityResultOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Susceptibility Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult#validateSusceptibilityResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Susceptibility Result Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SusceptibilityResultTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSusceptibilityResultTemplateId() {
		OperationsTestCase<SusceptibilityResult> validateSusceptibilityResultTemplateIdTestCase = new OperationsTestCase<SusceptibilityResult>(
			"validateSusceptibilityResultTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUSCEPTIBILITY_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SusceptibilityResult target) {

			}

			@Override
			protected void updateToPass(SusceptibilityResult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SusceptibilityResultOperations.validateSusceptibilityResultTemplateId(
					(SusceptibilityResult) objectToTest, diagnostician, map);
			}

		};

		validateSusceptibilityResultTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSusceptibilityResultCodeP() {
		OperationsTestCase<SusceptibilityResult> validateSusceptibilityResultCodePTestCase = new OperationsTestCase<SusceptibilityResult>(
			"validateSusceptibilityResultCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SUSCEPTIBILITY_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SusceptibilityResult target) {

			}

			@Override
			protected void updateToPass(SusceptibilityResult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SusceptibilityResultOperations.validateSusceptibilityResultCodeP(
					(SusceptibilityResult) objectToTest, diagnostician, map);
			}

		};

		validateSusceptibilityResultCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSusceptibilityResultCode() {
		OperationsTestCase<SusceptibilityResult> validateSusceptibilityResultCodeTestCase = new OperationsTestCase<SusceptibilityResult>(
			"validateSusceptibilityResultCode",
			operationsForOCL.getOCLValue("VALIDATE_SUSCEPTIBILITY_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SusceptibilityResult target) {

			}

			@Override
			protected void updateToPass(SusceptibilityResult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SusceptibilityResultOperations.validateSusceptibilityResultCode(
					(SusceptibilityResult) objectToTest, diagnostician, map);
			}

		};

		validateSusceptibilityResultCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSusceptibilityResultStatusCode() {
		OperationsTestCase<SusceptibilityResult> validateSusceptibilityResultStatusCodeTestCase = new OperationsTestCase<SusceptibilityResult>(
			"validateSusceptibilityResultStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SusceptibilityResult target) {

			}

			@Override
			protected void updateToPass(SusceptibilityResult target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SusceptibilityResultOperations.validateSusceptibilityResultStatusCode(
					(SusceptibilityResult) objectToTest, diagnostician, map);
			}

		};

		validateSusceptibilityResultStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSusceptibilityResultStatusCodeP() {
		OperationsTestCase<SusceptibilityResult> validateSusceptibilityResultStatusCodePTestCase = new OperationsTestCase<SusceptibilityResult>(
			"validateSusceptibilityResultStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SUSCEPTIBILITY_RESULT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SusceptibilityResult target) {

			}

			@Override
			protected void updateToPass(SusceptibilityResult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SusceptibilityResultOperations.validateSusceptibilityResultStatusCodeP(
					(SusceptibilityResult) objectToTest, diagnostician, map);
			}

		};

		validateSusceptibilityResultStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSusceptibilityResultClassCode() {
		OperationsTestCase<SusceptibilityResult> validateSusceptibilityResultClassCodeTestCase = new OperationsTestCase<SusceptibilityResult>(
			"validateSusceptibilityResultClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SUSCEPTIBILITY_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SusceptibilityResult target) {

			}

			@Override
			protected void updateToPass(SusceptibilityResult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SusceptibilityResultOperations.validateSusceptibilityResultClassCode(
					(SusceptibilityResult) objectToTest, diagnostician, map);
			}

		};

		validateSusceptibilityResultClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SusceptibilityResultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SusceptibilityResult> {
		public SusceptibilityResult create() {
			return PhcrFactory.eINSTANCE.createSusceptibilityResult();
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
	private static class ConstructorTestClass extends SusceptibilityResultOperations {
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

} // SusceptibilityResultOperations
