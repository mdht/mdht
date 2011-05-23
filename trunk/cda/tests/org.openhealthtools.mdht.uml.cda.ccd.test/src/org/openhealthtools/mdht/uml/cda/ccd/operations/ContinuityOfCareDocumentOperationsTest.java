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

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ContinuityOfCareDocumentOperationsTest extends CCDValidationTest {

	protected static final String CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID = "2.16.840.1.113883.10.20.1";

	protected static final String CODE = "34133-9";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final String LANGUAGE_CODE = "whatever";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentTemplateId(
						(ContinuityOfCareDocument) objectToTest, diagnostician, map);
				}

			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCode(
						(ContinuityOfCareDocument) objectToTest, diagnostician, map);
				}
			},

			// ServiceEvent
			// -------------------------------------------------------------
			new CCDValidationTestCase("documentationOf") {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventRequired(
						(ContinuityOfCareDocument) objectToTest, diagnostician, map) &&
							ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventClassCode(
								(ContinuityOfCareDocument) objectToTest, diagnostician, map) &&
							ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventEffectiveTime(
								(ContinuityOfCareDocument) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<DocumentationOf> retValue = new BasicEList<DocumentationOf>();
					final DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
					final ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

					final IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
					et.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
					et.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
					se.setClassCode(ActClassRoot.PCPR);
					se.setEffectiveTime(et);

					doc.setServiceEvent(se);

					retValue.add(doc);
					return retValue;
				}
			},

			// Author
			// -------------------------------------------------------------
			new CCDValidationTestCase("author") {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthor(
						(ContinuityOfCareDocument) objectToTest, diagnostician, map) &&
							ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
								(ContinuityOfCareDocument) objectToTest, diagnostician, map)

					;
				}

				@Override
				protected Object getValueToSet() {
					final EList<Author> retValue = new BasicEList<Author>();

					// Author 1
					final Author author1 = CDAFactory.eINSTANCE.createAuthor();
					final AssignedAuthor assignedAuthor1 = CDAFactory.eINSTANCE.createAssignedAuthor();
					final Person person1 = CDAFactory.eINSTANCE.createPerson();

					assignedAuthor1.setAssignedPerson(person1);
					author1.setAssignedAuthor(assignedAuthor1);

					retValue.add(author1);

					// Author 2
					final Author author2 = CDAFactory.eINSTANCE.createAuthor();
					final AssignedAuthor assignedAuthor2 = CDAFactory.eINSTANCE.createAssignedAuthor();
					final II id = DatatypesFactory.eINSTANCE.createII();
					id.setNullFlavor(NullFlavor.NA);

					assignedAuthor2.setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

					assignedAuthor2.getIds().add(id);

					author2.setAssignedAuthor(assignedAuthor2);

					retValue.add(author2);

					return retValue;
				}
			},

			// Information Receipient
			// -------------------------------------------------------------
			new CCDValidationTestCase("informationRecipient") {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasInformationRecipient(
						(ContinuityOfCareDocument) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<InformationRecipient> retValue = new BasicEList<InformationRecipient>();
					retValue.add(CDAFactory.eINSTANCE.createInformationRecipient());
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
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createContinuityOfCareDocument();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentNoTemplateIdExtension(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateContinuityOfCareDocumentNoTemplateIdExtension() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);

		ccd.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("root"));

		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentNoTemplateIdExtension(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		ccd.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("root", "extension"));

		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentNoTemplateIdExtension(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentOneOrTwoRecordTarget(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateContinuityOfCareDocumentOneOrTwoRecordTarget() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(
			ccd, diagnostician, map);
		assertTrue(
			"Validation passed when it was expected to fail.  The RecordTargets collection is empty, but should only validate when size is 1 or 2",
			!isValid);

		ccd.getRecordTargets().add(CDAFactory.eINSTANCE.createRecordTarget());

		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		ccd.getRecordTargets().add(CDAFactory.eINSTANCE.createRecordTarget());

		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		ccd.getRecordTargets().add(CDAFactory.eINSTANCE.createRecordTarget());

		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(
			ccd, diagnostician, map);
		assertTrue(
			"Validation passed when it was expected to fail.  The RecordTargets collection is of size 3, but should only validate when size is 1 or 2",
			!isValid);

		// isValid = ContinuityOfCareDocumentOperations
		// .validateContinuityOfCareDocumentNoTemplateIdExtension(ccd,
		// diagnostician, map);
		// assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentPurposeSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareLanguageCode() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		final CS languageCode = DatatypesFactory.eINSTANCE.createCS(LANGUAGE_CODE);
		ccd.setLanguageCode(languageCode);

		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentProblemSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentProblemSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createProblemSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createProblemSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentFamilyHistorySection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentFamilyHistorySection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createFamilyHistorySection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createFamilyHistorySection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentSocialHistorySection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentSocialHistorySection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createSocialHistorySection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createSocialHistorySection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentAlertsSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentAlertsSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAlertsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createAlertsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAlertsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createAlertsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAlertsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentMedicationsSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentMedicationSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createMedicationsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createMedicationsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentResultsSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentResultsSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createResultsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createResultsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentProceduresSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentProceduresSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createProceduresSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createProceduresSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentEncountersSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentEncountersSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createEncountersSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createEncountersSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentPlanOfCareSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentPlanOfCareSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createPlanOfCareSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createPlanOfCareSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentImmunizationsSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentImmunizationsSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createImmunizationsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createImmunizationsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentVitalSignsSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentVitalSignsSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createVitalSignsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createVitalSignsSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentMedicalEquipmentSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentMedicalEquipmentSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createMedicalEquipmentSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createMedicalEquipmentSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentFunctionalStatusSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentFunctionalStatusSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createFunctionalStatusSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createFunctionalStatusSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentAdvanceDirectivesSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createAdvanceDirectivesSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createAdvanceDirectivesSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentPayersSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentPayersSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createPayersSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createPayersSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations#validateContinuityOfCareDocumentPurposeSection(org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateContinuityOfCareDocumentPurposeSection() {
		final ContinuityOfCareDocument ccd = (ContinuityOfCareDocument) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ccd);
		// Can't have zero sections
		boolean isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPurposeSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		// Must have one section
		ccd.addSection(CCDFactory.eINSTANCE.createPurposeSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPurposeSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// Can't have two sections
		ccd.addSection(CCDFactory.eINSTANCE.createPurposeSection());
		isValid = ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPurposeSection(
			ccd, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

} // ContinuityOfCareDocumentOperationsTest
