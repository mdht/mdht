/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *    Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Social History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection#validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection#getMu2consolSmokingStatusObservations() <em>Get Mu2consol Smoking Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMU2CONSOLSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<SocialHistorySection> validateMU2CONSOLSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateMU2CONSOLSocialHistorySectionSmokingStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					// empty fail
					@Override
					public void updateToFail(SocialHistorySection target) {
					}

				});

				addFailTest(new FailTest() {

					// TEST 4
					// Contains 0 entry with 0 Smoking status observation templates
					@Override
					public void updateToFail(SocialHistorySection target) {
						target.init();
					}

				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SocialHistorySection target) {
						// TEST 1
						// Contains 3 entry elements, where the 1st of which, contains a Smoking status observation template.
						SmokingStatusObservation smokStatObs = Mu2consolFactory.eINSTANCE.createSmokingStatusObservation().init();
						target.addObservation(smokStatObs);
						Observation socialHistObs = ConsolFactory.eINSTANCE.createSocialHistoryObservation().init();
						target.addObservation(socialHistObs);
						Observation socialHistObs2 = ConsolFactory.eINSTANCE.createSocialHistoryObservation().init();
						target.addObservation(socialHistObs2);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SocialHistorySection target) {
						// TEST 2
						// Contains 1 entry with a Smoking status observation template.
						SmokingStatusObservation sObs = Mu2consolFactory.eINSTANCE.createSmokingStatusObservation().init();
						target.addObservation(sObs);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateMU2CONSOLSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolSmokingStatusObservations() {

		SocialHistorySection target = objectFactory.create();
		target.getMu2consolSmokingStatusObservations();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					// empty fail
					@Override
					public void updateToFail(SocialHistorySection target) {
					}

				});

				addFailTest(new FailTest() {

					// Contains an invalid template ID
					@Override
					public void updateToFail(SocialHistorySection target) {
						target.init();
						target.getTemplateIds().clear();
						target.getTemplateIds().add(
							DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.XX.XX.XX.X.XX"));
					}

				});
			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistorySection> {

		public SocialHistorySection create() {
			return Mu2consolFactory.eINSTANCE.createSocialHistorySection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends SocialHistorySectionOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // SocialHistorySectionOperations
