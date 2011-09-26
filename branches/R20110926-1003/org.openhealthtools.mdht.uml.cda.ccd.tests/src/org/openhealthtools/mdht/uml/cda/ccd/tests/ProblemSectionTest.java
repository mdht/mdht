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
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Problem Section</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionTitleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Problem Section Title Value</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Problem Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Problem Section Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Problem Section Title</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Problem Section Text</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#validateProblemSectionProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Problem Section Problem Act</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection#getProblemActs()
 * <em>Get Problem Acts</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ProblemSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemSectionTemplateId() {
		OperationsTestCase<ProblemSection> validateProblemSectionTemplateIdTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionTemplateId(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemSectionCode() {
		OperationsTestCase<ProblemSection> validateProblemSectionCodeTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionCode(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemSectionTitle() {
		OperationsTestCase<ProblemSection> validateProblemSectionTitleTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionTitle(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemSectionText() {
		OperationsTestCase<ProblemSection> validateProblemSectionTextTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionText(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProblemSectionProblemAct() {
		OperationsTestCase<ProblemSection> validateProblemSectionProblemActTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();
				target.addAct(CCDFactory.eINSTANCE.createProblemAct());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionProblemAct(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemActs() {

		ProblemSection target = objectFactory.create();
		target.getProblemActs();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProblemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemSection> {
		public ProblemSection create() {
			return CCDFactory.eINSTANCE.createProblemSection();
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
	private static class ConstructorTestClass extends ProblemSectionOperations {
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

} // ProblemSectionOperations
