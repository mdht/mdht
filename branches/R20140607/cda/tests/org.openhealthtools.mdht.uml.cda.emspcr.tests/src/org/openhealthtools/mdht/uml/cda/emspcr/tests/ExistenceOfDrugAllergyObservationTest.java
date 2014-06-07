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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfDrugAllergyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Drug Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfDrugAllergyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugAllergyObservationTemplateId() {
		OperationsTestCase<ExistenceOfDrugAllergyObservation> validateExistenceOfDrugAllergyObservationTemplateIdTestCase = new OperationsTestCase<ExistenceOfDrugAllergyObservation>(
			"validateExistenceOfDrugAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationTemplateId(
					(ExistenceOfDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugAllergyObservationMoodCode() {
		OperationsTestCase<ExistenceOfDrugAllergyObservation> validateExistenceOfDrugAllergyObservationMoodCodeTestCase = new OperationsTestCase<ExistenceOfDrugAllergyObservation>(
			"validateExistenceOfDrugAllergyObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationMoodCode(
					(ExistenceOfDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugAllergyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugAllergyObservationCode() {
		OperationsTestCase<ExistenceOfDrugAllergyObservation> validateExistenceOfDrugAllergyObservationCodeTestCase = new OperationsTestCase<ExistenceOfDrugAllergyObservation>(
			"validateExistenceOfDrugAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugAllergyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationCode(
					(ExistenceOfDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugAllergyObservationValue() {
		OperationsTestCase<ExistenceOfDrugAllergyObservation> validateExistenceOfDrugAllergyObservationValueTestCase = new OperationsTestCase<ExistenceOfDrugAllergyObservation>(
			"validateExistenceOfDrugAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugAllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationValue(
					(ExistenceOfDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExistenceOfDrugAllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfDrugAllergyObservation> {
		public ExistenceOfDrugAllergyObservation create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfDrugAllergyObservation();
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
	private static class ConstructorTestClass extends ExistenceOfDrugAllergyObservationOperations {
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

} // ExistenceOfDrugAllergyObservationOperations
