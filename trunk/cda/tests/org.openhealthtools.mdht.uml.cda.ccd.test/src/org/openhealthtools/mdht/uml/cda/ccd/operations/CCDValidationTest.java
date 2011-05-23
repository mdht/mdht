/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * This class serves as the root class for most of the JUnit 4 test cases for
 * CCD. It has one test method called testAllValidations that serves to dispatch
 * a large number of different tests. Each of these tests is specified by
 * instances of the inner class CDATestCase. The exact collection of these
 * instances is obtained by calling the abstract method getTestCases, which is
 * implemented by subclasses of this class. Each of these subclasses defines the
 * tests for a particular CCD Operations test.
 * 
 * The tests themselves are defined as subclasses of CDATestCase, and all are
 * defined in this file. Each specific subclass tests the validation of one
 * specific feature/attribute of the CCD object under test.
 * 
 * This "complicated" arrangement greatly reduces redundancy in the test code.
 * Virtually all of the tests are the same except for the details of which
 * feature to test and the exact validation operation to execute. However, there
 * is no strict inheritance hierarchy that would allow one test to be defined
 * and then customized by subclasses. The different CCD classes to test have a
 * very mixed set of features. The solution is to define a set of test templates
 * (subclasses of CDATestCase), one for each feature to test, and then have the
 * CCD class specific test classes simply return the appropriate collection of
 * these to a method (testAllValdations) that can execute them. This way the
 * different tests can be mixed and matched to the specific CCD class being
 * tested.
 * 
 * As you read the code here and in other files, you see two different related
 * variable names "objectToTest" and "eObjectToValidate." The former is used in
 * the test template described above, the later is a global defined in the
 * superclass to this one (CDAValidationTest) that is initialized by the setUp
 * method. Ideally, there would be only a single approach (the former), but both
 * work.
 */
@SuppressWarnings("nls")
public abstract class CCDValidationTest extends CDAValidationTest {

	// this is a comment to be deleted
	abstract protected static class CCDValidationTestCase extends CDAValidationTestCase {
		protected final String featureName;

		public CCDValidationTestCase(final String featureName) {
			super(featureName);
			this.featureName = featureName;
		}

		@Override
		@SuppressWarnings("synthetic-access")
		public void doTest(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			try {
				validateExpectFail(objectToTest, diagnostician, map);
				doSet(objectToTest);
				validateExpectPass(objectToTest, diagnostician, map);
			} catch (final UnsupportedOperationException uoe) {
				fail(CDAValidationTest.createUnsupportedOperationFailureMessage(featureName, uoe));
			}
		}

		protected void doSet(final EObject objectToTest) {
			doSet(objectToTest, featureName);
		}

		protected void doSet(final EObject objectToTest, final String featureName) {
			doSet(objectToTest, featureName, getValueToSet());
		}

		protected void doSet(final EObject objectToTest, final String featureName, final Object value) {
			objectToTest.eSet(objectToTest.eClass().getEStructuralFeature(featureName), value);
		}

		protected void doSet(final EObject objectToTest, final Object value) {
			objectToTest.eSet(objectToTest.eClass().getEStructuralFeature(featureName), value);
		}

		abstract protected Object getValueToSet();

	} // CCDValidationTestCase

	/**
	 * This class tests title validation
	 */
	abstract public static class TitleCCDValidationTest extends CCDValidationTestCase {

		/**
		 * nothing
		 */
		public TitleCCDValidationTest() {
			super("title");
		}

		@Override
		protected Object getValueToSet() {
			return DatatypesFactory.eINSTANCE.createST();
		}
	} // TitleCCDValidationTest

	// MoodCode Test Case
	abstract protected static class MoodCodeCCDValidationTest extends CCDValidationTestCase {

		public MoodCodeCCDValidationTest() {
			super("moodCode");
		}

		/**
		 * @see org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest.CCDValidationTestCase#doTest(org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.BasicDiagnostic, java.util.Map)
		 */
		@SuppressWarnings("synthetic-access")
		@Override
		public void doTest(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			try {
				// The mood code is initialized to a default value so it should
				// always be defined.
				validateExpectPass(objectToTest, diagnostician, map);
			} catch (final UnsupportedOperationException uoe) {
				fail(CDAValidationTest.createUnsupportedOperationFailureMessage("moodCode", uoe));
			}
		}

		@Override
		protected Object getValueToSet() {
			// Not used
			return null;
		}
	} // MoodCode Validation Test

	// MoodCode Value Test Case
	abstract protected static class MoodCodeValueCCDValidationTest extends CCDValidationTestCase {

		public MoodCodeValueCCDValidationTest() {
			super("moodCode");
		}

		/**
		 * @see org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest.CCDValidationTestCase#doTest(org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.BasicDiagnostic, java.util.Map)
		 */
		@SuppressWarnings("synthetic-access")
		@Override
		public void doTest(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			try {
				for (final Object moodCodeValue : getModeCodeValues()) {
					// set the value here
					doSet(objectToTest, moodCodeValue);
					validateExpectPass(objectToTest, diagnostician, map);
				}

			} catch (final UnsupportedOperationException uoe) {
				fail(CDAValidationTest.createUnsupportedOperationFailureMessage("moodCode", uoe));
			}
		}

		abstract List<Object> getModeCodeValues();

		@Override
		protected Object getValueToSet() {
			// Not used
			return null;
		}
	} // MoodCode Value Validation Test

	/**
	 * Validate Text Test Case
	 */
	abstract public static class TextCCDValidationTest extends CCDValidationTestCase {

