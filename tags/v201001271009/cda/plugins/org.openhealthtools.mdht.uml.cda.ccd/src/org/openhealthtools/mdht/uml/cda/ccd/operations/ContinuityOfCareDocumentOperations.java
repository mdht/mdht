/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medication Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentPurposeSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Purpose Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocumentOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1')
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentTemplateId(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentTemplateId"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentCode(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentCode"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ProblemSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentProblemSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::FamilyHistorySection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentFamilyHistorySection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::SocialHistorySection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentSocialHistorySection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAlertsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAlertsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::AlertsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAlertsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAlertsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::AlertsSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentAlertsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentAlertsSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentMedicationSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medication Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicationSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentMedicationSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medication Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicationSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicationSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentMedicationSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentMedicationSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ResultsSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentResultsSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ProceduresSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentProceduresSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::EncountersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::EncountersSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentEncountersSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::PlanOfCareSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentPlanOfCareSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::ImmunizationsSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentImmunizationsSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::VitalSignsSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentVitalSignsSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicalEquipmentSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentMedicalEquipmentSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::FunctionalStatusSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentFunctionalStatusSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::AdvanceDirectivesSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentAdvanceDirectivesSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::PayersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::PayersSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentPayersSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPurposeSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Purpose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPurposeSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::PurposeSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPurposeSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Purpose Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPurposeSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ccd::PurposeSection))
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContinuityOfCareDocumentPurposeSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION,
						 CCDPlugin.INSTANCE.getString("ContinuityOfCareDocumentPurposeSection"),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

} // ContinuityOfCareDocumentOperations