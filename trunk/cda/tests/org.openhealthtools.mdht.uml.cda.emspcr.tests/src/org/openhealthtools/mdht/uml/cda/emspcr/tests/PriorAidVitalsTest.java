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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PriorAidVitalsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior Aid Vitals</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PriorAidVitalsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAidVitalsTemplateId() {
		OperationsTestCase<PriorAidVitals> validatePriorAidVitalsTemplateIdTestCase = new OperationsTestCase<PriorAidVitals>(
			"validatePriorAidVitalsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAidVitals target) {

			}

			@Override
			protected void updateToPass(PriorAidVitals target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAidVitalsOperations.validatePriorAidVitalsTemplateId(
					(PriorAidVitals) objectToTest, diagnostician, map);
			}

		};

		validatePriorAidVitalsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAidVitalsMoodCode() {
		OperationsTestCase<PriorAidVitals> validatePriorAidVitalsMoodCodeTestCase = new OperationsTestCase<PriorAidVitals>(
			"validatePriorAidVitalsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAidVitals target) {

			}

			@Override
			protected void updateToPass(PriorAidVitals target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAidVitalsOperations.validatePriorAidVitalsMoodCode(
					(PriorAidVitals) objectToTest, diagnostician, map);
			}

		};

		validatePriorAidVitalsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAidVitalsCode() {
		OperationsTestCase<PriorAidVitals> validatePriorAidVitalsCodeTestCase = new OperationsTestCase<PriorAidVitals>(
			"validatePriorAidVitalsCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAidVitals target) {

			}

			@Override
			protected void updateToPass(PriorAidVitals target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAidVitalsOperations.validatePriorAidVitalsCode(
					(PriorAidVitals) objectToTest, diagnostician, map);
			}

		};

		validatePriorAidVitalsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePriorAidVitalsValue() {
		OperationsTestCase<PriorAidVitals> validatePriorAidVitalsValueTestCase = new OperationsTestCase<PriorAidVitals>(
			"validatePriorAidVitalsValue",
			operationsForOCL.getOCLValue("VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorAidVitals target) {

			}

			@Override
			protected void updateToPass(PriorAidVitals target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorAidVitalsOperations.validatePriorAidVitalsValue(
					(PriorAidVitals) objectToTest, diagnostician, map);
			}

		};

		validatePriorAidVitalsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PriorAidVitalsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PriorAidVitals> {
		public PriorAidVitals create() {
			return EmspcrFactory.eINSTANCE.createPriorAidVitals();
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
	private static class ConstructorTestClass extends PriorAidVitalsOperations {
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

} // PriorAidVitalsOperations
