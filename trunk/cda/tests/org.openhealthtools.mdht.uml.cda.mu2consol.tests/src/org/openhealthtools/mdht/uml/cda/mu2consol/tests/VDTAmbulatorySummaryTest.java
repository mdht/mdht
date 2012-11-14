/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTAmbulatorySummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Ambulatory Summary</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#validateVDTAmbulatorySummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Summary Responsible Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VDTAmbulatorySummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTAmbulatorySummaryResponsibleParty() {
		OperationsTestCase<VDTAmbulatorySummary> validateVDTAmbulatorySummaryResponsiblePartyTestCase = new OperationsTestCase<VDTAmbulatorySummary>(
				"validateVDTAmbulatorySummaryResponsibleParty",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatorySummary target) {
				target.init();
				Component1 comp1 = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter encounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				comp1.setEncompassingEncounter(encounter);
				target.setComponentOf(comp1);
			}

			@Override
			protected void updateToPass(VDTAmbulatorySummary target) {
				ResponsibleParty party = CDAFactory.eINSTANCE
						.createResponsibleParty();
				target.getComponentOf().getEncompassingEncounter()
						.setResponsibleParty(party);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatorySummaryOperations
						.validateVDTAmbulatorySummaryResponsibleParty(
								(VDTAmbulatorySummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTAmbulatorySummaryResponsiblePartyTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			VDTAmbulatorySummaryOperations {
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
			TestObjectFactory<VDTAmbulatorySummary> {
		@Override
		public VDTAmbulatorySummary create() {
			return Mu2consolFactory.eINSTANCE.createVDTAmbulatorySummary();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			VDTAmbulatorySummaryOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // VDTAmbulatorySummaryOperations