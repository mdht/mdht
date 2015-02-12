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
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchLocationOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Location Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerDispatchLocationNameRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Name Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Latitude Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Longtude Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchLocationOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationOrganizerDispatchLocationNameRelationship() {
		OperationsTestCase<DispatchLocationOrganizer> validateDispatchLocationOrganizerDispatchLocationNameRelationshipTestCase = new OperationsTestCase<DispatchLocationOrganizer>(
			"validateDispatchLocationOrganizerDispatchLocationNameRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationOrganizer target) {

			}

			@Override
			protected void updateToPass(DispatchLocationOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerDispatchLocationNameRelationship(
					(DispatchLocationOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationOrganizerDispatchLocationNameRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationOrganizerDispatchLocationLatitudeRelationship() {
		OperationsTestCase<DispatchLocationOrganizer> validateDispatchLocationOrganizerDispatchLocationLatitudeRelationshipTestCase = new OperationsTestCase<DispatchLocationOrganizer>(
			"validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationOrganizer target) {

			}

			@Override
			protected void updateToPass(DispatchLocationOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(
					(DispatchLocationOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationOrganizerDispatchLocationLatitudeRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationOrganizerDispatchLocationLongtudeRelationship() {
		OperationsTestCase<DispatchLocationOrganizer> validateDispatchLocationOrganizerDispatchLocationLongtudeRelationshipTestCase = new OperationsTestCase<DispatchLocationOrganizer>(
			"validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationOrganizer target) {

			}

			@Override
			protected void updateToPass(DispatchLocationOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(
					(DispatchLocationOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationOrganizerDispatchLocationLongtudeRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationOrganizerTemplateId() {
		OperationsTestCase<DispatchLocationOrganizer> validateDispatchLocationOrganizerTemplateIdTestCase = new OperationsTestCase<DispatchLocationOrganizer>(
			"validateDispatchLocationOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationOrganizer target) {

			}

			@Override
			protected void updateToPass(DispatchLocationOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerTemplateId(
					(DispatchLocationOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispatchLocationOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchLocationOrganizer> {
		public DispatchLocationOrganizer create() {
			return EmspcrFactory.eINSTANCE.createDispatchLocationOrganizer();
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
	private static class ConstructorTestClass extends DispatchLocationOrganizerOperations {
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

} // DispatchLocationOrganizerOperations
