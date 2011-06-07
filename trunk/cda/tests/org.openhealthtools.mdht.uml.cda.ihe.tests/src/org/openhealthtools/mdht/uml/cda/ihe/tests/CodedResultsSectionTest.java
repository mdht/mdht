/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionSimpleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getExternalReferences() <em>Get External References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getSimpleObservations() <em>Get Simple Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodedResultsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedResultsSectionTemplateId() {
		OperationsTestCase<CodedResultsSection> validateCodedResultsSectionTemplateIdTestCase = new OperationsTestCase<CodedResultsSection>(
			"validateCodedResultsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {

			}

			@Override
			protected void updateToPass(CodedResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedResultsSectionOperations.validateCodedResultsSectionTemplateId(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedResultsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedResultsSectionCode() {
		OperationsTestCase<CodedResultsSection> validateCodedResultsSectionCodeTestCase = new OperationsTestCase<CodedResultsSection>(
			"validateCodedResultsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {

			}

			@Override
			protected void updateToPass(CodedResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedResultsSectionOperations.validateCodedResultsSectionCode(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedResultsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCodedResultsSectionExternalReference() {
		OperationsTestCase<CodedResultsSection> validateCodedResultsSectionExternalReferenceTestCase = new OperationsTestCase<CodedResultsSection>(
			"validateCodedResultsSectionExternalReference",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToFail(CodedResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedResultsSection target) {

				ExternalReference er = IHEFactory.eINSTANCE.createExternalReference().init();

				target.addAct(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedResultsSectionOperations.validateCodedResultsSectionExternalReference(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedResultsSectionExternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedResultsSectionSimpleObservation() {
		OperationsTestCase<CodedResultsSection> validateCodedResultsSectionSimpleObservationTestCase = new OperationsTestCase<CodedResultsSection>(
			"validateCodedResultsSectionSimpleObservation",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedResultsSection target) {
				VitalSignObservation vso = IHEFactory.eINSTANCE.createVitalSignObservation().init();
				target.addObservation(vso);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedResultsSectionOperations.validateCodedResultsSectionSimpleObservation(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedResultsSectionSimpleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodedResultsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodedResultsSection> {

		public CodedResultsSection create() {
			return IHEFactory.eINSTANCE.createCodedResultsSection();
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
	private static class ConstructorTestClass extends CodedResultsSectionOperations {
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

} // CodedResultsSectionOperations
