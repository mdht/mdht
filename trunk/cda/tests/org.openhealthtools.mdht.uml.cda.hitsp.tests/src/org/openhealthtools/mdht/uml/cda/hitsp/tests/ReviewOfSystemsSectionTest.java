
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
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.ReviewOfSystemsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Review Of Systems Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection#validateHITSPReviewOfSystemsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Review Of Systems Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ReviewOfSystemsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPReviewOfSystemsSectionTemplateId() {
			OperationsTestCase<ReviewOfSystemsSection> validateHITSPReviewOfSystemsSectionTemplateIdTestCase = new OperationsTestCase<ReviewOfSystemsSection>(
			"validateHITSPReviewOfSystemsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReviewOfSystemsSection target) {

			}

			@Override
			protected void updateToPass(ReviewOfSystemsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReviewOfSystemsSectionOperations.validateHITSPReviewOfSystemsSectionTemplateId(
					(ReviewOfSystemsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPReviewOfSystemsSectionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends ReviewOfSystemsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReviewOfSystemsSection> {
		public ReviewOfSystemsSection create() {		
			return HITSPFactory.eINSTANCE.createReviewOfSystemsSection();
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
	
} // ReviewOfSystemsSectionOperations