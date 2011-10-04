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
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VesselsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VesselsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vessels Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VesselsSection#validateVesselsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vessels Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VesselsSection#validateVesselsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vessels Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VesselsSection#validateVesselsSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vessels Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VesselsSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VesselsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVesselsSectionTemplateId() {
		OperationsTestCase<VesselsSection> validateVesselsSectionTemplateIdTestCase = new OperationsTestCase<VesselsSection>(
			"validateVesselsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VESSELS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VesselsSection target) {

			}

			@Override
			protected void updateToPass(VesselsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VesselsSectionOperations.validateVesselsSectionTemplateId(
					(VesselsSection) objectToTest, diagnostician, map);
			}

		};

		validateVesselsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVesselsSectionCode() {
		OperationsTestCase<VesselsSection> validateVesselsSectionCodeTestCase = new OperationsTestCase<VesselsSection>(
			"validateVesselsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_VESSELS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VesselsSection target) {

			}

			@Override
			protected void updateToPass(VesselsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VesselsSectionOperations.validateVesselsSectionCode(
					(VesselsSection) objectToTest, diagnostician, map);
			}

		};

		validateVesselsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVesselsSectionProblemEntry() {
		OperationsTestCase<VesselsSection> validateVesselsSectionProblemEntryTestCase = new OperationsTestCase<VesselsSection>(
			"validateVesselsSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_VESSELS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VesselsSection target) {

			}

			@Override
			protected void updateToPass(VesselsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VesselsSectionOperations.validateVesselsSectionProblemEntry(
					(VesselsSection) objectToTest, diagnostician, map);
			}

		};

		validateVesselsSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		VesselsSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VesselsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VesselsSection> {
		public VesselsSection create() {
			return IHEFactory.eINSTANCE.createVesselsSection();
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
	private static class ConstructorTestClass extends VesselsSectionOperations {
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

} // VesselsSectionOperations
