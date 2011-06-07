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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDose;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SplitDoseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Split Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SplitDose#validateSplitDoseSplitDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Split Dose Split Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SplitDose#validateSplitDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Split Dose Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SplitDoseTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSplitDoseSplitDosingSubstanceAdministration() {
		OperationsTestCase<SplitDose> validateSplitDoseSplitDosingSubstanceAdministrationTestCase = new OperationsTestCase<SplitDose>(
			"validateSplitDoseSplitDosingSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SplitDose target) {
				target.init();
			}

			@Override
			protected void updateToPass(SplitDose target) {

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SplitDoseOperations.validateSplitDoseSplitDosingSubstanceAdministration(
					(SplitDose) objectToTest, diagnostician, map);
			}

		};

		validateSplitDoseSplitDosingSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSplitDoseTemplateId() {
		OperationsTestCase<SplitDose> validateSplitDoseTemplateIdTestCase = new OperationsTestCase<SplitDose>(
			"validateSplitDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SPLIT_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SplitDose target) {

			}

			@Override
			protected void updateToPass(SplitDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SplitDoseOperations.validateSplitDoseTemplateId((SplitDose) objectToTest, diagnostician, map);
			}

		};

		validateSplitDoseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SplitDoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SplitDose> {

		public SplitDose create() {
			return IHEFactory.eINSTANCE.createSplitDose();
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
	private static class ConstructorTestClass extends SplitDoseOperations {
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

} // SplitDoseOperations
