/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Dimension;
import org.openhealthtools.mdht.emf.hl7.mif2.GraphNode;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NodeOrientation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphNodeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphNodeImpl#isIsHeightAutoSize <em>Is Height Auto Size</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphNodeImpl#isIsWidthAutoSize <em>Is Width Auto Size</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphNodeImpl#getNodeOrientation <em>Node Orientation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphNodeImpl#getTextWrappingWidth <em>Text Wrapping Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphNodeImpl extends GraphElementImpl implements GraphNode {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size;

	/**
	 * The default value of the '{@link #isIsHeightAutoSize() <em>Is Height Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeightAutoSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEIGHT_AUTO_SIZE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsHeightAutoSize() <em>Is Height Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeightAutoSize()
	 * @generated
	 * @ordered
	 */
	protected boolean isHeightAutoSize = IS_HEIGHT_AUTO_SIZE_EDEFAULT;

	/**
	 * This is true if the Is Height Auto Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isHeightAutoSizeESet;

	/**
	 * The default value of the '{@link #isIsWidthAutoSize() <em>Is Width Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWidthAutoSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WIDTH_AUTO_SIZE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsWidthAutoSize() <em>Is Width Auto Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWidthAutoSize()
	 * @generated
	 * @ordered
	 */
	protected boolean isWidthAutoSize = IS_WIDTH_AUTO_SIZE_EDEFAULT;

	/**
	 * This is true if the Is Width Auto Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isWidthAutoSizeESet;

	/**
	 * The default value of the '{@link #getNodeOrientation() <em>Node Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final NodeOrientation NODE_ORIENTATION_EDEFAULT = NodeOrientation.PORTRAIT;

	/**
	 * The cached value of the '{@link #getNodeOrientation() <em>Node Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeOrientation()
	 * @generated
	 * @ordered
	 */
	protected NodeOrientation nodeOrientation = NODE_ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Node Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeOrientationESet;

	/**
	 * The default value of the '{@link #getTextWrappingWidth() <em>Text Wrapping Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextWrappingWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEXT_WRAPPING_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextWrappingWidth() <em>Text Wrapping Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextWrappingWidth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal textWrappingWidth = TEXT_WRAPPING_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.GRAPH_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.GRAPH_NODE__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Dimension newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.GRAPH_NODE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.GRAPH_NODE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GRAPH_NODE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHeightAutoSize() {
		return isHeightAutoSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeightAutoSize(boolean newIsHeightAutoSize) {
		boolean oldIsHeightAutoSize = isHeightAutoSize;
		isHeightAutoSize = newIsHeightAutoSize;
		boolean oldIsHeightAutoSizeESet = isHeightAutoSizeESet;
		isHeightAutoSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GRAPH_NODE__IS_HEIGHT_AUTO_SIZE, oldIsHeightAutoSize, isHeightAutoSize, !oldIsHeightAutoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsHeightAutoSize() {
		boolean oldIsHeightAutoSize = isHeightAutoSize;
		boolean oldIsHeightAutoSizeESet = isHeightAutoSizeESet;
		isHeightAutoSize = IS_HEIGHT_AUTO_SIZE_EDEFAULT;
		isHeightAutoSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.GRAPH_NODE__IS_HEIGHT_AUTO_SIZE, oldIsHeightAutoSize, IS_HEIGHT_AUTO_SIZE_EDEFAULT, oldIsHeightAutoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsHeightAutoSize() {
		return isHeightAutoSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWidthAutoSize() {
		return isWidthAutoSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWidthAutoSize(boolean newIsWidthAutoSize) {
		boolean oldIsWidthAutoSize = isWidthAutoSize;
		isWidthAutoSize = newIsWidthAutoSize;
		boolean oldIsWidthAutoSizeESet = isWidthAutoSizeESet;
		isWidthAutoSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GRAPH_NODE__IS_WIDTH_AUTO_SIZE, oldIsWidthAutoSize, isWidthAutoSize, !oldIsWidthAutoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsWidthAutoSize() {
		boolean oldIsWidthAutoSize = isWidthAutoSize;
		boolean oldIsWidthAutoSizeESet = isWidthAutoSizeESet;
		isWidthAutoSize = IS_WIDTH_AUTO_SIZE_EDEFAULT;
		isWidthAutoSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.GRAPH_NODE__IS_WIDTH_AUTO_SIZE, oldIsWidthAutoSize, IS_WIDTH_AUTO_SIZE_EDEFAULT, oldIsWidthAutoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsWidthAutoSize() {
		return isWidthAutoSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOrientation getNodeOrientation() {
		return nodeOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeOrientation(NodeOrientation newNodeOrientation) {
		NodeOrientation oldNodeOrientation = nodeOrientation;
		nodeOrientation = newNodeOrientation == null ? NODE_ORIENTATION_EDEFAULT : newNodeOrientation;
		boolean oldNodeOrientationESet = nodeOrientationESet;
		nodeOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GRAPH_NODE__NODE_ORIENTATION, oldNodeOrientation, nodeOrientation, !oldNodeOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeOrientation() {
		NodeOrientation oldNodeOrientation = nodeOrientation;
		boolean oldNodeOrientationESet = nodeOrientationESet;
		nodeOrientation = NODE_ORIENTATION_EDEFAULT;
		nodeOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.GRAPH_NODE__NODE_ORIENTATION, oldNodeOrientation, NODE_ORIENTATION_EDEFAULT, oldNodeOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeOrientation() {
		return nodeOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTextWrappingWidth() {
		return textWrappingWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextWrappingWidth(BigDecimal newTextWrappingWidth) {
		BigDecimal oldTextWrappingWidth = textWrappingWidth;
		textWrappingWidth = newTextWrappingWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.GRAPH_NODE__TEXT_WRAPPING_WIDTH, oldTextWrappingWidth, textWrappingWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.GRAPH_NODE__SIZE:
				return basicSetSize(null, msgs);
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
			case Mif2Package.GRAPH_NODE__SIZE:
				return getSize();
			case Mif2Package.GRAPH_NODE__IS_HEIGHT_AUTO_SIZE:
				return isIsHeightAutoSize() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.GRAPH_NODE__IS_WIDTH_AUTO_SIZE:
				return isIsWidthAutoSize() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.GRAPH_NODE__NODE_ORIENTATION:
				return getNodeOrientation();
			case Mif2Package.GRAPH_NODE__TEXT_WRAPPING_WIDTH:
				return getTextWrappingWidth();
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
			case Mif2Package.GRAPH_NODE__SIZE:
				setSize((Dimension)newValue);
				return;
			case Mif2Package.GRAPH_NODE__IS_HEIGHT_AUTO_SIZE:
				setIsHeightAutoSize(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.GRAPH_NODE__IS_WIDTH_AUTO_SIZE:
				setIsWidthAutoSize(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.GRAPH_NODE__NODE_ORIENTATION:
				setNodeOrientation((NodeOrientation)newValue);
				return;
			case Mif2Package.GRAPH_NODE__TEXT_WRAPPING_WIDTH:
				setTextWrappingWidth((BigDecimal)newValue);
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
			case Mif2Package.GRAPH_NODE__SIZE:
				setSize((Dimension)null);
				return;
			case Mif2Package.GRAPH_NODE__IS_HEIGHT_AUTO_SIZE:
				unsetIsHeightAutoSize();
				return;
			case Mif2Package.GRAPH_NODE__IS_WIDTH_AUTO_SIZE:
				unsetIsWidthAutoSize();
				return;
			case Mif2Package.GRAPH_NODE__NODE_ORIENTATION:
				unsetNodeOrientation();
				return;
			case Mif2Package.GRAPH_NODE__TEXT_WRAPPING_WIDTH:
				setTextWrappingWidth(TEXT_WRAPPING_WIDTH_EDEFAULT);
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
			case Mif2Package.GRAPH_NODE__SIZE:
				return size != null;
			case Mif2Package.GRAPH_NODE__IS_HEIGHT_AUTO_SIZE:
				return isSetIsHeightAutoSize();
			case Mif2Package.GRAPH_NODE__IS_WIDTH_AUTO_SIZE:
				return isSetIsWidthAutoSize();
			case Mif2Package.GRAPH_NODE__NODE_ORIENTATION:
				return isSetNodeOrientation();
			case Mif2Package.GRAPH_NODE__TEXT_WRAPPING_WIDTH:
				return TEXT_WRAPPING_WIDTH_EDEFAULT == null ? textWrappingWidth != null : !TEXT_WRAPPING_WIDTH_EDEFAULT.equals(textWrappingWidth);
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
		result.append(" (isHeightAutoSize: ");
		if (isHeightAutoSizeESet) result.append(isHeightAutoSize); else result.append("<unset>");
		result.append(", isWidthAutoSize: ");
		if (isWidthAutoSizeESet) result.append(isWidthAutoSize); else result.append("<unset>");
		result.append(", nodeOrientation: ");
		if (nodeOrientationESet) result.append(nodeOrientation); else result.append("<unset>");
		result.append(", textWrappingWidth: ");
		result.append(textWrappingWidth);
		result.append(')');
		return result.toString();
	}

} //GraphNodeImpl
