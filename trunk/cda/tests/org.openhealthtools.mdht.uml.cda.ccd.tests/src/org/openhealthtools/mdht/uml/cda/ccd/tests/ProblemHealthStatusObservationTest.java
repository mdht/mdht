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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemHealthStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.ccd.operations.StatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Problem Health Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation#validateProblemHealthStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Health Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation#validateStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemHealthStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemHealthStatusObservationCode() {
		OperationsTestCase<ProblemHealthStatusObservation> validateProblemHealthStatusObservationCodeTestCase = new OperationsTestCase<ProblemHealthStatusObservation>(
			"validateProblemHealthStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemHealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemHealthStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemHealthStatusObservationOperations.validateProblemHealthStatusObservationCode(
					(ProblemHealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemHealthStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateStatusObservationTemplateId() {
		OperationsTestCase<ProblemHealthStatusObservation> validateStatusObservationTemplateIdTestCase = new OperationsTestCase<ProblemHealthStatusObservation>(
			"validateStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemHealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemHealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemHealthStatusObservationOperations.validateStatusObservationTemplateId(
					(ProblemHealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateStatusObservationCode() {
		OperationsTestCase<ProblemHealthStatusObservation> validateStatusObservationCodeTestCase = new OperationsTestCase<ProblemHealthStatusObservation>(
			"validateStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemHealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(ProblemHealthStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("11323-3");
				cd.setCodeSystem("2.16.840.1.113883.6.1");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationCode(
					(ProblemHealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProblemHealthStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemHealthStatusObservation> {
		public ProblemHealthStatusObservation create() {
			return CCDFactory.eINSTANCE.createProblemHealthStatusObservation();
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
	private static class ConstructorTestClass extends ProblemHealthStatusObservationOperations {
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

} // ProblemHealthStatusObservationOperations
