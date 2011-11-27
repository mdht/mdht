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
import org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.consol.operations.ScanOriginalAuthorOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scan Original Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor#validateScanOriginalAuthorHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor#validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor#validateScanOriginalAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ScanOriginalAuthorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanOriginalAuthorHasAssignedAuthorId() {
		OperationsTestCase<ScanOriginalAuthor> validateScanOriginalAuthorHasAssignedAuthorIdTestCase = new OperationsTestCase<ScanOriginalAuthor>(
			"validateScanOriginalAuthorHasAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanOriginalAuthor target) {

			}

			@Override
			protected void updateToPass(ScanOriginalAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorId(
					(ScanOriginalAuthor) objectToTest, diagnostician, map);
			}

		};

		validateScanOriginalAuthorHasAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId() {
		OperationsTestCase<ScanOriginalAuthor> validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationIdTestCase = new OperationsTestCase<ScanOriginalAuthor>(
			"validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanOriginalAuthor target) {

			}

			@Override
			protected void updateToPass(ScanOriginalAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(
					(ScanOriginalAuthor) objectToTest, diagnostician, map);
			}

		};

		validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanOriginalAuthorTemplateId() {
		OperationsTestCase<ScanOriginalAuthor> validateScanOriginalAuthorTemplateIdTestCase = new OperationsTestCase<ScanOriginalAuthor>(
			"validateScanOriginalAuthorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanOriginalAuthor target) {

			}

			@Override
			protected void updateToPass(ScanOriginalAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanOriginalAuthorOperations.validateScanOriginalAuthorTemplateId(
					(ScanOriginalAuthor) objectToTest, diagnostician, map);
			}

		};

		validateScanOriginalAuthorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ScanOriginalAuthorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScanOriginalAuthor> {
		public ScanOriginalAuthor create() {
			return ConsolFactory.eINSTANCE.createScanOriginalAuthor();
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
	private static class ConstructorTestClass extends ScanOriginalAuthorOperations {
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

} // ScanOriginalAuthorOperations
