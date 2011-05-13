package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

public class SeverityOperationsTest  extends CDAValidationTest {
	
	public static class OperationsForOCL extends SeverityOperations {
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
	
	public class ObjectFactory implements TestObjectFactory<Severity> {
		public Severity create() {
			return IHEFactory.eINSTANCE.createSeverity();
		}
	}
	
	ObjectFactory objectFactory = new ObjectFactory();
	

	@Test
	public void testValidateSeverityTemplateId() {
		OperationsTestCase<Severity> testCase = new OperationsTestCase<Severity>(
				"ValidateSeverityTemplateId", operationsForOCL.getOCLValue("VALIDATE_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				
			}

			@Override
			protected void updateToPass(Severity target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SeverityOperations.validateSeverityTemplateId((Severity) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}
	
	@Test
	public void testValidateSeverityHasTextReference() {
		OperationsTestCase<Severity> testCase = new OperationsTestCase<Severity>(
				"validateSeverityHasTextReference", operationsForOCL.getOCLValue("VALIDATE_SEVERITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				target.init();
				
				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setText(value );
			}

			@Override
			protected void updateToPass(Severity target) {
				TEL value = DatatypesFactory.eINSTANCE.createTEL();
				target.getText().setReference(value );
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SeverityOperations.validateSeverityHasTextReference((Severity) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}
	
	
	@Test
	public void testValidateSeverityHasText() {
		OperationsTestCase<Severity> testCase = new OperationsTestCase<Severity>(
				"ValidateSeverityHasText", operationsForOCL.getOCLValue("VALIDATE_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				target.init();
			}

			@Override
			protected void updateToPass(Severity target) {
				
				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setText(value );
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SeverityOperations.validateSeverityText((Severity) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}
	
	@Test
	public void testValidateSeverityObservationValue() {
		OperationsTestCase<Severity> testCase = new OperationsTestCase<Severity>(
				"ValidateSeverityObservationValue", operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				target.init();
			}

			@Override
			protected void updateToPass(Severity target) {
				CD ce = DatatypesFactory.eINSTANCE.createCD();
				ce.setCodeSystem("2.16.840.1.113883.5.1063");
				ce.setCode("H");
				target.getValues().add(ce );
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SeverityOperations.validateSeverityObservationValue((Severity) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}


	@Override
	protected EObject getObjectToTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
