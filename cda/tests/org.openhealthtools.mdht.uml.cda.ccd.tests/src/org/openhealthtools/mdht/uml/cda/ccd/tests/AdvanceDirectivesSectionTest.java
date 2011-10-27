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
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectivesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Advance Directives Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection#validateAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection#validateAdvanceDirectivesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection#validateAdvanceDirectivesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection#validateAdvanceDirectivesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection#validateAdvanceDirectivesSectionAdvanceDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Advance Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection#getAdvanceDirectiveObservations() <em>Get Advance Directive Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectivesSectionTemplateId() {
		OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionTemplateId(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectivesSectionCode() {
		OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionCodeTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionCode(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectivesSectionTitle() {
		OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionTitleTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionTitle(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionText() {
		OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionTextTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionText(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAdvanceDirectivesSectionAdvanceDirectiveObservation() {
		OperationsTestCase<AdvanceDirectivesSection> validateAdvanceDirectivesSectionAdvanceDirectiveObservationTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateAdvanceDirectivesSectionAdvanceDirectiveObservation",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createAdvanceDirectiveObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionAdvanceDirectiveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveObservations() {

		AdvanceDirectivesSection target = objectFactory.create();
		target.getAdvanceDirectiveObservations();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AdvanceDirectivesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection> {
		public AdvanceDirectivesSection create() {
			return CCDFactory.eINSTANCE.createAdvanceDirectivesSection();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSectionOperations {
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

} // AdvanceDirectivesSectionOperations
