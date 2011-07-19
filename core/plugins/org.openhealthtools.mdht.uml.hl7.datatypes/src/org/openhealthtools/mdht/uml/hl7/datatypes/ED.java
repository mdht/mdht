/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm;
import org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheck <em>Integrity Check</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface ED extends BIN {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="name='mixed' kind='elementWildcard'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(TEL)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_Reference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element'"
	 * @generated
	 */
	TEL getReference();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(TEL value);

	/**
	 * Returns the value of the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumbnail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail</em>' containment reference.
	 * @see #setThumbnail(ED)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_Thumbnail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element'"
	 * @generated
	 */
	ED getThumbnail();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getThumbnail <em>Thumbnail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail</em>' containment reference.
	 * @see #getThumbnail()
	 * @generated
	 */
	void setThumbnail(ED value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * The default value is <code>"text/plain"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #setMediaType(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_MediaType()
	 * @model default="text/plain" unsettable="true" dataType="org.openhealthtools.mdht.uml.hl7.datatypes.csType" ordered="false"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(String)
	 * @generated
	 */
	void unsetMediaType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType <em>Media Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Media Type</em>' attribute is set.
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(String)
	 * @generated
	 */
	boolean isSetMediaType();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_Language()
	 * @model dataType="org.openhealthtools.mdht.uml.hl7.datatypes.csType" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #setCompression(CompressionAlgorithm)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_Compression()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	CompressionAlgorithm getCompression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(CompressionAlgorithm value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompression()
	 * @see #getCompression()
	 * @see #setCompression(CompressionAlgorithm)
	 * @generated
	 */
	void unsetCompression();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getCompression <em>Compression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression</em>' attribute is set.
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @see #setCompression(CompressionAlgorithm)
	 * @generated
	 */
	boolean isSetCompression();

	/**
	 * Returns the value of the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrity Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Check</em>' attribute.
	 * @see #setIntegrityCheck(byte[])
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_IntegrityCheck()
	 * @model ordered="false"
	 * @generated
	 */
	byte[] getIntegrityCheck();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheck <em>Integrity Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Check</em>' attribute.
	 * @see #getIntegrityCheck()
	 * @generated
	 */
	void setIntegrityCheck(byte[] value);

	/**
	 * Returns the value of the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * The default value is <code>"SHA-1"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrity Check Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Check Algorithm</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm
	 * @see #isSetIntegrityCheckAlgorithm()
	 * @see #unsetIntegrityCheckAlgorithm()
	 * @see #setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_IntegrityCheckAlgorithm()
	 * @model default="SHA-1" unsettable="true" ordered="false"
	 * @generated
	 */
	IntegrityCheckAlgorithm getIntegrityCheckAlgorithm();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Check Algorithm</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm
	 * @see #isSetIntegrityCheckAlgorithm()
	 * @see #unsetIntegrityCheckAlgorithm()
	 * @see #getIntegrityCheckAlgorithm()
	 * @generated
	 */
	void setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntegrityCheckAlgorithm()
	 * @see #getIntegrityCheckAlgorithm()
	 * @see #setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm)
	 * @generated
	 */
	void unsetIntegrityCheckAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Integrity Check Algorithm</em>' attribute is set.
	 * @see #unsetIntegrityCheckAlgorithm()
	 * @see #getIntegrityCheckAlgorithm()
	 * @see #setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm)
	 * @generated
	 */
	boolean isSetIntegrityCheckAlgorithm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.thumbnail.oclIsUndefined() implies self.thumbnail.thumbnail.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.thumbnail.oclIsUndefined() implies self.thumbnail.thumbnail.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateThumbnailThumbnail(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" textRequired="true" textOrdered="false"
	 * @generated
	 */
	ED addText(String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getText();

} // ED
