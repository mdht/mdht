/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;
import org.openhealthtools.mdht.uml.cda.pilot.operations.TuberculosisFollowUpProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuberculosis Follow Up Progress Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisFollowUpProgressNoteImpl extends ClinicalDocumentImpl implements TuberculosisFollowUpProgressNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisFollowUpProgressNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNotePatientNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisFollowUpProgressNoteOperations.validateTuberculosisFollowUpProgressNotePatientNames(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisFollowUpProgressNoteOperations.validateTuberculosisFollowUpProgressNoteTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNoteTBResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisFollowUpProgressNoteOperations.validateTuberculosisFollowUpProgressNoteTBResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultsSection getTbResultsSection() {
		return TuberculosisFollowUpProgressNoteOperations.getTbResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisFollowUpProgressNote init() {
    		CDAUtil.init(this);
    		return this;
	}
} //TuberculosisFollowUpProgressNoteImpl
