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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;

/**
 * This class is a JUnit4 test case.
 */
public class ENOperationsTest extends DatatypesValidationOperationsText {

	/**
	 * This class is used to hold the details of a single validation test.
	 */
	private static abstract class ENTestCase extends DatatypeTestCase {
		EntityNamePartType partType;

		public ENTestCase(final EStructuralFeature feature,
				final EntityNamePartType partType) {
			super(feature);
			this.partType = partType;
		}

		@Override
		@SuppressWarnings("unchecked")
		public void createAndAddPartType(final EObject objectToTest) {
			final ENXP enxp = DatatypesFactory.eINSTANCE.createENXP(partType,
					TEST_TEXT);
			((EList<ENXP>) (objectToTest.eGet(feature))).add(enxp);

		}

		@Override
		@SuppressWarnings("unchecked")
		public void createAndAddBadPartType(final EObject objectToTest) {
			final ENXP enxpBad = DatatypesFactory.eINSTANCE.createENXP();
			((EList<ENXP>) (objectToTest.eGet(feature))).add(enxpBad);
		}

	} // ADTestCase

	private static final DatatypeTestCase TEST_CASE_ARRAY[] = {
	// delimiter
			// -------------------------------------------------------------

			new ENTestCase(DatatypesPackage.eINSTANCE.getEN_Delimiter(),
					EntityNamePartType.DEL) {

				@Override
				public boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ENOperations.validateDelimiter((EN) objectToTest,
							diagnostician, map);
				}

				@SuppressWarnings("unchecked")
				@Override
				public void createAndAddBadPartType(final EObject objectToTest) {
					// The default is delimiter so, don't set that
					final ENXP enxpBad = DatatypesFactory.eINSTANCE
							.createENXP();
					enxpBad.setPartType(EntityNamePartType.FAM);
					((EList<ENXP>) (objectToTest.eGet(feature))).add(enxpBad);
				}

				@Override
				public void add(final EObject objectToTest,
						final String adxpText) {
					ENOperations.addDelimiter((EN) objectToTest, adxpText);
				}

			},

			// family
			// -------------------------------------------------------------
			new ENTestCase(DatatypesPackage.eINSTANCE.getEN_Family(),
					EntityNamePartType.FAM) {

				@Override
				public boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ENOperations.validateFamily((EN) objectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject objectToTest,
						final String adxpText) {
					ENOperations.addFamily((EN) objectToTest, adxpText);
				}
			},

			// given
			// -------------------------------------------------------------
			new ENTestCase(DatatypesPackage.eINSTANCE.getEN_Given(),
					EntityNamePartType.GIV) {

				@Override
				public boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ENOperations.validateGiven((EN) objectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject objectToTest,
						final String adxpText) {
					ENOperations.addGiven((EN) objectToTest, adxpText);
				}
			},

			// prefix
			// -------------------------------------------------------------
			new ENTestCase(DatatypesPackage.eINSTANCE.getEN_Prefix(),
					EntityNamePartType.PFX) {

				@Override
				public boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ENOperations.validatePrefix((EN) objectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject objectToTest,
						final String adxpText) {
					ENOperations.addPrefix((EN) objectToTest, adxpText);
				}
			},

			// suffix
			// -------------------------------------------------------------
			new ENTestCase(DatatypesPackage.eINSTANCE.getEN_Suffix(),
					EntityNamePartType.SFX) {

				@Override
				public boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ENOperations.validateSuffix((EN) objectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject objectToTest,
						final String adxpText) {
					ENOperations.addSuffix((EN) objectToTest, adxpText);
				}
			} };

	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createEN();
	}

	@Override
	protected List<DatatypeTestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		return new ArrayList<DatatypeTestCase>(Arrays.asList(TEST_CASE_ARRAY));
	}

	/**
	 * test addText and getText
	 */
	@Test
	public final void testAddTextGetText() {
		final EN en = (EN) getObjectToTest();

		en.addText(DatatypeTestCase.TEST_TEXT);
		assertTrue(en.getText().equals(DatatypeTestCase.TEST_TEXT));
	}
} // ENOperationsTest