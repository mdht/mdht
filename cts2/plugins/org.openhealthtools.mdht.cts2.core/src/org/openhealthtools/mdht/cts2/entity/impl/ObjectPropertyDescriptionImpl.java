/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality;
import org.openhealthtools.mdht.cts2.entity.Transitivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.ObjectPropertyDescriptionImpl#getDirected <em>Directed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.ObjectPropertyDescriptionImpl#getTransitivity <em>Transitivity</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObjectPropertyDescriptionImpl extends PredicateDescriptionImpl implements ObjectPropertyDescription {
	/**
	 * The default value of the '{@link #getDirected() <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirected()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectPropertyDirectionality DIRECTED_EDEFAULT = ObjectPropertyDirectionality.UNIDIRECTIONAL;

	/**
	 * The cached value of the '{@link #getDirected() <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirected()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyDirectionality directed = DIRECTED_EDEFAULT;

	/**
	 * This is true if the Directed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean directedESet;

	/**
	 * The default value of the '{@link #getTransitivity() <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTransitivity()
	 * @generated
	 * @ordered
	 */
	protected static final Transitivity TRANSITIVITY_EDEFAULT = Transitivity.TRANSITIVE;

	/**
	 * The cached value of the '{@link #getTransitivity() <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTransitivity()
	 * @generated
	 * @ordered
	 */
	protected Transitivity transitivity = TRANSITIVITY_EDEFAULT;

	/**
	 * This is true if the Transitivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean transitivityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ObjectPropertyDescriptionImpl() {
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
		return EntityPackage.Literals.OBJECT_PROPERTY_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectPropertyDirectionality getDirected() {
		return directed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDirected(ObjectPropertyDirectionality newDirected) {
		ObjectPropertyDirectionality oldDirected = directed;
		directed = newDirected == null
				? DIRECTED_EDEFAULT
				: newDirected;
		boolean oldDirectedESet = directedESet;
		directedESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.OBJECT_PROPERTY_DESCRIPTION__DIRECTED, oldDirected, directed,
				!oldDirectedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDirected() {
		ObjectPropertyDirectionality oldDirected = directed;
		boolean oldDirectedESet = directedESet;
		directed = DIRECTED_EDEFAULT;
		directedESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, EntityPackage.OBJECT_PROPERTY_DESCRIPTION__DIRECTED, oldDirected,
				DIRECTED_EDEFAULT, oldDirectedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDirected() {
		return directedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transitivity getTransitivity() {
		return transitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransitivity(Transitivity newTransitivity) {
		Transitivity oldTransitivity = transitivity;
		transitivity = newTransitivity == null
				? TRANSITIVITY_EDEFAULT
				: newTransitivity;
		boolean oldTransitivityESet = transitivityESet;
		transitivityESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY, oldTransitivity,
				transitivity, !oldTransitivityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetTransitivity() {
		Transitivity oldTransitivity = transitivity;
		boolean oldTransitivityESet = transitivityESet;
		transitivity = TRANSITIVITY_EDEFAULT;
		transitivityESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, EntityPackage.OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY, oldTransitivity,
				TRANSITIVITY_EDEFAULT, oldTransitivityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetTransitivity() {
		return transitivityESet;
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
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__DIRECTED:
				return getDirected();
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY:
				return getTransitivity();
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
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__DIRECTED:
				setDirected((ObjectPropertyDirectionality) newValue);
				return;
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY:
				setTransitivity((Transitivity) newValue);
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
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__DIRECTED:
				unsetDirected();
				return;
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY:
				unsetTransitivity();
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
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__DIRECTED:
				return isSetDirected();
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY:
				return isSetTransitivity();
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
		result.append(" (directed: ");
		if (directedESet) {
			result.append(directed);
		} else {
			result.append("<unset>");
		}
		result.append(", transitivity: ");
		if (transitivityESet) {
			result.append(transitivity);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ObjectPropertyDescriptionImpl
