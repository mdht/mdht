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
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;

import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Present Illness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness#HistoryOfPresentIllness_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>History Of Present Illness template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryOfPresentIllnessOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.HistoryOfPresentIllnessOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfPresentIllnessOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #HistoryOfPresentIllness_templateId(HistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>History Of Present Illness template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HistoryOfPresentIllness_templateId(HistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.107')";

	/**
	 * The cached OCL invariant for the '{@link #HistoryOfPresentIllness_templateId(HistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>History Of Present Illness template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HistoryOfPresentIllness_templateId(HistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.107')
	 * @param historyOfPresentIllness The receiving '<em><b>History Of Present Illness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean HistoryOfPresentIllness_templateId(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.HISTORY_OF_PRESENT_ILLNESS);
			try {
				HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPresentIllness)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("HistoryOfPresentIllness_templateId"),
						 new Object [] { historyOfPresentIllness }));
			}
			return false;
		}
		return true;
	}

} // HistoryOfPresentIllnessOperations