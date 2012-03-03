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
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.SeriesActOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Series Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#getSOPInstanceObservation() <em>Get SOP Instance Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SeriesActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActTemplateId() {
			OperationsTestCase<SeriesAct> validateSeriesActTemplateIdTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActTemplateId(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActClassCode() {
			OperationsTestCase<SeriesAct> validateSeriesActClassCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActClassCode(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActMoodCode() {
			OperationsTestCase<SeriesAct> validateSeriesActMoodCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActMoodCode(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActCode() {
			OperationsTestCase<SeriesAct> validateSeriesActCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActCode(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActEffectiveTime() {
			OperationsTestCase<SeriesAct> validateSeriesActEffectiveTimeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActEffectiveTime(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActId() {
			OperationsTestCase<SeriesAct> validateSeriesActIdTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActId",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActId(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActText() {
			OperationsTestCase<SeriesAct> validateSeriesActTextTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActText",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
		ED text = DatatypesFactory.eINSTANCE.createED();
		target.setText(text );	
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActText(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActSOPInstanceObservation() {
			OperationsTestCase<SeriesAct> validateSeriesActSOPInstanceObservationTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SeriesActOperations.validateSeriesActSOPInstanceObservation(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActSOPInstanceObservationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservation() {


SeriesAct target = objectFactory.create();
target.getSOPInstanceObservation();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SeriesActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SeriesAct> {
		public SeriesAct create() {
			return ConsolFactory.eINSTANCE.createSeriesAct();
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
	private static class ConstructorTestClass extends SeriesActOperations {
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

} // SeriesActOperations
