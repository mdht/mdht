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

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintOrganSystemOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Organ System</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplaintOrganSystemTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemTemplateId() {
		OperationsTestCase<ComplaintOrganSystem> validateComplaintOrganSystemTemplateIdTestCase = new OperationsTestCase<ComplaintOrganSystem>(
			"validateComplaintOrganSystemTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintOrganSystem target) {

			}

			@Override
			protected void updateToPass(ComplaintOrganSystem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOrganSystemOperations.validateComplaintOrganSystemTemplateId(
					(ComplaintOrganSystem) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemCodeP() {
		OperationsTestCase<ComplaintOrganSystem> validateComplaintOrganSystemCodePTestCase = new OperationsTestCase<ComplaintOrganSystem>(
			"validateComplaintOrganSystemCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintOrganSystem target) {

			}

			@Override
			protected void updateToPass(ComplaintOrganSystem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOrganSystemOperations.validateComplaintOrganSystemCodeP(
					(ComplaintOrganSystem) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemCode() {
		OperationsTestCase<ComplaintOrganSystem> validateComplaintOrganSystemCodeTestCase = new OperationsTestCase<ComplaintOrganSystem>(
			"validateComplaintOrganSystemCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintOrganSystem target) {

			}

			@Override
			protected void updateToPass(ComplaintOrganSystem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOrganSystemOperations.validateComplaintOrganSystemCode(
					(ComplaintOrganSystem) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemValue() {
		OperationsTestCase<ComplaintOrganSystem> validateComplaintOrganSystemValueTestCase = new OperationsTestCase<ComplaintOrganSystem>(
			"validateComplaintOrganSystemValue",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintOrganSystem target) {

			}

			@Override
			protected void updateToPass(ComplaintOrganSystem target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOrganSystemOperations.validateComplaintOrganSystemValue(
					(ComplaintOrganSystem) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemValueP() {
		OperationsTestCase<ComplaintOrganSystem> validateComplaintOrganSystemValuePTestCase = new OperationsTestCase<ComplaintOrganSystem>(
			"validateComplaintOrganSystemValueP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintOrganSystem target) {

			}

			@Override
			protected void updateToPass(ComplaintOrganSystem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOrganSystemOperations.validateComplaintOrganSystemValueP(
					(ComplaintOrganSystem) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintOrganSystemMoodCode() {
		OperationsTestCase<ComplaintOrganSystem> validateComplaintOrganSystemMoodCodeTestCase = new OperationsTestCase<ComplaintOrganSystem>(
			"validateComplaintOrganSystemMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintOrganSystem target) {

			}

			@Override
			protected void updateToPass(ComplaintOrganSystem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintOrganSystemOperations.validateComplaintOrganSystemMoodCode(
					(ComplaintOrganSystem) objectToTest, diagnostician, map);
			}

		};

		validateComplaintOrganSystemMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplaintOrganSystemOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ComplaintOrganSystem> {
		public ComplaintOrganSystem create() {
			return EmspcrFactory.eINSTANCE.createComplaintOrganSystem();
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
	private static class ConstructorTestClass extends ComplaintOrganSystemOperations {
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

} // ComplaintOrganSystemOperations
