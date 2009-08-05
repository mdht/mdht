/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage
 * @generated
 */
public interface CCDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CCDFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.ccd.impl.CCDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Section</em>'.
	 * @generated
	 */
	MedicationSection createMedicationSection();

	/**
	 * Returns a new object of class '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuity Of Care Document</em>'.
	 * @generated
	 */
	ContinuityOfCareDocument createContinuityOfCareDocument();

	/**
	 * Returns a new object of class '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Act</em>'.
	 * @generated
	 */
	ProblemAct createProblemAct();

	/**
	 * Returns a new object of class '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Observation</em>'.
	 * @generated
	 */
	ProblemObservation createProblemObservation();

	/**
	 * Returns a new object of class '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section</em>'.
	 * @generated
	 */
	ProblemSection createProblemSection();

	/**
	 * Returns a new object of class '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status</em>'.
	 * @generated
	 */
	ProblemStatus createProblemStatus();

	/**
	 * Returns a new object of class '<em>Problem Health Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Health Status</em>'.
	 * @generated
	 */
	ProblemHealthStatus createProblemHealthStatus();

	/**
	 * Returns a new object of class '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Observation</em>'.
	 * @generated
	 */
	EpisodeObservation createEpisodeObservation();

	/**
	 * Returns a new object of class '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Awareness</em>'.
	 * @generated
	 */
	PatientAwareness createPatientAwareness();

	/**
	 * Returns a new object of class '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Section</em>'.
	 * @generated
	 */
	FamilyHistorySection createFamilyHistorySection();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	FamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Organizer</em>'.
	 * @generated
	 */
	FamilyHistoryOrganizer createFamilyHistoryOrganizer();

	/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	ResultOrganizer createResultOrganizer();

	/**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	ResultObservation createResultObservation();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	SocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Observation</em>'.
	 * @generated
	 */
	SocialHistoryObservation createSocialHistoryObservation();

	/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	EncountersSection createEncountersSection();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	ImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Activity</em>'.
	 * @generated
	 */
	EncountersActivity createEncountersActivity();

	/**
	 * Returns a new object of class '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Activity</em>'.
	 * @generated
	 */
	MedicationActivity createMedicationActivity();

	/**
	 * Returns a new object of class '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Activity</em>'.
	 * @generated
	 */
	SupplyActivity createSupplyActivity();

	/**
	 * Returns a new object of class '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alerts Section</em>'.
	 * @generated
	 */
	AlertsSection createAlertsSection();

	/**
	 * Returns a new object of class '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alert Observation</em>'.
	 * @generated
	 */
	AlertObservation createAlertObservation();

	/**
	 * Returns a new object of class '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Observation</em>'.
	 * @generated
	 */
	ReactionObservation createReactionObservation();

	/**
	 * Returns a new object of class '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity Observation</em>'.
	 * @generated
	 */
	SeverityObservation createSeverityObservation();

	/**
	 * Returns a new object of class '<em>Alert Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alert Status Observation</em>'.
	 * @generated
	 */
	AlertStatusObservation createAlertStatusObservation();

	/**
	 * Returns a new object of class '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause Of Death Observation</em>'.
	 * @generated
	 */
	CauseOfDeathObservation createCauseOfDeathObservation();

	/**
	 * Returns a new object of class '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Observation</em>'.
	 * @generated
	 */
	StatusObservation createStatusObservation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CCDPackage getCCDPackage();

} //CCDFactory
