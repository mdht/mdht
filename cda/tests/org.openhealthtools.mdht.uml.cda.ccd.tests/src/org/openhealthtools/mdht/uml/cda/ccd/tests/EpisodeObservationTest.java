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
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EpisodeObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Episode Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationOneEntryRelationshipSUBJ(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation One Entry Relationship SUBJ</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationExistsEntryRelationshipSAS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Exists Entry Relationship SAS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#validateEpisodeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EpisodeObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationOneEntryRelationshipSUBJ() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationOneEntryRelationshipSUBJTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationOneEntryRelationshipSUBJ",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationOneEntryRelationshipSUBJ(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationOneEntryRelationshipSUBJTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationExistsEntryRelationshipSAS() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationExistsEntryRelationshipSASTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationExistsEntryRelationshipSAS",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationExistsEntryRelationshipSAS(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationExistsEntryRelationshipSASTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationTemplateId() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationTemplateIdTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationTemplateId(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationClassCode() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationClassCodeTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationClassCode(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationMoodCode() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationMoodCodeTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationMoodCode(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationStatusCode() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationStatusCodeTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationStatusCode(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationCode() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationCodeTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationCode(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEpisodeObservationValue() {
		OperationsTestCase<EpisodeObservation> validateEpisodeObservationValueTestCase = new OperationsTestCase<EpisodeObservation>(
			"validateEpisodeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EpisodeObservation target) {

			}

			@Override
			protected void updateToPass(EpisodeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EpisodeObservationOperations.validateEpisodeObservationValue(
					(EpisodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateEpisodeObservationValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EpisodeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EpisodeObservation> {
		public EpisodeObservation create() {
			return CCDFactory.eINSTANCE.createEpisodeObservation();
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
	private static class ConstructorTestClass extends EpisodeObservationOperations {
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

} // EpisodeObservationOperations
