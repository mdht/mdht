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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TransportDelayOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transport Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay#validateTransportDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay#validateTransportDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay#validateTransportDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay#validateTransportDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay#validateTransportDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay#validateTransportDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Delay Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransportDelayTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportDelayTemplateId() {
		OperationsTestCase<TransportDelay> validateTransportDelayTemplateIdTestCase = new OperationsTestCase<TransportDelay>(
			"validateTransportDelayTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportDelay target) {

			}

			@Override
			protected void updateToPass(TransportDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportDelayOperations.validateTransportDelayTemplateId(
					(TransportDelay) objectToTest, diagnostician, map);
			}

		};

		validateTransportDelayTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportDelayMoodCode() {
		OperationsTestCase<TransportDelay> validateTransportDelayMoodCodeTestCase = new OperationsTestCase<TransportDelay>(
			"validateTransportDelayMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportDelay target) {

			}

			@Override
			protected void updateToPass(TransportDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportDelayOperations.validateTransportDelayMoodCode(
					(TransportDelay) objectToTest, diagnostician, map);
			}

		};

		validateTransportDelayMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportDelayCodeP() {
		OperationsTestCase<TransportDelay> validateTransportDelayCodePTestCase = new OperationsTestCase<TransportDelay>(
			"validateTransportDelayCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportDelay target) {

			}

			@Override
			protected void updateToPass(TransportDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportDelayOperations.validateTransportDelayCodeP(
					(TransportDelay) objectToTest, diagnostician, map);
			}

		};

		validateTransportDelayCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportDelayCode() {
		OperationsTestCase<TransportDelay> validateTransportDelayCodeTestCase = new OperationsTestCase<TransportDelay>(
			"validateTransportDelayCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportDelay target) {

			}

			@Override
			protected void updateToPass(TransportDelay target) {
				target.init();

			}

			@Override
			protected void setDependency(TransportDelay target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.TransportDelayCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportDelayOperations.validateTransportDelayCode(
					(TransportDelay) objectToTest, diagnostician, map);
			}

		};

		validateTransportDelayCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportDelayValue() {
		OperationsTestCase<TransportDelay> validateTransportDelayValueTestCase = new OperationsTestCase<TransportDelay>(
			"validateTransportDelayValue",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportDelay target) {

			}

			@Override
			protected void updateToPass(TransportDelay target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportDelayOperations.validateTransportDelayValue(
					(TransportDelay) objectToTest, diagnostician, map);
			}

		};

		validateTransportDelayValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportDelayValueP() {
		OperationsTestCase<TransportDelay> validateTransportDelayValuePTestCase = new OperationsTestCase<TransportDelay>(
			"validateTransportDelayValueP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportDelay target) {

			}

			@Override
			protected void updateToPass(TransportDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportDelayOperations.validateTransportDelayValueP(
					(TransportDelay) objectToTest, diagnostician, map);
			}

		};

		validateTransportDelayValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TransportDelayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransportDelay> {
		public TransportDelay create() {
			return EmspcrFactory.eINSTANCE.createTransportDelay();
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
	private static class ConstructorTestClass extends TransportDelayOperations {
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

} // TransportDelayOperations
