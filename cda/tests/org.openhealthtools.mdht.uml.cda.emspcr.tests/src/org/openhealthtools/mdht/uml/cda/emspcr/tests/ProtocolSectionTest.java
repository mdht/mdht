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
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProtocolSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionProtocolObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionCandidatePatientRegistryType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Candidate Patient Registry Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#getProtocolObservation() <em>Get Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#getCandidatePatientRegistryType() <em>Get Candidate Patient Registry Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProtocolSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolSectionTemplateId() {
		OperationsTestCase<ProtocolSection> validateProtocolSectionTemplateIdTestCase = new OperationsTestCase<ProtocolSection>(
			"validateProtocolSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolSection target) {

			}

			@Override
			protected void updateToPass(ProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolSectionOperations.validateProtocolSectionTemplateId(
					(ProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateProtocolSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolSectionCode() {
		OperationsTestCase<ProtocolSection> validateProtocolSectionCodeTestCase = new OperationsTestCase<ProtocolSection>(
			"validateProtocolSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolSection target) {

			}

			@Override
			protected void updateToPass(ProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolSectionOperations.validateProtocolSectionCode(
					(ProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateProtocolSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolSectionTitle() {
		OperationsTestCase<ProtocolSection> validateProtocolSectionTitleTestCase = new OperationsTestCase<ProtocolSection>(
			"validateProtocolSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolSection target) {

			}

			@Override
			protected void updateToPass(ProtocolSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolSectionOperations.validateProtocolSectionTitle(
					(ProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateProtocolSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolSectionText() {
		OperationsTestCase<ProtocolSection> validateProtocolSectionTextTestCase = new OperationsTestCase<ProtocolSection>(
			"validateProtocolSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolSection target) {

			}

			@Override
			protected void updateToPass(ProtocolSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolSectionOperations.validateProtocolSectionText(
					(ProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateProtocolSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolSectionProtocolObservation() {
		OperationsTestCase<ProtocolSection> validateProtocolSectionProtocolObservationTestCase = new OperationsTestCase<ProtocolSection>(
			"validateProtocolSectionProtocolObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolSection target) {

			}

			@Override
			protected void updateToPass(ProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolSectionOperations.validateProtocolSectionProtocolObservation(
					(ProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateProtocolSectionProtocolObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolSectionCandidatePatientRegistryType() {
		OperationsTestCase<ProtocolSection> validateProtocolSectionCandidatePatientRegistryTypeTestCase = new OperationsTestCase<ProtocolSection>(
			"validateProtocolSectionCandidatePatientRegistryType",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolSection target) {

			}

			@Override
			protected void updateToPass(ProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolSectionOperations.validateProtocolSectionCandidatePatientRegistryType(
					(ProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateProtocolSectionCandidatePatientRegistryTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProtocolObservation() {

		ProtocolSection target = objectFactory.create();
		target.getProtocolObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCandidatePatientRegistryType() {

		ProtocolSection target = objectFactory.create();
		target.getCandidatePatientRegistryType();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProtocolSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProtocolSection> {
		public ProtocolSection create() {
			return EmspcrFactory.eINSTANCE.createProtocolSection();
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
	private static class ConstructorTestClass extends ProtocolSectionOperations {
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

} // ProtocolSectionOperations
