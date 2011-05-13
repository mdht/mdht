package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

public class ProblemStatusObservationOperationsTest extends ObservationOperationsTest {

	public static class OperationsForOCL extends ProblemStatusObservationOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<ProblemStatusObservation> {
		public ProblemStatusObservation create() {
			return IHEFactory.eINSTANCE.createProblemStatusObservation();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateIHEProblemStatusObservationHasTextReference() {
		OperationsTestCase<ProblemStatusObservation> testCase = new OperationsTestCase<ProblemStatusObservation>("ValidateIHEProblemStatusObservationHasTextReference",
				operationsForOCL.getOCLValue("VALIDATE_IHE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {
				target.init();
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);
			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				TEL value = DatatypesFactory.eINSTANCE.createTEL("reference");
				target.getText().setReference(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemStatusObservationOperations.validateIHEProblemStatusObservationHasTextReference((ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateIHEProblemStatusObservationTemplateId() {
		OperationsTestCase<ProblemStatusObservation> testCase = new OperationsTestCase<ProblemStatusObservation>("ValidateProblemStatusObservationTemplateId",
				operationsForOCL.getOCLValue("VALIDATE_IHE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemStatusObservationOperations.validateIHEProblemStatusObservationTemplateId((ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateIHEProblemStatusObservationText() {
		OperationsTestCase<ProblemStatusObservation> testCase = new OperationsTestCase<ProblemStatusObservation>("ValidateIHEProblemStatusObservationText",
				operationsForOCL.getOCLValue("VALIDATE_IHE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemStatusObservationOperations.validateIHEProblemStatusObservationText((ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateStatusObservationValue() {
		OperationsTestCase<ProblemStatusObservation> testCase = new OperationsTestCase<ProblemStatusObservation>("ValidateStatusObservationValue",
				operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				target.init();
				ANY cd = DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96");
				target.getValues().add(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemStatusObservationOperations.validateStatusObservationValue((ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

}
