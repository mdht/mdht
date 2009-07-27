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
package org.openhealthtools.mdht.uml.hl7.datatypes;

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
	 * @model containment="true" ordered="false"
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
	 * @model containment="true" ordered="false"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getED_MediaType()
	 * @model ordered="false"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

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
	 * @model ordered="false"
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
	 * @model unsettable="true" ordered="false"
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
