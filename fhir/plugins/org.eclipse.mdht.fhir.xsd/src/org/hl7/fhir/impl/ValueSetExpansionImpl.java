/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetExpansionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetExpansionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetExpansionImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetExpansionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetExpansionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetExpansionImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetExpansionImpl extends BackboneElementImpl implements ValueSetExpansion {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Uri identifier;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected DateTime timestamp;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer total;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer offset;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetParameter> parameter;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetContains> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetExpansionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetExpansion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Uri newIdentifier, NotificationChain msgs) {
		Uri oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Uri newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(DateTime newTimestamp, NotificationChain msgs) {
		DateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP, oldTimestamp, newTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(DateTime newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(org.hl7.fhir.Integer newTotal, NotificationChain msgs) {
		org.hl7.fhir.Integer oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__TOTAL, oldTotal, newTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(org.hl7.fhir.Integer newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject)total).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject)newTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__TOTAL, newTotal, newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(org.hl7.fhir.Integer newOffset, NotificationChain msgs) {
		org.hl7.fhir.Integer oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(org.hl7.fhir.Integer newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_EXPANSION__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_EXPANSION__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ValueSetParameter>(ValueSetParameter.class, this, FhirPackage.VALUE_SET_EXPANSION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetContains> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ValueSetContains>(ValueSetContains.class, this, FhirPackage.VALUE_SET_EXPANSION__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case FhirPackage.VALUE_SET_EXPANSION__TOTAL:
				return basicSetTotal(null, msgs);
			case FhirPackage.VALUE_SET_EXPANSION__OFFSET:
				return basicSetOffset(null, msgs);
			case FhirPackage.VALUE_SET_EXPANSION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET_EXPANSION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return getTimestamp();
			case FhirPackage.VALUE_SET_EXPANSION__TOTAL:
				return getTotal();
			case FhirPackage.VALUE_SET_EXPANSION__OFFSET:
				return getOffset();
			case FhirPackage.VALUE_SET_EXPANSION__PARAMETER:
				return getParameter();
			case FhirPackage.VALUE_SET_EXPANSION__CONTAINS:
				return getContains();
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
			case FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				setIdentifier((Uri)newValue);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				setTimestamp((DateTime)newValue);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__TOTAL:
				setTotal((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__OFFSET:
				setOffset((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ValueSetParameter>)newValue);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ValueSetContains>)newValue);
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
			case FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				setIdentifier((Uri)null);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				setTimestamp((DateTime)null);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__TOTAL:
				setTotal((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__OFFSET:
				setOffset((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.VALUE_SET_EXPANSION__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.VALUE_SET_EXPANSION__CONTAINS:
				getContains().clear();
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
			case FhirPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return timestamp != null;
			case FhirPackage.VALUE_SET_EXPANSION__TOTAL:
				return total != null;
			case FhirPackage.VALUE_SET_EXPANSION__OFFSET:
				return offset != null;
			case FhirPackage.VALUE_SET_EXPANSION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.VALUE_SET_EXPANSION__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetExpansionImpl
