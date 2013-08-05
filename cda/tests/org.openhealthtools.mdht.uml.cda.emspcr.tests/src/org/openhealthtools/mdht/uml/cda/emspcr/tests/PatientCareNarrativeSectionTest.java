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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientCareNarrativeSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Care Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection#validatePatientCareNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Narrative Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection#validatePatientCareNarrativeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Narrative Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection#validatePatientCareNarrativeSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Narrative Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection#validatePatientCareNarrativeSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Narrative Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection#validatePatientCareNarrativeSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Narrative Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientCareNarrativeSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareNarrativeSectionTemplateId() {
		OperationsTestCase<PatientCareNarrativeSection> validatePatientCareNarrativeSectionTemplateIdTestCase = new OperationsTestCase<PatientCareNarrativeSection>(
			"validatePatientCareNarrativeSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(PatientCareNarrativeSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionTemplateId(
					(PatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareNarrativeSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareNarrativeSectionCode() {
		OperationsTestCase<PatientCareNarrativeSection> validatePatientCareNarrativeSectionCodeTestCase = new OperationsTestCase<PatientCareNarrativeSection>(
			"validatePatientCareNarrativeSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(PatientCareNarrativeSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionCode(
					(PatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareNarrativeSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareNarrativeSectionCodeP() {
		OperationsTestCase<PatientCareNarrativeSection> validatePatientCareNarrativeSectionCodePTestCase = new OperationsTestCase<PatientCareNarrativeSection>(
			"validatePatientCareNarrativeSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(PatientCareNarrativeSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionCodeP(
					(PatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareNarrativeSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareNarrativeSectionTitle() {
		OperationsTestCase<PatientCareNarrativeSection> validatePatientCareNarrativeSectionTitleTestCase = new OperationsTestCase<PatientCareNarrativeSection>(
			"validatePatientCareNarrativeSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(PatientCareNarrativeSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionTitle(
					(PatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareNarrativeSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareNarrativeSectionText() {
		OperationsTestCase<PatientCareNarrativeSection> validatePatientCareNarrativeSectionTextTestCase = new OperationsTestCase<PatientCareNarrativeSection>(
			"validatePatientCareNarrativeSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(PatientCareNarrativeSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionText(
					(PatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareNarrativeSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientCareNarrativeSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientCareNarrativeSection> {
		public PatientCareNarrativeSection create() {
			return EmspcrFactory.eINSTANCE.createPatientCareNarrativeSection();
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
	private static class ConstructorTestClass extends PatientCareNarrativeSectionOperations {
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

} // PatientCareNarrativeSectionOperations
