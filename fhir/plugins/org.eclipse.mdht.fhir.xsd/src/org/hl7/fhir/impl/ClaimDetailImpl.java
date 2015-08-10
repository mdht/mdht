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

import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimDetailImpl#getSubDetail <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimDetailImpl extends BackboneElementImpl implements ClaimDetail {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected Coding udi;

	/**
	 * The cached value of the '{@link #getSubDetail() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimSubDetail> subDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Coding newService, NotificationChain msgs) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(SimpleQuantity newQuantity, NotificationChain msgs) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__UNIT_PRICE, oldUnitPrice, newUnitPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(Decimal newPoints, NotificationChain msgs) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__POINTS, oldPoints, newPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getUdi() {
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUdi(Coding newUdi, NotificationChain msgs) {
		Coding oldUdi = udi;
		udi = newUdi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__UDI, oldUdi, newUdi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdi(Coding newUdi) {
		if (newUdi != udi) {
			NotificationChain msgs = null;
			if (udi != null)
				msgs = ((InternalEObject)udi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__UDI, null, msgs);
			if (newUdi != null)
				msgs = ((InternalEObject)newUdi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_DETAIL__UDI, null, msgs);
			msgs = basicSetUdi(newUdi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_DETAIL__UDI, newUdi, newUdi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimSubDetail> getSubDetail() {
		if (subDetail == null) {
			subDetail = new EObjectContainmentEList<ClaimSubDetail>(ClaimSubDetail.class, this, FhirPackage.CLAIM_DETAIL__SUB_DETAIL);
		}
		return subDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_DETAIL__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.CLAIM_DETAIL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM_DETAIL__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.CLAIM_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CLAIM_DETAIL__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.CLAIM_DETAIL__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.CLAIM_DETAIL__POINTS:
				return basicSetPoints(null, msgs);
			case FhirPackage.CLAIM_DETAIL__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.CLAIM_DETAIL__UDI:
				return basicSetUdi(null, msgs);
			case FhirPackage.CLAIM_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_DETAIL__SEQUENCE:
				return getSequence();
			case FhirPackage.CLAIM_DETAIL__TYPE:
				return getType();
			case FhirPackage.CLAIM_DETAIL__SERVICE:
				return getService();
			case FhirPackage.CLAIM_DETAIL__QUANTITY:
				return getQuantity();
			case FhirPackage.CLAIM_DETAIL__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.CLAIM_DETAIL__FACTOR:
				return getFactor();
			case FhirPackage.CLAIM_DETAIL__POINTS:
				return getPoints();
			case FhirPackage.CLAIM_DETAIL__NET:
				return getNet();
			case FhirPackage.CLAIM_DETAIL__UDI:
				return getUdi();
			case FhirPackage.CLAIM_DETAIL__SUB_DETAIL:
				return getSubDetail();
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
			case FhirPackage.CLAIM_DETAIL__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__UDI:
				setUdi((Coding)newValue);
				return;
			case FhirPackage.CLAIM_DETAIL__SUB_DETAIL:
				getSubDetail().clear();
				getSubDetail().addAll((Collection<? extends ClaimSubDetail>)newValue);
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
			case FhirPackage.CLAIM_DETAIL__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_DETAIL__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.CLAIM_DETAIL__SERVICE:
				setService((Coding)null);
				return;
			case FhirPackage.CLAIM_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.CLAIM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.CLAIM_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.CLAIM_DETAIL__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirPackage.CLAIM_DETAIL__NET:
				setNet((Money)null);
				return;
			case FhirPackage.CLAIM_DETAIL__UDI:
				setUdi((Coding)null);
				return;
			case FhirPackage.CLAIM_DETAIL__SUB_DETAIL:
				getSubDetail().clear();
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
			case FhirPackage.CLAIM_DETAIL__SEQUENCE:
				return sequence != null;
			case FhirPackage.CLAIM_DETAIL__TYPE:
				return type != null;
			case FhirPackage.CLAIM_DETAIL__SERVICE:
				return service != null;
			case FhirPackage.CLAIM_DETAIL__QUANTITY:
				return quantity != null;
			case FhirPackage.CLAIM_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.CLAIM_DETAIL__FACTOR:
				return factor != null;
			case FhirPackage.CLAIM_DETAIL__POINTS:
				return points != null;
			case FhirPackage.CLAIM_DETAIL__NET:
				return net != null;
			case FhirPackage.CLAIM_DETAIL__UDI:
				return udi != null;
			case FhirPackage.CLAIM_DETAIL__SUB_DETAIL:
				return subDetail != null && !subDetail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimDetailImpl
