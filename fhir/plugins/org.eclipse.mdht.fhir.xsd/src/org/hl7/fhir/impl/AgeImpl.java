/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.ecore.EClass;

import org.hl7.fhir.Age;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Age</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AgeImpl extends QuantityImpl implements Age {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAge();
	}

} //AgeImpl
