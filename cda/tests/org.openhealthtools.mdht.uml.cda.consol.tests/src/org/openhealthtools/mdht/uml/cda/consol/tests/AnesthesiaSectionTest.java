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
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AnesthesiaSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Anesthesia Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#getProcedureActivityProcedures() <em>Get Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AnesthesiaSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionTemplateId() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionTemplateIdTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionTemplateId(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCode() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionCodeTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionCode(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCodeP() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionCodePTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionCodeP(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionText() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionTextTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionText(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionTitle() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionTitleTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionTitle(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAnesthesiaSectionProcedureActivityProcedure() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionProcedureActivityProcedureTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionProcedureActivityProcedure(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAnesthesiaSectionMedicationActivity() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionMedicationActivityTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionMedicationActivity(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedures() {

		AnesthesiaSection target = objectFactory.create();
		target.getProcedureActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		AnesthesiaSection target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AnesthesiaSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnesthesiaSection> {
		public AnesthesiaSection create() {
			return ConsolFactory.eINSTANCE.createAnesthesiaSection();
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
	private static class ConstructorTestClass extends AnesthesiaSectionOperations {
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

} // AnesthesiaSectionOperations
