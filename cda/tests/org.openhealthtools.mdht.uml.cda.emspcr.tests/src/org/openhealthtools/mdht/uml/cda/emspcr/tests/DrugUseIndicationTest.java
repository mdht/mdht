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
import org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DrugUseIndicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Use Indication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DrugUseIndicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugUseIndicationTemplateId() {
		OperationsTestCase<DrugUseIndication> validateDrugUseIndicationTemplateIdTestCase = new OperationsTestCase<DrugUseIndication>(
			"validateDrugUseIndicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugUseIndication target) {

			}

			@Override
			protected void updateToPass(DrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugUseIndicationOperations.validateDrugUseIndicationTemplateId(
					(DrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateDrugUseIndicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugUseIndicationMoodCode() {
		OperationsTestCase<DrugUseIndication> validateDrugUseIndicationMoodCodeTestCase = new OperationsTestCase<DrugUseIndication>(
			"validateDrugUseIndicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugUseIndication target) {

			}

			@Override
			protected void updateToPass(DrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugUseIndicationOperations.validateDrugUseIndicationMoodCode(
					(DrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateDrugUseIndicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugUseIndicationCode() {
		OperationsTestCase<DrugUseIndication> validateDrugUseIndicationCodeTestCase = new OperationsTestCase<DrugUseIndication>(
			"validateDrugUseIndicationCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugUseIndication target) {

			}

			@Override
			protected void updateToPass(DrugUseIndication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugUseIndicationOperations.validateDrugUseIndicationCode(
					(DrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateDrugUseIndicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugUseIndicationValue() {
		OperationsTestCase<DrugUseIndication> validateDrugUseIndicationValueTestCase = new OperationsTestCase<DrugUseIndication>(
			"validateDrugUseIndicationValue",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugUseIndication target) {

			}

			@Override
			protected void updateToPass(DrugUseIndication target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugUseIndicationOperations.validateDrugUseIndicationValue(
					(DrugUseIndication) objectToTest, diagnostician, map);
			}

		};

		validateDrugUseIndicationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DrugUseIndicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugUseIndication> {
		public DrugUseIndication create() {
			return EmspcrFactory.eINSTANCE.createDrugUseIndication();
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
	private static class ConstructorTestClass extends DrugUseIndicationOperations {
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

} // DrugUseIndicationOperations
