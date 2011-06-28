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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ReactionObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Reaction Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationHasReactionIntervention(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Has Reaction Intervention</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationReactionInterventionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reaction Intervention Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationReactionInterventionType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reaction Intervention Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#validateReactionObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation#getSeverityObservation() <em>Get Severity Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReactionObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationHasReactionIntervention() {
		OperationsTestCase<ReactionObservation> validateReactionObservationHasReactionInterventionTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationHasReactionIntervention",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationHasReactionIntervention(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationHasReactionInterventionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateReactionObservationReactionInterventionTypeCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationReactionInterventionTypeCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationReactionInterventionTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(CCDFactory.eINSTANCE.createMedicationActivity());
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationReactionInterventionTypeCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReactionInterventionTypeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateReactionObservationReactionInterventionType() {
		OperationsTestCase<ReactionObservation> validateReactionObservationReactionInterventionTypeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationReactionInterventionType",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(CCDFactory.eINSTANCE.createMedicationActivity());
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationReactionInterventionType(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReactionInterventionTypeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReactionObservationTemplateId() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTemplateIdTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationTemplateId(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReactionObservationClassCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationClassCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationClassCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReactionObservationMoodCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMoodCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMoodCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReactionObservationStatusCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationStatusCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationStatusCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 *  
	 * @generated NOT
	 */
	@Test
	public void testValidateReactionObservationSeverityObservation() {
		OperationsTestCase<ReactionObservation> validateReactionObservationSeverityObservationTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationSeverityObservation",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(CCDFactory.eINSTANCE.createSeverityObservation());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationSeverityObservation(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverityObservation() {

		ReactionObservation target = objectFactory.create();
		target.getSeverityObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ReactionObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReactionObservation> {
		public ReactionObservation create() {
			return CCDFactory.eINSTANCE.createReactionObservation();
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
	private static class ConstructorTestClass extends ReactionObservationOperations {
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

} // ReactionObservationOperations
