/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#validateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#validateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#addPatient(org.openhealthtools.mdht.uml.cda.Patient) <em>Add Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#addPatientRole(org.openhealthtools.mdht.uml.cda.PatientRole) <em>Add Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#addSection(org.openhealthtools.mdht.uml.cda.Section) <em>Add Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getPatients() <em>Get Patients</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getPatientRoles() <em>Get Patient Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getSections() <em>Get Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getAllSections() <em>Get All Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#hasCode(java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#hasSectionTemplate(java.lang.String) <em>Has Section Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#hasTemplateId(java.lang.String) <em>Has Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#setStructuredBody(org.openhealthtools.mdht.uml.cda.StructuredBody) <em>Set Structured Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalDocumentOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClassCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClinicalDocument::DOCCLIN";

	/**
	 * The cached OCL invariant for the '{@link #validateClassCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClinicalDocument::DOCCLIN
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassCode(ClinicalDocument clinicalDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.CLINICAL_DOCUMENT);
			try {
				VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					CDAValidator.DIAGNOSTIC_SOURCE,
					CDAValidator.CLINICAL_DOCUMENT__CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalDocument, context) }),
					new Object[] { clinicalDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMoodCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMoodCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(ClinicalDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::ActMood::EVN
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMoodCode(ClinicalDocument clinicalDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.CLINICAL_DOCUMENT);
			try {
				VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					CDAValidator.DIAGNOSTIC_SOURCE,
					CDAValidator.CLINICAL_DOCUMENT__MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalDocument, context) }),
					new Object[] { clinicalDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setStructuredBody(ClinicalDocument clinicalDocument, StructuredBody structuredBody) {
		Component2 component = clinicalDocument.getComponent();
		if (component == null) {
			component = CDAFactory.eINSTANCE.createComponent2();
			clinicalDocument.setComponent(component);
		}
		component.setStructuredBody(structuredBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void addSection(ClinicalDocument clinicalDocument, Section section) {
		Component2 component2 = clinicalDocument.getComponent();
		if (component2 == null) {
			component2 = CDAFactory.eINSTANCE.createComponent2();
			clinicalDocument.setComponent(component2);
		}
		StructuredBody structuredBody = component2.getStructuredBody();
		if (structuredBody == null) {
			structuredBody = CDAFactory.eINSTANCE.createStructuredBody();
			component2.setStructuredBody(structuredBody);
		}
		Component3 component3 = CDAFactory.eINSTANCE.createComponent3();
		component3.setSection(section);
		structuredBody.getComponents().add(component3);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatients(ClinicalDocument) <em>Get Patients</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatients(ClinicalDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENTS__EOCL_EXP = "self.recordTarget.patientRole.patient";

	/**
	 * The cached OCL query for the '{@link #getPatients(ClinicalDocument) <em>Get Patients</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatients(ClinicalDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget.patientRole.patient
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Patient> getPatients(ClinicalDocument clinicalDocument) {
		if (GET_PATIENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_DOCUMENT,
				CDAPackage.Literals.CLINICAL_DOCUMENT.getEAllOperations().get(21));
			try {
				GET_PATIENTS__EOCL_QRY = helper.createQuery(GET_PATIENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Patient> result = (Collection<Patient>) query.evaluate(clinicalDocument);
		return new BasicEList.UnmodifiableEList<Patient>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientRoles(ClinicalDocument) <em>Get Patient Roles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientRoles(ClinicalDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_ROLES__EOCL_EXP = "self.recordTarget.patientRole";

	/**
	 * The cached OCL query for the '{@link #getPatientRoles(ClinicalDocument) <em>Get Patient Roles</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientRoles(ClinicalDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_ROLES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget.patientRole
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PatientRole> getPatientRoles(ClinicalDocument clinicalDocument) {
		if (GET_PATIENT_ROLES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_DOCUMENT,
				CDAPackage.Literals.CLINICAL_DOCUMENT.getEAllOperations().get(22));
			try {
				GET_PATIENT_ROLES__EOCL_QRY = helper.createQuery(GET_PATIENT_ROLES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_ROLES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientRole> result = (Collection<PatientRole>) query.evaluate(clinicalDocument);
		return new BasicEList.UnmodifiableEList<PatientRole>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSections(ClinicalDocument) <em>Get Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections(ClinicalDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SECTIONS__EOCL_EXP = "if self.component.structuredBody.oclIsUndefined() then Bag{} else self.component.structuredBody.component.section endif";

	/**
	 * The cached OCL query for the '{@link #getSections(ClinicalDocument) <em>Get Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections(ClinicalDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.component.structuredBody.oclIsUndefined() then Bag{} else self.component.structuredBody.component.section endif
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Section> getSections(ClinicalDocument clinicalDocument) {
		if (GET_SECTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_DOCUMENT,
				CDAPackage.Literals.CLINICAL_DOCUMENT.getEAllOperations().get(23));
			try {
				GET_SECTIONS__EOCL_QRY = helper.createQuery(GET_SECTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Section> result = (Collection<Section>) query.evaluate(clinicalDocument);
		return new BasicEList.UnmodifiableEList<Section>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList<Section> getAllSections(ClinicalDocument clinicalDocument) {
		List<Section> sections = CDAUtil.getAllSections(clinicalDocument);
		return new BasicEList.UnmodifiableEList<Section>(sections.size(), sections.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #hasCode(ClinicalDocument, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(ClinicalDocument, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_CODE__STRING_STRING_STRING__EOCL_EXP = "self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName";

	/**
	 * The cached OCL query for the '{@link #hasCode(ClinicalDocument, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(ClinicalDocument, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_CODE__STRING_STRING_STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasCode(ClinicalDocument clinicalDocument, String code, String codeSystem,
			String codeSystemName) {
		if (HAS_CODE__STRING_STRING_STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_DOCUMENT,
				CDAPackage.Literals.CLINICAL_DOCUMENT.getEAllOperations().get(25));
			try {
				HAS_CODE__STRING_STRING_STRING__EOCL_QRY = helper.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("code", code);
		environment.add("codeSystem", codeSystem);
		environment.add("codeSystemName", codeSystemName);
		return ((Boolean) query.evaluate(clinicalDocument)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSectionTemplate(ClinicalDocument, java.lang.String) <em>Has Section Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSectionTemplate(ClinicalDocument, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SECTION_TEMPLATE__STRING__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSectionTemplate(ClinicalDocument, java.lang.String) <em>Has Section Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSectionTemplate(ClinicalDocument, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SECTION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.hasTemplateId(templateId))
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasSectionTemplate(ClinicalDocument clinicalDocument, String templateId) {
		if (HAS_SECTION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_DOCUMENT,
				CDAPackage.Literals.CLINICAL_DOCUMENT.getEAllOperations().get(26));
			try {
				HAS_SECTION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SECTION_TEMPLATE__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SECTION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalDocument)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasTemplateId(ClinicalDocument, java.lang.String) <em>Has Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(ClinicalDocument, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_TEMPLATE_ID__STRING__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = templateId)";

	/**
	 * The cached OCL query for the '{@link #hasTemplateId(ClinicalDocument, java.lang.String) <em>Has Template Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(ClinicalDocument, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_TEMPLATE_ID__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = templateId)
	 * @param clinicalDocument The receiving '<em><b>Clinical Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasTemplateId(ClinicalDocument clinicalDocument, String templateId) {
		if (HAS_TEMPLATE_ID__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CLINICAL_DOCUMENT,
				CDAPackage.Literals.CLINICAL_DOCUMENT.getEAllOperations().get(27));
			try {
				HAS_TEMPLATE_ID__STRING__EOCL_QRY = helper.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(clinicalDocument)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void addPatientRole(ClinicalDocument clinicalDocument, PatientRole patientRole) {
		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		recordTarget.setPatientRole(patientRole);
		clinicalDocument.getRecordTargets().add(recordTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void addPatient(ClinicalDocument clinicalDocument, Patient patient) {
		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		recordTarget.setPatientRole(patientRole);
		patientRole.setPatient(patient);
		clinicalDocument.getRecordTargets().add(recordTarget);
	}

} // ClinicalDocumentOperations
