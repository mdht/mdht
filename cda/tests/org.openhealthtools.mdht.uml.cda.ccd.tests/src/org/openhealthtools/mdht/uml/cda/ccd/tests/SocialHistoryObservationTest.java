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
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Social History Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationSocialHistoryStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Social History Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#validateSocialHistoryObservationEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#getSocialHistoryStatusObservation() <em>Get Social History Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservationCodeValueSet() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationCodeValueSetTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.1");
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationCodeValueSet(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodeValueSetTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistoryObservationTemplateId() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationTemplateId(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationClassCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationClassCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationClassCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationId() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationIdTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationId(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationMoodCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationMoodCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationMoodCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationStatusCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationStatusCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationStatusCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservationSocialHistoryStatusObservation() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationSocialHistoryStatusObservationTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationSocialHistoryStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createSocialHistoryStatusObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationSocialHistoryStatusObservation(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationSocialHistoryStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservationEpisodeObservation() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationEpisodeObservationTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationEpisodeObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createEpisodeObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationEpisodeObservation(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationEpisodeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistoryStatusObservation() {

		SocialHistoryObservation target = objectFactory.create();
		target.getSocialHistoryStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEpisodeObservation() {

		SocialHistoryObservation target = objectFactory.create();
		target.getEpisodeObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SocialHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistoryObservation> {
		public SocialHistoryObservation create() {
			return CCDFactory.eINSTANCE.createSocialHistoryObservation();
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
	private static class ConstructorTestClass extends SocialHistoryObservationOperations {
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

} // SocialHistoryObservationOperations
