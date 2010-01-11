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
package org.openhealthtools.mdht.uml.cda.ncr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;

import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ncr.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ncr.NCRPackage
 * @generated
 */
public class NCRSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NCRPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NCRSwitch() {
		if (modelPackage == null) {
			modelPackage = NCRPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NCRPackage.NEONATAL_CARE_REPORT: {
				NeonatalCareReport neonatalCareReport = (NeonatalCareReport)theEObject;
				T result = caseNeonatalCareReport(neonatalCareReport);
				if (result == null) result = caseClinicalDocument(neonatalCareReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.NEONATAL_ICU_ENCOUNTER_ACTIVITY: {
				NeonatalICUEncounterActivity neonatalICUEncounterActivity = (NeonatalICUEncounterActivity)theEObject;
				T result = caseNeonatalICUEncounterActivity(neonatalICUEncounterActivity);
				if (result == null) result = caseEncountersActivity(neonatalICUEncounterActivity);
				if (result == null) result = caseEncounter(neonatalICUEncounterActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.PATIENT_DATA_SECTION_NCR: {
				PatientDataSectionNCR patientDataSectionNCR = (PatientDataSectionNCR)theEObject;
				T result = casePatientDataSectionNCR(patientDataSectionNCR);
				if (result == null) result = casePatientDataSection(patientDataSectionNCR);
				if (result == null) result = caseSection(patientDataSectionNCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.PATIENT_DATA_SECTION: {
				PatientDataSection patientDataSection = (PatientDataSection)theEObject;
				T result = casePatientDataSection(patientDataSection);
				if (result == null) result = caseSection(patientDataSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.ENCOUNTERS_SECTION: {
				EncountersSection encountersSection = (EncountersSection)theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) result = caseEncountersSection_1(encountersSection);
				if (result == null) result = caseSection(encountersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.ACUITY_DATA_SECTION: {
				AcuityDataSection acuityDataSection = (AcuityDataSection)theEObject;
				T result = caseAcuityDataSection(acuityDataSection);
				if (result == null) result = caseSection(acuityDataSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.BIRTH_WEIGHT: {
				BirthWeight birthWeight = (BirthWeight)theEObject;
				T result = caseBirthWeight(birthWeight);
				if (result == null) result = caseResultObservation(birthWeight);
				if (result == null) result = caseObservation(birthWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NCRPackage.NEONATAL_ICU_LOCATION: {
				NeonatalICULocation neonatalICULocation = (NeonatalICULocation)theEObject;
				T result = caseNeonatalICULocation(neonatalICULocation);
				if (result == null) result = caseLocation(neonatalICULocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neonatal Care Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neonatal Care Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeonatalCareReport(NeonatalCareReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neonatal ICU Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neonatal ICU Encounter Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeonatalICUEncounterActivity(NeonatalICUEncounterActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Data Section NCR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Data Section NCR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientDataSectionNCR(PatientDataSectionNCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Data Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientDataSection(PatientDataSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection(EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acuity Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acuity Data Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcuityDataSection(AcuityDataSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birth Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birth Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthWeight(BirthWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neonatal ICU Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neonatal ICU Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeonatalICULocation(NeonatalICULocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersActivity(EncountersActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection_1(org.openhealthtools.mdht.uml.cda.ccd.EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //NCRSwitch
