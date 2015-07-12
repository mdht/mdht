/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClaimMissingTeeth;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Missing Teeth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimMissingTeethImpl#getTooth <em>Tooth</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimMissingTeethImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimMissingTeethImpl#getExtractionDate <em>Extraction Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimMissingTeethImpl extends BackboneElementImpl implements ClaimMissingTeeth {
	/**
	 * The cached value of the '{@link #getTooth() <em>Tooth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooth()
	 * @generated
	 * @ordered
	 */
	protected Coding tooth;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected Coding reason;

	/**
	 * The cached value of the '{@link #getExtractionDate() <em>Extraction Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractionDate()
	 * @generated
	 * @ordered
	 */
	protected Date extractionDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimMissingTeethImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimMissingTeeth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getTooth() {
		return tooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTooth(Coding newTooth, NotificationChain msgs) {
		Coding oldTooth = tooth;
		tooth = newTooth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_MISSING_TEETH__TOOTH, oldTooth, newTooth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooth(Coding newTooth) {
		if (newTooth != tooth) {
			NotificationChain msgs = null;
			if (tooth != null)
				msgs = ((InternalEObject)tooth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_MISSING_TEETH__TOOTH, null, msgs);
			if (newTooth != null)
				msgs = ((InternalEObject)newTooth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_MISSING_TEETH__TOOTH, null, msgs);
			msgs = basicSetTooth(newTooth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_MISSING_TEETH__TOOTH, newTooth, newTooth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(Coding newReason, NotificationChain msgs) {
		Coding oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_MISSING_TEETH__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(Coding newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_MISSING_TEETH__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_MISSING_TEETH__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_MISSING_TEETH__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExtractionDate() {
		return extractionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractionDate(Date newExtractionDate, NotificationChain msgs) {
		Date oldExtractionDate = extractionDate;
		extractionDate = newExtractionDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE, oldExtractionDate, newExtractionDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractionDate(Date newExtractionDate) {
		if (newExtractionDate != extractionDate) {
			NotificationChain msgs = null;
			if (extractionDate != null)
				msgs = ((InternalEObject)extractionDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE, null, msgs);
			if (newExtractionDate != null)
				msgs = ((InternalEObject)newExtractionDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE, null, msgs);
			msgs = basicSetExtractionDate(newExtractionDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE, newExtractionDate, newExtractionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_MISSING_TEETH__TOOTH:
				return basicSetTooth(null, msgs);
			case FhirPackage.CLAIM_MISSING_TEETH__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE:
				return basicSetExtractionDate(null, msgs);
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
			case FhirPackage.CLAIM_MISSING_TEETH__TOOTH:
				return getTooth();
			case FhirPackage.CLAIM_MISSING_TEETH__REASON:
				return getReason();
			case FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE:
				return getExtractionDate();
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
			case FhirPackage.CLAIM_MISSING_TEETH__TOOTH:
				setTooth((Coding)newValue);
				return;
			case FhirPackage.CLAIM_MISSING_TEETH__REASON:
				setReason((Coding)newValue);
				return;
			case FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE:
				setExtractionDate((Date)newValue);
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
			case FhirPackage.CLAIM_MISSING_TEETH__TOOTH:
				setTooth((Coding)null);
				return;
			case FhirPackage.CLAIM_MISSING_TEETH__REASON:
				setReason((Coding)null);
				return;
			case FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE:
				setExtractionDate((Date)null);
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
			case FhirPackage.CLAIM_MISSING_TEETH__TOOTH:
				return tooth != null;
			case FhirPackage.CLAIM_MISSING_TEETH__REASON:
				return reason != null;
			case FhirPackage.CLAIM_MISSING_TEETH__EXTRACTION_DATE:
				return extractionDate != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimMissingTeethImpl
