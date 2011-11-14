/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ExternalReferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceHasNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceHasReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceHasReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceHasReferenceExternalDocumentID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceHasReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExternalReference#validateExternalReferenceText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExternalReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceHasNoCode() {
		OperationsTestCase<ExternalReference> validateExternalReferenceHasNoCodeTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceHasNoCode",
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

		validateExternalReferenceHasNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceHasReference() {
		OperationsTestCase<ExternalReference> validateExternalReferenceHasReferenceTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceHasReference",
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

		validateExternalReferenceHasReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceHasReferenceExternalDocument() {
		OperationsTestCase<ExternalReference> validateExternalReferenceHasReferenceExternalDocumentTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceHasReferenceExternalDocument",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExternalReference target) {
				target.init();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument extdoc = CDAFactory.eINSTANCE.createExternalDocument();
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

		validateExternalReferenceHasReferenceExternalDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceHasReferenceExternalDocumentID() {
		OperationsTestCase<ExternalReference> validateExternalReferenceHasReferenceExternalDocumentIDTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceHasReferenceExternalDocumentID",
			operationsForOCL.getOCLValue("VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

		validateExternalReferenceHasReferenceExternalDocumentIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceHasReferenceExternalDocumentText() {
		OperationsTestCase<ExternalReference> validateExternalReferenceHasReferenceExternalDocumentTextTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceHasReferenceExternalDocumentText",
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
				// extdoc.setText(text);
				ref.setExternalDocument(extdoc);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(ExternalReference target) {
				for (Reference ref : target.getReferences()) {

					ED text = DatatypesFactory.eINSTANCE.createED("string");
					ref.getExternalDocument().setText(text);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocumentText(
					(ExternalReference) objectToTest, diagnostician, map);
			}

		};

		validateExternalReferenceHasReferenceExternalDocumentTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceTemplateId() {
		OperationsTestCase<ExternalReference> validateExternalReferenceTemplateIdTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceTemplateId",
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

		validateExternalReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceClassCode() {
		OperationsTestCase<ExternalReference> validateExternalReferenceClassCodeTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceClassCode",
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

		validateExternalReferenceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceMoodCode() {
		OperationsTestCase<ExternalReference> validateExternalReferenceMoodCodeTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceMoodCode",
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

		validateExternalReferenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceId() {
		OperationsTestCase<ExternalReference> validateExternalReferenceIdTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceId",
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

		validateExternalReferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateExternalReferenceText() {
		OperationsTestCase<ExternalReference> validateExternalReferenceTextTestCase = new OperationsTestCase<ExternalReference>(
			"validateExternalReferenceText",
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

		validateExternalReferenceTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	private static class OperationsForOCL extends ExternalReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExternalReference> {

		public ExternalReference create() {
			return IHEFactory.eINSTANCE.createExternalReference();
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
	private static class ConstructorTestClass extends ExternalReferenceOperations {
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

} // ExternalReferenceOperations
