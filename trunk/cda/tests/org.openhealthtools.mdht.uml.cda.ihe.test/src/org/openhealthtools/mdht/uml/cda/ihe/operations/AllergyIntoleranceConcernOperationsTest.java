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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class AllergyIntoleranceConcernOperationsTest extends ConcernEntryOperationsTest {

	public static class OperationsForOCL extends AllergyIntoleranceConcernOperations {
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

	public class ObjectFactory implements TestObjectFactory<AllergyIntoleranceConcern> {
		public AllergyIntoleranceConcern create() {
			return IHEFactory.eINSTANCE.createAllergyIntoleranceConcern();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateAllergyIntoleranceConcernAllergyIntolerance() {
		OperationsTestCase<AllergyIntoleranceConcern> testCase = new OperationsTestCase<AllergyIntoleranceConcern>(
			"ValidateAllergyIntoleranceConcernAllergyIntolerance",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntoleranceConcern target) {
				target.init();

			}

			@Override
			protected void updateToPass(AllergyIntoleranceConcern target) {
				AllergyIntolerance ai = IHEFactory.eINSTANCE.createAllergyIntolerance().init();
				target.addObservation(ai);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceConcernOperations.validateAllergyIntoleranceConcernAllergyIntolerance(
					(AllergyIntoleranceConcern) objectToTest, diagnostician, map);
			}

		};
		/*
		 * "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship |
		 * not entryRelationship.observation.oclIsUndefined() and
		 * entryRelationship.observation.oclIsKindOf(ihe::AllergyIntolerance) and
		 * entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";
		 */
		testCase.doValidationTest();
	}

	@Test
	public void testValidateAllergyIntoleranceConcernTemplateId() {
		OperationsTestCase<AllergyIntoleranceConcern> testCase = new OperationsTestCase<AllergyIntoleranceConcern>(
			"ValidateAllergyIntoleranceConcernTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntoleranceConcern target) {

			}

			@Override
			protected void updateToPass(AllergyIntoleranceConcern target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceConcernOperations.validateAllergyIntoleranceConcernTemplateId(
					(AllergyIntoleranceConcern) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testGetAllergyIntolerances() {

		AllergyIntoleranceConcern allergyIntoleranceConcern = objectFactory.create();

		allergyIntoleranceConcern.init();

		final long TESTCOUNT = 100;
		for (int vsoctr = 0; vsoctr < TESTCOUNT; vsoctr++) {

			AllergyIntolerance ai = IHEFactory.eINSTANCE.createAllergyIntolerance().init();

			// AllergyIntoleranceConcern aic = IHEFactory.eINSTANCE.createAllergyIntoleranceConcern().init();
			//
			// String vso = String.valueOf(vsoctr);
			// CD cd = DatatypesFactory.eINSTANCE.createCD(vso, vso, vso, vso);
			//
			// aic.setCode(cd);

			allergyIntoleranceConcern.addObservation(ai);
		}

		EList<AllergyIntolerance> result = AllergyIntoleranceConcernOperations.getAllergyIntolerances(allergyIntoleranceConcern);
		;

		org.junit.Assert.assertEquals(result.size(), TESTCOUNT);

	}

} // AllergyIntoleranceConcernOperationsTest
