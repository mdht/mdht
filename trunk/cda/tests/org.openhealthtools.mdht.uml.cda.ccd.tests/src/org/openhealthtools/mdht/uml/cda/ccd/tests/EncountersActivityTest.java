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
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounters Activity</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersActivityTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityTemplateId() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityTemplateIdTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityTemplateId(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityClassCode() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityClassCodeTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityClassCode(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityMoodCode() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityMoodCodeTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityMoodCode(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateEncountersActivityId() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityIdTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityId(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityEffectiveTime() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityEffectiveTimeTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityEffectiveTime(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncountersActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersActivity> {
		public EncountersActivity create() {
			return CCDFactory.eINSTANCE.createEncountersActivity();
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
	private static class ConstructorTestClass extends EncountersActivityOperations {
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

} // EncountersActivityOperations
