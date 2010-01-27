/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DiagramElementImpl#getLastAdjustedDateTime <em>Last Adjusted Date Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DiagramElementImpl#getShapeId <em>Shape Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends EObjectImpl implements DiagramElement {
	/**
	 * The default value of the '{@link #getLastAdjustedDateTime() <em>Last Adjusted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAdjustedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_ADJUSTED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAdjustedDateTime() <em>Last Adjusted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAdjustedDateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastAdjustedDateTime = LAST_ADJUSTED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShapeId() <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapeId() <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeId()
	 * @generated
	 * @ordered
	 */
	protected String shapeId = SHAPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastAdjustedDateTime() {
		return lastAdjustedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAdjustedDateTime(XMLGregorianCalendar newLastAdjustedDateTime) {
		XMLGregorianCalendar oldLastAdjustedDateTime = lastAdjustedDateTime;
		lastAdjustedDateTime = newLastAdjustedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DIAGRAM_ELEMENT__LAST_ADJUSTED_DATE_TIME, oldLastAdjustedDateTime, lastAdjustedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShapeId() {
		return shapeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeId(String newShapeId) {
		String oldShapeId = shapeId;
		shapeId = newShapeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DIAGRAM_ELEMENT__SHAPE_ID, oldShapeId, shapeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.DIAGRAM_ELEMENT__LAST_ADJUSTED_DATE_TIME:
				return getLastAdjustedDateTime();
			case Mif2Package.DIAGRAM_ELEMENT__SHAPE_ID:
				return getShapeId();
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
			case Mif2Package.DIAGRAM_ELEMENT__LAST_ADJUSTED_DATE_TIME:
				setLastAdjustedDateTime((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.DIAGRAM_ELEMENT__SHAPE_ID:
				setShapeId((String)newValue);
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
			case Mif2Package.DIAGRAM_ELEMENT__LAST_ADJUSTED_DATE_TIME:
				setLastAdjustedDateTime(LAST_ADJUSTED_DATE_TIME_EDEFAULT);
				return;
			case Mif2Package.DIAGRAM_ELEMENT__SHAPE_ID:
				setShapeId(SHAPE_ID_EDEFAULT);
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
			case Mif2Package.DIAGRAM_ELEMENT__LAST_ADJUSTED_DATE_TIME:
				return LAST_ADJUSTED_DATE_TIME_EDEFAULT == null ? lastAdjustedDateTime != null : !LAST_ADJUSTED_DATE_TIME_EDEFAULT.equals(lastAdjustedDateTime);
			case Mif2Package.DIAGRAM_ELEMENT__SHAPE_ID:
				return SHAPE_ID_EDEFAULT == null ? shapeId != null : !SHAPE_ID_EDEFAULT.equals(shapeId);
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
		result.append(" (lastAdjustedDateTime: ");
		result.append(lastAdjustedDateTime);
		result.append(", shapeId: ");
		result.append(shapeId);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl
