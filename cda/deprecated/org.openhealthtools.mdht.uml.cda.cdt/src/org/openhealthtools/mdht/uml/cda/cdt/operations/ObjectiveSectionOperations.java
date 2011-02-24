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
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Objective Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection#validateObjectiveSectionHasClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Has Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection#validateObjectiveSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection#validateObjectiveSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection#validateObjectiveSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection#validateObjectiveSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObjectiveSectionHasClinicalStatements(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Has Clinical Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionHasClinicalStatements(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateObjectiveSectionHasClinicalStatements(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Has Clinical Statements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionHasClinicalStatements(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->isEmpty()
	 * @param objectiveSection The receiving '<em><b>Objective Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObjectiveSectionHasClinicalStatements(ObjectiveSection objectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.OBJECTIVE_SECTION);
			try {
				VALIDATE_OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(objectiveSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.OBJECTIVE_SECTION__OBJECTIVE_SECTION_HAS_CLINICAL_STATEMENTS,
						 CDTPlugin.INSTANCE.getString("ObjectiveSectionHasClinicalStatements"),
						 new Object [] { objectiveSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObjectiveSectionTemplateId(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionTemplateId(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateObjectiveSectionTemplateId(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionTemplateId(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.1')
	 * @param objectiveSection The receiving '<em><b>Objective Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObjectiveSectionTemplateId(ObjectiveSection objectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.OBJECTIVE_SECTION);
			try {
				VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBJECTIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(objectiveSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.OBJECTIVE_SECTION__OBJECTIVE_SECTION_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("ObjectiveSectionTemplateId"),
						 new Object [] { objectiveSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObjectiveSectionCode(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionCode(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = 'OBJEC-X' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateObjectiveSectionCode(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionCode(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = 'OBJEC-X' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param objectiveSection The receiving '<em><b>Objective Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObjectiveSectionCode(ObjectiveSection objectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.OBJECTIVE_SECTION);
			try {
				VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBJECTIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(objectiveSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.OBJECTIVE_SECTION__OBJECTIVE_SECTION_CODE,
						 CDTPlugin.INSTANCE.getString("ObjectiveSectionCode"),
						 new Object [] { objectiveSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObjectiveSectionText(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionText(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateObjectiveSectionText(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionText(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param objectiveSection The receiving '<em><b>Objective Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObjectiveSectionText(ObjectiveSection objectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.OBJECTIVE_SECTION);
			try {
				VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBJECTIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(objectiveSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.OBJECTIVE_SECTION__OBJECTIVE_SECTION_TEXT,
						 CDTPlugin.INSTANCE.getString("ObjectiveSectionText"),
						 new Object [] { objectiveSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObjectiveSectionTitle(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionTitle(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateObjectiveSectionTitle(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Objective Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObjectiveSectionTitle(ObjectiveSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param objectiveSection The receiving '<em><b>Objective Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObjectiveSectionTitle(ObjectiveSection objectiveSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.OBJECTIVE_SECTION);
			try {
				VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBJECTIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(objectiveSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.OBJECTIVE_SECTION__OBJECTIVE_SECTION_TITLE,
						 CDTPlugin.INSTANCE.getString("ObjectiveSectionTitle"),
						 new Object [] { objectiveSection }));
			}
			return false;
		}
		return true;
	}

} // ObjectiveSectionOperations