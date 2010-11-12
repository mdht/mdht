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
import org.openhealthtools.mdht.uml.cda.ccd.impl.SupportParticipantImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactParticipantOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Contact Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientContactParticipantImpl extends SupportParticipantImpl implements PatientContactParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientContactParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PATIENT_CONTACT_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipantTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactParticipantOperations.validatePatientContactParticipantTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipantTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactParticipantOperations.validatePatientContactParticipantTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientContactParticipantOperations.validatePatientContactParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContactParticipant init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PatientContactParticipantImpl
