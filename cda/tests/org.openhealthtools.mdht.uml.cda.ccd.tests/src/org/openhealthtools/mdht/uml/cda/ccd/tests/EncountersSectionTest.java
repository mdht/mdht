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
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounters Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTitleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionEncountersActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#getEncountersActivities() <em>Get Encounters Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionTitleValue() {
		OperationsTestCase<EncountersSection> validateEncountersSectionTitleValueTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionTitleValue",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TITLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("encounters");

				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionTitleValue(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTitleValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersSectionTemplateId() {
		OperationsTestCase<EncountersSection> validateEncountersSectionTemplateIdTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionTemplateId(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersSectionCode() {
		OperationsTestCase<EncountersSection> validateEncountersSectionCodeTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionCode(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersSectionTitle() {
		OperationsTestCase<EncountersSection> validateEncountersSectionTitleTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionTitle(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionText() {
		OperationsTestCase<EncountersSection> validateEncountersSectionTextTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionText(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersSectionEncountersActivity() {
		OperationsTestCase<EncountersSection> validateEncountersSectionEncountersActivityTestCase = new OperationsTestCase<EncountersSection>(
			"validateEncountersSectionEncountersActivity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();
				target.addEncounter(CCDFactory.eINSTANCE.createEncountersActivity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations.validateEncountersSectionEncountersActivity(
					(EncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEncountersActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersActivities() {

		EncountersSection target = objectFactory.create();
		target.getEncountersActivities();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncountersSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersSection> {
		public EncountersSection create() {
			return CCDFactory.eINSTANCE.createEncountersSection();
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
	private static class ConstructorTestClass extends EncountersSectionOperations {
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

} // EncountersSectionOperations
