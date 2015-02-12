/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PressureUlcerObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pressure Ulcer Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierNameCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PressureUlcerObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationHasTextReference() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationHasTextReferenceTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationHasTextReference(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTextReferenceValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTextReferenceValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTextReferenceValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationHasTextReferenceValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationHasTextReferenceValueTestCase = new NarrativeReferenceTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationHasTextReferenceValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationValueNullFlavor() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationValueNullFlavorTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationValueNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getValues().get(0).setNullFlavor(NullFlavor.NA);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationValueNullFlavor(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifier() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifier",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getTargetSiteCodes().clear();

				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifier(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierName() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierNameTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierName",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getTargetSiteCodes().clear();

				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				qual.setName(DatatypesFactory.eINSTANCE.createCV());
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierName(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierNameCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierNameCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierNameCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getTargetSiteCodes().clear();

				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CV name = DatatypesFactory.eINSTANCE.createCV();
				name.setCode("272741003");
				name.setCodeSystem("2.16.840.1.113883.6.96");
				qual.setName(name);
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierNameCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierNameCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierValue",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getTargetSiteCodes().clear();

				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				qual.setValue(value);
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierValueCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierValueCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierValueCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getTargetSiteCodes().clear();

				CD tc = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				qual.setValue(value);
				tc.getQualifiers().add(qual);
				target.getTargetSiteCodes().add(tc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierValueCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierValueCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTemplateId() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTemplateIdTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTemplateId(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationMoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationMoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationMoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationNegationInd() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationNegationIndTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();
				target.setNegationInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationNegationInd(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationId() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationIdTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationId(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationCodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationCodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationCodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationText() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTextTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationText(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("421076008", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationValueP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationValuePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationValueP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();
				target.getTargetSiteCodes().clear();
				target.getTargetSiteCodes().add(
					DatatypesFactory.eINSTANCE.createCD("79951008", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteCodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteCodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteCodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationshipTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1ClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1ClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.setClassCode(ActClassObservation.OBS);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1MoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1MoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1CodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1CodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1CodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1Code() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1CodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1Code",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "2.16.840.1.113883.6.96", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1Code(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1Value() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1ValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1Value",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1Value(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1TypeCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1TypeCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1TypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1TypeCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401238003", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2ClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2ClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.setClassCode(ActClassObservation.OBS);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2MoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2MoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2CodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2CodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2CodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2Code() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2CodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2Code",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "2.16.840.1.113883.6.96", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2Code(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2Value() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2ValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2Value",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2Value(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2TypeCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2TypeCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2TypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2TypeCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("401239006", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3ClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3ClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.setClassCode(ActClassObservation.OBS);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3MoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3MoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3CodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3CodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3CodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3Code() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3CodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3Code",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "2.16.840.1.113883.6.96", "", ""));
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3Code(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3Value() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3ValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3Value",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3Value(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3TypeCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3TypeCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3TypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3TypeCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setCode(DatatypesFactory.eINSTANCE.createCD("425094009", "", "", ""));
				obs.getValues().add(DatatypesFactory.eINSTANCE.createPQ());
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PressureUlcerObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PressureUlcerObservation> {
		public PressureUlcerObservation create() {
			return ConsolFactory.eINSTANCE.createPressureUlcerObservation();
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
	private static class ConstructorTestClass extends PressureUlcerObservationOperations {
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

} // PressureUlcerObservationOperations
