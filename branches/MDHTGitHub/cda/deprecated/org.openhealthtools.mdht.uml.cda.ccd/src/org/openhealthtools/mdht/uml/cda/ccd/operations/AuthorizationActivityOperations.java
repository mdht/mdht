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
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authorization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationActivityOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.19')
	 * @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAuthorizationActivityTemplateId(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("AuthorizationActivityTemplateId"),
						 new Object [] { authorizationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAuthorizationActivityClassCode(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("AuthorizationActivityClassCode"),
						 new Object [] { authorizationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAuthorizationActivityMoodCode(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("AuthorizationActivityMoodCode"),
						 new Object [] { authorizationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAuthorizationActivityId(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("AuthorizationActivityId"),
						 new Object [] { authorizationActivity }));
			}
			return false;
		}
		return true;
	}

} // AuthorizationActivityOperations