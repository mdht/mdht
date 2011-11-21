/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.math.BigDecimal;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Supply Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasIntentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Intent Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAssignedAuthorID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasAssignedAuthorPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Assigned Author Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerTimeEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerTimeIntent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Time Intent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerAssignedEntityID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Assigned Entity ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryHasPerformerEntityPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Has Performer Entity Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryQuantityHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryMedicationFullfillmentInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Medication Fullfillment Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#getMedicationFullfillmentInstructions() <em>Get Medication Fullfillment Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SupplyEntryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasIntentAuthor() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasIntentAuthorTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasIntentAuthor",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
				target.setClassCode(ActClassSupply.SPLY);
				target.setMoodCode(x_DocumentSubstanceMood.INT);
			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				target.setClassCode(ActClassSupply.SPLY);
				target.setMoodCode(x_DocumentSubstanceMood.INT);
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasIntentAuthor(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasIntentAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasAuthorTime() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasAuthorTimeTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();

				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Author author : target.getAuthors()) {
					author.setTime(DatatypesFactory.eINSTANCE.createTS());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasAuthorTime(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasAuthorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasAssignedAuthor() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasAssignedAuthorTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				// auth.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Author auth : target.getAuthors()) {
					auth.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasAssignedAuthor(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasAssignedAuthorID() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasAssignedAuthorIDTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasAssignedAuthorID",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				// aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Author auth : target.getAuthors()) {
					auth.getAssignedAuthor().getIds().add(DatatypesFactory.eINSTANCE.createII());

				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasAssignedAuthorID(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasAssignedAuthorIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasAssignedAuthorPersonOrOrg() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasAssignedAuthorPersonOrOrgTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasAssignedAuthorPersonOrOrg",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				aa.setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Person per = CDAFactory.eINSTANCE.createPerson();
				per.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				aa.setAssignedPerson(per);
				aa.setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasAssignedAuthorPersonOrOrg(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasAssignedAuthorPersonOrOrgTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasPerformerTimeEvent() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasPerformerTimeEventTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasPerformerTimeEvent",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.EVN);
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();

				target.getPerformers().add(per);

			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Performer2 per : target.getPerformers()) {
					per.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasPerformerTimeEvent(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasPerformerTimeEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasPerformerTimeIntent() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasPerformerTimeIntentTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasPerformerTimeIntent",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.INT);
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Performer2 per : target.getPerformers()) {
					per.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasPerformerTimeIntent(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasPerformerTimeIntentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasPerformerAssignedEntity() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasPerformerAssignedEntityTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.INT);
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(per);

			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Performer2 per : target.getPerformers()) {
					per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasPerformerAssignedEntity(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasPerformerAssignedEntityID() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasPerformerAssignedEntityIDTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasPerformerAssignedEntityID",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.INT);
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);

			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				for (Performer2 per : target.getPerformers()) {
					per.getAssignedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasPerformerAssignedEntityID(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasPerformerAssignedEntityIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryHasPerformerEntityPersonOrOrg() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryHasPerformerEntityPersonOrOrgTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryHasPerformerEntityPersonOrOrg",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(SupplyEntry target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(SupplyEntry target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(SupplyEntry target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);

					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SupplyEntry target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						Person person = CDAFactory.eINSTANCE.createPerson();
						person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.setAssignedPerson(person);
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SupplyEntry target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						Organization organization = CDAFactory.eINSTANCE.createOrganization();
						organization.getNames().add(DatatypesFactory.eINSTANCE.createON());
						ae.getRepresentedOrganizations().add(organization);
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);

					}
				});

			}

			@Override
			protected void updateToPass(SupplyEntry target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryHasPerformerEntityPersonOrOrg(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryHasPerformerEntityPersonOrOrgTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryQuantityHasValue() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryQuantityHasValueTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryQuantityHasValue",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				target.setQuantity(pq);
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				target.getQuantity().setValue(new BigDecimal(1234));

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryQuantityHasValue(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryQuantityHasValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSupplyEntryTemplateId() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryTemplateIdTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryTemplateId(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryQuantity() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryQuantityTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryQuantity",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				target.setQuantity(pq);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryQuantity((SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryRepeatNumber() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryRepeatNumberTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				IVL_INT value = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryRepeatNumber(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryMedicationFullfillmentInstructions() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryMedicationFullfillmentInstructionsTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryMedicationFullfillmentInstructions",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_MEDICATION_FULLFILLMENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				target.addAct(IHEFactory.eINSTANCE.createMedicationFullfillmentInstructions().init());

				for (EntryRelationship entryRelationship : target.getEntryRelationships()) {
					entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryMedicationFullfillmentInstructions(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryMedicationFullfillmentInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationFullfillmentInstructions() {

		SupplyEntry target = objectFactory.create();
		target.getMedicationFullfillmentInstructions();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SupplyEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SupplyEntry> {

		public SupplyEntry create() {
			return IHEFactory.eINSTANCE.createSupplyEntry();
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
	private static class ConstructorTestClass extends SupplyEntryOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // SupplyEntryOperations
