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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PurposeofReferenceObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purposeof Reference Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation#validatePurposeofReferenceObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purposeof Reference Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PurposeofReferenceObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePurposeofReferenceObservationCodeCodeSystem() {
		OperationsTestCase<PurposeofReferenceObservation> validatePurposeofReferenceObservationCodeCodeSystemTestCase = new OperationsTestCase<PurposeofReferenceObservation>(
			"validatePurposeofReferenceObservationCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeofReferenceObservation target) {

			}

			@Override
			protected void updateToPass(PurposeofReferenceObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("ASSERTION");
				code.setCodeSystem("2.16.840.1.113883.5.4");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationCodeCodeSystem(
					(PurposeofReferenceObservation) objectToTest, diagnostician, map);
			}

		};

		validatePurposeofReferenceObservationCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeofReferenceObservationTemplateId() {
		OperationsTestCase<PurposeofReferenceObservation> validatePurposeofReferenceObservationTemplateIdTestCase = new OperationsTestCase<PurposeofReferenceObservation>(
			"validatePurposeofReferenceObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeofReferenceObservation target) {

			}

			@Override
			protected void updateToPass(PurposeofReferenceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationTemplateId(
					(PurposeofReferenceObservation) objectToTest, diagnostician, map);
			}

		};

		validatePurposeofReferenceObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeofReferenceObservationClassCode() {
		OperationsTestCase<PurposeofReferenceObservation> validatePurposeofReferenceObservationClassCodeTestCase = new OperationsTestCase<PurposeofReferenceObservation>(
			"validatePurposeofReferenceObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeofReferenceObservation target) {

			}

			@Override
			protected void updateToPass(PurposeofReferenceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationClassCode(
					(PurposeofReferenceObservation) objectToTest, diagnostician, map);
			}

		};

		validatePurposeofReferenceObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeofReferenceObservationCode() {
		OperationsTestCase<PurposeofReferenceObservation> validatePurposeofReferenceObservationCodeTestCase = new OperationsTestCase<PurposeofReferenceObservation>(
			"validatePurposeofReferenceObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeofReferenceObservation target) {

			}

			@Override
			protected void updateToPass(PurposeofReferenceObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationCode(
					(PurposeofReferenceObservation) objectToTest, diagnostician, map);
			}

		};

		validatePurposeofReferenceObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeofReferenceObservationMoodCode() {
		OperationsTestCase<PurposeofReferenceObservation> validatePurposeofReferenceObservationMoodCodeTestCase = new OperationsTestCase<PurposeofReferenceObservation>(
			"validatePurposeofReferenceObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeofReferenceObservation target) {

			}

			@Override
			protected void updateToPass(PurposeofReferenceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationMoodCode(
					(PurposeofReferenceObservation) objectToTest, diagnostician, map);
			}

		};

		validatePurposeofReferenceObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePurposeofReferenceObservationValue() {
		OperationsTestCase<PurposeofReferenceObservation> validatePurposeofReferenceObservationValueTestCase = new OperationsTestCase<PurposeofReferenceObservation>(
			"validatePurposeofReferenceObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSEOF_REFERENCE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PurposeofReferenceObservation target) {

			}

			@Override
			protected void updateToPass(PurposeofReferenceObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD("121079", "1.2.840.10008.2.16.4", "", "");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationValue(
					(PurposeofReferenceObservation) objectToTest, diagnostician, map);
			}

		};

		validatePurposeofReferenceObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PurposeofReferenceObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PurposeofReferenceObservation> {
		public PurposeofReferenceObservation create() {
			return ConsolFactory.eINSTANCE.createPurposeofReferenceObservation();
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
	private static class ConstructorTestClass extends PurposeofReferenceObservationOperations {
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

} // PurposeofReferenceObservationOperations
