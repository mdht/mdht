/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set Base</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A common base for various change set elements. This exists to allow ChangeSet to be represented as a choice in the "Updates" module
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreator <em>Creator</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeInstructions <em>Change Instructions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getMember <em>Member</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeSetURI <em>Change Set URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCloseDate <em>Close Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getEntryCount <em>Entry Count</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getOfficialEffectiveDate <em>Official Effective Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase()
 * @model extendedMetaData="name='ChangeSetBase' kind='elementOnly'"
 * @generated
 */
public interface ChangeSetBase extends Finalizable {
	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the person or organization who initially created the change set
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(SourceReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_Creator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceReference getCreator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(SourceReference value);

	/**
	 * Returns the value of the '<em><b>Change Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * documentation and instructions about the purpose and application of the change set
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Instructions</em>' containment reference.
	 * @see #setChangeInstructions(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_ChangeInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getChangeInstructions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeInstructions <em>Change Instructions</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Instructions</em>' containment reference.
	 * @see #getChangeInstructions()
	 * @generated
	 */
	void setChangeInstructions(OpaqueData value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getMember();

	/**
	 * Returns the value of the '<em><b>Change Set URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a globally unique identifier that signifies this particular change set
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Set URI</em>' attribute.
	 * @see #setChangeSetURI(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_ChangeSetURI()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ChangeSetURI" required="true"
	 *        extendedMetaData="kind='attribute' name='changeSetURI'"
	 * @generated
	 */
	String getChangeSetURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getChangeSetURI <em>Change Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Set URI</em>' attribute.
	 * @see #getChangeSetURI()
	 * @generated
	 */
	void setChangeSetURI(String value);

	/**
	 * Returns the value of the '<em><b>Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date and time that this change set was finalized (<i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">state</i> = <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">FINAL</i>). Once finalized, a change set cannot be further modified.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Close Date</em>' attribute.
	 * @see #setCloseDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_CloseDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime"
	 *        extendedMetaData="kind='attribute' name='closeDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCloseDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCloseDate <em>Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Close Date</em>' attribute.
	 * @see #getCloseDate()
	 * @generated
	 */
	void setCloseDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date and time that the change set was initially created
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_CreationDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime" required="true"
	 *        extendedMetaData="kind='attribute' name='creationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Entry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the number of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> members in the set
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entry Count</em>' attribute.
	 * @see #setEntryCount(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_EntryCount()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NaturalNumber"
	 *        extendedMetaData="kind='attribute' name='entryCount'"
	 * @generated
	 */
	BigInteger getEntryCount();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getEntryCount <em>Entry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entry Count</em>' attribute.
	 * @see #getEntryCount()
	 * @generated
	 */
	void setEntryCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Official Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date and time that this set of changes became (or should become) effective <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">from the
	 * perspective of the authors</i>. This parameter enables history queries from both the perspective of the service
	 * ("What did the service return on July 1") and the perspective of the resource author
	 * ("What would the state of the terminology have been on July 1 had it been loaded prior to that date and not been locally modified?").
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Official Effective Date</em>' attribute.
	 * @see #setOfficialEffectiveDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeSetBase_OfficialEffectiveDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime"
	 *        extendedMetaData="kind='attribute' name='officialEffectiveDate'"
	 * @generated
	 */
	XMLGregorianCalendar getOfficialEffectiveDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase#getOfficialEffectiveDate <em>Official Effective Date</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Official Effective Date</em>' attribute.
	 * @see #getOfficialEffectiveDate()
	 * @generated
	 */
	void setOfficialEffectiveDate(XMLGregorianCalendar value);

} // ChangeSetBase
