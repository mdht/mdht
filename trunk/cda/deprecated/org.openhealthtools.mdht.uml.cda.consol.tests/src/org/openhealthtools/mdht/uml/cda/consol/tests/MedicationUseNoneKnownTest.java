/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationUseNoneKnownOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Use None Known</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown#validateMedicationUseNoneKnownValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Use None Known Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationUseNoneKnownTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationUseNoneKnownTextReference() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownTextReferenceTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownTextReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownTextReference(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationUseNoneKnownTextReferenceValue() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownTextReferenceValueTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownTextReferenceValue(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationUseNoneKnownReferenceValue() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownReferenceValueTestCase = new NarrativeReferenceTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownReferenceValue(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownTemplateId() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownTemplateIdTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownTemplateId(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownClassCode() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownClassCodeTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownClassCode(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownMoodCode() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownMoodCodeTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownMoodCode(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationUseNoneKnownId() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownIdTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownId(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownCodeP() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownCodePTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownCodeP(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownCode() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownCodeTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationUseNoneKnown target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnownCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownCode(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownEffectiveTime() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownEffectiveTimeTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownEffectiveTime(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownStatusCode() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownStatusCodeTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownStatusCode(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownStatusCodeP() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownStatusCodePTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownStatusCodeP(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationUseNoneKnownText() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownTextTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownText(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationUseNoneKnownValue() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownValueTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("182904002", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownValue(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationUseNoneKnownValueP() {
		OperationsTestCase<MedicationUseNoneKnown> validateMedicationUseNoneKnownValuePTestCase = new OperationsTestCase<MedicationUseNoneKnown>(
			"validateMedicationUseNoneKnownValueP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_USE_NONE_KNOWN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationUseNoneKnown target) {

			}

			@Override
			protected void updateToPass(MedicationUseNoneKnown target) {
				target.init();

				// must exist as the correct type but the code value is not checked
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationUseNoneKnownOperations.validateMedicationUseNoneKnownValueP(
					(MedicationUseNoneKnown) objectToTest, diagnostician, map);
			}

		};

		validateMedicationUseNoneKnownValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationUseNoneKnownOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationUseNoneKnown> {
		public MedicationUseNoneKnown create() {
			return ConsolFactory.eINSTANCE.createMedicationUseNoneKnown();
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
	private static class ConstructorTestClass extends MedicationUseNoneKnownOperations {
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

} // MedicationUseNoneKnownOperations
