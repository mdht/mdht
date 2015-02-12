/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ncr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.ncr.BirthWeight;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPlugin;
import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateBirthWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.BirthWeight#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BirthWeightOperations extends ResultObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirthWeightOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightClassCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightClassCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_CLASS_CODE,
						 NCRPlugin.INSTANCE.getString("BirthWeightClassCode"),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightMoodCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightMoodCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_MOOD_CODE,
						 NCRPlugin.INSTANCE.getString("BirthWeightMoodCode"),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ))";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Weight Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthWeightValue(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ))
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBirthWeightValue(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTH_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__BIRTH_WEIGHT_VALUE,
						 NCRPlugin.INSTANCE.getString("BirthWeightValue"),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.3.1')
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultObservationTemplateId(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__RESULT_OBSERVATION_TEMPLATE_ID,
						 NCRPlugin.INSTANCE.getString("ResultObservationTemplateId"),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '47340003' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '47340003' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultObservationCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__RESULT_OBSERVATION_CODE,
						 NCRPlugin.INSTANCE.getString("ResultObservationCode"),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationStatusCode(BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed')
	 * @param birthWeight The receiving '<em><b>Birth Weight</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultObservationStatusCode(BirthWeight birthWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.BIRTH_WEIGHT);
			try {
				VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthWeight)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.BIRTH_WEIGHT__RESULT_OBSERVATION_STATUS_CODE,
						 NCRPlugin.INSTANCE.getString("ResultObservationStatusCode"),
						 new Object [] { birthWeight }));
			}
			return false;
		}
		return true;
	}

} // BirthWeightOperations