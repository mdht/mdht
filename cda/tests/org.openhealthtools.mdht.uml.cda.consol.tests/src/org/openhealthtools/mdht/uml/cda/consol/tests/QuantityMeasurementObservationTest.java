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
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.QuantityMeasurementObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Quantity Measurement Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class QuantityMeasurementObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationTemplateId() {
			OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationTemplateIdTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationTemplateId(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends QuantityMeasurementObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<QuantityMeasurementObservation> {
		public QuantityMeasurementObservation create() {
			return ConsolFactory.eINSTANCE.createQuantityMeasurementObservation();
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
	private static class ConstructorTestClass extends QuantityMeasurementObservationOperations {
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

} // QuantityMeasurementObservationOperations
