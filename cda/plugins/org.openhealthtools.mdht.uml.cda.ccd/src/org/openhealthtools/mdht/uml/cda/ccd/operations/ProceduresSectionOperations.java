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
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#ProceduresSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#ProceduresSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#ProceduresSection_title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection#ProceduresSection_procedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section procedure Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProceduresSection_templateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_templateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.12')";

	/**
	 * The cached OCL invariant for the '{@link #ProceduresSection_templateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_templateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.12')
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProceduresSection_templateId(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ProceduresSection_templateId"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProceduresSection_code(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_code(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #ProceduresSection_code(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_code(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProceduresSection_code(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_CODE,
						 CCDPlugin.INSTANCE.getString("ProceduresSection_code"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProceduresSection_title(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_title(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #ProceduresSection_title(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_title(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProceduresSection_title(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE,
						 CCDPlugin.INSTANCE.getString("ProceduresSection_title"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProceduresSection_procedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_procedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::ProcedureActivity))";

	/**
	 * The cached OCL invariant for the '{@link #ProceduresSection_procedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedures Section procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProceduresSection_procedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::ProcedureActivity))
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProceduresSection_procedureActivity(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURES_SECTION);
			try {
				PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_PROCEDURE_ACTIVITY,
						 CCDPlugin.INSTANCE.getString("ProceduresSection_procedureActivity"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

} // ProceduresSectionOperations