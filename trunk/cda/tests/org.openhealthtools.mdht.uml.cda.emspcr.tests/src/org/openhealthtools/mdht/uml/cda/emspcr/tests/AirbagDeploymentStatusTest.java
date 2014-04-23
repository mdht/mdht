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
import org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AirbagDeploymentStatusOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Airbag Deployment Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AirbagDeploymentStatusTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirbagDeploymentStatusTemplateId() {
		OperationsTestCase<AirbagDeploymentStatus> validateAirbagDeploymentStatusTemplateIdTestCase = new OperationsTestCase<AirbagDeploymentStatus>(
			"validateAirbagDeploymentStatusTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirbagDeploymentStatus target) {

			}

			@Override
			protected void updateToPass(AirbagDeploymentStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusTemplateId(
					(AirbagDeploymentStatus) objectToTest, diagnostician, map);
			}

		};

		validateAirbagDeploymentStatusTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirbagDeploymentStatusMoodCode() {
		OperationsTestCase<AirbagDeploymentStatus> validateAirbagDeploymentStatusMoodCodeTestCase = new OperationsTestCase<AirbagDeploymentStatus>(
			"validateAirbagDeploymentStatusMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirbagDeploymentStatus target) {

			}

			@Override
			protected void updateToPass(AirbagDeploymentStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusMoodCode(
					(AirbagDeploymentStatus) objectToTest, diagnostician, map);
			}

		};

		validateAirbagDeploymentStatusMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirbagDeploymentStatusCode() {
		OperationsTestCase<AirbagDeploymentStatus> validateAirbagDeploymentStatusCodeTestCase = new OperationsTestCase<AirbagDeploymentStatus>(
			"validateAirbagDeploymentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirbagDeploymentStatus target) {

			}

			@Override
			protected void updateToPass(AirbagDeploymentStatus target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusCode(
					(AirbagDeploymentStatus) objectToTest, diagnostician, map);
			}

		};

		validateAirbagDeploymentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirbagDeploymentStatusValue() {
		OperationsTestCase<AirbagDeploymentStatus> validateAirbagDeploymentStatusValueTestCase = new OperationsTestCase<AirbagDeploymentStatus>(
			"validateAirbagDeploymentStatusValue",
			operationsForOCL.getOCLValue("VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirbagDeploymentStatus target) {

			}

			@Override
			protected void updateToPass(AirbagDeploymentStatus target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusValue(
					(AirbagDeploymentStatus) objectToTest, diagnostician, map);
			}

		};

		validateAirbagDeploymentStatusValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirbagDeploymentStatusValueP() {
		OperationsTestCase<AirbagDeploymentStatus> validateAirbagDeploymentStatusValuePTestCase = new OperationsTestCase<AirbagDeploymentStatus>(
			"validateAirbagDeploymentStatusValueP",
			operationsForOCL.getOCLValue("VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirbagDeploymentStatus target) {

			}

			@Override
			protected void updateToPass(AirbagDeploymentStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusValueP(
					(AirbagDeploymentStatus) objectToTest, diagnostician, map);
			}

		};

		validateAirbagDeploymentStatusValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AirbagDeploymentStatusOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AirbagDeploymentStatus> {
		public AirbagDeploymentStatus create() {
			return EmspcrFactory.eINSTANCE.createAirbagDeploymentStatus();
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
	private static class ConstructorTestClass extends AirbagDeploymentStatusOperations {
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

} // AirbagDeploymentStatusOperations
