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
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.operations.TaperedDoseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tapered Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.TaperedDose#validateTaperedDoseTaperedDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Tapered Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.TaperedDose#validateTaperedDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TaperedDoseTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTaperedDoseTaperedDosingSubstanceAdministration() {
		OperationsTestCase<TaperedDose> validateTaperedDoseTaperedDosingSubstanceAdministrationTestCase = new OperationsTestCase<TaperedDose>(
			"validateTaperedDoseTaperedDosingSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TaperedDose target) {
				target.init();

			}

			@Override
			protected void updateToPass(TaperedDose target) {
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createNormalDose().init(); // CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(substanceAdministration);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TaperedDoseOperations.validateTaperedDoseTaperedDosingSubstanceAdministration(
					(TaperedDose) objectToTest, diagnostician, map);
			}

		};

		validateTaperedDoseTaperedDosingSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTaperedDoseTemplateId() {
		OperationsTestCase<TaperedDose> validateTaperedDoseTemplateIdTestCase = new OperationsTestCase<TaperedDose>(
			"validateTaperedDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TaperedDose target) {

			}

			@Override
			protected void updateToPass(TaperedDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TaperedDoseOperations.validateTaperedDoseTemplateId(
					(TaperedDose) objectToTest, diagnostician, map);
			}

		};

		validateTaperedDoseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TaperedDoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TaperedDose> {

		public TaperedDose create() {
			return IHEFactory.eINSTANCE.createTaperedDose();
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
	private static class ConstructorTestClass extends TaperedDoseOperations {
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

} // TaperedDoseOperations
