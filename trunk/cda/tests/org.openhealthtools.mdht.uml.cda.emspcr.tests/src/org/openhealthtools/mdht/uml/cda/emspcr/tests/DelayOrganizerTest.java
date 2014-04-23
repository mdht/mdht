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
import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DelayOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Delay Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerDispatchDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Dispatch Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerResponseDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Response Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerSceneDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Scene Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerTransportDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Transport Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerTurnaoundDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Turnaound Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DelayOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDelayOrganizerDispatchDelayRelationship() {
		OperationsTestCase<DelayOrganizer> validateDelayOrganizerDispatchDelayRelationshipTestCase = new OperationsTestCase<DelayOrganizer>(
			"validateDelayOrganizerDispatchDelayRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DelayOrganizer target) {

			}

			@Override
			protected void updateToPass(DelayOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DelayOrganizerOperations.validateDelayOrganizerDispatchDelayRelationship(
					(DelayOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDelayOrganizerDispatchDelayRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDelayOrganizerResponseDelayRelationship() {
		OperationsTestCase<DelayOrganizer> validateDelayOrganizerResponseDelayRelationshipTestCase = new OperationsTestCase<DelayOrganizer>(
			"validateDelayOrganizerResponseDelayRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DelayOrganizer target) {

			}

			@Override
			protected void updateToPass(DelayOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DelayOrganizerOperations.validateDelayOrganizerResponseDelayRelationship(
					(DelayOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDelayOrganizerResponseDelayRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDelayOrganizerSceneDelayRelationship() {
		OperationsTestCase<DelayOrganizer> validateDelayOrganizerSceneDelayRelationshipTestCase = new OperationsTestCase<DelayOrganizer>(
			"validateDelayOrganizerSceneDelayRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DelayOrganizer target) {

			}

			@Override
			protected void updateToPass(DelayOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DelayOrganizerOperations.validateDelayOrganizerSceneDelayRelationship(
					(DelayOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDelayOrganizerSceneDelayRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDelayOrganizerTransportDelayRelationship() {
		OperationsTestCase<DelayOrganizer> validateDelayOrganizerTransportDelayRelationshipTestCase = new OperationsTestCase<DelayOrganizer>(
			"validateDelayOrganizerTransportDelayRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DelayOrganizer target) {

			}

			@Override
			protected void updateToPass(DelayOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DelayOrganizerOperations.validateDelayOrganizerTransportDelayRelationship(
					(DelayOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDelayOrganizerTransportDelayRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDelayOrganizerTurnaoundDelayRelationship() {
		OperationsTestCase<DelayOrganizer> validateDelayOrganizerTurnaoundDelayRelationshipTestCase = new OperationsTestCase<DelayOrganizer>(
			"validateDelayOrganizerTurnaoundDelayRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DelayOrganizer target) {

			}

			@Override
			protected void updateToPass(DelayOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DelayOrganizerOperations.validateDelayOrganizerTurnaoundDelayRelationship(
					(DelayOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDelayOrganizerTurnaoundDelayRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDelayOrganizerTemplateId() {
		OperationsTestCase<DelayOrganizer> validateDelayOrganizerTemplateIdTestCase = new OperationsTestCase<DelayOrganizer>(
			"validateDelayOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DelayOrganizer target) {

			}

			@Override
			protected void updateToPass(DelayOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DelayOrganizerOperations.validateDelayOrganizerTemplateId(
					(DelayOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDelayOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DelayOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DelayOrganizer> {
		public DelayOrganizer create() {
			return EmspcrFactory.eINSTANCE.createDelayOrganizer();
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
	private static class ConstructorTestClass extends DelayOrganizerOperations {
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

} // DelayOrganizerOperations
