/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.operations.AssessmentSectionProcNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment Section Proc Note</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote#validateAssessmentSectionProcNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote#validateAssessmentSectionProcNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentSectionProcNoteTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAssessmentSectionProcNoteTemplateId() {
		OperationsTestCase<AssessmentSectionProcNote> validateAssessmentSectionProcNoteTemplateIdTestCase = new OperationsTestCase<AssessmentSectionProcNote>(
			"validateAssessmentSectionProcNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentSectionProcNote target) {

			}

			@Override
			protected void updateToPass(AssessmentSectionProcNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentSectionProcNoteOperations.validateAssessmentSectionProcNoteTemplateId(
					(AssessmentSectionProcNote) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentSectionProcNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAssessmentSectionProcNoteCode() {
		OperationsTestCase<AssessmentSectionProcNote> validateAssessmentSectionProcNoteCodeTestCase = new OperationsTestCase<AssessmentSectionProcNote>(
			"validateAssessmentSectionProcNoteCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentSectionProcNote target) {

			}

			@Override
			protected void updateToPass(AssessmentSectionProcNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentSectionProcNoteOperations.validateAssessmentSectionProcNoteCode(
					(AssessmentSectionProcNote) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentSectionProcNoteCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AssessmentSectionProcNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentSectionProcNote> {

		public AssessmentSectionProcNote create() {
			return CDTFactory.eINSTANCE.createAssessmentSectionProcNote();
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
	private static class ConstructorTestClass extends AssessmentSectionProcNoteOperations {
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

} // AssessmentSectionProcNoteOperations
