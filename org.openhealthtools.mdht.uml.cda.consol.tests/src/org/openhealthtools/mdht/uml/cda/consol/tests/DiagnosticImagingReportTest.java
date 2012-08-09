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
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReportOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportUseDiagnosticImagingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Use Diagnostic Imaging Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportAllSectionsHaveTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report All Sections Have Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportSectionsHaveText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Sections Have Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#getFindingsSection() <em>Get Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticImagingReportTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportUseDiagnosticImagingCode() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportUseDiagnosticImagingCodeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportUseDiagnosticImagingCode",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCode("18748-4");
				code.setCodeSystem("2.16.840.1.113883.6.1");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportUseDiagnosticImagingCode(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportUseDiagnosticImagingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportAllSectionsHaveTitle() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportAllSectionsHaveTitleTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportAllSectionsHaveTitle",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection());
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSection());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				for (Section sec : target.getAllSections()) {
					ST title = DatatypesFactory.eINSTANCE.createST("title");
					sec.setTitle(title);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportAllSectionsHaveTitle(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportAllSectionsHaveTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportSectionsHaveText() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportSectionsHaveTextTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportSectionsHaveText",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection());
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSection());
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				for (Section sec : target.getAllSections()) {
					sec.createStrucDocText("Sample Narrative Text");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportSectionsHaveText(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportSectionsHaveTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	@Test
	public void testValidateDiagnosticImagingReportTemplateId() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportTemplateIdTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportTemplateId(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportId() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportIdTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportId",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.setId(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportId(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportInformant() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportInformantTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportInformant",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
				target.getInformants().add(CDAFactory.eINSTANCE.createInformant12());

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.getInformants().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInformant(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportInformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportInformationRecipient() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportInformationRecipientTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInformationRecipient(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportParticipant1() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportParticipant1TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportParticipant1(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportInFulfillmentOf() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportInFulfillmentOfTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportInFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.getInFulfillmentOfs().add(CDAFactory.eINSTANCE.createInFulfillmentOf());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInFulfillmentOf(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOf() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOf(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportRelatedDocument() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportRelatedDocumentTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportRelatedDocument",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportRelatedDocument(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportRelatedDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOf() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {
				target.init();
			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOf(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportFindingsSection() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportFindingsSectionTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportFindingsSection",
			operationsForOCL.getOCLValue("VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

				/* FindingsSection */
				FindingsSection section =

				ConsolFactory.eINSTANCE.createFindingsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportFindingsSection(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportFindingsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFindingsSection() {

		DiagnosticImagingReport target = objectFactory.create();
		target.getFindingsSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<DiagnosticImagingReport> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();
				target.getCode().setCode("code");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateGeneralHeaderConstraintsCode(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticImagingReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DiagnosticImagingReport> {
		public DiagnosticImagingReport create() {
			return ConsolFactory.eINSTANCE.createDiagnosticImagingReport();
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
	private static class ConstructorTestClass extends DiagnosticImagingReportOperations {
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

} // DiagnosticImagingReportOperations
