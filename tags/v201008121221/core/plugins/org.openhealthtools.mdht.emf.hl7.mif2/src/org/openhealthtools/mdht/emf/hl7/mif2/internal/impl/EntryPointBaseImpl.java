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

import org.openhealthtools.mdht.emf.hl7.mif2.EntryPointAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EntryPointBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EntryPointBaseImpl#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EntryPointBaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EntryPointBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EntryPointBaseImpl#getUseKind <em>Use Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryPointBaseImpl extends InterfaceImpl implements EntryPointBase {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EntryPointAnnotations annotations;

	/**
	 * The default value of the '{@link #getGraphicLinkId() <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHIC_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphicLinkId() <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicLinkId()
	 * @generated
	 * @ordered
	 */
	protected String graphicLinkId = GRAPHIC_LINK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseKind() <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKind()
	 * @generated
	 * @ordered
	 */
	protected static final StaticModelUseKind USE_KIND_EDEFAULT = StaticModelUseKind.COMMUNICATION_WRAPPER;

	/**
	 * The cached value of the '{@link #getUseKind() <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKind()
	 * @generated
	 * @ordered
	 */
	protected StaticModelUseKind useKind = USE_KIND_EDEFAULT;

	/**
	 * This is true if the Use Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ENTRY_POINT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(EntryPointAnnotations newAnnotations, NotificationChain msgs) {
		EntryPointAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(EntryPointAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphicLinkId() {
		return graphicLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicLinkId(String newGraphicLinkId) {
		String oldGraphicLinkId = graphicLinkId;
		graphicLinkId = newGraphicLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ENTRY_POINT_BASE__GRAPHIC_LINK_ID, oldGraphicLinkId, graphicLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ENTRY_POINT_BASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ENTRY_POINT_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelUseKind getUseKind() {
		return useKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseKind(StaticModelUseKind newUseKind) {
		StaticModelUseKind oldUseKind = useKind;
		useKind = newUseKind == null ? USE_KIND_EDEFAULT : newUseKind;
		boolean oldUseKindESet = useKindESet;
		useKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ENTRY_POINT_BASE__USE_KIND, oldUseKind, useKind, !oldUseKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseKind() {
		StaticModelUseKind oldUseKind = useKind;
		boolean oldUseKindESet = useKindESet;
		useKind = USE_KIND_EDEFAULT;
		useKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ENTRY_POINT_BASE__USE_KIND, oldUseKind, USE_KIND_EDEFAULT, oldUseKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseKind() {
		return useKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.ENTRY_POINT_BASE__GRAPHIC_LINK_ID:
				return getGraphicLinkId();
			case Mif2Package.ENTRY_POINT_BASE__ID:
				return getId();
			case Mif2Package.ENTRY_POINT_BASE__NAME:
				return getName();
			case Mif2Package.ENTRY_POINT_BASE__USE_KIND:
				return getUseKind();
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
			case Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS:
				setAnnotations((EntryPointAnnotations)newValue);
				return;
			case Mif2Package.ENTRY_POINT_BASE__GRAPHIC_LINK_ID:
				setGraphicLinkId((String)newValue);
				return;
			case Mif2Package.ENTRY_POINT_BASE__ID:
				setId((String)newValue);
				return;
			case Mif2Package.ENTRY_POINT_BASE__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.ENTRY_POINT_BASE__USE_KIND:
				setUseKind((StaticModelUseKind)newValue);
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
			case Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS:
				setAnnotations((EntryPointAnnotations)null);
				return;
			case Mif2Package.ENTRY_POINT_BASE__GRAPHIC_LINK_ID:
				setGraphicLinkId(GRAPHIC_LINK_ID_EDEFAULT);
				return;
			case Mif2Package.ENTRY_POINT_BASE__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.ENTRY_POINT_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.ENTRY_POINT_BASE__USE_KIND:
				unsetUseKind();
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
			case Mif2Package.ENTRY_POINT_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.ENTRY_POINT_BASE__GRAPHIC_LINK_ID:
				return GRAPHIC_LINK_ID_EDEFAULT == null ? graphicLinkId != null : !GRAPHIC_LINK_ID_EDEFAULT.equals(graphicLinkId);
			case Mif2Package.ENTRY_POINT_BASE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Mif2Package.ENTRY_POINT_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.ENTRY_POINT_BASE__USE_KIND:
				return isSetUseKind();
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
		result.append(" (graphicLinkId: ");
		result.append(graphicLinkId);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", useKind: ");
		if (useKindESet) result.append(useKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EntryPointBaseImpl
