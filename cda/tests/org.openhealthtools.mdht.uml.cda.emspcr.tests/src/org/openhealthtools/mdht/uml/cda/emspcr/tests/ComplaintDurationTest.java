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

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintDurationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Duration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplaintDurationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintDurationTemplateId() {
		OperationsTestCase<ComplaintDuration> validateComplaintDurationTemplateIdTestCase = new OperationsTestCase<ComplaintDuration>(
			"validateComplaintDurationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintDuration target) {

			}

			@Override
			protected void updateToPass(ComplaintDuration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintDurationOperations.validateComplaintDurationTemplateId(
					(ComplaintDuration) objectToTest, diagnostician, map);
			}

		};

		validateComplaintDurationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintDurationCodeP() {
		OperationsTestCase<ComplaintDuration> validateComplaintDurationCodePTestCase = new OperationsTestCase<ComplaintDuration>(
			"validateComplaintDurationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintDuration target) {

			}

			@Override
			protected void updateToPass(ComplaintDuration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintDurationOperations.validateComplaintDurationCodeP(
					(ComplaintDuration) objectToTest, diagnostician, map);
			}

		};

		validateComplaintDurationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintDurationCode() {
		OperationsTestCase<ComplaintDuration> validateComplaintDurationCodeTestCase = new OperationsTestCase<ComplaintDuration>(
			"validateComplaintDurationCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintDuration target) {

			}

			@Override
			protected void updateToPass(ComplaintDuration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintDurationOperations.validateComplaintDurationCode(
					(ComplaintDuration) objectToTest, diagnostician, map);
			}

		};

		validateComplaintDurationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintDurationValue() {
		OperationsTestCase<ComplaintDuration> validateComplaintDurationValueTestCase = new OperationsTestCase<ComplaintDuration>(
			"validateComplaintDurationValue",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintDuration target) {

			}

			@Override
			protected void updateToPass(ComplaintDuration target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintDurationOperations.validateComplaintDurationValue(
					(ComplaintDuration) objectToTest, diagnostician, map);
			}

		};

		validateComplaintDurationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintDurationMoodCode() {
		OperationsTestCase<ComplaintDuration> validateComplaintDurationMoodCodeTestCase = new OperationsTestCase<ComplaintDuration>(
			"validateComplaintDurationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintDuration target) {

			}

			@Override
			protected void updateToPass(ComplaintDuration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintDurationOperations.validateComplaintDurationMoodCode(
					(ComplaintDuration) objectToTest, diagnostician, map);
			}

		};

		validateComplaintDurationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplaintDurationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ComplaintDuration> {
		public ComplaintDuration create() {
			return EmspcrFactory.eINSTANCE.createComplaintDuration();
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
	private static class ConstructorTestClass extends ComplaintDurationOperations {
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

} // ComplaintDurationOperations
