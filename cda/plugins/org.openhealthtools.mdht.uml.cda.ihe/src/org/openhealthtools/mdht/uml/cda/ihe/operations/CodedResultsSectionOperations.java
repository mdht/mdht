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

import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#CodedResultsSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Results Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#CodedResultsSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Results Section code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedResultsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #CodedResultsSection_templateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Results Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CodedResultsSection_templateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.28')";

	/**
	 * The cached OCL invariant for the '{@link #CodedResultsSection_templateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Results Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CodedResultsSection_templateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.28')
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean CodedResultsSection_templateId(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("CodedResultsSection_templateId"),
						 new Object [] { codedResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #CodedResultsSection_code(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Results Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CodedResultsSection_code(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #CodedResultsSection_code(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Results Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CodedResultsSection_code(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean CodedResultsSection_code(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("CodedResultsSection_code"),
						 new Object [] { codedResultsSection }));
			}
			return false;
		}
		return true;
	}

} // CodedResultsSectionOperations