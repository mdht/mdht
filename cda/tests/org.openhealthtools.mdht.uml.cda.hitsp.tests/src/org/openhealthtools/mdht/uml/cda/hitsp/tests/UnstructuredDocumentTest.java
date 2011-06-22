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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.UnstructuredDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Unstructured Document</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument#validateScannedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument#validateUnstructuredDocumentNoStructuredData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document No Structured Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument#validateUnstructuredDocumentOnePatientPerDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document One Patient Per Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnstructuredDocumentTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateScannedDocumentTemplateId() {
		OperationsTestCase<UnstructuredDocument> validateScannedDocumentTemplateIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateScannedDocumentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateScannedDocumentTemplateId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateUnstructuredDocumentNoStructuredData() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentNoStructuredDataTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentNoStructuredData",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Component2 component = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(component);
				StructuredBody sb = CDAFactory.eINSTANCE.createStructuredBody();
				target.getComponent().setStructuredBody(sb);

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				Component2 component = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(component);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentNoStructuredData(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentNoStructuredDataTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateUnstructuredDocumentOnePatientPerDocument() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentOnePatientPerDocumentTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentOnePatientPerDocument",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient p = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(p);
				rt.setPatientRole(pr);

				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentOnePatientPerDocument(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentOnePatientPerDocumentTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends UnstructuredDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnstructuredDocument> {

		public UnstructuredDocument create() {
			return HITSPFactory.eINSTANCE.createUnstructuredDocument();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends UnstructuredDocumentOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // UnstructuredDocumentOperations
