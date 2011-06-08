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
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicalEquipmentSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medical Equipment Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection#validateHITSPMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medical Equipment Section Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class MedicalEquipmentSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicalEquipmentSectionTemplateId() {
		OperationsTestCase<MedicalEquipmentSection> validateHITSPMedicalEquipmentSectionTemplateIdTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateHITSPMedicalEquipmentSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateHITSPMedicalEquipmentSectionTemplateId(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicalEquipmentSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicalEquipmentSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalEquipmentSection> {

		public MedicalEquipmentSection create() {
			return HITSPFactory.eINSTANCE.createMedicalEquipmentSection();
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
	private static class ConstructorTestClass extends MedicalEquipmentSectionOperations {
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

} // MedicalEquipmentSectionOperations
