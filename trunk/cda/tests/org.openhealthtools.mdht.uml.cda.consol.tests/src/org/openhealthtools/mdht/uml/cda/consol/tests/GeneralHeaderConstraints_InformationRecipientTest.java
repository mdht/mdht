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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InformationRecipient;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_InformationRecipientOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Information Recipient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InformationRecipient#validateInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Recipient Intended Recipient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraints_InformationRecipientTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInformationRecipientIntendedRecipient() {
		OperationsTestCase<GeneralHeaderConstraints_InformationRecipient> validateInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<GeneralHeaderConstraints_InformationRecipient>(
			"validateInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue("VALIDATE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_InformationRecipient target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_InformationRecipient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_InformationRecipientOperations.validateInformationRecipientIntendedRecipient(
					(GeneralHeaderConstraints_InformationRecipient) objectToTest, diagnostician, map);
			}

		};

		validateInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraints_InformationRecipientOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints_InformationRecipient> {
		public GeneralHeaderConstraints_InformationRecipient create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints_InformationRecipient();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraints_InformationRecipientOperations {
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

} // GeneralHeaderConstraints_InformationRecipientOperations
