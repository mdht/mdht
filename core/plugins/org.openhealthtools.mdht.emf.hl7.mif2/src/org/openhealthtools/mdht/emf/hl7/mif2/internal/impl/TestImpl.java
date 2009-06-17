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

import org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.Test;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestImpl#getInteractionTest <em>Interaction Test</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestImpl#getDocumentTest <em>Document Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends EObjectImpl implements Test {
	/**
	 * The cached value of the '{@link #getInteractionTest() <em>Interaction Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionTest()
	 * @generated
	 * @ordered
	 */
	protected InteractionTest interactionTest;

	/**
	 * The cached value of the '{@link #getDocumentTest() <em>Document Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTest()
	 * @generated
	 * @ordered
	 */
	protected DocumentTest documentTest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTest getInteractionTest() {
		return interactionTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionTest(InteractionTest newInteractionTest, NotificationChain msgs) {
		InteractionTest oldInteractionTest = interactionTest;
		interactionTest = newInteractionTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.TEST__INTERACTION_TEST, oldInteractionTest, newInteractionTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionTest(InteractionTest newInteractionTest) {
		if (newInteractionTest != interactionTest) {
			NotificationChain msgs = null;
			if (interactionTest != null)
				msgs = ((InternalEObject)interactionTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.TEST__INTERACTION_TEST, null, msgs);
			if (newInteractionTest != null)
				msgs = ((InternalEObject)newInteractionTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.TEST__INTERACTION_TEST, null, msgs);
			msgs = basicSetInteractionTest(newInteractionTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TEST__INTERACTION_TEST, newInteractionTest, newInteractionTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTest getDocumentTest() {
		return documentTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentTest(DocumentTest newDocumentTest, NotificationChain msgs) {
		DocumentTest oldDocumentTest = documentTest;
		documentTest = newDocumentTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.TEST__DOCUMENT_TEST, oldDocumentTest, newDocumentTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentTest(DocumentTest newDocumentTest) {
		if (newDocumentTest != documentTest) {
			NotificationChain msgs = null;
			if (documentTest != null)
				msgs = ((InternalEObject)documentTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.TEST__DOCUMENT_TEST, null, msgs);
			if (newDocumentTest != null)
				msgs = ((InternalEObject)newDocumentTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.TEST__DOCUMENT_TEST, null, msgs);
			msgs = basicSetDocumentTest(newDocumentTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TEST__DOCUMENT_TEST, newDocumentTest, newDocumentTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.TEST__INTERACTION_TEST:
				return basicSetInteractionTest(null, msgs);
			case Mif2Package.TEST__DOCUMENT_TEST:
				return basicSetDocumentTest(null, msgs);
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
			case Mif2Package.TEST__INTERACTION_TEST:
				return getInteractionTest();
			case Mif2Package.TEST__DOCUMENT_TEST:
				return getDocumentTest();
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
			case Mif2Package.TEST__INTERACTION_TEST:
				setInteractionTest((InteractionTest)newValue);
				return;
			case Mif2Package.TEST__DOCUMENT_TEST:
				setDocumentTest((DocumentTest)newValue);
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
			case Mif2Package.TEST__INTERACTION_TEST:
				setInteractionTest((InteractionTest)null);
				return;
			case Mif2Package.TEST__DOCUMENT_TEST:
				setDocumentTest((DocumentTest)null);
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
			case Mif2Package.TEST__INTERACTION_TEST:
				return interactionTest != null;
			case Mif2Package.TEST__DOCUMENT_TEST:
				return documentTest != null;
		}
		return super.eIsSet(featureID);
	}

} //TestImpl
