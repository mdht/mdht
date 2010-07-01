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
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getConfidentialityCode <em>Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getInformants <em>Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getComponents <em>Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getSectionId <em>Section Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_RealmCode()
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getTypeId <em>Type Id</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(II)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Id()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	II getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(II value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Code()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	CE getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CE value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(ST)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Title()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ST getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(ST value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(StrucDocText)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Text()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	StrucDocText getText();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(StrucDocText value);

	/**
	 * Returns the value of the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidentiality Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality Code</em>' containment reference.
	 * @see #setConfidentialityCode(CE)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_ConfidentialityCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	CE getConfidentialityCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getConfidentialityCode <em>Confidentiality Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality Code</em>' containment reference.
	 * @see #getConfidentialityCode()
	 * @generated
	 */
	void setConfidentialityCode(CE value);

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_LanguageCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	CS getLanguageCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getLanguageCode <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' containment reference.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(CS value);

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Subject()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Author()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Author> getAuthors();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Informant()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Informant12> getInformants();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Entry()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.Component5}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_Component()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Component5> getComponents();

	/**
	 * Returns the value of the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Id</em>' attribute.
	 * @see #isSetSectionId()
	 * @see #unsetSectionId()
	 * @see #setSectionId(String)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_SectionId()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='ID' kind='attribute'"
	 * @generated
	 */
	String getSectionId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getSectionId <em>Section Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Id</em>' attribute.
	 * @see #isSetSectionId()
	 * @see #unsetSectionId()
	 * @see #getSectionId()
	 * @generated
	 */
	void setSectionId(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getSectionId <em>Section Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSectionId()
	 * @see #getSectionId()
	 * @see #setSectionId(String)
	 * @generated
	 */
	void unsetSectionId();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getSectionId <em>Section Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Section Id</em>' attribute is set.
	 * @see #unsetSectionId()
	 * @see #getSectionId()
	 * @see #setSectionId(String)
	 * @generated
	 */
	boolean isSetSectionId();

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
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getNullFlavor <em>Null Flavor</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getNullFlavor <em>Null Flavor</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The default value is <code>"DOCSECT"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ActClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #setClassCode(ActClass)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_ClassCode()
	 * @model default="DOCSECT" unsettable="true" ordered="false"
	 * @generated
	 */
	ActClass getClassCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(ActClass value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(ActClass)
	 * @generated
	 */
	void unsetClassCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getClassCode <em>Class Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Code</em>' attribute is set.
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(ActClass)
	 * @generated
	 */
	boolean isSetClassCode();

	/**
	 * Returns the value of the '<em><b>Mood Code</b></em>' attribute.
	 * The default value is <code>"EVN"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ActMood}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mood Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @see #isSetMoodCode()
	 * @see #unsetMoodCode()
	 * @see #setMoodCode(ActMood)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getSection_MoodCode()
	 * @model default="EVN" unsettable="true" ordered="false"
	 * @generated
	 */
	ActMood getMoodCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mood Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @see #isSetMoodCode()
	 * @see #unsetMoodCode()
	 * @see #getMoodCode()
	 * @generated
	 */
	void setMoodCode(ActMood value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoodCode()
	 * @see #getMoodCode()
	 * @see #setMoodCode(ActMood)
	 * @generated
	 */
	void unsetMoodCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Section#getMoodCode <em>Mood Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mood Code</em>' attribute is set.
	 * @see #unsetMoodCode()
	 * @see #getMoodCode()
	 * @see #setMoodCode(ActMood)
	 * @generated
	 */
	boolean isSetMoodCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model actRequired="true" actOrdered="false"
	 * @generated
	 */
	void addAct(Act act);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model encounterRequired="true" encounterOrdered="false"
	 * @generated
	 */
	void addEncounter(Encounter encounter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model observationRequired="true" observationOrdered="false"
	 * @generated
	 */
	void addObservation(Observation observation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model observationMediaRequired="true" observationMediaOrdered="false"
	 * @generated
	 */
	void addObservationMedia(ObservationMedia observationMedia);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model organizerRequired="true" organizerOrdered="false"
	 * @generated
	 */
	void addOrganizer(Organizer organizer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model procedureRequired="true" procedureOrdered="false"
	 * @generated
	 */
	void addProcedure(Procedure procedure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model regionOfInterestRequired="true" regionOfInterestOrdered="false"
	 * @generated
	 */
	void addRegionOfInterest(RegionOfInterest regionOfInterest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newSectionRequired="true" newSectionOrdered="false"
	 * @generated
	 */
	void addSection(Section newSection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model substanceAdministrationRequired="true" substanceAdministrationOrdered="false"
	 * @generated
	 */
	void addSubstanceAdministration(SubstanceAdministration substanceAdministration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model supplyRequired="true" supplyOrdered="false"
	 * @generated
	 */
	void addSupply(Supply supply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" xmlStringRequired="true" xmlStringOrdered="false"
	 * @generated
	 */
	StrucDocText createStrucDocText(String xmlString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.act->select(act : cda::Act | not act.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.act->select(act : cda::Act | not act.oclIsUndefined())'"
	 * @generated
	 */
	EList<Act> getActs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ClinicalDocument getClinicalDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.encounter->select(enc : cda::Encounter | not enc.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.encounter->select(enc : cda::Encounter | not enc.oclIsUndefined())'"
	 * @generated
	 */
	EList<Encounter> getEncounters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.observation->select(obs : cda::Observation | not obs.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.observation->select(obs : cda::Observation | not obs.oclIsUndefined())'"
	 * @generated
	 */
	EList<Observation> getObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.observationMedia->select(media : cda::ObservationMedia | not media.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.observationMedia->select(media : cda::ObservationMedia | not media.oclIsUndefined())'"
	 * @generated
	 */
	EList<ObservationMedia> getObservationMedia();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.organizer->select(org : cda::Organizer | not org.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.organizer->select(org : cda::Organizer | not org.oclIsUndefined())'"
	 * @generated
	 */
	EList<Organizer> getOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.procedure->select(proc : cda::Procedure | not proc.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.procedure->select(proc : cda::Procedure | not proc.oclIsUndefined())'"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.regionOfInterest->select(reg : cda::RegionOfInterest | not reg.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.regionOfInterest->select(reg : cda::RegionOfInterest | not reg.oclIsUndefined())'"
	 * @generated
	 */
	EList<RegionOfInterest> getRegionsOfInterest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.section
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.section'"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 * @generated
	 */
	EList<Section> getAllSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.substanceAdministration->select(sub : cda::SubstanceAdministration | not sub.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.substanceAdministration->select(sub : cda::SubstanceAdministration | not sub.oclIsUndefined())'"
	 * @generated
	 */
	EList<SubstanceAdministration> getSubstanceAdministrations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.supply->select(sup : cda::Supply | not sup.oclIsUndefined())
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry.supply->select(sup : cda::Supply | not sup.oclIsUndefined())'"
	 * @generated
	 */
	EList<Supply> getSupplies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(act : cda::Act | act.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasActTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" codeRequired="true" codeOrdered="false" codeSystemRequired="true" codeSystemOrdered="false" codeSystemNameRequired="true" codeSystemNameOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName'"
	 * @generated
	 */
	boolean hasCode(String code, String codeSystem, String codeSystemName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasEncounterTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasObservationMediaTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasObservationTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->exists(org : cda::Organizer | org.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasOrganizerTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasProcedureTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionsOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getRegionsOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasRegionOfInterestTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasSubstanceAdministrationTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSections()->exists(sect : cda::Section | sect.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasSectionTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))'"
	 * @generated
	 */
	boolean hasSupplyTemplate(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = templateId)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" templateIdRequired="true" templateIdOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = templateId)'"
	 * @generated
	 */
	boolean hasTemplateId(String templateId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" typeCodeRequired="true" typeCodeOrdered="false" targetClassRequired="true" targetClassOrdered="false"
	 * @generated
	 */
	EList<ClinicalStatement> getEntryTargets(x_ActRelationshipEntry typeCode, Object targetClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" targetClassRequired="true" targetClassOrdered="false"
	 * @generated
	 */
	EList<ClinicalStatement> getEntryTargets(Object targetClass);
	
} // Section
