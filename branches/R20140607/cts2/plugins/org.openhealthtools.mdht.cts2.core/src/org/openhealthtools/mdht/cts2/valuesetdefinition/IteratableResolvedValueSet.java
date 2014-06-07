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
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteratable Resolved Value Set</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A ResolvedValueSet whose contents are available as a set of directory entries that allows iteration.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getResolutionInfo <em>Resolution Info</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getIteratableResolvedValueSet()
 * @model extendedMetaData="name='IteratableResolvedValueSet' kind='elementOnly'"
 * @generated
 */
public interface IteratableResolvedValueSet extends Directory {
	/**
	 * Returns the value of the '<em><b>Resolution Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of parameters that were used in the resolution of this set. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">resolutionInfo</i> provides all the information necessary to recreate the actual
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">resolution</i> when presented to a
	 * CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">2</sub> service instance that contains all of the necessary definitions
	 * and code system versions.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resolution Info</em>' containment reference.
	 * @see #setResolutionInfo(ResolvedValueSetHeader)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getIteratableResolvedValueSet_ResolutionInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resolutionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSetHeader getResolutionInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet#getResolutionInfo
	 * <em>Resolution Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolution Info</em>' containment reference.
	 * @see #getResolutionInfo()
	 * @generated
	 */
	void setResolutionInfo(ResolvedValueSetHeader value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.EntitySynopsis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a synopsis of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">EntityDescription</i> that has been determined to be a
	 * member of the value set named in <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">resolutionInfo</i> according to the stated
	 * criteria or "bindings"
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getIteratableResolvedValueSet_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntitySynopsis> getEntry();

} // IteratableResolvedValueSet
