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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PriorCPROperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior CPR</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRProviderParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Provider Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PriorCPRTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorCPRProviderParticipation() {
		OperationsTestCase<PriorCPR> validatePriorCPRProviderParticipationTestCase = new OperationsTestCase<PriorCPR>(
			"validatePriorCPRProviderParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorCPR target) {

			}

			@Override
			protected void updateToPass(PriorCPR target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorCPROperations.validatePriorCPRProviderParticipation(
					(PriorCPR) objectToTest, diagnostician, map);
			}

		};

		validatePriorCPRProviderParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorCPRTemplateId() {
		OperationsTestCase<PriorCPR> validatePriorCPRTemplateIdTestCase = new OperationsTestCase<PriorCPR>(
			"validatePriorCPRTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorCPR target) {

			}

			@Override
			protected void updateToPass(PriorCPR target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorCPROperations.validatePriorCPRTemplateId((PriorCPR) objectToTest, diagnostician, map);
			}

		};

		validatePriorCPRTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorCPRMoodCode() {
		OperationsTestCase<PriorCPR> validatePriorCPRMoodCodeTestCase = new OperationsTestCase<PriorCPR>(
			"validatePriorCPRMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PriorCPR target) {

			}

			@Override
			protected void updateToPass(PriorCPR target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorCPROperations.validatePriorCPRMoodCode((PriorCPR) objectToTest, diagnostician, map);
			}

		};

		validatePriorCPRMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorCPRCode() {
		OperationsTestCase<PriorCPR> validatePriorCPRCodeTestCase = new OperationsTestCase<PriorCPR>(
			"validatePriorCPRCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PriorCPR target) {

			}

			@Override
			protected void updateToPass(PriorCPR target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorCPROperations.validatePriorCPRCode((PriorCPR) objectToTest, diagnostician, map);
			}

		};

		validatePriorCPRCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorCPRValue() {
		OperationsTestCase<PriorCPR> validatePriorCPRValueTestCase = new OperationsTestCase<PriorCPR>(
			"validatePriorCPRValue",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PriorCPR target) {

			}

			@Override
			protected void updateToPass(PriorCPR target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorCPROperations.validatePriorCPRValue((PriorCPR) objectToTest, diagnostician, map);
			}

		};

		validatePriorCPRValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PriorCPROperations {
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
	private static class ObjectFactory implements TestObjectFactory<PriorCPR> {
		public PriorCPR create() {
			return EmspcrFactory.eINSTANCE.createPriorCPR();
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
	private static class ConstructorTestClass extends PriorCPROperations {
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

} // PriorCPROperations
