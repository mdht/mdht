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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationRefusalReasonOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Refusal Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationRefusalReasonTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationRefusalReasonTemplateId() {
		OperationsTestCase<ImmunizationRefusalReason> validateImmunizationRefusalReasonTemplateIdTestCase = new OperationsTestCase<ImmunizationRefusalReason>(
			"validateImmunizationRefusalReasonTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationRefusalReason target) {

			}

			@Override
			protected void updateToPass(ImmunizationRefusalReason target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonTemplateId(
					(ImmunizationRefusalReason) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationRefusalReasonTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationRefusalReasonClassCode() {
		OperationsTestCase<ImmunizationRefusalReason> validateImmunizationRefusalReasonClassCodeTestCase = new OperationsTestCase<ImmunizationRefusalReason>(
			"validateImmunizationRefusalReasonClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationRefusalReason target) {

			}

			@Override
			protected void updateToPass(ImmunizationRefusalReason target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonClassCode(
					(ImmunizationRefusalReason) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationRefusalReasonClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationRefusalReasonCode() {
		OperationsTestCase<ImmunizationRefusalReason> validateImmunizationRefusalReasonCodeTestCase = new OperationsTestCase<ImmunizationRefusalReason>(
			"validateImmunizationRefusalReasonCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationRefusalReason target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationRefusalReason target) {

				CD cd = DatatypesFactory.eINSTANCE.createCD("IMMUNE", "2.16.840.1.113883.5.8", "", "");
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonCode(
					(ImmunizationRefusalReason) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationRefusalReasonCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationRefusalReasonId() {
		OperationsTestCase<ImmunizationRefusalReason> validateImmunizationRefusalReasonIdTestCase = new OperationsTestCase<ImmunizationRefusalReason>(
			"validateImmunizationRefusalReasonId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationRefusalReason target) {

			}

			@Override
			protected void updateToPass(ImmunizationRefusalReason target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonId(
					(ImmunizationRefusalReason) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationRefusalReasonIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationRefusalReasonMoodCode() {
		OperationsTestCase<ImmunizationRefusalReason> validateImmunizationRefusalReasonMoodCodeTestCase = new OperationsTestCase<ImmunizationRefusalReason>(
			"validateImmunizationRefusalReasonMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationRefusalReason target) {

			}

			@Override
			protected void updateToPass(ImmunizationRefusalReason target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonMoodCode(
					(ImmunizationRefusalReason) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationRefusalReasonMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationRefusalReasonStatusCode() {
		OperationsTestCase<ImmunizationRefusalReason> validateImmunizationRefusalReasonStatusCodeTestCase = new OperationsTestCase<ImmunizationRefusalReason>(
			"validateImmunizationRefusalReasonStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationRefusalReason target) {

			}

			@Override
			protected void updateToPass(ImmunizationRefusalReason target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonStatusCode(
					(ImmunizationRefusalReason) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationRefusalReasonStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationRefusalReasonOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationRefusalReason> {
		public ImmunizationRefusalReason create() {
			return ConsolFactory.eINSTANCE.createImmunizationRefusalReason();
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
	private static class ConstructorTestClass extends ImmunizationRefusalReasonOperations {
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

} // ImmunizationRefusalReasonOperations
