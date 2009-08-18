/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPlugin;

import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDosing;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Normal Dosing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.NormalDosing#NormalDosing_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Normal Dosing template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalDosingOperations extends MedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalDosingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #NormalDosing_templateId(NormalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Normal Dosing template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NormalDosing_templateId(NormalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.7.1')";

	/**
	 * The cached OCL invariant for the '{@link #NormalDosing_templateId(NormalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Normal Dosing template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NormalDosing_templateId(NormalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.7.1')
	 * @param normalDosing The receiving '<em><b>Normal Dosing</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean NormalDosing_templateId(NormalDosing normalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.NORMAL_DOSING);
			try {
				NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(normalDosing)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.NORMAL_DOSING__NORMAL_DOSING_TEMPLATE_ID,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NormalDosing_templateId", NORMAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(normalDosing, context) }),
						 new Object [] { normalDosing }));
			}
			return false;
		}
		return true;
	}

} // NormalDosingOperations