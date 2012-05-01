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
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ReviewOfSystemsSectionIHEOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Review Of Systems Section IHE</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE#validateReviewOfSystemsSectionIHETemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE#validateReviewOfSystemsSectionIHECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReviewOfSystemsSectionIHETest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReviewOfSystemsSectionIHETemplateId() {
		OperationsTestCase<ReviewOfSystemsSectionIHE> validateReviewOfSystemsSectionIHETemplateIdTestCase = new OperationsTestCase<ReviewOfSystemsSectionIHE>(
			"validateReviewOfSystemsSectionIHETemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReviewOfSystemsSectionIHE target) {

			}

			@Override
			protected void updateToPass(ReviewOfSystemsSectionIHE target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReviewOfSystemsSectionIHEOperations.validateReviewOfSystemsSectionIHETemplateId(
					(ReviewOfSystemsSectionIHE) objectToTest, diagnostician, map);
			}

		};

		validateReviewOfSystemsSectionIHETemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateReviewOfSystemsSectionIHECode() {
		OperationsTestCase<ReviewOfSystemsSectionIHE> validateReviewOfSystemsSectionIHECodeTestCase = new OperationsTestCase<ReviewOfSystemsSectionIHE>(
			"validateReviewOfSystemsSectionIHECode",
			operationsForOCL.getOCLValue("VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReviewOfSystemsSectionIHE target) {

			}

			@Override
			protected void updateToPass(ReviewOfSystemsSectionIHE target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReviewOfSystemsSectionIHEOperations.validateReviewOfSystemsSectionIHECode(
					(ReviewOfSystemsSectionIHE) objectToTest, diagnostician, map);
			}

		};

		validateReviewOfSystemsSectionIHECodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ReviewOfSystemsSectionIHEOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReviewOfSystemsSectionIHE> {

		public ReviewOfSystemsSectionIHE create() {
			return CDTFactory.eINSTANCE.createReviewOfSystemsSectionIHE();
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
	private static class ConstructorTestClass extends ReviewOfSystemsSectionIHEOperations {
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

} // ReviewOfSystemsSectionIHEOperations
