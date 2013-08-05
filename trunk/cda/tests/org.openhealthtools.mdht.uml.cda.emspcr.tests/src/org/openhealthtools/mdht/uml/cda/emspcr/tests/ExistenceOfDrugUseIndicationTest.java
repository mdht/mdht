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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfDrugUseIndicationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Drug Use Indication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfDrugUseIndicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugUseIndicationTemplateId() {
		OperationsTestCase<ExistenceOfDrugUseIndication> validateExistenceOfDrugUseIndicationTemplateIdTestCase = new OperationsTestCase<ExistenceOfDrugUseIndication>(
			"validateExistenceOfDrugUseIndicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugUseIndication target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationTemplateId(
					(ExistenceOfDrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugUseIndicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugUseIndicationCodeP() {
		OperationsTestCase<ExistenceOfDrugUseIndication> validateExistenceOfDrugUseIndicationCodePTestCase = new OperationsTestCase<ExistenceOfDrugUseIndication>(
			"validateExistenceOfDrugUseIndicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugUseIndication target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationCodeP(
					(ExistenceOfDrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugUseIndicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugUseIndicationCode() {
		OperationsTestCase<ExistenceOfDrugUseIndication> validateExistenceOfDrugUseIndicationCodeTestCase = new OperationsTestCase<ExistenceOfDrugUseIndication>(
			"validateExistenceOfDrugUseIndicationCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugUseIndication target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationCode(
					(ExistenceOfDrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugUseIndicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugUseIndicationValue() {
		OperationsTestCase<ExistenceOfDrugUseIndication> validateExistenceOfDrugUseIndicationValueTestCase = new OperationsTestCase<ExistenceOfDrugUseIndication>(
			"validateExistenceOfDrugUseIndicationValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugUseIndication target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugUseIndication target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationValue(
					(ExistenceOfDrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugUseIndicationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfDrugUseIndicationMoodCode() {
		OperationsTestCase<ExistenceOfDrugUseIndication> validateExistenceOfDrugUseIndicationMoodCodeTestCase = new OperationsTestCase<ExistenceOfDrugUseIndication>(
			"validateExistenceOfDrugUseIndicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfDrugUseIndication target) {

			}

			@Override
			protected void updateToPass(ExistenceOfDrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationMoodCode(
					(ExistenceOfDrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfDrugUseIndicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExistenceOfDrugUseIndicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfDrugUseIndication> {
		public ExistenceOfDrugUseIndication create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfDrugUseIndication();
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
	private static class ConstructorTestClass extends ExistenceOfDrugUseIndicationOperations {
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

} // ExistenceOfDrugUseIndicationOperations
