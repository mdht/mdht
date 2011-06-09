/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medications Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection#validateHITSPMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection#validateHITSPMedicationsSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medications Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection#getHITSPMedications() <em>Get HITSP Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationsSectionTemplateId() {
		OperationsTestCase<MedicationsSection> validateHITSPMedicationsSectionTemplateIdTestCase = new OperationsTestCase<MedicationsSection>(
			"validateHITSPMedicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateHITSPMedicationsSectionTemplateId(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationsSectionMedication() {
		OperationsTestCase<MedicationsSection> validateHITSPMedicationsSectionMedicationTestCase = new OperationsTestCase<MedicationsSection>(
			"validateHITSPMedicationsSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

				Medication sa = HITSPFactory.eINSTANCE.createMedication().init();
				target.addSubstanceAdministration(sa);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateHITSPMedicationsSectionMedication(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationsSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPMedications() {

		MedicationsSection target = objectFactory.create();
		target.getHITSPMedications();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsSection> {

		public MedicationsSection create() {
			return HITSPFactory.eINSTANCE.createMedicationsSection();
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
	private static class ConstructorTestClass extends MedicationsSectionOperations {
	}

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

} // MedicationsSectionOperations
