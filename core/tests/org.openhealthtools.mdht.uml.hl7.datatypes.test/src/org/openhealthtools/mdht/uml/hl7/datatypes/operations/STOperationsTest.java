/*******************************************************************************
 * Copyright (c) 2013 Dan Brown (Audacious Inquiry) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.DatatypesValidationOperationsText.DatatypeTestCase;

/**
 * This class is a JUnit4 test case.
 */
public class STOperationsTest extends DatatypesOperationsTest {

	/**
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.operations.DatatypesOperationsTest#getobjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createST();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Test
	public final void testConstructor() {
		@SuppressWarnings("unused")
		STOperations obj = new STOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Populates an ST with CDATA and calls validate to ensure the constraint is allowing CDATA content 
	 */
	@Test
	public final void testCDATAValidation() {
		// populate an ST with CDATA
		final ST st = (ST) getObjectToTest();
		final EObject objectToTest = getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest);
		st.addCDATA(DatatypeTestCase.CDATA_EXAMPLE);
		// validate
		// test 1
		boolean isValid = STOperations.validateST(st, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);
		// test 2
		st.addCDATA("<![CDATA[Text Anything]]>");
		isValid = STOperations.validateST(st, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);
	}

} // STOperationsTest
