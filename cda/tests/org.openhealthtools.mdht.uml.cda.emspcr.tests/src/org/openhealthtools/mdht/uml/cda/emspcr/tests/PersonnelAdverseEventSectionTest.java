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
import org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PersonnelAdverseEventSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Personnel Adverse Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionAdverseEventIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionAdverseEventTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#getAdverseEventIndicator() <em>Get Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#getAdverseEventTypeObservation() <em>Get Adverse Event Type Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PersonnelAdverseEventSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionTemplateId() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionTemplateIdTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionTemplateId(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionCode() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionCodeTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionCode(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionCodeP() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionCodePTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionCodeP(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionTitle() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionTitleTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionTitle(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionText() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionTextTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionText(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionAdverseEventIndicator() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionAdverseEventIndicatorTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionAdverseEventIndicator",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionAdverseEventIndicator(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionAdverseEventIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonnelAdverseEventSectionAdverseEventTypeObservation() {
		OperationsTestCase<PersonnelAdverseEventSection> validatePersonnelAdverseEventSectionAdverseEventTypeObservationTestCase = new OperationsTestCase<PersonnelAdverseEventSection>(
			"validatePersonnelAdverseEventSectionAdverseEventTypeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PersonnelAdverseEventSection target) {

			}

			@Override
			protected void updateToPass(PersonnelAdverseEventSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PersonnelAdverseEventSectionOperations.validatePersonnelAdverseEventSectionAdverseEventTypeObservation(
					(PersonnelAdverseEventSection) objectToTest, diagnostician, map);
			}

		};

		validatePersonnelAdverseEventSectionAdverseEventTypeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdverseEventIndicator() {

		PersonnelAdverseEventSection target = objectFactory.create();
		target.getAdverseEventIndicator();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdverseEventTypeObservation() {

		PersonnelAdverseEventSection target = objectFactory.create();
		target.getAdverseEventTypeObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PersonnelAdverseEventSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PersonnelAdverseEventSection> {
		public PersonnelAdverseEventSection create() {
			return EmspcrFactory.eINSTANCE.createPersonnelAdverseEventSection();
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
	private static class ConstructorTestClass extends PersonnelAdverseEventSectionOperations {
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

} // PersonnelAdverseEventSectionOperations
