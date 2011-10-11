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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ChiefComplaintSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Chief Complaint Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection#validateHITSPChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection#validateHITSPChiefComplaintSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChiefComplaintSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPChiefComplaintSectionTemplateId() {
		OperationsTestCase<ChiefComplaintSection> validateHITSPChiefComplaintSectionTemplateIdTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateHITSPChiefComplaintSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionOperations.validateHITSPChiefComplaintSectionTemplateId(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPChiefComplaintSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPChiefComplaintSectionCondition() {
		OperationsTestCase<ChiefComplaintSection> validateHITSPChiefComplaintSectionConditionTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateHITSPChiefComplaintSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSection target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSection target) {
				target.init();

				Condition condition = HITSPFactory.eINSTANCE.createCondition().init();

				target.addAct(condition);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionOperations.validateHITSPChiefComplaintSectionCondition(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPChiefComplaintSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCondition() {

		ChiefComplaintSection target = objectFactory.create();
		target.getCondition();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ChiefComplaintSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChiefComplaintSection> {

		public ChiefComplaintSection create() {
			return HITSPFactory.eINSTANCE.createChiefComplaintSection();
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
	private static class ConstructorTestClass extends ChiefComplaintSectionOperations {
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

} // ChiefComplaintSectionOperations
