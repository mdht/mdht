/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.impl.ExternalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.operations.ActOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

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

		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceTemplateId(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceClassCode() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceClassCode(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceMoodCode() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {

			}

			@Override
			protected void updateToPass(ExternalReference target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceMoodCode(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceId() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
				return ExternalReferenceOperations.validateExternalReferenceId(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceNoId() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceNoId",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceId(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceText() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceText",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
				return ExternalReferenceOperations.validateExternalReferenceText(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateExternalReferenceHasNoCode() {

		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceHasNoCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(value);
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setNullFlavor(NullFlavor.NA);
				target.setCode(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceHasNoCode(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateExternalReferenceHasReference() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceHasReference",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);

				ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);

			}

			@Override
			protected void updateToPass(ExternalReference target) {

				int a = 0;
				for (Reference ref : target.getReferences()) {
					if (a++ % 2 == 0) {
						ref.setTypeCode(x_ActRelationshipExternalReference.SPRT);
					} else {
						ref.setTypeCode(x_ActRelationshipExternalReference.REFR);
					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceHasReference(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateExternalReferenceHasReferenceExternalDocument() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceHasReferenceExternalDocument",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument extdoc = CDAFactory.eINSTANCE.createExternalDocument();
				ExternalDocumentImpl foo;

				extdoc.setClassCode(ActClassDocument.CDALVLONE);
				ref.setExternalDocument(extdoc);
				target.getReferences().add(ref);

			}

			@Override
			protected void updateToPass(ExternalReference target) {

				for (Reference ref : target.getReferences()) {
					ref.setTypeCode(x_ActRelationshipExternalReference.SPRT);
					ref.getExternalDocument().setClassCode(ActClassDocument.DOC);
					ref.getExternalDocument().setMoodCode(ActMood.EVN);

				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocument(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateExternalReferenceHasReferenceExternalDocumentID() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceHasReferenceExternalDocumentID",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ref.setTypeCode(x_ActRelationshipExternalReference.SPRT);

				ExternalDocument extdoc = CDAFactory.eINSTANCE.createExternalDocument();
				extdoc.setClassCode(ActClassDocument.DOC);
				ref.setExternalDocument(extdoc);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				for (Reference ref : target.getReferences()) {
					II ii = DatatypesFactory.eINSTANCE.createII();
					ref.getExternalDocument().getIds().add(ii);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocumentID(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateExternalReferenceHasReferenceExternalDocumentText() {
		OperationsTestCase<ExternalReference> testCase = new OperationsTestCase<ExternalReference>(
			"ValidateExternalReferenceHasReferenceExternalDocumentText",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ref.setTypeCode(x_ActRelationshipExternalReference.SPRT);
				ExternalDocument extdoc = CDAFactory.eINSTANCE.createExternalDocument();
				extdoc.setClassCode(ActClassDocument.DOC);
				ED text = DatatypesFactory.eINSTANCE.createED("string");
				extdoc.setText(text);
				ref.setExternalDocument(extdoc);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				for (Reference ref : target.getReferences()) {

					TEL tel = DatatypesFactory.eINSTANCE.createTEL();
					ref.getExternalDocument().getText().setReference(tel);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocumentText(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}
}
