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
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Review Of Systems Section IHE</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE#validateReviewOfSystemsSectionIHETemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE#validateReviewOfSystemsSectionIHECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReviewOfSystemsSectionIHEOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewOfSystemsSectionIHEOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReviewOfSystemsSectionIHETemplateId(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReviewOfSystemsSectionIHETemplateId(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateReviewOfSystemsSectionIHETemplateId(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReviewOfSystemsSectionIHETemplateId(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.18')
	 * @param reviewOfSystemsSectionIHE The receiving '<em><b>Review Of Systems Section IHE</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReviewOfSystemsSectionIHETemplateId(ReviewOfSystemsSectionIHE reviewOfSystemsSectionIHE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.REVIEW_OF_SYSTEMS_SECTION_IHE);
			try {
				VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reviewOfSystemsSectionIHE)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.REVIEW_OF_SYSTEMS_SECTION_IHE__REVIEW_OF_SYSTEMS_SECTION_IHE_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("ReviewOfSystemsSectionIHETemplateId"),
						 new Object [] { reviewOfSystemsSectionIHE }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReviewOfSystemsSectionIHECode(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReviewOfSystemsSectionIHECode(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '10187-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReviewOfSystemsSectionIHECode(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Review Of Systems Section IHE Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReviewOfSystemsSectionIHECode(ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10187-3' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param reviewOfSystemsSectionIHE The receiving '<em><b>Review Of Systems Section IHE</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateReviewOfSystemsSectionIHECode(ReviewOfSystemsSectionIHE reviewOfSystemsSectionIHE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.REVIEW_OF_SYSTEMS_SECTION_IHE);
			try {
				VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REVIEW_OF_SYSTEMS_SECTION_IHE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reviewOfSystemsSectionIHE)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.REVIEW_OF_SYSTEMS_SECTION_IHE__REVIEW_OF_SYSTEMS_SECTION_IHE_CODE,
						 CDTPlugin.INSTANCE.getString("ReviewOfSystemsSectionIHECode"),
						 new Object [] { reviewOfSystemsSectionIHE }));
			}
			return false;
		}
		return true;
	}

} // ReviewOfSystemsSectionIHEOperations