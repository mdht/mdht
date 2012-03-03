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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEncounterActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounter Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#getConsolEncounterActivitiess() <em>Get Consol Encounter Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionText() {
			OperationsTestCase<EncountersSection> validateEncountersSectionTextTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EncountersSectionOperations.validateEncountersSectionText(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionTitle() {
			OperationsTestCase<EncountersSection> validateEncountersSectionTitleTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EncountersSectionOperations.validateEncountersSectionTitle(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEncountersSectionEncounterActivities() {
		OperationsTestCase<EncountersSection> validateEncountersSectionEncounterActivitiesTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionEncounterActivities",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();
				target.addEncounter(ConsolFactory.eINSTANCE.createEncounterActivities().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionEncounterActivities(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEncounterActivitiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolEncounterActivitiess() {


EncountersSection target = objectFactory.create();
target.getConsolEncounterActivitiess();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalTemplateId() {
			OperationsTestCase<EncountersSection> validateEncountersSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EncountersSectionOperations.validateEncountersSectionEntriesOptionalTemplateId(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCode() {
			OperationsTestCase<EncountersSection> validateEncountersSectionEntriesOptionalCodeTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EncountersSectionOperations.validateEncountersSectionEntriesOptionalCode(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncountersSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersSection> {
		public EncountersSection create() {
			return ConsolFactory.eINSTANCE.createEncountersSection();
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
	private static class ConstructorTestClass extends EncountersSectionOperations {
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

} // EncountersSectionOperations
