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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestEventSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection#validateCardiacArrestEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection#validateCardiacArrestEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection#validateCardiacArrestEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection#validateCardiacArrestEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection#validateCardiacArrestEventSectionCardiacArrestExistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Event Section Cardiac Arrest Existence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection#getCardiacArrestExistence() <em>Get Cardiac Arrest Existence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestEventSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestEventSectionTemplateId() {
		OperationsTestCase<CardiacArrestEventSection> validateCardiacArrestEventSectionTemplateIdTestCase = new OperationsTestCase<CardiacArrestEventSection>(
			"validateCardiacArrestEventSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(CardiacArrestEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestEventSectionOperations.validateCardiacArrestEventSectionTemplateId(
					(CardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestEventSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestEventSectionCode() {
		OperationsTestCase<CardiacArrestEventSection> validateCardiacArrestEventSectionCodeTestCase = new OperationsTestCase<CardiacArrestEventSection>(
			"validateCardiacArrestEventSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(CardiacArrestEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestEventSectionOperations.validateCardiacArrestEventSectionCode(
					(CardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestEventSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestEventSectionTitle() {
		OperationsTestCase<CardiacArrestEventSection> validateCardiacArrestEventSectionTitleTestCase = new OperationsTestCase<CardiacArrestEventSection>(
			"validateCardiacArrestEventSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(CardiacArrestEventSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestEventSectionOperations.validateCardiacArrestEventSectionTitle(
					(CardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestEventSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestEventSectionText() {
		OperationsTestCase<CardiacArrestEventSection> validateCardiacArrestEventSectionTextTestCase = new OperationsTestCase<CardiacArrestEventSection>(
			"validateCardiacArrestEventSectionText",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(CardiacArrestEventSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestEventSectionOperations.validateCardiacArrestEventSectionText(
					(CardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestEventSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestEventSectionCardiacArrestExistence() {
		OperationsTestCase<CardiacArrestEventSection> validateCardiacArrestEventSectionCardiacArrestExistenceTestCase = new OperationsTestCase<CardiacArrestEventSection>(
			"validateCardiacArrestEventSectionCardiacArrestExistence",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(CardiacArrestEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestEventSectionOperations.validateCardiacArrestEventSectionCardiacArrestExistence(
					(CardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestEventSectionCardiacArrestExistenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCardiacArrestExistence() {

		CardiacArrestEventSection target = objectFactory.create();
		target.getCardiacArrestExistence();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacArrestEventSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrestEventSection> {
		public CardiacArrestEventSection create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrestEventSection();
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
	private static class ConstructorTestClass extends CardiacArrestEventSectionOperations {
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

} // CardiacArrestEventSectionOperations
