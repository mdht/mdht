/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.Component_NonXMLBodyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Non XML Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody#validateNonXMLBodyHasReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Has Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody#validateNonXMLBodyMediaTypeFileFormats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Media Type File Formats</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody#validateNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Component_NonXMLBodyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonXMLBodyHasReferenceOrRepresentation() {
		OperationsTestCase<Component_NonXMLBody> validateNonXMLBodyHasReferenceOrRepresentationTestCase = new OperationsTestCase<Component_NonXMLBody>(
			"validateNonXMLBodyHasReferenceOrRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Component_NonXMLBody target) {

			}

			@Override
			protected void updateToPass(Component_NonXMLBody target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Component_NonXMLBodyOperations.validateNonXMLBodyHasReferenceOrRepresentation(
					(Component_NonXMLBody) objectToTest, diagnostician, map);
			}

		};

		validateNonXMLBodyHasReferenceOrRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonXMLBodyMediaTypeFileFormats() {
		OperationsTestCase<Component_NonXMLBody> validateNonXMLBodyMediaTypeFileFormatsTestCase = new OperationsTestCase<Component_NonXMLBody>(
			"validateNonXMLBodyMediaTypeFileFormats",
			operationsForOCL.getOCLValue("VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Component_NonXMLBody target) {

			}

			@Override
			protected void updateToPass(Component_NonXMLBody target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Component_NonXMLBodyOperations.validateNonXMLBodyMediaTypeFileFormats(
					(Component_NonXMLBody) objectToTest, diagnostician, map);
			}

		};

		validateNonXMLBodyMediaTypeFileFormatsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonXMLBodyText() {
		OperationsTestCase<Component_NonXMLBody> validateNonXMLBodyTextTestCase = new OperationsTestCase<Component_NonXMLBody>(
			"validateNonXMLBodyText",
			operationsForOCL.getOCLValue("VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Component_NonXMLBody target) {

			}

			@Override
			protected void updateToPass(Component_NonXMLBody target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Component_NonXMLBodyOperations.validateNonXMLBodyText(
					(Component_NonXMLBody) objectToTest, diagnostician, map);
			}

		};

		validateNonXMLBodyTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Component_NonXMLBodyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Component_NonXMLBody> {
		public Component_NonXMLBody create() {
			return ConsolFactory.eINSTANCE.createComponent_NonXMLBody();
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
	private static class ConstructorTestClass extends Component_NonXMLBodyOperations {
	}

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

} // Component_NonXMLBodyOperations
