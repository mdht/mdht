/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.internal.operations;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addAct(org.openhealthtools.mdht.uml.cda.Act) <em>Add Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addEncounter(org.openhealthtools.mdht.uml.cda.Encounter) <em>Add Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addObservation(org.openhealthtools.mdht.uml.cda.Observation) <em>Add Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addObservationMedia(org.openhealthtools.mdht.uml.cda.ObservationMedia) <em>Add Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addOrganizer(org.openhealthtools.mdht.uml.cda.Organizer) <em>Add Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addProcedure(org.openhealthtools.mdht.uml.cda.Procedure) <em>Add Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addRegionOfInterest(org.openhealthtools.mdht.uml.cda.RegionOfInterest) <em>Add Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addSubstanceAdministration(org.openhealthtools.mdht.uml.cda.SubstanceAdministration) <em>Add Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#addSupply(org.openhealthtools.mdht.uml.cda.Supply) <em>Add Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getAct() <em>Get Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getEncounter() <em>Get Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getObservation() <em>Get Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getObservationMedia() <em>Get Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getOrganizer() <em>Get Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getProcedure() <em>Get Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getRegionOfInterest() <em>Get Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getSubstanceAdministration() <em>Get Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#getSupply() <em>Get Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasActTemplate(java.lang.String) <em>Has Act Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasCode(java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasEncounterTemplate(java.lang.String) <em>Has Encounter Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasObservationMediaTemplate(java.lang.String) <em>Has Observation Media Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasObservationTemplate(java.lang.String) <em>Has Observation Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasOrganizerTemplate(java.lang.String) <em>Has Organizer Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasProcedureTemplate(java.lang.String) <em>Has Procedure Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasRegionOfInterestTemplate(java.lang.String) <em>Has Region Of Interest Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasSubstanceAdministrationTemplate(java.lang.String) <em>Has Substance Administration Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasSupplyTemplate(java.lang.String) <em>Has Supply Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Act#hasTemplateId(java.lang.String) <em>Has Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addAct(Act act, Act newAct) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addEncounter(Act act, Encounter encounter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addObservation(Act act, Observation observation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addObservationMedia(Act act, ObservationMedia observationMedia) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addOrganizer(Act act, Organizer organizer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addProcedure(Act act, Procedure procedure) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addRegionOfInterest(Act act, RegionOfInterest regionOfInterest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addSubstanceAdministration(Act act, SubstanceAdministration substanceAdministration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  void addSupply(Act act, Supply supply) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getAct(Act) <em>Get Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT__EOCL_EXP = "self.entryRelationship.act";

	/**
	 * The cached OCL query for the '{@link #getAct(Act) <em>Get Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.act
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Act> getAct(Act act) {
		if (GET_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(9));
			try {
				GET_ACT__EOCL_QRY = helper.createQuery(GET_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Act> result = (Collection<Act>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<Act>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounter(Act) <em>Get Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER__EOCL_EXP = "self.entryRelationship.encounter";

	/**
	 * The cached OCL query for the '{@link #getEncounter(Act) <em>Get Encounter</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.encounter
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Encounter> getEncounter(Act act) {
		if (GET_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(10));
			try {
				GET_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_ENCOUNTER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservation(Act) <em>Get Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION__EOCL_EXP = "self.entryRelationship.observation";

	/**
	 * The cached OCL query for the '{@link #getObservation(Act) <em>Get Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Observation> getObservation(Act act) {
		if (GET_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(11));
			try {
				GET_OBSERVATION__EOCL_QRY = helper.createQuery(GET_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Observation> result = (Collection<Observation>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<Observation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservationMedia(Act) <em>Get Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION_MEDIA__EOCL_EXP = "self.entryRelationship.observationMedia";

	/**
	 * The cached OCL query for the '{@link #getObservationMedia(Act) <em>Get Observation Media</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION_MEDIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observationMedia
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ObservationMedia> getObservationMedia(Act act) {
		if (GET_OBSERVATION_MEDIA__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(12));
			try {
				GET_OBSERVATION_MEDIA__EOCL_QRY = helper.createQuery(GET_OBSERVATION_MEDIA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION_MEDIA__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ObservationMedia> result = (Collection<ObservationMedia>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<ObservationMedia>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getOrganizer(Act) <em>Get Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ORGANIZER__EOCL_EXP = "self.entryRelationship.organizer";

	/**
	 * The cached OCL query for the '{@link #getOrganizer(Act) <em>Get Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.organizer
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Organizer> getOrganizer(Act act) {
		if (GET_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(13));
			try {
				GET_ORGANIZER__EOCL_QRY = helper.createQuery(GET_ORGANIZER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ORGANIZER__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Organizer> result = (Collection<Organizer>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<Organizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedure(Act) <em>Get Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE__EOCL_EXP = "self.entryRelationship.procedure";

	/**
	 * The cached OCL query for the '{@link #getProcedure(Act) <em>Get Procedure</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.procedure
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getProcedure(Act act) {
		if (GET_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(14));
			try {
				GET_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PROCEDURE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRegionOfInterest(Act) <em>Get Region Of Interest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REGION_OF_INTEREST__EOCL_EXP = "self.entryRelationship.regionOfInterest";

	/**
	 * The cached OCL query for the '{@link #getRegionOfInterest(Act) <em>Get Region Of Interest</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REGION_OF_INTEREST__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.regionOfInterest
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<RegionOfInterest> getRegionOfInterest(Act act) {
		if (GET_REGION_OF_INTEREST__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(15));
			try {
				GET_REGION_OF_INTEREST__EOCL_QRY = helper.createQuery(GET_REGION_OF_INTEREST__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REGION_OF_INTEREST__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RegionOfInterest> result = (Collection<RegionOfInterest>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<RegionOfInterest>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceAdministration(Act) <em>Get Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.entryRelationship.substanceAdministration";

	/**
	 * The cached OCL query for the '{@link #getSubstanceAdministration(Act) <em>Get Substance Administration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.substanceAdministration
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<SubstanceAdministration> getSubstanceAdministration(Act act) {
		if (GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(16));
			try {
				GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceAdministration> result = (Collection<SubstanceAdministration>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<SubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupply(Act) <em>Get Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLY__EOCL_EXP = "self.entryRelationship.supply";

	/**
	 * The cached OCL query for the '{@link #getSupply(Act) <em>Get Supply</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.supply
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Supply> getSupply(Act act) {
		if (GET_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(17));
			try {
				GET_SUPPLY__EOCL_QRY = helper.createQuery(GET_SUPPLY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Supply> result = (Collection<Supply>) query.evaluate(act);
		return new BasicEList.UnmodifiableEList<Supply>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #hasActTemplate(Act, java.lang.String) <em>Has Act Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasActTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ACT_TEMPLATE__STRING__EOCL_EXP = "self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasActTemplate(Act, java.lang.String) <em>Has Act Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasActTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ACT_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasActTemplate(Act act, String templateId) {
		if (HAS_ACT_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(18));
			try {
				HAS_ACT_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasCode(Act, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(Act, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_CODE__STRING_STRING_STRING__EOCL_EXP = "self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName";

	/**
	 * The cached OCL query for the '{@link #hasCode(Act, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(Act, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_CODE__STRING_STRING_STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasCode(Act act, String code, String codeSystem, String codeSystemName) {
		if (HAS_CODE__STRING_STRING_STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(19));
			try {
				HAS_CODE__STRING_STRING_STRING__EOCL_QRY = helper.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("code", code);
		environment.add("codeSystem", codeSystem);
		environment.add("codeSystemName", codeSystemName);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasEncounterTemplate(Act, java.lang.String) <em>Has Encounter Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasEncounterTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP = "self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasEncounterTemplate(Act, java.lang.String) <em>Has Encounter Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasEncounterTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasEncounterTemplate(Act act, String templateId) {
		if (HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(20));
			try {
				HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationMediaTemplate(Act, java.lang.String) <em>Has Observation Media Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationMediaTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP = "self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationMediaTemplate(Act, java.lang.String) <em>Has Observation Media Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationMediaTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasObservationMediaTemplate(Act act, String templateId) {
		if (HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(21));
			try {
				HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationTemplate(Act, java.lang.String) <em>Has Observation Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP = "self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationTemplate(Act, java.lang.String) <em>Has Observation Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasObservationTemplate(Act act, String templateId) {
		if (HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(22));
			try {
				HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasOrganizerTemplate(Act, java.lang.String) <em>Has Organizer Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOrganizerTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP = "self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasOrganizerTemplate(Act, java.lang.String) <em>Has Organizer Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOrganizerTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasOrganizerTemplate(Act act, String templateId) {
		if (HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(23));
			try {
				HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasProcedureTemplate(Act, java.lang.String) <em>Has Procedure Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasProcedureTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP = "self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasProcedureTemplate(Act, java.lang.String) <em>Has Procedure Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasProcedureTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #hasRegionOfInterestTemplate(Act, java.lang.String) <em>Has Region Of Interest Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasRegionOfInterestTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP = "self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasRegionOfInterestTemplate(Act, java.lang.String) <em>Has Region Of Interest Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasRegionOfInterestTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasProcedureTemplate(Act act, String templateId) {
		if (HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(24));
			try {
				HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasRegionOfInterestTemplate(Act act, String templateId) {
		if (HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(25));
			try {
				HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}
	
	/**
	 * The cached OCL expression body for the '{@link #hasSubstanceAdministrationTemplate(Act, java.lang.String) <em>Has Substance Administration Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSubstanceAdministrationTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP = "self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSubstanceAdministrationTemplate(Act, java.lang.String) <em>Has Substance Administration Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSubstanceAdministrationTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSubstanceAdministrationTemplate(Act act, String templateId) {
		if (HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(26));
			try {
				HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSupplyTemplate(Act, java.lang.String) <em>Has Supply Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSupplyTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP = "self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSupplyTemplate(Act, java.lang.String) <em>Has Supply Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSupplyTemplate(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSupplyTemplate(Act act, String templateId) {
		if (HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(27));
			try {
				HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasTemplateId(Act, java.lang.String) <em>Has Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_TEMPLATE_ID__STRING__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = templateId)";

	/**
	 * The cached OCL query for the '{@link #hasTemplateId(Act, java.lang.String) <em>Has Template Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(Act, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_TEMPLATE_ID__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = templateId)
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasTemplateId(Act act, String templateId) {
		if (HAS_TEMPLATE_ID__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getAct(), CDAPackage.eINSTANCE.getAct().getEAllOperations().get(28));
			try {
				HAS_TEMPLATE_ID__STRING__EOCL_QRY = helper.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

} // ActOperations