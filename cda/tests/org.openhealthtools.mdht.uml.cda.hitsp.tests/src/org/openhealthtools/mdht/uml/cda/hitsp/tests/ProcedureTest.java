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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureHasCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedurePerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHITSPProcedureHasCodeOriginalText() {
		OperationsTestCase<Procedure> validateHITSPProcedureHasCodeOriginalTextTestCase = new OperationsTestCase<Procedure>(
			"validateHITSPProcedureHasCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("code");
				ED ed = DatatypesFactory.eINSTANCE.createED();

				// TEL tel = DatatypesFactory.eINSTANCE.createTEL("reference");
				// ed.setReference(tel);
				cd.setOriginalText(ed);
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(Procedure target) {

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("code");
				ED ed = DatatypesFactory.eINSTANCE.createED();

				TEL tel = DatatypesFactory.eINSTANCE.createTEL("reference");
				ed.setReference(tel);
				cd.setOriginalText(ed);
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateHITSPProcedureHasCodeOriginalText(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateHITSPProcedureHasCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHITSPProcedurePerformerAssignedEntity() {
		OperationsTestCase<Procedure> validateHITSPProcedurePerformerAssignedEntityTestCase = new OperationsTestCase<Procedure>(
			"validateHITSPProcedurePerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {
				target.init();
				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p2);
			}

			@Override
			protected void updateToPass(Procedure target) {
				target.getPerformers().clear();
				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				p2.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateHITSPProcedurePerformerAssignedEntity(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateHITSPProcedurePerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPProcedureTemplateId() {
		OperationsTestCase<Procedure> validateHITSPProcedureTemplateIdTestCase = new OperationsTestCase<Procedure>(
			"validateHITSPProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateHITSPProcedureTemplateId(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateHITSPProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHITSPProcedureTargetSiteCode() {
		OperationsTestCase<Procedure> validateHITSPProcedureTargetSiteCodeTestCase = new OperationsTestCase<Procedure>(
			"validateHITSPProcedureTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {
				target.init();
			}

			@Override
			protected void updateToPass(Procedure target) {
				target.getTargetSiteCodes().clear();
				target.getTargetSiteCodes().add(
					DatatypesFactory.eINSTANCE.createCD("code", "2.16.840.1.113883.6.96", "", ""));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateHITSPProcedureTargetSiteCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateHITSPProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHITSPProcedureCode() {
		OperationsTestCase<Procedure> validateHITSPProcedureCodeTestCase = new OperationsTestCase<Procedure>(
			"validateHITSPProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {
				target.init();
			}

			@Override
			protected void updateToPass(Procedure target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateHITSPProcedureCode((Procedure) objectToTest, diagnostician, map);
			}

		};

		validateHITSPProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Procedure> {
		public Procedure create() {
			return HITSPFactory.eINSTANCE.createPlannedProcedure();
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
	private static class ConstructorTestClass extends ProcedureOperations {
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

} // ProcedureOperations
