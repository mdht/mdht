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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Diagram;
import org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DiagramGraphicInformationImpl#getGraphElement <em>Graph Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramGraphicInformationImpl extends EObjectImpl implements DiagramGraphicInformation {
	/**
	 * The cached value of the '{@link #getGraphElement() <em>Graph Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphElement()
	 * @generated
	 * @ordered
	 */
	protected Diagram graphElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramGraphicInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DIAGRAM_GRAPHIC_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getGraphElement() {
		return graphElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphElement(Diagram newGraphElement, NotificationChain msgs) {
		Diagram oldGraphElement = graphElement;
		graphElement = newGraphElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT, oldGraphElement, newGraphElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphElement(Diagram newGraphElement) {
		if (newGraphElement != graphElement) {
			NotificationChain msgs = null;
			if (graphElement != null)
				msgs = ((InternalEObject)graphElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT, null, msgs);
			if (newGraphElement != null)
				msgs = ((InternalEObject)newGraphElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT, null, msgs);
			msgs = basicSetGraphElement(newGraphElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT, newGraphElement, newGraphElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				return basicSetGraphElement(null, msgs);
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
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				return getGraphElement();
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
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				setGraphElement((Diagram)newValue);
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
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				setGraphElement((Diagram)null);
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
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION__GRAPH_ELEMENT:
				return graphElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramGraphicInformationImpl
