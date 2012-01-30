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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_DocumentationOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport_DocumentationOfOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report Documentation Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_DocumentationOf#validateDocumentationOfServiceEvent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Documentation Of Service Event3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticImagingReport_DocumentationOfTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDocumentationOfServiceEvent3() {
		OperationsTestCase<DiagnosticImagingReport_DocumentationOf> validateDocumentationOfServiceEvent3TestCase = new OperationsTestCase<DiagnosticImagingReport_DocumentationOf>(
			"validateDocumentationOfServiceEvent3",
			operationsForOCL.getOCLValue("VALIDATE_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport_DocumentationOf target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport_DocumentationOf target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport_DocumentationOfOperations.validateDocumentationOfServiceEvent3(
					(DiagnosticImagingReport_DocumentationOf) objectToTest, diagnostician, map);
			}

		};

		validateDocumentationOfServiceEvent3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticImagingReport_DocumentationOfOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DiagnosticImagingReport_DocumentationOf> {
		public DiagnosticImagingReport_DocumentationOf create() {
			return ConsolFactory.eINSTANCE.createDiagnosticImagingReport_DocumentationOf();
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
	private static class ConstructorTestClass extends DiagnosticImagingReport_DocumentationOfOperations {
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

} // DiagnosticImagingReport_DocumentationOfOperations
