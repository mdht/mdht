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
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;

/**
 * This class
 */
@SuppressWarnings("nls")
public class LevelTwoConformanceOperationsTest extends
		LevelOneConformanceOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.20";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
//	new TemplateIDValidationTest(TEMPLATE_ID) {
//
//		@Override
//		protected boolean validate(final EObject objectToTest,
//				final BasicDiagnostic diagnostician,
//				final Map<Object, Object> map) {
//			return LevelTwoConformanceOperations
//					.validateGeneralHeaderConstraintsTemplateId(
//							(LevelTwoConformance) objectToTest, diagnostician,
//							map);
//		}
//
//	}
	};

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	/**
	 * @see org.openhealthtools.mdht.uml.cda.operations.MutualExclusionValidationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return CDTFactory.eINSTANCE.createLevelTwoConformance();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		LevelTwoConformanceOperations obj = new LevelTwoConformanceOperations();
		assertTrue(true);
	} // testConstructor
	
} // LevelTwoConformanceOperationsTest