/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection#validateEncounterHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection#validateEncounterHistorySectionEncounterEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Encounter Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection#getEncounterEntries() <em>Get Encounter Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterHistorySectionTemplateId() {
		OperationsTestCase<EncounterHistorySection> validateEncounterHistorySectionTemplateIdTestCase = new OperationsTestCase<EncounterHistorySection>(
			"validateEncounterHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterHistorySection target) {

			}

			@Override
			protected void updateToPass(EncounterHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterHistorySectionOperations.validateEncounterHistorySectionTemplateId(
					(EncounterHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEncounterHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterHistorySectionEncounterEntry() {
		OperationsTestCase<EncounterHistorySection> validateEncounterHistorySectionEncounterEntryTestCase = new OperationsTestCase<EncounterHistorySection>(
			"validateEncounterHistorySectionEncounterEntry",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterHistorySection target) {
				target.init();

			}

			@Override
			protected void updateToPass(EncounterHistorySection target) {
				EncounterEntry ee = IHEFactory.eINSTANCE.createEncounterActivity().init();

				target.addEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterHistorySectionOperations.validateEncounterHistorySectionEncounterEntry(
					(EncounterHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEncounterHistorySectionEncounterEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterHistorySection> {

		public EncounterHistorySection create() {
			return IHEFactory.eINSTANCE.createEncounterHistorySection();
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
	private static class ConstructorTestClass extends EncounterHistorySectionOperations {
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

} // EncounterHistorySectionOperations
