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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Require Results Organizer Template ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerVitalSignObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Vital Sign Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#getVitalSignObservations() <em>Get Vital Sign Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
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
	public void testValidateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateIDTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEVitalSignsOrganizerTemplateId() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerTemplateId(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEVitalSignsOrganizerClassCode() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerClassCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerClassCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEVitalSignsOrganizerEffectiveTime() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerEffectiveTime(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHEVitalSignsOrganizerId() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerIdTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerId(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHEVitalSignsOrganizerVitalSignObservation() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerVitalSignObservationTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerVitalSignObservation",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {
				target.init();
				Component4 component = CDAFactory.eINSTANCE.createComponent4();
				target.getComponents().add(component);
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {

				for (Component4 component : target.getComponents()) {
					VitalSignObservation obv = IHEFactory.eINSTANCE.createVitalSignObservation().init();
					component.setObservation(obv);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerVitalSignObservation(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerVitalSignObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEVitalSignsOrganizerAuthor() {
		OperationsTestCase<VitalSignsOrganizer> validateIHEVitalSignsOrganizerAuthorTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateIHEVitalSignsOrganizerAuthor",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerAuthor(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEVitalSignsOrganizerAuthorTestCase.doValidationTest();
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
	@Test
	public void testValidateResultOrganizerCode() {
		OperationsTestCase<VitalSignsOrganizer> validateResultOrganizerCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateResultOrganizerCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<VitalSignsOrganizer> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return VitalSignsOrganizerOperations.validateResultOrganizerStatusCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
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
			return IHEFactory.eINSTANCE.createVitalSignsOrganizer();
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
