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
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Visit And Chief Complaint Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection#validateReasonForVisitAndChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit And Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection#validateReasonForVisitAndChiefComplaintSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit And Chief Complaint Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForVisitAndChiefComplaintSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForVisitAndChiefComplaintSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitAndChiefComplaintSectionTemplateId(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit And Chief Complaint Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitAndChiefComplaintSectionTemplateId(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitAndChiefComplaintSectionTemplateId(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit And Chief Complaint Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitAndChiefComplaintSectionTemplateId(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.8')
	 * @param reasonForVisitAndChiefComplaintSection The receiving '<em><b>Reason For Visit And Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReasonForVisitAndChiefComplaintSectionTemplateId(ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForVisitAndChiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION__REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("ReasonForVisitAndChiefComplaintSectionTemplateId"),
						 new Object [] { reasonForVisitAndChiefComplaintSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitAndChiefComplaintSectionCode(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit And Chief Complaint Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitAndChiefComplaintSectionCode(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '46239-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitAndChiefComplaintSectionCode(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit And Chief Complaint Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitAndChiefComplaintSectionCode(ReasonForVisitAndChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '46239-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param reasonForVisitAndChiefComplaintSection The receiving '<em><b>Reason For Visit And Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReasonForVisitAndChiefComplaintSectionCode(ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForVisitAndChiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION__REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE,
						 CDTPlugin.INSTANCE.getString("ReasonForVisitAndChiefComplaintSectionCode"),
						 new Object [] { reasonForVisitAndChiefComplaintSection }));
			}
			return false;
		}
		return true;
	}

} // ReasonForVisitAndChiefComplaintSectionOperations