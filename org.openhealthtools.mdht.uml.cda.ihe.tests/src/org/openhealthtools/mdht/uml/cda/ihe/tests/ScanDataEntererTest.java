/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanDataEntererOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scan Data Enterer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererTimeEqualsDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time Equals Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererHasAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Has Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ScanDataEntererTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanDataEntererTimeEqualsDocumentEffectiveTime() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererTimeEqualsDocumentEffectiveTimeTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererTimeEqualsDocumentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {

				target.init();
				TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
				target.setTime(ts);
				ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
				TS docts = DatatypesFactory.eINSTANCE.createTS("20081204103022-0500");
				;
				cd.setEffectiveTime(docts);
				cd.setDataEnterer(target);

			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
				target.setTime(ts);
				ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
				cd.setEffectiveTime(ts);
				cd.setDataEnterer(target);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererTimeEqualsDocumentEffectiveTime(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererTimeEqualsDocumentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanDataEntererHasAssignedEntityId() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererHasAssignedEntityIdTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererHasAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToFail(ScanDataEnterer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				II ii = DatatypesFactory.eINSTANCE.createII();
				ae.getIds().add(ii);

				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				for (II ii : target.getAssignedEntity().getIds()) {
					ii.setExtension("extension");
					ii.setRoot("root");
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererHasAssignedEntityId(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererHasAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanDataEntererTemplateId() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererTemplateIdTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {

			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererTemplateId(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanDataEntererTime() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererTimeTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererTime",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				TS value = DatatypesFactory.eINSTANCE.createTS("time");
				target.setTime(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererTime(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ScanDataEntererOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScanDataEnterer> {

		public ScanDataEnterer create() {
			return IHEFactory.eINSTANCE.createScanDataEnterer();
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
	private static class ConstructorTestClass extends ScanDataEntererOperations {
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

} // ScanDataEntererOperations
