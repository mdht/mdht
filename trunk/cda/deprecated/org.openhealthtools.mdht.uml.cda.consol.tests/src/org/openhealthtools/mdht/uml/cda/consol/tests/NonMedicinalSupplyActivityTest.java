/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import static org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood.EVN;
import static org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood.INT;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityProductInstanceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#getProductInstance() <em>Get Product Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonMedicinalSupplyActivityTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityEffectiveTimeHigh() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityEffectiveTimeHighTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityEffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {
				target.init();
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.getEffectiveTimes().clear();
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityEffectiveTimeHigh(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityProductInstanceTypeCode() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityProductInstanceTypeCodeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityProductInstanceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());

				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				par.setTypeCode(ParticipationType.PRD);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityProductInstanceTypeCode(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityProductInstanceTypeCodeTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityClassCode() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityClassCodeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {
				target.setClassCode(ActClassSupply.DIET);
			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityClassCode(
					(NonMedicinalSupplyActivity) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityMoodCode() {
		OperationsTestCase<NonMedicinalSupplyActivity> validateNonMedicinalSupplyActivityMoodCodeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity>(
			"validateNonMedicinalSupplyActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity target) {
				// the EMF-generated default for x_DocumentSubstanceMood happens to be
				// a value allowed by the constraint
				target.setMoodCode(x_DocumentSubstanceMood.RQO);
			}

			@Override
			public void addPassTests() {
				for (final x_DocumentSubstanceMood mood : Arrays.asList(EVN, INT)) {
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(NonMedicinalSupplyActivity target) {
							target.init();
							target.setMoodCode(mood);
						}
					});
				}
				;
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
	* @generated not
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
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
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
	* @generated not
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

				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createSXCM_TS());

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
	* @generated not
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
				target.setQuantity(DatatypesFactory.eINSTANCE.createPQ());
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
	* @generated not
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				par.setTypeCode(ParticipationType.PRD);
				target.getParticipants().add(par);
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
	public void testGetProductInstance() {

		NonMedicinalSupplyActivity target = objectFactory.create();
		target.getProductInstance();

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
