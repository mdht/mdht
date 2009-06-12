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
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.internal.operations.ADOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUseablePeriod <em>Useable Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getIsNotOrdered <em>Is Not Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getState <em>State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCounty <em>County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetAddressLine <em>Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getHouseNumberNumeric <em>House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetNameBase <em>Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetNameType <em>Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getAdditionalLocator <em>Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUnitID <em>Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCareOf <em>Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCensusTract <em>Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryAddressLine <em>Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryInstallationType <em>Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryInstallationArea <em>Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryInstallationQualifier <em>Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryMode <em>Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryModeIdentifier <em>Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getBuildingNumberSuffix <em>Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPrecinct <em>Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getMixed <em>Mixed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADImpl extends ANYImpl implements AD {
	/**
	 * The cached value of the '{@link #getUseablePeriod() <em>Useable Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseablePeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<SXCM_TS> useablePeriod;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<PostalAddressUse> use;

	/**
	 * The default value of the '{@link #getIsNotOrdered() <em>Is Not Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNotOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NOT_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNotOrdered() <em>Is Not Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNotOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNotOrdered = IS_NOT_ORDERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.AD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SXCM_TS> getUseablePeriod() {
		if (useablePeriod == null) {
			useablePeriod = new EObjectContainmentEList<SXCM_TS>(SXCM_TS.class, this, DatatypesPackage.AD__USEABLE_PERIOD);
		}
		return useablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostalAddressUse> getUse() {
		if (use == null) {
			use = new EDataTypeUniqueEList<PostalAddressUse>(PostalAddressUse.class, this, DatatypesPackage.AD__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNotOrdered() {
		return isNotOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotOrdered(Boolean newIsNotOrdered) {
		Boolean oldIsNotOrdered = isNotOrdered;
		isNotOrdered = newIsNotOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.AD__IS_NOT_ORDERED, oldIsNotOrdered, isNotOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDelimiter() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIMITER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCountry() {
		return getPart().list(DatatypesPackage.Literals.AD__COUNTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getState() {
		return getPart().list(DatatypesPackage.Literals.AD__STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCounty() {
		return getPart().list(DatatypesPackage.Literals.AD__COUNTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCity() {
		return getPart().list(DatatypesPackage.Literals.AD__CITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getPostalCode() {
		return getPart().list(DatatypesPackage.Literals.AD__POSTAL_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetAddressLine() {
		return getPart().list(DatatypesPackage.Literals.AD__STREET_ADDRESS_LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getHouseNumber() {
		return getPart().list(DatatypesPackage.Literals.AD__HOUSE_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getHouseNumberNumeric() {
		return getPart().list(DatatypesPackage.Literals.AD__HOUSE_NUMBER_NUMERIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDirection() {
		return getPart().list(DatatypesPackage.Literals.AD__DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetName() {
		return getPart().list(DatatypesPackage.Literals.AD__STREET_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetNameBase() {
		return getPart().list(DatatypesPackage.Literals.AD__STREET_NAME_BASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetNameType() {
		return getPart().list(DatatypesPackage.Literals.AD__STREET_NAME_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getAdditionalLocator() {
		return getPart().list(DatatypesPackage.Literals.AD__ADDITIONAL_LOCATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getUnitID() {
		return getPart().list(DatatypesPackage.Literals.AD__UNIT_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getUnitType() {
		return getPart().list(DatatypesPackage.Literals.AD__UNIT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCareOf() {
		return getPart().list(DatatypesPackage.Literals.AD__CARE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCensusTract() {
		return getPart().list(DatatypesPackage.Literals.AD__CENSUS_TRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryAddressLine() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIVERY_ADDRESS_LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryInstallationType() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIVERY_INSTALLATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryInstallationArea() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIVERY_INSTALLATION_AREA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryInstallationQualifier() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIVERY_INSTALLATION_QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryMode() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIVERY_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryModeIdentifier() {
		return getPart().list(DatatypesPackage.Literals.AD__DELIVERY_MODE_IDENTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getBuildingNumberSuffix() {
		return getPart().list(DatatypesPackage.Literals.AD__BUILDING_NUMBER_SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getPostBox() {
		return getPart().list(DatatypesPackage.Literals.AD__POST_BOX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getPrecinct() {
		return getPart().list(DatatypesPackage.Literals.AD__PRECINCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPart() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DatatypesPackage.Literals.AD__PART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DatatypesPackage.AD__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean delimiter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.delimiter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean country(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.country(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean state(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.state(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean county(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.county(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean city(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.city(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean postalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.postalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean streetAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.streetAddressLine(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean houseNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.houseNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean houseNumberNumeric(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.houseNumberNumeric(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean direction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.direction(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean streetName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.streetName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean streetNameBase(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.streetNameBase(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean streetNameType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.streetNameType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean additionalLocator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.additionalLocator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean unitID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.unitID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean unitType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.unitType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean careOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.careOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean censusTract(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.censusTract(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deliveryAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.deliveryAddressLine(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deliveryInstallationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.deliveryInstallationType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deliveryInstallationArea(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.deliveryInstallationArea(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deliveryInstallationQualifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.deliveryInstallationQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deliveryMode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.deliveryMode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deliveryModeIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.deliveryModeIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean buildingNumberSuffix(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.buildingNumberSuffix(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean postBox(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.postBox(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean precinct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.precinct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDelimiter(String delimiter) {
		return ADOperations.addDelimiter(this, delimiter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addCountry(String country) {
		return ADOperations.addCountry(this, country);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addState(String state) {
		return ADOperations.addState(this, state);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addCounty(String county) {
		return ADOperations.addCounty(this, county);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addCity(String city) {
		return ADOperations.addCity(this, city);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addPostalCode(String postalCode) {
		return ADOperations.addPostalCode(this, postalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addStreetAddressLine(String streetAddressLine) {
		return ADOperations.addStreetAddressLine(this, streetAddressLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addHouseNumber(String houseNumber) {
		return ADOperations.addHouseNumber(this, houseNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addHouseNumberNumeric(String houseNumberNumeric) {
		return ADOperations.addHouseNumberNumeric(this, houseNumberNumeric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDirection(String direction) {
		return ADOperations.addDirection(this, direction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addStreetName(String streetName) {
		return ADOperations.addStreetName(this, streetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addStreetNameBase(String streetNameBase) {
		return ADOperations.addStreetNameBase(this, streetNameBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addStreetNameType(String streetNameType) {
		return ADOperations.addStreetNameType(this, streetNameType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addAdditionalLocator(String additionalLocator) {
		return ADOperations.addAdditionalLocator(this, additionalLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addUnitID(String unitID) {
		return ADOperations.addUnitID(this, unitID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addUnitType(String unitType) {
		return ADOperations.addUnitType(this, unitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addCareOf(String careOf) {
		return ADOperations.addCareOf(this, careOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addCensusTract(String censusTract) {
		return ADOperations.addCensusTract(this, censusTract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDeliveryAddressLine(String deliveryAddressLine) {
		return ADOperations.addDeliveryAddressLine(this, deliveryAddressLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDeliveryInstallationType(String deliveryInstallationType) {
		return ADOperations.addDeliveryInstallationType(this, deliveryInstallationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDeliveryInstallationArea(String deliveryInstallationArea) {
		return ADOperations.addDeliveryInstallationArea(this, deliveryInstallationArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDeliveryInstallationQualifier(String deliveryInstallationQualifier) {
		return ADOperations.addDeliveryInstallationQualifier(this, deliveryInstallationQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDeliveryMode(String deliveryMode) {
		return ADOperations.addDeliveryMode(this, deliveryMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addDeliveryModeIdentifier(String deliveryModeIdentifier) {
		return ADOperations.addDeliveryModeIdentifier(this, deliveryModeIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addBuildingNumberSuffix(String buildingNumberSuffix) {
		return ADOperations.addBuildingNumberSuffix(this, buildingNumberSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addPostBox(String postBox) {
		return ADOperations.addPostBox(this, postBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addPrecinct(String precinct) {
		return ADOperations.addPrecinct(this, precinct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD addText(String text) {
		return ADOperations.addText(this, text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return ADOperations.getText(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.AD__USEABLE_PERIOD:
				return ((InternalEList<?>)getUseablePeriod()).basicRemove(otherEnd, msgs);
			case DatatypesPackage.AD__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case DatatypesPackage.AD__USEABLE_PERIOD:
				return getUseablePeriod();
			case DatatypesPackage.AD__USE:
				return getUse();
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				return getIsNotOrdered();
			case DatatypesPackage.AD__DELIMITER:
				return getDelimiter();
			case DatatypesPackage.AD__COUNTRY:
				return getCountry();
			case DatatypesPackage.AD__STATE:
				return getState();
			case DatatypesPackage.AD__COUNTY:
				return getCounty();
			case DatatypesPackage.AD__CITY:
				return getCity();
			case DatatypesPackage.AD__POSTAL_CODE:
				return getPostalCode();
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				return getStreetAddressLine();
			case DatatypesPackage.AD__HOUSE_NUMBER:
				return getHouseNumber();
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				return getHouseNumberNumeric();
			case DatatypesPackage.AD__DIRECTION:
				return getDirection();
			case DatatypesPackage.AD__STREET_NAME:
				return getStreetName();
			case DatatypesPackage.AD__STREET_NAME_BASE:
				return getStreetNameBase();
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				return getStreetNameType();
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				return getAdditionalLocator();
			case DatatypesPackage.AD__UNIT_ID:
				return getUnitID();
			case DatatypesPackage.AD__UNIT_TYPE:
				return getUnitType();
			case DatatypesPackage.AD__CARE_OF:
				return getCareOf();
			case DatatypesPackage.AD__CENSUS_TRACT:
				return getCensusTract();
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				return getDeliveryAddressLine();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				return getDeliveryInstallationType();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				return getDeliveryInstallationArea();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				return getDeliveryInstallationQualifier();
			case DatatypesPackage.AD__DELIVERY_MODE:
				return getDeliveryMode();
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				return getDeliveryModeIdentifier();
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				return getBuildingNumberSuffix();
			case DatatypesPackage.AD__POST_BOX:
				return getPostBox();
			case DatatypesPackage.AD__PRECINCT:
				return getPrecinct();
			case DatatypesPackage.AD__PART:
				if (coreType) return getPart();
				return ((FeatureMap.Internal)getPart()).getWrapper();
			case DatatypesPackage.AD__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
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
			case DatatypesPackage.AD__USEABLE_PERIOD:
				getUseablePeriod().clear();
				getUseablePeriod().addAll((Collection<? extends SXCM_TS>)newValue);
				return;
			case DatatypesPackage.AD__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends PostalAddressUse>)newValue);
				return;
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				setIsNotOrdered((Boolean)newValue);
				return;
			case DatatypesPackage.AD__DELIMITER:
				getDelimiter().clear();
				getDelimiter().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__STATE:
				getState().clear();
				getState().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__COUNTY:
				getCounty().clear();
				getCounty().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				getStreetAddressLine().clear();
				getStreetAddressLine().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER:
				getHouseNumber().clear();
				getHouseNumber().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				getHouseNumberNumeric().clear();
				getHouseNumberNumeric().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DIRECTION:
				getDirection().clear();
				getDirection().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__STREET_NAME:
				getStreetName().clear();
				getStreetName().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__STREET_NAME_BASE:
				getStreetNameBase().clear();
				getStreetNameBase().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				getStreetNameType().clear();
				getStreetNameType().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				getAdditionalLocator().clear();
				getAdditionalLocator().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__UNIT_ID:
				getUnitID().clear();
				getUnitID().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__UNIT_TYPE:
				getUnitType().clear();
				getUnitType().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__CARE_OF:
				getCareOf().clear();
				getCareOf().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__CENSUS_TRACT:
				getCensusTract().clear();
				getCensusTract().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				getDeliveryAddressLine().clear();
				getDeliveryAddressLine().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				getDeliveryInstallationType().clear();
				getDeliveryInstallationType().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				getDeliveryInstallationArea().clear();
				getDeliveryInstallationArea().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				getDeliveryInstallationQualifier().clear();
				getDeliveryInstallationQualifier().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_MODE:
				getDeliveryMode().clear();
				getDeliveryMode().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				getDeliveryModeIdentifier().clear();
				getDeliveryModeIdentifier().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				getBuildingNumberSuffix().clear();
				getBuildingNumberSuffix().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__POST_BOX:
				getPostBox().clear();
				getPostBox().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__PRECINCT:
				getPrecinct().clear();
				getPrecinct().addAll((Collection<? extends ADXP>)newValue);
				return;
			case DatatypesPackage.AD__PART:
				((FeatureMap.Internal)getPart()).set(newValue);
				return;
			case DatatypesPackage.AD__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
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
			case DatatypesPackage.AD__USEABLE_PERIOD:
				getUseablePeriod().clear();
				return;
			case DatatypesPackage.AD__USE:
				getUse().clear();
				return;
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				setIsNotOrdered(IS_NOT_ORDERED_EDEFAULT);
				return;
			case DatatypesPackage.AD__DELIMITER:
				getDelimiter().clear();
				return;
			case DatatypesPackage.AD__COUNTRY:
				getCountry().clear();
				return;
			case DatatypesPackage.AD__STATE:
				getState().clear();
				return;
			case DatatypesPackage.AD__COUNTY:
				getCounty().clear();
				return;
			case DatatypesPackage.AD__CITY:
				getCity().clear();
				return;
			case DatatypesPackage.AD__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				getStreetAddressLine().clear();
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER:
				getHouseNumber().clear();
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				getHouseNumberNumeric().clear();
				return;
			case DatatypesPackage.AD__DIRECTION:
				getDirection().clear();
				return;
			case DatatypesPackage.AD__STREET_NAME:
				getStreetName().clear();
				return;
			case DatatypesPackage.AD__STREET_NAME_BASE:
				getStreetNameBase().clear();
				return;
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				getStreetNameType().clear();
				return;
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				getAdditionalLocator().clear();
				return;
			case DatatypesPackage.AD__UNIT_ID:
				getUnitID().clear();
				return;
			case DatatypesPackage.AD__UNIT_TYPE:
				getUnitType().clear();
				return;
			case DatatypesPackage.AD__CARE_OF:
				getCareOf().clear();
				return;
			case DatatypesPackage.AD__CENSUS_TRACT:
				getCensusTract().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				getDeliveryAddressLine().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				getDeliveryInstallationType().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				getDeliveryInstallationArea().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				getDeliveryInstallationQualifier().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_MODE:
				getDeliveryMode().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				getDeliveryModeIdentifier().clear();
				return;
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				getBuildingNumberSuffix().clear();
				return;
			case DatatypesPackage.AD__POST_BOX:
				getPostBox().clear();
				return;
			case DatatypesPackage.AD__PRECINCT:
				getPrecinct().clear();
				return;
			case DatatypesPackage.AD__PART:
				getPart().clear();
				return;
			case DatatypesPackage.AD__MIXED:
				getMixed().clear();
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
			case DatatypesPackage.AD__USEABLE_PERIOD:
				return useablePeriod != null && !useablePeriod.isEmpty();
			case DatatypesPackage.AD__USE:
				return use != null && !use.isEmpty();
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				return IS_NOT_ORDERED_EDEFAULT == null ? isNotOrdered != null : !IS_NOT_ORDERED_EDEFAULT.equals(isNotOrdered);
			case DatatypesPackage.AD__DELIMITER:
				return !getDelimiter().isEmpty();
			case DatatypesPackage.AD__COUNTRY:
				return !getCountry().isEmpty();
			case DatatypesPackage.AD__STATE:
				return !getState().isEmpty();
			case DatatypesPackage.AD__COUNTY:
				return !getCounty().isEmpty();
			case DatatypesPackage.AD__CITY:
				return !getCity().isEmpty();
			case DatatypesPackage.AD__POSTAL_CODE:
				return !getPostalCode().isEmpty();
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				return !getStreetAddressLine().isEmpty();
			case DatatypesPackage.AD__HOUSE_NUMBER:
				return !getHouseNumber().isEmpty();
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				return !getHouseNumberNumeric().isEmpty();
			case DatatypesPackage.AD__DIRECTION:
				return !getDirection().isEmpty();
			case DatatypesPackage.AD__STREET_NAME:
				return !getStreetName().isEmpty();
			case DatatypesPackage.AD__STREET_NAME_BASE:
				return !getStreetNameBase().isEmpty();
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				return !getStreetNameType().isEmpty();
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				return !getAdditionalLocator().isEmpty();
			case DatatypesPackage.AD__UNIT_ID:
				return !getUnitID().isEmpty();
			case DatatypesPackage.AD__UNIT_TYPE:
				return !getUnitType().isEmpty();
			case DatatypesPackage.AD__CARE_OF:
				return !getCareOf().isEmpty();
			case DatatypesPackage.AD__CENSUS_TRACT:
				return !getCensusTract().isEmpty();
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				return !getDeliveryAddressLine().isEmpty();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				return !getDeliveryInstallationType().isEmpty();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				return !getDeliveryInstallationArea().isEmpty();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				return !getDeliveryInstallationQualifier().isEmpty();
			case DatatypesPackage.AD__DELIVERY_MODE:
				return !getDeliveryMode().isEmpty();
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				return !getDeliveryModeIdentifier().isEmpty();
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				return !getBuildingNumberSuffix().isEmpty();
			case DatatypesPackage.AD__POST_BOX:
				return !getPostBox().isEmpty();
			case DatatypesPackage.AD__PRECINCT:
				return !getPrecinct().isEmpty();
			case DatatypesPackage.AD__PART:
				return !getPart().isEmpty();
			case DatatypesPackage.AD__MIXED:
				return mixed != null && !mixed.isEmpty();
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
		result.append(" (use: ");
		result.append(use);
		result.append(", isNotOrdered: ");
		result.append(isNotOrdered);
		result.append(", mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ADImpl
