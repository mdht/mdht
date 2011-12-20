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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SeverityObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Severity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation#validateSeverityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SeverityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationTextReference() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationTextReferenceTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ref.setValue("#reference");
				ot.setReference(ref);
				target.setText(ot);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationTextReference(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationReferenceValue() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationReferenceValueTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();

				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ref.setValue("#severity");
				ot.setReference(ref);
				target.setText(ot);
				// target.setCode(code);
				code.setCode("371924009");
				code.setDisplayName("Moderate to severe");
				code.setCodeSystem("2.16.840.1.113883.6.96");
				code.setCodeSystemName("SNOMED CT");

				target.getValues().add(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationReferenceValue(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationTemplateId() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationTemplateIdTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationTemplateId(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationClassCode() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationClassCodeTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationClassCode(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationMoodCode() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationMoodCodeTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationMoodCode(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationCode() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationCodeTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("SEV");
				cd.setCodeSystem("2.16.840.1.113883.5.4");
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationCode(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationText() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationTextTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationText",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationText(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityObservationStatusCode() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationStatusCodeTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationStatusCode(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationValue() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationValueTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("255604002");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationValue(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationInterpretationCode() {
		OperationsTestCase<SeverityObservation> validateSeverityObservationInterpretationCodeTestCase = new OperationsTestCase<SeverityObservation>(
			"validateSeverityObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeverityObservation target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.5.14");
				target.getInterpretationCodes().add(code);

			}

			@Override
			protected void updateToPass(SeverityObservation target) {
				// target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.1.11.78");
				target.getInterpretationCodes().add(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityObservationOperations.validateSeverityObservationClassCode(
					(SeverityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SeverityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SeverityObservation> {
		public SeverityObservation create() {
			return ConsolFactory.eINSTANCE.createSeverityObservation();
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
	private static class ConstructorTestClass extends SeverityObservationOperations {
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

} // SeverityObservationOperations