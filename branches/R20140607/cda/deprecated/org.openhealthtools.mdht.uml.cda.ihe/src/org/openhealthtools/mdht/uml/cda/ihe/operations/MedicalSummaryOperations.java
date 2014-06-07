/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryAllergyConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Allergy Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalSummaryOperations extends MedicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSummaryProblemConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryProblemConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::ProblemConcernEntry)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSummaryProblemConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Problem Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryProblemConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::ProblemConcernEntry)))
	 * @param medicalSummary The receiving '<em><b>Medical Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicalSummaryProblemConcernEntry(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICAL_SUMMARY);
			try {
				VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICAL_SUMMARY__MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY,
						 IHEPlugin.INSTANCE.getString("MedicalSummaryProblemConcernEntry"),
						 new Object [] { medicalSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSummaryAllergyConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Allergy Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryAllergyConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::AllergyIntoleranceConcern)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSummaryAllergyConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Allergy Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryAllergyConcernEntry(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::AllergyIntoleranceConcern)))
	 * @param medicalSummary The receiving '<em><b>Medical Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicalSummaryAllergyConcernEntry(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICAL_SUMMARY);
			try {
				VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICAL_SUMMARY__MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY,
						 IHEPlugin.INSTANCE.getString("MedicalSummaryAllergyConcernEntry"),
						 new Object [] { medicalSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSummaryMedications(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryMedications(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.oclIsKindOf(ihe::Medication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSummaryMedications(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Medications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryMedications(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.oclIsKindOf(ihe::Medication)))
	 * @param medicalSummary The receiving '<em><b>Medical Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicalSummaryMedications(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICAL_SUMMARY);
			try {
				VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICAL_SUMMARY__MEDICAL_SUMMARY_MEDICATIONS,
						 IHEPlugin.INSTANCE.getString("MedicalSummaryMedications"),
						 new Object [] { medicalSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSummaryTemplateId(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryTemplateId(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSummaryTemplateId(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSummaryTemplateId(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.2')
	 * @param medicalSummary The receiving '<em><b>Medical Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicalSummaryTemplateId(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICAL_SUMMARY);
			try {
				VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICAL_SUMMARY__MEDICAL_SUMMARY_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("MedicalSummaryTemplateId"),
						 new Object [] { medicalSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(MedicalSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param medicalSummary The receiving '<em><b>Medical Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MEDICAL_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.MEDICAL_SUMMARY__GENERAL_HEADER_CONSTRAINTS_CODE,
						 IHEPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { medicalSummary }));
			}
			return false;
		}
		return true;
	}

} // MedicalSummaryOperations