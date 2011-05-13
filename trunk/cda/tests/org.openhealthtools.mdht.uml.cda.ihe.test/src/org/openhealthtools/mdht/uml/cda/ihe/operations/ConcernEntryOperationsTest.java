/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ConcernEntryOperationsTest extends ProblemActOperationsTest {

	public static class OperationsForOCL extends ConcernEntryOperations {
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

	public class ObjectFactory implements TestObjectFactory<ConcernEntry> {
		public ConcernEntry create() {
			return IHEFactory.eINSTANCE.createConcernEntry();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateConcernEntryEffectiveTimeLowHigh() {
		OperationsTestCase<ConcernEntry> testCase = new OperationsTestCase<ConcernEntry>("ValidateConcernEntryEffectiveTimeLowHigh",
				operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS("lowvalue", "highvalue");
				target.setEffectiveTime(value);
			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ConcernEntryOperations.validateConcernEntryEffectiveTimeLowHigh((ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateConcernEntryEffectiveTimeLowNoHigh() {
		OperationsTestCase<ConcernEntry> testCase = new OperationsTestCase<ConcernEntry>("ValidateConcernEntryEffectiveTimeLowNoHigh",
				operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("notcompletedorabortedstatus");
				target.setStatusCode(cs);
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS("lowvalue", "highvalue");
				target.setEffectiveTime(value);
			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ConcernEntryOperations.validateConcernEntryEffectiveTimeLowHigh((ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateConcernEntryTemplateId() {
		OperationsTestCase<ConcernEntry> testCase = new OperationsTestCase<ConcernEntry>("validateConcernEntryTemplateId",
				operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {

			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ConcernEntryOperations.validateConcernEntryTemplateId((ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateConcernEntryEffectiveTime() {
		OperationsTestCase<ConcernEntry> testCase = new OperationsTestCase<ConcernEntry>("ValidateConcernEntryEffectiveTime",
				operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ConcernEntry target) {

				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ConcernEntryOperations.validateConcernEntryEffectiveTime((ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

} // ConcernEntryOperationsTest