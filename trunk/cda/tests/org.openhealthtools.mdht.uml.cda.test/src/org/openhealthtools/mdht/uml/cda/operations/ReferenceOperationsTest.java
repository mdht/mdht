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
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Reference;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ReferenceOperationsTest extends CDAValidationTest {

	/**
	 * This is the list of the names of the EReferences that cannot be set
	 * simultaneously. It is missing the name "externalAct" because that
	 * reference is always set, and the others are set individually in sequence
	 * (and then unSet) to test that they invalidate the test.
	 */
	public static final Set<String> MUTUALLY_EXCLUSIVE_EREFERENCE_NAMES = new HashSet<String>(
			Arrays.asList(/* "externalAct", */"externalDocument",
					"externalObservation", "externalProcedure"));

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// MutualExclusionValidationTestCase
	// -------------------------------------------------------------
	new MutualExclusionValidationTestCase("Entry",
			MUTUALLY_EXCLUSIVE_EREFERENCE_NAMES) {

		@Override
		protected boolean validate(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return ReferenceOperations.validateExternalActChoice(
					(Reference) eObjectToTest, diagnostician, map);
		}

		@Override
		protected void initializeEObjectToTest(final EObject eObjectToTest) {
			((Reference) eObjectToTest).setExternalAct(CDAFactory.eINSTANCE
					.createExternalAct());
		}
	} };

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	//	

	/**
	 * @return the EObject instance to be validated
	 */
	@Override
	protected EObject getEObjectToValidate() {
		return CDAFactory.eINSTANCE.createReference();
	} // getEObjectToValidate

} // ReferenceOperationsTest