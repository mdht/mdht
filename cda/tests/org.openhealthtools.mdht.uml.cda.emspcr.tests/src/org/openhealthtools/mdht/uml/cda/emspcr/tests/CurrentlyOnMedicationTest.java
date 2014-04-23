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
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CurrentlyOnMedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Currently On Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CurrentlyOnMedicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentlyOnMedicationTemplateId() {
		OperationsTestCase<CurrentlyOnMedication> validateCurrentlyOnMedicationTemplateIdTestCase = new OperationsTestCase<CurrentlyOnMedication>(
			"validateCurrentlyOnMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentlyOnMedication target) {

			}

			@Override
			protected void updateToPass(CurrentlyOnMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationTemplateId(
					(CurrentlyOnMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentlyOnMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentlyOnMedicationMoodCode() {
		OperationsTestCase<CurrentlyOnMedication> validateCurrentlyOnMedicationMoodCodeTestCase = new OperationsTestCase<CurrentlyOnMedication>(
			"validateCurrentlyOnMedicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentlyOnMedication target) {

			}

			@Override
			protected void updateToPass(CurrentlyOnMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationMoodCode(
					(CurrentlyOnMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentlyOnMedicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentlyOnMedicationCode() {
		OperationsTestCase<CurrentlyOnMedication> validateCurrentlyOnMedicationCodeTestCase = new OperationsTestCase<CurrentlyOnMedication>(
			"validateCurrentlyOnMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentlyOnMedication target) {

			}

			@Override
			protected void updateToPass(CurrentlyOnMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationCode(
					(CurrentlyOnMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentlyOnMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentlyOnMedicationValue() {
		OperationsTestCase<CurrentlyOnMedication> validateCurrentlyOnMedicationValueTestCase = new OperationsTestCase<CurrentlyOnMedication>(
			"validateCurrentlyOnMedicationValue",
			operationsForOCL.getOCLValue("VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentlyOnMedication target) {

			}

			@Override
			protected void updateToPass(CurrentlyOnMedication target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentlyOnMedicationOperations.validateCurrentlyOnMedicationValue(
					(CurrentlyOnMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentlyOnMedicationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CurrentlyOnMedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CurrentlyOnMedication> {
		public CurrentlyOnMedication create() {
			return EmspcrFactory.eINSTANCE.createCurrentlyOnMedication();
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
	private static class ConstructorTestClass extends CurrentlyOnMedicationOperations {
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

} // CurrentlyOnMedicationOperations
