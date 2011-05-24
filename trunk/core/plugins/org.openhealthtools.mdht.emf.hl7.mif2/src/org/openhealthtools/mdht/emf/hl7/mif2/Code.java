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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific code or mnemonic that is part of a code system
 * UML: EnumerationItem
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getCodeProperty <em>Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getPropertyGroup <em>Property Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getRetirementDate <em>Retirement Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode()
 * @model extendedMetaData="name='Code' kind='elementOnly'"
 * @generated
 */
public interface Code extends EObject {
	/**
	 * Returns the value of the '<em><b>Print Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preferred and alternative print names for this particular code in a specified language.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_PrintName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='printName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrintName> getPrintName();

	/**
	 * Returns the value of the '<em><b>Code Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional property of the concept expressed as a coded name with an associated value.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_CodeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptProperty> getCodeProperty();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mnemonic or id of the code that is supported by the code system.
	 * UML: Corresponds to EnumerationItem.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_Code()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the first date on which the code is expected to be used.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_EffectiveDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='effectiveDate'"
	 * @generated
	 */
	XMLGregorianCalendar getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Property Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a pre-defined group of property values that apply to this code
	 * UML: N/A - this is a serialization shortcut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Group</em>' attribute.
	 * @see #setPropertyGroup(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_PropertyGroup()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='propertyGroup'"
	 * @generated
	 */
	String getPropertyGroup();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getPropertyGroup <em>Property Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Group</em>' attribute.
	 * @see #getPropertyGroup()
	 * @generated
	 */
	void setPropertyGroup(String value);

	/**
	 * Returns the value of the '<em><b>Retirement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the last date on which the code is considered valid to be used.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retirement Date</em>' attribute.
	 * @see #setRetirementDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_RetirementDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='retirementDate'"
	 * @generated
	 */
	XMLGregorianCalendar getRetirementDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getRetirementDate <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retirement Date</em>' attribute.
	 * @see #getRetirementDate()
	 * @generated
	 */
	void setRetirementDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"active"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeStatusKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the concept is intended to be currently used.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeStatusKind
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(CodeStatusKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCode_Status()
	 * @model default="active" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	CodeStatusKind getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeStatusKind
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeStatusKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(CodeStatusKind)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(CodeStatusKind)
	 * @generated
	 */
	boolean isSetStatus();

} // Code
