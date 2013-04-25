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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.ComplicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#validateComplicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#validateComplicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#validateComplicationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#validateComplicationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#validateComplicationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#validateComplicationsSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionTemplateId() {
		OperationsTestCase<ComplicationsSection> validateComplicationsSectionTemplateIdTestCase = new OperationsTestCase<ComplicationsSection>(
			"validateComplicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSectionOperations.validateComplicationsSectionTemplateId(
					(ComplicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionCode() {
		OperationsTestCase<ComplicationsSection> validateComplicationsSectionCodeTestCase = new OperationsTestCase<ComplicationsSection>(
			"validateComplicationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSectionOperations.validateComplicationsSectionCode(
					(ComplicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionCodeP() {
		OperationsTestCase<ComplicationsSection> validateComplicationsSectionCodePTestCase = new OperationsTestCase<ComplicationsSection>(
			"validateComplicationsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSectionOperations.validateComplicationsSectionCodeP(
					(ComplicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionTitle() {
		OperationsTestCase<ComplicationsSection> validateComplicationsSectionTitleTestCase = new OperationsTestCase<ComplicationsSection>(
			"validateComplicationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSectionOperations.validateComplicationsSectionTitle(
					(ComplicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionText() {
		OperationsTestCase<ComplicationsSection> validateComplicationsSectionTextTestCase = new OperationsTestCase<ComplicationsSection>(
			"validateComplicationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSectionOperations.validateComplicationsSectionText(
					(ComplicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateComplicationsSectionProblemObservation() {
		OperationsTestCase<ComplicationsSection> validateComplicationsSectionProblemObservationTestCase = new OperationsTestCase<ComplicationsSection>(
			"validateComplicationsSectionProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSectionOperations.validateComplicationsSectionProblemObservation(
					(ComplicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		ComplicationsSection target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ComplicationsSection> {
		public ComplicationsSection create() {
			return ConsolFactory.eINSTANCE.createComplicationsSection();
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
	private static class ConstructorTestClass extends ComplicationsSectionOperations {
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

} // ComplicationsSectionOperations
