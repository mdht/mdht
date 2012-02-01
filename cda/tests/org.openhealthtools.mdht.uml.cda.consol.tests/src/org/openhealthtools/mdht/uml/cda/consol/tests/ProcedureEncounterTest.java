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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEncounter;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureEncounterOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEncounter#validateProcedureEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEncounter#validateProcedureEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEncounter#validateProcedureEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Encounter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureEncounterTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEncounterClassCode() {
			OperationsTestCase<ProcedureEncounter> validateProcedureEncounterClassCodeTestCase = new OperationsTestCase<ProcedureEncounter>(
			"validateProcedureEncounterClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureEncounter target) {

			}

			@Override
			protected void updateToPass(ProcedureEncounter target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureEncounterOperations.validateProcedureEncounterClassCode(
					(ProcedureEncounter) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEncounterClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEncounterMoodCode() {
			OperationsTestCase<ProcedureEncounter> validateProcedureEncounterMoodCodeTestCase = new OperationsTestCase<ProcedureEncounter>(
			"validateProcedureEncounterMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureEncounter target) {

			}

			@Override
			protected void updateToPass(ProcedureEncounter target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureEncounterOperations.validateProcedureEncounterMoodCode(
					(ProcedureEncounter) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEncounterMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureEncounterId() {
		OperationsTestCase<ProcedureEncounter> validateProcedureEncounterIdTestCase = new OperationsTestCase<ProcedureEncounter>(
			"validateProcedureEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEncounter target) {

			}

			@Override
			protected void updateToPass(ProcedureEncounter target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEncounterOperations.validateProcedureEncounterId(
					(ProcedureEncounter) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureEncounterOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureEncounter> {
		public ProcedureEncounter create() {
			return ConsolFactory.eINSTANCE.createProcedureEncounter();
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
	private static class ConstructorTestClass extends ProcedureEncounterOperations {
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

} // ProcedureEncounterOperations
