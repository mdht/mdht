/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Past Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionHasClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Has Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PastMedicalHistorySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PastMedicalHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionHasClinicalStatements(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Has Clinical Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionHasClinicalStatements(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionHasClinicalStatements(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Has Clinical Statements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionHasClinicalStatements(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->isEmpty()
	 * @param pastMedicalHistorySection The receiving '<em><b>Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionHasClinicalStatements(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionHasClinicalStatements"),
						 new Object [] { pastMedicalHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionTemplateId(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionTemplateId(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.9')";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionTemplateId(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionTemplateId(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.9')
	 * @param pastMedicalHistorySection The receiving '<em><b>Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionTemplateId(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionTemplateId"),
						 new Object [] { pastMedicalHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionCode(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionCode(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionCode(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionCode(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param pastMedicalHistorySection The receiving '<em><b>Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionCode(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_CODE,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionCode"),
						 new Object [] { pastMedicalHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionText(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionText(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionText(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionText(PastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param pastMedicalHistorySection The receiving '<em><b>Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionText(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_TEXT,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionText"),
						 new Object [] { pastMedicalHistorySection }));
			}
			return false;
		}
		return true;
	}

} // PastMedicalHistorySectionOperations