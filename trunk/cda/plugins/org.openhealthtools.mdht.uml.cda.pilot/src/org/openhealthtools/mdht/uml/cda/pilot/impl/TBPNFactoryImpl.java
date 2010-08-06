/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TBPNFactoryImpl extends EFactoryImpl implements TBPNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TBPNFactory init() {
		try {
			TBPNFactory theTBPNFactory = (TBPNFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/pilot"); 
			if (theTBPNFactory != null) {
				return theTBPNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TBPNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBPNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TBPNPackage.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE: return createTuberculosisFollowUpProgressNote();
			case TBPNPackage.TB_RESULTS_SECTION: return createTBResultsSection();
			case TBPNPackage.TB_RESULT_ORGANIZER: return createTBResultOrganizer();
			case TBPNPackage.TB_RESULT_OBSERVATION: return createTBResultObservation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisFollowUpProgressNote createTuberculosisFollowUpProgressNote() {
		TuberculosisFollowUpProgressNoteImpl tuberculosisFollowUpProgressNote = new TuberculosisFollowUpProgressNoteImpl();
		return tuberculosisFollowUpProgressNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultOrganizer createTBResultOrganizer() {
		TBResultOrganizerImpl tbResultOrganizer = new TBResultOrganizerImpl();
		return tbResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultsSection createTBResultsSection() {
		TBResultsSectionImpl tbResultsSection = new TBResultsSectionImpl();
		return tbResultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultObservation createTBResultObservation() {
		TBResultObservationImpl tbResultObservation = new TBResultObservationImpl();
		return tbResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBPNPackage getTBPNPackage() {
		return (TBPNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TBPNPackage getPackage() {
		return TBPNPackage.eINSTANCE;
	}

} //TBPNFactoryImpl
