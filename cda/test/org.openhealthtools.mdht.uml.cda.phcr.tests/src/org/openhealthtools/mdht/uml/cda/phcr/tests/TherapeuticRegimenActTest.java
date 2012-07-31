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
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#getTreatmentGivenSubstanceAdministrations() <em>Get Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#getTreatmentNotGivenSubstanceAdministrations() <em>Get Treatment Not Given Substance Administrations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TherapeuticRegimenActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActTemplateId() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActClassCode() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActClassCodeTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActClassCode(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActMoodCode() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActMoodCodeTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActMoodCode(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActNegationInd() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActNegationIndTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActNegationInd(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActCodeP() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActCodePTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActCodeP(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActCode() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActCodeTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActCode",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActCode(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActStatusCode() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActStatusCodeTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActStatusCode(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActStatusCodeP() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActStatusCodePTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActStatusCodeP(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActTreatmentGivenSubstanceAdministration() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration() {
		OperationsTestCase<TherapeuticRegimenAct> validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<TherapeuticRegimenAct>(
			"validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TherapeuticRegimenAct target) {

			}

			@Override
			protected void updateToPass(TherapeuticRegimenAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TherapeuticRegimenActOperations.validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(
					(TherapeuticRegimenAct) objectToTest, diagnostician, map);
			}

		};

		validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTreatmentGivenSubstanceAdministrations() {

		TherapeuticRegimenAct target = objectFactory.create();
		target.getTreatmentGivenSubstanceAdministrations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTreatmentNotGivenSubstanceAdministrations() {

		TherapeuticRegimenAct target = objectFactory.create();
		target.getTreatmentNotGivenSubstanceAdministrations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TherapeuticRegimenAct> {
		public TherapeuticRegimenAct create() {
			return PhcrFactory.eINSTANCE.createTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends TherapeuticRegimenActOperations {
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

} // TherapeuticRegimenActOperations
