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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDose;
import org.openhealthtools.mdht.uml.cda.ihe.operations.NormalDoseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Normal Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.NormalDose#validateNormalDoseNoSubordinateSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Normal Dose No Subordinate Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.NormalDose#validateNormalDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Normal Dose Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NormalDoseTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNormalDoseNoSubordinateSubstanceAdministration() {
		OperationsTestCase<NormalDose> validateNormalDoseNoSubordinateSubstanceAdministrationTestCase = new OperationsTestCase<NormalDose>(
			"validateNormalDoseNoSubordinateSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToPass(NormalDose target) {
				// target.getSubstanceAdministrations().clear();
				target.getEntryRelationships().clear();

				// target.addObservation(CCDFactory.eINSTANCE.createMedicationStatusObservation().init());

			}

			@Override
			protected void updateToFail(NormalDose target) {
				target.init();
				target.addSubstanceAdministration(CDAFactory.eINSTANCE.createSubstanceAdministration());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NormalDoseOperations.validateNormalDoseNoSubordinateSubstanceAdministration(
					(NormalDose) objectToTest, diagnostician, map);
			}

		};

		validateNormalDoseNoSubordinateSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNormalDoseTemplateId() {
		OperationsTestCase<NormalDose> validateNormalDoseTemplateIdTestCase = new OperationsTestCase<NormalDose>(
			"validateNormalDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NORMAL_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NormalDose target) {

			}

			@Override
			protected void updateToPass(NormalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NormalDoseOperations.validateNormalDoseTemplateId((NormalDose) objectToTest, diagnostician, map);
			}

		};

		validateNormalDoseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NormalDoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NormalDose> {

		public NormalDose create() {
			return IHEFactory.eINSTANCE.createNormalDose();
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
	private static class ConstructorTestClass extends NormalDoseOperations {
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

} // NormalDoseOperations
