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
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ReasonForVisitSectionConsultOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Reason For Visit Section Consult</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult#validateReasonForVisitSectionConsultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult#validateReasonForVisitSectionConsultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForVisitSectionConsultTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReasonForVisitSectionConsultTemplateId() {
		OperationsTestCase<ReasonForVisitSectionConsult> validateReasonForVisitSectionConsultTemplateIdTestCase = new OperationsTestCase<ReasonForVisitSectionConsult>(
			"validateReasonForVisitSectionConsultTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSectionConsult target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSectionConsult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionConsultOperations.validateReasonForVisitSectionConsultTemplateId(
					(ReasonForVisitSectionConsult) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionConsultTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReasonForVisitSectionConsultCode() {
		OperationsTestCase<ReasonForVisitSectionConsult> validateReasonForVisitSectionConsultCodeTestCase = new OperationsTestCase<ReasonForVisitSectionConsult>(
			"validateReasonForVisitSectionConsultCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForVisitSectionConsult target) {

			}

			@Override
			protected void updateToPass(ReasonForVisitSectionConsult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForVisitSectionConsultOperations.validateReasonForVisitSectionConsultCode(
					(ReasonForVisitSectionConsult) objectToTest, diagnostician, map);
			}

		};

		validateReasonForVisitSectionConsultCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ReasonForVisitSectionConsultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForVisitSectionConsult> {

		public ReasonForVisitSectionConsult create() {
			return CDTFactory.eINSTANCE.createReasonForVisitSectionConsult();
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
	private static class ConstructorTestClass extends ReasonForVisitSectionConsultOperations {
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

} // ReasonForVisitSectionConsultOperations
