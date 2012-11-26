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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthStatusObservationHasTextReference() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationHasTextReferenceTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReference(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHealthStatusObservationTextReferenceValue() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationTextReferenceValueTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationTextReferenceValue(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHealthStatusObservationHasTextReferenceValue() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationHasTextReferenceValueTestCase = new NarrativeReferenceTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReferenceValue(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationTemplateId() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationTemplateIdTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationTemplateId(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationClassCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationClassCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationClassCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationMoodCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationMoodCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationMoodCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthStatusObservationCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE();
				cd.setCodeSystem("2.16.840.1.113883.6.1");
				cd.setCode("11323-3");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationText() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationTextTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationText",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationText(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationStatusCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationStatusCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationStatusCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthStatusObservationValue() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationValueTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("81323004");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationValue(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHealthStatusObservationValueP() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationValuePTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("81323004");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationValueP(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthStatusObservation> {
		public HealthStatusObservation create() {
			return ConsolFactory.eINSTANCE.createHealthStatusObservation();
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
	private static class ConstructorTestClass extends HealthStatusObservationOperations {
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

} // HealthStatusObservationOperations
