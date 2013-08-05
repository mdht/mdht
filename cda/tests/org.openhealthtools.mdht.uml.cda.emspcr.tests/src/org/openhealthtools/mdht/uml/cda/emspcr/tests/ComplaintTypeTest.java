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

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintTypeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplaintTypeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeTemplateId() {
		OperationsTestCase<ComplaintType> validateComplaintTypeTemplateIdTestCase = new OperationsTestCase<ComplaintType>(
			"validateComplaintTypeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintType target) {

			}

			@Override
			protected void updateToPass(ComplaintType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintTypeOperations.validateComplaintTypeTemplateId(
					(ComplaintType) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeCodeP() {
		OperationsTestCase<ComplaintType> validateComplaintTypeCodePTestCase = new OperationsTestCase<ComplaintType>(
			"validateComplaintTypeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintType target) {

			}

			@Override
			protected void updateToPass(ComplaintType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintTypeOperations.validateComplaintTypeCodeP(
					(ComplaintType) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeCode() {
		OperationsTestCase<ComplaintType> validateComplaintTypeCodeTestCase = new OperationsTestCase<ComplaintType>(
			"validateComplaintTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ComplaintType target) {

			}

			@Override
			protected void updateToPass(ComplaintType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintTypeOperations.validateComplaintTypeCode(
					(ComplaintType) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeValue() {
		OperationsTestCase<ComplaintType> validateComplaintTypeValueTestCase = new OperationsTestCase<ComplaintType>(
			"validateComplaintTypeValue",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintType target) {

			}

			@Override
			protected void updateToPass(ComplaintType target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintTypeOperations.validateComplaintTypeValue(
					(ComplaintType) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeValueP() {
		OperationsTestCase<ComplaintType> validateComplaintTypeValuePTestCase = new OperationsTestCase<ComplaintType>(
			"validateComplaintTypeValueP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintType target) {

			}

			@Override
			protected void updateToPass(ComplaintType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintTypeOperations.validateComplaintTypeValueP(
					(ComplaintType) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplaintTypeMoodCode() {
		OperationsTestCase<ComplaintType> validateComplaintTypeMoodCodeTestCase = new OperationsTestCase<ComplaintType>(
			"validateComplaintTypeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplaintType target) {

			}

			@Override
			protected void updateToPass(ComplaintType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplaintTypeOperations.validateComplaintTypeMoodCode(
					(ComplaintType) objectToTest, diagnostician, map);
			}

		};

		validateComplaintTypeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplaintTypeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ComplaintType> {
		public ComplaintType create() {
			return EmspcrFactory.eINSTANCE.createComplaintType();
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
	private static class ConstructorTestClass extends ComplaintTypeOperations {
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

} // ComplaintTypeOperations
