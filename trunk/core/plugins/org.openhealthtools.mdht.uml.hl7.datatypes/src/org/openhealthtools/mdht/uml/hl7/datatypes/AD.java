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
package org.openhealthtools.mdht.uml.hl7.datatypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUseablePeriods <em>Useable Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUses <em>Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getIsNotOrdered <em>Is Not Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDelimiters <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCountries <em>Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStates <em>State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCounties <em>County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCities <em>City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPostalCodes <em>Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetAddressLines <em>Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getHouseNumbers <em>House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getHouseNumberNumerics <em>House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDirections <em>Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNames <em>Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNameBases <em>Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNameTypes <em>Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getAdditionalLocators <em>Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUnitIDs <em>Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUnitTypes <em>Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCareOfs <em>Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCensusTracts <em>Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryAddressLines <em>Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationTypes <em>Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationAreas <em>Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationQualifiers <em>Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryModes <em>Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryModeIdentifiers <em>Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getBuildingNumberSuffixes <em>Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPostBoxes <em>Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPrecincts <em>Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getParts <em>Part</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getMixed <em>Mixed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface AD extends ANY {
	/**
	 * Returns the value of the '<em><b>Useable Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useable Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useable Period</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_UseablePeriod()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	EList<SXCM_TS> getUseablePeriods();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse}.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse
	 * @see #isSetUses()
	 * @see #unsetUses()
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Use()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	EList<PostalAddressUse> getUses();

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUses <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUses()
	 * @see #getUses()
	 * @generated
	 */
	void unsetUses();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUses <em>Use</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use</em>' attribute list is set.
	 * @see #unsetUses()
	 * @see #getUses()
	 * @generated
	 */
	boolean isSetUses();

	/**
	 * Returns the value of the '<em><b>Is Not Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Not Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not Ordered</em>' attribute.
	 * @see #setIsNotOrdered(Boolean)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_IsNotOrdered()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getIsNotOrdered();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getIsNotOrdered <em>Is Not Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Ordered</em>' attribute.
	 * @see #getIsNotOrdered()
	 * @generated
	 */
	void setIsNotOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Delimiter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDelimiters();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Country()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getCountries();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_State()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getStates();

	/**
	 * Returns the value of the '<em><b>County</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_County()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getCounties();

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_City()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getCities();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_PostalCode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getPostalCodes();

	/**
	 * Returns the value of the '<em><b>Street Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Address Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Address Line</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_StreetAddressLine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getStreetAddressLines();

	/**
	 * Returns the value of the '<em><b>House Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_HouseNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getHouseNumbers();

	/**
	 * Returns the value of the '<em><b>House Number Numeric</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House Number Numeric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number Numeric</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_HouseNumberNumeric()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getHouseNumberNumerics();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Direction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDirections();

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_StreetName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getStreetNames();

	/**
	 * Returns the value of the '<em><b>Street Name Base</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name Base</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name Base</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_StreetNameBase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getStreetNameBases();

	/**
	 * Returns the value of the '<em><b>Street Name Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name Type</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_StreetNameType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getStreetNameTypes();

	/**
	 * Returns the value of the '<em><b>Additional Locator</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Locator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Locator</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_AdditionalLocator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getAdditionalLocators();

	/**
	 * Returns the value of the '<em><b>Unit ID</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit ID</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit ID</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_UnitID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getUnitIDs();

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_UnitType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getUnitTypes();

	/**
	 * Returns the value of the '<em><b>Care Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Of</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_CareOf()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getCareOfs();

	/**
	 * Returns the value of the '<em><b>Census Tract</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Census Tract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Census Tract</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_CensusTract()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getCensusTracts();

	/**
	 * Returns the value of the '<em><b>Delivery Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Address Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Address Line</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_DeliveryAddressLine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDeliveryAddressLines();

	/**
	 * Returns the value of the '<em><b>Delivery Installation Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Installation Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Installation Type</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_DeliveryInstallationType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDeliveryInstallationTypes();

	/**
	 * Returns the value of the '<em><b>Delivery Installation Area</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Installation Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Installation Area</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_DeliveryInstallationArea()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDeliveryInstallationAreas();

	/**
	 * Returns the value of the '<em><b>Delivery Installation Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Installation Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Installation Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_DeliveryInstallationQualifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDeliveryInstallationQualifiers();

	/**
	 * Returns the value of the '<em><b>Delivery Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Mode</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_DeliveryMode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDeliveryModes();

	/**
	 * Returns the value of the '<em><b>Delivery Mode Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Mode Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Mode Identifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_DeliveryModeIdentifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getDeliveryModeIdentifiers();

	/**
	 * Returns the value of the '<em><b>Building Number Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Number Suffix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Number Suffix</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_BuildingNumberSuffix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getBuildingNumberSuffixes();

	/**
	 * Returns the value of the '<em><b>Post Box</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Box</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Box</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_PostBox()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getPostBoxes();

	/**
	 * Returns the value of the '<em><b>Precinct</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precinct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precinct</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Precinct()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ADXP> getPrecincts();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Part()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getParts();

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getAD_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.delimiter->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DEL)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.delimiter->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DEL)'"
	 * @generated
	 */
	boolean validateDelimiter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.country->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CNT)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.country->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CNT)'"
	 * @generated
	 */
	boolean validateCountry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.state->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STA)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.state->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STA)'"
	 * @generated
	 */
	boolean validateState(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.county->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CPA)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.county->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CPA)'"
	 * @generated
	 */
	boolean validateCounty(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.city->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CTY)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.city->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CTY)'"
	 * @generated
	 */
	boolean validateCity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.postalCode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ZIP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.postalCode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ZIP)'"
	 * @generated
	 */
	boolean validatePostalCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::SAL)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.streetAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::SAL)'"
	 * @generated
	 */
	boolean validateStreetAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.houseNumber->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.houseNumber->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNR)'"
	 * @generated
	 */
	boolean validateHouseNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.houseNumberNumeric->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNN)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.houseNumberNumeric->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNN)'"
	 * @generated
	 */
	boolean validateHouseNumberNumeric(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.direction->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DIR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.direction->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DIR)'"
	 * @generated
	 */
	boolean validateDirection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetName->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.streetName->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STR)'"
	 * @generated
	 */
	boolean validateStreetName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetNameBase->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STB)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.streetNameBase->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STB)'"
	 * @generated
	 */
	boolean validateStreetNameBase(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetNameType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STTYP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.streetNameType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STTYP)'"
	 * @generated
	 */
	boolean validateStreetNameType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.additionalLocator->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ADL)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.additionalLocator->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ADL)'"
	 * @generated
	 */
	boolean validateAdditionalLocator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.unitID->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNID)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.unitID->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNID)'"
	 * @generated
	 */
	boolean validateUnitID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.unitType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNIT)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.unitType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNIT)'"
	 * @generated
	 */
	boolean validateUnitType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.careOf->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CAR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.careOf->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CAR)'"
	 * @generated
	 */
	boolean validateCareOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.censusTract->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CEN)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.censusTract->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CEN)'"
	 * @generated
	 */
	boolean validateCensusTract(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DAL)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deliveryAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DAL)'"
	 * @generated
	 */
	boolean validateDeliveryAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryInstallationType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINST)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deliveryInstallationType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINST)'"
	 * @generated
	 */
	boolean validateDeliveryInstallationType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryInstallationArea->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTA)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deliveryInstallationArea->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTA)'"
	 * @generated
	 */
	boolean validateDeliveryInstallationArea(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryInstallationQualifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTQ)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deliveryInstallationQualifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTQ)'"
	 * @generated
	 */
	boolean validateDeliveryInstallationQualifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryMode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMOD)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deliveryMode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMOD)'"
	 * @generated
	 */
	boolean validateDeliveryMode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryModeIdentifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMODID)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deliveryModeIdentifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMODID)'"
	 * @generated
	 */
	boolean validateDeliveryModeIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.buildingNumberSuffix->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNS)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.buildingNumberSuffix->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNS)'"
	 * @generated
	 */
	boolean validateBuildingNumberSuffix(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.postBox->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::POB)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.postBox->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::POB)'"
	 * @generated
	 */
	boolean validatePostBox(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precinct->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::PRE)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.precinct->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::PRE)'"
	 * @generated
	 */
	boolean validatePrecinct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" delimiterRequired="true" delimiterOrdered="false"
	 * @generated
	 */
	AD addDelimiter(String delimiter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" countryRequired="true" countryOrdered="false"
	 * @generated
	 */
	AD addCountry(String country);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" stateRequired="true" stateOrdered="false"
	 * @generated
	 */
	AD addState(String state);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" countyRequired="true" countyOrdered="false"
	 * @generated
	 */
	AD addCounty(String county);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" cityRequired="true" cityOrdered="false"
	 * @generated
	 */
	AD addCity(String city);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" postalCodeRequired="true" postalCodeOrdered="false"
	 * @generated
	 */
	AD addPostalCode(String postalCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" streetAddressLineRequired="true" streetAddressLineOrdered="false"
	 * @generated
	 */
	AD addStreetAddressLine(String streetAddressLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" houseNumberRequired="true" houseNumberOrdered="false"
	 * @generated
	 */
	AD addHouseNumber(String houseNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" houseNumberNumericRequired="true" houseNumberNumericOrdered="false"
	 * @generated
	 */
	AD addHouseNumberNumeric(String houseNumberNumeric);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" directionRequired="true" directionOrdered="false"
	 * @generated
	 */
	AD addDirection(String direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" streetNameRequired="true" streetNameOrdered="false"
	 * @generated
	 */
	AD addStreetName(String streetName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" streetNameBaseRequired="true" streetNameBaseOrdered="false"
	 * @generated
	 */
	AD addStreetNameBase(String streetNameBase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" streetNameTypeRequired="true" streetNameTypeOrdered="false"
	 * @generated
	 */
	AD addStreetNameType(String streetNameType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" additionalLocatorRequired="true" additionalLocatorOrdered="false"
	 * @generated
	 */
	AD addAdditionalLocator(String additionalLocator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" unitIDRequired="true" unitIDOrdered="false"
	 * @generated
	 */
	AD addUnitID(String unitID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" unitTypeRequired="true" unitTypeOrdered="false"
	 * @generated
	 */
	AD addUnitType(String unitType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" careOfRequired="true" careOfOrdered="false"
	 * @generated
	 */
	AD addCareOf(String careOf);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" censusTractRequired="true" censusTractOrdered="false"
	 * @generated
	 */
	AD addCensusTract(String censusTract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" deliveryAddressLineRequired="true" deliveryAddressLineOrdered="false"
	 * @generated
	 */
	AD addDeliveryAddressLine(String deliveryAddressLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" deliveryInstallationTypeRequired="true" deliveryInstallationTypeOrdered="false"
	 * @generated
	 */
	AD addDeliveryInstallationType(String deliveryInstallationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" deliveryInstallationAreaRequired="true" deliveryInstallationAreaOrdered="false"
	 * @generated
	 */
	AD addDeliveryInstallationArea(String deliveryInstallationArea);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" deliveryInstallationQualifierRequired="true" deliveryInstallationQualifierOrdered="false"
	 * @generated
	 */
	AD addDeliveryInstallationQualifier(String deliveryInstallationQualifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" deliveryModeRequired="true" deliveryModeOrdered="false"
	 * @generated
	 */
	AD addDeliveryMode(String deliveryMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" deliveryModeIdentifierRequired="true" deliveryModeIdentifierOrdered="false"
	 * @generated
	 */
	AD addDeliveryModeIdentifier(String deliveryModeIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" buildingNumberSuffixRequired="true" buildingNumberSuffixOrdered="false"
	 * @generated
	 */
	AD addBuildingNumberSuffix(String buildingNumberSuffix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" postBoxRequired="true" postBoxOrdered="false"
	 * @generated
	 */
	AD addPostBox(String postBox);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" precinctRequired="true" precinctOrdered="false"
	 * @generated
	 */
	AD addPrecinct(String precinct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" textRequired="true" textOrdered="false"
	 * @generated
	 */
	AD addText(String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getText();

} // AD
