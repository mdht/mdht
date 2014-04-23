/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientAge;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientAgeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Age</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge#validatePatientAgeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Age Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge#validatePatientAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge#validatePatientAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge#validatePatientAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge#validatePatientAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Age Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientAgeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientAgeTemplateId() {
		OperationsTestCase<PatientAge> validatePatientAgeTemplateIdTestCase = new OperationsTestCase<PatientAge>(
			"validatePatientAgeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientAge target) {

			}

			@Override
			protected void updateToPass(PatientAge target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAgeOperations.validatePatientAgeTemplateId((PatientAge) objectToTest, diagnostician, map);
			}

		};

		validatePatientAgeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientAgeMoodCode() {
		OperationsTestCase<PatientAge> validatePatientAgeMoodCodeTestCase = new OperationsTestCase<PatientAge>(
			"validatePatientAgeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientAge target) {

			}

			@Override
			protected void updateToPass(PatientAge target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAgeOperations.validatePatientAgeMoodCode((PatientAge) objectToTest, diagnostician, map);
			}

		};

		validatePatientAgeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientAgeCodeP() {
		OperationsTestCase<PatientAge> validatePatientAgeCodePTestCase = new OperationsTestCase<PatientAge>(
			"validatePatientAgeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientAge target) {

			}

			@Override
			protected void updateToPass(PatientAge target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAgeOperations.validatePatientAgeCodeP((PatientAge) objectToTest, diagnostician, map);
			}

		};

		validatePatientAgeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientAgeCode() {
		OperationsTestCase<PatientAge> validatePatientAgeCodeTestCase = new OperationsTestCase<PatientAge>(
			"validatePatientAgeCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientAge target) {

			}

			@Override
			protected void updateToPass(PatientAge target) {
				target.init();

			}

			@Override
			protected void setDependency(PatientAge target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientAgeCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAgeOperations.validatePatientAgeCode((PatientAge) objectToTest, diagnostician, map);
			}

		};

		validatePatientAgeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientAgeValue() {
		OperationsTestCase<PatientAge> validatePatientAgeValueTestCase = new OperationsTestCase<PatientAge>(
			"validatePatientAgeValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientAge target) {

			}

			@Override
			protected void updateToPass(PatientAge target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAgeOperations.validatePatientAgeValue((PatientAge) objectToTest, diagnostician, map);
			}

		};

		validatePatientAgeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientAgeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientAge> {
		public PatientAge create() {
			return EmspcrFactory.eINSTANCE.createPatientAge();
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
	private static class ConstructorTestClass extends PatientAgeOperations {
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

} // PatientAgeOperations
