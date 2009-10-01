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
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;

import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSign#VitalSign_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Vital Sign template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignOperations extends VitalSignObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #VitalSign_templateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Vital Sign template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VitalSign_templateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.14')";

	/**
	 * The cached OCL invariant for the '{@link #VitalSign_templateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Vital Sign template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VitalSign_templateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.14')
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean VitalSign_templateId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.VITAL_SIGN);
			try {
				VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("VitalSign_templateId"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

} // VitalSignOperations