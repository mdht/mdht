/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerImpl extends OrganizerImpl implements ResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.RESULT_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerComponentElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerComponentElement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultObservation> getResultObservations() {
		return ResultOrganizerOperations.getResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ResultOrganizerImpl
