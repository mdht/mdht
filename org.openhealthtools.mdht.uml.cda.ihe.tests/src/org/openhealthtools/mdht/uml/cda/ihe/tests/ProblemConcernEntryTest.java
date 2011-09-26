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
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemConcernEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry#validateProblemConcernEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry#validateProblemConcernEntryProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Entry Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry#getProblemEntries() <em>Get Problem Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemConcernEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernEntryTemplateId() {
		OperationsTestCase<ProblemConcernEntry> validateProblemConcernEntryTemplateIdTestCase = new OperationsTestCase<ProblemConcernEntry>(
			"validateProblemConcernEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernEntry target) {

			}

			@Override
			protected void updateToPass(ProblemConcernEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernEntryOperations.validateProblemConcernEntryTemplateId(
					(ProblemConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernEntryProblemEntry() {
		OperationsTestCase<ProblemConcernEntry> validateProblemConcernEntryProblemEntryTestCase = new OperationsTestCase<ProblemConcernEntry>(
			"validateProblemConcernEntryProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernEntry target) {

			}

			@Override
			protected void updateToPass(ProblemConcernEntry target) {
				target.init();
				ProblemEntry problemEntry = IHEFactory.eINSTANCE.createProblemEntry().init();
				target.addObservation(problemEntry);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernEntryOperations.validateProblemConcernEntryProblemEntry(
					(ProblemConcernEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernEntryProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntries() {

		ProblemConcernEntry target = objectFactory.create();
		target.getProblemEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemConcernEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemConcernEntry> {

		public ProblemConcernEntry create() {
			return IHEFactory.eINSTANCE.createProblemConcernEntry();
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
	private static class ConstructorTestClass extends ProblemConcernEntryOperations {
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

} // ProblemConcernEntryOperations
