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
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SeverityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Severity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Severity#validateSeverityHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Severity#validateSeverityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Severity#validateSeverityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Severity#validateSeverityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SeverityTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityHasTextReference() {
		OperationsTestCase<Severity> validateSeverityHasTextReferenceTestCase = new OperationsTestCase<Severity>(
			"validateSeverityHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				target.init();

				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setText(value);
			}

			@Override
			protected void updateToPass(Severity target) {
				TEL value = DatatypesFactory.eINSTANCE.createTEL();
				target.getText().setReference(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityOperations.validateSeverityHasTextReference((Severity) objectToTest, diagnostician, map);
			}

		};

		validateSeverityHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeverityTemplateId() {
		OperationsTestCase<Severity> validateSeverityTemplateIdTestCase = new OperationsTestCase<Severity>(
			"validateSeverityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Severity target) {

			}

			@Override
			protected void updateToPass(Severity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityOperations.validateSeverityTemplateId((Severity) objectToTest, diagnostician, map);
			}

		};

		validateSeverityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityText() {
		OperationsTestCase<Severity> validateSeverityTextTestCase = new OperationsTestCase<Severity>(
			"validateSeverityText",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				target.init();
			}

			@Override
			protected void updateToPass(Severity target) {

				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setText(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityOperations.validateSeverityText((Severity) objectToTest, diagnostician, map);
			}

		};

		validateSeverityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSeverityObservationValue() {
		OperationsTestCase<Severity> validateSeverityObservationValueTestCase = new OperationsTestCase<Severity>(
			"validateSeverityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Severity target) {
				target.init();
			}

			@Override
			protected void updateToPass(Severity target) {
				CD ce = DatatypesFactory.eINSTANCE.createCD();
				ce.setCodeSystem("2.16.840.1.113883.5.1063");
				ce.setCode("H");
				target.getValues().add(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeverityOperations.validateSeverityObservationValue((Severity) objectToTest, diagnostician, map);
			}

		};

		validateSeverityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SeverityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Severity> {

		public Severity create() {
			return IHEFactory.eINSTANCE.createSeverity();
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
	private static class ConstructorTestClass extends SeverityOperations {
	};

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

} // SeverityOperations
