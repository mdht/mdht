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

import org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest;
import org.openhealthtools.mdht.emf.hl7.mif2.ExampleType;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentTestImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentTestImpl#getExampleContent <em>Example Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentTestImpl#getConsumingSystem <em>Consuming System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentTestImpl#getCreatingSystem <em>Creating System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentTestImpl#getExampleFile <em>Example File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentTestImpl extends TestBaseImpl implements DocumentTest {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected PackageOrArtifactRef document;

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
	 * The default value of the '{@link #getConsumingSystem() <em>Consuming System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumingSystem() <em>Consuming System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumingSystem()
	 * @generated
	 * @ordered
	 */
	protected String consumingSystem = CONSUMING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatingSystem() <em>Creating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatingSystem() <em>Creating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingSystem()
	 * @generated
	 * @ordered
	 */
	protected String creatingSystem = CREATING_SYSTEM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOCUMENT_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(PackageOrArtifactRef newDocument, NotificationChain msgs) {
		PackageOrArtifactRef oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(PackageOrArtifactRef newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_TEST__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_TEST__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__DOCUMENT, newDocument, newDocument));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT, oldExampleContent, newExampleContent);
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
				msgs = ((InternalEObject)exampleContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT, null, msgs);
			if (newExampleContent != null)
				msgs = ((InternalEObject)newExampleContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT, null, msgs);
			msgs = basicSetExampleContent(newExampleContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT, newExampleContent, newExampleContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumingSystem() {
		return consumingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumingSystem(String newConsumingSystem) {
		String oldConsumingSystem = consumingSystem;
		consumingSystem = newConsumingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__CONSUMING_SYSTEM, oldConsumingSystem, consumingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatingSystem() {
		return creatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingSystem(String newCreatingSystem) {
		String oldCreatingSystem = creatingSystem;
		creatingSystem = newCreatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__CREATING_SYSTEM, oldCreatingSystem, creatingSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DOCUMENT_TEST__EXAMPLE_FILE, oldExampleFile, exampleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DOCUMENT_TEST__DOCUMENT:
				return basicSetDocument(null, msgs);
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT:
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
			case Mif2Package.DOCUMENT_TEST__DOCUMENT:
				return getDocument();
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT:
				return getExampleContent();
			case Mif2Package.DOCUMENT_TEST__CONSUMING_SYSTEM:
				return getConsumingSystem();
			case Mif2Package.DOCUMENT_TEST__CREATING_SYSTEM:
				return getCreatingSystem();
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_FILE:
				return getExampleFile();
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
			case Mif2Package.DOCUMENT_TEST__DOCUMENT:
				setDocument((PackageOrArtifactRef)newValue);
				return;
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT:
				setExampleContent((ExampleType)newValue);
				return;
			case Mif2Package.DOCUMENT_TEST__CONSUMING_SYSTEM:
				setConsumingSystem((String)newValue);
				return;
			case Mif2Package.DOCUMENT_TEST__CREATING_SYSTEM:
				setCreatingSystem((String)newValue);
				return;
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_FILE:
				setExampleFile((String)newValue);
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
			case Mif2Package.DOCUMENT_TEST__DOCUMENT:
				setDocument((PackageOrArtifactRef)null);
				return;
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT:
				setExampleContent((ExampleType)null);
				return;
			case Mif2Package.DOCUMENT_TEST__CONSUMING_SYSTEM:
				setConsumingSystem(CONSUMING_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.DOCUMENT_TEST__CREATING_SYSTEM:
				setCreatingSystem(CREATING_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_FILE:
				setExampleFile(EXAMPLE_FILE_EDEFAULT);
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
			case Mif2Package.DOCUMENT_TEST__DOCUMENT:
				return document != null;
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_CONTENT:
				return exampleContent != null;
			case Mif2Package.DOCUMENT_TEST__CONSUMING_SYSTEM:
				return CONSUMING_SYSTEM_EDEFAULT == null ? consumingSystem != null : !CONSUMING_SYSTEM_EDEFAULT.equals(consumingSystem);
			case Mif2Package.DOCUMENT_TEST__CREATING_SYSTEM:
				return CREATING_SYSTEM_EDEFAULT == null ? creatingSystem != null : !CREATING_SYSTEM_EDEFAULT.equals(creatingSystem);
			case Mif2Package.DOCUMENT_TEST__EXAMPLE_FILE:
				return EXAMPLE_FILE_EDEFAULT == null ? exampleFile != null : !EXAMPLE_FILE_EDEFAULT.equals(exampleFile);
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
		result.append(" (consumingSystem: ");
		result.append(consumingSystem);
		result.append(", creatingSystem: ");
		result.append(creatingSystem);
		result.append(", exampleFile: ");
		result.append(exampleFile);
		result.append(')');
		return result.toString();
	}

} //DocumentTestImpl
