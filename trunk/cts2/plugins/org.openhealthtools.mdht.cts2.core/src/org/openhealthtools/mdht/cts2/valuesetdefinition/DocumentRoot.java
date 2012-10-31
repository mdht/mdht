/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getIteratableResolvedValueSet <em>Iteratable Resolved Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSet <em>Resolved Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetDirectory <em>Resolved Value Set Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetMsg <em>Resolved Value Set Msg</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetSummary <em>Resolved Value Set Summary</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionDirectory <em>Value Set Definition Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionEntry <em>Value Set Definition Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionList <em>Value Set Definition List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionMsg <em>Value Set Definition Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Iteratable Resolved Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteratable Resolved Value Set</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Iteratable Resolved Value Set</em>' containment reference.
	 * @see #setIteratableResolvedValueSet(IteratableResolvedValueSet)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_IteratableResolvedValueSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IteratableResolvedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	IteratableResolvedValueSet getIteratableResolvedValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getIteratableResolvedValueSet
	 * <em>Iteratable Resolved Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Iteratable Resolved Value Set</em>' containment reference.
	 * @see #getIteratableResolvedValueSet()
	 * @generated
	 */
	void setIteratableResolvedValueSet(IteratableResolvedValueSet value);

	/**
	 * Returns the value of the '<em><b>Resolved Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of resolving a specific value set definition against a known set of code system versions. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ResolvedValueSet</i> consists of a header that carries sufficient information
	 * that the resolution
	 * operation would be repeatable and the result of the resolution, which consists of set of EntityReferences.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resolved Value Set</em>' containment reference.
	 * @see #setResolvedValueSet(ResolvedValueSet)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ResolvedValueSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResolvedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSet getResolvedValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSet <em>Resolved Value Set</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Value Set</em>' containment reference.
	 * @see #getResolvedValueSet()
	 * @generated
	 */
	void setResolvedValueSet(ResolvedValueSet value);

	/**
	 * Returns the value of the '<em><b>Resolved Value Set Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Value Set Directory</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved Value Set Directory</em>' containment reference.
	 * @see #setResolvedValueSetDirectory(ResolvedValueSetDirectory)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ResolvedValueSetDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResolvedValueSetDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSetDirectory getResolvedValueSetDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetDirectory
	 * <em>Resolved Value Set Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Value Set Directory</em>' containment reference.
	 * @see #getResolvedValueSetDirectory()
	 * @generated
	 */
	void setResolvedValueSetDirectory(ResolvedValueSetDirectory value);

	/**
	 * Returns the value of the '<em><b>Resolved Value Set Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Value Set Msg</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved Value Set Msg</em>' containment reference.
	 * @see #setResolvedValueSetMsg(ResolvedValueSetMsg)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ResolvedValueSetMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResolvedValueSetMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSetMsg getResolvedValueSetMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetMsg
	 * <em>Resolved Value Set Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Value Set Msg</em>' containment reference.
	 * @see #getResolvedValueSetMsg()
	 * @generated
	 */
	void setResolvedValueSetMsg(ResolvedValueSetMsg value);

	/**
	 * Returns the value of the '<em><b>Resolved Value Set Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Value Set Summary</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved Value Set Summary</em>' containment reference.
	 * @see #setResolvedValueSetSummary(ResolvedValueSetSummary)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ResolvedValueSetSummary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResolvedValueSetSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSetSummary getResolvedValueSetSummary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getResolvedValueSetSummary
	 * <em>Resolved Value Set Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Value Set Summary</em>' containment reference.
	 * @see #getResolvedValueSetSummary()
	 * @generated
	 */
	void setResolvedValueSetSummary(ResolvedValueSetSummary value);

	/**
	 * Returns the value of the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #setValueSetDefinition(ValueSetDefinition)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ValueSetDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinition getValueSetDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinition
	 * <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	void setValueSetDefinition(ValueSetDefinition value);

	/**
	 * Returns the value of the '<em><b>Value Set Definition Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition Directory</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition Directory</em>' containment reference.
	 * @see #setValueSetDefinitionDirectory(ValueSetDefinitionDirectory)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ValueSetDefinitionDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetDefinitionDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionDirectory getValueSetDefinitionDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionDirectory
	 * <em>Value Set Definition Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition Directory</em>' containment reference.
	 * @see #getValueSetDefinitionDirectory()
	 * @generated
	 */
	void setValueSetDefinitionDirectory(ValueSetDefinitionDirectory value);

	/**
	 * Returns the value of the '<em><b>Value Set Definition Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element of a value set definition that, when resolved yields a set of entity references that are to be included in, excluded from or
	 * intersected with the set of elements that represent the full resolution of
	 * the definition.Note that only <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ACTIVE</i> entity references are included. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">INACTIVE</i> entity references may never be considered for inclusion or
	 * exclusion in the resolution of a value set definition.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition Entry</em>' containment reference.
	 * @see #setValueSetDefinitionEntry(ValueSetDefinitionEntry)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ValueSetDefinitionEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetDefinitionEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionEntry getValueSetDefinitionEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionEntry
	 * <em>Value Set Definition Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition Entry</em>' containment reference.
	 * @see #getValueSetDefinitionEntry()
	 * @generated
	 */
	void setValueSetDefinitionEntry(ValueSetDefinitionEntry value);

	/**
	 * Returns the value of the '<em><b>Value Set Definition List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition List</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition List</em>' containment reference.
	 * @see #setValueSetDefinitionList(ValueSetDefinitionList)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ValueSetDefinitionList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetDefinitionList' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionList getValueSetDefinitionList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionList
	 * <em>Value Set Definition List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition List</em>' containment reference.
	 * @see #getValueSetDefinitionList()
	 * @generated
	 */
	void setValueSetDefinitionList(ValueSetDefinitionList value);

	/**
	 * Returns the value of the '<em><b>Value Set Definition Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition Msg</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition Msg</em>' containment reference.
	 * @see #setValueSetDefinitionMsg(ValueSetDefinitionMsg)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getDocumentRoot_ValueSetDefinitionMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetDefinitionMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionMsg getValueSetDefinitionMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot#getValueSetDefinitionMsg
	 * <em>Value Set Definition Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition Msg</em>' containment reference.
	 * @see #getValueSetDefinitionMsg()
	 * @generated
	 */
	void setValueSetDefinitionMsg(ValueSetDefinitionMsg value);

} // DocumentRoot
