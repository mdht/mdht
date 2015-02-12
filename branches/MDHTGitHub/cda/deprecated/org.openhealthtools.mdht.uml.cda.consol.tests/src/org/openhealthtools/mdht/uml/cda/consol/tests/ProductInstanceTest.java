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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Device;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProductInstanceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceScopingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstancePlayingDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceScopingEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstancePlayingDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProductInstanceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProductInstanceTemplateId() {
		OperationsTestCase<ProductInstance> validateProductInstanceTemplateIdTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstanceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstanceTemplateId(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstanceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProductInstanceClassCode() {
		OperationsTestCase<ProductInstance> validateProductInstanceClassCodeTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstanceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstanceClassCode(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstanceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProductInstanceId() {
		OperationsTestCase<ProductInstance> validateProductInstanceIdTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstanceId",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstanceId(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstanceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProductInstanceScopingEntity() {
		OperationsTestCase<ProductInstance> validateProductInstanceScopingEntityTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstanceScopingEntity",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();
				target.setScopingEntity(CDAFactory.eINSTANCE.createEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstanceScopingEntity(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstanceScopingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProductInstancePlayingDevice() {
		OperationsTestCase<ProductInstance> validateProductInstancePlayingDeviceTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstancePlayingDevice",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();
				target.setPlayingDevice(CDAFactory.eINSTANCE.createDevice());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstancePlayingDevice(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstancePlayingDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProductInstanceScopingEntityId() {
		OperationsTestCase<ProductInstance> validateProductInstanceScopingEntityIdTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstanceScopingEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {
				target.init();
				Entity ent = CDAFactory.eINSTANCE.createEntity();

				target.setScopingEntity(ent);
			}

			@Override
			protected void updateToPass(ProductInstance target) {
				Entity ent = CDAFactory.eINSTANCE.createEntity();
				ent.getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.setScopingEntity(ent);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstanceScopingEntityId(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstanceScopingEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProductInstancePlayingDeviceCode() {
		OperationsTestCase<ProductInstance> validateProductInstancePlayingDeviceCodeTestCase = new OperationsTestCase<ProductInstance>(
			"validateProductInstancePlayingDeviceCode",
			operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {
				target.init();
				Device pd = CDAFactory.eINSTANCE.createDevice();
				target.setPlayingDevice(pd);
			}

			@Override
			protected void updateToPass(ProductInstance target) {
				Device pd = CDAFactory.eINSTANCE.createDevice();
				pd.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.setPlayingDevice(pd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations.validateProductInstancePlayingDeviceCode(
					(ProductInstance) objectToTest, diagnostician, map);
			}

		};

		validateProductInstancePlayingDeviceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProductInstanceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProductInstance> {
		public ProductInstance create() {
			return ConsolFactory.eINSTANCE.createProductInstance();
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
	private static class ConstructorTestClass extends ProductInstanceOperations {
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

} // ProductInstanceOperations
