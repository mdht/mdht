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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#getImmunizations() <em>Get Immunizations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionCodeP() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionCodePTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionCodeP(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionCode() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionCodeTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

			}

			@Override
			protected void setDependency(ImmunizationsSection target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionCode(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionTitle() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionTitleTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionTitle(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionText() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionTextTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionText(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationsSectionImmunization() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionImmunizationTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

				ImmunizationActivity immunizationActivity = ConsolFactory.eINSTANCE.createImmunizationActivity().init();

				target.addSubstanceAdministration(immunizationActivity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionImmunization(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizations() {

		ImmunizationsSection target = objectFactory.create();
		target.getImmunizations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionEntriesOptionalTemplateId(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationsSection> {
		public ImmunizationsSection create() {
			return ConsolFactory.eINSTANCE.createImmunizationsSection();
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
	private static class ConstructorTestClass extends ImmunizationsSectionOperations {
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

} // ImmunizationsSectionOperations
