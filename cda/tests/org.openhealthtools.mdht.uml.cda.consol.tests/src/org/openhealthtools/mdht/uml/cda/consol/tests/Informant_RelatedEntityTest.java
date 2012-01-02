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
import org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Informant_RelatedEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Informant Related Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity#validateRelatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity#validateRelatedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Informant_RelatedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRelatedEntityAddr() {
		OperationsTestCase<Informant_RelatedEntity> validateRelatedEntityAddrTestCase = new OperationsTestCase<Informant_RelatedEntity>(
			"validateRelatedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Informant_RelatedEntity target) {

			}

			@Override
			protected void updateToPass(Informant_RelatedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Informant_RelatedEntityOperations.validateRelatedEntityAddr(
					(Informant_RelatedEntity) objectToTest, diagnostician, map);
			}

		};

		validateRelatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRelatedEntityPerson() {
		OperationsTestCase<Informant_RelatedEntity> validateRelatedEntityPersonTestCase = new OperationsTestCase<Informant_RelatedEntity>(
			"validateRelatedEntityPerson",
			operationsForOCL.getOCLValue("VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Informant_RelatedEntity target) {

			}

			@Override
			protected void updateToPass(Informant_RelatedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Informant_RelatedEntityOperations.validateRelatedEntityPerson(
					(Informant_RelatedEntity) objectToTest, diagnostician, map);
			}

		};

		validateRelatedEntityPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Informant_RelatedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Informant_RelatedEntity> {
		public Informant_RelatedEntity create() {
			return ConsolFactory.eINSTANCE.createInformant_RelatedEntity();
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
	private static class ConstructorTestClass extends Informant_RelatedEntityOperations {
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

} // Informant_RelatedEntityOperations
