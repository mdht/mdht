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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SupplyActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Supply Activity</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Mood Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Has Author</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Has Performer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasParticipantLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Has Participant Location</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Information Source</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Has Product</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Status Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Quantity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Repeat Number</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Medication Status Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityFulfillmentInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Fulfillment Instruction</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Supply Activity Product Instance</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#getMedicationStatusObservation()
 * <em>Get Medication Status Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#getFulfillmentInstructions()
 * <em>Get Fulfillment Instructions</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#getProductInstances()
 * <em>Get Product Instances</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class SupplyActivityTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityMoodCode() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityMoodCodeTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {
				target.setMoodCode(x_DocumentSubstanceMood.PRP);
			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityMoodCode(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityHasAuthor() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityHasAuthorTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityHasAuthor",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				Author e = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(e);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityHasAuthor(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityHasAuthorTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityHasPerformer() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityHasPerformerTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityHasPerformer",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityHasPerformer(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityHasPerformerTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityHasParticipantLocation() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityHasParticipantLocationTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityHasParticipantLocation",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				p2.setTypeCode(ParticipationType.LOC);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityHasParticipantLocation(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityHasParticipantLocationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityInformationSource() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityInformationSourceTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();

				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityInformationSource(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityInformationSourceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityHasProduct() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityHasProductTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityHasProduct",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();

				Product p = CDAFactory.eINSTANCE.createProduct();
				target.setProduct(p);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityHasProduct(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityHasProductTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSupplyActivityTemplateId() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityTemplateIdTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityTemplateId(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityId() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityIdTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityId",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityId(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSupplyActivityStatusCode() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityStatusCodeTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityStatusCode(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityEffectiveTime() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityEffectiveTimeTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);
				// target.setEffectiveTime(ts );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityEffectiveTime(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityQuantity() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityQuantityTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityQuantity",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				target.setQuantity(DatatypesFactory.eINSTANCE.createPQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityQuantity(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityQuantityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityRepeatNumber() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityRepeatNumberTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityRepeatNumber(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityMedicationStatusObservation() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityMedicationStatusObservationTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityMedicationStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				MedicationStatusObservation obs = CCDFactory.eINSTANCE.createMedicationStatusObservation();
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityMedicationStatusObservation(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityMedicationStatusObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityFulfillmentInstruction() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityFulfillmentInstructionTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityFulfillmentInstruction",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				FulfillmentInstruction fi = CCDFactory.eINSTANCE.createFulfillmentInstruction();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(fi);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityFulfillmentInstruction(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityFulfillmentInstructionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSupplyActivityProductInstance() {
		OperationsTestCase<SupplyActivity> validateSupplyActivityProductInstanceTestCase = new OperationsTestCase<SupplyActivity>(
			"validateSupplyActivityProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyActivity target) {

			}

			@Override
			protected void updateToPass(SupplyActivity target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ProductInstance pi = CCDFactory.eINSTANCE.createProductInstance();
				p2.setParticipantRole(pi);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyActivityOperations.validateSupplyActivityProductInstance(
					(SupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateSupplyActivityProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationStatusObservation() {

		SupplyActivity target = objectFactory.create();
		target.getMedicationStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFulfillmentInstructions() {

		SupplyActivity target = objectFactory.create();
		target.getFulfillmentInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstances() {

		SupplyActivity target = objectFactory.create();
		target.getProductInstances();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SupplyActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SupplyActivity> {
		public SupplyActivity create() {
			return CCDFactory.eINSTANCE.createSupplyActivity();
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
	private static class ConstructorTestClass extends SupplyActivityOperations {
	}

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

} // SupplyActivityOperations
