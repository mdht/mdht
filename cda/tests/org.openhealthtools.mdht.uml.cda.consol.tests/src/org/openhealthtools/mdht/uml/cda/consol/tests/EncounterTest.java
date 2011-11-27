/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.Encounter;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterAdmissionSourceValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Admission Source Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolEncounterAdmissionSourceValueSet() {
		OperationsTestCase<Encounter> validateConsolEncounterAdmissionSourceValueSetTestCase = new OperationsTestCase<Encounter>(
			"validateConsolEncounterAdmissionSourceValueSet",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateConsolEncounterAdmissionSourceValueSet(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateConsolEncounterAdmissionSourceValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolEncounterTemplateId() {
		OperationsTestCase<Encounter> validateConsolEncounterTemplateIdTestCase = new OperationsTestCase<Encounter>(
			"validateConsolEncounterTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateConsolEncounterTemplateId(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateConsolEncounterTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolEncounterClassCode() {
		OperationsTestCase<Encounter> validateConsolEncounterClassCodeTestCase = new OperationsTestCase<Encounter>(
			"validateConsolEncounterClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateConsolEncounterClassCode(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateConsolEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolEncounterId() {
		OperationsTestCase<Encounter> validateConsolEncounterIdTestCase = new OperationsTestCase<Encounter>(
			"validateConsolEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateConsolEncounterId((Encounter) objectToTest, diagnostician, map);
			}

		};

		validateConsolEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolEncounterCode() {
		OperationsTestCase<Encounter> validateConsolEncounterCodeTestCase = new OperationsTestCase<Encounter>(
			"validateConsolEncounterCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateConsolEncounterCode((Encounter) objectToTest, diagnostician, map);
			}

		};

		validateConsolEncounterCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolEncounterText() {
		OperationsTestCase<Encounter> validateConsolEncounterTextTestCase = new OperationsTestCase<Encounter>(
			"validateConsolEncounterText",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateConsolEncounterText((Encounter) objectToTest, diagnostician, map);
			}

		};

		validateConsolEncounterTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Encounter> {
		public Encounter create() {
			return ConsolFactory.eINSTANCE.createEncounter();
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
	private static class ConstructorTestClass extends EncounterOperations {
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

} // EncounterOperations
