/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.ecore.EClass;

import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DurationImpl extends QuantityImpl implements Duration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDuration();
	}

} //DurationImpl