		/**
		 * nothing
		 */
		public TextCCDValidationTest() {
			super("text");
		}

		@Override
		protected Object getValueToSet() {
			return CDAFactory.eINSTANCE.createStrucDocText();
		}
	} // TextCCDValidationTest

	/**
	 * Validate Id Test Case
	 */
	abstract public static class IDCCDValidationTest extends CCDValidationTestCase {

		/**
		 * Nothing
		 */
		public IDCCDValidationTest() {
			super("id");
		}

		@Override
		protected Object getValueToSet() {
			final BasicEList<II> retValue = new BasicEList<II>();
			retValue.add(DatatypesFactory.eINSTANCE.createII());
			return retValue;
		}
	} // IDCCDValidationTest

	// Validate Status Code Test Case
	abstract protected static class StatusCodeCCDValidationTest extends CCDValidationTestCase {

		protected final String statusCode;

		protected final String statusCodeCodeSystem;

		public StatusCodeCCDValidationTest(final String statusCode, final String statusCodeCodeSystem) {
			super("statusCode");
			this.statusCode = statusCode;
			this.statusCodeCodeSystem = statusCodeCodeSystem;
		}

		@Override
		protected Object getValueToSet() {
			final CS retValue = DatatypesFactory.eINSTANCE.createCS();
			retValue.setCode(statusCode);
			retValue.setCodeSystem(statusCodeCodeSystem);
			return retValue;
		}
	} // StatusCodeCCDValidationTest

	// Validate Code Test Case
	/**
	 * This class is a JUnit4 test case.
	 */
	public abstract static class CodeCCDValidationTest extends CCDValidationTestCase {

		private final String code;

		private final String codeSystem;

		/**
		 * @param code
		 * @param codeSystem
		 */
		public CodeCCDValidationTest(final String code, final String codeSystem) {
			super("code");
			this.code = code;
			this.codeSystem = codeSystem;
		}

		@Override
		protected Object getValueToSet() {
			final CE retValue = DatatypesFactory.eINSTANCE.createCE();
			retValue.setCode(code);
			retValue.setCodeSystem(codeSystem);
			return retValue;
		}
	} // CodeCCDValidationTest

	/**
	 * Validate Effective Time Test Case
	 */
	abstract public static class EffectiveTimeCCDValidationTest extends CCDValidationTestCase {

		/**
		 * nothing
		 */
		public EffectiveTimeCCDValidationTest() {
			super("effectiveTime");
		}

		@Override
		protected Object getValueToSet() {
			return DatatypesFactory.eINSTANCE.createIVL_TS();
		}
	} // EffectiveTimeCCDValidationTest

	// Validate Observation Value Test Case
	abstract protected static class ObservationValueCCDValidationTest extends CCDValidationTestCase {

		protected String observationValueCodeSystem;

		public ObservationValueCCDValidationTest(final String observationValueCodeSystem) {
			super("value");
			this.observationValueCodeSystem = observationValueCodeSystem;
		}

		@Override
		protected Object getValueToSet() {
			final EList<CE> retValue = new BasicEList<CE>();
			final CE ce = DatatypesFactory.eINSTANCE.createCE();
			ce.setCodeSystem(observationValueCodeSystem);
			retValue.add(ce);
			return retValue;
		}
	} // ObservationValueCCDValidationTest

	// Validate Entry Test Case
	abstract protected static class EntryCCDValidationTest extends CCDValidationTestCase {
		public EntryCCDValidationTest() {
			super("entry");
		}
	} // EntryCCDValidationTest

	// Validate Entry Relationship Test Case
	abstract protected static class EntryRelationshipCCDValidationTest extends CCDValidationTestCase {
		public EntryRelationshipCCDValidationTest() {
			super("entryRelationship");
		}
	} // EntryRelationshipCCDValidationTest

	// Validate Information Source Test Case
	abstract protected static class InformationSourceCCDValidationTest extends CCDValidationTestCase {
		private static final String INFORMANT_FEATURE_NAME = "informant";

		private static final String REFERENCE_FEATURE_NAME = "reference";

		public InformationSourceCCDValidationTest() {
			super(INFORMANT_FEATURE_NAME);
		}

		@SuppressWarnings({ "unchecked", "synthetic-access" })
		@Override
		public void doTest(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			try {

				final EStructuralFeature referenceFeature = objectToTest.eClass().getEStructuralFeature(
					REFERENCE_FEATURE_NAME);

				validateExpectFail(objectToTest, diagnostician, map);

				// The informant collection can be non-empty
				final EList<Informant12> informants = new BasicEList<Informant12>();
				informants.add(CDAFactory.eINSTANCE.createInformant12());
				doSet(objectToTest, INFORMANT_FEATURE_NAME, informants);

				validateExpectPass(objectToTest, diagnostician, map);

				// Or, if empty
				objectToTest.eUnset(objectToTest.eClass().getEStructuralFeature(INFORMANT_FEATURE_NAME));

				final Reference ref = CDAFactory.eINSTANCE.createReference();
				ref.setTypeCode(x_ActRelationshipExternalReference.XCRPT);

				((EList<Reference>) objectToTest.eGet(referenceFeature)).add(ref);

				validateExpectPass(objectToTest, diagnostician, map);

			} catch (final UnsupportedOperationException uoe) {
				fail(CDAValidationTest.createUnsupportedOperationFailureMessage(INFORMANT_FEATURE_NAME, uoe));
			}
		}

		@Override
		protected Object getValueToSet() {
			// Not used in this test
			return null;
		}
	} // InformationSourceCCDValidationTest

} // CCDValidationTest
