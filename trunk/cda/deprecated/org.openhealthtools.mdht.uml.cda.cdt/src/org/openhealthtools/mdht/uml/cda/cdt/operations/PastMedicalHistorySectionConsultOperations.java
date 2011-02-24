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
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Past Medical History Section Consult</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult#validatePastMedicalHistorySectionConsultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult#validatePastMedicalHistorySectionConsultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult#validatePastMedicalHistorySectionConsultText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PastMedicalHistorySectionConsultOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PastMedicalHistorySectionConsultOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionConsultTemplateId(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionConsultTemplateId(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4.9')";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionConsultTemplateId(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionConsultTemplateId(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4.9')
	 * @param pastMedicalHistorySectionConsult The receiving '<em><b>Past Medical History Section Consult</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionConsultTemplateId(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION_CONSULT);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySectionConsult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionConsultTemplateId"),
						 new Object [] { pastMedicalHistorySectionConsult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionConsultCode(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionConsultCode(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionConsultCode(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionConsultCode(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param pastMedicalHistorySectionConsult The receiving '<em><b>Past Medical History Section Consult</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionConsultCode(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION_CONSULT);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySectionConsult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionConsultCode"),
						 new Object [] { pastMedicalHistorySectionConsult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePastMedicalHistorySectionConsultText(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionConsultText(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePastMedicalHistorySectionConsultText(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePastMedicalHistorySectionConsultText(PastMedicalHistorySectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param pastMedicalHistorySectionConsult The receiving '<em><b>Past Medical History Section Consult</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePastMedicalHistorySectionConsultText(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION_CONSULT);
			try {
				VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pastMedicalHistorySectionConsult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT,
						 CDTPlugin.INSTANCE.getString("PastMedicalHistorySectionConsultText"),
						 new Object [] { pastMedicalHistorySectionConsult }));
			}
			return false;
		}
		return true;
	}

} // PastMedicalHistorySectionConsultOperations