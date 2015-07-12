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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Media;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getView <em>View</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MediaImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaImpl extends DomainResourceImpl implements Media {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DigitalMediaType type;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subtype;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Reference operator;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept view;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String deviceName;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt height;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt width;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frames;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt duration;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Attachment content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedia();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DigitalMediaType newType, NotificationChain msgs) {
		DigitalMediaType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DigitalMediaType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtype(CodeableConcept newSubtype, NotificationChain msgs) {
		CodeableConcept oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__SUBTYPE, oldSubtype, newSubtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(CodeableConcept newSubtype) {
		if (newSubtype != subtype) {
			NotificationChain msgs = null;
			if (subtype != null)
				msgs = ((InternalEObject)subtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__SUBTYPE, null, msgs);
			if (newSubtype != null)
				msgs = ((InternalEObject)newSubtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__SUBTYPE, null, msgs);
			msgs = basicSetSubtype(newSubtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__SUBTYPE, newSubtype, newSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDIA__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Reference newOperator, NotificationChain msgs) {
		Reference oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Reference newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(CodeableConcept newView, NotificationChain msgs) {
		CodeableConcept oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__VIEW, oldView, newView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(CodeableConcept newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__VIEW, newView, newView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceName(org.hl7.fhir.String newDeviceName, NotificationChain msgs) {
		org.hl7.fhir.String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__DEVICE_NAME, oldDeviceName, newDeviceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(org.hl7.fhir.String newDeviceName) {
		if (newDeviceName != deviceName) {
			NotificationChain msgs = null;
			if (deviceName != null)
				msgs = ((InternalEObject)deviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__DEVICE_NAME, null, msgs);
			if (newDeviceName != null)
				msgs = ((InternalEObject)newDeviceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__DEVICE_NAME, null, msgs);
			msgs = basicSetDeviceName(newDeviceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__DEVICE_NAME, newDeviceName, newDeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(PositiveInt newHeight, NotificationChain msgs) {
		PositiveInt oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__HEIGHT, oldHeight, newHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(PositiveInt newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(PositiveInt newWidth, NotificationChain msgs) {
		PositiveInt oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(PositiveInt newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrames(PositiveInt newFrames, NotificationChain msgs) {
		PositiveInt oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__FRAMES, oldFrames, newFrames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrames(PositiveInt newFrames) {
		if (newFrames != frames) {
			NotificationChain msgs = null;
			if (frames != null)
				msgs = ((InternalEObject)frames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__FRAMES, null, msgs);
			if (newFrames != null)
				msgs = ((InternalEObject)newFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__FRAMES, null, msgs);
			msgs = basicSetFrames(newFrames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__FRAMES, newFrames, newFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(UnsignedInt newDuration, NotificationChain msgs) {
		UnsignedInt oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(UnsignedInt newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Attachment newContent, NotificationChain msgs) {
		Attachment oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Attachment newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDIA__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDIA__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDIA__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDIA__SUBTYPE:
				return basicSetSubtype(null, msgs);
			case FhirPackage.MEDIA__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDIA__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEDIA__OPERATOR:
				return basicSetOperator(null, msgs);
			case FhirPackage.MEDIA__VIEW:
				return basicSetView(null, msgs);
			case FhirPackage.MEDIA__DEVICE_NAME:
				return basicSetDeviceName(null, msgs);
			case FhirPackage.MEDIA__HEIGHT:
				return basicSetHeight(null, msgs);
			case FhirPackage.MEDIA__WIDTH:
				return basicSetWidth(null, msgs);
			case FhirPackage.MEDIA__FRAMES:
				return basicSetFrames(null, msgs);
			case FhirPackage.MEDIA__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.MEDIA__CONTENT:
				return basicSetContent(null, msgs);
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
			case FhirPackage.MEDIA__TYPE:
				return getType();
			case FhirPackage.MEDIA__SUBTYPE:
				return getSubtype();
			case FhirPackage.MEDIA__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDIA__SUBJECT:
				return getSubject();
			case FhirPackage.MEDIA__OPERATOR:
				return getOperator();
			case FhirPackage.MEDIA__VIEW:
				return getView();
			case FhirPackage.MEDIA__DEVICE_NAME:
				return getDeviceName();
			case FhirPackage.MEDIA__HEIGHT:
				return getHeight();
			case FhirPackage.MEDIA__WIDTH:
				return getWidth();
			case FhirPackage.MEDIA__FRAMES:
				return getFrames();
			case FhirPackage.MEDIA__DURATION:
				return getDuration();
			case FhirPackage.MEDIA__CONTENT:
				return getContent();
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
			case FhirPackage.MEDIA__TYPE:
				setType((DigitalMediaType)newValue);
				return;
			case FhirPackage.MEDIA__SUBTYPE:
				setSubtype((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDIA__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDIA__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEDIA__OPERATOR:
				setOperator((Reference)newValue);
				return;
			case FhirPackage.MEDIA__VIEW:
				setView((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDIA__DEVICE_NAME:
				setDeviceName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDIA__HEIGHT:
				setHeight((PositiveInt)newValue);
				return;
			case FhirPackage.MEDIA__WIDTH:
				setWidth((PositiveInt)newValue);
				return;
			case FhirPackage.MEDIA__FRAMES:
				setFrames((PositiveInt)newValue);
				return;
			case FhirPackage.MEDIA__DURATION:
				setDuration((UnsignedInt)newValue);
				return;
			case FhirPackage.MEDIA__CONTENT:
				setContent((Attachment)newValue);
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
			case FhirPackage.MEDIA__TYPE:
				setType((DigitalMediaType)null);
				return;
			case FhirPackage.MEDIA__SUBTYPE:
				setSubtype((CodeableConcept)null);
				return;
			case FhirPackage.MEDIA__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDIA__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEDIA__OPERATOR:
				setOperator((Reference)null);
				return;
			case FhirPackage.MEDIA__VIEW:
				setView((CodeableConcept)null);
				return;
			case FhirPackage.MEDIA__DEVICE_NAME:
				setDeviceName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDIA__HEIGHT:
				setHeight((PositiveInt)null);
				return;
			case FhirPackage.MEDIA__WIDTH:
				setWidth((PositiveInt)null);
				return;
			case FhirPackage.MEDIA__FRAMES:
				setFrames((PositiveInt)null);
				return;
			case FhirPackage.MEDIA__DURATION:
				setDuration((UnsignedInt)null);
				return;
			case FhirPackage.MEDIA__CONTENT:
				setContent((Attachment)null);
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
			case FhirPackage.MEDIA__TYPE:
				return type != null;
			case FhirPackage.MEDIA__SUBTYPE:
				return subtype != null;
			case FhirPackage.MEDIA__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDIA__SUBJECT:
				return subject != null;
			case FhirPackage.MEDIA__OPERATOR:
				return operator != null;
			case FhirPackage.MEDIA__VIEW:
				return view != null;
			case FhirPackage.MEDIA__DEVICE_NAME:
				return deviceName != null;
			case FhirPackage.MEDIA__HEIGHT:
				return height != null;
			case FhirPackage.MEDIA__WIDTH:
				return width != null;
			case FhirPackage.MEDIA__FRAMES:
				return frames != null;
			case FhirPackage.MEDIA__DURATION:
				return duration != null;
			case FhirPackage.MEDIA__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

} //MediaImpl
