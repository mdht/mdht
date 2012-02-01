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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationNoAdditionalRelationships(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation No Additional Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation#validateAdvanceDirectiveStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Status Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationNoAdditionalParticipants() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationNoAdditionalParticipantsTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationNoAdditionalParticipants",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationNoAdditionalParticipants(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationNoAdditionalParticipantsTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationNoAdditionalRelationships() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationNoAdditionalRelationshipsTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationNoAdditionalRelationships",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationNoAdditionalRelationships(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationNoAdditionalRelationshipsTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationTemplateId() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationTemplateId(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationClassCode() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationClassCode(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationMoodCode() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationMoodCodeTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationMoodCode(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationCode() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationCode(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveStatusObservationStatusCode() {
			OperationsTestCase<AdvanceDirectiveStatusObservation> validateAdvanceDirectiveStatusObservationStatusCodeTestCase = new OperationsTestCase<AdvanceDirectiveStatusObservation>(
			"validateAdvanceDirectiveStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveStatusObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveStatusObservation target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationStatusCode(
					(AdvanceDirectiveStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveStatusObservationStatusCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveStatusObservation> {
		public AdvanceDirectiveStatusObservation create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveStatusObservation();
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
	private static class ConstructorTestClass extends AdvanceDirectiveStatusObservationOperations {
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

} // AdvanceDirectiveStatusObservationOperations
