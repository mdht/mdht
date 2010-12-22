/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileImpl#getImplementationConstraints <em>Implementation Constraints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileImpl#getEffectiveStaticModel <em>Effective Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileImpl#getProfileType <em>Profile Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentProfileImpl extends PackageImpl implements DocumentProfile {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected DocumentProfileAnnotations annotations;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected PackageRef document;

	/**
	 * The cached value of the '{@link #getImplementationConstraints() <em>Implementation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationConstraints()
	 * @generated
	 * @ordered
	 */
	protected ImplementationConstraints implementationConstraints;

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
	 * The default value of the '{@link #getProfileType() <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileType()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentProfileKind PROFILE_TYPE_EDEFAULT = DocumentProfileKind.CREATE;

	/**
	 * The cached value of the '{@link #getProfileType() <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileType()
	 * @generated
	 * @ordered
	 */
	protected DocumentProfileKind profileType = PROFILE_TYPE_EDEFAULT;

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
	protected DocumentProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOCUMENT_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(DocumentProfileAnnotations newAnnotations, NotificationChain msgs) {
		DocumentProfileAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(DocumentProfileAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(PackageRef newDocument, NotificationChain msgs) {
		PackageRef oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(PackageRef newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationConstraints getImplementationConstraints() {
		return implementationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationConstraints(ImplementationConstraints newImplementationConstraints, NotificationChain msgs) {
		ImplementationConstraints oldImplementationConstraints = implementationConstraints;
		implementationConstraints = newImplementationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS, oldImplementationConstraints, newImplementationConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationConstraints(ImplementationConstraints newImplementationConstraints) {
		if (newImplementationConstraints != implementationConstraints) {
			NotificationChain msgs = null;
			if (implementationConstraints != null)
				msgs = ((InternalEObject)implementationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS, null, msgs);
			if (newImplementationConstraints != null)
				msgs = ((InternalEObject)newImplementationConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS, null, msgs);
			msgs = basicSetImplementationConstraints(newImplementationConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS, newImplementationConstraints, newImplementationConstraints));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL, oldEffectiveStaticModel, newEffectiveStaticModel);
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
				msgs = ((InternalEObject)effectiveStaticModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL, null, msgs);
			if (newEffectiveStaticModel != null)
				msgs = ((InternalEObject)newEffectiveStaticModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL, null, msgs);
			msgs = basicSetEffectiveStaticModel(newEffectiveStaticModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL, newEffectiveStaticModel, newEffectiveStaticModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileKind getProfileType() {
		return profileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileType(DocumentProfileKind newProfileType) {
		DocumentProfileKind oldProfileType = profileType;
		profileType = newProfileType == null ? PROFILE_TYPE_EDEFAULT : newProfileType;
		boolean oldProfileTypeESet = profileTypeESet;
		profileTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_PROFILE__PROFILE_TYPE, oldProfileType, profileType, !oldProfileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileType() {
		DocumentProfileKind oldProfileType = profileType;
		boolean oldProfileTypeESet = profileTypeESet;
		profileType = PROFILE_TYPE_EDEFAULT;
		profileTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DOCUMENT_PROFILE__PROFILE_TYPE, oldProfileType, PROFILE_TYPE_EDEFAULT, oldProfileTypeESet));
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
			case Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.DOCUMENT_PROFILE__DOCUMENT:
				return basicSetDocument(null, msgs);
			case Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return basicSetImplementationConstraints(null, msgs);
			case Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL:
				return basicSetEffectiveStaticModel(null, msgs);
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
			case Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.DOCUMENT_PROFILE__DOCUMENT:
				return getDocument();
			case Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return getImplementationConstraints();
			case Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL:
				return getEffectiveStaticModel();
			case Mif2Package.DOCUMENT_PROFILE__PROFILE_TYPE:
				return getProfileType();
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
			case Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS:
				setAnnotations((DocumentProfileAnnotations)newValue);
				return;
			case Mif2Package.DOCUMENT_PROFILE__DOCUMENT:
				setDocument((PackageRef)newValue);
				return;
			case Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				setImplementationConstraints((ImplementationConstraints)newValue);
				return;
			case Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL:
				setEffectiveStaticModel((SerializedStaticModel)newValue);
				return;
			case Mif2Package.DOCUMENT_PROFILE__PROFILE_TYPE:
				setProfileType((DocumentProfileKind)newValue);
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
			case Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS:
				setAnnotations((DocumentProfileAnnotations)null);
				return;
			case Mif2Package.DOCUMENT_PROFILE__DOCUMENT:
				setDocument((PackageRef)null);
				return;
			case Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				setImplementationConstraints((ImplementationConstraints)null);
				return;
			case Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL:
				setEffectiveStaticModel((SerializedStaticModel)null);
				return;
			case Mif2Package.DOCUMENT_PROFILE__PROFILE_TYPE:
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
			case Mif2Package.DOCUMENT_PROFILE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.DOCUMENT_PROFILE__DOCUMENT:
				return document != null;
			case Mif2Package.DOCUMENT_PROFILE__IMPLEMENTATION_CONSTRAINTS:
				return implementationConstraints != null;
			case Mif2Package.DOCUMENT_PROFILE__EFFECTIVE_STATIC_MODEL:
				return effectiveStaticModel != null;
			case Mif2Package.DOCUMENT_PROFILE__PROFILE_TYPE:
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

} //DocumentProfileImpl
