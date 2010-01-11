/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ncr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ncr.NCRPackage
 * @generated
 */
public interface NCRFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NCRFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.ncr.impl.NCRFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Neonatal Care Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neonatal Care Report</em>'.
	 * @generated
	 */
	NeonatalCareReport createNeonatalCareReport();

	/**
	 * Returns a new object of class '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neonatal ICU Encounter Activity</em>'.
	 * @generated
	 */
	NeonatalICUEncounterActivity createNeonatalICUEncounterActivity();

	/**
	 * Returns a new object of class '<em>Patient Data Section NCR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Data Section NCR</em>'.
	 * @generated
	 */
	PatientDataSectionNCR createPatientDataSectionNCR();

	/**
	 * Returns a new object of class '<em>Patient Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Data Section</em>'.
	 * @generated
	 */
	PatientDataSection createPatientDataSection();

	/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	EncountersSection createEncountersSection();

	/**
	 * Returns a new object of class '<em>Acuity Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acuity Data Section</em>'.
	 * @generated
	 */
	AcuityDataSection createAcuityDataSection();

	/**
	 * Returns a new object of class '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Birth Weight</em>'.
	 * @generated
	 */
	BirthWeight createBirthWeight();

	/**
	 * Returns a new object of class '<em>Neonatal ICU Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neonatal ICU Location</em>'.
	 * @generated
	 */
	NeonatalICULocation createNeonatalICULocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NCRPackage getNCRPackage();

} //NCRFactory
