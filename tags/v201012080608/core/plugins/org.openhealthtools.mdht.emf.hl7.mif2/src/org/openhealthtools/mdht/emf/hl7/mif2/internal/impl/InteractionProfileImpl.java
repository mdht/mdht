/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getImplementationConstraints <em>Implementation Constraints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getArgumentMessage <em>Argument Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getEffectiveStaticModel <em>Effective Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getReceiverResponsibilities <em>Receiver Responsibilities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getInternalMapping <em>Internal Mapping</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionProfileImpl#getProfileType <em>Profile Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionProfileImpl extends PackageImpl implements InteractionProfile {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected InteractionProfileAnnotations annotations;

	/**
	 * The cached value of the '{@link #getImplementationConstraints() <em>Implementation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationConstraints()
	 * @generated
	 * @ordered
	 */
	protected ImplementationMessageConstraints implementationConstraints;

	/**
	 * The cached value of the '{@link #getArgumentMessage() <em>Argument Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentMessage()
	 * @generated
	 * @ordered
	 */
	protected BoundStaticModel argumentMessage;

	/**
	 * The cached value of the '{@link #getEffectiveStaticModel() <em>Effective Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveStaticModel()
	 * @generated
	 * @ordered
	 */
	protected SerializedStaticModel effectiveStaticModel;

	/**
	 * The cached value of the '{@link #getReceiverResponsibilities() <em>Receiver Responsibilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiverResponsibility> receiverResponsibilities;

	/**
	 * The cached value of the '{@link #getInternalMapping() <em>Internal Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMapping()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage internalMapping;

	/**
	 * The default value of the '{@link #getProfileType() <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileType()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionProfileKind PROFILE_TYPE_EDEFAULT = InteractionProfileKind.R;

	/**
	 * The cached value of the '{@link #getProfileType() <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileType()
	 * @generated
	 * @ordered
	 */
	protected InteractionProfileKind profileType = PROFILE_TYPE_EDEFAULT;

	/**
	 * This is true if the Profile Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.INTERACTION_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfileAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(InteractionProfileAnnotations newAnnotations, NotificationChain msgs) {
		InteractionProfileAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(InteractionProfileAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationMessageConstraints getImplementationConstraints() {
		return implementationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationConstraints(ImplementationMessageConstraints newImplementationConstraints, NotificationChain msgs) {
		ImplementationMessageConstraints oldImplementationConstraints = implementationConstraints;
		implementationConstraints = newImplementationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS, oldImplementationConstraints, newImplementationConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationConstraints(ImplementationMessageConstraints newImplementationConstraints) {
		if (newImplementationConstraints != implementationConstraints) {
			NotificationChain msgs = null;
			if (implementationConstraints != null)
				msgs = ((InternalEObject)implementationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS, null, msgs);
			if (newImplementationConstraints != null)
				msgs = ((InternalEObject)newImplementationConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS, null, msgs);
			msgs = basicSetImplementationConstraints(newImplementationConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS, newImplementationConstraints, newImplementationConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundStaticModel getArgumentMessage() {
		return argumentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentMessage(BoundStaticModel newArgumentMessage, NotificationChain msgs) {
		BoundStaticModel oldArgumentMessage = argumentMessage;
		argumentMessage = newArgumentMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE, oldArgumentMessage, newArgumentMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentMessage(BoundStaticModel newArgumentMessage) {
		if (newArgumentMessage != argumentMessage) {
			NotificationChain msgs = null;
			if (argumentMessage != null)
				msgs = ((InternalEObject)argumentMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE, null, msgs);
			if (newArgumentMessage != null)
				msgs = ((InternalEObject)newArgumentMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE, null, msgs);
			msgs = basicSetArgumentMessage(newArgumentMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE, newArgumentMessage, newArgumentMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedStaticModel getEffectiveStaticModel() {
		return effectiveStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveStaticModel(SerializedStaticModel newEffectiveStaticModel, NotificationChain msgs) {
		SerializedStaticModel oldEffectiveStaticModel = effectiveStaticModel;
		effectiveStaticModel = newEffectiveStaticModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL, oldEffectiveStaticModel, newEffectiveStaticModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveStaticModel(SerializedStaticModel newEffectiveStaticModel) {
		if (newEffectiveStaticModel != effectiveStaticModel) {
			NotificationChain msgs = null;
			if (effectiveStaticModel != null)
				msgs = ((InternalEObject)effectiveStaticModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL, null, msgs);
			if (newEffectiveStaticModel != null)
				msgs = ((InternalEObject)newEffectiveStaticModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL, null, msgs);
			msgs = basicSetEffectiveStaticModel(newEffectiveStaticModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL, newEffectiveStaticModel, newEffectiveStaticModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceiverResponsibility> getReceiverResponsibilities() {
		if (receiverResponsibilities == null) {
			receiverResponsibilities = new EObjectContainmentEList<ReceiverResponsibility>(ReceiverResponsibility.class, this, Mif2Package.INTERACTION_PROFILE__RECEIVER_RESPONSIBILITIES);
		}
		return receiverResponsibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getInternalMapping() {
		return internalMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalMapping(ComplexMarkupWithLanguage newInternalMapping, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldInternalMapping = internalMapping;
		internalMapping = newInternalMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING, oldInternalMapping, newInternalMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalMapping(ComplexMarkupWithLanguage newInternalMapping) {
		if (newInternalMapping != internalMapping) {
			NotificationChain msgs = null;
			if (internalMapping != null)
				msgs = ((InternalEObject)internalMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING, null, msgs);
			if (newInternalMapping != null)
				msgs = ((InternalEObject)newInternalMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING, null, msgs);
			msgs = basicSetInternalMapping(newInternalMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING, newInternalMapping, newInternalMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfileKind getProfileType() {
		return profileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileType(InteractionProfileKind newProfileType) {
		InteractionProfileKind oldProfileType = profileType;
		profileType = newProfileType == null ? PROFILE_TYPE_EDEFAULT : newProfileType;
		boolean oldProfileTypeESet = profileTypeESet;
		profileTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_PROFILE__PROFILE_TYPE, oldProfileType, profileType, !oldProfileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileType() {
		InteractionProfileKind oldProfileType = profileType;
		boolean oldProfileTypeESet = profileTypeESet;
		profileType = PROFILE_TYPE_EDEFAULT;
		profileTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.INTERACTION_PROFILE__PROFILE_TYPE, oldProfileType, PROFILE_TYPE_EDEFAULT, oldProfileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileType() {
		return profileTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.INTERACTION_PROFILE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return basicSetImplementationConstraints(null, msgs);
			case Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE:
				return basicSetArgumentMessage(null, msgs);
			case Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL:
				return basicSetEffectiveStaticModel(null, msgs);
			case Mif2Package.INTERACTION_PROFILE__RECEIVER_RESPONSIBILITIES:
				return ((InternalEList<?>)getReceiverResponsibilities()).basicRemove(otherEnd, msgs);
			case Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING:
				return basicSetInternalMapping(null, msgs);
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
			case Mif2Package.INTERACTION_PROFILE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return getImplementationConstraints();
			case Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE:
				return getArgumentMessage();
			case Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL:
				return getEffectiveStaticModel();
			case Mif2Package.INTERACTION_PROFILE__RECEIVER_RESPONSIBILITIES:
				return getReceiverResponsibilities();
			case Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING:
				return getInternalMapping();
			case Mif2Package.INTERACTION_PROFILE__PROFILE_TYPE:
				return getProfileType();
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
			case Mif2Package.INTERACTION_PROFILE__ANNOTATIONS:
				setAnnotations((InteractionProfileAnnotations)newValue);
				return;
			case Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				setImplementationConstraints((ImplementationMessageConstraints)newValue);
				return;
			case Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE:
				setArgumentMessage((BoundStaticModel)newValue);
				return;
			case Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL:
				setEffectiveStaticModel((SerializedStaticModel)newValue);
				return;
			case Mif2Package.INTERACTION_PROFILE__RECEIVER_RESPONSIBILITIES:
				getReceiverResponsibilities().clear();
				getReceiverResponsibilities().addAll((Collection<? extends ReceiverResponsibility>)newValue);
				return;
			case Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING:
				setInternalMapping((ComplexMarkupWithLanguage)newValue);
				return;
			case Mif2Package.INTERACTION_PROFILE__PROFILE_TYPE:
				setProfileType((InteractionProfileKind)newValue);
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
			case Mif2Package.INTERACTION_PROFILE__ANNOTATIONS:
				setAnnotations((InteractionProfileAnnotations)null);
				return;
			case Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				setImplementationConstraints((ImplementationMessageConstraints)null);
				return;
			case Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE:
				setArgumentMessage((BoundStaticModel)null);
				return;
			case Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL:
				setEffectiveStaticModel((SerializedStaticModel)null);
				return;
			case Mif2Package.INTERACTION_PROFILE__RECEIVER_RESPONSIBILITIES:
				getReceiverResponsibilities().clear();
				return;
			case Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING:
				setInternalMapping((ComplexMarkupWithLanguage)null);
				return;
			case Mif2Package.INTERACTION_PROFILE__PROFILE_TYPE:
				unsetProfileType();
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
			case Mif2Package.INTERACTION_PROFILE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.INTERACTION_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return implementationConstraints != null;
			case Mif2Package.INTERACTION_PROFILE__ARGUMENT_MESSAGE:
				return argumentMessage != null;
			case Mif2Package.INTERACTION_PROFILE__EFFECTIVE_STATIC_MODEL:
				return effectiveStaticModel != null;
			case Mif2Package.INTERACTION_PROFILE__RECEIVER_RESPONSIBILITIES:
				return receiverResponsibilities != null && !receiverResponsibilities.isEmpty();
			case Mif2Package.INTERACTION_PROFILE__INTERNAL_MAPPING:
				return internalMapping != null;
			case Mif2Package.INTERACTION_PROFILE__PROFILE_TYPE:
				return isSetProfileType();
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
		result.append(" (profileType: ");
		if (profileTypeESet) result.append(profileType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InteractionProfileImpl
