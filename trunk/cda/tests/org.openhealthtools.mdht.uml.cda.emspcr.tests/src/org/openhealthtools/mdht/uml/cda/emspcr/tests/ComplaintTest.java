/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.Complaint;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintDurationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTypeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintOrganSystemRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplaintTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintDurationRelationship() {
		OperationsTestCase<Complaint> validateComplaintDurationRelationshipTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintDurationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintDurationRelationship(
					(Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintDurationRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeRelationship() {
		OperationsTestCase<Complaint> validateComplaintTypeRelationshipTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintTypeRelationship",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintTypeRelationship(
					(Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemRelationship() {
		OperationsTestCase<Complaint> validateComplaintOrganSystemRelationshipTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintOrganSystemRelationship",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintOrganSystemRelationship(
					(Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTemplateId() {
		OperationsTestCase<Complaint> validateComplaintTemplateIdTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintTemplateId((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintCodeP() {
		OperationsTestCase<Complaint> validateComplaintCodePTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintCodeP((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintCode() {
		OperationsTestCase<Complaint> validateComplaintCodeTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintCode((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintValue() {
		OperationsTestCase<Complaint> validateComplaintValueTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintValue",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintValue((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTargetSiteCode() {
		OperationsTestCase<Complaint> validateComplaintTargetSiteCodeTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintTargetSiteCode((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTargetSiteCodeP() {
		OperationsTestCase<Complaint> validateComplaintTargetSiteCodePTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintTargetSiteCodeP(
					(Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintEffectiveTime() {
		OperationsTestCase<Complaint> validateComplaintEffectiveTimeTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintEffectiveTime((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintMoodCode() {
		OperationsTestCase<Complaint> validateComplaintMoodCodeTestCase = new OperationsTestCase<Complaint>(
			"validateComplaintMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Complaint target) {

			}

			@Override
			protected void updateToPass(Complaint target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOperations.validateComplaintMoodCode((Complaint) objectToTest, diagnostician, map);
			}

		};

		validateComplaintMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplaintOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Complaint> {
		public Complaint create() {
			return EmspcrFactory.eINSTANCE.createComplaint();
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
	private static class ConstructorTestClass extends ComplaintOperations {
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

} // ComplaintOperations
