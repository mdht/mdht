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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSProtocolSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Protocol Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionProtocolObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCandidatePatientRegistryType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Candidate Patient Registry Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#getProtocolObservation() <em>Get Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#getCandidatePatientRegistryType() <em>Get Candidate Patient Registry Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSProtocolSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionTemplateId() {
		OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionTemplateIdTestCase = new OperationsTestCase<EMSProtocolSection>(
			"validateEMSProtocolSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProtocolSection target) {

			}

			@Override
			protected void updateToPass(EMSProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProtocolSectionOperations.validateEMSProtocolSectionTemplateId(
					(EMSProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProtocolSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionCode() {
		OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionCodeTestCase = new OperationsTestCase<EMSProtocolSection>(
			"validateEMSProtocolSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProtocolSection target) {

			}

			@Override
			protected void updateToPass(EMSProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProtocolSectionOperations.validateEMSProtocolSectionCode(
					(EMSProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProtocolSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionTitle() {
		OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionTitleTestCase = new OperationsTestCase<EMSProtocolSection>(
			"validateEMSProtocolSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProtocolSection target) {

			}

			@Override
			protected void updateToPass(EMSProtocolSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProtocolSectionOperations.validateEMSProtocolSectionTitle(
					(EMSProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProtocolSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionText() {
		OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionTextTestCase = new OperationsTestCase<EMSProtocolSection>(
			"validateEMSProtocolSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProtocolSection target) {

			}

			@Override
			protected void updateToPass(EMSProtocolSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProtocolSectionOperations.validateEMSProtocolSectionText(
					(EMSProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProtocolSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionProtocolObservation() {
		OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionProtocolObservationTestCase = new OperationsTestCase<EMSProtocolSection>(
			"validateEMSProtocolSectionProtocolObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProtocolSection target) {

			}

			@Override
			protected void updateToPass(EMSProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProtocolSectionOperations.validateEMSProtocolSectionProtocolObservation(
					(EMSProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProtocolSectionProtocolObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionCandidatePatientRegistryType() {
		OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionCandidatePatientRegistryTypeTestCase = new OperationsTestCase<EMSProtocolSection>(
			"validateEMSProtocolSectionCandidatePatientRegistryType",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSProtocolSection target) {

			}

			@Override
			protected void updateToPass(EMSProtocolSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSProtocolSectionOperations.validateEMSProtocolSectionCandidatePatientRegistryType(
					(EMSProtocolSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSProtocolSectionCandidatePatientRegistryTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProtocolObservation() {

		EMSProtocolSection target = objectFactory.create();
		target.getProtocolObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCandidatePatientRegistryType() {

		EMSProtocolSection target = objectFactory.create();
		target.getCandidatePatientRegistryType();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSProtocolSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSProtocolSection> {
		public EMSProtocolSection create() {
			return EmspcrFactory.eINSTANCE.createEMSProtocolSection();
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
	private static class ConstructorTestClass extends EMSProtocolSectionOperations {
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

} // EMSProtocolSectionOperations
