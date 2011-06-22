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
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntrySeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#validateProblemEntryComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry#getComments() <em>Get Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemEntryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryHasTextReference() {
		OperationsTestCase<ProblemEntry> validateProblemEntryHasTextReferenceTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();

				ED value = DatatypesFactory.eINSTANCE.createED("sample text");
				target.setText(value);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {

				TEL value = DatatypesFactory.eINSTANCE.createTEL("reference");
				target.getText().setReference(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryHasTextReference(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryCommentInversionInd() {
		OperationsTestCase<ProblemEntry> validateProblemEntryCommentInversionIndTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryCommentInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
				Act comment = IHEFactory.eINSTANCE.createComment().init();
				target.addAct(comment);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryCommentInversionInd(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryCommentInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemEntryTemplateId() {
		OperationsTestCase<ProblemEntry> validateProblemEntryTemplateIdTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {

			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryTemplateId(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryCode() {
		OperationsTestCase<ProblemEntry> validateProblemEntryCodeTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {

			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				target.init();
				target.getCode().setCode("282291009");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryCode((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemEntryEffectiveTime() {
		OperationsTestCase<ProblemEntry> validateProblemEntryEffectiveTimeTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {

			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryEffectiveTime(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryId() {
		OperationsTestCase<ProblemEntry> validateProblemEntryIdTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				II ii = DatatypesFactory.eINSTANCE.createII("ii");
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryId((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryText() {
		OperationsTestCase<ProblemEntry> validateProblemEntryTextTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {

				ED text = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryText((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryValue() {
		OperationsTestCase<ProblemEntry> validateProblemEntryValueTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {

			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryValue((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntrySeverity() {
		OperationsTestCase<ProblemEntry> validateProblemEntrySeverityTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntrySeverity",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				Severity severity = IHEFactory.eINSTANCE.createSeverity();
				er.setObservation(severity);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntrySeverity(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntrySeverityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryProblemStatusObservation() {
		OperationsTestCase<ProblemEntry> validateProblemEntryProblemStatusObservationTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				ProblemStatusObservation pso = IHEFactory.eINSTANCE.createProblemStatusObservation().init();
				er.setObservation(pso);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryProblemStatusObservation(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryHealthStatusObservation() {
		OperationsTestCase<ProblemEntry> validateProblemEntryHealthStatusObservationTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryHealthStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				HealthStatusObservation hso = IHEFactory.eINSTANCE.createHealthStatusObservation().init();
				er.setObservation(hso);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryHealthStatusObservation(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryHealthStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemEntryComment() {
		OperationsTestCase<ProblemEntry> validateProblemEntryCommentTestCase = new OperationsTestCase<ProblemEntry>(
			"validateProblemEntryComment",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
				Act comment = IHEFactory.eINSTANCE.createComment().init();
				target.addAct(comment);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemEntryOperations.validateProblemEntryComment(
					(ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryCommentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverity() {

		ProblemEntry target = objectFactory.create();
		target.getSeverity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemStatusObservation() {

		ProblemEntry target = objectFactory.create();
		target.getProblemStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthStatusObservation() {

		ProblemEntry target = objectFactory.create();
		target.getHealthStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComments() {

		ProblemEntry target = objectFactory.create();
		target.getComments();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemEntry> {

		public ProblemEntry create() {
			return IHEFactory.eINSTANCE.createProblemEntry();
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
	private static class ConstructorTestClass extends ProblemEntryOperations {
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

} // ProblemEntryOperations
