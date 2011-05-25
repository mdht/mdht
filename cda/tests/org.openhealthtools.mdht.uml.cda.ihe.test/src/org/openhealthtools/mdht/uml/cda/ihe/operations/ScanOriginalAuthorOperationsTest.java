/*******************************************************************************
 * Copyright (c) 2011 Sean Muir, JKM Software, LLC
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir, JKM Software, LLC - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * @author eclipse
 *
 */
public class ScanOriginalAuthorOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends ScanOriginalAuthorOperations {
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

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */

	@Test
	public void testConstructor() {
		ScanOriginalAuthorOperations obj = new ScanOriginalAuthorOperations();
		assertTrue(true);
	} // testConstructor

	public class ScanOriginalAuthorObjectFactory implements TestObjectFactory<ScanOriginalAuthor> {
		public ScanOriginalAuthor create() {
			return IHEFactory.eINSTANCE.createScanOriginalAuthor();
		}
	}

	ScanOriginalAuthorObjectFactory ScanOriginalAuthorObjectFactory = new ScanOriginalAuthorObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.ScanOriginalAuthorOperations#validateScanOriginalAuthorHasAssignedAuthorId(org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateScanOriginalAuthorHasAssignedAuthorId() {
		OperationsTestCase<ScanOriginalAuthor> testCase = new OperationsTestCase<ScanOriginalAuthor>(
			"ValidateScanOriginalAuthorHasAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			ScanOriginalAuthorObjectFactory) {

			@Override
			protected void updateToFail(ScanOriginalAuthor target) {

			}

			@Override
			protected void updateToPass(ScanOriginalAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorId(
					(ScanOriginalAuthor) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.ScanOriginalAuthorOperations#validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId() {
		OperationsTestCase<ScanOriginalAuthor> testCase = new OperationsTestCase<ScanOriginalAuthor>(
			"ValidateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			ScanOriginalAuthorObjectFactory) {

			@Override
			protected void updateToFail(ScanOriginalAuthor target) {

			}

			@Override
			protected void updateToPass(ScanOriginalAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(
					(ScanOriginalAuthor) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.ScanOriginalAuthorOperations#validateScanOriginalAuthorTemplateId(org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateScanOriginalAuthorTemplateId() {
		OperationsTestCase<ScanOriginalAuthor> testCase = new OperationsTestCase<ScanOriginalAuthor>(
			"validateScanOriginalAuthorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			ScanOriginalAuthorObjectFactory) {

			@Override
			protected void updateToFail(ScanOriginalAuthor target) {

			}

			@Override
			protected void updateToPass(ScanOriginalAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanOriginalAuthorOperations.validateScanOriginalAuthorTemplateId(
					(ScanOriginalAuthor) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.hl7.rim.operations.RIMOperationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
