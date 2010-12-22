/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.EDOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm;
import org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getIntegrityCheck <em>Integrity Check</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDImpl extends BINImpl implements ED {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final CompressionAlgorithm COMPRESSION_EDEFAULT = CompressionAlgorithm.DF;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected CompressionAlgorithm compression = COMPRESSION_EDEFAULT;

	/**
	 * This is true if the Compression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionESet;

	/**
	 * The default value of the '{@link #getIntegrityCheck() <em>Integrity Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheck()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] INTEGRITY_CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrityCheck() <em>Integrity Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheck()
	 * @generated
	 * @ordered
	 */
	protected byte[] integrityCheck = INTEGRITY_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrityCheckAlgorithm() <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheckAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityCheckAlgorithm INTEGRITY_CHECK_ALGORITHM_EDEFAULT = IntegrityCheckAlgorithm.SHA1;

	/**
	 * The cached value of the '{@link #getIntegrityCheckAlgorithm() <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheckAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected IntegrityCheckAlgorithm integrityCheckAlgorithm = INTEGRITY_CHECK_ALGORITHM_EDEFAULT;

	/**
	 * This is true if the Integrity Check Algorithm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean integrityCheckAlgorithmESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.ED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DatatypesPackage.ED__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEL getReference() {
		return (TEL)getMixed().get(DatatypesPackage.Literals.ED__REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(TEL newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatatypesPackage.Literals.ED__REFERENCE, newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(TEL newReference) {
		((FeatureMap.Internal)getMixed()).set(DatatypesPackage.Literals.ED__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getThumbnail() {
		return (ED)getMixed().get(DatatypesPackage.Literals.ED__THUMBNAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThumbnail(ED newThumbnail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DatatypesPackage.Literals.ED__THUMBNAIL, newThumbnail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnail(ED newThumbnail) {
		((FeatureMap.Internal)getMixed()).set(DatatypesPackage.Literals.ED__THUMBNAIL, newThumbnail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ED__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ED__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionAlgorithm getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompression(CompressionAlgorithm newCompression) {
		CompressionAlgorithm oldCompression = compression;
		compression = newCompression == null ? COMPRESSION_EDEFAULT : newCompression;
		boolean oldCompressionESet = compressionESet;
		compressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ED__COMPRESSION, oldCompression, compression, !oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompression() {
		CompressionAlgorithm oldCompression = compression;
		boolean oldCompressionESet = compressionESet;
		compression = COMPRESSION_EDEFAULT;
		compressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatatypesPackage.ED__COMPRESSION, oldCompression, COMPRESSION_EDEFAULT, oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompression() {
		return compressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getIntegrityCheck() {
		return integrityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCheck(byte[] newIntegrityCheck) {
		byte[] oldIntegrityCheck = integrityCheck;
		integrityCheck = newIntegrityCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ED__INTEGRITY_CHECK, oldIntegrityCheck, integrityCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityCheckAlgorithm getIntegrityCheckAlgorithm() {
		return integrityCheckAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm newIntegrityCheckAlgorithm) {
		IntegrityCheckAlgorithm oldIntegrityCheckAlgorithm = integrityCheckAlgorithm;
		integrityCheckAlgorithm = newIntegrityCheckAlgorithm == null ? INTEGRITY_CHECK_ALGORITHM_EDEFAULT : newIntegrityCheckAlgorithm;
		boolean oldIntegrityCheckAlgorithmESet = integrityCheckAlgorithmESet;
		integrityCheckAlgorithmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ED__INTEGRITY_CHECK_ALGORITHM, oldIntegrityCheckAlgorithm, integrityCheckAlgorithm, !oldIntegrityCheckAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntegrityCheckAlgorithm() {
		IntegrityCheckAlgorithm oldIntegrityCheckAlgorithm = integrityCheckAlgorithm;
		boolean oldIntegrityCheckAlgorithmESet = integrityCheckAlgorithmESet;
		integrityCheckAlgorithm = INTEGRITY_CHECK_ALGORITHM_EDEFAULT;
		integrityCheckAlgorithmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatatypesPackage.ED__INTEGRITY_CHECK_ALGORITHM, oldIntegrityCheckAlgorithm, INTEGRITY_CHECK_ALGORITHM_EDEFAULT, oldIntegrityCheckAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntegrityCheckAlgorithm() {
		return integrityCheckAlgorithmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED addText(String text) {
		return EDOperations.addText(this, text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return EDOperations.getText(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.ED__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case DatatypesPackage.ED__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DatatypesPackage.ED__REFERENCE:
				return getReference();
			case DatatypesPackage.ED__THUMBNAIL:
				return getThumbnail();
			case DatatypesPackage.ED__MEDIA_TYPE:
				return getMediaType();
			case DatatypesPackage.ED__LANGUAGE:
				return getLanguage();
			case DatatypesPackage.ED__COMPRESSION:
				return getCompression();
			case DatatypesPackage.ED__INTEGRITY_CHECK:
				return getIntegrityCheck();
			case DatatypesPackage.ED__INTEGRITY_CHECK_ALGORITHM:
				return getIntegrityCheckAlgorithm();
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
			case DatatypesPackage.ED__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DatatypesPackage.ED__REFERENCE:
				setReference((TEL)newValue);
				return;
			case DatatypesPackage.ED__THUMBNAIL:
				setThumbnail((ED)newValue);
				return;
			case DatatypesPackage.ED__MEDIA_TYPE:
				setMediaType((String)newValue);
				return;
			case DatatypesPackage.ED__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case DatatypesPackage.ED__COMPRESSION:
				setCompression((CompressionAlgorithm)newValue);
				return;
			case DatatypesPackage.ED__INTEGRITY_CHECK:
				setIntegrityCheck((byte[])newValue);
				return;
			case DatatypesPackage.ED__INTEGRITY_CHECK_ALGORITHM:
				setIntegrityCheckAlgorithm((IntegrityCheckAlgorithm)newValue);
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
			case DatatypesPackage.ED__MIXED:
				getMixed().clear();
				return;
			case DatatypesPackage.ED__REFERENCE:
				setReference((TEL)null);
				return;
			case DatatypesPackage.ED__THUMBNAIL:
				setThumbnail((ED)null);
				return;
			case DatatypesPackage.ED__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
				return;
			case DatatypesPackage.ED__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DatatypesPackage.ED__COMPRESSION:
				unsetCompression();
				return;
			case DatatypesPackage.ED__INTEGRITY_CHECK:
				setIntegrityCheck(INTEGRITY_CHECK_EDEFAULT);
				return;
			case DatatypesPackage.ED__INTEGRITY_CHECK_ALGORITHM:
				unsetIntegrityCheckAlgorithm();
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
			case DatatypesPackage.ED__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DatatypesPackage.ED__REFERENCE:
				return getReference() != null;
			case DatatypesPackage.ED__THUMBNAIL:
				return getThumbnail() != null;
			case DatatypesPackage.ED__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
			case DatatypesPackage.ED__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DatatypesPackage.ED__COMPRESSION:
				return isSetCompression();
			case DatatypesPackage.ED__INTEGRITY_CHECK:
				return INTEGRITY_CHECK_EDEFAULT == null ? integrityCheck != null : !INTEGRITY_CHECK_EDEFAULT.equals(integrityCheck);
			case DatatypesPackage.ED__INTEGRITY_CHECK_ALGORITHM:
				return isSetIntegrityCheckAlgorithm();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(", language: ");
		result.append(language);
		result.append(", compression: ");
		if (compressionESet) result.append(compression); else result.append("<unset>");
		result.append(", integrityCheck: ");
		result.append(integrityCheck);
		result.append(", integrityCheckAlgorithm: ");
		if (integrityCheckAlgorithmESet) result.append(integrityCheckAlgorithm); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EDImpl
