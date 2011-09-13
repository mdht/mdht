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
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Immunization;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ImmunizationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Immunization#validateImmunizationComments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Immunization#validateImmunizationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Immunization#validateImmunizationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Immunization#validateImmunizationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Immunization#validateImmunizationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Immunization#validateImmunizationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationComments() {
		OperationsTestCase<Immunization> validateImmunizationCommentsTestCase = new OperationsTestCase<Immunization>(
			"validateImmunizationComments",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {
				target.init();
				target.setNegationInd(true);
			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

				Comment comment = CCDFactory.eINSTANCE.createComment().init();
				target.addAct(comment);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateImmunizationComments(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationCommentsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationTemplateId() {
		OperationsTestCase<Immunization> validateImmunizationTemplateIdTestCase = new OperationsTestCase<Immunization>(
			"validateImmunizationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateImmunizationTemplateId(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationCode() {
		OperationsTestCase<Immunization> validateImmunizationCodeTestCase = new OperationsTestCase<Immunization>(
			"validateImmunizationCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateImmunizationCode((Immunization) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationStatusCode() {
		OperationsTestCase<Immunization> validateImmunizationStatusCodeTestCase = new OperationsTestCase<Immunization>(
			"validateImmunizationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateImmunizationStatusCode(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMoodCode() {
		OperationsTestCase<Immunization> validateImmunizationMoodCodeTestCase = new OperationsTestCase<Immunization>(
			"validateImmunizationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateImmunizationMoodCode(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationEffectiveTime() {
		OperationsTestCase<Immunization> validateImmunizationEffectiveTimeTestCase = new OperationsTestCase<Immunization>(
			"validateImmunizationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateImmunizationEffectiveTime(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Immunization> {

		public Immunization create() {
			return IHEFactory.eINSTANCE.createImmunization();
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
	private static class ConstructorTestClass extends ImmunizationOperations {
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

} // ImmunizationOperations
