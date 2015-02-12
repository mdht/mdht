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
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A synopsis of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ValueSetDefinition</i> along with information about how to access
 * the complete resource.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getDefinedValueSet <em>Defined Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getVersionTag <em>Version Tag</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionDirectoryEntry()
 * @model extendedMetaData="name='ValueSetDefinitionDirectoryEntry' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefinitionDirectoryEntry extends ResourceVersionDescriptionDirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Defined Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the value set that this definition applies to
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Defined Value Set</em>' containment reference.
	 * @see #setDefinedValueSet(ValueSetReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionDirectoryEntry_DefinedValueSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetReference getDefinedValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry#getDefinedValueSet
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
	 * a version tag assigned to this entry by the service instance
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Version Tag</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionDirectoryEntry_VersionTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionTag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionTagReference> getVersionTag();

} // ValueSetDefinitionDirectoryEntry
