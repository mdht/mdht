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
import org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ThoraxLungsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Thorax Lungs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection#validateThoraxLungsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thorax Lungs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection#validateThoraxLungsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thorax Lungs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection#validateThoraxLungsSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thorax Lungs Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ThoraxLungsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThoraxLungsSectionTemplateId() {
		OperationsTestCase<ThoraxLungsSection> validateThoraxLungsSectionTemplateIdTestCase = new OperationsTestCase<ThoraxLungsSection>(
			"validateThoraxLungsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_THORAX_LUNGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThoraxLungsSection target) {

			}

			@Override
			protected void updateToPass(ThoraxLungsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThoraxLungsSectionOperations.validateThoraxLungsSectionTemplateId(
					(ThoraxLungsSection) objectToTest, diagnostician, map);
			}

		};

		validateThoraxLungsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThoraxLungsSectionCode() {
		OperationsTestCase<ThoraxLungsSection> validateThoraxLungsSectionCodeTestCase = new OperationsTestCase<ThoraxLungsSection>(
			"validateThoraxLungsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_THORAX_LUNGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThoraxLungsSection target) {

			}

			@Override
			protected void updateToPass(ThoraxLungsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThoraxLungsSectionOperations.validateThoraxLungsSectionCode(
					(ThoraxLungsSection) objectToTest, diagnostician, map);
			}

		};

		validateThoraxLungsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateThoraxLungsSectionProblemEntry() {
		OperationsTestCase<ThoraxLungsSection> validateThoraxLungsSectionProblemEntryTestCase = new OperationsTestCase<ThoraxLungsSection>(
			"validateThoraxLungsSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_THORAX_LUNGS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThoraxLungsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ThoraxLungsSection target) {

				target.addObservation(IHEFactory.eINSTANCE.createProblemEntry().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThoraxLungsSectionOperations.validateThoraxLungsSectionProblemEntry(
					(ThoraxLungsSection) objectToTest, diagnostician, map);
			}

		};

		validateThoraxLungsSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		ThoraxLungsSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ThoraxLungsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ThoraxLungsSection> {
		public ThoraxLungsSection create() {
			return IHEFactory.eINSTANCE.createThoraxLungsSection();
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
	private static class ConstructorTestClass extends ThoraxLungsSectionOperations {
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

} // ThoraxLungsSectionOperations
