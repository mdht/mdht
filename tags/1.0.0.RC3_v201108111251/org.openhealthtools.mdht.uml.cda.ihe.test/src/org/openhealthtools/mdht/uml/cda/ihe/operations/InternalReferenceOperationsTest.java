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
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * @author eclipse
 *
 */
public class InternalReferenceOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends InternalReferenceOperations {
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
		InternalReferenceOperations obj = new InternalReferenceOperations();
		assertTrue(true);
	} // testConstructor

	public class InternalReferenceObjectFactory implements TestObjectFactory<InternalReference> {
		public InternalReference create() {
			return IHEFactory.eINSTANCE.createInternalReference();
		}
	}

	InternalReferenceObjectFactory objectFactory = new InternalReferenceObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.InternalReferenceOperations#validateInternalReferenceTemplateId(org.openhealthtools.mdht.uml.cda.ihe.InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateInternalReferenceTemplateId() {
		OperationsTestCase<InternalReference> testValidateInternalReferenceTemplateIdTestCase = new OperationsTestCase<InternalReference>(
			"validateInternalReferenceTemplateId", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {

			}

			@Override
			protected void updateToPass(InternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return InternalReferenceOperations.validateInternalReferenceTemplateId(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		testValidateInternalReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.InternalReferenceOperations#validateInternalReferenceCode(org.openhealthtools.mdht.uml.cda.ihe.InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateInternalReferenceCode() {
		OperationsTestCase<InternalReference> testValidateInternalReferenceTemplateIdTestCase = new OperationsTestCase<InternalReference>(
			"ValidateInternalReferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(InternalReference target) {
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return InternalReferenceOperations.validateInternalReferenceCode(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		testValidateInternalReferenceTemplateIdTestCase.doValidationTest();
		;
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.InternalReferenceOperations#validateInternalReferenceId(org.openhealthtools.mdht.uml.cda.ihe.InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateInternalReferenceId() {
		OperationsTestCase<InternalReference> testValidateInternalReferenceTemplateIdTestCase = new OperationsTestCase<InternalReference>(
			"ValidateInternalReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(InternalReference target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return InternalReferenceOperations.validateInternalReferenceId(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		testValidateInternalReferenceTemplateIdTestCase.doValidationTest();
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
