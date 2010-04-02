/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage
 * @generated
 */
public interface TBPNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TBPNFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.pilot.impl.TBPNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tuberculosis Follow Up Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuberculosis Follow Up Progress Note</em>'.
	 * @generated
	 */
	TuberculosisFollowUpProgressNote createTuberculosisFollowUpProgressNote();

	/**
	 * Returns a new object of class '<em>TB Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Result Organizer</em>'.
	 * @generated
	 */
	TBResultOrganizer createTBResultOrganizer();

	/**
	 * Returns a new object of class '<em>TB Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Results Section</em>'.
	 * @generated
	 */
	TBResultsSection createTBResultsSection();

	/**
	 * Returns a new object of class '<em>TB Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Result Observation</em>'.
	 * @generated
	 */
	TBResultObservation createTBResultObservation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TBPNPackage getTBPNPackage();

} //TBPNFactory
