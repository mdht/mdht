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
import org.openhealthtools.mdht.uml.cda.consol.RelatedInformant;
import org.openhealthtools.mdht.uml.cda.consol.operations.RelatedInformantOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Related Informant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedInformant#validateRelatedInformantAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedInformant#validateRelatedInformantCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RelatedInformantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRelatedInformantAddr() {
			OperationsTestCase<RelatedInformant> validateRelatedInformantAddrTestCase = new OperationsTestCase<RelatedInformant>(
			"validateRelatedInformantAddr",
			operationsForOCL.getOCLValue("VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RelatedInformant target) {

			}

			@Override
			protected void updateToPass(RelatedInformant target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RelatedInformantOperations.validateRelatedInformantAddr(
					(RelatedInformant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedInformantAddrTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateRelatedInformantCode() {
		OperationsTestCase<RelatedInformant> validateRelatedInformantCodeTestCase = new OperationsTestCase<RelatedInformant>(
			"validateRelatedInformantCode",
			operationsForOCL.getOCLValue("VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedInformant target) {

			}

			@Override
			protected void updateToPass(RelatedInformant target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedInformantOperations.validateRelatedInformantCode(
					(RelatedInformant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedInformantCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RelatedInformantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RelatedInformant> {
		public RelatedInformant create() {
			return ConsolFactory.eINSTANCE.createRelatedInformant();
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
	private static class ConstructorTestClass extends RelatedInformantOperations {
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

} // RelatedInformantOperations
