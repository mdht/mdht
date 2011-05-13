package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.SC;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class ScanningDeviceOperationsTest extends CDAValidationTest {
	
	
	public static class OperationsForOCL extends ScanningDeviceOperations {
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
	
	public class ObjectFactory implements TestObjectFactory<ScanningDevice> {
		public ScanningDevice create() {
			return IHEFactory.eINSTANCE.createScanningDevice();
		}
	}
	
	ObjectFactory objectFactory = new ObjectFactory();
	

	@Test
	public void testValidateScanningDeviceTimeEqualsDocumentEffectiveTime() {
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceTimeEqualsDocumentEffectiveTime", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				
				target.init();
				TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
				target.setTime(ts);
				ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
				TS docts = DatatypesFactory.eINSTANCE.createTS("20081204103022-0500");;
				cd.setEffectiveTime(docts);
				cd.getAuthors().add(target);
//				cd.setd
//				cd.getd .setDataEnterer(target);

			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
				target.setTime(ts);
				ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
				cd.setEffectiveTime(ts);
				cd.getAuthors().add(target);
//				cd.setDataEnterer(target);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceTimeEqualsDocumentEffectiveTime((ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanningDeviceHasAssignedAuthorId() {
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceHasAssignedAuthorId", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(value);
				

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorId((ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanningDeviceHasAssignedAuthoringDeviceCode() {
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceHasAssignedAuthoringDeviceCode", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();
				value.setAssignedAuthoringDevice(device );
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				
			
				CE ce = DatatypesFactory.eINSTANCE.createCE("","1.2.840.10008.2.16.4");
				ce.setCode("CAPTURE");
				ce.setDisplayName("PDF Capture");
				
				target.getAssignedAuthor().getAssignedAuthoringDevice().setCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthoringDeviceCode((ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanningDeviceHasDeviceManufacturerModelName() {
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceHasDeviceManufacturerModelName", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();
				
				value.setAssignedAuthoringDevice(device );
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				SC sc = DatatypesFactory.eINSTANCE.createSC();
				sc.addText("model name");
				target.getAssignedAuthor().getAssignedAuthoringDevice().setManufacturerModelName(sc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceHasDeviceManufacturerModelName((ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanningDeviceHasDeviceSoftwareName() {
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceHasDeviceSoftwareName", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();
					
				value.setAssignedAuthoringDevice(device );
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				
				SC sc = DatatypesFactory.eINSTANCE.createSC();
				sc.addText("software");				
				target.getAssignedAuthor().getAssignedAuthoringDevice().setSoftwareName(sc );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceHasDeviceSoftwareName((ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanningDeviceHasAssignedAuthorRepresentedOrganizationId() {
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceHasAssignedAuthorRepresentedOrganizationId", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization reporg = CDAFactory.eINSTANCE.createOrganization();
				value.setRepresentedOrganization(reporg );
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getAssignedAuthor().getRepresentedOrganization().getIds().add(ii );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId((ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateScanningDeviceTemplateId() {
		
		OperationsTestCase<ScanningDevice> testCase = new OperationsTestCase<ScanningDevice>(
				"ValidateScanningDeviceTemplateId", operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ScanningDeviceOperations.validateScanningDeviceTemplateId((ScanningDevice) objectToTest, diagnostician, map);
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
