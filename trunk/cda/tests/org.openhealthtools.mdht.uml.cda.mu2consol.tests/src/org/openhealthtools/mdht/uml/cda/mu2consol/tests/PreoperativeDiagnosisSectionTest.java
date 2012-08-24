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
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PreoperativeDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Preoperative Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection#validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Preoperative Diagnosis Section Preoperative Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection#getmu2consolPreoperativeDiagnosis() <em>Getmu2consol Preoperative Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreoperativeDiagnosisSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis() {
		OperationsTestCase<PreoperativeDiagnosisSection> validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase = new OperationsTestCase<PreoperativeDiagnosisSection>(
			"validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSectionOperations.validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
					(PreoperativeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolPreoperativeDiagnosis() {

		PreoperativeDiagnosisSection target = objectFactory.create();
		target.getmu2consolPreoperativeDiagnosis();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PreoperativeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreoperativeDiagnosisSection> {

		public PreoperativeDiagnosisSection create() {
			return Mu2consolFactory.eINSTANCE.createPreoperativeDiagnosisSection();
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
	private static class ConstructorTestClass extends PreoperativeDiagnosisSectionOperations {
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

} // PreoperativeDiagnosisSectionOperations
