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
import org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Plan Description</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription#validateCoveragePlanDescriptionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription#validateCoveragePlanDescriptionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription#validateCoveragePlanDescriptionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoveragePlanDescriptionOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoveragePlanDescriptionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoveragePlanDescriptionClassCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlanDescriptionClassCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateCoveragePlanDescriptionClassCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlanDescriptionClassCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param coveragePlanDescription The receiving '<em><b>Coverage Plan Description</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoveragePlanDescriptionClassCode(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_PLAN_DESCRIPTION);
			try {
				VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_PLAN_DESCRIPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coveragePlanDescription)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("CoveragePlanDescriptionClassCode"),
						 new Object [] { coveragePlanDescription }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoveragePlanDescriptionId(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlanDescriptionId(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateCoveragePlanDescriptionId(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlanDescriptionId(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param coveragePlanDescription The receiving '<em><b>Coverage Plan Description</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoveragePlanDescriptionId(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_PLAN_DESCRIPTION);
			try {
				VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_PLAN_DESCRIPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coveragePlanDescription)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_ID,
						 CCDPlugin.INSTANCE.getString("CoveragePlanDescriptionId"),
						 new Object [] { coveragePlanDescription }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoveragePlanDescriptionMoodCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlanDescriptionMoodCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateCoveragePlanDescriptionMoodCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Plan Description Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlanDescriptionMoodCode(CoveragePlanDescription, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::DEF
	 * @param coveragePlanDescription The receiving '<em><b>Coverage Plan Description</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCoveragePlanDescriptionMoodCode(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.COVERAGE_PLAN_DESCRIPTION);
			try {
				VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_PLAN_DESCRIPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coveragePlanDescription)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("CoveragePlanDescriptionMoodCode"),
						 new Object [] { coveragePlanDescription }));
			}
			return false;
		}
		return true;
	}

} // CoveragePlanDescriptionOperations