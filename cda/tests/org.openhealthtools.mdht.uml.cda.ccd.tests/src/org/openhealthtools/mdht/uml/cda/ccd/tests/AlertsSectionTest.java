/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;

import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Alerts Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#getProblemActs() <em>Get Problem Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AlertsSectionTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAlertsSectionTemplateId() {
		OperationsTestCase<AlertsSection> validateAlertsSectionTemplateIdTestCase = new OperationsTestCase<AlertsSection>(
				"validateAlertsSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AlertsSection target) {

			}

			@Override
			protected void updateToPass(AlertsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertsSectionOperations.validateAlertsSectionTemplateId(
						(AlertsSection) objectToTest, diagnostician, map);
			}

		};

		validateAlertsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAlertsSectionCode() {
		OperationsTestCase<AlertsSection> validateAlertsSectionCodeTestCase = new OperationsTestCase<AlertsSection>(
				"validateAlertsSectionCode",
				operationsForOCL
						.getOCLValue("VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AlertsSection target) {

			}

			@Override
			protected void updateToPass(AlertsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertsSectionOperations.validateAlertsSectionCode(
						(AlertsSection) objectToTest, diagnostician, map);
			}

		};

		validateAlertsSectionCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAlertsSectionTitle() {
		OperationsTestCase<AlertsSection> validateAlertsSectionTitleTestCase = new OperationsTestCase<AlertsSection>(
				"validateAlertsSectionTitle",
				operationsForOCL
						.getOCLValue("VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AlertsSection target) {

			}

			@Override
			protected void updateToPass(AlertsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertsSectionOperations.validateAlertsSectionTitle(
						(AlertsSection) objectToTest, diagnostician, map);
			}

		};

		validateAlertsSectionTitleTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAlertsSectionText() {
		OperationsTestCase<AlertsSection> validateAlertsSectionTextTestCase = new OperationsTestCase<AlertsSection>(
				"validateAlertsSectionText",
				operationsForOCL
						.getOCLValue("VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AlertsSection target) {

			}

			@Override
			protected void updateToPass(AlertsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertsSectionOperations.validateAlertsSectionText(
						(AlertsSection) objectToTest, diagnostician, map);
			}

		};

		validateAlertsSectionTextTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAlertsSectionProblemAct() {
		OperationsTestCase<AlertsSection> validateAlertsSectionProblemActTestCase = new OperationsTestCase<AlertsSection>(
				"validateAlertsSectionProblemAct",
				operationsForOCL
						.getOCLValue("VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AlertsSection target) {

			}

			@Override
			protected void updateToPass(AlertsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertsSectionOperations.validateAlertsSectionProblemAct(
						(AlertsSection) objectToTest, diagnostician, map);
			}

		};

		validateAlertsSectionProblemActTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends AlertsSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<AlertsSection> {
		public AlertsSection create() {
			return CCDFactory.eINSTANCE.createAlertsSection();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AlertsSectionOperations