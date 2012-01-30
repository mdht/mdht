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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_Participant;

import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport_ParticipantOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_Participant#validateParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Associated Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticImagingReport_ParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateParticipantAssociatedEntity() {
		OperationsTestCase<DiagnosticImagingReport_Participant> validateParticipantAssociatedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport_Participant>(
			"validateParticipantAssociatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport_Participant target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport_Participant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReport_ParticipantOperations.validateParticipantAssociatedEntity(
					(DiagnosticImagingReport_Participant) objectToTest, diagnostician, map);
			}

		};

		validateParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticImagingReport_ParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DiagnosticImagingReport_Participant> {
		public DiagnosticImagingReport_Participant create() {
			return ConsolFactory.eINSTANCE.createDiagnosticImagingReport_Participant();
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
	private static class ConstructorTestClass extends DiagnosticImagingReport_ParticipantOperations {
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

} // DiagnosticImagingReport_ParticipantOperations
