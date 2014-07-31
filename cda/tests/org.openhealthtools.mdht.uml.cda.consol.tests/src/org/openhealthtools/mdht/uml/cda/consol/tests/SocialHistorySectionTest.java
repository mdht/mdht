/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#validateSocialHistorySectionTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getSocialHistoryObservations() <em>Get Social History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getSmokingStatusObservations() <em>Get Smoking Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection#getTobaccoUses() <em>Get Tobacco Uses</em>}</li>
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
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionCode(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCodeP() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionCodePTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionCodeP(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionTitle() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTitleTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTitle(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionText() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTextTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionText(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionSocialHistoryObservation() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionSocialHistoryObservationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionSocialHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createSocialHistoryObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionSocialHistoryObservation(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionSocialHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSocialHistorySectionPregnancyObservation() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionPregnancyObservationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionPregnancyObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createPregnancyObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionPregnancyObservation(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionPregnancyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionSmokingStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						target.init();
						target.addObservation(ConsolFactory.eINSTANCE.createSmokingStatusObservation().init());
						target.addObservation(ConsolFactory.eINSTANCE.createSocialHistoryObservation().init());
						target.addObservation(ConsolFactory.eINSTANCE.createSocialHistoryObservation().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SocialHistorySection target) {
						// TEST 2
						// Contains 1 entry with a Smoking status observation template.
						target.init();
						target.addObservation(ConsolFactory.eINSTANCE.createSmokingStatusObservation().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionSmokingStatusObservation(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSocialHistorySectionTobaccoUse() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTobaccoUseTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTobaccoUse",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createTobaccoUse().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTobaccoUse(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTobaccoUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistoryObservations() {

		SocialHistorySection target = objectFactory.create();
		target.getSocialHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyObservations() {

		SocialHistorySection target = objectFactory.create();
		target.getPregnancyObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSmokingStatusObservations() {

		SocialHistorySection target = objectFactory.create();
		target.getSmokingStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTobaccoUses() {

		SocialHistorySection target = objectFactory.create();
		target.getTobaccoUses();

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
			return ConsolFactory.eINSTANCE.createSocialHistorySection();
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
	private static class ConstructorTestClass extends SocialHistorySectionOperations {
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

} // SocialHistorySectionOperations
