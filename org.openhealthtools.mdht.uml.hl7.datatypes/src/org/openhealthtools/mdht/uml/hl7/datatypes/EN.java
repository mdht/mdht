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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getDelimiters <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getFamilies <em>Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getGivens <em>Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getPrefixes <em>Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getSuffixes <em>Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getParts <em>Part</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getUses <em>Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getMixed <em>Mixed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface EN extends ANY {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse}.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse
	 * @see #isSetUses()
	 * @see #unsetUses()
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Use()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	EList<EntityNameUse> getUses();

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getUses <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUses()
	 * @see #getUses()
	 * @generated
	 */
	void unsetUses();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getUses <em>Use</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use</em>' attribute list is set.
	 * @see #unsetUses()
	 * @see #getUses()
	 * @generated
	 */
	boolean isSetUses();

	/**
	 * Returns the value of the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Time</em>' containment reference.
	 * @see #setValidTime(IVL_TS)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_ValidTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element'"
	 * @generated
	 */
	IVL_TS getValidTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getValidTime <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Time</em>' containment reference.
	 * @see #getValidTime()
	 * @generated
	 */
	void setValidTime(IVL_TS value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Delimiter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ENXP> getDelimiters();

	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Family()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ENXP> getFamilies();

	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Given()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ENXP> getGivens();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Prefix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ENXP> getPrefixes();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Suffix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="namespace='urn:hl7-org:v3' kind='element' group='#part'"
	 * @generated
	 */
	EList<ENXP> getSuffixes();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Part()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getParts();

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
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getEN_Mixed()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" ordered="false"
	 *        extendedMetaData="kind='elementWildcard'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.delimiter->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::DEL)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.delimiter->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::DEL)'"
	 * @generated
	 */
	boolean validateDelimiter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.family->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::FAM)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.family->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::FAM)'"
	 * @generated
	 */
	boolean validateFamily(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.given->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::GIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.given->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::GIV)'"
	 * @generated
	 */
	boolean validateGiven(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.prefix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::PFX)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.prefix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::PFX)'"
	 * @generated
	 */
	boolean validatePrefix(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.suffix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::SFX)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.suffix->forAll(enxp : datatypes::ENXP | enxp.partType = vocab::EntityNamePartType::SFX)'"
	 * @generated
	 */
	boolean validateSuffix(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" delimiterRequired="true" delimiterOrdered="false"
	 * @generated
	 */
	EN addDelimiter(String delimiter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" familyRequired="true" familyOrdered="false"
	 * @generated
	 */
	EN addFamily(String family);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" givenRequired="true" givenOrdered="false"
	 * @generated
	 */
	EN addGiven(String given);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" prefixRequired="true" prefixOrdered="false"
	 * @generated
	 */
	EN addPrefix(String prefix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" suffixRequired="true" suffixOrdered="false"
	 * @generated
	 */
	EN addSuffix(String suffix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" textRequired="true" textOrdered="false"
	 * @generated
	 */
	EN addText(String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getText();

} // EN
