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
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MassCasualtyIndicatorOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mass Casualty Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator#validateMassCasualtyIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Casualty Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MassCasualtyIndicatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMassCasualtyIndicatorTemplateId() {
		OperationsTestCase<MassCasualtyIndicator> validateMassCasualtyIndicatorTemplateIdTestCase = new OperationsTestCase<MassCasualtyIndicator>(
			"validateMassCasualtyIndicatorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MASS_CASUALTY_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MassCasualtyIndicator target) {

			}

			@Override
			protected void updateToPass(MassCasualtyIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorTemplateId(
					(MassCasualtyIndicator) objectToTest, diagnostician, map);
			}

		};

		validateMassCasualtyIndicatorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMassCasualtyIndicatorMoodCode() {
		OperationsTestCase<MassCasualtyIndicator> validateMassCasualtyIndicatorMoodCodeTestCase = new OperationsTestCase<MassCasualtyIndicator>(
			"validateMassCasualtyIndicatorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MASS_CASUALTY_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MassCasualtyIndicator target) {

			}

			@Override
			protected void updateToPass(MassCasualtyIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorMoodCode(
					(MassCasualtyIndicator) objectToTest, diagnostician, map);
			}

		};

		validateMassCasualtyIndicatorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMassCasualtyIndicatorCodeP() {
		OperationsTestCase<MassCasualtyIndicator> validateMassCasualtyIndicatorCodePTestCase = new OperationsTestCase<MassCasualtyIndicator>(
			"validateMassCasualtyIndicatorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MASS_CASUALTY_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MassCasualtyIndicator target) {

			}

			@Override
			protected void updateToPass(MassCasualtyIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorCodeP(
					(MassCasualtyIndicator) objectToTest, diagnostician, map);
			}

		};

		validateMassCasualtyIndicatorCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMassCasualtyIndicatorCode() {
		OperationsTestCase<MassCasualtyIndicator> validateMassCasualtyIndicatorCodeTestCase = new OperationsTestCase<MassCasualtyIndicator>(
			"validateMassCasualtyIndicatorCode",
			operationsForOCL.getOCLValue("VALIDATE_MASS_CASUALTY_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MassCasualtyIndicator target) {

			}

			@Override
			protected void updateToPass(MassCasualtyIndicator target) {
				target.init();

			}

			@Override
			protected void setDependency(MassCasualtyIndicator target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicatorCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorCode(
					(MassCasualtyIndicator) objectToTest, diagnostician, map);
			}

		};

		validateMassCasualtyIndicatorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMassCasualtyIndicatorValue() {
		OperationsTestCase<MassCasualtyIndicator> validateMassCasualtyIndicatorValueTestCase = new OperationsTestCase<MassCasualtyIndicator>(
			"validateMassCasualtyIndicatorValue",
			operationsForOCL.getOCLValue("VALIDATE_MASS_CASUALTY_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MassCasualtyIndicator target) {

			}

			@Override
			protected void updateToPass(MassCasualtyIndicator target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorValue(
					(MassCasualtyIndicator) objectToTest, diagnostician, map);
			}

		};

		validateMassCasualtyIndicatorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MassCasualtyIndicatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MassCasualtyIndicator> {
		public MassCasualtyIndicator create() {
			return EmspcrFactory.eINSTANCE.createMassCasualtyIndicator();
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
	private static class ConstructorTestClass extends MassCasualtyIndicatorOperations {
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

} // MassCasualtyIndicatorOperations
