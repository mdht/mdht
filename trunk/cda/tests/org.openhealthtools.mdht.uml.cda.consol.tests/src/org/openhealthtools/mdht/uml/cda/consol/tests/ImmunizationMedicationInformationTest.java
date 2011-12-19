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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationMedicationInformationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationTemplateId() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationTemplateIdTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationTemplateId(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationClassCode() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationClassCodeTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationClassCode(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationId() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationIdTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationId(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationOrganization() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationOrganizationTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationOrganization",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationOrganization(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationMedicationInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationMedicationInformation> {
		public ImmunizationMedicationInformation create() {
			return ConsolFactory.eINSTANCE.createImmunizationMedicationInformation();
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
	private static class ConstructorTestClass extends ImmunizationMedicationInformationOperations {
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

} // ImmunizationMedicationInformationOperations
