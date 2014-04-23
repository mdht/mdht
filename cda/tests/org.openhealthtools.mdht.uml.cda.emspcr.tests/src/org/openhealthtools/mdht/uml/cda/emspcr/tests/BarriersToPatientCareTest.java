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
import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.BarriersToPatientCareOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Barriers To Patient Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BarriersToPatientCareTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBarriersToPatientCareTemplateId() {
		OperationsTestCase<BarriersToPatientCare> validateBarriersToPatientCareTemplateIdTestCase = new OperationsTestCase<BarriersToPatientCare>(
			"validateBarriersToPatientCareTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BarriersToPatientCare target) {

			}

			@Override
			protected void updateToPass(BarriersToPatientCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BarriersToPatientCareOperations.validateBarriersToPatientCareTemplateId(
					(BarriersToPatientCare) objectToTest, diagnostician, map);
			}

		};

		validateBarriersToPatientCareTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBarriersToPatientCareMoodCode() {
		OperationsTestCase<BarriersToPatientCare> validateBarriersToPatientCareMoodCodeTestCase = new OperationsTestCase<BarriersToPatientCare>(
			"validateBarriersToPatientCareMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BarriersToPatientCare target) {

			}

			@Override
			protected void updateToPass(BarriersToPatientCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BarriersToPatientCareOperations.validateBarriersToPatientCareMoodCode(
					(BarriersToPatientCare) objectToTest, diagnostician, map);
			}

		};

		validateBarriersToPatientCareMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBarriersToPatientCareCodeP() {
		OperationsTestCase<BarriersToPatientCare> validateBarriersToPatientCareCodePTestCase = new OperationsTestCase<BarriersToPatientCare>(
			"validateBarriersToPatientCareCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BarriersToPatientCare target) {

			}

			@Override
			protected void updateToPass(BarriersToPatientCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BarriersToPatientCareOperations.validateBarriersToPatientCareCodeP(
					(BarriersToPatientCare) objectToTest, diagnostician, map);
			}

		};

		validateBarriersToPatientCareCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBarriersToPatientCareCode() {
		OperationsTestCase<BarriersToPatientCare> validateBarriersToPatientCareCodeTestCase = new OperationsTestCase<BarriersToPatientCare>(
			"validateBarriersToPatientCareCode",
			operationsForOCL.getOCLValue("VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BarriersToPatientCare target) {

			}

			@Override
			protected void updateToPass(BarriersToPatientCare target) {
				target.init();

			}

			@Override
			protected void setDependency(BarriersToPatientCare target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCareCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BarriersToPatientCareOperations.validateBarriersToPatientCareCode(
					(BarriersToPatientCare) objectToTest, diagnostician, map);
			}

		};

		validateBarriersToPatientCareCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBarriersToPatientCareValue() {
		OperationsTestCase<BarriersToPatientCare> validateBarriersToPatientCareValueTestCase = new OperationsTestCase<BarriersToPatientCare>(
			"validateBarriersToPatientCareValue",
			operationsForOCL.getOCLValue("VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BarriersToPatientCare target) {

			}

			@Override
			protected void updateToPass(BarriersToPatientCare target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BarriersToPatientCareOperations.validateBarriersToPatientCareValue(
					(BarriersToPatientCare) objectToTest, diagnostician, map);
			}

		};

		validateBarriersToPatientCareValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBarriersToPatientCareValueP() {
		OperationsTestCase<BarriersToPatientCare> validateBarriersToPatientCareValuePTestCase = new OperationsTestCase<BarriersToPatientCare>(
			"validateBarriersToPatientCareValueP",
			operationsForOCL.getOCLValue("VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BarriersToPatientCare target) {

			}

			@Override
			protected void updateToPass(BarriersToPatientCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BarriersToPatientCareOperations.validateBarriersToPatientCareValueP(
					(BarriersToPatientCare) objectToTest, diagnostician, map);
			}

		};

		validateBarriersToPatientCareValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BarriersToPatientCareOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BarriersToPatientCare> {
		public BarriersToPatientCare create() {
			return EmspcrFactory.eINSTANCE.createBarriersToPatientCare();
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
	private static class ConstructorTestClass extends BarriersToPatientCareOperations {
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

} // BarriersToPatientCareOperations
