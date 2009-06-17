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

import org.openhealthtools.mdht.emf.hl7.mif2.Header;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageKind;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getPackageLocation <em>Package Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getReplacedBy <em>Replaced By</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getHashCode <em>Hash Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getPackageKind <em>Package Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getSecondaryId <em>Secondary Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageImpl extends PackageBaseImpl implements org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * The cached value of the '{@link #getPackageLocation() <em>Package Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageLocation()
	 * @generated
	 * @ordered
	 */
	protected PackageRef packageLocation;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> replaces;

	/**
	 * The cached value of the '{@link #getReplacedBy() <em>Replaced By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> replacedBy;

	/**
	 * The default value of the '{@link #getHashCode() <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashCode()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashCode() <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashCode()
	 * @generated
	 * @ordered
	 */
	protected String hashCode = HASH_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageKind() <em>Package Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageKind()
	 * @generated
	 * @ordered
	 */
	protected static final PackageKind PACKAGE_KIND_EDEFAULT = PackageKind.ROOT;

	/**
	 * The cached value of the '{@link #getPackageKind() <em>Package Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageKind()
	 * @generated
	 * @ordered
	 */
	protected PackageKind packageKind = PACKAGE_KIND_EDEFAULT;

	/**
	 * This is true if the Package Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packageKindESet;

	/**
	 * The default value of the '{@link #getSecondaryId() <em>Secondary Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryId()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDARY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryId() <em>Secondary Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryId()
	 * @generated
	 * @ordered
	 */
	protected String secondaryId = SECONDARY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getPackageLocation() {
		return packageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageLocation(PackageRef newPackageLocation, NotificationChain msgs) {
		PackageRef oldPackageLocation = packageLocation;
		packageLocation = newPackageLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__PACKAGE_LOCATION, oldPackageLocation, newPackageLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageLocation(PackageRef newPackageLocation) {
		if (newPackageLocation != packageLocation) {
			NotificationChain msgs = null;
			if (packageLocation != null)
				msgs = ((InternalEObject)packageLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.PACKAGE__PACKAGE_LOCATION, null, msgs);
			if (newPackageLocation != null)
				msgs = ((InternalEObject)newPackageLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.PACKAGE__PACKAGE_LOCATION, null, msgs);
			msgs = basicSetPackageLocation(newPackageLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__PACKAGE_LOCATION, newPackageLocation, newPackageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.PACKAGE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.PACKAGE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectContainmentEList<PackageRef>(PackageRef.class, this, Mif2Package.PACKAGE__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getReplacedBy() {
		if (replacedBy == null) {
			replacedBy = new EObjectContainmentEList<PackageRef>(PackageRef.class, this, Mif2Package.PACKAGE__REPLACED_BY);
		}
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashCode() {
		return hashCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashCode(String newHashCode) {
		String oldHashCode = hashCode;
		hashCode = newHashCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__HASH_CODE, oldHashCode, hashCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageKind getPackageKind() {
		return packageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageKind(PackageKind newPackageKind) {
		PackageKind oldPackageKind = packageKind;
		packageKind = newPackageKind == null ? PACKAGE_KIND_EDEFAULT : newPackageKind;
		boolean oldPackageKindESet = packageKindESet;
		packageKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__PACKAGE_KIND, oldPackageKind, packageKind, !oldPackageKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPackageKind() {
		PackageKind oldPackageKind = packageKind;
		boolean oldPackageKindESet = packageKindESet;
		packageKind = PACKAGE_KIND_EDEFAULT;
		packageKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.PACKAGE__PACKAGE_KIND, oldPackageKind, PACKAGE_KIND_EDEFAULT, oldPackageKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPackageKind() {
		return packageKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondaryId() {
		return secondaryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryId(String newSecondaryId) {
		String oldSecondaryId = secondaryId;
		secondaryId = newSecondaryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__SECONDARY_ID, oldSecondaryId, secondaryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.PACKAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PACKAGE__PACKAGE_LOCATION:
				return basicSetPackageLocation(null, msgs);
			case Mif2Package.PACKAGE__HEADER:
				return basicSetHeader(null, msgs);
			case Mif2Package.PACKAGE__REPLACES:
				return ((InternalEList<?>)getReplaces()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE__REPLACED_BY:
				return ((InternalEList<?>)getReplacedBy()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PACKAGE__PACKAGE_LOCATION:
				return getPackageLocation();
			case Mif2Package.PACKAGE__HEADER:
				return getHeader();
			case Mif2Package.PACKAGE__REPLACES:
				return getReplaces();
			case Mif2Package.PACKAGE__REPLACED_BY:
				return getReplacedBy();
			case Mif2Package.PACKAGE__HASH_CODE:
				return getHashCode();
			case Mif2Package.PACKAGE__PACKAGE_KIND:
				return getPackageKind();
			case Mif2Package.PACKAGE__SECONDARY_ID:
				return getSecondaryId();
			case Mif2Package.PACKAGE__TITLE:
				return getTitle();
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
			case Mif2Package.PACKAGE__PACKAGE_LOCATION:
				setPackageLocation((PackageRef)newValue);
				return;
			case Mif2Package.PACKAGE__HEADER:
				setHeader((Header)newValue);
				return;
			case Mif2Package.PACKAGE__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends PackageRef>)newValue);
				return;
			case Mif2Package.PACKAGE__REPLACED_BY:
				getReplacedBy().clear();
				getReplacedBy().addAll((Collection<? extends PackageRef>)newValue);
				return;
			case Mif2Package.PACKAGE__HASH_CODE:
				setHashCode((String)newValue);
				return;
			case Mif2Package.PACKAGE__PACKAGE_KIND:
				setPackageKind((PackageKind)newValue);
				return;
			case Mif2Package.PACKAGE__SECONDARY_ID:
				setSecondaryId((String)newValue);
				return;
			case Mif2Package.PACKAGE__TITLE:
				setTitle((String)newValue);
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
			case Mif2Package.PACKAGE__PACKAGE_LOCATION:
				setPackageLocation((PackageRef)null);
				return;
			case Mif2Package.PACKAGE__HEADER:
				setHeader((Header)null);
				return;
			case Mif2Package.PACKAGE__REPLACES:
				getReplaces().clear();
				return;
			case Mif2Package.PACKAGE__REPLACED_BY:
				getReplacedBy().clear();
				return;
			case Mif2Package.PACKAGE__HASH_CODE:
				setHashCode(HASH_CODE_EDEFAULT);
				return;
			case Mif2Package.PACKAGE__PACKAGE_KIND:
				unsetPackageKind();
				return;
			case Mif2Package.PACKAGE__SECONDARY_ID:
				setSecondaryId(SECONDARY_ID_EDEFAULT);
				return;
			case Mif2Package.PACKAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case Mif2Package.PACKAGE__PACKAGE_LOCATION:
				return packageLocation != null;
			case Mif2Package.PACKAGE__HEADER:
				return header != null;
			case Mif2Package.PACKAGE__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case Mif2Package.PACKAGE__REPLACED_BY:
				return replacedBy != null && !replacedBy.isEmpty();
			case Mif2Package.PACKAGE__HASH_CODE:
				return HASH_CODE_EDEFAULT == null ? hashCode != null : !HASH_CODE_EDEFAULT.equals(hashCode);
			case Mif2Package.PACKAGE__PACKAGE_KIND:
				return isSetPackageKind();
			case Mif2Package.PACKAGE__SECONDARY_ID:
				return SECONDARY_ID_EDEFAULT == null ? secondaryId != null : !SECONDARY_ID_EDEFAULT.equals(secondaryId);
			case Mif2Package.PACKAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (hashCode: ");
		result.append(hashCode);
		result.append(", packageKind: ");
		if (packageKindESet) result.append(packageKind); else result.append("<unset>");
		result.append(", secondaryId: ");
		result.append(secondaryId);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
