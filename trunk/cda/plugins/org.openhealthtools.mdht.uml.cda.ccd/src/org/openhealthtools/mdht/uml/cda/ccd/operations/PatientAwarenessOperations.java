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
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Awareness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#PatientAwareness_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Patient Awareness template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientAwarenessOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientAwarenessOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PatientAwareness_templateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Patient Awareness template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PatientAwareness_templateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.48')";

	/**
	 * The cached OCL invariant for the '{@link #PatientAwareness_templateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Patient Awareness template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PatientAwareness_templateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.48')
	 * @param patientAwareness The receiving '<em><b>Patient Awareness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PatientAwareness_templateId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PATIENT_AWARENESS);
			try {
				PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientAwareness)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PatientAwareness_templateId"),
						 new Object [] { patientAwareness }));
			}
			return false;
		}
		return true;
	}

} // PatientAwarenessOperations