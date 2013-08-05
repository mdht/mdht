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

import org.openhealthtools.mdht.uml.cda.emspcr.BillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.BillingSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Billing Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionBillingCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionLevelOfServiceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Level Of Service Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#getBillingCondition() <em>Get Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#getLevelOfServiceObservation() <em>Get Level Of Service Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BillingSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingSectionTemplateId() {
		OperationsTestCase<BillingSection> validateBillingSectionTemplateIdTestCase = new OperationsTestCase<BillingSection>(
			"validateBillingSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingSection target) {

			}

			@Override
			protected void updateToPass(BillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingSectionOperations.validateBillingSectionTemplateId(
					(BillingSection) objectToTest, diagnostician, map);
			}

		};

		validateBillingSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingSectionCode() {
		OperationsTestCase<BillingSection> validateBillingSectionCodeTestCase = new OperationsTestCase<BillingSection>(
			"validateBillingSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingSection target) {

			}

			@Override
			protected void updateToPass(BillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingSectionOperations.validateBillingSectionCode(
					(BillingSection) objectToTest, diagnostician, map);
			}

		};

		validateBillingSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingSectionTitle() {
		OperationsTestCase<BillingSection> validateBillingSectionTitleTestCase = new OperationsTestCase<BillingSection>(
			"validateBillingSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingSection target) {

			}

			@Override
			protected void updateToPass(BillingSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingSectionOperations.validateBillingSectionTitle(
					(BillingSection) objectToTest, diagnostician, map);
			}

		};

		validateBillingSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingSectionText() {
		OperationsTestCase<BillingSection> validateBillingSectionTextTestCase = new OperationsTestCase<BillingSection>(
			"validateBillingSectionText",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingSection target) {

			}

			@Override
			protected void updateToPass(BillingSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingSectionOperations.validateBillingSectionText(
					(BillingSection) objectToTest, diagnostician, map);
			}

		};

		validateBillingSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingSectionBillingCondition() {
		OperationsTestCase<BillingSection> validateBillingSectionBillingConditionTestCase = new OperationsTestCase<BillingSection>(
			"validateBillingSectionBillingCondition",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingSection target) {

			}

			@Override
			protected void updateToPass(BillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingSectionOperations.validateBillingSectionBillingCondition(
					(BillingSection) objectToTest, diagnostician, map);
			}

		};

		validateBillingSectionBillingConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingSectionLevelOfServiceObservation() {
		OperationsTestCase<BillingSection> validateBillingSectionLevelOfServiceObservationTestCase = new OperationsTestCase<BillingSection>(
			"validateBillingSectionLevelOfServiceObservation",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingSection target) {

			}

			@Override
			protected void updateToPass(BillingSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingSectionOperations.validateBillingSectionLevelOfServiceObservation(
					(BillingSection) objectToTest, diagnostician, map);
			}

		};

		validateBillingSectionLevelOfServiceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBillingCondition() {

		BillingSection target = objectFactory.create();
		target.getBillingCondition();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLevelOfServiceObservation() {

		BillingSection target = objectFactory.create();
		target.getLevelOfServiceObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BillingSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BillingSection> {
		public BillingSection create() {
			return EmspcrFactory.eINSTANCE.createBillingSection();
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
	private static class ConstructorTestClass extends BillingSectionOperations {
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

} // BillingSectionOperations
