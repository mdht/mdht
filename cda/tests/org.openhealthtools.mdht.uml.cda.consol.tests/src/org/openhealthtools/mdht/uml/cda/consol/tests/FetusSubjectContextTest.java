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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext;
import org.openhealthtools.mdht.uml.cda.consol.operations.FetusSubjectContextOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetus Subject Context</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext#validateFetusSubjectContextTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext#validateFetusSubjectContextCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext#validateFetusSubjectContextSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FetusSubjectContextTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetusSubjectContextTemplateId() {
		OperationsTestCase<FetusSubjectContext> validateFetusSubjectContextTemplateIdTestCase = new OperationsTestCase<FetusSubjectContext>(
			"validateFetusSubjectContextTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetusSubjectContext target) {

			}

			@Override
			protected void updateToPass(FetusSubjectContext target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetusSubjectContextOperations.validateFetusSubjectContextTemplateId(
					(FetusSubjectContext) objectToTest, diagnostician, map);
			}

		};

		validateFetusSubjectContextTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetusSubjectContextCode() {
		OperationsTestCase<FetusSubjectContext> validateFetusSubjectContextCodeTestCase = new OperationsTestCase<FetusSubjectContext>(
			"validateFetusSubjectContextCode",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetusSubjectContext target) {

			}

			@Override
			protected void updateToPass(FetusSubjectContext target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetusSubjectContextOperations.validateFetusSubjectContextCode(
					(FetusSubjectContext) objectToTest, diagnostician, map);
			}

		};

		validateFetusSubjectContextCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFetusSubjectContextSubject() {
		OperationsTestCase<FetusSubjectContext> validateFetusSubjectContextSubjectTestCase = new OperationsTestCase<FetusSubjectContext>(
			"validateFetusSubjectContextSubject",
			operationsForOCL.getOCLValue("VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetusSubjectContext target) {
				target.init();
			}

			@Override
			protected void updateToPass(FetusSubjectContext target) {
				target.setSubject(CDAFactory.eINSTANCE.createSubjectPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetusSubjectContextOperations.validateFetusSubjectContextSubject(
					(FetusSubjectContext) objectToTest, diagnostician, map);
			}

		};

		validateFetusSubjectContextSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FetusSubjectContextOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetusSubjectContext> {
		public FetusSubjectContext create() {
			return ConsolFactory.eINSTANCE.createFetusSubjectContext();
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
	private static class ConstructorTestClass extends FetusSubjectContextOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FetusSubjectContextOperations
