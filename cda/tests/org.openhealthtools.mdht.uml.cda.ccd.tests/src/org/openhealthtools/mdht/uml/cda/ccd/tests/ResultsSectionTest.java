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
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Results Section</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#validateResultsSectionTitleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Title Value</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#validateResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#validateResultsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Title</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#validateResultsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Text</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#validateResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Result Organizer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection#getResultOrganizers()
 * <em>Get Result Organizers</em>}</li>
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
	public void testValidateResultsSectionTitleValue() {
		OperationsTestCase<ResultsSection> validateResultsSectionTitleValueTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionTitleValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TITLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSection target) {

			}

			@Override
			protected void updateToPass(ResultsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("results");

				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionOperations.validateResultsSectionTitleValue(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionTitleValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultsSectionTemplateId() {
		OperationsTestCase<ResultsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ResultsSectionOperations.validateResultsSectionTemplateId(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultsSectionCode() {
		OperationsTestCase<ResultsSection> validateResultsSectionCodeTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ResultsSectionOperations.validateResultsSectionCode(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultsSectionTitle() {
		OperationsTestCase<ResultsSection> validateResultsSectionTitleTestCase = new OperationsTestCase<ResultsSection>(
			"validateResultsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ResultsSectionOperations.validateResultsSectionTitle(
					(ResultsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionTitleTestCase.doValidationTest();
	}

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
				target.addOrganizer(CCDFactory.eINSTANCE.createResultOrganizer());
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
	public void testGetResultOrganizers() {

		ResultsSection target = objectFactory.create();
		target.getResultOrganizers();

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
			return CCDFactory.eINSTANCE.createResultsSection();
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

} // ResultsSectionOperations
