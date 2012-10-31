/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.RoleReference;
import org.openhealthtools.mdht.cts2.core.SourceAndRoleReference;
import org.openhealthtools.mdht.cts2.core.SourceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source And Role Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl#getRole <em>Role</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndRoleReferenceImpl#getBibliographicLink <em>Bibliographic Link</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SourceAndRoleReferenceImpl extends EObjectImpl implements SourceAndRoleReference {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SourceAndRoleReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CorePackage.SOURCE_AND_ROLE_REFERENCE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceReference getSource() {
		return (SourceReference) getMixed().get(CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceReference newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(SourceReference newSource) {
		((FeatureMap.Internal) getMixed()).set(CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleReference getRole() {
		return (RoleReference) getMixed().get(CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleReference newRole, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__ROLE, newRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRole(RoleReference newRole) {
		((FeatureMap.Internal) getMixed()).set(CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getBibliographicLink() {
		return (OpaqueData) getMixed().get(CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBibliographicLink(OpaqueData newBibliographicLink, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK, newBibliographicLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBibliographicLink(OpaqueData newBibliographicLink) {
		((FeatureMap.Internal) getMixed()).set(
			CorePackage.Literals.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK, newBibliographicLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__SOURCE:
				return basicSetSource(null, msgs);
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__ROLE:
				return basicSetRole(null, msgs);
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK:
				return basicSetBibliographicLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__SOURCE:
				return getSource();
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__ROLE:
				return getRole();
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK:
				return getBibliographicLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__SOURCE:
				setSource((SourceReference) newValue);
				return;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__ROLE:
				setRole((RoleReference) newValue);
				return;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK:
				setBibliographicLink((OpaqueData) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__MIXED:
				getMixed().clear();
				return;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__SOURCE:
				setSource((SourceReference) null);
				return;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__ROLE:
				setRole((RoleReference) null);
				return;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK:
				setBibliographicLink((OpaqueData) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__SOURCE:
				return getSource() != null;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__ROLE:
				return getRole() != null;
			case CorePackage.SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK:
				return getBibliographicLink() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // SourceAndRoleReferenceImpl
