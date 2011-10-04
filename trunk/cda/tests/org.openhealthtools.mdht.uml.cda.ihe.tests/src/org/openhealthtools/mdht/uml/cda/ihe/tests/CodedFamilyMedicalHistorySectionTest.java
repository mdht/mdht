/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedFamilyMedicalHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Family Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection#validateCodedFamilyMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection#validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Family History Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection#getIHEFamilyHistoryOrganizer() <em>Get IHE Family History Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodedFamilyMedicalHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedFamilyMedicalHistorySectionTemplateId() {
		OperationsTestCase<CodedFamilyMedicalHistorySection> validateCodedFamilyMedicalHistorySectionTemplateIdTestCase = new OperationsTestCase<CodedFamilyMedicalHistorySection>(
			"validateCodedFamilyMedicalHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedFamilyMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(CodedFamilyMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedFamilyMedicalHistorySectionOperations.validateCodedFamilyMedicalHistorySectionTemplateId(
					(CodedFamilyMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateCodedFamilyMedicalHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer() {
		OperationsTestCase<CodedFamilyMedicalHistorySection> validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizerTestCase = new OperationsTestCase<CodedFamilyMedicalHistorySection>(
			"validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedFamilyMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(CodedFamilyMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedFamilyMedicalHistorySectionOperations.validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(
					(CodedFamilyMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIHEFamilyHistoryOrganizer() {

		CodedFamilyMedicalHistorySection target = objectFactory.create();
		target.getIHEFamilyHistoryOrganizer();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodedFamilyMedicalHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodedFamilyMedicalHistorySection> {
		public CodedFamilyMedicalHistorySection create() {
			return IHEFactory.eINSTANCE.createCodedFamilyMedicalHistorySection();
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
	private static class ConstructorTestClass extends CodedFamilyMedicalHistorySectionOperations {
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

} // CodedFamilyMedicalHistorySectionOperations
