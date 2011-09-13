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
package org.openhealthtools.mdht.uml.cda;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Product#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Product#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Product#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Product#getManufacturedProduct <em>Manufactured Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Product#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Product#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends Participation {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Manufactured Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Product</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Product</em>' containment reference.
	 * @see #setManufacturedProduct(ManufacturedProduct)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct_ManufacturedProduct()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ManufacturedProduct getManufacturedProduct();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getManufacturedProduct <em>Manufactured Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Product</em>' containment reference.
	 * @see #getManufacturedProduct()
	 * @generated
	 */
	void setManufacturedProduct(ManufacturedProduct value);

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getNullFlavor <em>Null Flavor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Flavor</em>' attribute is set.
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	boolean isSetNullFlavor();

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The default value is <code>"PRD"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #setTypeCode(ParticipationType)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getProduct_TypeCode()
	 * @model default="PRD" unsettable="true" ordered="false"
	 * @generated
	 */
	ParticipationType getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(ParticipationType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ParticipationType)
	 * @generated
	 */
	void unsetTypeCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Product#getTypeCode <em>Type Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Code</em>' attribute is set.
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ParticipationType)
	 * @generated
	 */
	boolean isSetTypeCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isTypeCodeDefined() implies self.typeCode=vocab::ParticipationType::PRD
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isTypeCodeDefined() implies self.typeCode=vocab::ParticipationType::PRD'"
	 * @generated
	 */
	boolean validateTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Product
