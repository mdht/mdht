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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.SurgicalDrainsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Surgical Drains Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection#validateSurgicalDrainsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgical Drains Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SurgicalDrainsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSurgicalDrainsSectionTemplateId() {
		OperationsTestCase<SurgicalDrainsSection> validateSurgicalDrainsSectionTemplateIdTestCase = new OperationsTestCase<SurgicalDrainsSection>(
			"validateSurgicalDrainsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SURGICAL_DRAINS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SurgicalDrainsSection target) {

			}

			@Override
			protected void updateToPass(SurgicalDrainsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SurgicalDrainsSectionOperations.validateSurgicalDrainsSectionTemplateId(
					(SurgicalDrainsSection) objectToTest, diagnostician, map);
			}

		};

		validateSurgicalDrainsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSurgicalDrainsSectionCode() {
		OperationsTestCase<SurgicalDrainsSection> validateSurgicalDrainsSectionCodeTestCase = new OperationsTestCase<SurgicalDrainsSection>(
			"validateSurgicalDrainsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SURGICAL_DRAINS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SurgicalDrainsSection target) {

			}

			@Override
			protected void updateToPass(SurgicalDrainsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SurgicalDrainsSectionOperations.validateSurgicalDrainsSectionCode(
					(SurgicalDrainsSection) objectToTest, diagnostician, map);
			}

		};

		validateSurgicalDrainsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSurgicalDrainsSectionCodeP() {
		OperationsTestCase<SurgicalDrainsSection> validateSurgicalDrainsSectionCodePTestCase = new OperationsTestCase<SurgicalDrainsSection>(
			"validateSurgicalDrainsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SURGICAL_DRAINS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SurgicalDrainsSection target) {

			}

			@Override
			protected void updateToPass(SurgicalDrainsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SurgicalDrainsSectionOperations.validateSurgicalDrainsSectionCodeP(
					(SurgicalDrainsSection) objectToTest, diagnostician, map);
			}

		};

		validateSurgicalDrainsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSurgicalDrainsSectionText() {
		OperationsTestCase<SurgicalDrainsSection> validateSurgicalDrainsSectionTextTestCase = new OperationsTestCase<SurgicalDrainsSection>(
			"validateSurgicalDrainsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_SURGICAL_DRAINS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SurgicalDrainsSection target) {

			}

			@Override
			protected void updateToPass(SurgicalDrainsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SurgicalDrainsSectionOperations.validateSurgicalDrainsSectionText(
					(SurgicalDrainsSection) objectToTest, diagnostician, map);
			}

		};

		validateSurgicalDrainsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSurgicalDrainsSectionTitle() {
		OperationsTestCase<SurgicalDrainsSection> validateSurgicalDrainsSectionTitleTestCase = new OperationsTestCase<SurgicalDrainsSection>(
			"validateSurgicalDrainsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SURGICAL_DRAINS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SurgicalDrainsSection target) {

			}

			@Override
			protected void updateToPass(SurgicalDrainsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SurgicalDrainsSectionOperations.validateSurgicalDrainsSectionTitle(
					(SurgicalDrainsSection) objectToTest, diagnostician, map);
			}

		};

		validateSurgicalDrainsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SurgicalDrainsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SurgicalDrainsSection> {
		public SurgicalDrainsSection create() {
			return ConsolFactory.eINSTANCE.createSurgicalDrainsSection();
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
	private static class ConstructorTestClass extends SurgicalDrainsSectionOperations {
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

} // SurgicalDrainsSectionOperations
