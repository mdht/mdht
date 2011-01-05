/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryProcedureActivityProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureHasCodeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureHasCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedurePerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Procedure#validateHITSPProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureOperations extends ProcedureEntryProcedureActivityProcedureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPProcedureHasCodeCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureHasCodeCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PROCEDURE_HAS_CODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPProcedureHasCodeCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureHasCodeCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PROCEDURE_HAS_CODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.code.oclIsUndefined()
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPProcedureHasCodeCode(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PROCEDURE_HAS_CODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROCEDURE);
			try {
				VALIDATE_HITSP_PROCEDURE_HAS_CODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PROCEDURE_HAS_CODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PROCEDURE_HAS_CODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROCEDURE__HITSP_PROCEDURE_HAS_CODE_CODE,
						 HITSPPlugin.INSTANCE.getString("HITSPProcedureHasCodeCode"),
						 new Object [] { procedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPProcedureHasCodeOriginalText(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureHasCodeOriginalText(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.reference.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPProcedureHasCodeOriginalText(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Has Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureHasCodeOriginalText(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.reference.value.oclIsUndefined()
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPProcedureHasCodeOriginalText(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROCEDURE);
			try {
				VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROCEDURE__HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT,
						 HITSPPlugin.INSTANCE.getString("HITSPProcedureHasCodeOriginalText"),
						 new Object [] { procedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPProcedurePerformerAssignedEntity(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedurePerformerAssignedEntity(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->forAll(perf : cda::Performer2 | not perf.oclIsUndefined() and perf.assignedEntity->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPProcedurePerformerAssignedEntity(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedurePerformerAssignedEntity(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->forAll(perf : cda::Performer2 | not perf.oclIsUndefined() and perf.assignedEntity->size() > 0)
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPProcedurePerformerAssignedEntity(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROCEDURE);
			try {
				VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROCEDURE__HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY,
						 HITSPPlugin.INSTANCE.getString("HITSPProcedurePerformerAssignedEntity"),
						 new Object [] { procedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.17')
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPProcedureTemplateId(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROCEDURE);
			try {
				VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROCEDURE__HITSP_PROCEDURE_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("HITSPProcedureTemplateId"),
						 new Object [] { procedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPProcedureTargetSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureTargetSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPProcedureTargetSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Procedure Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPProcedureTargetSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPProcedureTargetSiteCode(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROCEDURE);
			try {
				VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROCEDURE__HITSP_PROCEDURE_TARGET_SITE_CODE,
						 HITSPPlugin.INSTANCE.getString("HITSPProcedureTargetSiteCode"),
						 new Object [] { procedure }));
			}
			return false;
		}
		return true;
	}

} // ProcedureOperations