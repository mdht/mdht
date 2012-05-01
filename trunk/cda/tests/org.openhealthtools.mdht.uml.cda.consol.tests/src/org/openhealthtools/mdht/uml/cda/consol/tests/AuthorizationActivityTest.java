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
import org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AuthorizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authorization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AuthorizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityTemplateId() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityTemplateIdTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityTemplateId(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityClassCode() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityClassCodeTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityClassCode(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityId() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityIdTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {

				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityId(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityMoodCode() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityMoodCodeTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityMoodCode(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityEntryRelationship() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityEntryRelationshipTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationship(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAuthorizationActivityEntryRelationshipTypeCode() {
		OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityEntryRelationshipTypeCodeTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipTypeCode(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AuthorizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AuthorizationActivity> {
		public AuthorizationActivity create() {
			return ConsolFactory.eINSTANCE.createAuthorizationActivity();
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
	private static class ConstructorTestClass extends AuthorizationActivityOperations {
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

} // AuthorizationActivityOperations
