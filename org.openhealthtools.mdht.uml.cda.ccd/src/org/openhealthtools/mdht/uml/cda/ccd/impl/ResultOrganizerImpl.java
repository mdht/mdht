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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.impl.ResultOrganizerImpl#getSpecimen <em>Specimen</em>}</li>
 * </ul>
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
	@Override
	public EList<Specimen> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectResolvingEList<Specimen>(Specimen.class, this, CCDPackage.RESULT_ORGANIZER__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecimen() {
		return specimen != null && !specimen.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultOrganizer_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.ResultOrganizer_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultOrganizer_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.ResultOrganizer_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultOrganizer_id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.ResultOrganizer_id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultOrganizer_resultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.ResultOrganizer_resultObservation(this, diagnostics, context);
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
