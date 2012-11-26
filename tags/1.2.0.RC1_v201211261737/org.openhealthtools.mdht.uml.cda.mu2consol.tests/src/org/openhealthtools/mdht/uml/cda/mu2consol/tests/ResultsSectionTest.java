/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Results Section</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection#validateMu2consolResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Results Section Result Organizer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection#getMu2consolResultOrganizers()
 * <em>Get Mu2consol Result Organizers</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ResultsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated not
	 */
	@Test
	public void testValidateMu2consolResultsSectionResultOrganizer() {
		OperationsTestCase<ResultsSection> validateMu2consolResultsSectionResultOrganizerTestCase = new OperationsTestCase<ResultsSection>(
			"validateMu2consolResultsSectionResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.addOrganizer(Mu2consolFactory.eINSTANCE.createResultOrganizer().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateMu2consolResultsSectionResultOrganizer(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolResultsSectionResultOrganizerTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolResultOrganizers() {

		ResultsSection target = objectFactory.create();
		target.getMu2consolResultOrganizers();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ResultsSection> validateResultsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionEntriesOptionalTemplateId(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ResultsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultsSection> {

		public ResultsSection create() {
			return Mu2consolFactory.eINSTANCE.createResultsSection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends ResultsSectionOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // ResultsSectionOperations
