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
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SpecimenCollectionProcedureOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Specimen Collection Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure#validateSpecimenCollectionProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Collection Procedure Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SpecimenCollectionProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSpecimenCollectionProcedureTemplateId() {
		OperationsTestCase<SpecimenCollectionProcedure> validateSpecimenCollectionProcedureTemplateIdTestCase = new OperationsTestCase<SpecimenCollectionProcedure>(
			"validateSpecimenCollectionProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SpecimenCollectionProcedure target) {

			}

			@Override
			protected void updateToPass(SpecimenCollectionProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureTemplateId(
					(SpecimenCollectionProcedure) objectToTest, diagnostician, map);
			}

		};

		validateSpecimenCollectionProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSpecimenCollectionProcedureClassCode() {
		OperationsTestCase<SpecimenCollectionProcedure> validateSpecimenCollectionProcedureClassCodeTestCase = new OperationsTestCase<SpecimenCollectionProcedure>(
			"validateSpecimenCollectionProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SpecimenCollectionProcedure target) {

			}

			@Override
			protected void updateToPass(SpecimenCollectionProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureClassCode(
					(SpecimenCollectionProcedure) objectToTest, diagnostician, map);
			}

		};

		validateSpecimenCollectionProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSpecimenCollectionProcedureMoodCode() {
		OperationsTestCase<SpecimenCollectionProcedure> validateSpecimenCollectionProcedureMoodCodeTestCase = new OperationsTestCase<SpecimenCollectionProcedure>(
			"validateSpecimenCollectionProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SpecimenCollectionProcedure target) {

			}

			@Override
			protected void updateToPass(SpecimenCollectionProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureMoodCode(
					(SpecimenCollectionProcedure) objectToTest, diagnostician, map);
			}

		};

		validateSpecimenCollectionProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSpecimenCollectionProcedureCode() {
		OperationsTestCase<SpecimenCollectionProcedure> validateSpecimenCollectionProcedureCodeTestCase = new OperationsTestCase<SpecimenCollectionProcedure>(
			"validateSpecimenCollectionProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SpecimenCollectionProcedure target) {

			}

			@Override
			protected void updateToPass(SpecimenCollectionProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureCode(
					(SpecimenCollectionProcedure) objectToTest, diagnostician, map);
			}

		};

		validateSpecimenCollectionProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSpecimenCollectionProcedureEffectiveTime() {
		OperationsTestCase<SpecimenCollectionProcedure> validateSpecimenCollectionProcedureEffectiveTimeTestCase = new OperationsTestCase<SpecimenCollectionProcedure>(
			"validateSpecimenCollectionProcedureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SpecimenCollectionProcedure target) {

			}

			@Override
			protected void updateToPass(SpecimenCollectionProcedure target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureEffectiveTime(
					(SpecimenCollectionProcedure) objectToTest, diagnostician, map);
			}

		};

		validateSpecimenCollectionProcedureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSpecimenCollectionProcedureTargetSiteCode() {
		OperationsTestCase<SpecimenCollectionProcedure> validateSpecimenCollectionProcedureTargetSiteCodeTestCase = new OperationsTestCase<SpecimenCollectionProcedure>(
			"validateSpecimenCollectionProcedureTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SpecimenCollectionProcedure target) {

			}

			@Override
			protected void updateToPass(SpecimenCollectionProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureTargetSiteCode(
					(SpecimenCollectionProcedure) objectToTest, diagnostician, map);
			}

		};

		validateSpecimenCollectionProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SpecimenCollectionProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SpecimenCollectionProcedure> {
		public SpecimenCollectionProcedure create() {
			return PhcrFactory.eINSTANCE.createSpecimenCollectionProcedure();
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
	private static class ConstructorTestClass extends SpecimenCollectionProcedureOperations {
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

} // SpecimenCollectionProcedureOperations
