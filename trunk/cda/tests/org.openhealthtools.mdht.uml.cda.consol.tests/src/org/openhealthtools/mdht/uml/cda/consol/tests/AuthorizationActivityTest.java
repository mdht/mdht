/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AuthorizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authorization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityEntryRelationshipHasClinicalStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Has Clinical Statement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Has Authorized Performers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AuthorizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityTemplateId() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityTemplateIdTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityTemplateId(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityClassCode() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityClassCodeTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityClassCode(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityId() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityIdTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {

				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityId(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityMoodCode() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityMoodCodeTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityMoodCode(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityEntryRelationship() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityEntryRelationshipTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationship(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityEntryRelationshipHasClinicalStatement() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityEntryRelationshipHasClinicalStatementTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityEntryRelationshipHasClinicalStatement",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_HAS_CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Act clinicalStatement = CDAFactory.eINSTANCE.createAct();
						// clinicalStatement.setMoodCode(x_DocumentActMood.PRMS);
						target.addAct(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Encounter clinicalStatement = CDAFactory.eINSTANCE.createEncounter();

						target.addEncounter(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Observation clinicalStatement = CDAFactory.eINSTANCE.createObservation();
						target.addObservation(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						ObservationMedia clinicalStatement = CDAFactory.eINSTANCE.createObservationMedia();
						target.addObservationMedia(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Organizer clinicalStatement = CDAFactory.eINSTANCE.createOrganizer();
						target.addOrganizer(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Procedure clinicalStatement = CDAFactory.eINSTANCE.createProcedure();
						target.addProcedure(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						RegionOfInterest clinicalStatement = CDAFactory.eINSTANCE.createRegionOfInterest();
						target.addRegionOfInterest(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						SubstanceAdministration clinicalStatement = CDAFactory.eINSTANCE.createSubstanceAdministration();
						target.addSubstanceAdministration(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Supply clinicalStatement = CDAFactory.eINSTANCE.createSupply();
						target.addSupply(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Act act = CDAFactory.eINSTANCE.createAct();
						act.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						act.setMoodCode(x_DocumentActMood.PRMS);
						target.addAct(act);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Encounter clinicalStatement = CDAFactory.eINSTANCE.createEncounter();
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());

						clinicalStatement.setMoodCode(x_DocumentEncounterMood.PRMS);
						target.addEncounter(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Observation clinicalStatement = CDAFactory.eINSTANCE.createObservation();
						clinicalStatement.setMoodCode(x_ActMoodDocumentObservation.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addObservation(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						ObservationMedia clinicalStatement = CDAFactory.eINSTANCE.createObservationMedia();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addObservationMedia(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Organizer clinicalStatement = CDAFactory.eINSTANCE.createOrganizer();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addOrganizer(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Procedure clinicalStatement = CDAFactory.eINSTANCE.createProcedure();

						clinicalStatement.setMoodCode(x_DocumentProcedureMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addProcedure(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						RegionOfInterest clinicalStatement = CDAFactory.eINSTANCE.createRegionOfInterest();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addRegionOfInterest(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						SubstanceAdministration clinicalStatement = CDAFactory.eINSTANCE.createSubstanceAdministration();

						clinicalStatement.setMoodCode(x_DocumentSubstanceMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addSubstanceAdministration(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Supply clinicalStatement = CDAFactory.eINSTANCE.createSupply();

						clinicalStatement.setMoodCode(x_DocumentSubstanceMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addSupply(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipHasClinicalStatement(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityEntryRelationshipHasClinicalStatementTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformersTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_HAS_AUTHORIZED_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Act act = CDAFactory.eINSTANCE.createAct();
						act.setMoodCode(x_DocumentActMood.PRMS);
						target.addAct(act);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Encounter clinicalStatement = CDAFactory.eINSTANCE.createEncounter();
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());

						clinicalStatement.setMoodCode(x_DocumentEncounterMood.PRMS);
						target.addEncounter(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Observation clinicalStatement = CDAFactory.eINSTANCE.createObservation();
						clinicalStatement.setMoodCode(x_ActMoodDocumentObservation.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addObservation(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						ObservationMedia clinicalStatement = CDAFactory.eINSTANCE.createObservationMedia();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addObservationMedia(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Organizer clinicalStatement = CDAFactory.eINSTANCE.createOrganizer();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addOrganizer(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Procedure clinicalStatement = CDAFactory.eINSTANCE.createProcedure();

						clinicalStatement.setMoodCode(x_DocumentProcedureMood.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addProcedure(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						RegionOfInterest clinicalStatement = CDAFactory.eINSTANCE.createRegionOfInterest();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addRegionOfInterest(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						SubstanceAdministration clinicalStatement = CDAFactory.eINSTANCE.createSubstanceAdministration();

						clinicalStatement.setMoodCode(x_DocumentSubstanceMood.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addSubstanceAdministration(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(AuthorizationActivity target) {
						target.init();
						Supply clinicalStatement = CDAFactory.eINSTANCE.createSupply();

						clinicalStatement.setMoodCode(x_DocumentSubstanceMood.PRMS);
						// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addSupply(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Act act = CDAFactory.eINSTANCE.createAct();
						act.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						act.setMoodCode(x_DocumentActMood.PRMS);
						target.addAct(act);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Encounter clinicalStatement = CDAFactory.eINSTANCE.createEncounter();
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());

						clinicalStatement.setMoodCode(x_DocumentEncounterMood.PRMS);
						target.addEncounter(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Observation clinicalStatement = CDAFactory.eINSTANCE.createObservation();
						clinicalStatement.setMoodCode(x_ActMoodDocumentObservation.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addObservation(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						ObservationMedia clinicalStatement = CDAFactory.eINSTANCE.createObservationMedia();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addObservationMedia(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Organizer clinicalStatement = CDAFactory.eINSTANCE.createOrganizer();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addOrganizer(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Procedure clinicalStatement = CDAFactory.eINSTANCE.createProcedure();

						clinicalStatement.setMoodCode(x_DocumentProcedureMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addProcedure(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						RegionOfInterest clinicalStatement = CDAFactory.eINSTANCE.createRegionOfInterest();

						clinicalStatement.setMoodCode(ActMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addRegionOfInterest(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						SubstanceAdministration clinicalStatement = CDAFactory.eINSTANCE.createSubstanceAdministration();

						clinicalStatement.setMoodCode(x_DocumentSubstanceMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addSubstanceAdministration(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AuthorizationActivity target) {
						target.init();
						Supply clinicalStatement = CDAFactory.eINSTANCE.createSupply();

						clinicalStatement.setMoodCode(x_DocumentSubstanceMood.PRMS);
						clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
						target.addSupply(clinicalStatement);
						for (EntryRelationship er : target.getEntryRelationships()) {
							er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						}
					}
				});

			}

			// @Override
			// protected void updateToFail(AuthorizationActivity target) {
			// target.init();
			// Act clinicalStatement = CDAFactory.eINSTANCE.createAct();
			// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			// clinicalStatement.setMoodCode(x_DocumentActMood.PRMS);
			// target.addAct(clinicalStatement);
			// for (EntryRelationship er : target.getEntryRelationships()) {
			// er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
			// }
			// }
			//
			// @Override
			// protected void updateToPass(AuthorizationActivity target) {
			// target.getEntryRelationships().clear();
			// Act clinicalStatement = CDAFactory.eINSTANCE.createAct();
			// clinicalStatement.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			// clinicalStatement.setMoodCode(x_DocumentActMood.PRMS);
			// target.addAct(clinicalStatement);
			// for (EntryRelationship er : target.getEntryRelationships()) {
			// er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
			// }
			// }
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformersTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityEntryRelationshipTypeCode() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityEntryRelationshipTypeCodeTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipTypeCode(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AuthorizationActivityOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<AuthorizationActivity> {
		public AuthorizationActivity create() {
			return ConsolFactory.eINSTANCE.createAuthorizationActivity();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends AuthorizationActivityOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AuthorizationActivityOperations
