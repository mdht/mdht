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
import org.openhealthtools.mdht.uml.cda.consol.Reference_ExternalDocument;

import org.openhealthtools.mdht.uml.cda.consol.operations.Reference_ExternalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reference External Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Reference_ExternalDocument#validateExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Reference_ExternalDocument#validateExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Reference_ExternalDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExternalDocumentId() {
		OperationsTestCase<Reference_ExternalDocument> validateExternalDocumentIdTestCase = new OperationsTestCase<Reference_ExternalDocument>(
			"validateExternalDocumentId",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Reference_ExternalDocument target) {

			}

			@Override
			protected void updateToPass(Reference_ExternalDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Reference_ExternalDocumentOperations.validateExternalDocumentId(
					(Reference_ExternalDocument) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExternalDocumentText() {
		OperationsTestCase<Reference_ExternalDocument> validateExternalDocumentTextTestCase = new OperationsTestCase<Reference_ExternalDocument>(
			"validateExternalDocumentText",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Reference_ExternalDocument target) {

			}

			@Override
			protected void updateToPass(Reference_ExternalDocument target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Reference_ExternalDocumentOperations.validateExternalDocumentText(
					(Reference_ExternalDocument) objectToTest, diagnostician, map);
			}

		};

		validateExternalDocumentTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Reference_ExternalDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Reference_ExternalDocument> {
		public Reference_ExternalDocument create() {
			return ConsolFactory.eINSTANCE.createReference_ExternalDocument();
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
	private static class ConstructorTestClass extends Reference_ExternalDocumentOperations {
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

} // Reference_ExternalDocumentOperations
