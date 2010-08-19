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
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RIMOperationTest;

/**
 * This class is the super class for all JUnit4 test cases for CDA based classes.
 */
@SuppressWarnings("nls")
public abstract class CDAValidationTest extends RIMOperationTest {

	/**
	 * The template id to use for the has* tests.
	 */
	protected static final String BAD_TEMPLATE_ID = "1.2.3.4";
	protected static final II THE_BAD_II = DatatypesFactory.eINSTANCE
	.createII();

	static {
		THE_BAD_II.setRoot(BAD_TEMPLATE_ID);
	}
	
	// protected static int count = 0;

	protected static Map<Object, Object> map = new HashMap<Object, Object>();

	/**
	 * Do all validation tests defined for the objectToTest.
	 */
	@Test
	public final void testAll() {
		String testTargetDescription = "";
		try {
			for (final CDATestCase testCase : getTestCases()) {
				testTargetDescription = testCase.getTestTargetDescription();
				final EObject objectToTest = getObjectToTest();
				final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(objectToTest);

				testCase.doTest(objectToTest, diagnostician, map);
			}

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(
					testTargetDescription, uoe));
		}
		// finally {
		// count += getTestCases().size();
		// System.out.println("count = " + count);
		// }
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

		abstract protected void doTest(final EObject objectToTest,
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

		abstract protected void doAdd(EObject objectToTest,
				EObject eObjectToAdd);

		abstract protected EObject getEObjectToAdd();

	} // CDAOperationsTestCase

	static abstract protected class CDAAddTestCase extends
	CDAOperationsTestCase {

		protected CDAAddTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		@Override
		protected void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final EObject eObjectToAdd = getEObjectToAdd();
			doAdd(objectToTest, eObjectToAdd);
			final boolean isFound = isFound(objectToTest, eObjectToAdd,
					getFeature());
			assertTrue("Add \"" + getTestTargetDescription()
					+ "\" failed for \"" + objectToTest.eClass().getName()
					+ "\"", isFound);
		} // doTest

		abstract protected EStructuralFeature getFeature();

