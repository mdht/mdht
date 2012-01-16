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

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent2Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2#validateServiceEvent2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2#validateServiceEvent2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event2 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DocumentationOf_ServiceEvent2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent2ClassCode() {
		OperationsTestCase<DocumentationOf_ServiceEvent2> validateServiceEvent2ClassCodeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent2>(
			"validateServiceEvent2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent2 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent2Operations.validateServiceEvent2ClassCode(
					(DocumentationOf_ServiceEvent2) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent2EffectiveTime() {
		OperationsTestCase<DocumentationOf_ServiceEvent2> validateServiceEvent2EffectiveTimeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent2>(
			"validateServiceEvent2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent2 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent2Operations.validateServiceEvent2EffectiveTime(
					(DocumentationOf_ServiceEvent2) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DocumentationOf_ServiceEvent2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DocumentationOf_ServiceEvent2> {
		public DocumentationOf_ServiceEvent2 create() {
			return ConsolFactory.eINSTANCE.createDocumentationOf_ServiceEvent2();
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
	private static class ConstructorTestClass extends DocumentationOf_ServiceEvent2Operations {
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

} // DocumentationOf_ServiceEvent2Operations
