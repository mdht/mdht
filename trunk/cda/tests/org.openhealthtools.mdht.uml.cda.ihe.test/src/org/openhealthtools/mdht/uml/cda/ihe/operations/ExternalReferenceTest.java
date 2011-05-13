package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.ActOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

public class ExternalReferenceTest extends ActOperationsTest {

	public static class OperationsForOCL extends ExternalReferenceOperations {
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

	public class ObjectFactory implements TestObjectFactory<ExternalReference> {
		public ExternalReference create() {
			return IHEFactory.eINSTANCE.createExternalReference();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateExternalReferenceTemplateId() {

		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>("ValidateExternalReferenceTemplateId",
				operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceTemplateId((ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceClassCode() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>("ValidateExternalReferenceClassCode",
				operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceClassCode((ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceMoodCode() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>("ValidateExternalReferenceMoodCode",
				operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceMoodCode((ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceId() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>("ValidateExternalReferenceId",
				operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				II ii = DatatypesFactory.eINSTANCE.createII("root");
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceId((ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceNoId() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>("ValidateExternalReferenceNoId",
				operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceId((ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceText() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>("ValidateExternalReferenceText",
				operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				ED value = DatatypesFactory.eINSTANCE.createED("TextValueHere");
				target.setText(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceText((ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

}
