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
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purpose Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeSection#PurposeSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeSection#PurposeSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeSection#PurposeSection_title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeSection#PurposeSection_purposeActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section purpose Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurposeSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeSection_templateId(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_templateId(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #PurposeSection_templateId(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_templateId(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.13')
	 * @param purposeSection The receiving '<em><b>Purpose Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeSection_templateId(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_SECTION);
			try {
				PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_SECTION__PURPOSE_SECTION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PurposeSection_templateId"),
						 new Object [] { purposeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeSection_code(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_code(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '48764-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #PurposeSection_code(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_code(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '48764-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param purposeSection The receiving '<em><b>Purpose Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeSection_code(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_SECTION);
			try {
				PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_SECTION__PURPOSE_SECTION_CODE,
						 CCDPlugin.INSTANCE.getString("PurposeSection_code"),
						 new Object [] { purposeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeSection_title(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_title(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #PurposeSection_title(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_title(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param purposeSection The receiving '<em><b>Purpose Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeSection_title(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_SECTION);
			try {
				PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_SECTION__PURPOSE_SECTION_TITLE,
						 CCDPlugin.INSTANCE.getString("PurposeSection_title"),
						 new Object [] { purposeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeSection_purposeActivity(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section purpose Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_purposeActivity(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::PurposeActivity))";

	/**
	 * The cached OCL invariant for the '{@link #PurposeSection_purposeActivity(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Section purpose Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeSection_purposeActivity(PurposeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::PurposeActivity))
	 * @param purposeSection The receiving '<em><b>Purpose Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeSection_purposeActivity(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_SECTION);
			try {
				PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_SECTION__PURPOSE_SECTION_PURPOSE_ACTIVITY,
						 CCDPlugin.INSTANCE.getString("PurposeSection_purposeActivity"),
						 new Object [] { purposeSection }));
			}
			return false;
		}
		return true;
	}

} // PurposeSectionOperations