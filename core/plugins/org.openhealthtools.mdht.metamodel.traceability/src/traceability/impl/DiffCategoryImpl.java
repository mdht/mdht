/**
 */
package traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import traceability.DiffCategory;
import traceability.TraceDiff;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.DiffCategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link traceability.impl.DiffCategoryImpl#getDiffs <em>Diffs</em>}</li>
 *   <li>{@link traceability.impl.DiffCategoryImpl#getModelIndex <em>Model Index</em>}</li>
 *   <li>{@link traceability.impl.DiffCategoryImpl#isUnequal <em>Unequal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiffCategoryImpl extends MinimalEObjectImpl.Container implements DiffCategory {
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
	 * The cached value of the '{@link #getDiffs() <em>Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceDiff> diffs;

	/**
	 * The default value of the '{@link #getModelIndex() <em>Model Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int MODEL_INDEX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getModelIndex() <em>Model Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIndex()
	 * @generated
	 * @ordered
	 */
	protected int modelIndex = MODEL_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnequal() <em>Unequal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnequal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNEQUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnequal() <em>Unequal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnequal()
	 * @generated
	 * @ordered
	 */
	protected boolean unequal = UNEQUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.DIFF_CATEGORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.DIFF_CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceDiff> getDiffs() {
		if (diffs == null) {
			diffs = new EObjectContainmentEList<TraceDiff>(TraceDiff.class, this, TraceabilityPackage.DIFF_CATEGORY__DIFFS);
		}
		return diffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModelIndex() {
		return modelIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIndex(int newModelIndex) {
		int oldModelIndex = modelIndex;
		modelIndex = newModelIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.DIFF_CATEGORY__MODEL_INDEX, oldModelIndex, modelIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnequal() {
		return unequal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnequal(boolean newUnequal) {
		boolean oldUnequal = unequal;
		unequal = newUnequal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.DIFF_CATEGORY__UNEQUAL, oldUnequal, unequal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.DIFF_CATEGORY__DIFFS:
				return ((InternalEList<?>)getDiffs()).basicRemove(otherEnd, msgs);
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
			case TraceabilityPackage.DIFF_CATEGORY__NAME:
				return getName();
			case TraceabilityPackage.DIFF_CATEGORY__DIFFS:
				return getDiffs();
			case TraceabilityPackage.DIFF_CATEGORY__MODEL_INDEX:
				return getModelIndex();
			case TraceabilityPackage.DIFF_CATEGORY__UNEQUAL:
				return isUnequal();
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
			case TraceabilityPackage.DIFF_CATEGORY__NAME:
				setName((String)newValue);
				return;
			case TraceabilityPackage.DIFF_CATEGORY__DIFFS:
				getDiffs().clear();
				getDiffs().addAll((Collection<? extends TraceDiff>)newValue);
				return;
			case TraceabilityPackage.DIFF_CATEGORY__MODEL_INDEX:
				setModelIndex((Integer)newValue);
				return;
			case TraceabilityPackage.DIFF_CATEGORY__UNEQUAL:
				setUnequal((Boolean)newValue);
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
			case TraceabilityPackage.DIFF_CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TraceabilityPackage.DIFF_CATEGORY__DIFFS:
				getDiffs().clear();
				return;
			case TraceabilityPackage.DIFF_CATEGORY__MODEL_INDEX:
				setModelIndex(MODEL_INDEX_EDEFAULT);
				return;
			case TraceabilityPackage.DIFF_CATEGORY__UNEQUAL:
				setUnequal(UNEQUAL_EDEFAULT);
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
			case TraceabilityPackage.DIFF_CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TraceabilityPackage.DIFF_CATEGORY__DIFFS:
				return diffs != null && !diffs.isEmpty();
			case TraceabilityPackage.DIFF_CATEGORY__MODEL_INDEX:
				return modelIndex != MODEL_INDEX_EDEFAULT;
			case TraceabilityPackage.DIFF_CATEGORY__UNEQUAL:
				return unequal != UNEQUAL_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", modelIndex: ");
		result.append(modelIndex);
		result.append(", unequal: ");
		result.append(unequal);
		result.append(')');
		return result.toString();
	}

} //DiffCategoryImpl
