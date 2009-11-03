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
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection#ReasonForReferralSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reason For Referral Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection#ReasonForReferralSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reason For Referral Section code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForReferralSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForReferralSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ReasonForReferralSection_templateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reason For Referral Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ReasonForReferralSection_templateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #ReasonForReferralSection_templateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reason For Referral Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ReasonForReferralSection_templateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.1')
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ReasonForReferralSection_templateId(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ReasonForReferralSection_templateId"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ReasonForReferralSection_code(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reason For Referral Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ReasonForReferralSection_code(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '42349-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #ReasonForReferralSection_code(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reason For Referral Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ReasonForReferralSection_code(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '42349-1' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ReasonForReferralSection_code(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("ReasonForReferralSection_code"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

} // ReasonForReferralSectionOperations