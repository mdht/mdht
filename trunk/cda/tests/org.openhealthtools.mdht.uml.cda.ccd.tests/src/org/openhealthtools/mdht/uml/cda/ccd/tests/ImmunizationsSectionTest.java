/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Immunizations Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionTitleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateMedicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateImmunizationsSectionTitleValue() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionTitleValueTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionTitleValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TITLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("immunization");

				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionTitleValue(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionTitleValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateImmunizationsSectionTitle() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionTitleTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionTitle(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateImmunizationsSectionText() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionTextTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionText(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationsSectionTemplateId() {
		OperationsTestCase<ImmunizationsSection> validateMedicationsSectionTemplateIdTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateMedicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateMedicationsSectionTemplateId(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationsSectionCode() {
		OperationsTestCase<ImmunizationsSection> validateMedicationsSectionCodeTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateMedicationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateMedicationsSectionCode(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ImmunizationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationsSection> {
		public ImmunizationsSection create() {
			return CCDFactory.eINSTANCE.createImmunizationsSection();
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
	private static class ConstructorTestClass extends ImmunizationsSectionOperations {
	}

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

} // ImmunizationsSectionOperations
