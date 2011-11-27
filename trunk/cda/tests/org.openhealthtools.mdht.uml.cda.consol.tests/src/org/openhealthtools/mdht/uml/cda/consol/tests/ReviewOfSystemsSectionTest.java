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
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReviewOfSystemsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Review Of Systems Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection#validateReviewOfSystemsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection#validateReviewOfSystemsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReviewOfSystemsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReviewOfSystemsSectionTemplateId() {
		OperationsTestCase<ReviewOfSystemsSection> validateReviewOfSystemsSectionTemplateIdTestCase = new OperationsTestCase<ReviewOfSystemsSection>(
			"validateReviewOfSystemsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReviewOfSystemsSection target) {

			}

			@Override
			protected void updateToPass(ReviewOfSystemsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReviewOfSystemsSectionOperations.validateReviewOfSystemsSectionTemplateId(
					(ReviewOfSystemsSection) objectToTest, diagnostician, map);
			}

		};

		validateReviewOfSystemsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReviewOfSystemsSectionCode() {
		OperationsTestCase<ReviewOfSystemsSection> validateReviewOfSystemsSectionCodeTestCase = new OperationsTestCase<ReviewOfSystemsSection>(
			"validateReviewOfSystemsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_REVIEW_OF_SYSTEMS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReviewOfSystemsSection target) {

			}

			@Override
			protected void updateToPass(ReviewOfSystemsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReviewOfSystemsSectionOperations.validateReviewOfSystemsSectionCode(
					(ReviewOfSystemsSection) objectToTest, diagnostician, map);
			}

		};

		validateReviewOfSystemsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReviewOfSystemsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReviewOfSystemsSection> {
		public ReviewOfSystemsSection create() {
			return ConsolFactory.eINSTANCE.createReviewOfSystemsSection();
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
	private static class ConstructorTestClass extends ReviewOfSystemsSectionOperations {
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

} // ReviewOfSystemsSectionOperations
