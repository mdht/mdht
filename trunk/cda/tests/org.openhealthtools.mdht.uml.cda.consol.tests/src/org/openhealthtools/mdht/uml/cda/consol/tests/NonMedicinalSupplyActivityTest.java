/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasParticipantLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Participant Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasIntentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Intent Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAssignedAuthorID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Assigned Author Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerTimeEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerTimeIntent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Time Intent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Assigned Entity ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Performer Entity Person Or Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityOrderNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityOrderExpiration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Order Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityOrdered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityPrescriptionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Prescription Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityAssigningAuthority(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Assigning Authority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityDispenseDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispense Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityDispensingPharmacyLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Dispensing Pharmacy Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantityDispensed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity Dispensed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#getProductInstances() <em>Get Product Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonMedicinalSupplyActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityMoodCode() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityMoodCodeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityMoodCode(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasAuthor() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasAuthorTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasAuthor",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAuthor(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasPerformer() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasPerformerTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasPerformer",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformer(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasParticipantLocation() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasParticipantLocationTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasParticipantLocation",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasParticipantLocation(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasParticipantLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityInformationSource() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityInformationSourceTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityInformationSource(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasProduct() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasProductTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasProduct",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasProduct(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasIntentAuthor() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasIntentAuthorTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasIntentAuthor",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_INTENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasIntentAuthor(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasIntentAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasAuthorTime() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasAuthorTimeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAuthorTime(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasAuthorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasAssignedAuthor() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasAssignedAuthorTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAssignedAuthor(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasAssignedAuthorID() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasAssignedAuthorIDTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasAssignedAuthorID",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAssignedAuthorID(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasAssignedAuthorIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrgTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_ASSIGNED_AUTHOR_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrg(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasAssignedAuthorPersonOrOrgTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasPerformerTimeEvent() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasPerformerTimeEventTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasPerformerTimeEvent",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerTimeEvent(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasPerformerTimeEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasPerformerTimeIntent() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasPerformerTimeIntentTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasPerformerTimeIntent",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_TIME_INTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerTimeIntent(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasPerformerTimeIntentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasPerformerAssignedEntity() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasPerformerAssignedEntityTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerAssignedEntity(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasPerformerAssignedEntityID() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasPerformerAssignedEntityIDTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerAssignedEntityID(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasPerformerAssignedEntityIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrgTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_PERFORMER_ENTITY_PERSON_OR_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrg(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasPerformerEntityPersonOrOrgTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityQuantityHasValue() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityQuantityHasValueTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityQuantityHasValue",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityHasValue(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityQuantityHasValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityOrderNumber() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityOrderNumberTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityOrderNumber",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityOrderNumber(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityOrderNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityOrderExpiration() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityOrderExpirationTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityOrderExpiration",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityOrderExpiration(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityOrderExpirationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityQuantityOrdered() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityQuantityOrderedTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityQuantityOrdered",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityOrdered(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityQuantityOrderedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityQuantityUnit() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityQuantityUnitTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityQuantityUnit",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityUnit(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityQuantityUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityPrescriptionNumber() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityPrescriptionNumberTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityPrescriptionNumber",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityPrescriptionNumber(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityPrescriptionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityAssigningAuthority() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityAssigningAuthorityTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityAssigningAuthority",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityAssigningAuthority(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityAssigningAuthorityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityDispenseDate() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityDispenseDateTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityDispenseDate",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityDispenseDate(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityDispenseDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityDispensingPharmacyLocation() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityDispensingPharmacyLocationTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityDispensingPharmacyLocation",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityDispensingPharmacyLocation(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityDispensingPharmacyLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityQuantityDispensed() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityQuantityDispensedTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityQuantityDispensed",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantityDispensed(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityQuantityDispensedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityHasFillNumber() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityHasFillNumberTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityHasFillNumber",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityHasFillNumber(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityHasFillNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityTemplateId() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityTemplateIdTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityTemplateId(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityId() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityIdTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityId",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityId(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityStatusCode() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityStatusCodeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityStatusCode(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityEffectiveTime() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityEffectiveTimeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityEffectiveTime(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityRepeatNumber() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityRepeatNumberTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityRepeatNumber(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityQuantity() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityQuantityTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityQuantity",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantity(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityProductInstance() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityProductInstanceTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityProductInstance(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstances() {

		NonMedicinalSupplyActivity target = objectFactory.create();
		target.getProductInstances();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NonMedicinalSupplyActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonMedicinalSupplyActivity> {
		public NonMedicinalSupplyActivity create() {
			return ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity();
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
	private static class ConstructorTestClass extends NonMedicinalSupplyActivityOperations {
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

} // NonMedicinalSupplyActivityOperations
