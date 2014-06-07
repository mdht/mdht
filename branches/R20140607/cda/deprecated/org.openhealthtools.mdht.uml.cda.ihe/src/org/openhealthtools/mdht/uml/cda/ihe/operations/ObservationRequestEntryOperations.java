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
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ObservationRequestEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observation Request Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ObservationRequestEntry#validateObservationRequestEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Request Entry Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationRequestEntryOperations extends PlanOfCareActivityObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationRequestEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationRequestEntryTemplateId(ObservationRequestEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Request Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationRequestEntryTemplateId(ObservationRequestEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.20.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationRequestEntryTemplateId(ObservationRequestEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Request Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationRequestEntryTemplateId(ObservationRequestEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.20.3.1')
	 * @param observationRequestEntry The receiving '<em><b>Observation Request Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationRequestEntryTemplateId(ObservationRequestEntry observationRequestEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.OBSERVATION_REQUEST_ENTRY);
			try {
				VALIDATE_OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observationRequestEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.OBSERVATION_REQUEST_ENTRY__OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ObservationRequestEntryTemplateId"),
						 new Object [] { observationRequestEntry }));
			}
			return false;
		}
		return true;
	}

} // ObservationRequestEntryOperations