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
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceDeliveryLocationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Delivery Location</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ServiceDeliveryLocationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasPlayingEntity() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {

				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				target.setPlayingEntity(pe);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntity(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasPlayingEntityClassCode() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityClassCodeTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {
				target.init();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				target.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {

				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pe.setClassCode(EntityClassRoot.PLC);
				target.setPlayingEntity(pe);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityClassCode(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasPlayingEntityName() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityNameTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntityName",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {
				target.init();
				target.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				target.setPlayingEntity(pe);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityName(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationTemplateId() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationTemplateIdTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTemplateId(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateServiceDeliveryLocationClassCode() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationClassCodeTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the mood
				// code is non-null and of type RoleClassRoot but EMF and Java enforce
				// this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationClassCode(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateServiceDeliveryLocationCode() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationCodeTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.259"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationCode(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateServiceDeliveryLocationAddr() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationAddrTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationAddr",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {

				target.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationAddr(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateServiceDeliveryLocationTelecom() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationTelecomTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTelecom(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ServiceDeliveryLocationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ServiceDeliveryLocation> {
		public ServiceDeliveryLocation create() {
			return ConsolFactory.eINSTANCE.createServiceDeliveryLocation();
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
	private static class ConstructorTestClass extends ServiceDeliveryLocationOperations {
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

} // ServiceDeliveryLocationOperations
