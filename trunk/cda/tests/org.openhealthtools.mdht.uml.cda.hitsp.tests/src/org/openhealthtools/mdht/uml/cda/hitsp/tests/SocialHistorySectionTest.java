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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Social History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection#validateHITSPSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection#validateHITSPSocialHistorySectionSocialHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Social History Section Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection#getSocialHistories() <em>Get Social Histories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection> validateHITSPSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateHITSPSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistorySectionOperations.validateHITSPSocialHistorySectionTemplateId(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPSocialHistorySectionSocialHistory() {
		OperationsTestCase<SocialHistorySection> validateHITSPSocialHistorySectionSocialHistoryTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateHITSPSocialHistorySectionSocialHistory",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				SocialHistory socialHistory = HITSPFactory.eINSTANCE.createSocialHistory().init();

				SocialHistory socialHistory2 = HITSPFactory.eINSTANCE.createSocialHistory().init();

				target.addObservation(socialHistory);
				target.addObservation(socialHistory2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateHITSPSocialHistorySectionSocialHistory(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPSocialHistorySectionSocialHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistories() {

		SocialHistorySection target = objectFactory.create();
		target.getSocialHistories();

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
			return HITSPFactory.eINSTANCE.createSocialHistorySection();
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
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // SocialHistorySectionOperations
