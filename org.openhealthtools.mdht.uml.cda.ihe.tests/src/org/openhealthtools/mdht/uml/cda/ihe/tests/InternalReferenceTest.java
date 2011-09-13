/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.operations.InternalReferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Internal Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.InternalReference#validateInternalReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.InternalReference#validateInternalReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.InternalReference#validateInternalReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InternalReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInternalReferenceTemplateId() {
		OperationsTestCase<InternalReference> validateInternalReferenceTemplateIdTestCase = new OperationsTestCase<InternalReference>(
			"validateInternalReferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {

			}

			@Override
			protected void updateToPass(InternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InternalReferenceOperations.validateInternalReferenceTemplateId(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		validateInternalReferenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInternalReferenceCode() {
		OperationsTestCase<InternalReference> validateInternalReferenceCodeTestCase = new OperationsTestCase<InternalReference>(
			"validateInternalReferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(InternalReference target) {
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InternalReferenceOperations.validateInternalReferenceCode(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		validateInternalReferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInternalReferenceId() {
		OperationsTestCase<InternalReference> validateInternalReferenceIdTestCase = new OperationsTestCase<InternalReference>(
			"validateInternalReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {
				target.init();
			}

			@Override
			protected void updateToPass(InternalReference target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InternalReferenceOperations.validateInternalReferenceId(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		validateInternalReferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InternalReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InternalReference> {

		public InternalReference create() {
			return IHEFactory.eINSTANCE.createInternalReference();
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
	private static class ConstructorTestClass extends InternalReferenceOperations {
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

} // InternalReferenceOperations
