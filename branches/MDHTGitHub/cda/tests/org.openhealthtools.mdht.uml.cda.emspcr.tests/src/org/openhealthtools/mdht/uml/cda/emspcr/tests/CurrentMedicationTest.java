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
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CurrentMedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Current Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CurrentMedicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationConsumable() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationConsumableTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationConsumable",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationConsumable(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationTemplateId() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationTemplateIdTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationTemplateId(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationNegationInd() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationNegationIndTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationNegationInd(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationNullFlavor() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationNullFlavorTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationNullFlavor(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationDoseQuantity() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationDoseQuantityTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationDoseQuantity(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationRouteCodeP() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationRouteCodePTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationRouteCodeP(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationRouteCode() {
		OperationsTestCase<CurrentMedication> validateCurrentMedicationRouteCodeTestCase = new OperationsTestCase<CurrentMedication>(
			"validateCurrentMedicationRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedication target) {

			}

			@Override
			protected void updateToPass(CurrentMedication target) {
				target.init();

			}

			@Override
			protected void setDependency(CurrentMedication target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationRouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationOperations.validateCurrentMedicationRouteCode(
					(CurrentMedication) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CurrentMedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CurrentMedication> {
		public CurrentMedication create() {
			return EmspcrFactory.eINSTANCE.createCurrentMedication();
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
	private static class ConstructorTestClass extends CurrentMedicationOperations {
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

} // CurrentMedicationOperations
