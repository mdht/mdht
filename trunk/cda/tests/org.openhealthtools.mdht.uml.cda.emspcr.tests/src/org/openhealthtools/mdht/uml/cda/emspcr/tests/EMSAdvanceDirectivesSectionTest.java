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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSAdvanceDirectivesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Advance Directives Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Advanced Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#getAdvancedDirectiveObservations() <em>Get Advanced Directive Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSAdvanceDirectivesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAdvanceDirectivesSectionTemplateId() {
		OperationsTestCase<EMSAdvanceDirectivesSection> validateEMSAdvanceDirectivesSectionTemplateIdTestCase = new OperationsTestCase<EMSAdvanceDirectivesSection>(
			"validateEMSAdvanceDirectivesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(EMSAdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionTemplateId(
					(EMSAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAdvanceDirectivesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAdvanceDirectivesSectionCode() {
		OperationsTestCase<EMSAdvanceDirectivesSection> validateEMSAdvanceDirectivesSectionCodeTestCase = new OperationsTestCase<EMSAdvanceDirectivesSection>(
			"validateEMSAdvanceDirectivesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(EMSAdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionCode(
					(EMSAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAdvanceDirectivesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAdvanceDirectivesSectionTitle() {
		OperationsTestCase<EMSAdvanceDirectivesSection> validateEMSAdvanceDirectivesSectionTitleTestCase = new OperationsTestCase<EMSAdvanceDirectivesSection>(
			"validateEMSAdvanceDirectivesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(EMSAdvanceDirectivesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionTitle(
					(EMSAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAdvanceDirectivesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAdvanceDirectivesSectionText() {
		OperationsTestCase<EMSAdvanceDirectivesSection> validateEMSAdvanceDirectivesSectionTextTestCase = new OperationsTestCase<EMSAdvanceDirectivesSection>(
			"validateEMSAdvanceDirectivesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(EMSAdvanceDirectivesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionText(
					(EMSAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAdvanceDirectivesSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation() {
		OperationsTestCase<EMSAdvanceDirectivesSection> validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservationTestCase = new OperationsTestCase<EMSAdvanceDirectivesSection>(
			"validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(EMSAdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(
					(EMSAdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvancedDirectiveObservations() {

		EMSAdvanceDirectivesSection target = objectFactory.create();
		target.getAdvancedDirectiveObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSAdvanceDirectivesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSAdvanceDirectivesSection> {
		public EMSAdvanceDirectivesSection create() {
			return EmspcrFactory.eINSTANCE.createEMSAdvanceDirectivesSection();
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
	private static class ConstructorTestClass extends EMSAdvanceDirectivesSectionOperations {
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

} // EMSAdvanceDirectivesSectionOperations
