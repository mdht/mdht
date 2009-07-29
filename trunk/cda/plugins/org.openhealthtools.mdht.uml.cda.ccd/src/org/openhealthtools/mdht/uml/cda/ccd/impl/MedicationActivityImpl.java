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
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActivityImpl extends SubstanceAdministrationImpl implements MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.MEDICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MedicationActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.MedicationActivity_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //MedicationActivityImpl
