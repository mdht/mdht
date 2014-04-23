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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSProceduresPerformedSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Procedures Performed Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionProcedureActivityProcedure1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Procedure Activity Procedure1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#getProcedureActivityProcedure1s() <em>Get Procedure Activity Procedure1s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSProceduresPerformedSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProceduresPerformedSectionTemplateId() {
		OperationsTestCase<EMSProceduresPerformedSection> validateEMSProceduresPerformedSectionTemplateIdTestCase = new OperationsTestCase<EMSProceduresPerformedSection>(
			"validateEMSProceduresPerformedSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(EMSProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionTemplateId(
					(EMSProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProceduresPerformedSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProceduresPerformedSectionCode() {
		OperationsTestCase<EMSProceduresPerformedSection> validateEMSProceduresPerformedSectionCodeTestCase = new OperationsTestCase<EMSProceduresPerformedSection>(
			"validateEMSProceduresPerformedSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(EMSProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionCode(
					(EMSProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProceduresPerformedSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProceduresPerformedSectionCodeP() {
		OperationsTestCase<EMSProceduresPerformedSection> validateEMSProceduresPerformedSectionCodePTestCase = new OperationsTestCase<EMSProceduresPerformedSection>(
			"validateEMSProceduresPerformedSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(EMSProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionCodeP(
					(EMSProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProceduresPerformedSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProceduresPerformedSectionTitle() {
		OperationsTestCase<EMSProceduresPerformedSection> validateEMSProceduresPerformedSectionTitleTestCase = new OperationsTestCase<EMSProceduresPerformedSection>(
			"validateEMSProceduresPerformedSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(EMSProceduresPerformedSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionTitle(
					(EMSProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProceduresPerformedSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProceduresPerformedSectionText() {
		OperationsTestCase<EMSProceduresPerformedSection> validateEMSProceduresPerformedSectionTextTestCase = new OperationsTestCase<EMSProceduresPerformedSection>(
			"validateEMSProceduresPerformedSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(EMSProceduresPerformedSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionText(
					(EMSProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProceduresPerformedSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProceduresPerformedSectionProcedureActivityProcedure1() {
		OperationsTestCase<EMSProceduresPerformedSection> validateEMSProceduresPerformedSectionProcedureActivityProcedure1TestCase = new OperationsTestCase<EMSProceduresPerformedSection>(
			"validateEMSProceduresPerformedSectionProcedureActivityProcedure1",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(EMSProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionProcedureActivityProcedure1(
					(EMSProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProceduresPerformedSectionProcedureActivityProcedure1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedure1s() {

		EMSProceduresPerformedSection target = objectFactory.create();
		target.getProcedureActivityProcedure1s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSProceduresPerformedSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSProceduresPerformedSection> {
		public EMSProceduresPerformedSection create() {
			return EmspcrFactory.eINSTANCE.createEMSProceduresPerformedSection();
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
	private static class ConstructorTestClass extends EMSProceduresPerformedSectionOperations {
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

} // EMSProceduresPerformedSectionOperations
