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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CoverageEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry#validateCoverageEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry#validateCoverageEntryPayerEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Payer Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry#getPayerEntries() <em>Get Payer Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CoverageEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCoverageEntryTemplateId() {
		OperationsTestCase<CoverageEntry> validateCoverageEntryTemplateIdTestCase = new OperationsTestCase<CoverageEntry>(
			"validateCoverageEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageEntry target) {

			}

			@Override
			protected void updateToPass(CoverageEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageEntryOperations.validateCoverageEntryTemplateId(
					(CoverageEntry) objectToTest, diagnostician, map);
			}

		};

		validateCoverageEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCoverageEntryPayerEntry() {
		OperationsTestCase<CoverageEntry> validateCoverageEntryPayerEntryTestCase = new OperationsTestCase<CoverageEntry>(
			"validateCoverageEntryPayerEntry",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageEntry target) {

			}

			@Override
			protected void updateToPass(CoverageEntry target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(IHEFactory.eINSTANCE.createPayerEntry());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageEntryOperations.validateCoverageEntryPayerEntry(
					(CoverageEntry) objectToTest, diagnostician, map);
			}

		};

		validateCoverageEntryPayerEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayerEntries() {

		CoverageEntry target = objectFactory.create();
		target.getPayerEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CoverageEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoverageEntry> {

		public CoverageEntry create() {
			return IHEFactory.eINSTANCE.createCoverageEntry();
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
	private static class ConstructorTestClass extends CoverageEntryOperations {
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

} // CoverageEntryOperations
