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

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionEmergencyMedicalDispatchObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Emergency Medical Dispatch Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionComplaintReportedByDispatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Complaint Reported By Dispatch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#getEmergencyMedicalDispatchObservation() <em>Get Emergency Medical Dispatch Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#getComplaintReportedByDispatch() <em>Get Complaint Reported By Dispatch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchSectionTemplateId() {
		OperationsTestCase<DispatchSection> validateDispatchSectionTemplateIdTestCase = new OperationsTestCase<DispatchSection>(
			"validateDispatchSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchSection target) {

			}

			@Override
			protected void updateToPass(DispatchSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchSectionOperations.validateDispatchSectionTemplateId(
					(DispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateDispatchSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchSectionCode() {
		OperationsTestCase<DispatchSection> validateDispatchSectionCodeTestCase = new OperationsTestCase<DispatchSection>(
			"validateDispatchSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchSection target) {

			}

			@Override
			protected void updateToPass(DispatchSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchSectionOperations.validateDispatchSectionCode(
					(DispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateDispatchSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchSectionTitle() {
		OperationsTestCase<DispatchSection> validateDispatchSectionTitleTestCase = new OperationsTestCase<DispatchSection>(
			"validateDispatchSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchSection target) {

			}

			@Override
			protected void updateToPass(DispatchSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchSectionOperations.validateDispatchSectionTitle(
					(DispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateDispatchSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchSectionText() {
		OperationsTestCase<DispatchSection> validateDispatchSectionTextTestCase = new OperationsTestCase<DispatchSection>(
			"validateDispatchSectionText",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchSection target) {

			}

			@Override
			protected void updateToPass(DispatchSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchSectionOperations.validateDispatchSectionText(
					(DispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateDispatchSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchSectionEmergencyMedicalDispatchObservation() {
		OperationsTestCase<DispatchSection> validateDispatchSectionEmergencyMedicalDispatchObservationTestCase = new OperationsTestCase<DispatchSection>(
			"validateDispatchSectionEmergencyMedicalDispatchObservation",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchSection target) {

			}

			@Override
			protected void updateToPass(DispatchSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchSectionOperations.validateDispatchSectionEmergencyMedicalDispatchObservation(
					(DispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateDispatchSectionEmergencyMedicalDispatchObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchSectionComplaintReportedByDispatch() {
		OperationsTestCase<DispatchSection> validateDispatchSectionComplaintReportedByDispatchTestCase = new OperationsTestCase<DispatchSection>(
			"validateDispatchSectionComplaintReportedByDispatch",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchSection target) {

			}

			@Override
			protected void updateToPass(DispatchSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchSectionOperations.validateDispatchSectionComplaintReportedByDispatch(
					(DispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateDispatchSectionComplaintReportedByDispatchTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEmergencyMedicalDispatchObservation() {

		DispatchSection target = objectFactory.create();
		target.getEmergencyMedicalDispatchObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplaintReportedByDispatch() {

		DispatchSection target = objectFactory.create();
		target.getComplaintReportedByDispatch();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispatchSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchSection> {
		public DispatchSection create() {
			return EmspcrFactory.eINSTANCE.createDispatchSection();
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
	private static class ConstructorTestClass extends DispatchSectionOperations {
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

} // DispatchSectionOperations
