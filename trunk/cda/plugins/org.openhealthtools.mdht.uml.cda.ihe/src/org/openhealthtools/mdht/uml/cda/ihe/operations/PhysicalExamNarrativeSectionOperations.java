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
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection#PhysicalExamNarrativeSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Physical Exam Narrative Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection#PhysicalExamNarrativeSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Physical Exam Narrative Section code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExamNarrativeSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamNarrativeSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PhysicalExamNarrativeSection_templateId(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Physical Exam Narrative Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PhysicalExamNarrativeSection_templateId(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.24')";

	/**
	 * The cached OCL invariant for the '{@link #PhysicalExamNarrativeSection_templateId(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Physical Exam Narrative Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PhysicalExamNarrativeSection_templateId(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.24')
	 * @param physicalExamNarrativeSection The receiving '<em><b>Physical Exam Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PhysicalExamNarrativeSection_templateId(PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_NARRATIVE_SECTION);
			try {
				PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("PhysicalExamNarrativeSection_templateId"),
						 new Object [] { physicalExamNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PhysicalExamNarrativeSection_code(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Physical Exam Narrative Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PhysicalExamNarrativeSection_code(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_EXAM_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '29545-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #PhysicalExamNarrativeSection_code(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Physical Exam Narrative Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PhysicalExamNarrativeSection_code(PhysicalExamNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PHYSICAL_EXAM_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '29545-1' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param physicalExamNarrativeSection The receiving '<em><b>Physical Exam Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PhysicalExamNarrativeSection_code(PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PHYSICAL_EXAM_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_NARRATIVE_SECTION);
			try {
				PHYSICAL_EXAM_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PHYSICAL_EXAM_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PHYSICAL_EXAM_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicalExamNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("PhysicalExamNarrativeSection_code"),
						 new Object [] { physicalExamNarrativeSection }));
			}
			return false;
		}
		return true;
	}

} // PhysicalExamNarrativeSectionOperations