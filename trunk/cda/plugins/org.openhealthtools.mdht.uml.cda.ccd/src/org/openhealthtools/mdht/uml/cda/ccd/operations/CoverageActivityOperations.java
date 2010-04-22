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
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity#validateCoverageActivityPolicyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageActivityOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.20')
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityTemplateId(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("CoverageActivityTemplateId"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityClassCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityClassCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("CoverageActivityClassCode"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityMoodCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::DEF
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityMoodCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("CoverageActivityMoodCode"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityId(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("CoverageActivityId"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityStatusCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed')
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityStatusCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("CoverageActivityStatusCode"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCode(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CODE,
						 CCDPlugin.INSTANCE.getString("CoverageActivityCode"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::PolicyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::PolicyActivity))
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoverageActivityPolicyActivity(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_POLICY_ACTIVITY,
						 CCDPlugin.INSTANCE.getString("CoverageActivityPolicyActivity"),
						 new Object [] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

} // CoverageActivityOperations