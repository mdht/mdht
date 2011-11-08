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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProceduresSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedures Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#validateProceduresSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSectionTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionHasProcedureActivity() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionHasProcedureActivityTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionHasProcedureActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						target.init();

						ProcedureActivityAct paa = CCDFactory.eINSTANCE.createProcedureActivityAct().init();

						target.addAct(paa);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						target.init();

						ProcedureActivityObservation pao = CCDFactory.eINSTANCE.createProcedureActivityObservation().init();

						target.addObservation(pao);

					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionHasProcedureActivity(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionHasProcedureActivityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProceduresSectionTemplateId() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionTemplateIdTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionTemplateId(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProceduresSectionCode() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionCodeTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionCode(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProceduresSectionTitle() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionTitleTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionTitle(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProceduresSectionText() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionTextTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionText(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProceduresSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSection> {
		public ProceduresSection create() {
			return CCDFactory.eINSTANCE.createProceduresSection();
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
	private static class ConstructorTestClass extends ProceduresSectionOperations {
	}

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

} // ProceduresSectionOperations
