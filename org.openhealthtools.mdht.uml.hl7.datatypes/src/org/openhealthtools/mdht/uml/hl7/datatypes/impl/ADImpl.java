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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.ADOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDelimiters <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCountries <em>Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStates <em>State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCounties <em>County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCities <em>City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPostalCodes <em>Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetAddressLines <em>Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getHouseNumbers <em>House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getHouseNumberNumerics <em>House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDirections <em>Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetNames <em>Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetNameBases <em>Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getStreetNameTypes <em>Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getAdditionalLocators <em>Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUnitIDs <em>Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUnitTypes <em>Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCareOfs <em>Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getCensusTracts <em>Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryAddressLines <em>Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryInstallationTypes <em>Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryInstallationAreas <em>Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryInstallationQualifiers <em>Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryModes <em>Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getDeliveryModeIdentifiers <em>Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getBuildingNumberSuffixes <em>Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPostBoxes <em>Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getPrecincts <em>Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUseablePeriods <em>Useable Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getUses <em>Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getIsNotOrdered <em>Is Not Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl#getMixed <em>Mixed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADImpl extends ANYImpl implements AD {
	/**
	 * The cached value of the '{@link #getUses() <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<PostalAddressUse> uses;

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
	public EList<SXCM_TS> getUseablePeriods() {
		return getMixed().list(DatatypesPackage.Literals.AD__USEABLE_PERIOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostalAddressUse> getUses() {
		if (uses == null) {
			uses = new EDataTypeUniqueEList.Unsettable<PostalAddressUse>(
				PostalAddressUse.class, this, DatatypesPackage.AD__USE);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUses() {
		if (uses != null) {
			((InternalEList.Unsettable<?>) uses).unset();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUses() {
		return uses != null && ((InternalEList.Unsettable<?>) uses).isSet();
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.AD__IS_NOT_ORDERED, oldIsNotOrdered, isNotOrdered));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDelimiters() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIMITER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCountries() {
		return getParts().list(DatatypesPackage.Literals.AD__COUNTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStates() {
		return getParts().list(DatatypesPackage.Literals.AD__STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCounties() {
		return getParts().list(DatatypesPackage.Literals.AD__COUNTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCities() {
		return getParts().list(DatatypesPackage.Literals.AD__CITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getPostalCodes() {
		return getParts().list(DatatypesPackage.Literals.AD__POSTAL_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetAddressLines() {
		return getParts().list(DatatypesPackage.Literals.AD__STREET_ADDRESS_LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getHouseNumbers() {
		return getParts().list(DatatypesPackage.Literals.AD__HOUSE_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getHouseNumberNumerics() {
		return getParts().list(DatatypesPackage.Literals.AD__HOUSE_NUMBER_NUMERIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDirections() {
		return getParts().list(DatatypesPackage.Literals.AD__DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetNames() {
		return getParts().list(DatatypesPackage.Literals.AD__STREET_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetNameBases() {
		return getParts().list(DatatypesPackage.Literals.AD__STREET_NAME_BASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getStreetNameTypes() {
		return getParts().list(DatatypesPackage.Literals.AD__STREET_NAME_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getAdditionalLocators() {
		return getParts().list(DatatypesPackage.Literals.AD__ADDITIONAL_LOCATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getUnitIDs() {
		return getParts().list(DatatypesPackage.Literals.AD__UNIT_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getUnitTypes() {
		return getParts().list(DatatypesPackage.Literals.AD__UNIT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCareOfs() {
		return getParts().list(DatatypesPackage.Literals.AD__CARE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getCensusTracts() {
		return getParts().list(DatatypesPackage.Literals.AD__CENSUS_TRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryAddressLines() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIVERY_ADDRESS_LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryInstallationTypes() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIVERY_INSTALLATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryInstallationAreas() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIVERY_INSTALLATION_AREA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryInstallationQualifiers() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIVERY_INSTALLATION_QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryModes() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIVERY_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getDeliveryModeIdentifiers() {
		return getParts().list(DatatypesPackage.Literals.AD__DELIVERY_MODE_IDENTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getBuildingNumberSuffixes() {
		return getParts().list(DatatypesPackage.Literals.AD__BUILDING_NUMBER_SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getPostBoxes() {
		return getParts().list(DatatypesPackage.Literals.AD__POST_BOX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADXP> getPrecincts() {
		return getParts().list(DatatypesPackage.Literals.AD__PRECINCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getParts() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(DatatypesPackage.Literals.AD__PART);
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
	public boolean validateDelimiter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDelimiter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateCountry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateState(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateCounty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateCity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validatePostalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreetAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateStreetAddressLine(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouseNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateHouseNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouseNumberNumeric(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateHouseNumberNumeric(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDirection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreetName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateStreetName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreetNameBase(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateStreetNameBase(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreetNameType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateStreetNameType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalLocator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateAdditionalLocator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateUnitID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateUnitType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateCareOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCensusTract(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateCensusTract(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryAddressLine(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDeliveryAddressLine(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryInstallationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDeliveryInstallationType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryInstallationArea(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDeliveryInstallationArea(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryInstallationQualifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDeliveryInstallationQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryMode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDeliveryMode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryModeIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateDeliveryModeIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildingNumberSuffix(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validateBuildingNumberSuffix(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostBox(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validatePostBox(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecinct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ADOperations.validatePrecinct(this, diagnostics, context);
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
			case DatatypesPackage.AD__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
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
			case DatatypesPackage.AD__DELIMITER:
				return getDelimiters();
			case DatatypesPackage.AD__COUNTRY:
				return getCountries();
			case DatatypesPackage.AD__STATE:
				return getStates();
			case DatatypesPackage.AD__COUNTY:
				return getCounties();
			case DatatypesPackage.AD__CITY:
				return getCities();
			case DatatypesPackage.AD__POSTAL_CODE:
				return getPostalCodes();
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				return getStreetAddressLines();
			case DatatypesPackage.AD__HOUSE_NUMBER:
				return getHouseNumbers();
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				return getHouseNumberNumerics();
			case DatatypesPackage.AD__DIRECTION:
				return getDirections();
			case DatatypesPackage.AD__STREET_NAME:
				return getStreetNames();
			case DatatypesPackage.AD__STREET_NAME_BASE:
				return getStreetNameBases();
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				return getStreetNameTypes();
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				return getAdditionalLocators();
			case DatatypesPackage.AD__UNIT_ID:
				return getUnitIDs();
			case DatatypesPackage.AD__UNIT_TYPE:
				return getUnitTypes();
			case DatatypesPackage.AD__CARE_OF:
				return getCareOfs();
			case DatatypesPackage.AD__CENSUS_TRACT:
				return getCensusTracts();
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				return getDeliveryAddressLines();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				return getDeliveryInstallationTypes();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				return getDeliveryInstallationAreas();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				return getDeliveryInstallationQualifiers();
			case DatatypesPackage.AD__DELIVERY_MODE:
				return getDeliveryModes();
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				return getDeliveryModeIdentifiers();
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				return getBuildingNumberSuffixes();
			case DatatypesPackage.AD__POST_BOX:
				return getPostBoxes();
			case DatatypesPackage.AD__PRECINCT:
				return getPrecincts();
			case DatatypesPackage.AD__PART:
				if (coreType) {
					return getParts();
				}
				return ((FeatureMap.Internal) getParts()).getWrapper();
			case DatatypesPackage.AD__USEABLE_PERIOD:
				return getUseablePeriods();
			case DatatypesPackage.AD__USE:
				return getUses();
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				return getIsNotOrdered();
			case DatatypesPackage.AD__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
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
			case DatatypesPackage.AD__DELIMITER:
				getDelimiters().clear();
				getDelimiters().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__COUNTRY:
				getCountries().clear();
				getCountries().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__STATE:
				getStates().clear();
				getStates().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__COUNTY:
				getCounties().clear();
				getCounties().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__CITY:
				getCities().clear();
				getCities().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__POSTAL_CODE:
				getPostalCodes().clear();
				getPostalCodes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				getStreetAddressLines().clear();
				getStreetAddressLines().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER:
				getHouseNumbers().clear();
				getHouseNumbers().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				getHouseNumberNumerics().clear();
				getHouseNumberNumerics().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DIRECTION:
				getDirections().clear();
				getDirections().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__STREET_NAME:
				getStreetNames().clear();
				getStreetNames().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__STREET_NAME_BASE:
				getStreetNameBases().clear();
				getStreetNameBases().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				getStreetNameTypes().clear();
				getStreetNameTypes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				getAdditionalLocators().clear();
				getAdditionalLocators().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__UNIT_ID:
				getUnitIDs().clear();
				getUnitIDs().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__UNIT_TYPE:
				getUnitTypes().clear();
				getUnitTypes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__CARE_OF:
				getCareOfs().clear();
				getCareOfs().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__CENSUS_TRACT:
				getCensusTracts().clear();
				getCensusTracts().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				getDeliveryAddressLines().clear();
				getDeliveryAddressLines().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				getDeliveryInstallationTypes().clear();
				getDeliveryInstallationTypes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				getDeliveryInstallationAreas().clear();
				getDeliveryInstallationAreas().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				getDeliveryInstallationQualifiers().clear();
				getDeliveryInstallationQualifiers().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_MODE:
				getDeliveryModes().clear();
				getDeliveryModes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				getDeliveryModeIdentifiers().clear();
				getDeliveryModeIdentifiers().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				getBuildingNumberSuffixes().clear();
				getBuildingNumberSuffixes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__POST_BOX:
				getPostBoxes().clear();
				getPostBoxes().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__PRECINCT:
				getPrecincts().clear();
				getPrecincts().addAll((Collection<? extends ADXP>) newValue);
				return;
			case DatatypesPackage.AD__PART:
				((FeatureMap.Internal) getParts()).set(newValue);
				return;
			case DatatypesPackage.AD__USEABLE_PERIOD:
				getUseablePeriods().clear();
				getUseablePeriods().addAll((Collection<? extends SXCM_TS>) newValue);
				return;
			case DatatypesPackage.AD__USE:
				getUses().clear();
				getUses().addAll((Collection<? extends PostalAddressUse>) newValue);
				return;
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				setIsNotOrdered((Boolean) newValue);
				return;
			case DatatypesPackage.AD__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
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
			case DatatypesPackage.AD__DELIMITER:
				getDelimiters().clear();
				return;
			case DatatypesPackage.AD__COUNTRY:
				getCountries().clear();
				return;
			case DatatypesPackage.AD__STATE:
				getStates().clear();
				return;
			case DatatypesPackage.AD__COUNTY:
				getCounties().clear();
				return;
			case DatatypesPackage.AD__CITY:
				getCities().clear();
				return;
			case DatatypesPackage.AD__POSTAL_CODE:
				getPostalCodes().clear();
				return;
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				getStreetAddressLines().clear();
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER:
				getHouseNumbers().clear();
				return;
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				getHouseNumberNumerics().clear();
				return;
			case DatatypesPackage.AD__DIRECTION:
				getDirections().clear();
				return;
			case DatatypesPackage.AD__STREET_NAME:
				getStreetNames().clear();
				return;
			case DatatypesPackage.AD__STREET_NAME_BASE:
				getStreetNameBases().clear();
				return;
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				getStreetNameTypes().clear();
				return;
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				getAdditionalLocators().clear();
				return;
			case DatatypesPackage.AD__UNIT_ID:
				getUnitIDs().clear();
				return;
			case DatatypesPackage.AD__UNIT_TYPE:
				getUnitTypes().clear();
				return;
			case DatatypesPackage.AD__CARE_OF:
				getCareOfs().clear();
				return;
			case DatatypesPackage.AD__CENSUS_TRACT:
				getCensusTracts().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				getDeliveryAddressLines().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				getDeliveryInstallationTypes().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				getDeliveryInstallationAreas().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				getDeliveryInstallationQualifiers().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_MODE:
				getDeliveryModes().clear();
				return;
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				getDeliveryModeIdentifiers().clear();
				return;
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				getBuildingNumberSuffixes().clear();
				return;
			case DatatypesPackage.AD__POST_BOX:
				getPostBoxes().clear();
				return;
			case DatatypesPackage.AD__PRECINCT:
				getPrecincts().clear();
				return;
			case DatatypesPackage.AD__PART:
				getParts().clear();
				return;
			case DatatypesPackage.AD__USEABLE_PERIOD:
				getUseablePeriods().clear();
				return;
			case DatatypesPackage.AD__USE:
				unsetUses();
				return;
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				setIsNotOrdered(IS_NOT_ORDERED_EDEFAULT);
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
			case DatatypesPackage.AD__DELIMITER:
				return !getDelimiters().isEmpty();
			case DatatypesPackage.AD__COUNTRY:
				return !getCountries().isEmpty();
			case DatatypesPackage.AD__STATE:
				return !getStates().isEmpty();
			case DatatypesPackage.AD__COUNTY:
				return !getCounties().isEmpty();
			case DatatypesPackage.AD__CITY:
				return !getCities().isEmpty();
			case DatatypesPackage.AD__POSTAL_CODE:
				return !getPostalCodes().isEmpty();
			case DatatypesPackage.AD__STREET_ADDRESS_LINE:
				return !getStreetAddressLines().isEmpty();
			case DatatypesPackage.AD__HOUSE_NUMBER:
				return !getHouseNumbers().isEmpty();
			case DatatypesPackage.AD__HOUSE_NUMBER_NUMERIC:
				return !getHouseNumberNumerics().isEmpty();
			case DatatypesPackage.AD__DIRECTION:
				return !getDirections().isEmpty();
			case DatatypesPackage.AD__STREET_NAME:
				return !getStreetNames().isEmpty();
			case DatatypesPackage.AD__STREET_NAME_BASE:
				return !getStreetNameBases().isEmpty();
			case DatatypesPackage.AD__STREET_NAME_TYPE:
				return !getStreetNameTypes().isEmpty();
			case DatatypesPackage.AD__ADDITIONAL_LOCATOR:
				return !getAdditionalLocators().isEmpty();
			case DatatypesPackage.AD__UNIT_ID:
				return !getUnitIDs().isEmpty();
			case DatatypesPackage.AD__UNIT_TYPE:
				return !getUnitTypes().isEmpty();
			case DatatypesPackage.AD__CARE_OF:
				return !getCareOfs().isEmpty();
			case DatatypesPackage.AD__CENSUS_TRACT:
				return !getCensusTracts().isEmpty();
			case DatatypesPackage.AD__DELIVERY_ADDRESS_LINE:
				return !getDeliveryAddressLines().isEmpty();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_TYPE:
				return !getDeliveryInstallationTypes().isEmpty();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_AREA:
				return !getDeliveryInstallationAreas().isEmpty();
			case DatatypesPackage.AD__DELIVERY_INSTALLATION_QUALIFIER:
				return !getDeliveryInstallationQualifiers().isEmpty();
			case DatatypesPackage.AD__DELIVERY_MODE:
				return !getDeliveryModes().isEmpty();
			case DatatypesPackage.AD__DELIVERY_MODE_IDENTIFIER:
				return !getDeliveryModeIdentifiers().isEmpty();
			case DatatypesPackage.AD__BUILDING_NUMBER_SUFFIX:
				return !getBuildingNumberSuffixes().isEmpty();
			case DatatypesPackage.AD__POST_BOX:
				return !getPostBoxes().isEmpty();
			case DatatypesPackage.AD__PRECINCT:
				return !getPrecincts().isEmpty();
			case DatatypesPackage.AD__PART:
				return !getParts().isEmpty();
			case DatatypesPackage.AD__USEABLE_PERIOD:
				return !getUseablePeriods().isEmpty();
			case DatatypesPackage.AD__USE:
				return isSetUses();
			case DatatypesPackage.AD__IS_NOT_ORDERED:
				return IS_NOT_ORDERED_EDEFAULT == null
						? isNotOrdered != null
						: !IS_NOT_ORDERED_EDEFAULT.equals(isNotOrdered);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (use: ");
		result.append(uses);
		result.append(", isNotOrdered: ");
		result.append(isNotOrdered);
		result.append(", mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // ADImpl
