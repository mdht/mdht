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
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PayersSection#PayersSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PayersSection#PayersSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PayersSection#PayersSection_title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayersSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PayersSection_templateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PayersSection_templateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.9')";

	/**
	 * The cached OCL invariant for the '{@link #PayersSection_templateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PayersSection_templateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.9')
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PayersSection_templateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PAYERS_SECTION);
			try {
				PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PAYERS_SECTION__PAYERS_SECTION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PayersSection_templateId"),
						 new Object [] { payersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PayersSection_code(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PayersSection_code(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #PayersSection_code(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PayersSection_code(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PayersSection_code(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PAYERS_SECTION);
			try {
				PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PAYERS_SECTION__PAYERS_SECTION_CODE,
						 CCDPlugin.INSTANCE.getString("PayersSection_code"),
						 new Object [] { payersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PayersSection_title(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PayersSection_title(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #PayersSection_title(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Payers Section title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PayersSection_title(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PayersSection_title(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PAYERS_SECTION);
			try {
				PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PAYERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PAYERS_SECTION__PAYERS_SECTION_TITLE,
						 CCDPlugin.INSTANCE.getString("PayersSection_title"),
						 new Object [] { payersSection }));
			}
			return false;
		}
		return true;
	}

} // PayersSectionOperations