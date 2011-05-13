package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

public class HealthStatusObservationTest extends ObservationOperationsTest {

	public static class OperationsForOCL extends HealthStatusObservationOperations {
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

	public class ObjectFactory implements TestObjectFactory<HealthStatusObservation> {
		public HealthStatusObservation create() {
			return IHEFactory.eINSTANCE.createHealthStatusObservation();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateHealthStatusObservationHasTextReference() {
		OperationsTestCase<HealthStatusObservation> testCase = new OperationsTestCase<HealthStatusObservation>("ValidateHealthStatusObservationHasTextReference",
				operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {
				target.init();
				ED value = DatatypesFactory.eINSTANCE.createED("Test");
				target.setText(value);
			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				TEL value = DatatypesFactory.eINSTANCE.createTEL();
				target.getText().setReference(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReference((HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateHealthStatusObservationTemplateId() {
		OperationsTestCase<HealthStatusObservation> testCase = new OperationsTestCase<HealthStatusObservation>("ValidateHealthStatusObservationTemplateId",
				operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return HealthStatusObservationOperations.validateHealthStatusObservationTemplateId((HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateHealthStatusObservationText() {
		OperationsTestCase<HealthStatusObservation> testCase = new OperationsTestCase<HealthStatusObservation>("ValidateHealthStatusObservationText",
				operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				ED value = DatatypesFactory.eINSTANCE.createED("Test");
				target.setText(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return HealthStatusObservationOperations.validateHealthStatusObservationText((HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateStatusObservationValue() {
		OperationsTestCase<HealthStatusObservation> testCase = new OperationsTestCase<HealthStatusObservation>("ValidateStatusObservationValue",
				operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {

				ANY arg0 = DatatypesFactory.eINSTANCE.createCE("81323004", "2.16.840.1.113883.6.96");
				target.getValues().add(arg0);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return HealthStatusObservationOperations.validateStatusObservationValue((HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

}
