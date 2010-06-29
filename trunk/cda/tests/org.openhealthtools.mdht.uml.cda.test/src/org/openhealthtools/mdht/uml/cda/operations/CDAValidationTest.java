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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public abstract class CDAValidationTest {

	// protected static int count = 0;

	protected static Map<Object, Object> map = new HashMap<Object, Object>();

	protected abstract EObject getEObjectToValidate();

	/**
	 * This is not currently used, but is implemented in many subclasses.
	 * 
	 * @return the initialized EObject instance to test
	 */
	protected EObject getEObjectInitToValidate() {
		return null;
	}

	/**
	 * Do all validation tests defined for the eObjectTotest.
	 */
	@Test
	public final void testAll() {
		String testTargetDescription ="";
		try {
			for (final CDATestCase testCase : getTestCases()) {
				testTargetDescription = testCase.getTestTargetDescription();
				final EObject eObjectToTest = getEObjectToValidate();
				final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(eObjectToTest);

				testCase.doTest(eObjectToTest, diagnostician, map);
			}

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(testTargetDescription,uoe));
		}
		//		finally {
		//			count += getTestCases().size();
		//			System.out.println("count = " + count);
		//		}
	} // testAll

	protected List<CDATestCase> getTestCases() {
		return new ArrayList<CDATestCase>();
	}

	static abstract protected class CDATestCase {
		private final String testTargetDescription;

		/**
		 * @param testTargetDescription
		 */
		protected CDATestCase(final String testTargetDescription) {
			this.testTargetDescription = testTargetDescription;
		}

		abstract protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map);

		protected String getTestTargetDescription() {
			return testTargetDescription;
		}

		@Override
		public String toString() {
			return getTestTargetDescription();
		}

	} // CDATestCase

	static abstract protected class CDAOperationsTestCase extends CDATestCase {

		protected CDAOperationsTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		abstract protected void doAdd(EObject eObjectToTest,
				EObject eObjectToAdd);

		abstract protected EObject getEObjectToAdd();

	} // CDAOperationsTestCase

	static abstract protected class CDAAddTestCase extends
	CDAOperationsTestCase {

		protected CDAAddTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		@Override
		protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final EObject eObjectToAdd = getEObjectToAdd();
			doAdd(eObjectToTest, eObjectToAdd);
			final boolean isFound = isFound(eObjectToTest, eObjectToAdd,
					getFeature());
			assertTrue("Add \"" + getTestTargetDescription()
					+ "\" failed for \"" + eObjectToTest.eClass().getName()
					+ "\"", isFound);
		} // doTest

		abstract protected EStructuralFeature getFeature();

		protected boolean isFound(final EObject eObjectToTest,
				final EObject eObjectToFind, final EStructuralFeature feature) {
			return eObjectToFind.eContainingFeature().equals(feature)
			&& eObjectToFind.eContainer().eContainer().equals(
					eObjectToTest);
		} // isFound
	} // CDAAddTestCase

	static abstract protected class CDAGetTestCase extends
	CDAOperationsTestCase {

		protected CDAGetTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		@Override
		protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final EObject eObjectToAdd = getEObjectToAdd();
			doAdd(eObjectToTest, eObjectToAdd);
			final Object value = doGet(eObjectToTest);

			final boolean getIsGood = isGetGood(eObjectToAdd, value);
			assertTrue("Get \"" + getTestTargetDescription()
					+ "\" failed for \"" + eObjectToTest.eClass().getName()
					+ "\"", getIsGood);
		} // doTest

		protected boolean isGetGood(final EObject eObjectToAdd,
				final Object value) {
			final EList<?> list = (EList<?>) value;
			return list.size() == 1 && list.get(0).equals(eObjectToAdd);
		}

		abstract protected Object doGet(EObject eObjectToTest);

	} // CDAGetTestCase

	static abstract protected class CDAHasTestCase extends
	CDAOperationsTestCase {

		protected static final String TEMPLATE_ID = "1.2.3.4";
		protected static final II THE_II = DatatypesFactory.eINSTANCE
		.createII();

		protected static final String CODE = "code";
		protected static final String CODE_SYSTEM = "codeSystem";
		protected static final String CODE_SYSTEM_NAME = "codeSystemName";
		protected static final String CODE_DISPLAY_NAME = "codeDisplayName";
		protected static final CD THE_CODE = DatatypesFactory.eINSTANCE
		.createCD(CODE, CODE_SYSTEM, CODE_SYSTEM_NAME,
				CODE_DISPLAY_NAME);
		protected static final CE THE_CE_CODE = DatatypesFactory.eINSTANCE
		.createCE(CODE, CODE_SYSTEM, CODE_SYSTEM_NAME,
				CODE_DISPLAY_NAME);

		protected CDAHasTestCase(final String testTargetDescription) {
			super(testTargetDescription);
			THE_II.setRoot(TEMPLATE_ID);
		}

		@Override
		protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final EObject eObjectToAdd = getEObjectToAdd();
			doAddTemplateId(eObjectToAdd, THE_II);

			doAdd(eObjectToTest, eObjectToAdd);

			final boolean hasIsGood = doHas(eObjectToTest, TEMPLATE_ID);
			assertTrue("Has \"" + getTestTargetDescription()
					+ "\" failed for \"" + eObjectToTest.eClass().getName()
					+ "\"", hasIsGood);
		} // doTest

		protected abstract void doAddTemplateId(EObject eObjectToTest, II theIi);

		protected abstract boolean doHas(EObject eObjectToAdd, String templateId);

	} // CDAHasTestCase

	static abstract protected class CDAValidationTestCase extends CDATestCase {

		public CDAValidationTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		abstract protected boolean validate(EObject eObjectToTest,
				BasicDiagnostic diagnostician, Map<Object, Object> map);

		protected void validateExpectPass(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final boolean isValid = validate(eObjectToTest, diagnostician, map);
			assertTrue(CDAValidationTest.createAssertionFailureMessage(
					diagnostician, getTestTargetDescription()), isValid);
		}

		protected void validateExpectFail(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final boolean isValid = validate(eObjectToTest, diagnostician, map);
			assertTrue("Validation of \"" + getTestTargetDescription()
					+ "\" passed when it was expected to fail.", !isValid);
		}

	} // CDAValidationTestCase

	static abstract protected class UndefinedValidationTestCase extends
	CDAValidationTestCase {

		private final Set<String> eReferenceNames;

		protected UndefinedValidationTestCase(
				final String testTargetDescription,
				final Set<String> eReferenceNames) {
			super(testTargetDescription);
			this.eReferenceNames = eReferenceNames;
		}

		protected Set<String> getEReferenceNames() {
			return eReferenceNames;
		}

		protected String createEReferenceNotFoundMessage(
				final EObject eObjectToTest, final String eReferenceName) {
			return "EReference \"" + eReferenceName + "\" not found in \""
			+ eObjectToTest.eClass().getName() + "\"";
		}

	} // UndefinedValidationTestCase

	static abstract protected class UndefinedORValidationTestCase extends
	UndefinedValidationTestCase {

		public UndefinedORValidationTestCase(
				final String validationTargetDescription,
				final Set<String> eReferenceNames) {
			super(validationTargetDescription, eReferenceNames);
		}

		@Override
		protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			// Validation should pass here as none of the references are set
			validateExpectPass(eObjectToTest, diagnostician, map);

			// Go through the references of the eObjectToValidate looking for
			// those which we will set and set them all. those which we will set
			// and test for validation failure.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) eObjectToTest
				.eClass().getEStructuralFeature(eReferenceName);

				assertNotNull(createEReferenceNotFoundMessage(eObjectToTest,
						eReferenceName), eReference);

				eObjectToTest.eSet(eReference, CDAFactory.eINSTANCE
						.create((EClass) (eReference.getEType())));

			} // for each reference

			// Validation should fail here because not one is invalid
			validateExpectFail(eObjectToTest, diagnostician, map);

			// Now go through the same set unsetting, each in turn and
			// validating those which we will set and test for validation
			// failure.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) eObjectToTest
				.eClass().getEStructuralFeature(eReferenceName);
				final EObject temp = (EObject) eObjectToTest.eGet(eReference);
				eObjectToTest.eUnset(eReference);
				validateExpectPass(eObjectToTest, diagnostician, map);
				eObjectToTest.eSet(eReference, temp);
			} // for each reference

		} // doTest

	} // UndefinedORValidationTestCase

	static abstract protected class UndefinedXORValidationTestCase extends
	UndefinedValidationTestCase {

		public UndefinedXORValidationTestCase(
				final String validationTargetDescription,
				final Set<String> eReferenceNames) {
			super(validationTargetDescription, eReferenceNames);
		}

		@Override
		protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			// Validation should fail here as none of the references are set
			validateExpectFail(eObjectToTest, diagnostician, map);

			// Go through the references of the eObjectToValidate looking for
			// those which we will set and set them all.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) eObjectToTest
				.eClass().getEStructuralFeature(eReferenceName);
				assertNotNull(createEReferenceNotFoundMessage(eObjectToTest,
						eReferenceName), eReference);
				eObjectToTest.eSet(eReference, CDAFactory.eINSTANCE
						.create((EClass) (eReference.getEType())));
			} // for each reference

			// Validation should fail here because not one is invalid
			validateExpectFail(eObjectToTest, diagnostician, map);

			// Now go through the same set unsetting, each in turn and
			// validating
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) eObjectToTest
				.eClass().getEStructuralFeature(eReferenceName);
				final EObject temp = (EObject) eObjectToTest.eGet(eReference);
				eObjectToTest.eUnset(eReference);
				validateExpectPass(eObjectToTest, diagnostician, map);
				eObjectToTest.eSet(eReference, temp);
			} // for each reference

		} // doTest

	} // UndefinedXORValidationTestCase

	static abstract protected class MutualExclusionValidationTestCase extends
	UndefinedValidationTestCase {

		public MutualExclusionValidationTestCase(
				final String validationTargetDescription,
				final Set<String> eReferenceNames) {
			super(validationTargetDescription, eReferenceNames);
		}

		@Override
		protected void doTest(final EObject eObjectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			// Validation should fail here as none of the references are set
			validateExpectFail(eObjectToTest, diagnostician, map);

			initializeEObjectToTest(eObjectToTest);

			// Make sure everything is valid now
			validateExpectPass(eObjectToTest, diagnostician, map);

			// Go through the references of the eObjectToValidate set them and
			// test for validation failure.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) eObjectToTest
				.eClass().getEStructuralFeature(eReferenceName);

				assertNotNull(createEReferenceNotFoundMessage(eObjectToTest,
						eReferenceName), eReference);

				// This should cause validation failure
				eObjectToTest.eSet(eReference, CDAFactory.eINSTANCE
						.create((EClass) (eReference.getEType())));
				// Which we are expecting
				validateExpectFail(eObjectToTest, diagnostician, map);

				// Undo for the next reference
				eObjectToTest.eUnset(eReference);
			} // for each reference
		} // doTest

		abstract protected void initializeEObjectToTest(EObject eObjectToTest);
	} // MutualExclusionValidationTestCase

	static abstract protected class CDAMutualExclusionValidationTestCase extends
	MutualExclusionValidationTestCase {

		/**
		 * This is the list of the names of the EReferences that cannot be set
		 * simultaneously. It is missing the name "act" because that reference
		 * is always set, and the others are set individually in sequence (and
		 * then unSet) to test that they invalidate the test.
		 */
		private static final Set<String> MUTUALLY_EXCLUSIVE_EREFERENCE_NAMES = new HashSet<String>(
				Arrays
				.asList(/* "act", */"encounter", "observation",
						"observationMedia", "organizer", "procedure",
						"regionOfInterest", "substanceAdministration",
				"supply"));

		protected CDAMutualExclusionValidationTestCase(
				final String validationTargetDescription) {
			super(validationTargetDescription,
					MUTUALLY_EXCLUSIVE_EREFERENCE_NAMES);
		}

	} // CDAMutualExclusionValidationTestCase

	static protected String createUnsupportedOperationFailureMessage(
			final String testTargetDescription,
			final UnsupportedOperationException uoe) {
		return "The test \"" + testTargetDescription + "\" failed because of \""
		+ uoe.getMessage()
		+ "\".  This is likely due to errors in the OCL.";
	}

	static protected String createAssertionFailureMessage(
			final BasicDiagnostic diagnostician) {
		return createAssertionFailureMessage(diagnostician, "");
	}

	static protected String createAssertionFailureMessage(
			final BasicDiagnostic diagnostician, final String source) {
		final StringBuilder sb = new StringBuilder(source);
		sb.append(": ");
		for (final Diagnostic diagnostic : diagnostician.getChildren()) {
			sb.append(" ");
			sb.append(diagnostic.getMessage());
		}
		return sb.toString();
	}

} // CDAValidationTest