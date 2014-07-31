/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code as per artf3818 : Errata 384 
 *     								   Incorporate No Information Section Fixes SITE-462
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
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#getConsolProblemConcerns() <em>Get Consol Problem Concerns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#validateProblemSectionEntriesOptionalProblemConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern</em>}</li>
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
	public void testGetConsolProblemConcerns() {

		ProblemSection target = objectFactory.create();
		target.getConsolProblemConcerns();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalTemplateId(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalCodeP(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCode() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection target) {

			}

			@Override
			protected void updateToPass(ProblemSection target) {
				target.init();

			}

			@Override
			protected void setDependency(ProblemSection target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalCode(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalText() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalTextTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalText(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTitle() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalTitle(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalProblemConcern() {
		OperationsTestCase<ProblemSection> validateProblemSectionEntriesOptionalProblemConcernTestCase = new OperationsTestCase<ProblemSection>(
			"validateProblemSectionEntriesOptionalProblemConcern",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProblemSection target) {
						// 1: x- has section withOUT a nullFlavor of type NI and no entry
						// empty on purpose
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProblemSection target) {
						// *2: x- has section WITH a nullFlavor of type NA and no entry (incorrect nullFlavor type to negate)
						target.init();
						target.setNullFlavor(NullFlavor.NA);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProblemSection target) {
						// 3: x- has section withOUT a nullFlavor of any type - but has an INVALID entry
						target.init();
						target.addAct(ConsolFactory.eINSTANCE.createAllergyProblemAct().init());
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProblemSection target) {
						// 1: x- has section withOUT a nullFlavor of any type - but HAS a valid entry
						target.init();
						target.addAct(ConsolFactory.eINSTANCE.createProblemConcernAct().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProblemSection target) {
						// *2: x- has section WITH a nullFlavor of type NI and no entry (the correct type to negate)
						target.init();
						target.setNullFlavor(NullFlavor.NI);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProblemSection target) {
						// 3: x- has section WITH a nullFlavor of type NI and has a valid entry
						target.init();
						target.setNullFlavor(NullFlavor.NI);
						target.addAct(ConsolFactory.eINSTANCE.createProblemConcernAct().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProblemSection target) {
						// 4: x- has section WITH a nullFlavor of type NI and has an INVALID entry
						target.init();
						target.setNullFlavor(NullFlavor.NI);
						target.addAct(ConsolFactory.eINSTANCE.createAllergyProblemAct().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionOperations.validateProblemSectionEntriesOptionalProblemConcern(
					(ProblemSection) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalProblemConcernTestCase.doValidationTest();
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
			return ConsolFactory.eINSTANCE.createProblemSection();
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

} // ProblemSectionOperations
