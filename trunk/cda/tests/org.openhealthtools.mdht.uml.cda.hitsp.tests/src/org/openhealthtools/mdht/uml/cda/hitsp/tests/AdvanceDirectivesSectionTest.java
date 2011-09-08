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
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AdvanceDirectivesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Advance Directives Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection#validateHITSPAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection#validateHITSPAdvanceDirectivesSectionAdvanceDirective(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Advance Directives Section Advance Directive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection#getAdvanceDirectives() <em>Get Advance Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPAdvanceDirectivesSectionTemplateId() {
		OperationsTestCase<AdvanceDirectivesSection> validateHITSPAdvanceDirectivesSectionTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateHITSPAdvanceDirectivesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateHITSPAdvanceDirectivesSectionTemplateId(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAdvanceDirectivesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPAdvanceDirectivesSectionAdvanceDirective() {
		OperationsTestCase<AdvanceDirectivesSection> validateHITSPAdvanceDirectivesSectionAdvanceDirectiveTestCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateHITSPAdvanceDirectivesSectionAdvanceDirective",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionOperations.validateHITSPAdvanceDirectivesSectionAdvanceDirective(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAdvanceDirectivesSectionAdvanceDirectiveTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectives() {

		AdvanceDirectivesSection target = objectFactory.create();
		target.getAdvanceDirectives();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AdvanceDirectivesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection> {

		public AdvanceDirectivesSection create() {
			return HITSPFactory.eINSTANCE.createAdvanceDirectivesSection();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSectionOperations {
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

} // AdvanceDirectivesSectionOperations
