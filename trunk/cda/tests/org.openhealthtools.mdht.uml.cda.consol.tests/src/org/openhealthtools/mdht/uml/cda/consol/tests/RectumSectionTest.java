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
import org.openhealthtools.mdht.uml.cda.consol.RectumSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.RectumSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Rectum Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RectumSection#validateRectumSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Rectum Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RectumSection#validateRectumSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Rectum Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RectumSection#validateRectumSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Rectum Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RectumSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RectumSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRectumSectionTemplateId() {
		OperationsTestCase<RectumSection> validateRectumSectionTemplateIdTestCase = new OperationsTestCase<RectumSection>(
			"validateRectumSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RECTUM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RectumSection target) {

			}

			@Override
			protected void updateToPass(RectumSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RectumSectionOperations.validateRectumSectionTemplateId(
					(RectumSection) objectToTest, diagnostician, map);
			}

		};

		validateRectumSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRectumSectionCode() {
		OperationsTestCase<RectumSection> validateRectumSectionCodeTestCase = new OperationsTestCase<RectumSection>(
			"validateRectumSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_RECTUM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(RectumSection target) {

			}

			@Override
			protected void updateToPass(RectumSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RectumSectionOperations.validateRectumSectionCode(
					(RectumSection) objectToTest, diagnostician, map);
			}

		};

		validateRectumSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRectumSectionProblemEntry() {
		OperationsTestCase<RectumSection> validateRectumSectionProblemEntryTestCase = new OperationsTestCase<RectumSection>(
			"validateRectumSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_RECTUM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RectumSection target) {

			}

			@Override
			protected void updateToPass(RectumSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RectumSectionOperations.validateRectumSectionProblemEntry(
					(RectumSection) objectToTest, diagnostician, map);
			}

		};

		validateRectumSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		RectumSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RectumSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RectumSection> {
		public RectumSection create() {
			return ConsolFactory.eINSTANCE.createRectumSection();
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
	private static class ConstructorTestClass extends RectumSectionOperations {
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

} // RectumSectionOperations
