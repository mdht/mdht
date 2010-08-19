/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ResultsSectionImpl;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TB Results Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TBResultsSectionImpl extends ResultsSectionImpl implements TBResultsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBResultsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TBPNPackage.Literals.TB_RESULTS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultsSectionOperations.validateTBResultsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultsSectionOperations.validateTBResultsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSectionTBResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultsSectionOperations.validateTBResultsSectionTBResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultsSectionTBResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultsSectionOperations.validateTBResultsSectionTBResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TBResultOrganizer> getTbResultOrganizers() {
		return TBResultsSectionOperations.getTbResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TBResultObservation> getTbResultObservations() {
		return TBResultsSectionOperations.getTbResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultsSectionOperations.validateResultsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultsSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //TBResultsSectionImpl
