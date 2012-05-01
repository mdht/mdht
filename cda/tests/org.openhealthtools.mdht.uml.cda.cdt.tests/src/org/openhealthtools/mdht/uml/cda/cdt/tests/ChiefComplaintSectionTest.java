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
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ChiefComplaintSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Chief Complaint Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection#validateChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection#validateChiefComplaintSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}</li>
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
	public void testValidateChiefComplaintSectionTemplateId() {
		OperationsTestCase<ChiefComplaintSection> validateChiefComplaintSectionTemplateIdTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateChiefComplaintSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ChiefComplaintSectionOperations.validateChiefComplaintSectionTemplateId(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateChiefComplaintSectionCode() {
		OperationsTestCase<ChiefComplaintSection> validateChiefComplaintSectionCodeTestCase = new OperationsTestCase<ChiefComplaintSection>(
			"validateChiefComplaintSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ChiefComplaintSectionOperations.validateChiefComplaintSectionCode(
					(ChiefComplaintSection) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionCodeTestCase.doValidationTest();
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
			return CDTFactory.eINSTANCE.createChiefComplaintSection();
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
	};

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
