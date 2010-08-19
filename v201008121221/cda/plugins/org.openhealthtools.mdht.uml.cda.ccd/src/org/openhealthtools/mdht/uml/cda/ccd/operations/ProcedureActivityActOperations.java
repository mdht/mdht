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
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityActOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.29')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.29')
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureActivityActTemplateId(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ProcedureActivityActTemplateId"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

} // ProcedureActivityActOperations