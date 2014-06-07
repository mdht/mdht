/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryMechanismOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Mechanism</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism#validateInjuryMechanismValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mechanism Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InjuryMechanismTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryMechanismTemplateId() {
		OperationsTestCase<InjuryMechanism> validateInjuryMechanismTemplateIdTestCase = new OperationsTestCase<InjuryMechanism>(
			"validateInjuryMechanismTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_MECHANISM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryMechanism target) {

			}

			@Override
			protected void updateToPass(InjuryMechanism target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryMechanismOperations.validateInjuryMechanismTemplateId(
					(InjuryMechanism) objectToTest, diagnostician, map);
			}

		};

		validateInjuryMechanismTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryMechanismMoodCode() {
		OperationsTestCase<InjuryMechanism> validateInjuryMechanismMoodCodeTestCase = new OperationsTestCase<InjuryMechanism>(
			"validateInjuryMechanismMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_MECHANISM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryMechanism target) {

			}

			@Override
			protected void updateToPass(InjuryMechanism target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryMechanismOperations.validateInjuryMechanismMoodCode(
					(InjuryMechanism) objectToTest, diagnostician, map);
			}

		};

		validateInjuryMechanismMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryMechanismCode() {
		OperationsTestCase<InjuryMechanism> validateInjuryMechanismCodeTestCase = new OperationsTestCase<InjuryMechanism>(
			"validateInjuryMechanismCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_MECHANISM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryMechanism target) {

			}

			@Override
			protected void updateToPass(InjuryMechanism target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryMechanismOperations.validateInjuryMechanismCode(
					(InjuryMechanism) objectToTest, diagnostician, map);
			}

		};

		validateInjuryMechanismCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryMechanismValue() {
		OperationsTestCase<InjuryMechanism> validateInjuryMechanismValueTestCase = new OperationsTestCase<InjuryMechanism>(
			"validateInjuryMechanismValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_MECHANISM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryMechanism target) {

			}

			@Override
			protected void updateToPass(InjuryMechanism target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryMechanismOperations.validateInjuryMechanismValue(
					(InjuryMechanism) objectToTest, diagnostician, map);
			}

		};

		validateInjuryMechanismValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InjuryMechanismOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InjuryMechanism> {
		public InjuryMechanism create() {
			return EmspcrFactory.eINSTANCE.createInjuryMechanism();
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
	private static class ConstructorTestClass extends InjuryMechanismOperations {
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

} // InjuryMechanismOperations
