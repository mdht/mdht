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
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Family History Organizer</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Family History Organizer Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Family History Organizer Status Code</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class FamilyHistoryOrganizerTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFamilyHistoryOrganizerTemplateId() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerTemplateIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
				"validateFamilyHistoryOrganizerTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations
						.validateFamilyHistoryOrganizerTemplateId(
								(FamilyHistoryOrganizer) objectToTest,
								diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFamilyHistoryOrganizerStatusCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerStatusCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
				"validateFamilyHistoryOrganizerStatusCode",
				operationsForOCL
						.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations
						.validateFamilyHistoryOrganizerStatusCode(
								(FamilyHistoryOrganizer) objectToTest,
								diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			FamilyHistoryOrganizerOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<FamilyHistoryOrganizer> {
		public FamilyHistoryOrganizer create() {
			return CCDFactory.eINSTANCE.createFamilyHistoryOrganizer();
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
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FamilyHistoryOrganizerOperations