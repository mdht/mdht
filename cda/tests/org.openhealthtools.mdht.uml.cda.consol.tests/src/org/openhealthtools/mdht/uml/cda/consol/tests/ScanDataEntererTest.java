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
import org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.consol.operations.ScanDataEntererOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scan Data Enterer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer#validateScanDataEntererTimeEqualsDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time Equals Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer#validateScanDataEntererHasAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Has Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer#validateScanDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ScanDataEntererTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanDataEntererTimeEqualsDocumentEffectiveTime() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererTimeEqualsDocumentEffectiveTimeTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererTimeEqualsDocumentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {

			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererTimeEqualsDocumentEffectiveTime(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererTimeEqualsDocumentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanDataEntererHasAssignedEntityId() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererHasAssignedEntityIdTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererHasAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {

			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererHasAssignedEntityId(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererHasAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanDataEntererTime() {
		OperationsTestCase<ScanDataEnterer> validateScanDataEntererTimeTestCase = new OperationsTestCase<ScanDataEnterer>(
			"validateScanDataEntererTime",
			operationsForOCL.getOCLValue("VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanDataEnterer target) {

			}

			@Override
			protected void updateToPass(ScanDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanDataEntererOperations.validateScanDataEntererTime(
					(ScanDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateScanDataEntererTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ScanDataEntererOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScanDataEnterer> {
		public ScanDataEnterer create() {
			return ConsolFactory.eINSTANCE.createScanDataEnterer();
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
	private static class ConstructorTestClass extends ScanDataEntererOperations {
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

} // ScanDataEntererOperations
