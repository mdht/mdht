/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationSeriesNumberObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Series Number Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationSeriesNumberObservationImpl extends ObservationImpl implements MedicationSeriesNumberObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSeriesNumberObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.MEDICATION_SERIES_NUMBER_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MedicationSeriesNumberObservation_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSeriesNumberObservationOperations.MedicationSeriesNumberObservation_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MedicationSeriesNumberObservation_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSeriesNumberObservationOperations.MedicationSeriesNumberObservation_statusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MedicationSeriesNumberObservation_code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSeriesNumberObservationOperations.MedicationSeriesNumberObservation_code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MedicationSeriesNumberObservation_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSeriesNumberObservationOperations.MedicationSeriesNumberObservation_value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //MedicationSeriesNumberObservationImpl
