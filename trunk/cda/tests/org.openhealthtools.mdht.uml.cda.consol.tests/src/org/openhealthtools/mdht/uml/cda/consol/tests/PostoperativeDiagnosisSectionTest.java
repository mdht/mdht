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
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.PostoperativeDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postoperative Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection#validatePostoperativeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postoperative Diagnosis Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PostoperativeDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostoperativeDiagnosisSectionTemplateId() {
		OperationsTestCase<PostoperativeDiagnosisSection> validatePostoperativeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<PostoperativeDiagnosisSection>(
			"validatePostoperativeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostoperativeDiagnosisSectionOperations.validatePostoperativeDiagnosisSectionTemplateId(
					(PostoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validatePostoperativeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PostoperativeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PostoperativeDiagnosisSection> {
		public PostoperativeDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection();
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
	private static class ConstructorTestClass extends PostoperativeDiagnosisSectionOperations {
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

} // PostoperativeDiagnosisSectionOperations
