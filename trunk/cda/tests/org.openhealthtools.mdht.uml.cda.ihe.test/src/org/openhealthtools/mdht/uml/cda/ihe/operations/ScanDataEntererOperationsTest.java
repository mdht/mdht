/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class ScanDataEntererOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends ScanDataEntererOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<ScanDataEnterer> {
		public ScanDataEnterer create() {
			return IHEFactory.eINSTANCE.createScanDataEnterer();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateScanDataEntererTimeEqualsDocumentEffectiveTime() {
		OperationsTestCase<ScanDataEnterer> testCase = new OperationsTestCase<ScanDataEnterer>(
			"ValidateScanDataEntererTimeEqualsDocumentEffectiveTime",
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

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanDataEntererHasAssignedEntityId() {
		OperationsTestCase<ScanDataEnterer> testCase = new OperationsTestCase<ScanDataEnterer>(
			"ValidateScanDataEntererHasAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getAssignedEntity().getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanDataEntererOperations.validateScanDataEntererHasAssignedEntityId(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanDataEntererTemplateId() {
		OperationsTestCase<ScanDataEnterer> testCase = new OperationsTestCase<ScanDataEnterer>(
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

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanDataEntererTime() {
		OperationsTestCase<ScanDataEnterer> testCase = new OperationsTestCase<ScanDataEnterer>(
			"ValidateScanDataEntererTime",
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

		testCase.doValidationTest();
	}

	@Override
	protected EObject getObjectToTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
