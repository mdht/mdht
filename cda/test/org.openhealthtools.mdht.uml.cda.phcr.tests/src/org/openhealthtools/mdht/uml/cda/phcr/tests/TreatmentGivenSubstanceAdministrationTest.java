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
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.operations.TreatmentGivenSubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Given Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Treatment Given Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Route Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TreatmentGivenSubstanceAdministrationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationIndTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationTemplateId() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationTemplateId(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationClassCode() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationClassCodeTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationClassCode(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationMoodCode() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationMoodCodeTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationMoodCode(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationNegationInd() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationNegationIndTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationNegationInd(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationStatusCode() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationStatusCodeTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationStatusCode(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationEffectiveTime() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationEffectiveTimeTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationEffectiveTime(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationRouteCodeP() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationRouteCodePTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationRouteCodeP(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTreatmentGivenSubstanceAdministrationRouteCode() {
		OperationsTestCase<TreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationRouteCodeTestCase = new OperationsTestCase<TreatmentGivenSubstanceAdministration>(
			"validateTreatmentGivenSubstanceAdministrationRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TreatmentGivenSubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(TreatmentGivenSubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationRouteCode(
					(TreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validateTreatmentGivenSubstanceAdministrationRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TreatmentGivenSubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TreatmentGivenSubstanceAdministration> {
		public TreatmentGivenSubstanceAdministration create() {
			return PhcrFactory.eINSTANCE.createTreatmentGivenSubstanceAdministration();
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
	private static class ConstructorTestClass extends TreatmentGivenSubstanceAdministrationOperations {
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

} // TreatmentGivenSubstanceAdministrationOperations
