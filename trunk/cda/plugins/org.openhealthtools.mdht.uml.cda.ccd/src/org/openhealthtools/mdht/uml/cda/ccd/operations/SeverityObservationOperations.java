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
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Severity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation#validateSeverityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation#validateSeverityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation#validateSeverityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation#validateSeverityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeverityObservationOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeverityObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeverityObservationTemplateId(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationTemplateId(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.55')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeverityObservationTemplateId(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationTemplateId(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.55')
	 * @param severityObservation The receiving '<em><b>Severity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSeverityObservationTemplateId(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SEVERITY_OBSERVATION);
			try {
				VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SEVERITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(severityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("SeverityObservationTemplateId"),
						 new Object [] { severityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeverityObservationCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'SEV' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeverityObservationCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'SEV' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param severityObservation The receiving '<em><b>Severity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSeverityObservationCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SEVERITY_OBSERVATION);
			try {
				VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SEVERITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(severityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CODE,
						 CCDPlugin.INSTANCE.getString("SeverityObservationCode"),
						 new Object [] { severityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeverityObservationStatusCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationStatusCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeverityObservationStatusCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationStatusCode(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param severityObservation The receiving '<em><b>Severity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSeverityObservationStatusCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SEVERITY_OBSERVATION);
			try {
				VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SEVERITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(severityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("SeverityObservationStatusCode"),
						 new Object [] { severityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeverityObservationValue(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationValue(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateSeverityObservationValue(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Severity Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeverityObservationValue(SeverityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1
	 * @param severityObservation The receiving '<em><b>Severity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSeverityObservationValue(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SEVERITY_OBSERVATION);
			try {
				VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SEVERITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(severityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_VALUE,
						 CCDPlugin.INSTANCE.getString("SeverityObservationValue"),
						 new Object [] { severityObservation }));
			}
			return false;
		}
		return true;
	}

} // SeverityObservationOperations