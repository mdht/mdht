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
package org.openhealthtools.mdht.uml.cda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getRealmCode <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getDerivationExpr <em>Derivation Expr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getPriorityCode <em>Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getRepeatNumber <em>Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getInterpretationCode <em>Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getMethodCode <em>Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getTargetSiteCode <em>Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getInformant <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getEntryRelationship <em>Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getReferenceRange <em>Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getMoodCode <em>Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Observation#getNegationInd <em>Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends EObject {
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_RealmCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CS> getRealmCode();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_TypeId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getTypeId <em>Type Id</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_TemplateId()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<II> getTemplateId();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Id()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<II> getId();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CD)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Code()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CD getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CD value);

	/**
	 * Returns the value of the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Expr</em>' containment reference.
	 * @see #setDerivationExpr(ST)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_DerivationExpr()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ST getDerivationExpr();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getDerivationExpr <em>Derivation Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Expr</em>' containment reference.
	 * @see #getDerivationExpr()
	 * @generated
	 */
	void setDerivationExpr(ST value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(ED)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Text()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ED getText();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(ED value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(CS)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_StatusCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(CS value);

	/**
	 * Returns the value of the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Time</em>' containment reference.
	 * @see #setEffectiveTime(IVL_TS)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_EffectiveTime()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getEffectiveTime <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Time</em>' containment reference.
	 * @see #getEffectiveTime()
	 * @generated
	 */
	void setEffectiveTime(IVL_TS value);

	/**
	 * Returns the value of the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Code</em>' containment reference.
	 * @see #setPriorityCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_PriorityCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CE getPriorityCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getPriorityCode <em>Priority Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Code</em>' containment reference.
	 * @see #getPriorityCode()
	 * @generated
	 */
	void setPriorityCode(CE value);

	/**
	 * Returns the value of the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Number</em>' containment reference.
	 * @see #setRepeatNumber(IVL_INT)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_RepeatNumber()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IVL_INT getRepeatNumber();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getRepeatNumber <em>Repeat Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Number</em>' containment reference.
	 * @see #getRepeatNumber()
	 * @generated
	 */
	void setRepeatNumber(IVL_INT value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference.
	 * @see #setLanguageCode(CS)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_LanguageCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CS getLanguageCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getLanguageCode <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' containment reference.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(CS value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ANY> getValue();

	/**
	 * Returns the value of the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_InterpretationCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CE> getInterpretationCode();

	/**
	 * Returns the value of the '<em><b>Method Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_MethodCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CE> getMethodCode();

	/**
	 * Returns the value of the '<em><b>Target Site Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Site Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Site Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_TargetSiteCode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CD> getTargetSiteCode();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Subject)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Subject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Specimen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Specimen()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Specimen> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Performer2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Performer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Performer2> getPerformer();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Author()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Author> getAuthor();

	/**
	 * Returns the value of the '<em><b>Informant</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Informant12}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informant</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Informant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Informant12> getInformant();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Participant2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Participant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Participant2> getParticipant();

	/**
	 * Returns the value of the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.EntryRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Relationship</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_EntryRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EntryRelationship> getEntryRelationship();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Reference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Precondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_Precondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Reference Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.ReferenceRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Range</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_ReferenceRange()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ReferenceRange> getReferenceRange();

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
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_NullFlavor()
	 * @model ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation
	 * @see #setClassCode(ActClassObservation)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_ClassCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActClassObservation getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(ActClassObservation value);

	/**
	 * Returns the value of the '<em><b>Mood Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mood Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation
	 * @see #setMoodCode(x_ActMoodDocumentObservation)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_MoodCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	x_ActMoodDocumentObservation getMoodCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation
	 * @see #getMoodCode()
	 * @generated
	 */
	void setMoodCode(x_ActMoodDocumentObservation value);

	/**
	 * Returns the value of the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negation Ind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negation Ind</em>' attribute.
	 * @see #setNegationInd(Boolean)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getObservation_NegationInd()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getNegationInd();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Observation#getNegationInd <em>Negation Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation Ind</em>' attribute.
	 * @see #getNegationInd()
	 * @generated
	 */
	void setNegationInd(Boolean value);

} // Observation