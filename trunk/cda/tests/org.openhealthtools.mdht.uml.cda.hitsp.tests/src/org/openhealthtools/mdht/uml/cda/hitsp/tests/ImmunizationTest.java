/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Rama Ramakrishnan - Added testValidateHITSPImmunizationCodedProductName
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ImmunizationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Immunization</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization#validateHITSPImmunizationRefusalReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Immunization Refusal Reason</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization#validateHITSPImmunizationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Immunization Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization#validateImmunizationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Immunization Code</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ImmunizationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPImmunizationRefusalReason() {
		OperationsTestCase<Immunization> validateHITSPImmunizationRefusalReasonTestCase = new OperationsTestCase<Immunization>(
			"validateHITSPImmunizationRefusalReason",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected void updateToPass(Immunization target) {

				for (EntryRelationship er : target.getEntryRelationships()) {
					ProblemAct pa = CCDFactory.eINSTANCE.createProblemAct();
					CD code = DatatypesFactory.eINSTANCE.createCD();
					code.setCodeSystem("2.16.840.1.113883.1.11.19717");
					pa.setCode(code);
					er.setAct(pa);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateHITSPImmunizationRefusalReason(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateHITSPImmunizationRefusalReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPImmunizationCodedProductName() {
		OperationsTestCase<Immunization> validateHITSPImmunizationCodedProductNameTestCase = new OperationsTestCase<Immunization>(
			"validateHITSPImmunizationCodedProductName",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_IMMUNIZATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {
				target.init();
				Consumable consumable = createConsumableForVaccine();
				consumable.getManufacturedProduct().getManufacturedMaterial().getCode().setCodeSystem(
					"INVALID CODESYSTEM");
				target.setConsumable(consumable);
			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();
				Consumable consumable = createConsumableForVaccine();
				target.setConsumable(consumable);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateHITSPImmunizationCodedProductName(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateHITSPImmunizationCodedProductNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPImmunizationTemplateId() {
		OperationsTestCase<Immunization> validateHITSPImmunizationTemplateIdTestCase = new OperationsTestCase<Immunization>(
			"validateHITSPImmunizationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationOperations.validateHITSPImmunizationTemplateId(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		validateHITSPImmunizationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ImmunizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Immunization> {

		public Immunization create() {
			return HITSPFactory.eINSTANCE.createImmunization();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends ImmunizationOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

	/**
	 * Create a valid Consumable for a Hepatitis Vaccine
	 * @return consumable
	 */
	protected Consumable createConsumableForVaccine() {

		Consumable consumable = CDAFactory.eINSTANCE.createConsumable();

		ManufacturedProduct mProduct = CDAFactory.eINSTANCE.createManufacturedProduct();
		mProduct.setClassCode(RoleClassManufacturedProduct.MANU);

		II ccdTemplateId = DatatypesFactory.eINSTANCE.createII();
		ccdTemplateId.setRoot("2.16.840.1.113883.10.20.1.53");
		mProduct.getTemplateIds().add(ccdTemplateId);

		II iheTemplateId = DatatypesFactory.eINSTANCE.createII();
		iheTemplateId.setRoot("1.3.6.1.4.1.19376.1.5.3.1.4.7.2");
		mProduct.getTemplateIds().add(iheTemplateId);

		Material mMaterial = CDAFactory.eINSTANCE.createMaterial();
		CE code = DatatypesFactory.eINSTANCE.createCE("52", "2.16.840.1.113883.6.59");
		code.setDisplayName("Hepatitis A vaccine");
		mMaterial.setCode(code);

		mProduct.setManufacturedMaterial(mMaterial);
		consumable.setManufacturedProduct(mProduct);

		return consumable;
	}

} // ImmunizationOperations
