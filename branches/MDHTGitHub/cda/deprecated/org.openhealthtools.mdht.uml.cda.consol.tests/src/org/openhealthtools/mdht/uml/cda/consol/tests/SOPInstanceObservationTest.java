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
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SOPInstanceObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>SOP Instance Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeNoLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeNoHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationPurposeofReferenceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationReferencedFramesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getPurposeofReferenceObservations() <em>Get Purposeof Reference Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getReferencedFramesObservations() <em>Get Referenced Frames Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SOPInstanceObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTimeHasValue() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeHasValueTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTimeHasValue",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setValue("test");
				target.setEffectiveTime(ef);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeHasValue(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeHasValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTimeNoLow() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeNoLowTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTimeNoLow",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setValue("test");
				target.setEffectiveTime(ef);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeNoLow(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeNoLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTimeNoHigh() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeNoHighTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTimeNoHigh",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setValue("test");
				target.setEffectiveTime(ef);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeNoHigh(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeNoHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationTextMediaType() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextMediaTypeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTextMediaType",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setMediaType("application/dicom");
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTextMediaType(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationTextReference() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextReferenceTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTextReference(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationTextReferenceValue() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextReferenceValueTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(text);
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTextReferenceValue(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationTemplateId() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTemplateIdTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTemplateId(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationClassCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationClassCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationClassCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTime() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTime(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationId() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationIdTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationId",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationId(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationMoodCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationMoodCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationMoodCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationText() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationText",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationText(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationCodeP() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationCodePTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationCodeP(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("1.2.840.10008.2.6.1");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservation() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservation(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated not
	// */
	// @Test
	// public void testValidateSOPInstanceObservationSOPInstanceObservation() {
	// OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationSOPInstanceObservationTestCase = new
	// OperationsTestCase<SOPInstanceObservation>(
	// "validateSOPInstanceObservationSOPInstanceObservation",
	// operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(SOPInstanceObservation target) {
	// target.init();
	// }
	//
	// @Override
	// protected void updateToPass(SOPInstanceObservation target) {
	//
	// EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
	// er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
	// er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
	// target.getEntryRelationships().add(er);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return SOPInstanceObservationOperations.validateSOPInstanceObservationSOPInstanceObservation(
	// (SOPInstanceObservation) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateSOPInstanceObservationSOPInstanceObservationTestCase.doValidationTest();
	// }

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationPurposeofReferenceObservation() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationPurposeofReferenceObservationTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationPurposeofReferenceObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createPurposeofReferenceObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationPurposeofReferenceObservation(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationPurposeofReferenceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSOPInstanceObservationReferencedFramesObservation() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationReferencedFramesObservationTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationReferencedFramesObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReferencedFramesObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationReferencedFramesObservation(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationReferencedFramesObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservations() {

		SOPInstanceObservation target = objectFactory.create();
		target.getSOPInstanceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPurposeofReferenceObservations() {

		SOPInstanceObservation target = objectFactory.create();
		target.getPurposeofReferenceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReferencedFramesObservations() {

		SOPInstanceObservation target = objectFactory.create();
		target.getReferencedFramesObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SOPInstanceObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SOPInstanceObservation> {
		public SOPInstanceObservation create() {
			return ConsolFactory.eINSTANCE.createSOPInstanceObservation();
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
	private static class ConstructorTestClass extends SOPInstanceObservationOperations {
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

} // SOPInstanceObservationOperations
