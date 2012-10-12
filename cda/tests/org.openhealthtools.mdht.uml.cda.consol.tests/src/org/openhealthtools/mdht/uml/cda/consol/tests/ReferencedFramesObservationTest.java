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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReferencedFramesObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referenced Frames Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationBoundaryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#getBoundaryObservation() <em>Get Boundary Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReferencedFramesObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferencedFramesObservationTemplateId() {
		OperationsTestCase<ReferencedFramesObservation> validateReferencedFramesObservationTemplateIdTestCase = new OperationsTestCase<ReferencedFramesObservation>(
			"validateReferencedFramesObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferencedFramesObservation target) {

			}

			@Override
			protected void updateToPass(ReferencedFramesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferencedFramesObservationOperations.validateReferencedFramesObservationTemplateId(
					(ReferencedFramesObservation) objectToTest, diagnostician, map);
			}

		};

		validateReferencedFramesObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferencedFramesObservationClassCode() {
		OperationsTestCase<ReferencedFramesObservation> validateReferencedFramesObservationClassCodeTestCase = new OperationsTestCase<ReferencedFramesObservation>(
			"validateReferencedFramesObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferencedFramesObservation target) {

			}

			@Override
			protected void updateToPass(ReferencedFramesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferencedFramesObservationOperations.validateReferencedFramesObservationClassCode(
					(ReferencedFramesObservation) objectToTest, diagnostician, map);
			}

		};

		validateReferencedFramesObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateReferencedFramesObservationCode() {
		OperationsTestCase<ReferencedFramesObservation> validateReferencedFramesObservationCodeTestCase = new OperationsTestCase<ReferencedFramesObservation>(
			"validateReferencedFramesObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferencedFramesObservation target) {

			}

			@Override
			protected void updateToPass(ReferencedFramesObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("121190", "1.2.840.10008.2.16.4", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferencedFramesObservationOperations.validateReferencedFramesObservationCode(
					(ReferencedFramesObservation) objectToTest, diagnostician, map);
			}

		};

		validateReferencedFramesObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferencedFramesObservationMoodCode() {
		OperationsTestCase<ReferencedFramesObservation> validateReferencedFramesObservationMoodCodeTestCase = new OperationsTestCase<ReferencedFramesObservation>(
			"validateReferencedFramesObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferencedFramesObservation target) {

			}

			@Override
			protected void updateToPass(ReferencedFramesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferencedFramesObservationOperations.validateReferencedFramesObservationMoodCode(
					(ReferencedFramesObservation) objectToTest, diagnostician, map);
			}

		};

		validateReferencedFramesObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateReferencedFramesObservationBoundaryObservation() {
		OperationsTestCase<ReferencedFramesObservation> validateReferencedFramesObservationBoundaryObservationTestCase = new OperationsTestCase<ReferencedFramesObservation>(
			"validateReferencedFramesObservationBoundaryObservation",
			operationsForOCL.getOCLValue("VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferencedFramesObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ReferencedFramesObservation target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createBoundaryObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferencedFramesObservationOperations.validateReferencedFramesObservationBoundaryObservation(
					(ReferencedFramesObservation) objectToTest, diagnostician, map);
			}

		};

		validateReferencedFramesObservationBoundaryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBoundaryObservation() {

		ReferencedFramesObservation target = objectFactory.create();
		target.getBoundaryObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReferencedFramesObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReferencedFramesObservation> {
		public ReferencedFramesObservation create() {
			return ConsolFactory.eINSTANCE.createReferencedFramesObservation();
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
	private static class ConstructorTestClass extends ReferencedFramesObservationOperations {
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

} // ReferencedFramesObservationOperations
