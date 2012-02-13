/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveReferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasURL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has URL</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasMIMEType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has MIME Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceExternalDocumentHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference External Document Has Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference External Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceHasURL() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceHasURLTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceHasURL",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {

				target.init();
				ExternalDocument externalDocument = CDAFactory.eINSTANCE.createExternalDocument();

				ED ed = DatatypesFactory.eINSTANCE.createED("sometext");

				ed.setMediaType("mediatype");

				TEL tel = DatatypesFactory.eINSTANCE.createTEL("value");
				ed.setReference(tel);

				externalDocument.setText(ed);
				target.setExternalDocument(externalDocument);
				target.getExternalDocument().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceHasURL(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceHasURLTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceHasMIMEType() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceHasMIMETypeTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceHasMIMEType",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {
				target.init();
				ExternalDocument externalDocument = CDAFactory.eINSTANCE.createExternalDocument();

				ED ed = DatatypesFactory.eINSTANCE.createED("sometext");

				ed.setMediaType("mediatype");

				externalDocument.setText(ed);
				target.setExternalDocument(externalDocument);
				target.getExternalDocument().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceHasMIMEType(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceHasMIMETypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceExternalDocumentHasId() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceExternalDocumentHasIdTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceExternalDocumentHasId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {
				target.init();
				target.setExternalDocument(CDAFactory.eINSTANCE.createExternalDocument());
				target.getExternalDocument().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceExternalDocumentHasId(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceExternalDocumentHasIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceTemplateId() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceTemplateId(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceTypeCode() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceTypeCode(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceExternalDocument() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceExternalDocumentTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceExternalDocument",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceExternalDocument(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceExternalDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveReference> {
		public AdvanceDirectiveReference create() {
			return CCDFactory.eINSTANCE.createAdvanceDirectiveReference();
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
	private static class ConstructorTestClass extends AdvanceDirectiveReferenceOperations {
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

} // AdvanceDirectiveReferenceOperations
