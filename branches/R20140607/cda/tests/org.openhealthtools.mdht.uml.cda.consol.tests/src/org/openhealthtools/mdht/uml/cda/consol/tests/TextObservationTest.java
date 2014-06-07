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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.TextObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.TextObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Text Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationQuantityMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Quantity Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#getQuantityMeasurementObservations() <em>Get Quantity Measurement Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TextObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationTextReference() {
		OperationsTestCase<TextObservation> validateTextObservationTextReferenceTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(TextObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationTextReference(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationTextReferenceValue() {
		OperationsTestCase<TextObservation> validateTextObservationTextReferenceValueTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(TextObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationTextReferenceValue(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationReferenceValue() {
		OperationsTestCase<TextObservation> validateTextObservationReferenceValueTestCase = new NarrativeReferenceTestCase<TextObservation>(
			"validateTextObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(TextObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationReferenceValue(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationTemplateId() {
		OperationsTestCase<TextObservation> validateTextObservationTemplateIdTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationTemplateId(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationClassCode() {
		OperationsTestCase<TextObservation> validateTextObservationClassCodeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationClassCode(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationMoodCode() {
		OperationsTestCase<TextObservation> validateTextObservationMoodCodeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationMoodCode(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationCode() {
		OperationsTestCase<TextObservation> validateTextObservationCodeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationCode(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationEffectiveTime() {
		OperationsTestCase<TextObservation> validateTextObservationEffectiveTimeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationEffectiveTime(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationText() {
		OperationsTestCase<TextObservation> validateTextObservationTextTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationText",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationText(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationValue() {
		OperationsTestCase<TextObservation> validateTextObservationValueTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				ED value = DatatypesFactory.eINSTANCE.createED();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationValue(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationSOPInstanceObservation() {
		OperationsTestCase<TextObservation> validateTextObservationSOPInstanceObservationTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationSOPInstanceObservation(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationSOPInstanceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTextObservationQuantityMeasurementObservation() {
		OperationsTestCase<TextObservation> validateTextObservationQuantityMeasurementObservationTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationQuantityMeasurementObservation",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_QUANTITY_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createQuantityMeasurementObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationQuantityMeasurementObservation(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationQuantityMeasurementObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservations() {

		TextObservation target = objectFactory.create();
		target.getSOPInstanceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetQuantityMeasurementObservations() {

		TextObservation target = objectFactory.create();
		target.getQuantityMeasurementObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TextObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TextObservation> {
		public TextObservation create() {
			return ConsolFactory.eINSTANCE.createTextObservation();
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
	private static class ConstructorTestClass extends TextObservationOperations {
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

} // TextObservationOperations
