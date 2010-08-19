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
import org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.HealthcareProvidersPharmaciesOperations;
import org.openhealthtools.mdht.uml.cda.impl.Performer1Impl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Providers Pharmacies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HealthcareProvidersPharmaciesImpl extends Performer1Impl implements HealthcareProvidersPharmacies {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareProvidersPharmaciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.HEALTHCARE_PROVIDERS_PHARMACIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvidersPharmaciesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthcareProvidersPharmaciesOperations.validateHealthcareProvidersPharmaciesTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareProvidersPharmacies init() {
    		CDAUtil.init(this);
    		return this;
	}
} //HealthcareProvidersPharmaciesImpl
