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
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#FunctionalStatusSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#FunctionalStatusSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#FunctionalStatusSection_title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#FunctionalStatusSection_problemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#FunctionalStatusSection_resultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section result Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #FunctionalStatusSection_templateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_templateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.5')";

	/**
	 * The cached OCL invariant for the '{@link #FunctionalStatusSection_templateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_templateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.5')
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FunctionalStatusSection_templateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("FunctionalStatusSection_templateId"),
						 new Object [] { functionalStatusSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #FunctionalStatusSection_code(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_code(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '47420-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #FunctionalStatusSection_code(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_code(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '47420-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FunctionalStatusSection_code(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CODE,
						 CCDPlugin.INSTANCE.getString("FunctionalStatusSection_code"),
						 new Object [] { functionalStatusSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #FunctionalStatusSection_title(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_title(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #FunctionalStatusSection_title(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_title(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FunctionalStatusSection_title(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TITLE,
						 CCDPlugin.INSTANCE.getString("FunctionalStatusSection_title"),
						 new Object [] { functionalStatusSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #FunctionalStatusSection_problemAct(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_problemAct(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::ProblemAct))";

	/**
	 * The cached OCL invariant for the '{@link #FunctionalStatusSection_problemAct(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_problemAct(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::ProblemAct))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FunctionalStatusSection_problemAct(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT,
						 CCDPlugin.INSTANCE.getString("FunctionalStatusSection_problemAct"),
						 new Object [] { functionalStatusSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #FunctionalStatusSection_resultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_resultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ccd::ResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #FunctionalStatusSection_resultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Functional Status Section result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FunctionalStatusSection_resultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ccd::ResultOrganizer))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FunctionalStatusSection_resultOrganizer(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER,
						 CCDPlugin.INSTANCE.getString("FunctionalStatusSection_resultOrganizer"),
						 new Object [] { functionalStatusSection }));
			}
			return false;
		}
		return true;
	}

} // FunctionalStatusSectionOperations