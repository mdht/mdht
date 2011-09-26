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
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation#validateIHEProblemStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Problem Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation#validateIHEProblemStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Problem Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation#validateIHEProblemStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Problem Status Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation#validateStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHEProblemStatusObservationHasTextReference() {
		OperationsTestCase<ProblemStatusObservation> validateIHEProblemStatusObservationHasTextReferenceTestCase = new OperationsTestCase<ProblemStatusObservation>(
			"validateIHEProblemStatusObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_IHE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {
				target.init();
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);
			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				TEL value = DatatypesFactory.eINSTANCE.createTEL("reference");
				target.getText().setReference(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusObservationOperations.validateIHEProblemStatusObservationHasTextReference(
					(ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEProblemStatusObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEProblemStatusObservationTemplateId() {
		OperationsTestCase<ProblemStatusObservation> validateIHEProblemStatusObservationTemplateIdTestCase = new OperationsTestCase<ProblemStatusObservation>(
			"validateIHEProblemStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusObservationOperations.validateIHEProblemStatusObservationTemplateId(
					(ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEProblemStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHEProblemStatusObservationText() {
		OperationsTestCase<ProblemStatusObservation> validateIHEProblemStatusObservationTextTestCase = new OperationsTestCase<ProblemStatusObservation>(
			"validateIHEProblemStatusObservationText",
			operationsForOCL.getOCLValue("VALIDATE_IHE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusObservationOperations.validateIHEProblemStatusObservationText(
					(ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEProblemStatusObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateStatusObservationValue() {
		OperationsTestCase<ProblemStatusObservation> validateStatusObservationValueTestCase = new OperationsTestCase<ProblemStatusObservation>(
			"validateStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemStatusObservation target) {
				target.init();
				ANY cd = DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96");
				target.getValues().add(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusObservationOperations.validateStatusObservationValue(
					(ProblemStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemStatusObservation> {

		public ProblemStatusObservation create() {
			return IHEFactory.eINSTANCE.createProblemStatusObservation();
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
	private static class ConstructorTestClass extends ProblemStatusObservationOperations {
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

} // ProblemStatusObservationOperations
