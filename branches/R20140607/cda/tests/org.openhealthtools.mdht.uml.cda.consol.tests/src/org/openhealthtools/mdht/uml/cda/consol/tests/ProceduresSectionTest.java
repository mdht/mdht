/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *	   Dan Brown (Audacious Inquiry) - additional testing code
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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getConsolProcedureActivityProcedures() <em>Get Consol Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getProcedureActivityObservations() <em>Get Procedure Activity Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getConsolProcedureActivityActs() <em>Get Consol Procedure Activity Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Text</em>}</li>
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
				// empty
			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				// test 1 has ProcedureActivityProcedure
				target.init();
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ProceduresSection target) {
						// test 1 has no entries and has no nullFlavor set to NI
						target.init();
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ProceduresSection target) {
						// test 2 has none of the required entries but the section has nullFlavor set to UNK
						// currently UNK is not an acceptable nullFlavor to negate entry requirements
						target.setNullFlavor(NullFlavor.ASKU);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						// test 2 has procedureActivityObservation
						target.init();
						target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation().init());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						// test 3 has procedureActivityAct
						target.init();
						target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct().init());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						// test 4 has all three
						target.init();
						target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());
						target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation().init());
						target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct().init());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						// ***test 5 has none of the required entries but the section has nullFlavor set to NI
						target.init();
						target.setNullFlavor(NullFlavor.NI);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProceduresSection target) {
						// test 6 has one of the required entries and the section has nullFlavor set to NI
						target.init();
						target.setNullFlavor(NullFlavor.NI);
						target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());
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
	* @generated NOT
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

				ST title = DatatypesFactory.eINSTANCE.createST("Procedures");
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
	* @generated not
	*/
	@Test
	public void testValidateProceduresSectionProcedureActivityProcedure() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionProcedureActivityProcedureTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionProcedureActivityProcedure(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProceduresSectionProcedureActivityObservation() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionProcedureActivityObservationTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionProcedureActivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionProcedureActivityObservation(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionProcedureActivityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProceduresSectionProcedureActivityAct() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionProcedureActivityActTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionProcedureActivityAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionProcedureActivityAct(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionProcedureActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityProcedures() {

		ProceduresSection target = objectFactory.create();
		target.getConsolProcedureActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityObservations() {

		ProceduresSection target = objectFactory.create();
		target.getProcedureActivityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityActs() {

		ProceduresSection target = objectFactory.create();
		target.getConsolProcedureActivityActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCode() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

			}

			@Override
			protected void setDependency(ProceduresSection target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalText() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionEntriesOptionalTextTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalText(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTextTestCase.doValidationTest();
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
			return ConsolFactory.eINSTANCE.createProceduresSection();
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

} // ProceduresSectionOperations
