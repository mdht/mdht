/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignsOrganizerOperationsTest extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.VitalSignsOrganizerOperationsTest {

	public static class OperationsForOCL extends VitalSignsOrganizerOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<VitalSignsOrganizer> {
		public VitalSignsOrganizer create() {
			return IHEFactory.eINSTANCE.createVitalSignsOrganizer();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateVitalSignsOrganizerTemplateId() {

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"ValidateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID", operationsForOCL.getOCLValue("xxx"),
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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateIHEVitalSignsOrganizerTemplateId(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEVitalSignsOrganizerTemplateId() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"ValidateIHEVitalSignsOrganizerTemplateId", operationsForOCL.getOCLValue("xxx"), objectFactory) {

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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateIHEVitalSignsOrganizerClassCode(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEVitalSignsOrganizerClassCode() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"ValidateIHEVitalSignsOrganizerClassCode", operationsForOCL.getOCLValue("xxx"), objectFactory) {

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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateIHEVitalSignsOrganizerEffectiveTime(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEVitalSignsOrganizerEffectiveTime() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"ValidateIHEVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(time);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerEffectiveTime(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateIHEVitalSignsOrganizerId(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEVitalSignsOrganizerId() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"ValidateIHEVitalSignsOrganizerId",
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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateIHEVitalSignsOrganizerVitalSignObservation(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEVitalSignsOrganizerVitalSignObservation() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateResultOrganizerCode(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateResultOrganizerCodeVitalSignsOrganizer() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateResultOrganizerCodeVitalSignsOrganizer", operationsForOCL.getOCLValue("xxx"), objectFactory) {

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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations#validateResultOrganizerStatusCode(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<VitalSignsOrganizer> testCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateResultOrganizerStatusCodeVitalSignsOrganizer", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignsOrganizerOperations.validateResultOrganizerStatusCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // VitalSignsOrganizerOperationsTest
