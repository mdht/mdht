
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

import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.UnstructuredDocumentOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument#validateScannedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument#validateUnstructuredDocumentNoStructuredData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document No Structured Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument#validateUnstructuredDocumentOnePatientPerDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document One Patient Per Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class UnstructuredDocumentTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateScannedDocumentTemplateId() {
			OperationsTestCase<UnstructuredDocument> validateScannedDocumentTemplateIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateScannedDocumentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnstructuredDocumentOperations.validateScannedDocumentTemplateId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateUnstructuredDocumentNoStructuredData() {
			OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentNoStructuredDataTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentNoStructuredData",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnstructuredDocumentOperations.validateUnstructuredDocumentNoStructuredData(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentNoStructuredDataTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateUnstructuredDocumentOnePatientPerDocument() {
			OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentOnePatientPerDocumentTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentOnePatientPerDocument",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnstructuredDocumentOperations.validateUnstructuredDocumentOnePatientPerDocument(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentOnePatientPerDocumentTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends UnstructuredDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnstructuredDocument> {
		public UnstructuredDocument create() {		
			return HITSPFactory.eINSTANCE.createUnstructuredDocument();
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
*
* @generated
*/
	@Override
	protected EObject getObjectToTest() {		
		return null;
	}
	
} // UnstructuredDocumentOperations