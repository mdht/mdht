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
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimProsthesis;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getDiagnosisLinkId <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getServiceDate <em>Service Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getSubSite <em>Sub Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getProsthesis <em>Prosthesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimItemImpl extends BackboneElementImpl implements ClaimItem {
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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getDiagnosisLinkId() <em>Diagnosis Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> diagnosisLinkId;

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
	 * The cached value of the '{@link #getServiceDate() <em>Service Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDate()
	 * @generated
	 * @ordered
	 */
	protected Date serviceDate;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getSubSite() <em>Sub Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subSite;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modifier;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDetail> detail;

	/**
	 * The cached value of the '{@link #getProsthesis() <em>Prosthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProsthesis()
	 * @generated
	 * @ordered
	 */
	protected ClaimProsthesis prosthesis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SEQUENCE, oldSequence, newSequence);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SEQUENCE, newSequence, newSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getDiagnosisLinkId() {
		if (diagnosisLinkId == null) {
			diagnosisLinkId = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_ITEM__DIAGNOSIS_LINK_ID);
		}
		return diagnosisLinkId;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICE, oldService, newService);
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
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getServiceDate() {
		return serviceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDate(Date newServiceDate, NotificationChain msgs) {
		Date oldServiceDate = serviceDate;
		serviceDate = newServiceDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICE_DATE, oldServiceDate, newServiceDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDate(Date newServiceDate) {
		if (newServiceDate != serviceDate) {
			NotificationChain msgs = null;
			if (serviceDate != null)
				msgs = ((InternalEObject)serviceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICE_DATE, null, msgs);
			if (newServiceDate != null)
				msgs = ((InternalEObject)newServiceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICE_DATE, null, msgs);
			msgs = basicSetServiceDate(newServiceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICE_DATE, newServiceDate, newServiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__FACTOR, oldFactor, newFactor);
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
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__FACTOR, newFactor, newFactor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__POINTS, oldPoints, newPoints);
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
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__POINTS, newPoints, newPoints));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__NET, oldNet, newNet);
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
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__NET, newNet, newNet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__UDI, oldUdi, newUdi);
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
				msgs = ((InternalEObject)udi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__UDI, null, msgs);
			if (newUdi != null)
				msgs = ((InternalEObject)newUdi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__UDI, null, msgs);
			msgs = basicSetUdi(newUdi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__UDI, newUdi, newUdi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(Coding newBodySite, NotificationChain msgs) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(Coding newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubSite() {
		if (subSite == null) {
			subSite = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM_ITEM__SUB_SITE);
		}
		return subSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM_ITEM__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<ClaimDetail>(ClaimDetail.class, this, FhirPackage.CLAIM_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProsthesis getProsthesis() {
		return prosthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProsthesis(ClaimProsthesis newProsthesis, NotificationChain msgs) {
		ClaimProsthesis oldProsthesis = prosthesis;
		prosthesis = newProsthesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__PROSTHESIS, oldProsthesis, newProsthesis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProsthesis(ClaimProsthesis newProsthesis) {
		if (newProsthesis != prosthesis) {
			NotificationChain msgs = null;
			if (prosthesis != null)
				msgs = ((InternalEObject)prosthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__PROSTHESIS, null, msgs);
			if (newProsthesis != null)
				msgs = ((InternalEObject)newProsthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__PROSTHESIS, null, msgs);
			msgs = basicSetProsthesis(newProsthesis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__PROSTHESIS, newProsthesis, newProsthesis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.CLAIM_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM_ITEM__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_LINK_ID:
				return ((InternalEList<?>)getDiagnosisLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.CLAIM_ITEM__SERVICE_DATE:
				return basicSetServiceDate(null, msgs);
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.CLAIM_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.CLAIM_ITEM__POINTS:
				return basicSetPoints(null, msgs);
			case FhirPackage.CLAIM_ITEM__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.CLAIM_ITEM__UDI:
				return basicSetUdi(null, msgs);
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				return ((InternalEList<?>)getSubSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__PROSTHESIS:
				return basicSetProsthesis(null, msgs);
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				return getSequence();
			case FhirPackage.CLAIM_ITEM__TYPE:
				return getType();
			case FhirPackage.CLAIM_ITEM__PROVIDER:
				return getProvider();
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_LINK_ID:
				return getDiagnosisLinkId();
			case FhirPackage.CLAIM_ITEM__SERVICE:
				return getService();
			case FhirPackage.CLAIM_ITEM__SERVICE_DATE:
				return getServiceDate();
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.CLAIM_ITEM__FACTOR:
				return getFactor();
			case FhirPackage.CLAIM_ITEM__POINTS:
				return getPoints();
			case FhirPackage.CLAIM_ITEM__NET:
				return getNet();
			case FhirPackage.CLAIM_ITEM__UDI:
				return getUdi();
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				return getBodySite();
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				return getSubSite();
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.CLAIM_ITEM__DETAIL:
				return getDetail();
			case FhirPackage.CLAIM_ITEM__PROSTHESIS:
				return getProsthesis();
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_LINK_ID:
				getDiagnosisLinkId().clear();
				getDiagnosisLinkId().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__SERVICE_DATE:
				setServiceDate((Date)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__UDI:
				setUdi((Coding)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				getSubSite().clear();
				getSubSite().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends ClaimDetail>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__PROSTHESIS:
				setProsthesis((ClaimProsthesis)newValue);
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_ITEM__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.CLAIM_ITEM__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_LINK_ID:
				getDiagnosisLinkId().clear();
				return;
			case FhirPackage.CLAIM_ITEM__SERVICE:
				setService((Coding)null);
				return;
			case FhirPackage.CLAIM_ITEM__SERVICE_DATE:
				setServiceDate((Date)null);
				return;
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.CLAIM_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.CLAIM_ITEM__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirPackage.CLAIM_ITEM__NET:
				setNet((Money)null);
				return;
			case FhirPackage.CLAIM_ITEM__UDI:
				setUdi((Coding)null);
				return;
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				getSubSite().clear();
				return;
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.CLAIM_ITEM__DETAIL:
				getDetail().clear();
				return;
			case FhirPackage.CLAIM_ITEM__PROSTHESIS:
				setProsthesis((ClaimProsthesis)null);
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				return sequence != null;
			case FhirPackage.CLAIM_ITEM__TYPE:
				return type != null;
			case FhirPackage.CLAIM_ITEM__PROVIDER:
				return provider != null;
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_LINK_ID:
				return diagnosisLinkId != null && !diagnosisLinkId.isEmpty();
			case FhirPackage.CLAIM_ITEM__SERVICE:
				return service != null;
			case FhirPackage.CLAIM_ITEM__SERVICE_DATE:
				return serviceDate != null;
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.CLAIM_ITEM__FACTOR:
				return factor != null;
			case FhirPackage.CLAIM_ITEM__POINTS:
				return points != null;
			case FhirPackage.CLAIM_ITEM__NET:
				return net != null;
			case FhirPackage.CLAIM_ITEM__UDI:
				return udi != null;
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				return bodySite != null;
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				return subSite != null && !subSite.isEmpty();
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.CLAIM_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
			case FhirPackage.CLAIM_ITEM__PROSTHESIS:
				return prosthesis != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimItemImpl
