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
import org.openhealthtools.mdht.uml.cda.ccd.PayerEntity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payer Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PayerEntity#validatePayerEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayerEntityOperations extends RoleOperations {
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
	protected PayerEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerEntityId(PayerEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntityId(PayerEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerEntityId(PayerEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerEntityId(PayerEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param payerEntity The receiving '<em><b>Payer Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePayerEntityId(PayerEntity payerEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PAYER_ENTITY);
			try {
				VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payerEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PAYER_ENTITY__PAYER_ENTITY_ID,
						 CCDPlugin.INSTANCE.getString("PayerEntityId"),
						 new Object [] { payerEntity }));
			}
			return false;
		}
		return true;
	}

} // PayerEntityOperations