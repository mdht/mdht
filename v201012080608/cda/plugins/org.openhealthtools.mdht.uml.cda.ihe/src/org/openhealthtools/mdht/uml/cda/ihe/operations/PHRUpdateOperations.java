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
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHR Update</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate#validatePHRUpdateTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHR Update Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PHRUpdateOperations extends MedicalSummaryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PHRUpdateOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePHRUpdateTemplateId(PHRUpdate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHR Update Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHRUpdateTemplateId(PHRUpdate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.6')";

	/**
	 * The cached OCL invariant for the '{@link #validatePHRUpdateTemplateId(PHRUpdate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHR Update Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHRUpdateTemplateId(PHRUpdate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.6')
	 * @param phrUpdate The receiving '<em><b>PHR Update</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePHRUpdateTemplateId(PHRUpdate phrUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHR_UPDATE);
			try {
				VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phrUpdate)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PHR_UPDATE__PHR_UPDATE_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("PHRUpdateTemplateId"),
						 new Object [] { phrUpdate }));
			}
			return false;
		}
		return true;
	}

} // PHRUpdateOperations