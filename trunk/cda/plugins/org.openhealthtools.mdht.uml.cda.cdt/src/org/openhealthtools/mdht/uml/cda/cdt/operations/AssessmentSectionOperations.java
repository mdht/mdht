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
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection#validateAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection#validateAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentSectionTemplateId(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionTemplateId(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentSectionTemplateId(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionTemplateId(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.7')
	 * @param assessmentSection The receiving '<em><b>Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentSectionTemplateId(AssessmentSection assessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.ASSESSMENT_SECTION);
			try {
				VALIDATE_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.ASSESSMENT_SECTION__ASSESSMENT_SECTION_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("AssessmentSectionTemplateId"),
						 new Object [] { assessmentSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentSectionCode(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionCode(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '51848-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentSectionCode(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionCode(AssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '51848-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param assessmentSection The receiving '<em><b>Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentSectionCode(AssessmentSection assessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.ASSESSMENT_SECTION);
			try {
				VALIDATE_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.ASSESSMENT_SECTION__ASSESSMENT_SECTION_CODE,
						 CDTPlugin.INSTANCE.getString("AssessmentSectionCode"),
						 new Object [] { assessmentSection }));
			}
			return false;
		}
		return true;
	}

} // AssessmentSectionOperations