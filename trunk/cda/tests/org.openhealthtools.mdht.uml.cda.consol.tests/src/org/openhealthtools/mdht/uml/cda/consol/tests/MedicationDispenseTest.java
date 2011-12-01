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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispenseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#getAssignedEntity() <em>Get Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationDispenseTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationDispenseTemplateId() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseTemplateIdTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseTemplateId(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationDispenseClassCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseClassCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseClassCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseEffectiveTime() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseEffectiveTimeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				SXCM_TS e = DatatypesFactory.eINSTANCE.createSXCM_TS();
				target.getEffectiveTimes().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseEffectiveTime(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseId() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseIdTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseId(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationDispenseMoodCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseMoodCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseMoodCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseRepeatNumber() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseRepeatNumberTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				IVL_INT value = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseRepeatNumber(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationDispenseStatusCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseStatusCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseStatusCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseAssignedEntity() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseAssignedEntityTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

				target.init();

				Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(performer);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {

				for (Performer2 performer : target.getPerformers()) {

					AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
					performer.setAssignedEntity(ae);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseAssignedEntity(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseMedicationSupplyOrder() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseMedicationSupplyOrderTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseMedicationSupplyOrder",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();
				MedicationSupplyOrder supply = ConsolFactory.eINSTANCE.createMedicationSupplyOrder().init();

				target.addSupply(supply);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseMedicationSupplyOrder(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssignedEntity() {

		MedicationDispense target = objectFactory.create();
		target.getAssignedEntity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSupplyOrder() {

		MedicationDispense target = objectFactory.create();
		target.getMedicationSupplyOrder();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationDispenseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationDispense> {
		public MedicationDispense create() {
			return ConsolFactory.eINSTANCE.createMedicationDispense();
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
	private static class ConstructorTestClass extends MedicationDispenseOperations {
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

} // MedicationDispenseOperations
