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
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ChiefComplaintSectionProcNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Chief Complaint Section Proc Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote#validateChiefComplaintSectionProcNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Proc Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote#validateChiefComplaintSectionProcNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Proc Note Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChiefComplaintSectionProcNoteTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateChiefComplaintSectionProcNoteTemplateId() {
		OperationsTestCase<ChiefComplaintSectionProcNote> validateChiefComplaintSectionProcNoteTemplateIdTestCase = new OperationsTestCase<ChiefComplaintSectionProcNote>(
			"validateChiefComplaintSectionProcNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSectionProcNote target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSectionProcNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionProcNoteOperations.validateChiefComplaintSectionProcNoteTemplateId(
					(ChiefComplaintSectionProcNote) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionProcNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateChiefComplaintSectionProcNoteCode() {
		OperationsTestCase<ChiefComplaintSectionProcNote> validateChiefComplaintSectionProcNoteCodeTestCase = new OperationsTestCase<ChiefComplaintSectionProcNote>(
			"validateChiefComplaintSectionProcNoteCode",
			operationsForOCL.getOCLValue("VALIDATE_CHIEF_COMPLAINT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChiefComplaintSectionProcNote target) {

			}

			@Override
			protected void updateToPass(ChiefComplaintSectionProcNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChiefComplaintSectionProcNoteOperations.validateChiefComplaintSectionProcNoteCode(
					(ChiefComplaintSectionProcNote) objectToTest, diagnostician, map);
			}

		};

		validateChiefComplaintSectionProcNoteCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ChiefComplaintSectionProcNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChiefComplaintSectionProcNote> {

		public ChiefComplaintSectionProcNote create() {
			return CDTFactory.eINSTANCE.createChiefComplaintSectionProcNote();
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
	private static class ConstructorTestClass extends ChiefComplaintSectionProcNoteOperations {
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

} // ChiefComplaintSectionProcNoteOperations
