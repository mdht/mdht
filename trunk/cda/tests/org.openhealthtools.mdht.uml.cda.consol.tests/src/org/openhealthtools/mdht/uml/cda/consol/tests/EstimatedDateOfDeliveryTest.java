/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery;
import org.openhealthtools.mdht.uml.cda.consol.operations.EstimatedDateOfDeliveryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estimated Date Of Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EstimatedDateOfDeliveryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryTemplateId() {
		OperationsTestCase<EstimatedDateOfDelivery> validateEstimatedDateOfDeliveryTemplateIdTestCase = new OperationsTestCase<EstimatedDateOfDelivery>(
			"validateEstimatedDateOfDeliveryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDelivery target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryTemplateId(
					(EstimatedDateOfDelivery) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryClassCode() {
		OperationsTestCase<EstimatedDateOfDelivery> validateEstimatedDateOfDeliveryClassCodeTestCase = new OperationsTestCase<EstimatedDateOfDelivery>(
			"validateEstimatedDateOfDeliveryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDelivery target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryClassCode(
					(EstimatedDateOfDelivery) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryCode() {
		OperationsTestCase<EstimatedDateOfDelivery> validateEstimatedDateOfDeliveryCodeTestCase = new OperationsTestCase<EstimatedDateOfDelivery>(
			"validateEstimatedDateOfDeliveryCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDelivery target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryCode(
					(EstimatedDateOfDelivery) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryMoodCode() {
		OperationsTestCase<EstimatedDateOfDelivery> validateEstimatedDateOfDeliveryMoodCodeTestCase = new OperationsTestCase<EstimatedDateOfDelivery>(
			"validateEstimatedDateOfDeliveryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDelivery target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryMoodCode(
					(EstimatedDateOfDelivery) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryStatusCode() {
		OperationsTestCase<EstimatedDateOfDelivery> validateEstimatedDateOfDeliveryStatusCodeTestCase = new OperationsTestCase<EstimatedDateOfDelivery>(
			"validateEstimatedDateOfDeliveryStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDelivery target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDelivery target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryStatusCode(
					(EstimatedDateOfDelivery) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryValue() {
		OperationsTestCase<EstimatedDateOfDelivery> validateEstimatedDateOfDeliveryValueTestCase = new OperationsTestCase<EstimatedDateOfDelivery>(
			"validateEstimatedDateOfDeliveryValue",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDelivery target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDelivery target) {
				target.init();

				TS value = DatatypesFactory.eINSTANCE.createTS();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryValue(
					(EstimatedDateOfDelivery) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EstimatedDateOfDeliveryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EstimatedDateOfDelivery> {
		public EstimatedDateOfDelivery create() {
			return ConsolFactory.eINSTANCE.createEstimatedDateOfDelivery();
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
	private static class ConstructorTestClass extends EstimatedDateOfDeliveryOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // EstimatedDateOfDeliveryOperations
