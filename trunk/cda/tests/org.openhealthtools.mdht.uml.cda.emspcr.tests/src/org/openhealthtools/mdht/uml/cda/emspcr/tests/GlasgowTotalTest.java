/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowTotalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Total</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal#validateGlasgowTotalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Total Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowTotalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowTotalTemplateId() {
		OperationsTestCase<GlasgowTotal> validateGlasgowTotalTemplateIdTestCase = new OperationsTestCase<GlasgowTotal>(
			"validateGlasgowTotalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_TOTAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowTotal target) {

			}

			@Override
			protected void updateToPass(GlasgowTotal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowTotalOperations.validateGlasgowTotalTemplateId(
					(GlasgowTotal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowTotalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowTotalMoodCode() {
		OperationsTestCase<GlasgowTotal> validateGlasgowTotalMoodCodeTestCase = new OperationsTestCase<GlasgowTotal>(
			"validateGlasgowTotalMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_TOTAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowTotal target) {

			}

			@Override
			protected void updateToPass(GlasgowTotal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowTotalOperations.validateGlasgowTotalMoodCode(
					(GlasgowTotal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowTotalMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowTotalCodeP() {
		OperationsTestCase<GlasgowTotal> validateGlasgowTotalCodePTestCase = new OperationsTestCase<GlasgowTotal>(
			"validateGlasgowTotalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_TOTAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowTotal target) {

			}

			@Override
			protected void updateToPass(GlasgowTotal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowTotalOperations.validateGlasgowTotalCodeP((GlasgowTotal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowTotalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowTotalCode() {
		OperationsTestCase<GlasgowTotal> validateGlasgowTotalCodeTestCase = new OperationsTestCase<GlasgowTotal>(
			"validateGlasgowTotalCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_TOTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowTotal target) {

			}

			@Override
			protected void updateToPass(GlasgowTotal target) {
				target.init();

			}

			@Override
			protected void setDependency(GlasgowTotal target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowTotalOperations.validateGlasgowTotalCode((GlasgowTotal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowTotalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowTotalValue() {
		OperationsTestCase<GlasgowTotal> validateGlasgowTotalValueTestCase = new OperationsTestCase<GlasgowTotal>(
			"validateGlasgowTotalValue",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_TOTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowTotal target) {

			}

			@Override
			protected void updateToPass(GlasgowTotal target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowTotalOperations.validateGlasgowTotalValue((GlasgowTotal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowTotalValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowTotalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowTotal> {
		public GlasgowTotal create() {
			return EmspcrFactory.eINSTANCE.createGlasgowTotal();
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
	private static class ConstructorTestClass extends GlasgowTotalOperations {
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

} // GlasgowTotalOperations
