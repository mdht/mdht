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
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SupplyActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SupplyActivityImpl extends SupplyImpl implements SupplyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.SUPPLY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityHasAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityHasAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityHasPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityHasPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityHasParticipantLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityHasParticipantLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityMedicationStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityMedicationStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivityFulfillmentInstruction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyActivityOperations.validateSupplyActivityFulfillmentInstruction(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation getMedicationStatusObservation() {
		return SupplyActivityOperations.getMedicationStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillmentInstruction> getFulfillmentInstructions() {
		return SupplyActivityOperations.getFulfillmentInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //SupplyActivityImpl
