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
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Visit Section Consult</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult#validateReasonForVisitSectionConsultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult#validateReasonForVisitSectionConsultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForVisitSectionConsultOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForVisitSectionConsultOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionConsultTemplateId(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionConsultTemplateId(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionConsultTemplateId(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionConsultTemplateId(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4.8')
	 * @param reasonForVisitSectionConsult The receiving '<em><b>Reason For Visit Section Consult</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReasonForVisitSectionConsultTemplateId(ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.REASON_FOR_VISIT_SECTION_CONSULT);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForVisitSectionConsult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.REASON_FOR_VISIT_SECTION_CONSULT__REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("ReasonForVisitSectionConsultTemplateId"),
						 new Object [] { reasonForVisitSectionConsult }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionConsultCode(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionConsultCode(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '29299-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionConsultCode(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Consult Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionConsultCode(ReasonForVisitSectionConsult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '29299-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param reasonForVisitSectionConsult The receiving '<em><b>Reason For Visit Section Consult</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReasonForVisitSectionConsultCode(ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.REASON_FOR_VISIT_SECTION_CONSULT);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_VISIT_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForVisitSectionConsult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.REASON_FOR_VISIT_SECTION_CONSULT__REASON_FOR_VISIT_SECTION_CONSULT_CODE,
						 CDTPlugin.INSTANCE.getString("ReasonForVisitSectionConsultCode"),
						 new Object [] { reasonForVisitSectionConsult }));
			}
			return false;
		}
		return true;
	}

} // ReasonForVisitSectionConsultOperations