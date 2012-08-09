/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.MedicationsAdministeredSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#validateMu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Medications Administered Section Medication Activity
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#getmu2consolMedicationActivities()
 * <em>Getmu2consol Medication Activities</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class MedicationsAdministeredSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<MedicationsAdministeredSection> validateMu2consolMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
				"validateMu2consolMedicationsAdministeredSectionMedicationActivity",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations
						.validateMu2consolMedicationsAdministeredSectionMedicationActivity(
								(MedicationsAdministeredSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolMedicationsAdministeredSectionMedicationActivityTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolMedicationActivities() {

		MedicationsAdministeredSection target = objectFactory.create();
		target.getmu2consolMedicationActivities();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			MedicationsAdministeredSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<MedicationsAdministeredSection> {
		@Override
		public MedicationsAdministeredSection create() {
			return Mu2consolFactory.eINSTANCE
					.createMedicationsAdministeredSection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			MedicationsAdministeredSectionOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // MedicationsAdministeredSectionOperations