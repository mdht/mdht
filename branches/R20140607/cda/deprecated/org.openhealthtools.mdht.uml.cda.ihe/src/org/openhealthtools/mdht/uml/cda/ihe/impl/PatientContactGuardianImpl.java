/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.SupportGuardianImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Contact Guardian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientContactGuardianImpl extends SupportGuardianImpl implements PatientContactGuardian {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientContactGuardianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PATIENT_CONTACT_GUARDIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardianTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactGuardianOperations.validatePatientContactGuardianTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardianAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactGuardianOperations.validatePatientContactGuardianAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardianClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactGuardianOperations.validatePatientContactGuardianClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardianCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactGuardianOperations.validatePatientContactGuardianCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardianTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactGuardianOperations.validatePatientContactGuardianTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContactGuardian init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PatientContactGuardianImpl
