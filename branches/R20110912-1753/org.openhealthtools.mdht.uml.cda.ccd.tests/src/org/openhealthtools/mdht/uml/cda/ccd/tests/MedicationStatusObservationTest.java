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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medication Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation#validateStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationStatusObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateStatusObservationTemplateId() {
		OperationsTestCase<MedicationStatusObservation> validateStatusObservationTemplateIdTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateStatusObservationTemplateId(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicationStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationStatusObservation> {
		public MedicationStatusObservation create() {
			return CCDFactory.eINSTANCE.createMedicationStatusObservation();
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
	private static class ConstructorTestClass extends MedicationStatusObservationOperations {
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

} // MedicationStatusObservationOperations
