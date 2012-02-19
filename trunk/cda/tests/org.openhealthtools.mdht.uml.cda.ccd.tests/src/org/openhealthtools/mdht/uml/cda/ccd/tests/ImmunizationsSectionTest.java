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
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Immunizations Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionHasMedicationOrSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Has Medication Or Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#validateImmunizationsSectionSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection#getSupplyActivities() <em>Get Supply Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationsSectionHasMedicationOrSupplyActivity() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionHasMedicationOrSupplyActivityTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionHasMedicationOrSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {

				target.addSubstanceAdministration(CCDFactory.eINSTANCE.createMedicationActivity().init());
				target.addSupply(CCDFactory.eINSTANCE.createSupplyActivity().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionHasMedicationOrSupplyActivity(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionHasMedicationOrSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionTemplateId() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionTemplateIdTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationsSectionOperations.validateImmunizationsSectionTemplateId(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionTemplateIdTestCase.doValidationTest();
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
	public void testValidateImmunizationsSectionMedicationActivity() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionMedicationActivityTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {

				target.addSubstanceAdministration(CCDFactory.eINSTANCE.createMedicationActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionMedicationActivity(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationsSectionSupplyActivity() {
		OperationsTestCase<ImmunizationsSection> validateImmunizationsSectionSupplyActivityTestCase = new OperationsTestCase<ImmunizationsSection>(
			"validateImmunizationsSectionSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.addSupply(CCDFactory.eINSTANCE.createSupplyActivity().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionOperations.validateImmunizationsSectionSupplyActivity(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ImmunizationsSection target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSupplyActivities() {

		ImmunizationsSection target = objectFactory.create();
		target.getSupplyActivities();

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
			return CCDFactory.eINSTANCE.createImmunizationsSection();
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

} // ImmunizationsSectionOperations
