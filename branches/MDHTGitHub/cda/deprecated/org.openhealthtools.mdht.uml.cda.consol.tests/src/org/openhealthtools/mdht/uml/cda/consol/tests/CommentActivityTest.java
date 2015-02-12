/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CommentActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorAssignPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Assign Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CommentActivityTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityTextReference() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextReferenceTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTextReference",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTextReference(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityTextReferenceValue() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextReferenceValueTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTextReferenceValue(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityReferenceValue() {
		OperationsTestCase<CommentActivity> validateCommentActivityReferenceValueTestCase = new NarrativeReferenceTestCase<CommentActivity>(
			"validateCommentActivityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityReferenceValue(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityTemplateId() {
		OperationsTestCase<CommentActivity> validateCommentActivityTemplateIdTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTemplateId(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityClassCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityClassCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityClassCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityMoodCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityMoodCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityMoodCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityText() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityText",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityText(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthor() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(CommentActivity target) {

				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthor(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(CommentActivity target) {
						target.init();
						Author auth = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						aa.getAddrs().add(ad);
						auth.setAssignedAuthor(aa);
						target.getAuthors().add(auth);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(CommentActivity target) {
						target.init();
						Author auth = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						aa.getAddrs().add(ad);
						auth.setAssignedAuthor(aa);
						target.getAuthors().add(auth);
					}
				});

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
					(CommentActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				aa.getAddrs().add(ad);
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

		};

		validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganizationTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				// Test driver test 4 emulation
				// Contains 1 author element, which contains 1 assignedAuthor element
				// -Does not contain an assignedPerson element (and therefore no name).
				// -Does not contain a representedOrganization element (and therefore no name).
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(CommentActivity target) {
						// Test driver test 1 emulation
						// Contains 1 author element, which contains 1 assignedAuthor element,
						// which contains 1 assignedPerson element, which contains 1 name element.
						// -Does not contain a representedOrganization element.
						target.init();
						// target.getAuthors().clear();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						aa.setAssignedPerson(person);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(CommentActivity target) {
						// Test driver test 2 emulation (repro of original reported error for artf3565)
						// Contains 1 author element, which contains 1 assignedAuthor element,
						// which contains 1 assignedPerson element and 1 representedOrganization element.
						// -The assignedPerson element contains 1 name element.
						// -The representedOrganization element contains 1 name element.
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						aa.setAssignedPerson(person);
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						org.getNames().add(DatatypesFactory.eINSTANCE.createON());
						aa.setRepresentedOrganization(org);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(CommentActivity target) {
						// Test driver test 3 emulation
						// Contains 1 author element, which contains 1 assignedAuthor element,
						// which contains 1 representedOrganization element which contains 1 name element.
						// -Does not contain an assignedPerson element.
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						org.getNames().add(DatatypesFactory.eINSTANCE.createON());
						aa.setRepresentedOrganization(org);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(CommentActivity target) {
						// Extra test
						// Contains 1 author element, which contains 1 assignedAuthor element,
						// which contains 1 representedOrganization element which contains 1 name element.
						// -The assignedAuthor element also contains an assignedPerson element,
						// but the assignedPerson element does NOT contain a name element.
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						aa.setAssignedPerson(person);
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						org.getNames().add(DatatypesFactory.eINSTANCE.createON());
						aa.setRepresentedOrganization(org);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorAssignPersonName() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorAssignPersonNameTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorAssignPersonName",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				aa.setAssignedPerson(person);
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorAssignPersonName(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorAssignPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorAddr() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorAddrTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorAddr(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorId() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorIdTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorId(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorTime() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorTimeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {

				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorTime(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthor() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				target.getAuthors().add(author);

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthor(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CommentActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CommentActivity> {
		public CommentActivity create() {
			return ConsolFactory.eINSTANCE.createCommentActivity();
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
	private static class ConstructorTestClass extends CommentActivityOperations {
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

	private AD createUSRealmAddress() {
		AD addr = DatatypesFactory.eINSTANCE.createAD();
		addr.getUses().add(PostalAddressUse.HP);
		addr.addStreetAddressLine("123 Main Street");
		addr.addCity("Boston");
		addr.addState("MA");
		addr.addCountry("US");
		addr.addPostalCode("01001");

		return addr;

	}

} // CommentActivityOperations
