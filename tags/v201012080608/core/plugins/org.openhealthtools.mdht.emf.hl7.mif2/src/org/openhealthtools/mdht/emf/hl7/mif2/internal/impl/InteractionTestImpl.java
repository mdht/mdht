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

import org.openhealthtools.mdht.emf.hl7.mif2.ExampleType;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionTestImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionTestImpl#getExampleContent <em>Example Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionTestImpl#getExampleFile <em>Example File</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionTestImpl#getReceivingSystem <em>Receiving System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.InteractionTestImpl#getSendingSystem <em>Sending System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionTestImpl extends TestBaseImpl implements InteractionTest {
	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected PackageOrArtifactRef interaction;

	/**
	 * The cached value of the '{@link #getExampleContent() <em>Example Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleContent()
	 * @generated
	 * @ordered
	 */
	protected ExampleType exampleContent;

	/**
	 * The default value of the '{@link #getExampleFile() <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExampleFile() <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFile()
	 * @generated
	 * @ordered
	 */
	protected String exampleFile = EXAMPLE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivingSystem() <em>Receiving System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingSystem() <em>Receiving System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingSystem()
	 * @generated
	 * @ordered
	 */
	protected String receivingSystem = RECEIVING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendingSystem() <em>Sending System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendingSystem() <em>Sending System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingSystem()
	 * @generated
	 * @ordered
	 */
	protected String sendingSystem = SENDING_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.INTERACTION_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(PackageOrArtifactRef newInteraction, NotificationChain msgs) {
		PackageOrArtifactRef oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__INTERACTION, oldInteraction, newInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(PackageOrArtifactRef newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_TEST__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_TEST__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleType getExampleContent() {
		return exampleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleContent(ExampleType newExampleContent, NotificationChain msgs) {
		ExampleType oldExampleContent = exampleContent;
		exampleContent = newExampleContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT, oldExampleContent, newExampleContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleContent(ExampleType newExampleContent) {
		if (newExampleContent != exampleContent) {
			NotificationChain msgs = null;
			if (exampleContent != null)
				msgs = ((InternalEObject)exampleContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT, null, msgs);
			if (newExampleContent != null)
				msgs = ((InternalEObject)newExampleContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT, null, msgs);
			msgs = basicSetExampleContent(newExampleContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT, newExampleContent, newExampleContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExampleFile() {
		return exampleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleFile(String newExampleFile) {
		String oldExampleFile = exampleFile;
		exampleFile = newExampleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__EXAMPLE_FILE, oldExampleFile, exampleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceivingSystem() {
		return receivingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingSystem(String newReceivingSystem) {
		String oldReceivingSystem = receivingSystem;
		receivingSystem = newReceivingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__RECEIVING_SYSTEM, oldReceivingSystem, receivingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendingSystem() {
		return sendingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingSystem(String newSendingSystem) {
		String oldSendingSystem = sendingSystem;
		sendingSystem = newSendingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INTERACTION_TEST__SENDING_SYSTEM, oldSendingSystem, sendingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.INTERACTION_TEST__INTERACTION:
				return basicSetInteraction(null, msgs);
			case Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT:
				return basicSetExampleContent(null, msgs);
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
			case Mif2Package.INTERACTION_TEST__INTERACTION:
				return getInteraction();
			case Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT:
				return getExampleContent();
			case Mif2Package.INTERACTION_TEST__EXAMPLE_FILE:
				return getExampleFile();
			case Mif2Package.INTERACTION_TEST__RECEIVING_SYSTEM:
				return getReceivingSystem();
			case Mif2Package.INTERACTION_TEST__SENDING_SYSTEM:
				return getSendingSystem();
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
			case Mif2Package.INTERACTION_TEST__INTERACTION:
				setInteraction((PackageOrArtifactRef)newValue);
				return;
			case Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT:
				setExampleContent((ExampleType)newValue);
				return;
			case Mif2Package.INTERACTION_TEST__EXAMPLE_FILE:
				setExampleFile((String)newValue);
				return;
			case Mif2Package.INTERACTION_TEST__RECEIVING_SYSTEM:
				setReceivingSystem((String)newValue);
				return;
			case Mif2Package.INTERACTION_TEST__SENDING_SYSTEM:
				setSendingSystem((String)newValue);
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
			case Mif2Package.INTERACTION_TEST__INTERACTION:
				setInteraction((PackageOrArtifactRef)null);
				return;
			case Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT:
				setExampleContent((ExampleType)null);
				return;
			case Mif2Package.INTERACTION_TEST__EXAMPLE_FILE:
				setExampleFile(EXAMPLE_FILE_EDEFAULT);
				return;
			case Mif2Package.INTERACTION_TEST__RECEIVING_SYSTEM:
				setReceivingSystem(RECEIVING_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.INTERACTION_TEST__SENDING_SYSTEM:
				setSendingSystem(SENDING_SYSTEM_EDEFAULT);
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
			case Mif2Package.INTERACTION_TEST__INTERACTION:
				return interaction != null;
			case Mif2Package.INTERACTION_TEST__EXAMPLE_CONTENT:
				return exampleContent != null;
			case Mif2Package.INTERACTION_TEST__EXAMPLE_FILE:
				return EXAMPLE_FILE_EDEFAULT == null ? exampleFile != null : !EXAMPLE_FILE_EDEFAULT.equals(exampleFile);
			case Mif2Package.INTERACTION_TEST__RECEIVING_SYSTEM:
				return RECEIVING_SYSTEM_EDEFAULT == null ? receivingSystem != null : !RECEIVING_SYSTEM_EDEFAULT.equals(receivingSystem);
			case Mif2Package.INTERACTION_TEST__SENDING_SYSTEM:
				return SENDING_SYSTEM_EDEFAULT == null ? sendingSystem != null : !SENDING_SYSTEM_EDEFAULT.equals(sendingSystem);
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
		result.append(" (exampleFile: ");
		result.append(exampleFile);
		result.append(", receivingSystem: ");
		result.append(receivingSystem);
		result.append(", sendingSystem: ");
		result.append(sendingSystem);
		result.append(')');
		return result.toString();
	}

} //InteractionTestImpl
