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
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CauseOfDeathObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Cause Of Death Observation</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Family History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class CauseOfDeathObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFamilyHistoryObservationTemplateId() {
		OperationsTestCase<CauseOfDeathObservation> validateFamilyHistoryObservationTemplateIdTestCase = new OperationsTestCase<CauseOfDeathObservation>(
				"validateFamilyHistoryObservationTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CauseOfDeathObservation target) {

			}

			@Override
			protected void updateToPass(CauseOfDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CauseOfDeathObservationOperations
						.validateFamilyHistoryObservationTemplateId(
								(CauseOfDeathObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateFamilyHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			CauseOfDeathObservationOperations {
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
			TestObjectFactory<CauseOfDeathObservation> {
		public CauseOfDeathObservation create() {
			return CCDFactory.eINSTANCE.createCauseOfDeathObservation();
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

} // CauseOfDeathObservationOperations