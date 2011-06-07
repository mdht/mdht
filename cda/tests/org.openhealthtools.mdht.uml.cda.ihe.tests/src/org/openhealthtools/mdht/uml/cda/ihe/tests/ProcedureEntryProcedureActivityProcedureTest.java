/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedurePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Inversion Ind For Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#getInternalReference() <em>Get Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#getInternalReferenceReasons() <em>Get Internal Reference Reasons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureEntryProcedureActivityProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureMoodCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureMoodCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.setMoodCode(x_DocumentProcedureMood.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureMoodCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT 
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureHasTextReference() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureHasTextReferenceTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

				target.init();
				ED value = DatatypesFactory.eINSTANCE.createED("sample text");
				target.setText(value);

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

				TEL value = DatatypesFactory.eINSTANCE.createTEL("reference");
				target.getText().setReference(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasTextReference(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedurePriorityCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedurePriorityCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedurePriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();
				target.setMoodCode(x_DocumentProcedureMood.INT);

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				CE pc = DatatypesFactory.eINSTANCE.createCE();
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedurePriorityCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedurePriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounterTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(false);
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);

				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureTemplateId(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureClassCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureClassCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureClassCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureText() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureTextTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureText(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureApproachSiteCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureApproachSiteCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureInternalReference() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureInternalReferenceTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureInternalReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReference(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureInternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureInternalReferenceReason() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureInternalReferenceReasonTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureInternalReferenceReason",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {

				for (EntryRelationship er : target.getEntryRelationships()) {
					Act act = IHEFactory.eINSTANCE.createInternalReference().init();
					er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
					er.setAct(act);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureInternalReferenceReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureEntryProcedureActivityProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureEntryProcedureActivityProcedure> {

		public ProcedureEntryProcedureActivityProcedure create() {
			return IHEFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure();
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
	private static class ConstructorTestClass extends ProcedureEntryProcedureActivityProcedureOperations {
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

} // ProcedureEntryProcedureActivityProcedureOperations
