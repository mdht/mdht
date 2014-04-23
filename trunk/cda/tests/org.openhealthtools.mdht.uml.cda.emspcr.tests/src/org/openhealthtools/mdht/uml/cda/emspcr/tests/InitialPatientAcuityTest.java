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
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.InitialPatientAcuityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Initial Patient Acuity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity#validateInitialPatientAcuityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Patient Acuity Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InitialPatientAcuityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInitialPatientAcuityTemplateId() {
		OperationsTestCase<InitialPatientAcuity> validateInitialPatientAcuityTemplateIdTestCase = new OperationsTestCase<InitialPatientAcuity>(
			"validateInitialPatientAcuityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INITIAL_PATIENT_ACUITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InitialPatientAcuity target) {

			}

			@Override
			protected void updateToPass(InitialPatientAcuity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InitialPatientAcuityOperations.validateInitialPatientAcuityTemplateId(
					(InitialPatientAcuity) objectToTest, diagnostician, map);
			}

		};

		validateInitialPatientAcuityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInitialPatientAcuityMoodCode() {
		OperationsTestCase<InitialPatientAcuity> validateInitialPatientAcuityMoodCodeTestCase = new OperationsTestCase<InitialPatientAcuity>(
			"validateInitialPatientAcuityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INITIAL_PATIENT_ACUITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InitialPatientAcuity target) {

			}

			@Override
			protected void updateToPass(InitialPatientAcuity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InitialPatientAcuityOperations.validateInitialPatientAcuityMoodCode(
					(InitialPatientAcuity) objectToTest, diagnostician, map);
			}

		};

		validateInitialPatientAcuityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInitialPatientAcuityCodeP() {
		OperationsTestCase<InitialPatientAcuity> validateInitialPatientAcuityCodePTestCase = new OperationsTestCase<InitialPatientAcuity>(
			"validateInitialPatientAcuityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INITIAL_PATIENT_ACUITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InitialPatientAcuity target) {

			}

			@Override
			protected void updateToPass(InitialPatientAcuity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InitialPatientAcuityOperations.validateInitialPatientAcuityCodeP(
					(InitialPatientAcuity) objectToTest, diagnostician, map);
			}

		};

		validateInitialPatientAcuityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInitialPatientAcuityCode() {
		OperationsTestCase<InitialPatientAcuity> validateInitialPatientAcuityCodeTestCase = new OperationsTestCase<InitialPatientAcuity>(
			"validateInitialPatientAcuityCode",
			operationsForOCL.getOCLValue("VALIDATE_INITIAL_PATIENT_ACUITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InitialPatientAcuity target) {

			}

			@Override
			protected void updateToPass(InitialPatientAcuity target) {
				target.init();

			}

			@Override
			protected void setDependency(InitialPatientAcuity target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InitialPatientAcuityOperations.validateInitialPatientAcuityCode(
					(InitialPatientAcuity) objectToTest, diagnostician, map);
			}

		};

		validateInitialPatientAcuityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInitialPatientAcuityValue() {
		OperationsTestCase<InitialPatientAcuity> validateInitialPatientAcuityValueTestCase = new OperationsTestCase<InitialPatientAcuity>(
			"validateInitialPatientAcuityValue",
			operationsForOCL.getOCLValue("VALIDATE_INITIAL_PATIENT_ACUITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InitialPatientAcuity target) {

			}

			@Override
			protected void updateToPass(InitialPatientAcuity target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InitialPatientAcuityOperations.validateInitialPatientAcuityValue(
					(InitialPatientAcuity) objectToTest, diagnostician, map);
			}

		};

		validateInitialPatientAcuityValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInitialPatientAcuityValueP() {
		OperationsTestCase<InitialPatientAcuity> validateInitialPatientAcuityValuePTestCase = new OperationsTestCase<InitialPatientAcuity>(
			"validateInitialPatientAcuityValueP",
			operationsForOCL.getOCLValue("VALIDATE_INITIAL_PATIENT_ACUITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InitialPatientAcuity target) {

			}

			@Override
			protected void updateToPass(InitialPatientAcuity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InitialPatientAcuityOperations.validateInitialPatientAcuityValueP(
					(InitialPatientAcuity) objectToTest, diagnostician, map);
			}

		};

		validateInitialPatientAcuityValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InitialPatientAcuityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InitialPatientAcuity> {
		public InitialPatientAcuity create() {
			return EmspcrFactory.eINSTANCE.createInitialPatientAcuity();
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
	private static class ConstructorTestClass extends InitialPatientAcuityOperations {
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

} // InitialPatientAcuityOperations
