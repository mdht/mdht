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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation#validateVitalSignObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationTextReference() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTextReferenceTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationTextReference(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationReferenceValue() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationReferenceValueTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationReferenceValue(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationTextReferenceValue() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<VitalSignObservation>(
			"validateVitalSignObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationTextReferenceValue(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationTemplateId(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationClassCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationClassCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationClassCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationMoodCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationMoodCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationMoodCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationId() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationIdTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationId(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationCodeP() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationCodePTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationCodeP(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("8310-5", "2.16.840.1.113883.6.1", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationStatusCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationStatusCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationStatusCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationEffectiveTime() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationEffectiveTimeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationEffectiveTime(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationValue() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationValueTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {

				target.getValues().clear();

				target.getValues().add(DatatypesFactory.eINSTANCE.createPQ());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationValue(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationInterpretationCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationInterpretationCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationInterpretationCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationMethodCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationMethodCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();

				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationMethodCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationTargetSiteCode() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTargetSiteCodeTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationTargetSiteCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationText() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationTextTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationText",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {

				target.setText(DatatypesFactory.eINSTANCE.createED());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationText(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignObservationAuthor() {
		OperationsTestCase<VitalSignObservation> validateVitalSignObservationAuthorTestCase = new OperationsTestCase<VitalSignObservation>(
			"validateVitalSignObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignObservation target) {

				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignObservationOperations.validateVitalSignObservationAuthor(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignObservation> {
		public VitalSignObservation create() {
			return ConsolFactory.eINSTANCE.createVitalSignObservation();
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
	private static class ConstructorTestClass extends VitalSignObservationOperations {
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

} // VitalSignObservationOperations
