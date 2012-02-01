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
import org.openhealthtools.mdht.uml.cda.consol.CoveredParty;
import org.openhealthtools.mdht.uml.cda.consol.operations.CoveredPartyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Covered Party</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoveredParty#validateCoveredPartyId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Covered Party Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoveredParty#validateCoveredPartyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Covered Party Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CoveredPartyTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCoveredPartyId() {
		OperationsTestCase<CoveredParty> validateCoveredPartyIdTestCase = new OperationsTestCase<CoveredParty>(
			"validateCoveredPartyId",
			operationsForOCL.getOCLValue("VALIDATE_COVERED_PARTY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CoveredParty target) {

			}

			@Override
			protected void updateToPass(CoveredParty target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoveredPartyOperations.validateCoveredPartyId((CoveredParty) objectToTest, diagnostician, map);
			}

		};

		validateCoveredPartyIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCoveredPartyCode() {
		OperationsTestCase<CoveredParty> validateCoveredPartyCodeTestCase = new OperationsTestCase<CoveredParty>(
			"validateCoveredPartyCode",
			operationsForOCL.getOCLValue("VALIDATE_COVERED_PARTY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CoveredParty target) {
				target.init();
			}

			@Override
			protected void updateToPass(CoveredParty target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoveredPartyOperations.validateCoveredPartyCode((CoveredParty) objectToTest, diagnostician, map);
			}

		};

		validateCoveredPartyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CoveredPartyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoveredParty> {
		public CoveredParty create() {
			return ConsolFactory.eINSTANCE.createCoveredParty();
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
	private static class ConstructorTestClass extends CoveredPartyOperations {
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

} // CoveredPartyOperations
