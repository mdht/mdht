/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validatePhcrRelevantDxTestsSectionImagingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Dx Tests Section Imaging Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#getPHCRResultOrganizers() <em>Get PHCR Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#getResultObservations() <em>Get Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#getImagingObservations() <em>Get Imaging Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection#validateResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhcrRelevantDxTestsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantDxTestsSectionCode() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validatePhcrRelevantDxTestsSectionCodeTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validatePhcrRelevantDxTestsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionCode(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantDxTestsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantDxTestsSectionTitle() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validatePhcrRelevantDxTestsSectionTitleTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validatePhcrRelevantDxTestsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionTitle(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantDxTestsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantDxTestsSectionText() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validatePhcrRelevantDxTestsSectionTextTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validatePhcrRelevantDxTestsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionText(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantDxTestsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantDxTestsSectionResultOrganizer() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validatePhcrRelevantDxTestsSectionResultOrganizerTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validatePhcrRelevantDxTestsSectionResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionResultOrganizer(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantDxTestsSectionResultOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantDxTestsSectionResultObservation() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validatePhcrRelevantDxTestsSectionResultObservationTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validatePhcrRelevantDxTestsSectionResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionResultObservation(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantDxTestsSectionResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantDxTestsSectionImagingObservation() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validatePhcrRelevantDxTestsSectionImagingObservationTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validatePhcrRelevantDxTestsSectionImagingObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionImagingObservation(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantDxTestsSectionImagingObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPHCRResultOrganizers() {

		PhcrRelevantDxTestsSection target = objectFactory.create();
		target.getPHCRResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultObservations() {

		PhcrRelevantDxTestsSection target = objectFactory.create();
		target.getResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImagingObservations() {

		PhcrRelevantDxTestsSection target = objectFactory.create();
		target.getImagingObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionTemplateId() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validateResultsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionCode() {
		OperationsTestCase<PhcrRelevantDxTestsSection> validateResultsSectionCodeTestCase = new OperationsTestCase<PhcrRelevantDxTestsSection>(
			"validateResultsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantDxTestsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantDxTestsSectionOperations.validateResultsSectionCode(
					(PhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhcrRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhcrRelevantDxTestsSection> {
		public PhcrRelevantDxTestsSection create() {
			return PhcrFactory.eINSTANCE.createPhcrRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends PhcrRelevantDxTestsSectionOperations {
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

} // PhcrRelevantDxTestsSectionOperations
