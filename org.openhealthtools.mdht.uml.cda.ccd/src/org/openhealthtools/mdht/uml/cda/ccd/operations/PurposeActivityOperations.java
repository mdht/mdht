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
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purpose Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_hasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_reasonType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity reason Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_classCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_moodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity#PurposeActivity_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurposeActivityOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_hasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_hasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | "+
"  entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_hasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_hasReason(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | 
	 *   entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * 
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_hasReason(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_HAS_REASON,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_hasReason"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_reasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity reason Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_reasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(entryRelationship : cda::EntryRelationship |"+
"  entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON implies( "+
"  not (entryRelationship.act.oclIsUndefined() and entryRelationship.encounter.oclIsUndefined()"+
"       and entryRelationship.observation.oclIsUndefined() and entryRelationship.procedure.oclIsUndefined()"+
"       and entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.supply.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_reasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity reason Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_reasonType(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(entryRelationship : cda::EntryRelationship |
	 *   entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON implies( 
	 *   not (entryRelationship.act.oclIsUndefined() and entryRelationship.encounter.oclIsUndefined()
	 *        and entryRelationship.observation.oclIsUndefined() and entryRelationship.procedure.oclIsUndefined()
	 *        and entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.supply.oclIsUndefined())))
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_reasonType(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_REASON_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_REASON_TYPE,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_reasonType"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_templateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_templateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.30')";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_templateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_templateId(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.30')
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_templateId(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_templateId"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_classCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_classCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_classCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_classCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_classCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_classCode"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_moodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_moodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_moodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_moodCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_moodCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_moodCode"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_code(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_code(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '23745001' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_code(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_code(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '23745001' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_code(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CODE,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_code"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PurposeActivity_statusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_statusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')";

	/**
	 * The cached OCL invariant for the '{@link #PurposeActivity_statusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Activity status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PurposeActivity_statusCode(PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param purposeActivity The receiving '<em><b>Purpose Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PurposeActivity_statusCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PURPOSE_ACTIVITY);
			try {
				PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PURPOSE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(purposeActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("PurposeActivity_statusCode"),
						 new Object [] { purposeActivity }));
			}
			return false;
		}
		return true;
	}

} // PurposeActivityOperations