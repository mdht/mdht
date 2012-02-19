/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistoryCauseOfDeathObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Cause Of Death Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation#validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Cause Of Death Observation Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation#getCauseOfDeathObservations() <em>Get Cause Of Death Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryCauseOfDeathObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation() {
		OperationsTestCase<FamilyHistoryCauseOfDeathObservation> validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservationTestCase = new OperationsTestCase<FamilyHistoryCauseOfDeathObservation>(
			"validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryCauseOfDeathObservation target) {
				target.init();
				target.addObservation(CDAFactory.eINSTANCE.createObservation());
			}

			@Override
			protected void updateToPass(FamilyHistoryCauseOfDeathObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				er.setObservation(CCDFactory.eINSTANCE.createCauseOfDeathObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryCauseOfDeathObservationOperations.validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(
					(FamilyHistoryCauseOfDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCauseOfDeathObservations() {

		FamilyHistoryCauseOfDeathObservation target = objectFactory.create();
		target.getCauseOfDeathObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationTemplateId() {
		OperationsTestCase<FamilyHistoryCauseOfDeathObservation> validateFamilyHistoryObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryCauseOfDeathObservation>(
			"validateFamilyHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryCauseOfDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryCauseOfDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryCauseOfDeathObservationOperations.validateFamilyHistoryObservationTemplateId(
					(FamilyHistoryCauseOfDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryCauseOfDeathObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryCauseOfDeathObservation> {
		public FamilyHistoryCauseOfDeathObservation create() {
			return CCDFactory.eINSTANCE.createFamilyHistoryCauseOfDeathObservation();
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
	private static class ConstructorTestClass extends FamilyHistoryCauseOfDeathObservationOperations {
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

} // FamilyHistoryCauseOfDeathObservationOperations
