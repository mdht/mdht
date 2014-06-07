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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.CodeObservations;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CodeObservationsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Code Observations</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsQuantityMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Quantity Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#getQuantityMeasurementObservations() <em>Get Quantity Measurement Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodeObservationsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodeObservationsTemplateId() {
		OperationsTestCase<CodeObservations> validateCodeObservationsTemplateIdTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsTemplateId(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodeObservationsClassCode() {
		OperationsTestCase<CodeObservations> validateCodeObservationsClassCodeTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsClassCode(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodeObservationsMoodCode() {
		OperationsTestCase<CodeObservations> validateCodeObservationsMoodCodeTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsMoodCode(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeObservationsCode() {
		OperationsTestCase<CodeObservations> validateCodeObservationsCodeTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsCode",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsCode(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodeObservationsEffectiveTime() {
		OperationsTestCase<CodeObservations> validateCodeObservationsEffectiveTimeTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsEffectiveTime(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodeObservationsValue() {
		OperationsTestCase<CodeObservations> validateCodeObservationsValueTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsValue",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsValue(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeObservationsSOPInstanceObservation() {
		OperationsTestCase<CodeObservations> validateCodeObservationsSOPInstanceObservationTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsSOPInstanceObservation(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsSOPInstanceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeObservationsQuantityMeasurementObservation() {
		OperationsTestCase<CodeObservations> validateCodeObservationsQuantityMeasurementObservationTestCase = new OperationsTestCase<CodeObservations>(
			"validateCodeObservationsQuantityMeasurementObservation",
			operationsForOCL.getOCLValue("VALIDATE_CODE_OBSERVATIONS_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodeObservations target) {

			}

			@Override
			protected void updateToPass(CodeObservations target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createQuantityMeasurementObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodeObservationsOperations.validateCodeObservationsQuantityMeasurementObservation(
					(CodeObservations) objectToTest, diagnostician, map);
			}

		};

		validateCodeObservationsQuantityMeasurementObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservations() {

		CodeObservations target = objectFactory.create();
		target.getSOPInstanceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetQuantityMeasurementObservations() {

		CodeObservations target = objectFactory.create();
		target.getQuantityMeasurementObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodeObservationsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodeObservations> {
		public CodeObservations create() {
			return ConsolFactory.eINSTANCE.createCodeObservations();
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
	private static class ConstructorTestClass extends CodeObservationsOperations {
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

} // CodeObservationsOperations