		protected boolean isFound(final EObject objectToTest,
				final EObject eObjectToFind, final EStructuralFeature feature) {
			return eObjectToFind.eContainingFeature().equals(feature)
			&& eObjectToFind.eContainer().eContainer()
			.equals(objectToTest);
		} // isFound
	} // CDAAddTestCase

	static abstract protected class CDAGetTestCase extends
	CDAOperationsTestCase {

		protected CDAGetTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		@Override
		protected void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final EObject eObjectToAdd = getEObjectToAdd();
			doAdd(objectToTest, eObjectToAdd);
			final Object value = doGet(objectToTest);

			final boolean getIsGood = isGetGood(eObjectToAdd, value);
			assertTrue("Get \"" + getTestTargetDescription()
					+ "\" failed for \"" + objectToTest.eClass().getName()
					+ "\"", getIsGood);
		} // doTest

		protected boolean isGetGood(final EObject eObjectToAdd,
				final Object value) {
			final EList<?> list = (EList<?>) value;
			return list.size() == 1 && list.get(0).equals(eObjectToAdd);
		}

		abstract protected Object doGet(EObject objectToTest);

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

		protected static final CS THE_CS_CODE = DatatypesFactory.eINSTANCE
		.createCS(CODE);

		protected CDAHasTestCase(final String testTargetDescription) {
			super(testTargetDescription);
			THE_II.setRoot(TEMPLATE_ID);
		}

		@Override
		protected void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final EObject eObjectToAdd = getEObjectToAdd();
			doAddTemplateId(eObjectToAdd, THE_II);

			doAdd(objectToTest, eObjectToAdd);

			final boolean hasIsGood = doHas(objectToTest, TEMPLATE_ID);
			assertTrue("Has \"" + getTestTargetDescription()
					+ "\" failed for \"" + objectToTest.eClass().getName()
					+ "\"", hasIsGood);
		} // doTest

		protected abstract void doAddTemplateId(EObject objectToTest, II theIi);

		protected abstract boolean doHas(EObject eObjectToAdd, String templateId);

	} // CDAHasTestCase

	static abstract protected class CDAValidationTestCase extends CDATestCase {

		public CDAValidationTestCase(final String testTargetDescription) {
			super(testTargetDescription);
		}

		abstract protected boolean validate(EObject objectToTest,
				BasicDiagnostic diagnostician, Map<Object, Object> map);

		protected void validateExpectPass(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final boolean isValid = validate(objectToTest, diagnostician, map);
			assertTrue(CDAValidationTest.createAssertionFailureMessage(
					diagnostician, getTestTargetDescription()), isValid);
		}

		protected void validateExpectFail(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			final boolean isValid = validate(objectToTest, diagnostician, map);
			assertTrue("Validation of \"" + getTestTargetDescription()
					+ "\" passed when it was expected to fail.", !isValid);
		}

	} // CDAValidationTestCase

	// TemplateID Test Case
	protected abstract static class TemplateIDValidationTest extends
	CDAValidationTestCase {
		private static final String TEMPLATE_ID_FEATURE_NAME = "templateId";

		private final String templateID;

		/**
		 * @param templateID
		 */
		public TemplateIDValidationTest(final String templateID) {
			super(TEMPLATE_ID_FEATURE_NAME);
			this.templateID = templateID;
		}

		@Override
		public void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			try {
				validateExpectFail(objectToTest, diagnostician, map);
				getTemplateIds(objectToTest).add(THE_BAD_II);
				validateExpectFail(objectToTest, diagnostician, map);
				getTemplateIds(objectToTest).add(createTheValidII());
				validateExpectPass(objectToTest, diagnostician, map);
			} catch (final UnsupportedOperationException uoe) {
				fail(CDAValidationTest
						.createUnsupportedOperationFailureMessage(TEMPLATE_ID_FEATURE_NAME,
								uoe));
			}
		}

		@SuppressWarnings("unchecked")
		private EList<II> getTemplateIds(final EObject objectToTest) {
			return (EList<II>) objectToTest.eGet(objectToTest
					.eClass().getEStructuralFeature(TEMPLATE_ID_FEATURE_NAME));
		}

		private II createTheValidII() {
			final II retValue = DatatypesFactory.eINSTANCE.createII();
			retValue.setRoot(templateID);
			return retValue;
		}

	} // TemplateIDValidationTest
	
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
				final EObject objectToTest, final String eReferenceName) {
			return "EReference \"" + eReferenceName + "\" not found in \""
			+ objectToTest.eClass().getName() + "\"";
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
		protected void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			// Validation should pass here as none of the references are set
			validateExpectPass(objectToTest, diagnostician, map);

			// Go through the references of the eObjectToValidate looking for
			// those which we will set and set them all. those which we will set
			// and test for validation failure.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) objectToTest
				.eClass().getEStructuralFeature(eReferenceName);

				assertNotNull(
						createEReferenceNotFoundMessage(objectToTest,
								eReferenceName), eReference);

				objectToTest.eSet(eReference, CDAFactory.eINSTANCE
						.create((EClass) (eReference.getEType())));

			} // for each reference

			// Validation should fail here because not one is invalid
			validateExpectFail(objectToTest, diagnostician, map);

			// Now go through the same set unsetting, each in turn and
			// validating those which we will set and test for validation
			// failure.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) objectToTest
				.eClass().getEStructuralFeature(eReferenceName);
				final EObject temp = (EObject) objectToTest.eGet(eReference);
				objectToTest.eUnset(eReference);
				validateExpectPass(objectToTest, diagnostician, map);
				objectToTest.eSet(eReference, temp);
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
		protected void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			// Validation should fail here as none of the references are set
			validateExpectFail(objectToTest, diagnostician, map);

			// Go through the references of the eObjectToValidate looking for
			// those which we will set and set them all.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) objectToTest
				.eClass().getEStructuralFeature(eReferenceName);
				assertNotNull(
						createEReferenceNotFoundMessage(objectToTest,
								eReferenceName), eReference);
				objectToTest.eSet(eReference, CDAFactory.eINSTANCE
						.create((EClass) (eReference.getEType())));
			} // for each reference

			// Validation should fail here because not one is invalid
			validateExpectFail(objectToTest, diagnostician, map);

			// Now go through the same set unsetting, each in turn and
			// validating
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) objectToTest
				.eClass().getEStructuralFeature(eReferenceName);
				final EObject temp = (EObject) objectToTest.eGet(eReference);
				objectToTest.eUnset(eReference);
				validateExpectPass(objectToTest, diagnostician, map);
				objectToTest.eSet(eReference, temp);
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
		protected void doTest(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			// Validation should fail here as none of the references are set
			validateExpectFail(objectToTest, diagnostician, map);

			initializeobjectToTest(objectToTest);

			// Make sure everything is valid now
			validateExpectPass(objectToTest, diagnostician, map);

			// Go through the references of the eObjectToValidate set them and
			// test for validation failure.
			for (final String eReferenceName : getEReferenceNames()) {
				final EReference eReference = (EReference) objectToTest
				.eClass().getEStructuralFeature(eReferenceName);

				assertNotNull(
						createEReferenceNotFoundMessage(objectToTest,
								eReferenceName), eReference);

				// This should cause validation failure
				objectToTest.eSet(eReference, CDAFactory.eINSTANCE
						.create((EClass) (eReference.getEType())));
				// Which we are expecting
				validateExpectFail(objectToTest, diagnostician, map);

				// Undo for the next reference
				objectToTest.eUnset(eReference);
			} // for each reference
		} // doTest

		abstract protected void initializeobjectToTest(EObject objectToTest);
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
				Arrays.asList(/* "act", */"encounter", "observation",
						"observationMedia", "organizer", "procedure",
						"regionOfInterest", "substanceAdministration", "supply"));

		protected CDAMutualExclusionValidationTestCase(
				final String validationTargetDescription) {
			super(validationTargetDescription,
					MUTUALLY_EXCLUSIVE_EREFERENCE_NAMES);
		}

	} // CDAMutualExclusionValidationTestCase

	static protected String createUnsupportedOperationFailureMessage(
			final String testTargetDescription,
			final UnsupportedOperationException uoe) {
		return "The test \"" + testTargetDescription
		+ "\" failed because of \"" + uoe.getMessage()
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