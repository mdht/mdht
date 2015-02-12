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
import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintReportedByDispatchOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Reported By Dispatch</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplaintReportedByDispatchTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintReportedByDispatchTemplateId() {
		OperationsTestCase<ComplaintReportedByDispatch> validateComplaintReportedByDispatchTemplateIdTestCase = new OperationsTestCase<ComplaintReportedByDispatch>(
			"validateComplaintReportedByDispatchTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintReportedByDispatch target) {

			}

			@Override
			protected void updateToPass(ComplaintReportedByDispatch target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchTemplateId(
					(ComplaintReportedByDispatch) objectToTest, diagnostician, map);
			}

		};

		validateComplaintReportedByDispatchTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintReportedByDispatchMoodCode() {
		OperationsTestCase<ComplaintReportedByDispatch> validateComplaintReportedByDispatchMoodCodeTestCase = new OperationsTestCase<ComplaintReportedByDispatch>(
			"validateComplaintReportedByDispatchMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintReportedByDispatch target) {

			}

			@Override
			protected void updateToPass(ComplaintReportedByDispatch target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchMoodCode(
					(ComplaintReportedByDispatch) objectToTest, diagnostician, map);
			}

		};

		validateComplaintReportedByDispatchMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintReportedByDispatchCodeP() {
		OperationsTestCase<ComplaintReportedByDispatch> validateComplaintReportedByDispatchCodePTestCase = new OperationsTestCase<ComplaintReportedByDispatch>(
			"validateComplaintReportedByDispatchCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintReportedByDispatch target) {

			}

			@Override
			protected void updateToPass(ComplaintReportedByDispatch target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchCodeP(
					(ComplaintReportedByDispatch) objectToTest, diagnostician, map);
			}

		};

		validateComplaintReportedByDispatchCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintReportedByDispatchCode() {
		OperationsTestCase<ComplaintReportedByDispatch> validateComplaintReportedByDispatchCodeTestCase = new OperationsTestCase<ComplaintReportedByDispatch>(
			"validateComplaintReportedByDispatchCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintReportedByDispatch target) {

			}

			@Override
			protected void updateToPass(ComplaintReportedByDispatch target) {
				target.init();

			}

			@Override
			protected void setDependency(ComplaintReportedByDispatch target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatchCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchCode(
					(ComplaintReportedByDispatch) objectToTest, diagnostician, map);
			}

		};

		validateComplaintReportedByDispatchCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintReportedByDispatchValue() {
		OperationsTestCase<ComplaintReportedByDispatch> validateComplaintReportedByDispatchValueTestCase = new OperationsTestCase<ComplaintReportedByDispatch>(
			"validateComplaintReportedByDispatchValue",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintReportedByDispatch target) {

			}

			@Override
			protected void updateToPass(ComplaintReportedByDispatch target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchValue(
					(ComplaintReportedByDispatch) objectToTest, diagnostician, map);
			}

		};

		validateComplaintReportedByDispatchValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintReportedByDispatchValueP() {
		OperationsTestCase<ComplaintReportedByDispatch> validateComplaintReportedByDispatchValuePTestCase = new OperationsTestCase<ComplaintReportedByDispatch>(
			"validateComplaintReportedByDispatchValueP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintReportedByDispatch target) {

			}

			@Override
			protected void updateToPass(ComplaintReportedByDispatch target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchValueP(
					(ComplaintReportedByDispatch) objectToTest, diagnostician, map);
			}

		};

		validateComplaintReportedByDispatchValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplaintReportedByDispatchOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ComplaintReportedByDispatch> {
		public ComplaintReportedByDispatch create() {
			return EmspcrFactory.eINSTANCE.createComplaintReportedByDispatch();
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
	private static class ConstructorTestClass extends ComplaintReportedByDispatchOperations {
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

} // ComplaintReportedByDispatchOperations
