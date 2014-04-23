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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PriorAEDUseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior AED Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUsePriorAEDProviderParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Prior AED Provider Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PriorAEDUseTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAEDUsePriorAEDProviderParticipation() {
		OperationsTestCase<PriorAEDUse> validatePriorAEDUsePriorAEDProviderParticipationTestCase = new OperationsTestCase<PriorAEDUse>(
			"validatePriorAEDUsePriorAEDProviderParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAEDUse target) {

			}

			@Override
			protected void updateToPass(PriorAEDUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAEDUseOperations.validatePriorAEDUsePriorAEDProviderParticipation(
					(PriorAEDUse) objectToTest, diagnostician, map);
			}

		};

		validatePriorAEDUsePriorAEDProviderParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAEDUseTemplateId() {
		OperationsTestCase<PriorAEDUse> validatePriorAEDUseTemplateIdTestCase = new OperationsTestCase<PriorAEDUse>(
			"validatePriorAEDUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAEDUse target) {

			}

			@Override
			protected void updateToPass(PriorAEDUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAEDUseOperations.validatePriorAEDUseTemplateId(
					(PriorAEDUse) objectToTest, diagnostician, map);
			}

		};

		validatePriorAEDUseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAEDUseMoodCode() {
		OperationsTestCase<PriorAEDUse> validatePriorAEDUseMoodCodeTestCase = new OperationsTestCase<PriorAEDUse>(
			"validatePriorAEDUseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAEDUse target) {

			}

			@Override
			protected void updateToPass(PriorAEDUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAEDUseOperations.validatePriorAEDUseMoodCode((PriorAEDUse) objectToTest, diagnostician, map);
			}

		};

		validatePriorAEDUseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAEDUseCode() {
		OperationsTestCase<PriorAEDUse> validatePriorAEDUseCodeTestCase = new OperationsTestCase<PriorAEDUse>(
			"validatePriorAEDUseCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PriorAEDUse target) {

			}

			@Override
			protected void updateToPass(PriorAEDUse target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAEDUseOperations.validatePriorAEDUseCode((PriorAEDUse) objectToTest, diagnostician, map);
			}

		};

		validatePriorAEDUseCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAEDUseValue() {
		OperationsTestCase<PriorAEDUse> validatePriorAEDUseValueTestCase = new OperationsTestCase<PriorAEDUse>(
			"validatePriorAEDUseValue",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PriorAEDUse target) {

			}

			@Override
			protected void updateToPass(PriorAEDUse target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAEDUseOperations.validatePriorAEDUseValue((PriorAEDUse) objectToTest, diagnostician, map);
			}

		};

		validatePriorAEDUseValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PriorAEDUseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PriorAEDUse> {
		public PriorAEDUse create() {
			return EmspcrFactory.eINSTANCE.createPriorAEDUse();
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
	private static class ConstructorTestClass extends PriorAEDUseOperations {
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

} // PriorAEDUseOperations
