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
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Series Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#MedicationSeriesNumberObservation_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#MedicationSeriesNumberObservation_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#MedicationSeriesNumberObservation_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#MedicationSeriesNumberObservation_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationSeriesNumberObservationOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSeriesNumberObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationSeriesNumberObservation_templateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_templateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.46')";

	/**
	 * The cached OCL invariant for the '{@link #MedicationSeriesNumberObservation_templateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_templateId(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.46')
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationSeriesNumberObservation_templateId(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("MedicationSeriesNumberObservation_templateId"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationSeriesNumberObservation_statusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_statusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #MedicationSeriesNumberObservation_statusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_statusCode(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined()
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationSeriesNumberObservation_statusCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationSeriesNumberObservation_statusCode"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationSeriesNumberObservation_code(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_code(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '30973-2' and value.codeSystem = '2.16.840.1.113883.6.1' and value.codeSystemName = 'LOINC')";

	/**
	 * The cached OCL invariant for the '{@link #MedicationSeriesNumberObservation_code(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_code(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '30973-2' and value.codeSystem = '2.16.840.1.113883.6.1' and value.codeSystemName = 'LOINC')
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationSeriesNumberObservation_code(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationSeriesNumberObservation_code"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationSeriesNumberObservation_value(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_value(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT))";

	/**
	 * The cached OCL invariant for the '{@link #MedicationSeriesNumberObservation_value(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Series Number Observation value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationSeriesNumberObservation_value(MedicationSeriesNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT))
	 * @param medicationSeriesNumberObservation The receiving '<em><b>Medication Series Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationSeriesNumberObservation_value(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION);
			try {
				MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationSeriesNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE,
						 CCDPlugin.INSTANCE.getString("MedicationSeriesNumberObservation_value"),
						 new Object [] { medicationSeriesNumberObservation }));
			}
			return false;
		}
		return true;
	}

} // MedicationSeriesNumberObservationOperations