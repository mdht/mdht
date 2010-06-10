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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedVitalSignsSectionOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignsSectionOperationsTest extends
CodedVitalSignsSectionOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "2.16.840.1.113883.3.88.11.83.119";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return VitalSignsSectionOperations
				.validateHITSPVitalSignsSectionTemplateId(
						(VitalSignsSection) eObjectToTest,
						diagnostician, map);
			}

		},

		// Entry
		// -------------------------------------------------------------
		new EntryCCDValidationTest() {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return VitalSignsSectionOperations
				.validateHITSPVitalSignsSectionVitalSigns(
						(VitalSignsSection) eObjectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<Entry> retValue = new BasicEList<Entry>();
				final Entry entry = CDAFactory.eINSTANCE.createEntry();

				final VitalSignsOrganizer vso = IHEFactory.eINSTANCE
				.createVitalSignsOrganizer();

				entry.setOrganizer(vso);

				final Component4 c4 = CDAFactory.eINSTANCE
				.createComponent4();
				c4.setObservation(HITSPFactory.eINSTANCE.createVitalSign());

				vso.getComponents().add(c4);

				retValue.add(entry);
				return retValue;
			}
		}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	@Override
	protected EObject getEObjectToValidate() {
		return HITSPFactory.eINSTANCE.createVitalSignsSection();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return HITSPFactory.eINSTANCE.createVitalSignsSection().init();
	}

	// /**
	// * Test method for
	// * {@link
	// org.openhealthtools.mdht.uml.cda.hitsp.operations.VitalSignsSectionOperations#validateHITSPVitalSignsSectionVitalSigns(org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection,
	// org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	// * .
	// */
	// @Test
	// public final void testValidateHITSPVitalSignsSectionVitalSigns() {
	// fail("Not yet implemented"); // TODO
	// }

} // VitalSignsSectionOperationsTest