/**
 */
package traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import traceability.TraceDiffs;
import traceability.TraceabilityPackage;
import traceability.Traces;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Diffs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.TraceDiffsImpl#getComparedTraces <em>Compared Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceDiffsImpl extends MinimalEObjectImpl.Container implements TraceDiffs {
	/**
	 * The cached value of the '{@link #getComparedTraces() <em>Compared Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Traces> comparedTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceDiffsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE_DIFFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traces> getComparedTraces() {
		if (comparedTraces == null) {
			comparedTraces = new EObjectResolvingEList<Traces>(Traces.class, this, TraceabilityPackage.TRACE_DIFFS__COMPARED_TRACES);
		}
		return comparedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TRACE_DIFFS__COMPARED_TRACES:
				return getComparedTraces();
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
			case TraceabilityPackage.TRACE_DIFFS__COMPARED_TRACES:
				getComparedTraces().clear();
				getComparedTraces().addAll((Collection<? extends Traces>)newValue);
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
			case TraceabilityPackage.TRACE_DIFFS__COMPARED_TRACES:
				getComparedTraces().clear();
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
			case TraceabilityPackage.TRACE_DIFFS__COMPARED_TRACES:
				return comparedTraces != null && !comparedTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceDiffsImpl
