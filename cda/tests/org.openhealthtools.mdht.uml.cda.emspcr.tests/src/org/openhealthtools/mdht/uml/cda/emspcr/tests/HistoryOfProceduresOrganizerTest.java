/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.HistoryOfProceduresOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Procedures Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer#validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Existence Of History Of Procedure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer#validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer History Of Procedures Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer#validateHistoryOfProceduresOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfProceduresOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent() {
		OperationsTestCase<HistoryOfProceduresOrganizer> validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponentTestCase = new OperationsTestCase<HistoryOfProceduresOrganizer>(
			"validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfProceduresOrganizer target) {

			}

			@Override
			protected void updateToPass(HistoryOfProceduresOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfProceduresOrganizerOperations.validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(
					(HistoryOfProceduresOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfProceduresOrganizerHistoryOfProceduresComponent() {
		OperationsTestCase<HistoryOfProceduresOrganizer> validateHistoryOfProceduresOrganizerHistoryOfProceduresComponentTestCase = new OperationsTestCase<HistoryOfProceduresOrganizer>(
			"validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfProceduresOrganizer target) {

			}

			@Override
			protected void updateToPass(HistoryOfProceduresOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfProceduresOrganizerOperations.validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(
					(HistoryOfProceduresOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfProceduresOrganizerHistoryOfProceduresComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfProceduresOrganizerTemplateId() {
		OperationsTestCase<HistoryOfProceduresOrganizer> validateHistoryOfProceduresOrganizerTemplateIdTestCase = new OperationsTestCase<HistoryOfProceduresOrganizer>(
			"validateHistoryOfProceduresOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfProceduresOrganizer target) {

			}

			@Override
			protected void updateToPass(HistoryOfProceduresOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfProceduresOrganizerOperations.validateHistoryOfProceduresOrganizerTemplateId(
					(HistoryOfProceduresOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfProceduresOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfProceduresOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfProceduresOrganizer> {
		public HistoryOfProceduresOrganizer create() {
			return EmspcrFactory.eINSTANCE.createHistoryOfProceduresOrganizer();
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
	private static class ConstructorTestClass extends HistoryOfProceduresOrganizerOperations {
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

} // HistoryOfProceduresOrganizerOperations
