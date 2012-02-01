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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection#validateAdvanceDirectivesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection#validateAdvanceDirectivesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection#validateAdvanceDirectivesSectionAdvanceDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Advance Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection#getConsolAdvanceDirectiveObservations() <em>Get Consol Advance Directive Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection#validateAdvanceDirectivesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCode() {
			OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionEntriesOptionalCode(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionTitle() {
			OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionTitleTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionTitle(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionText() {
			OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionTextTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionText(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionAdvanceDirectiveObservation() {
		OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionAdvanceDirectiveObservationTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionAdvanceDirectiveObservation",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionAdvanceDirectiveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAdvanceDirectiveObservations() {


AdvanceDirectivesSection target = objectFactory.create();
target.getConsolAdvanceDirectiveObservations();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
			OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection> {
		public AdvanceDirectivesSection create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSection();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSectionOperations {
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

} // AdvanceDirectivesSectionOperations
