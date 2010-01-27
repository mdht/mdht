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
package org.openhealthtools.mdht.uml.cda.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.operations.Component4Operations;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getSeperatableInd <em>Seperatable Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getAct <em>Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getObservationMedia <em>Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getRegionOfInterest <em>Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getSubstanceAdministration <em>Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getSupply <em>Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.Component4Impl#getContextConductionInd <em>Context Conduction Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Component4Impl extends EObjectImpl implements Component4 {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected INT sequenceNumber;

	/**
	 * The cached value of the '{@link #getSeperatableInd() <em>Seperatable Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeperatableInd()
	 * @generated
	 * @ordered
	 */
	protected BL seperatableInd;

	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected Act act;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected Observation observation;

	/**
	 * The cached value of the '{@link #getObservationMedia() <em>Observation Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia()
	 * @generated
	 * @ordered
	 */
	protected ObservationMedia observationMedia;

	/**
	 * The cached value of the '{@link #getOrganizer() <em>Organizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer()
	 * @generated
	 * @ordered
	 */
	protected Organizer organizer;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

	/**
	 * The cached value of the '{@link #getRegionOfInterest() <em>Region Of Interest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest()
	 * @generated
	 * @ordered
	 */
	protected RegionOfInterest regionOfInterest;

	/**
	 * The cached value of the '{@link #getSubstanceAdministration() <em>Substance Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAdministration substanceAdministration;

	/**
	 * The cached value of the '{@link #getSupply() <em>Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply()
	 * @generated
	 * @ordered
	 */
	protected Supply supply;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final ActRelationshipHasComponent TYPE_CODE_EDEFAULT = ActRelationshipHasComponent.COMP;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected ActRelationshipHasComponent typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * This is true if the Type Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCodeESet;

	/**
	 * The default value of the '{@link #getContextConductionInd() <em>Context Conduction Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextConductionInd()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTEXT_CONDUCTION_IND_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContextConductionInd() <em>Context Conduction Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextConductionInd()
	 * @generated
	 * @ordered
	 */
	protected Boolean contextConductionInd = CONTEXT_CONDUCTION_IND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.eINSTANCE.getComponent4();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.COMPONENT4__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null)
				msgs = ((InternalEObject)typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__TYPE_ID, null, msgs);
			if (newTypeId != null)
				msgs = ((InternalEObject)newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__TYPE_ID, null, msgs);
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__TYPE_ID, newTypeId, newTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.COMPONENT4__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceNumber(INT newSequenceNumber, NotificationChain msgs) {
		INT oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SEQUENCE_NUMBER, oldSequenceNumber, newSequenceNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(INT newSequenceNumber) {
		if (newSequenceNumber != sequenceNumber) {
			NotificationChain msgs = null;
			if (sequenceNumber != null)
				msgs = ((InternalEObject)sequenceNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SEQUENCE_NUMBER, null, msgs);
			if (newSequenceNumber != null)
				msgs = ((InternalEObject)newSequenceNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SEQUENCE_NUMBER, null, msgs);
			msgs = basicSetSequenceNumber(newSequenceNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SEQUENCE_NUMBER, newSequenceNumber, newSequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL getSeperatableInd() {
		return seperatableInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeperatableInd(BL newSeperatableInd, NotificationChain msgs) {
		BL oldSeperatableInd = seperatableInd;
		seperatableInd = newSeperatableInd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SEPERATABLE_IND, oldSeperatableInd, newSeperatableInd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeperatableInd(BL newSeperatableInd) {
		if (newSeperatableInd != seperatableInd) {
			NotificationChain msgs = null;
			if (seperatableInd != null)
				msgs = ((InternalEObject)seperatableInd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SEPERATABLE_IND, null, msgs);
			if (newSeperatableInd != null)
				msgs = ((InternalEObject)newSeperatableInd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SEPERATABLE_IND, null, msgs);
			msgs = basicSetSeperatableInd(newSeperatableInd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SEPERATABLE_IND, newSeperatableInd, newSeperatableInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act getAct() {
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAct(Act newAct, NotificationChain msgs) {
		Act oldAct = act;
		act = newAct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__ACT, oldAct, newAct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAct(Act newAct) {
		if (newAct != act) {
			NotificationChain msgs = null;
			if (act != null)
				msgs = ((InternalEObject)act).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__ACT, null, msgs);
			if (newAct != null)
				msgs = ((InternalEObject)newAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__ACT, null, msgs);
			msgs = basicSetAct(newAct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__ACT, newAct, newAct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Encounter newEncounter, NotificationChain msgs) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
		Observation oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__OBSERVATION, oldObservation, newObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Observation newObservation) {
		if (newObservation != observation) {
			NotificationChain msgs = null;
			if (observation != null)
				msgs = ((InternalEObject)observation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__OBSERVATION, null, msgs);
			if (newObservation != null)
				msgs = ((InternalEObject)newObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__OBSERVATION, null, msgs);
			msgs = basicSetObservation(newObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__OBSERVATION, newObservation, newObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationMedia getObservationMedia() {
		return observationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservationMedia(ObservationMedia newObservationMedia, NotificationChain msgs) {
		ObservationMedia oldObservationMedia = observationMedia;
		observationMedia = newObservationMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__OBSERVATION_MEDIA, oldObservationMedia, newObservationMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservationMedia(ObservationMedia newObservationMedia) {
		if (newObservationMedia != observationMedia) {
			NotificationChain msgs = null;
			if (observationMedia != null)
				msgs = ((InternalEObject)observationMedia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__OBSERVATION_MEDIA, null, msgs);
			if (newObservationMedia != null)
				msgs = ((InternalEObject)newObservationMedia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__OBSERVATION_MEDIA, null, msgs);
			msgs = basicSetObservationMedia(newObservationMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__OBSERVATION_MEDIA, newObservationMedia, newObservationMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizer getOrganizer() {
		return organizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizer(Organizer newOrganizer, NotificationChain msgs) {
		Organizer oldOrganizer = organizer;
		organizer = newOrganizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__ORGANIZER, oldOrganizer, newOrganizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizer(Organizer newOrganizer) {
		if (newOrganizer != organizer) {
			NotificationChain msgs = null;
			if (organizer != null)
				msgs = ((InternalEObject)organizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__ORGANIZER, null, msgs);
			if (newOrganizer != null)
				msgs = ((InternalEObject)newOrganizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__ORGANIZER, null, msgs);
			msgs = basicSetOrganizer(newOrganizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__ORGANIZER, newOrganizer, newOrganizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__PROCEDURE, oldProcedure, newProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionOfInterest getRegionOfInterest() {
		return regionOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionOfInterest(RegionOfInterest newRegionOfInterest, NotificationChain msgs) {
		RegionOfInterest oldRegionOfInterest = regionOfInterest;
		regionOfInterest = newRegionOfInterest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__REGION_OF_INTEREST, oldRegionOfInterest, newRegionOfInterest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionOfInterest(RegionOfInterest newRegionOfInterest) {
		if (newRegionOfInterest != regionOfInterest) {
			NotificationChain msgs = null;
			if (regionOfInterest != null)
				msgs = ((InternalEObject)regionOfInterest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__REGION_OF_INTEREST, null, msgs);
			if (newRegionOfInterest != null)
				msgs = ((InternalEObject)newRegionOfInterest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__REGION_OF_INTEREST, null, msgs);
			msgs = basicSetRegionOfInterest(newRegionOfInterest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__REGION_OF_INTEREST, newRegionOfInterest, newRegionOfInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAdministration getSubstanceAdministration() {
		return substanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceAdministration(SubstanceAdministration newSubstanceAdministration, NotificationChain msgs) {
		SubstanceAdministration oldSubstanceAdministration = substanceAdministration;
		substanceAdministration = newSubstanceAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION, oldSubstanceAdministration, newSubstanceAdministration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceAdministration(SubstanceAdministration newSubstanceAdministration) {
		if (newSubstanceAdministration != substanceAdministration) {
			NotificationChain msgs = null;
			if (substanceAdministration != null)
				msgs = ((InternalEObject)substanceAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION, null, msgs);
			if (newSubstanceAdministration != null)
				msgs = ((InternalEObject)newSubstanceAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION, null, msgs);
			msgs = basicSetSubstanceAdministration(newSubstanceAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION, newSubstanceAdministration, newSubstanceAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply getSupply() {
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupply(Supply newSupply, NotificationChain msgs) {
		Supply oldSupply = supply;
		supply = newSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SUPPLY, oldSupply, newSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply(Supply newSupply) {
		if (newSupply != supply) {
			NotificationChain msgs = null;
			if (supply != null)
				msgs = ((InternalEObject)supply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SUPPLY, null, msgs);
			if (newSupply != null)
				msgs = ((InternalEObject)newSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDAPackage.COMPONENT4__SUPPLY, null, msgs);
			msgs = basicSetSupply(newSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__SUPPLY, newSupply, newSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null ? NULL_FLAVOR_EDEFAULT : newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__NULL_FLAVOR, oldNullFlavor, nullFlavor, !oldNullFlavorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.COMPONENT4__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActRelationshipHasComponent getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(ActRelationshipHasComponent newTypeCode) {
		ActRelationshipHasComponent oldTypeCode = typeCode;
		typeCode = newTypeCode == null ? TYPE_CODE_EDEFAULT : newTypeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__TYPE_CODE, oldTypeCode, typeCode, !oldTypeCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCode() {
		ActRelationshipHasComponent oldTypeCode = typeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCode = TYPE_CODE_EDEFAULT;
		typeCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.COMPONENT4__TYPE_CODE, oldTypeCode, TYPE_CODE_EDEFAULT, oldTypeCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCode() {
		return typeCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getContextConductionInd() {
		return contextConductionInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextConductionInd(Boolean newContextConductionInd) {
		Boolean oldContextConductionInd = contextConductionInd;
		contextConductionInd = newContextConductionInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.COMPONENT4__CONTEXT_CONDUCTION_IND, oldContextConductionInd, contextConductionInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalStatement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Component4Operations.validateClinicalStatement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.COMPONENT4__REALM_CODE:
				return ((InternalEList<?>)getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.COMPONENT4__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.COMPONENT4__TEMPLATE_ID:
				return ((InternalEList<?>)getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.COMPONENT4__SEQUENCE_NUMBER:
				return basicSetSequenceNumber(null, msgs);
			case CDAPackage.COMPONENT4__SEPERATABLE_IND:
				return basicSetSeperatableInd(null, msgs);
			case CDAPackage.COMPONENT4__ACT:
				return basicSetAct(null, msgs);
			case CDAPackage.COMPONENT4__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case CDAPackage.COMPONENT4__OBSERVATION:
				return basicSetObservation(null, msgs);
			case CDAPackage.COMPONENT4__OBSERVATION_MEDIA:
				return basicSetObservationMedia(null, msgs);
			case CDAPackage.COMPONENT4__ORGANIZER:
				return basicSetOrganizer(null, msgs);
			case CDAPackage.COMPONENT4__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case CDAPackage.COMPONENT4__REGION_OF_INTEREST:
				return basicSetRegionOfInterest(null, msgs);
			case CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION:
				return basicSetSubstanceAdministration(null, msgs);
			case CDAPackage.COMPONENT4__SUPPLY:
				return basicSetSupply(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.COMPONENT4__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.COMPONENT4__TYPE_ID:
				return getTypeId();
			case CDAPackage.COMPONENT4__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.COMPONENT4__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CDAPackage.COMPONENT4__SEPERATABLE_IND:
				return getSeperatableInd();
			case CDAPackage.COMPONENT4__ACT:
				return getAct();
			case CDAPackage.COMPONENT4__ENCOUNTER:
				return getEncounter();
			case CDAPackage.COMPONENT4__OBSERVATION:
				return getObservation();
			case CDAPackage.COMPONENT4__OBSERVATION_MEDIA:
				return getObservationMedia();
			case CDAPackage.COMPONENT4__ORGANIZER:
				return getOrganizer();
			case CDAPackage.COMPONENT4__PROCEDURE:
				return getProcedure();
			case CDAPackage.COMPONENT4__REGION_OF_INTEREST:
				return getRegionOfInterest();
			case CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION:
				return getSubstanceAdministration();
			case CDAPackage.COMPONENT4__SUPPLY:
				return getSupply();
			case CDAPackage.COMPONENT4__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.COMPONENT4__TYPE_CODE:
				return getTypeCode();
			case CDAPackage.COMPONENT4__CONTEXT_CONDUCTION_IND:
				return getContextConductionInd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.COMPONENT4__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>)newValue);
				return;
			case CDAPackage.COMPONENT4__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)newValue);
				return;
			case CDAPackage.COMPONENT4__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>)newValue);
				return;
			case CDAPackage.COMPONENT4__SEQUENCE_NUMBER:
				setSequenceNumber((INT)newValue);
				return;
			case CDAPackage.COMPONENT4__SEPERATABLE_IND:
				setSeperatableInd((BL)newValue);
				return;
			case CDAPackage.COMPONENT4__ACT:
				setAct((Act)newValue);
				return;
			case CDAPackage.COMPONENT4__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case CDAPackage.COMPONENT4__OBSERVATION:
				setObservation((Observation)newValue);
				return;
			case CDAPackage.COMPONENT4__OBSERVATION_MEDIA:
				setObservationMedia((ObservationMedia)newValue);
				return;
			case CDAPackage.COMPONENT4__ORGANIZER:
				setOrganizer((Organizer)newValue);
				return;
			case CDAPackage.COMPONENT4__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case CDAPackage.COMPONENT4__REGION_OF_INTEREST:
				setRegionOfInterest((RegionOfInterest)newValue);
				return;
			case CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION:
				setSubstanceAdministration((SubstanceAdministration)newValue);
				return;
			case CDAPackage.COMPONENT4__SUPPLY:
				setSupply((Supply)newValue);
				return;
			case CDAPackage.COMPONENT4__NULL_FLAVOR:
				setNullFlavor((NullFlavor)newValue);
				return;
			case CDAPackage.COMPONENT4__TYPE_CODE:
				setTypeCode((ActRelationshipHasComponent)newValue);
				return;
			case CDAPackage.COMPONENT4__CONTEXT_CONDUCTION_IND:
				setContextConductionInd((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDAPackage.COMPONENT4__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.COMPONENT4__TYPE_ID:
				setTypeId((InfrastructureRootTypeId)null);
				return;
			case CDAPackage.COMPONENT4__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.COMPONENT4__SEQUENCE_NUMBER:
				setSequenceNumber((INT)null);
				return;
			case CDAPackage.COMPONENT4__SEPERATABLE_IND:
				setSeperatableInd((BL)null);
				return;
			case CDAPackage.COMPONENT4__ACT:
				setAct((Act)null);
				return;
			case CDAPackage.COMPONENT4__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case CDAPackage.COMPONENT4__OBSERVATION:
				setObservation((Observation)null);
				return;
			case CDAPackage.COMPONENT4__OBSERVATION_MEDIA:
				setObservationMedia((ObservationMedia)null);
				return;
			case CDAPackage.COMPONENT4__ORGANIZER:
				setOrganizer((Organizer)null);
				return;
			case CDAPackage.COMPONENT4__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case CDAPackage.COMPONENT4__REGION_OF_INTEREST:
				setRegionOfInterest((RegionOfInterest)null);
				return;
			case CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION:
				setSubstanceAdministration((SubstanceAdministration)null);
				return;
			case CDAPackage.COMPONENT4__SUPPLY:
				setSupply((Supply)null);
				return;
			case CDAPackage.COMPONENT4__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.COMPONENT4__TYPE_CODE:
				unsetTypeCode();
				return;
			case CDAPackage.COMPONENT4__CONTEXT_CONDUCTION_IND:
				setContextConductionInd(CONTEXT_CONDUCTION_IND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.COMPONENT4__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.COMPONENT4__TYPE_ID:
				return typeId != null;
			case CDAPackage.COMPONENT4__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.COMPONENT4__SEQUENCE_NUMBER:
				return sequenceNumber != null;
			case CDAPackage.COMPONENT4__SEPERATABLE_IND:
				return seperatableInd != null;
			case CDAPackage.COMPONENT4__ACT:
				return act != null;
			case CDAPackage.COMPONENT4__ENCOUNTER:
				return encounter != null;
			case CDAPackage.COMPONENT4__OBSERVATION:
				return observation != null;
			case CDAPackage.COMPONENT4__OBSERVATION_MEDIA:
				return observationMedia != null;
			case CDAPackage.COMPONENT4__ORGANIZER:
				return organizer != null;
			case CDAPackage.COMPONENT4__PROCEDURE:
				return procedure != null;
			case CDAPackage.COMPONENT4__REGION_OF_INTEREST:
				return regionOfInterest != null;
			case CDAPackage.COMPONENT4__SUBSTANCE_ADMINISTRATION:
				return substanceAdministration != null;
			case CDAPackage.COMPONENT4__SUPPLY:
				return supply != null;
			case CDAPackage.COMPONENT4__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.COMPONENT4__TYPE_CODE:
				return isSetTypeCode();
			case CDAPackage.COMPONENT4__CONTEXT_CONDUCTION_IND:
				return CONTEXT_CONDUCTION_IND_EDEFAULT == null ? contextConductionInd != null : !CONTEXT_CONDUCTION_IND_EDEFAULT.equals(contextConductionInd);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) result.append(nullFlavor); else result.append("<unset>");
		result.append(", typeCode: ");
		if (typeCodeESet) result.append(typeCode); else result.append("<unset>");
		result.append(", contextConductionInd: ");
		result.append(contextConductionInd);
		result.append(')');
		return result.toString();
	}

} //Component4Impl
