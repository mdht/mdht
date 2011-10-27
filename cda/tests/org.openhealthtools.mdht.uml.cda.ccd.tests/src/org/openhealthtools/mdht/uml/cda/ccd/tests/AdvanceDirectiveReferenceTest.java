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
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveReferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasConformanceTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has Conformance To</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasURL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has URL</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasMIMEType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has MIME Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Id</em>}</li>
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
	public void testValidateAdvanceDirectiveReferenceHasConformanceTo() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceHasConformanceToTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceHasConformanceTo",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_CONFORMANCE_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

				target.init();

				Reference reference = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(reference);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {

				for (Reference reference : target.getReferences()) {
					ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
					reference.setExternalDocument(ed);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceHasConformanceTo(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceHasConformanceToTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceHasReference() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceHasReferenceTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceHasReference",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

				target.init();

				Reference reference = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(reference);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {

				for (Reference reference : target.getReferences()) {

					reference.setTypeCode(x_ActRelationshipExternalReference.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceHasReference(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceHasReferenceTestCase.doValidationTest();
	}

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
				Reference reference = CDAFactory.eINSTANCE.createReference();

				ExternalDocument externalDocument = CDAFactory.eINSTANCE.createExternalDocument();

				ED ed = DatatypesFactory.eINSTANCE.createED();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL("url");
				ed.setReference(tel);
				externalDocument.setText(ed);

				reference.setExternalDocument(externalDocument);

				target.getReferences().add(reference);

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

				target.init();

				Reference reference = CDAFactory.eINSTANCE.createReference();

				ExternalDocument doc = CDAFactory.eINSTANCE.createExternalDocument();
				ED ed = DatatypesFactory.eINSTANCE.createED();

				// ed.setMediaType("AAAAAAAAAAA");
				doc.setText(ed);

				reference.setExternalDocument(doc);

				target.getReferences().add(reference);

			}

			/*
			 * The MIME type of a referenced advance directive document MAY be present, and SHALL be represented in Observation / reference /
			 * ExternalDocument / text / @mediaType
			 */
			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {

				for (Reference reference : target.getReferences()) {
					reference.getExternalDocument().getText().setMediaType("somemediatype");
				}

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
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveReferenceId() {
		OperationsTestCase<AdvanceDirectiveReference> validateAdvanceDirectiveReferenceIdTestCase = new OperationsTestCase<AdvanceDirectiveReference>(
			"validateAdvanceDirectiveReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveReference target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveReference target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveReferenceOperations.validateAdvanceDirectiveReferenceId(
					(AdvanceDirectiveReference) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveReferenceIdTestCase.doValidationTest();
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
