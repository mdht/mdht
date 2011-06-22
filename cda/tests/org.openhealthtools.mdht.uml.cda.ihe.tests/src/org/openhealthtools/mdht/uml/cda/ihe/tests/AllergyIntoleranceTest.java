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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Intolerance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHESeverity() <em>Get IHE Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHEProblemStatusObservation() <em>Get IHE Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHEComments() <em>Get IHE Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateProblemEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyIntoleranceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyIntoleranceTemplateId() {
		OperationsTestCase<AllergyIntolerance> validateAllergyIntoleranceTemplateIdTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateAllergyIntoleranceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateAllergyIntoleranceTemplateId(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyIntoleranceValue() {
		OperationsTestCase<AllergyIntolerance> validateAllergyIntoleranceValueTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateAllergyIntoleranceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateAllergyIntoleranceValue(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyIntoleranceProblemEntryReactionObservationContainer() {
		OperationsTestCase<AllergyIntolerance> validateAllergyIntoleranceProblemEntryReactionObservationContainerTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateAllergyIntoleranceProblemEntryReactionObservationContainer",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {
				target.init();

				ProblemEntryReactionObservationContainer peroc = IHEFactory.eINSTANCE.createProblemEntryReactionObservationContainer().init();
				target.addObservation(peroc);

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemEntryReactionObservationContainer(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceProblemEntryReactionObservationContainerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyIntoleranceSeverity() {
		OperationsTestCase<AllergyIntolerance> validateAllergyIntoleranceSeverityTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateAllergyIntoleranceSeverity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {
				target.init();
				Severity severity = IHEFactory.eINSTANCE.createSeverity().init();
				target.addObservation(severity);
			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateAllergyIntoleranceSeverity(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceSeverityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyIntoleranceProblemStatusObservation() {
		OperationsTestCase<AllergyIntolerance> validateAllergyIntoleranceProblemStatusObservationTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateAllergyIntoleranceProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {
				target.init();
				ProblemStatusObservation pso = IHEFactory.eINSTANCE.createProblemStatusObservation().init();
				target.addObservation(pso);

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemStatusObservation(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyIntoleranceComment() {
		OperationsTestCase<AllergyIntolerance> validateAllergyIntoleranceCommentTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateAllergyIntoleranceComment",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {
				target.init();
				Comment comment = IHEFactory.eINSTANCE.createComment().init();
				target.addAct(comment);
			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateAllergyIntoleranceComment(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceCommentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntryReactionObservationContainers() {

		AllergyIntolerance target = objectFactory.create();
		target.getProblemEntryReactionObservationContainers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIHESeverity() {

		AllergyIntolerance target = objectFactory.create();
		target.getIHESeverity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIHEProblemStatusObservation() {

		AllergyIntolerance target = objectFactory.create();
		target.getIHEProblemStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIHEComments() {

		AllergyIntolerance target = objectFactory.create();
		target.getIHEComments();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemEntryCode() {
		OperationsTestCase<AllergyIntolerance> validateProblemEntryCodeTestCase = new OperationsTestCase<AllergyIntolerance>(
			"validateProblemEntryCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceOperations.validateProblemEntryCode(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyIntoleranceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyIntolerance> {

		public AllergyIntolerance create() {
			return IHEFactory.eINSTANCE.createAllergyIntolerance();
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
	private static class ConstructorTestClass extends AllergyIntoleranceOperations {
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

} // AllergyIntoleranceOperations
