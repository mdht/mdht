/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.operations.TreatmentNotGivenSubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Not Given Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Treatment Not Given Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TreatmentNotGivenSubstanceAdministrationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationIndTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationTemplateId() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationTemplateId(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationClassCode() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationClassCodeTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationClassCode(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationMoodCode() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationMoodCodeTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationMoodCode(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationNegationInd() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationNegationIndTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationNegationInd(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationStatusCode() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationStatusCodeTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationStatusCode(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentNotGivenSubstanceAdministrationStatusCodeP() {
		OperationsTestCase<TreatmentNotGivenSubstanceAdministration> validateTreatmentNotGivenSubstanceAdministrationStatusCodePTestCase = new OperationsTestCase<TreatmentNotGivenSubstanceAdministration>(
			"validateTreatmentNotGivenSubstanceAdministrationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentNotGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentNotGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(
					(TreatmentNotGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentNotGivenSubstanceAdministrationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TreatmentNotGivenSubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TreatmentNotGivenSubstanceAdministration> {
		public TreatmentNotGivenSubstanceAdministration create() {
			return PhcrFactory.eINSTANCE.createTreatmentNotGivenSubstanceAdministration();
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
	private static class ConstructorTestClass extends TreatmentNotGivenSubstanceAdministrationOperations {
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

} // TreatmentNotGivenSubstanceAdministrationOperations
