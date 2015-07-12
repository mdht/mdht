/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProcedureDevice;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureDeviceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureDeviceImpl#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureDeviceImpl extends BackboneElementImpl implements ProcedureDevice {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept action;

	/**
	 * The cached value of the '{@link #getManipulated() <em>Manipulated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulated()
	 * @generated
	 * @ordered
	 */
	protected Reference manipulated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedureDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(CodeableConcept newAction, NotificationChain msgs) {
		CodeableConcept oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_DEVICE__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(CodeableConcept newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_DEVICE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_DEVICE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_DEVICE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManipulated() {
		return manipulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManipulated(Reference newManipulated, NotificationChain msgs) {
		Reference oldManipulated = manipulated;
		manipulated = newManipulated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_DEVICE__MANIPULATED, oldManipulated, newManipulated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManipulated(Reference newManipulated) {
		if (newManipulated != manipulated) {
			NotificationChain msgs = null;
			if (manipulated != null)
				msgs = ((InternalEObject)manipulated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_DEVICE__MANIPULATED, null, msgs);
			if (newManipulated != null)
				msgs = ((InternalEObject)newManipulated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_DEVICE__MANIPULATED, null, msgs);
			msgs = basicSetManipulated(newManipulated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_DEVICE__MANIPULATED, newManipulated, newManipulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE_DEVICE__ACTION:
				return basicSetAction(null, msgs);
			case FhirPackage.PROCEDURE_DEVICE__MANIPULATED:
				return basicSetManipulated(null, msgs);
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
			case FhirPackage.PROCEDURE_DEVICE__ACTION:
				return getAction();
			case FhirPackage.PROCEDURE_DEVICE__MANIPULATED:
				return getManipulated();
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
			case FhirPackage.PROCEDURE_DEVICE__ACTION:
				setAction((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_DEVICE__MANIPULATED:
				setManipulated((Reference)newValue);
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
			case FhirPackage.PROCEDURE_DEVICE__ACTION:
				setAction((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_DEVICE__MANIPULATED:
				setManipulated((Reference)null);
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
			case FhirPackage.PROCEDURE_DEVICE__ACTION:
				return action != null;
			case FhirPackage.PROCEDURE_DEVICE__MANIPULATED:
				return manipulated != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureDeviceImpl
