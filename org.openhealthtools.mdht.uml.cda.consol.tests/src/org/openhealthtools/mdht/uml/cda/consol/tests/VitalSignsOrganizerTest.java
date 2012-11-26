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
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerVitalSignObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Vital Sign Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#getVitalSignObservations() <em>Get Vital Sign Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerTemplateId() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerTemplateId(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerClassCode() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerClassCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerClassCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerMoodCode() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerMoodCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerMoodCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizerId() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerIdTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerId(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerCode() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerStatusCode() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerStatusCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerStatusCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerEffectiveTime() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerEffectiveTime(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVitalSignsOrganizerVitalSignObservation() {
		OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerVitalSignObservationTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerVitalSignObservation",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {

				Observation observation = ConsolFactory.eINSTANCE.createVitalSignObservation().init();

				target.addObservation(observation);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerVitalSignObservation(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerVitalSignObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignObservations() {

		VitalSignsOrganizer target = objectFactory.create();
		target.getVitalSignObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsOrganizer> {
		public VitalSignsOrganizer create() {
			return ConsolFactory.eINSTANCE.createVitalSignsOrganizer();
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
	private static class ConstructorTestClass extends VitalSignsOrganizerOperations {
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

} // VitalSignsOrganizerOperations
