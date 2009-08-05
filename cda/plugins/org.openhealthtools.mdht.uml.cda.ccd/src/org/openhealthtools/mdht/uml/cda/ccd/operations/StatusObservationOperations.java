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
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#StatusObservation_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#StatusObservation_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#StatusObservation_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#StatusObservation_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusObservationOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #StatusObservation_templateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_templateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.57')";

	/**
	 * The cached OCL invariant for the '{@link #StatusObservation_templateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_templateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.57')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean StatusObservation_templateId(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("StatusObservation_templateId"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #StatusObservation_code(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_code(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1' and value.codeSystemName = 'LOINC')";

	/**
	 * The cached OCL invariant for the '{@link #StatusObservation_code(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_code(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1' and value.codeSystemName = 'LOINC')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean StatusObservation_code(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_CODE,
						 CCDPlugin.INSTANCE.getString("StatusObservation_code"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #StatusObservation_statusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_statusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsTypeOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14' and value.codeSystemName = 'ActStatus')";

	/**
	 * The cached OCL invariant for the '{@link #StatusObservation_statusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_statusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsTypeOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14' and value.codeSystemName = 'ActStatus')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean StatusObservation_statusCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("StatusObservation_statusCode"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #StatusObservation_value(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_value(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE))";

	/**
	 * The cached OCL invariant for the '{@link #StatusObservation_value(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Status Observation value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StatusObservation_value(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE))
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean StatusObservation_value(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE,
						 CCDPlugin.INSTANCE.getString("StatusObservation_value"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

} // StatusObservationOperations