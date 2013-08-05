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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionExistenceOfDrugUseIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Existence Of Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#validateSocialHistorySectionDrugUseIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#getExistenceOfDrugUseIndication() <em>Get Existence Of Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection#getDrugUseIndication() <em>Get Drug Use Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionCode(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCodeP() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionCodePTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionCodeP(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionTitle() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTitleTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTitle(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionText() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTextTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionText(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionExistenceOfDrugUseIndication() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionExistenceOfDrugUseIndicationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionExistenceOfDrugUseIndication",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionExistenceOfDrugUseIndication(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionExistenceOfDrugUseIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionDrugUseIndication() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionDrugUseIndicationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionDrugUseIndication",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionDrugUseIndication(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionDrugUseIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfDrugUseIndication() {

		SocialHistorySection target = objectFactory.create();
		target.getExistenceOfDrugUseIndication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugUseIndication() {

		SocialHistorySection target = objectFactory.create();
		target.getDrugUseIndication();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistorySection> {
		public SocialHistorySection create() {
			return EmspcrFactory.eINSTANCE.createSocialHistorySection();
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
	private static class ConstructorTestClass extends SocialHistorySectionOperations {
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

} // SocialHistorySectionOperations
