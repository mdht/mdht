/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionHasResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Has Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#getResultOrganizers() <em>Get Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#getExternalReferences() <em>Get External References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticResultsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticResultsSectionHasResult() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionHasResultTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionHasResult",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionHasResult(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionHasResultTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticResultsSectionTemplateId() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionTemplateIdTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionTemplateId(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticResultsSectionCode() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionCodeTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionCode(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticResultsSectionResult() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionResultTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionResult",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionResult(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionResultTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticResultsSectionResultOrganizer() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionResultOrganizerTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionResultOrganizer(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionResultOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticResultsSectionExternalReference() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionExternalReferenceTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionExternalReference",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionExternalReference(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionExternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResults() {

		DiagnosticResultsSection target = objectFactory.create();
		target.getResults();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultOrganizers() {

		DiagnosticResultsSection target = objectFactory.create();
		target.getResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExternalReferences() {

		DiagnosticResultsSection target = objectFactory.create();
		target.getExternalReferences();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticResultsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DiagnosticResultsSection> {
		public DiagnosticResultsSection create() {
			return ConsolFactory.eINSTANCE.createDiagnosticResultsSection();
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
	private static class ConstructorTestClass extends DiagnosticResultsSectionOperations {
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

} // DiagnosticResultsSectionOperations
