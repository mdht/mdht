/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureContext;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureContextOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Context</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureContext#validateProcedureContextEffectiveTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Context Effective Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureContext#validateProcedureContextTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Context Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureContext#validateProcedureContextCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Context Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureContext#validateProcedureContextEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Context Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureContextTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureContextEffectiveTimeValue() {
		OperationsTestCase<ProcedureContext> validateProcedureContextEffectiveTimeValueTestCase = new OperationsTestCase<ProcedureContext>(
			"validateProcedureContextEffectiveTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_CONTEXT_EFFECTIVE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureContext target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(ProcedureContext target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("test"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureContextOperations.validateProcedureContextEffectiveTimeValue(
					(ProcedureContext) objectToTest, diagnostician, map);
			}

		};

		validateProcedureContextEffectiveTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureContextTemplateId() {
		OperationsTestCase<ProcedureContext> validateProcedureContextTemplateIdTestCase = new OperationsTestCase<ProcedureContext>(
			"validateProcedureContextTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureContext target) {

			}

			@Override
			protected void updateToPass(ProcedureContext target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureContextOperations.validateProcedureContextTemplateId(
					(ProcedureContext) objectToTest, diagnostician, map);
			}

		};

		validateProcedureContextTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureContextCode() {
		OperationsTestCase<ProcedureContext> validateProcedureContextCodeTestCase = new OperationsTestCase<ProcedureContext>(
			"validateProcedureContextCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureContext target) {

			}

			@Override
			protected void updateToPass(ProcedureContext target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureContextOperations.validateProcedureContextCode(
					(ProcedureContext) objectToTest, diagnostician, map);
			}

		};

		validateProcedureContextCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureContextEffectiveTime() {
		OperationsTestCase<ProcedureContext> validateProcedureContextEffectiveTimeTestCase = new OperationsTestCase<ProcedureContext>(
			"validateProcedureContextEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_CONTEXT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureContext target) {

			}

			@Override
			protected void updateToPass(ProcedureContext target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureContextOperations.validateProcedureContextEffectiveTime(
					(ProcedureContext) objectToTest, diagnostician, map);
			}

		};

		validateProcedureContextEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureContextOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureContext> {
		public ProcedureContext create() {
			return ConsolFactory.eINSTANCE.createProcedureContext();
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
	private static class ConstructorTestClass extends ProcedureContextOperations {
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

} // ProcedureContextOperations
