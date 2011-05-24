/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides internal versioning information about an item.  Each repetition indicates a separate version the artifact has gone through.
 * UML: tagged object on ModelElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsBackwardCompatibleChange <em>Is Backward Compatible Change</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsSubstantiveChange <em>Is Substantive Change</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getResponsiblePersonName <em>Responsible Person Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem()
 * @model extendedMetaData="name='HistoryItem' kind='elementOnly'"
 * @generated
 */
public interface HistoryItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the changes that occurred and why FUTURE_USE, INTERFACE_DESIGN
	 * UML: part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Flow value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the date and time on which the version was created.
	 * UML: part of a complex tag value
	 * DublinCore: First occurrence corresponds to 'created', all others correspond to 'Modified'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem_DateTime()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.DateOrTimestamp" required="true"
	 *        extendedMetaData="kind='attribute' name='dateTime'"
	 * @generated
	 */
	XMLGregorianCalendar getDateTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique Uuid assigned to this particular version of the artifact.
	 * UML: part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem_Id()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Uuid"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Backward Compatible Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the changes made are considered backward compatible.  I.e implementers (creators and readers) of the previous version should be able to support the new version without adjusting their interfaces. FUTURE_USE, INTERFACE_DESIGN
	 * UML: part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Backward Compatible Change</em>' attribute.
	 * @see #isSetIsBackwardCompatibleChange()
	 * @see #unsetIsBackwardCompatibleChange()
	 * @see #setIsBackwardCompatibleChange(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem_IsBackwardCompatibleChange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isBackwardCompatibleChange'"
	 * @generated
	 */
	boolean isIsBackwardCompatibleChange();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsBackwardCompatibleChange <em>Is Backward Compatible Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Backward Compatible Change</em>' attribute.
	 * @see #isSetIsBackwardCompatibleChange()
	 * @see #unsetIsBackwardCompatibleChange()
	 * @see #isIsBackwardCompatibleChange()
	 * @generated
	 */
	void setIsBackwardCompatibleChange(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsBackwardCompatibleChange <em>Is Backward Compatible Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBackwardCompatibleChange()
	 * @see #isIsBackwardCompatibleChange()
	 * @see #setIsBackwardCompatibleChange(boolean)
	 * @generated
	 */
	void unsetIsBackwardCompatibleChange();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsBackwardCompatibleChange <em>Is Backward Compatible Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Backward Compatible Change</em>' attribute is set.
	 * @see #unsetIsBackwardCompatibleChange()
	 * @see #isIsBackwardCompatibleChange()
	 * @see #setIsBackwardCompatibleChange(boolean)
	 * @generated
	 */
	boolean isSetIsBackwardCompatibleChange();

	/**
	 * Returns the value of the '<em><b>Is Substantive Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the changes made are considered 'substantive'.  Substantive changes have impact on balloting requirements.FUTURE_USE, INTERFACE_DESIGN
	 * UML: part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Substantive Change</em>' attribute.
	 * @see #isSetIsSubstantiveChange()
	 * @see #unsetIsSubstantiveChange()
	 * @see #setIsSubstantiveChange(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem_IsSubstantiveChange()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isSubstantiveChange'"
	 * @generated
	 */
	boolean isIsSubstantiveChange();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsSubstantiveChange <em>Is Substantive Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substantive Change</em>' attribute.
	 * @see #isSetIsSubstantiveChange()
	 * @see #unsetIsSubstantiveChange()
	 * @see #isIsSubstantiveChange()
	 * @generated
	 */
	void setIsSubstantiveChange(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsSubstantiveChange <em>Is Substantive Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSubstantiveChange()
	 * @see #isIsSubstantiveChange()
	 * @see #setIsSubstantiveChange(boolean)
	 * @generated
	 */
	void unsetIsSubstantiveChange();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#isIsSubstantiveChange <em>Is Substantive Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Substantive Change</em>' attribute is set.
	 * @see #unsetIsSubstantiveChange()
	 * @see #isIsSubstantiveChange()
	 * @see #setIsSubstantiveChange(boolean)
	 * @generated
	 */
	boolean isSetIsSubstantiveChange();

	/**
	 * Returns the value of the '<em><b>Responsible Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the name of the person responsible for creating the new version.  (To see who created the initial version, look for the history item with the earliest dateTime).FUTURE_USE
	 * UML: part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible Person Name</em>' attribute.
	 * @see #setResponsiblePersonName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHistoryItem_ResponsiblePersonName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='responsiblePersonName'"
	 * @generated
	 */
	String getResponsiblePersonName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem#getResponsiblePersonName <em>Responsible Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person Name</em>' attribute.
	 * @see #getResponsiblePersonName()
	 * @generated
	 */
	void setResponsiblePersonName(String value);

} // HistoryItem
