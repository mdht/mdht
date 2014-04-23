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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionExistenceOfDrugUseIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Existence Of Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionDrugUseIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#getExistenceOfDrugUseIndication() <em>Get Existence Of Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#getDrugUseIndications() <em>Get Drug Use Indications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSSocialHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionTemplateId() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionTemplateId(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionCode() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionCodeTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionCode(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionCodeP() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionCodePTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionCodeP(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionTitle() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionTitleTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionTitle(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionText() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionTextTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionText(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionExistenceOfDrugUseIndication() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionExistenceOfDrugUseIndicationTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionExistenceOfDrugUseIndication",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionExistenceOfDrugUseIndication(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionExistenceOfDrugUseIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSocialHistorySectionDrugUseIndication() {
		OperationsTestCase<EMSSocialHistorySection> validateEMSSocialHistorySectionDrugUseIndicationTestCase = new OperationsTestCase<EMSSocialHistorySection>(
			"validateEMSSocialHistorySectionDrugUseIndication",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSocialHistorySectionOperations.validateEMSSocialHistorySectionDrugUseIndication(
					(EMSSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSocialHistorySectionDrugUseIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfDrugUseIndication() {

		EMSSocialHistorySection target = objectFactory.create();
		target.getExistenceOfDrugUseIndication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugUseIndications() {

		EMSSocialHistorySection target = objectFactory.create();
		target.getDrugUseIndications();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSSocialHistorySection> {
		public EMSSocialHistorySection create() {
			return EmspcrFactory.eINSTANCE.createEMSSocialHistorySection();
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
	private static class ConstructorTestClass extends EMSSocialHistorySectionOperations {
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

} // EMSSocialHistorySectionOperations
