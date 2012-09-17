/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PostprocedureDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Postprocedure Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection#validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Postprocedure Diagnosis Section Postprocedure
 * Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection#getMu2consolPostprocedureDiagnosis()
 * <em>Get Mu2consol Postprocedure Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Postprocedure Diagnosis Section Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class PostprocedureDiagnosisSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis() {
		OperationsTestCase<PostprocedureDiagnosisSection> validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
				"validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations
						.validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
								(PostprocedureDiagnosisSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolPostprocedureDiagnosis() {

		PostprocedureDiagnosisSection target = objectFactory.create();
		target.getMu2consolPostprocedureDiagnosis();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePostprocedureDiagnosisSectionTemplateId() {
		OperationsTestCase<PostprocedureDiagnosisSection> validatePostprocedureDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<PostprocedureDiagnosisSection>(
				"validatePostprocedureDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSectionOperations
						.validatePostprocedureDiagnosisSectionTemplateId(
								(PostprocedureDiagnosisSection) objectToTest,
								diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			PostprocedureDiagnosisSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<PostprocedureDiagnosisSection> {

		@Override
		public PostprocedureDiagnosisSection create() {
			return Mu2consolFactory.eINSTANCE
					.createPostprocedureDiagnosisSection();
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
	private static class ConstructorTestClass extends
			PostprocedureDiagnosisSectionOperations {
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

} // PostprocedureDiagnosisSectionOperations
