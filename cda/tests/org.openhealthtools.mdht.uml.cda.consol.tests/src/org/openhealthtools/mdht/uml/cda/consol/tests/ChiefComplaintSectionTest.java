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
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.ChiefComplaintSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chief Complaint Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChiefComplaintSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintSectionTemplateId() {
		OperationsTestCase<ChiefComplaintSection> validateChiefComplaintSectionTemplateIdTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateChiefComplaintSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionOperations.validateChiefComplaintSectionTemplateId(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintSectionCode() {
		OperationsTestCase<ChiefComplaintSection> validateChiefComplaintSectionCodeTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateChiefComplaintSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionOperations.validateChiefComplaintSectionCode(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChiefComplaintSectionCondition() {
		OperationsTestCase<ChiefComplaintSection> validateChiefComplaintSectionConditionTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateChiefComplaintSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionOperations.validateChiefComplaintSectionCondition(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCondition() {

		ChiefComplaintSection target = objectFactory.create();
		target.getCondition();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ChiefComplaintSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChiefComplaintSection> {

		public ChiefComplaintSection create() {
			return ConsolFactory.eINSTANCE.createChiefComplaintSection();
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
	private static class ConstructorTestClass extends ChiefComplaintSectionOperations {
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

} // ChiefComplaintSectionOperations
