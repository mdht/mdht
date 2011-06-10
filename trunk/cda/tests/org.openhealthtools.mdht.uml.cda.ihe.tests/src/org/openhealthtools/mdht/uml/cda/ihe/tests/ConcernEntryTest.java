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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ConcernEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Concern Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry#validateConcernEntryEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concern Entry Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry#validateConcernEntryHasRelatedObservations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concern Entry Has Related Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry#validateConcernEntryRelatedObservationsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concern Entry Related Observations Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry#validateConcernEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concern Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry#validateConcernEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concern Entry Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConcernEntryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConcernEntryEffectiveTimeLowHigh() {
		OperationsTestCase<ConcernEntry> validateConcernEntryEffectiveTimeLowHighTestCase = new OperationsTestCase<ConcernEntry>(
			"validateConcernEntryEffectiveTimeLowHigh",
			operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS("lowvalue", "highvalue");
				target.setEffectiveTime(value);
			}

			@Override
			protected void updateToPass(ConcernEntry target) {

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConcernEntryOperations.validateConcernEntryEffectiveTimeLowHigh(
					(ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateConcernEntryEffectiveTimeLowHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConcernEntryHasRelatedObservations() {
		OperationsTestCase<ConcernEntry> validateConcernEntryHasRelatedObservationsTestCase = new OperationsTestCase<ConcernEntry>(
			"validateConcernEntryHasRelatedObservations",
			operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {

			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				target.init();

				AllergyIntolerance ai = IHEFactory.eINSTANCE.createAllergyIntolerance().init();

				target.addObservation(ai);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConcernEntryOperations.validateConcernEntryHasRelatedObservations(
					(ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateConcernEntryHasRelatedObservationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConcernEntryRelatedObservationsTypeCode() {
		OperationsTestCase<ConcernEntry> validateConcernEntryRelatedObservationsTypeCodeTestCase = new OperationsTestCase<ConcernEntry>(
			"validateConcernEntryRelatedObservationsTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {
				target.init();

				AllergyIntolerance ai = IHEFactory.eINSTANCE.createAllergyIntolerance().init();

				target.addObservation(ai);
			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConcernEntryOperations.validateConcernEntryRelatedObservationsTypeCode(
					(ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateConcernEntryRelatedObservationsTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConcernEntryTemplateId() {
		OperationsTestCase<ConcernEntry> validateConcernEntryTemplateIdTestCase = new OperationsTestCase<ConcernEntry>(
			"validateConcernEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {

			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConcernEntryOperations.validateConcernEntryTemplateId(
					(ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateConcernEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConcernEntryEffectiveTime() {
		OperationsTestCase<ConcernEntry> validateConcernEntryEffectiveTimeTestCase = new OperationsTestCase<ConcernEntry>(
			"validateConcernEntryEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONCERN_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConcernEntry target) {

			}

			@Override
			protected void updateToPass(ConcernEntry target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConcernEntryOperations.validateConcernEntryEffectiveTime(
					(ConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateConcernEntryEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConcernEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConcernEntry> {
		public ConcernEntry create() {
			return IHEFactory.eINSTANCE.createConcernEntry();
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
	private static class ConstructorTestClass extends ConcernEntryOperations {
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

} // ConcernEntryOperations
