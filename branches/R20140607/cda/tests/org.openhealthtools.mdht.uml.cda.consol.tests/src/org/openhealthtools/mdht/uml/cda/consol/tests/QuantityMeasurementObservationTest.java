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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.QuantityMeasurementObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Quantity Measurement Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCodeCodeSystemDIR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DIR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCodeCodeSystemDICOM(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DICOM</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class QuantityMeasurementObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateQuantityMeasurementObservationCodeCodeSystemDIR() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationCodeCodeSystemDIRTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationCodeCodeSystemDIR",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCodeCodeSystemDIR(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationCodeCodeSystemDIRTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateQuantityMeasurementObservationCodeCodeSystemDICOM() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationCodeCodeSystemDICOMTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationCodeCodeSystemDICOM",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				target.setCode(DatatypesFactory.eINSTANCE.createCD("", "1.2.840.10008.2.16.4", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCodeCodeSystemDICOM(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationCodeCodeSystemDICOMTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationTemplateId() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationTemplateIdTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationTemplateId(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationClassCode() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationClassCodeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationClassCode(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationMoodCode() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationMoodCodeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationMoodCode(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationCode() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationCodeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCode(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationEffectiveTime() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationEffectiveTimeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationEffectiveTime(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateQuantityMeasurementObservationValue() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationValueTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				PQ value = DatatypesFactory.eINSTANCE.createPQ();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationValue(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateQuantityMeasurementObservationSOPInstanceObservation() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationSOPInstanceObservationTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationSOPInstanceObservation(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationSOPInstanceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservations() {

		QuantityMeasurementObservation target = objectFactory.create();
		target.getSOPInstanceObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends QuantityMeasurementObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<QuantityMeasurementObservation> {
		public QuantityMeasurementObservation create() {
			return ConsolFactory.eINSTANCE.createQuantityMeasurementObservation();
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
	private static class ConstructorTestClass extends QuantityMeasurementObservationOperations {
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

} // QuantityMeasurementObservationOperations
