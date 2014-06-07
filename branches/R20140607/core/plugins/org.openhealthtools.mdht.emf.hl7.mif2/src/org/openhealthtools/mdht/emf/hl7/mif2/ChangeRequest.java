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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: ChangeRequest stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getChangeRequestId <em>Change Request Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getImplementedDate <em>Implemented Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getImplementingPersonName <em>Implementing Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getTargetDate <em>Target Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest()
 * @model extendedMetaData="name='ChangeRequest' kind='elementOnly'"
 * @generated
 */
public interface ChangeRequest extends BasicAnnotation {
	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what step(s) have neem agreed to be taken in response to the requested change.  (May be different than the proposed change itself.)
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BallotCommentResolution> getResolution();

	/**
	 * Returns the value of the '<em><b>Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate information associated with the change
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimate</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_Estimate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='estimate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangeRequestEstimate> getEstimate();

	/**
	 * Returns the value of the '<em><b>Change Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the Change Request submission with which this element is associated.
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Request Id</em>' attribute.
	 * @see #setChangeRequestId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_ChangeRequestId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='changeRequestId'"
	 * @generated
	 */
	String getChangeRequestId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getChangeRequestId <em>Change Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Request Id</em>' attribute.
	 * @see #getChangeRequestId()
	 * @generated
	 */
	void setChangeRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Implemented Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the date on which the requested change was made
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented Date</em>' attribute.
	 * @see #setImplementedDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_ImplementedDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='implementedDate'"
	 * @generated
	 */
	XMLGregorianCalendar getImplementedDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getImplementedDate <em>Implemented Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented Date</em>' attribute.
	 * @see #getImplementedDate()
	 * @generated
	 */
	void setImplementedDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Implementing Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the person who made the change or took responsibility for it having been made
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementing Person Name</em>' attribute.
	 * @see #setImplementingPersonName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_ImplementingPersonName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='implementingPersonName'"
	 * @generated
	 */
	String getImplementingPersonName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getImplementingPersonName <em>Implementing Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Person Name</em>' attribute.
	 * @see #getImplementingPersonName()
	 * @generated
	 */
	void setImplementingPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the location within the artifact the change request applies.  May be a section reference, a paragraph/sentence count, etc.
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_Location()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the position of the change request within the approval process
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(ChangeRequestStatus)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	ChangeRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ChangeRequestStatus value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ChangeRequestStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ChangeRequestStatus)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Target Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the date by which it is intended that the requested change be complete
	 * UML: tag on ChangeRequest stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Date</em>' attribute.
	 * @see #setTargetDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequest_TargetDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='targetDate'"
	 * @generated
	 */
	XMLGregorianCalendar getTargetDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest#getTargetDate <em>Target Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Date</em>' attribute.
	 * @see #getTargetDate()
	 * @generated
	 */
	void setTargetDate(XMLGregorianCalendar value);

} // ChangeRequest
