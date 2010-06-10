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

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * This class is a JUnit4 test case.
 */
public class ObservationMediaOperationsTest extends CDAValidationTest {

	@SuppressWarnings("nls")
	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Act
			// -------------------------------------------------------------
			new CDAAddTestCase("Act") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createAct();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addAct(
							(ObservationMedia) eObjectToTest,
							(Act) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE.getEntryRelationship_Act();
				}
			},

			// Encounter
			// -------------------------------------------------------------
			new CDAAddTestCase("Encounter") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createEncounter();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addEncounter(
							(ObservationMedia) eObjectToTest,
							(Encounter) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_Encounter();
				}
			},

			// Observation
			// -------------------------------------------------------------
			new CDAAddTestCase("Observation") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createObservation();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addObservation(
							(ObservationMedia) eObjectToTest,
							(Observation) eObjectToAdd);

				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_Observation();
				}
			},

			// ObservationMedia
			// -------------------------------------------------------------
			new CDAAddTestCase("ObservationMedia") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createObservationMedia();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addObservationMedia(
							(ObservationMedia) eObjectToTest,
							(ObservationMedia) eObjectToAdd);

				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_ObservationMedia();
				}
			},

			// Organizer
			// -------------------------------------------------------------
			new CDAAddTestCase("Organizer") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createOrganizer();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addOrganizer(
							(ObservationMedia) eObjectToTest,
							(Organizer) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_Organizer();
				}
			},

			// Procedure
			// -------------------------------------------------------------
			new CDAAddTestCase("Procedure") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createProcedure();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addProcedure(
							(ObservationMedia) eObjectToTest,
							(Procedure) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_Procedure();
				}
			},

			// RegionOfInterest
			// -------------------------------------------------------------
			new CDAAddTestCase("RegionOfInterest") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createRegionOfInterest();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addRegionOfInterest(
							(ObservationMedia) eObjectToTest,
							(RegionOfInterest) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_RegionOfInterest();
				}
			},

			// SubstanceAdministration
			// -------------------------------------------------------------
			new CDAAddTestCase("SubstanceAdministration") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSubstanceAdministration();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addSubstanceAdministration(
							(ObservationMedia) eObjectToTest,
							(SubstanceAdministration) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE
							.getEntryRelationship_SubstanceAdministration();
				}
			},

			// Supply
			// -------------------------------------------------------------
			new CDAAddTestCase("Supply") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSupply();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addSupply(
							(ObservationMedia) eObjectToTest,
							(Supply) eObjectToAdd);
				}

				@Override
				protected EStructuralFeature getFeature() {
					return CDAPackage.eINSTANCE.getEntryRelationship_Supply();
				}
			},
			// *************************************************************************
			// Act
			// -------------------------------------------------------------
			new CDAGetTestCase("Act") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createAct();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addAct(
							(ObservationMedia) eObjectToTest,
							(Act) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getActs((ObservationMedia) eObjectToTest);
				}
			},

			// Encounter
			// -------------------------------------------------------------
			new CDAGetTestCase("Encounter") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createEncounter();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addEncounter(
							(ObservationMedia) eObjectToTest,
							(Encounter) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getEncounters((ObservationMedia) eObjectToTest);
				}

			},

			// Observation
			// -------------------------------------------------------------
			new CDAGetTestCase("Observation") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createObservation();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addObservation(
							(ObservationMedia) eObjectToTest,
							(Observation) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getObservations((ObservationMedia) eObjectToTest);
				}
			},

			// ObservationMedia
			// -------------------------------------------------------------
			new CDAGetTestCase("ObservationMedia") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createObservationMedia();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addObservationMedia(
							(ObservationMedia) eObjectToTest,
							(ObservationMedia) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getObservationMedia((ObservationMedia) eObjectToTest);
				}
			},

			// Organizer
			// -------------------------------------------------------------
			new CDAGetTestCase("Organizer") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createOrganizer();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addOrganizer(
							(ObservationMedia) eObjectToTest,
							(Organizer) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getOrganizers((ObservationMedia) eObjectToTest);
				}
			},

			// Procedure
			// -------------------------------------------------------------
			new CDAGetTestCase("Procedure") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createProcedure();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addProcedure(
							(ObservationMedia) eObjectToTest,
							(Procedure) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getProcedures((ObservationMedia) eObjectToTest);
				}
			},

			// RegionOfInterest
			// -------------------------------------------------------------
			new CDAGetTestCase("RegionOfInterest") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createRegionOfInterest();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addRegionOfInterest(
							(ObservationMedia) eObjectToTest,
							(RegionOfInterest) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getRegionsOfInterest((ObservationMedia) eObjectToTest);
				}
			},

			// SubstanceAdministration
			// -------------------------------------------------------------
			new CDAGetTestCase("SubstanceAdministration") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSubstanceAdministration();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addSubstanceAdministration(
							(ObservationMedia) eObjectToTest,
							(SubstanceAdministration) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getSubstanceAdministrations((ObservationMedia) eObjectToTest);
				}
			},

			// Supply
			// -------------------------------------------------------------
			new CDAGetTestCase("Supply") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSupply();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addSupply(
							(ObservationMedia) eObjectToTest,
							(Supply) eObjectToAdd);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getSupplies((ObservationMedia) eObjectToTest);
				}
			},

			// ClinicalDocument
			// -------------------------------------------------------------
			new CDAGetTestCase("ClinicalDocument") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createClinicalDocument();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					// The Add is reversed, the eObjectToTest is added to the
					// clinical document
					final Section section = CDAFactory.eINSTANCE
							.createSection();
					section
							.addObservationMedia((ObservationMedia) eObjectToTest);
					((ClinicalDocument) eObjectToAdd).addSection(section);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getClinicalDocument((ObservationMedia) eObjectToTest);
				}

				@Override
				protected boolean isGetGood(final EObject eObjectToAdd,
						final Object value) {
					return eObjectToAdd.equals(value);
				}
			},

			// Section
			// -------------------------------------------------------------
			new CDAGetTestCase("Section") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSection();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					// The Add is reversed, the eObjectToTest is added to the
					// clinical document
					((Section) eObjectToAdd)
							.addObservationMedia((ObservationMedia) eObjectToTest);
				}

				@Override
				protected Object doGet(final EObject eObjectToTest) {
					return ObservationMediaOperations
							.getSection((ObservationMedia) eObjectToTest);
				}

				@Override
				protected boolean isGetGood(final EObject eObjectToAdd,
						final Object value) {
					return eObjectToAdd.equals(value);
				}
			},
			// *************************************************************************
			// Act
			// -------------------------------------------------------------
			new CDAHasTestCase("Act") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createAct();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addAct(
							(ObservationMedia) eObjectToTest,
							(Act) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasActTemplate(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((Act) eObjectToAdd).getTemplateIds().add(theIi);
				}
			},

			// Encounter
			// -------------------------------------------------------------
			new CDAHasTestCase("Encounter") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createEncounter();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addEncounter(
							(ObservationMedia) eObjectToTest,
							(Encounter) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasEncounterTemplate(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((Encounter) eObjectToAdd).getTemplateIds().add(theIi);
				}
			},

			// Observation
			// -------------------------------------------------------------
			new CDAHasTestCase("Observation") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createObservation();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addObservation(
							(ObservationMedia) eObjectToTest,
							(Observation) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasObservationTemplate(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((Observation) eObjectToAdd).getTemplateIds().add(theIi);
				}
			},

			// ObservationMedia
			// -------------------------------------------------------------
			new CDAHasTestCase("ObservationMedia") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createObservationMedia();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addObservationMedia(
							(ObservationMedia) eObjectToTest,
							(ObservationMedia) eObjectToAdd);

				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations
							.hasObservationMediaTemplate(
									(ObservationMedia) eObjectToTest,
									templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((ObservationMedia) eObjectToAdd).getTemplateIds().add(
							theIi);
				}
			},

			// Organizer
			// -------------------------------------------------------------
			new CDAHasTestCase("Organizer") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createOrganizer();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addOrganizer(
							(ObservationMedia) eObjectToTest,
							(Organizer) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasOrganizerTemplate(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((Organizer) eObjectToAdd).getTemplateIds().add(theIi);
				}
			},

			// Procedure
			// -------------------------------------------------------------
			new CDAHasTestCase("Procedure") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createProcedure();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addProcedure(
							(ObservationMedia) eObjectToTest,
							(Procedure) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasProcedureTemplate(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((Procedure) eObjectToAdd).getTemplateIds().add(theIi);
				}
			},

			// RegionOfInterest
			// -------------------------------------------------------------
			new CDAHasTestCase("RegionOfInterest") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createRegionOfInterest();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addRegionOfInterest(
							(ObservationMedia) eObjectToTest,
							(RegionOfInterest) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations
							.hasRegionOfInterestTemplate(
									(ObservationMedia) eObjectToTest,
									templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((RegionOfInterest) eObjectToAdd).getTemplateIds().add(
							theIi);
				}

			},

			// SubstanceAdministration
			// -------------------------------------------------------------
			new CDAHasTestCase("SubstanceAdministration") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSubstanceAdministration();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addSubstanceAdministration(
							(ObservationMedia) eObjectToTest,
							(SubstanceAdministration) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations
							.hasSubstanceAdministrationTemplate(
									(ObservationMedia) eObjectToTest,
									templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((SubstanceAdministration) eObjectToAdd).getTemplateIds()
							.add(theIi);
				}
			},

			// Supply
			// -------------------------------------------------------------
			new CDAHasTestCase("Supply") {

				@Override
				protected EObject getEObjectToAdd() {
					return CDAFactory.eINSTANCE.createSupply();
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					ObservationMediaOperations.addSupply(
							(ObservationMedia) eObjectToTest,
							(Supply) eObjectToAdd);
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasSupplyTemplate(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					((Supply) eObjectToAdd).getTemplateIds().add(theIi);
				}
			},

			// TemplateID
			// -------------------------------------------------------------
			new CDAHasTestCase("TemplateID") {

				@Override
				protected void doTest(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					((ObservationMedia) eObjectToTest).getTemplateIds().add(
							THE_II);
					final boolean hasIsGood = doHas(eObjectToTest, TEMPLATE_ID);
					assertTrue("Has \"" + getTestTargetDescription()
							+ "\" failed for \""
							+ eObjectToTest.eClass().getName() + "\"",
							hasIsGood);
				}

				@Override
				protected EObject getEObjectToAdd() {
					return null;
				}

				@Override
				protected void doAdd(final EObject eObjectToTest,
						final EObject eObjectToAdd) {
					// Nothing
				}

				@Override
				protected boolean doHas(final EObject eObjectToTest,
						final String templateId) {
					return ObservationMediaOperations.hasTemplateId(
							(ObservationMedia) eObjectToTest, templateId);
				}

				@Override
				protected void doAddTemplateId(final EObject eObjectToAdd,
						final II theIi) {
					// Nothing
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

	@Override
	protected EObject getEObjectToValidate() {
		return CDAFactory.eINSTANCE.createObservationMedia();
	}

} // ObservationMediaOperationsTest