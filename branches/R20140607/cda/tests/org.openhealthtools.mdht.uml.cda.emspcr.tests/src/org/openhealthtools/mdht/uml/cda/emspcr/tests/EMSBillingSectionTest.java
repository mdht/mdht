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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSBillingSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Billing Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionBillingCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionLevelOfServiceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Level Of Service Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#getBillingCondition() <em>Get Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#getLevelOfServiceObservation() <em>Get Level Of Service Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSBillingSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSBillingSectionTemplateId() {
		OperationsTestCase<EMSBillingSection> validateEMSBillingSectionTemplateIdTestCase = new OperationsTestCase<EMSBillingSection>(
			"validateEMSBillingSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSBillingSection target) {

			}

			@Override
			protected void updateToPass(EMSBillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSBillingSectionOperations.validateEMSBillingSectionTemplateId(
					(EMSBillingSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSBillingSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSBillingSectionCode() {
		OperationsTestCase<EMSBillingSection> validateEMSBillingSectionCodeTestCase = new OperationsTestCase<EMSBillingSection>(
			"validateEMSBillingSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSBillingSection target) {

			}

			@Override
			protected void updateToPass(EMSBillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSBillingSectionOperations.validateEMSBillingSectionCode(
					(EMSBillingSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSBillingSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSBillingSectionTitle() {
		OperationsTestCase<EMSBillingSection> validateEMSBillingSectionTitleTestCase = new OperationsTestCase<EMSBillingSection>(
			"validateEMSBillingSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSBillingSection target) {

			}

			@Override
			protected void updateToPass(EMSBillingSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSBillingSectionOperations.validateEMSBillingSectionTitle(
					(EMSBillingSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSBillingSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSBillingSectionText() {
		OperationsTestCase<EMSBillingSection> validateEMSBillingSectionTextTestCase = new OperationsTestCase<EMSBillingSection>(
			"validateEMSBillingSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSBillingSection target) {

			}

			@Override
			protected void updateToPass(EMSBillingSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSBillingSectionOperations.validateEMSBillingSectionText(
					(EMSBillingSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSBillingSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSBillingSectionBillingCondition() {
		OperationsTestCase<EMSBillingSection> validateEMSBillingSectionBillingConditionTestCase = new OperationsTestCase<EMSBillingSection>(
			"validateEMSBillingSectionBillingCondition",
			operationsForOCL.getOCLValue("VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSBillingSection target) {

			}

			@Override
			protected void updateToPass(EMSBillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSBillingSectionOperations.validateEMSBillingSectionBillingCondition(
					(EMSBillingSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSBillingSectionBillingConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSBillingSectionLevelOfServiceObservation() {
		OperationsTestCase<EMSBillingSection> validateEMSBillingSectionLevelOfServiceObservationTestCase = new OperationsTestCase<EMSBillingSection>(
			"validateEMSBillingSectionLevelOfServiceObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSBillingSection target) {

			}

			@Override
			protected void updateToPass(EMSBillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSBillingSectionOperations.validateEMSBillingSectionLevelOfServiceObservation(
					(EMSBillingSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSBillingSectionLevelOfServiceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBillingCondition() {

		EMSBillingSection target = objectFactory.create();
		target.getBillingCondition();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLevelOfServiceObservation() {

		EMSBillingSection target = objectFactory.create();
		target.getLevelOfServiceObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSBillingSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSBillingSection> {
		public EMSBillingSection create() {
			return EmspcrFactory.eINSTANCE.createEMSBillingSection();
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
	private static class ConstructorTestClass extends EMSBillingSectionOperations {
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

} // EMSBillingSectionOperations
