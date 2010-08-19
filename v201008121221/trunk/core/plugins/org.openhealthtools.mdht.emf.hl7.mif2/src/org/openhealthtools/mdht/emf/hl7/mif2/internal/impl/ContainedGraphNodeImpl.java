/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ContainedGraphNode;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Graph Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContainedGraphNodeImpl#getShapeTemplate <em>Shape Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainedGraphNodeImpl extends GraphNodeImpl implements ContainedGraphNode {
	/**
	 * The default value of the '{@link #getShapeTemplate() <em>Shape Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapeTemplate() <em>Shape Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String shapeTemplate = SHAPE_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedGraphNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONTAINED_GRAPH_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShapeTemplate() {
		return shapeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeTemplate(String newShapeTemplate) {
		String oldShapeTemplate = shapeTemplate;
		shapeTemplate = newShapeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTAINED_GRAPH_NODE__SHAPE_TEMPLATE, oldShapeTemplate, shapeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.CONTAINED_GRAPH_NODE__SHAPE_TEMPLATE:
				return getShapeTemplate();
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
			case Mif2Package.CONTAINED_GRAPH_NODE__SHAPE_TEMPLATE:
				setShapeTemplate((String)newValue);
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
			case Mif2Package.CONTAINED_GRAPH_NODE__SHAPE_TEMPLATE:
				setShapeTemplate(SHAPE_TEMPLATE_EDEFAULT);
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
			case Mif2Package.CONTAINED_GRAPH_NODE__SHAPE_TEMPLATE:
				return SHAPE_TEMPLATE_EDEFAULT == null ? shapeTemplate != null : !SHAPE_TEMPLATE_EDEFAULT.equals(shapeTemplate);
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
		result.append(" (shapeTemplate: ");
		result.append(shapeTemplate);
		result.append(')');
		return result.toString();
	}

} //ContainedGraphNodeImpl
