/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SearchEntryMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BundleSearchImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleSearchImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleSearchImpl extends BackboneElementImpl implements BundleSearch {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected SearchEntryMode mode;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal score;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBundleSearch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(SearchEntryMode newMode, NotificationChain msgs) {
		SearchEntryMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_SEARCH__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(SearchEntryMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_SEARCH__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_SEARCH__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_SEARCH__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Decimal newScore, NotificationChain msgs) {
		Decimal oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_SEARCH__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Decimal newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_SEARCH__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_SEARCH__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_SEARCH__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BUNDLE_SEARCH__MODE:
				return basicSetMode(null, msgs);
			case FhirPackage.BUNDLE_SEARCH__SCORE:
				return basicSetScore(null, msgs);
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
			case FhirPackage.BUNDLE_SEARCH__MODE:
				return getMode();
			case FhirPackage.BUNDLE_SEARCH__SCORE:
				return getScore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.BUNDLE_SEARCH__MODE:
				setMode((SearchEntryMode)newValue);
				return;
			case FhirPackage.BUNDLE_SEARCH__SCORE:
				setScore((Decimal)newValue);
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
			case FhirPackage.BUNDLE_SEARCH__MODE:
				setMode((SearchEntryMode)null);
				return;
			case FhirPackage.BUNDLE_SEARCH__SCORE:
				setScore((Decimal)null);
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
			case FhirPackage.BUNDLE_SEARCH__MODE:
				return mode != null;
			case FhirPackage.BUNDLE_SEARCH__SCORE:
				return score != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleSearchImpl
