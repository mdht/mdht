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

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getDefinedValueSet <em>Defined Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getVersionTag <em>Version Tag</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinition()
 * @model extendedMetaData="name='ValueSetDefinition' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefinition extends ResourceVersionDescription {
	/**
	 * Returns the value of the '<em><b>Defined Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the value set being defined
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Defined Value Set</em>' containment reference.
	 * @see #setDefinedValueSet(ValueSetReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinition_DefinedValueSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetReference getDefinedValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition#getDefinedValueSet
	 * <em>Defined Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Defined Value Set</em>' containment reference.
	 * @see #getDefinedValueSet()
	 * @generated
	 */
	void setDefinedValueSet(ValueSetReference value);

	/**
	 * Returns the value of the '<em><b>Version Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.VersionTagReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a version tag assigned to this definition by the implementing service
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Version Tag</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinition_VersionTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionTag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionTagReference> getVersionTag();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinition_Entry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetDefinitionEntry> getEntry();

} // ValueSetDefinition
