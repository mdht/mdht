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

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationAgeObservationInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationFamilyHistoryDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Family History Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#getFamilyHistoryDeathObservation() <em>Get Family History Death Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservationAgeObservationInversion() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationAgeObservationInversionTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationAgeObservationInversion",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(FamilyHistoryObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationAgeObservationInversion(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationAgeObservationInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationTemplateId() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationTemplateId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationClassCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationClassCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationClassCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationMoodCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationMoodCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationMoodCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationId() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservationCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				cd.setCode("418799008");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationCodeP() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationCodePTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationCodeP(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationCodePTestCase.doValidationTest();
	}

	/**
	 * Test the dependency interaction of the Code and CodeP constraints.
	 * 
	 *  @generated not
	 */
	@Test
	public void integrationTestValidateFamilyHistoryObservationCode() {
		FamilyHistoryObservation fixture = ConsolFactory.eINSTANCE.createFamilyHistoryObservation();

		Diagnostic problems = Diagnostician.INSTANCE.validate(fixture);

		// because the property constraint failed, the terminology constraint should short-circuit
		assertEquals(
			1,
			getDiagnostics(problems, ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE_P).size());
		assertEquals(
			0,
			getDiagnostics(problems, ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE).size());

		fixture.init();

		CD cd = DatatypesFactory.eINSTANCE.createCD();
		cd.setCodeSystem("2.16.840.1.113883.6.96");
		cd.setCode("1234");
		fixture.setCode(cd);

		problems = Diagnostician.INSTANCE.validate(fixture);

		// because the property constraint passed, the terminology constraint should be evaluated
		assertEquals(
			0,
			getDiagnostics(problems, ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE_P).size());
		assertEquals(
			1,
			getDiagnostics(problems, ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE).size());

		cd.setCode("418799008");

		problems = Diagnostician.INSTANCE.validate(fixture);

		// both constraints now should be satisfied
		assertEquals(
			0,
			getDiagnostics(problems, ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE_P).size());
		assertEquals(
			0,
			getDiagnostics(problems, ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE).size());
	}

	static List<? extends Diagnostic> getDiagnostics(Diagnostic diagnostic, int code) {
		List<Diagnostic> result = new java.util.ArrayList<Diagnostic>(3);

		for (Diagnostic next : diagnostic.getChildren()) {
			if (ConsolValidator.DIAGNOSTIC_SOURCE.equals(next.getSource()) && (next.getCode() == code)) {
				result.add(next);
			}
		}

		return result;
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationStatusCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationStatusCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationStatusCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationEffectiveTime() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationEffectiveTimeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationEffectiveTime(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservationValue() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationValueTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("234422006");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationValue(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservationAgeObservation() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationAgeObservationTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationAgeObservation(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryObservationFamilyHistoryDeathObservation() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationFamilyHistoryDeathObservationTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationFamilyHistoryDeathObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_FAMILY_HISTORY_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createFamilyHistoryDeathObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationFamilyHistoryDeathObservation(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationFamilyHistoryDeathObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		FamilyHistoryObservation target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryDeathObservation() {

		FamilyHistoryObservation target = objectFactory.create();
		target.getFamilyHistoryDeathObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryObservation> {
		public FamilyHistoryObservation create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryObservation();
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
	private static class ConstructorTestClass extends FamilyHistoryObservationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FamilyHistoryObservationOperations
