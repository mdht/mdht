/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.DiagnosticResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Diagnostic Results Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionDiagnosticProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Diagnostic Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getDiagnosticProcedures() <em>Get Diagnostic Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getResults() <em>Get Results</em>}</li>
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
	 * @generated NOT
	 */
	@Test
	public void testValidateDiagnosticResultsSectionDiagnosticProcedure() {
		OperationsTestCase<DiagnosticResultsSection> validateDiagnosticResultsSectionDiagnosticProcedureTestCase = new OperationsTestCase<DiagnosticResultsSection>(
			"validateDiagnosticResultsSectionDiagnosticProcedure",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticResultsSection target) {

			}

			@Override
			protected void updateToPass(DiagnosticResultsSection target) {
				target.init();
				Procedure procedure = HITSPFactory.eINSTANCE.createProcedure().init();
				target.addProcedure(procedure);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticResultsSectionOperations.validateDiagnosticResultsSectionDiagnosticProcedure(
					(DiagnosticResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticResultsSectionDiagnosticProcedureTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
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
				Entry entry = CDAFactory.eINSTANCE.createEntry();
				Result obv = HITSPFactory.eINSTANCE.createResult().init();
				entry.setObservation(obv);
				target.getEntries().add(entry);

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
	public void testGetDiagnosticProcedures() {

		DiagnosticResultsSection target = objectFactory.create();
		target.getDiagnosticProcedures();

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
			return HITSPFactory.eINSTANCE.createDiagnosticResultsSection();
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
	private static class ConstructorTestClass extends DiagnosticResultsSectionOperations {
	}

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

} // DiagnosticResultsSectionOperations
