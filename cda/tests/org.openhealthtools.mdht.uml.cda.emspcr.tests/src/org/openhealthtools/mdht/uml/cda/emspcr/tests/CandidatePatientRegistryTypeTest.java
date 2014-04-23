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
import org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CandidatePatientRegistryTypeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Candidate Patient Registry Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType#validateCandidatePatientRegistryTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Candidate Patient Registry Type Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CandidatePatientRegistryTypeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCandidatePatientRegistryTypeTemplateId() {
		OperationsTestCase<CandidatePatientRegistryType> validateCandidatePatientRegistryTypeTemplateIdTestCase = new OperationsTestCase<CandidatePatientRegistryType>(
			"validateCandidatePatientRegistryTypeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CandidatePatientRegistryType target) {

			}

			@Override
			protected void updateToPass(CandidatePatientRegistryType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeTemplateId(
					(CandidatePatientRegistryType) objectToTest, diagnostician, map);
			}

		};

		validateCandidatePatientRegistryTypeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCandidatePatientRegistryTypeMoodCode() {
		OperationsTestCase<CandidatePatientRegistryType> validateCandidatePatientRegistryTypeMoodCodeTestCase = new OperationsTestCase<CandidatePatientRegistryType>(
			"validateCandidatePatientRegistryTypeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CandidatePatientRegistryType target) {

			}

			@Override
			protected void updateToPass(CandidatePatientRegistryType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeMoodCode(
					(CandidatePatientRegistryType) objectToTest, diagnostician, map);
			}

		};

		validateCandidatePatientRegistryTypeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCandidatePatientRegistryTypeCodeP() {
		OperationsTestCase<CandidatePatientRegistryType> validateCandidatePatientRegistryTypeCodePTestCase = new OperationsTestCase<CandidatePatientRegistryType>(
			"validateCandidatePatientRegistryTypeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CandidatePatientRegistryType target) {

			}

			@Override
			protected void updateToPass(CandidatePatientRegistryType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeCodeP(
					(CandidatePatientRegistryType) objectToTest, diagnostician, map);
			}

		};

		validateCandidatePatientRegistryTypeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCandidatePatientRegistryTypeCode() {
		OperationsTestCase<CandidatePatientRegistryType> validateCandidatePatientRegistryTypeCodeTestCase = new OperationsTestCase<CandidatePatientRegistryType>(
			"validateCandidatePatientRegistryTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CandidatePatientRegistryType target) {

			}

			@Override
			protected void updateToPass(CandidatePatientRegistryType target) {
				target.init();

			}

			@Override
			protected void setDependency(CandidatePatientRegistryType target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryTypeCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeCode(
					(CandidatePatientRegistryType) objectToTest, diagnostician, map);
			}

		};

		validateCandidatePatientRegistryTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCandidatePatientRegistryTypeValue() {
		OperationsTestCase<CandidatePatientRegistryType> validateCandidatePatientRegistryTypeValueTestCase = new OperationsTestCase<CandidatePatientRegistryType>(
			"validateCandidatePatientRegistryTypeValue",
			operationsForOCL.getOCLValue("VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CandidatePatientRegistryType target) {

			}

			@Override
			protected void updateToPass(CandidatePatientRegistryType target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeValue(
					(CandidatePatientRegistryType) objectToTest, diagnostician, map);
			}

		};

		validateCandidatePatientRegistryTypeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCandidatePatientRegistryTypeValueP() {
		OperationsTestCase<CandidatePatientRegistryType> validateCandidatePatientRegistryTypeValuePTestCase = new OperationsTestCase<CandidatePatientRegistryType>(
			"validateCandidatePatientRegistryTypeValueP",
			operationsForOCL.getOCLValue("VALIDATE_CANDIDATE_PATIENT_REGISTRY_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CandidatePatientRegistryType target) {

			}

			@Override
			protected void updateToPass(CandidatePatientRegistryType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CandidatePatientRegistryTypeOperations.validateCandidatePatientRegistryTypeValueP(
					(CandidatePatientRegistryType) objectToTest, diagnostician, map);
			}

		};

		validateCandidatePatientRegistryTypeValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CandidatePatientRegistryTypeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CandidatePatientRegistryType> {
		public CandidatePatientRegistryType create() {
			return EmspcrFactory.eINSTANCE.createCandidatePatientRegistryType();
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
	private static class ConstructorTestClass extends CandidatePatientRegistryTypeOperations {
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

} // CandidatePatientRegistryTypeOperations
