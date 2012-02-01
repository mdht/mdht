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
import org.openhealthtools.mdht.uml.cda.consol.StudyAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.StudyActOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActSeriesAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Series Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#getSeriesAct() <em>Get Series Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class StudyActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActTemplateId() {
			OperationsTestCase<StudyAct> validateStudyActTemplateIdTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActTemplateId(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActClassCode() {
			OperationsTestCase<StudyAct> validateStudyActClassCodeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActClassCode(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActMoodCode() {
			OperationsTestCase<StudyAct> validateStudyActMoodCodeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActMoodCode(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActId() {
			OperationsTestCase<StudyAct> validateStudyActIdTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActId",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActId(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActCode() {
			OperationsTestCase<StudyAct> validateStudyActCodeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActCode",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActCode(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActEffectiveTime() {
			OperationsTestCase<StudyAct> validateStudyActEffectiveTimeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActEffectiveTime(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActText() {
			OperationsTestCase<StudyAct> validateStudyActTextTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActText",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
		ED text = DatatypesFactory.eINSTANCE.createED();
		target.setText(text );	
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActText(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActSeriesAct() {
			OperationsTestCase<StudyAct> validateStudyActSeriesActTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActSeriesAct",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return StudyActOperations.validateStudyActSeriesAct(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActSeriesActTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeriesAct() {


StudyAct target = objectFactory.create();
target.getSeriesAct();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends StudyActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyAct> {
		public StudyAct create() {
			return ConsolFactory.eINSTANCE.createStudyAct();
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
	private static class ConstructorTestClass extends StudyActOperations {
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

} // StudyActOperations
