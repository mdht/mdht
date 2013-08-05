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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProceduresPerformedSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Performed Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionProcedureActivityProcedure1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Procedure Activity Procedure1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#getProcedureActivityProcedure1s() <em>Get Procedure Activity Procedure1s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProcedureDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresPerformedSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresPerformedSectionCodeP() {
		OperationsTestCase<ProceduresPerformedSection> validateProceduresPerformedSectionCodePTestCase = new OperationsTestCase<ProceduresPerformedSection>(
			"validateProceduresPerformedSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(ProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionCodeP(
					(ProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresPerformedSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresPerformedSectionCode() {
		OperationsTestCase<ProceduresPerformedSection> validateProceduresPerformedSectionCodeTestCase = new OperationsTestCase<ProceduresPerformedSection>(
			"validateProceduresPerformedSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(ProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionCode(
					(ProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresPerformedSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresPerformedSectionTitle() {
		OperationsTestCase<ProceduresPerformedSection> validateProceduresPerformedSectionTitleTestCase = new OperationsTestCase<ProceduresPerformedSection>(
			"validateProceduresPerformedSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(ProceduresPerformedSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionTitle(
					(ProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresPerformedSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresPerformedSectionText() {
		OperationsTestCase<ProceduresPerformedSection> validateProceduresPerformedSectionTextTestCase = new OperationsTestCase<ProceduresPerformedSection>(
			"validateProceduresPerformedSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(ProceduresPerformedSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionText(
					(ProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresPerformedSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresPerformedSectionProcedureActivityProcedure1() {
		OperationsTestCase<ProceduresPerformedSection> validateProceduresPerformedSectionProcedureActivityProcedure1TestCase = new OperationsTestCase<ProceduresPerformedSection>(
			"validateProceduresPerformedSectionProcedureActivityProcedure1",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(ProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionProcedureActivityProcedure1(
					(ProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresPerformedSectionProcedureActivityProcedure1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedure1s() {

		ProceduresPerformedSection target = objectFactory.create();
		target.getProcedureActivityProcedure1s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDescriptionSectionTemplateId() {
		OperationsTestCase<ProceduresPerformedSection> validateProcedureDescriptionSectionTemplateIdTestCase = new OperationsTestCase<ProceduresPerformedSection>(
			"validateProcedureDescriptionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresPerformedSection target) {

			}

			@Override
			protected void updateToPass(ProceduresPerformedSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresPerformedSectionOperations.validateProcedureDescriptionSectionTemplateId(
					(ProceduresPerformedSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDescriptionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresPerformedSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresPerformedSection> {
		public ProceduresPerformedSection create() {
			return EmspcrFactory.eINSTANCE.createProceduresPerformedSection();
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
	private static class ConstructorTestClass extends ProceduresPerformedSectionOperations {
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

} // ProceduresPerformedSectionOperations
