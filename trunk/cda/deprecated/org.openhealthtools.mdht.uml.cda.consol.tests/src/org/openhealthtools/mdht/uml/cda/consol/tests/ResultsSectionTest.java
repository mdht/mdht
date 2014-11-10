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
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#getConsolResultOrganizers() <em>Get Consol Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionText() {
		OperationsTestCase<ResultsSection> validateResultsSectionTextTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionText(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultsSectionResultOrganizer() {
		OperationsTestCase<ResultsSection> validateResultsSectionResultOrganizerTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();
				ResultOrganizer org = ConsolFactory.eINSTANCE.createResultOrganizer().init();
				target.addOrganizer(org);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionResultOrganizer(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionResultOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolResultOrganizers() {

		ResultsSection target = objectFactory.create();
		target.getConsolResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ResultsSection> validateResultsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionEntriesOptionalTemplateId(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalCodeP() {
		OperationsTestCase<ResultsSection> validateResultsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionEntriesOptionalCodeP(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalCode() {
		OperationsTestCase<ResultsSection> validateResultsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

			}

			@Override
			protected void setDependency(ResultsSection target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionEntriesOptionalCode(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalTitle() {
		OperationsTestCase<ResultsSection> validateResultsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionEntriesOptionalTitle(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultsSection> {
		public ResultsSection create() {
			return ConsolFactory.eINSTANCE.createResultsSection();
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
	private static class ConstructorTestClass extends ResultsSectionOperations {
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

} // ResultsSectionOperations
