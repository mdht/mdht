/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getSeperatableInd <em>Seperatable Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getAct <em>Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getObservationMedia <em>Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getRegionOfInterest <em>Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getSubstanceAdministration <em>Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getSupply <em>Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Component4#getContextConductionInd <em>Context Conduction Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4()
 * @model
 * @generated
 */
public interface Component4 extends ActRelationship {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' containment reference.
	 * @see #setSequenceNumber(INT)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_SequenceNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	INT getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getSequenceNumber <em>Sequence Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' containment reference.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(INT value);

	/**
	 * Returns the value of the '<em><b>Seperatable Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seperatable Ind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seperatable Ind</em>' containment reference.
	 * @see #setSeperatableInd(BL)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_SeperatableInd()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	BL getSeperatableInd();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getSeperatableInd <em>Seperatable Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperatable Ind</em>' containment reference.
	 * @see #getSeperatableInd()
	 * @generated
	 */
	void setSeperatableInd(BL value);

	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference.
	 * @see #setAct(Act)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_Act()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Act getAct();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getAct <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act</em>' containment reference.
	 * @see #getAct()
	 * @generated
	 */
	void setAct(Act value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Encounter)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_Encounter()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_Observation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Observation Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation Media</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation Media</em>' containment reference.
	 * @see #setObservationMedia(ObservationMedia)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_ObservationMedia()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationMedia getObservationMedia();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getObservationMedia <em>Observation Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Media</em>' containment reference.
	 * @see #getObservationMedia()
	 * @generated
	 */
	void setObservationMedia(ObservationMedia value);

	/**
	 * Returns the value of the '<em><b>Organizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizer</em>' containment reference.
	 * @see #setOrganizer(Organizer)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_Organizer()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Organizer getOrganizer();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getOrganizer <em>Organizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizer</em>' containment reference.
	 * @see #getOrganizer()
	 * @generated
	 */
	void setOrganizer(Organizer value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_Procedure()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Region Of Interest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Of Interest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Of Interest</em>' containment reference.
	 * @see #setRegionOfInterest(RegionOfInterest)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_RegionOfInterest()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	RegionOfInterest getRegionOfInterest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getRegionOfInterest <em>Region Of Interest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Of Interest</em>' containment reference.
	 * @see #getRegionOfInterest()
	 * @generated
	 */
	void setRegionOfInterest(RegionOfInterest value);

	/**
	 * Returns the value of the '<em><b>Substance Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance Administration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance Administration</em>' containment reference.
	 * @see #setSubstanceAdministration(SubstanceAdministration)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_SubstanceAdministration()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceAdministration getSubstanceAdministration();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getSubstanceAdministration <em>Substance Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Administration</em>' containment reference.
	 * @see #getSubstanceAdministration()
	 * @generated
	 */
	void setSubstanceAdministration(SubstanceAdministration value);

	/**
	 * Returns the value of the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply</em>' containment reference.
	 * @see #setSupply(Supply)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_Supply()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Supply getSupply();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getSupply <em>Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply</em>' containment reference.
	 * @see #getSupply()
	 * @generated
	 */
	void setSupply(Supply value);

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getNullFlavor <em>Null Flavor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Flavor</em>' attribute is set.
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	boolean isSetNullFlavor();

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The default value is <code>"COMP"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #setTypeCode(ActRelationshipHasComponent)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_TypeCode()
	 * @model default="COMP" unsettable="true" ordered="false"
	 * @generated
	 */
	ActRelationshipHasComponent getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(ActRelationshipHasComponent value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ActRelationshipHasComponent)
	 * @generated
	 */
	void unsetTypeCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getTypeCode <em>Type Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Code</em>' attribute is set.
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ActRelationshipHasComponent)
	 * @generated
	 */
	boolean isSetTypeCode();

	/**
	 * Returns the value of the '<em><b>Context Conduction Ind</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Conduction Ind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Conduction Ind</em>' attribute.
	 * @see #isSetContextConductionInd()
	 * @see #unsetContextConductionInd()
	 * @see #setContextConductionInd(Boolean)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getComponent4_ContextConductionInd()
	 * @model default="true" unsettable="true" ordered="false"
	 * @generated
	 */
	Boolean getContextConductionInd();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getContextConductionInd <em>Context Conduction Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Conduction Ind</em>' attribute.
	 * @see #isSetContextConductionInd()
	 * @see #unsetContextConductionInd()
	 * @see #getContextConductionInd()
	 * @generated
	 */
	void setContextConductionInd(Boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getContextConductionInd <em>Context Conduction Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextConductionInd()
	 * @see #getContextConductionInd()
	 * @see #setContextConductionInd(Boolean)
	 * @generated
	 */
	void unsetContextConductionInd();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Component4#getContextConductionInd <em>Context Conduction Ind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Conduction Ind</em>' attribute is set.
	 * @see #unsetContextConductionInd()
	 * @see #getContextConductionInd()
	 * @see #setContextConductionInd(Boolean)
	 * @generated
	 */
	boolean isSetContextConductionInd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag{self.act.oclIsUndefined(), self.encounter.oclIsUndefined(), self.observation.oclIsUndefined(), self.observationMedia.oclIsUndefined(), self.organizer.oclIsUndefined(), self.procedure.oclIsUndefined(), self.regionOfInterest.oclIsUndefined(), self.substanceAdministration.oclIsUndefined(), self.supply.oclIsUndefined()}->one(x | x = false)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='Bag{self.act.oclIsUndefined(), self.encounter.oclIsUndefined(), self.observation.oclIsUndefined(), self.observationMedia.oclIsUndefined(), self.organizer.oclIsUndefined(), self.procedure.oclIsUndefined(), self.regionOfInterest.oclIsUndefined(), self.substanceAdministration.oclIsUndefined(), self.supply.oclIsUndefined()}->one(x | x = false)'"
	 * @generated
	 */
	boolean validateClinicalStatement(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isTypeCodeDefined() implies self.typeCode=vocab::ActRelationshipHasComponent::COMP
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isTypeCodeDefined() implies self.typeCode=vocab::ActRelationshipHasComponent::COMP'"
	 * @generated
	 */
	boolean validateTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.contextConductionInd.oclIsUndefined() implies self.contextConductionInd=true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.contextConductionInd.oclIsUndefined() implies self.contextConductionInd=true'"
	 * @generated
	 */
	boolean validateContextConductionInd(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Component4
