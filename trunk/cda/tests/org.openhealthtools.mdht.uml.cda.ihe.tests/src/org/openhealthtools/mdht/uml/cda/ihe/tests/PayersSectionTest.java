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
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PayersSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection#validateIHEPayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection#validateIHEPayersSectionCoverageEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Coverage Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection#getCoverageEntries() <em>Get Coverage Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PayersSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEPayersSectionTemplateId() {
		OperationsTestCase<PayersSection> validateIHEPayersSectionTemplateIdTestCase = new OperationsTestCase<PayersSection>(
			"validateIHEPayersSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validateIHEPayersSectionTemplateId(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validateIHEPayersSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHEPayersSectionCoverageEntry() {
		OperationsTestCase<PayersSection> validateIHEPayersSectionCoverageEntryTestCase = new OperationsTestCase<PayersSection>(
			"validateIHEPayersSectionCoverageEntry",
			operationsForOCL.getOCLValue("VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {
				target.init();

			}

			@Override
			protected void updateToPass(PayersSection target) {
				CoverageEntry entry = IHEFactory.eINSTANCE.createCoverageEntry().init();
				target.addAct(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validateIHEPayersSectionCoverageEntry(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validateIHEPayersSectionCoverageEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PayersSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PayersSection> {

		public PayersSection create() {
			return IHEFactory.eINSTANCE.createPayersSection();
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
	private static class ConstructorTestClass extends PayersSectionOperations {
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

} // PayersSectionOperations
