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

import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Conditional Dosing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ConditionalDosing#ConditionalDosing_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Conditional Dosing template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalDosingOperations extends MedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalDosingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ConditionalDosing_templateId(ConditionalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Conditional Dosing template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ConditionalDosing_templateId(ConditionalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.10')";

	/**
	 * The cached OCL invariant for the '{@link #ConditionalDosing_templateId(ConditionalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Conditional Dosing template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ConditionalDosing_templateId(ConditionalDosing, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CONDITIONAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.10')
	 * @param conditionalDosing The receiving '<em><b>Conditional Dosing</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ConditionalDosing_templateId(ConditionalDosing conditionalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CONDITIONAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CONDITIONAL_DOSING);
			try {
				CONDITIONAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CONDITIONAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CONDITIONAL_DOSING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionalDosing)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CONDITIONAL_DOSING__CONDITIONAL_DOSING_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ConditionalDosing_templateId"),
						 new Object [] { conditionalDosing }));
			}
			return false;
		}
		return true;
	}

} // ConditionalDosingOperations