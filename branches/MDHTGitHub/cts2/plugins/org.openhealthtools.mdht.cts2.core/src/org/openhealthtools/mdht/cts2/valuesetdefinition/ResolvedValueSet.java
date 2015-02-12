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
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Value Set</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The result of resolving a specific value set definition against a known set of code system versions. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ResolvedValueSet</i> consists of a header that carries sufficient information that
 * the resolution
 * operation would be repeatable and the result of the resolution, which consists of set of EntityReferences.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getResolutionInfo <em>Resolution Info</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSet()
 * @model extendedMetaData="name='ResolvedValueSet' kind='elementOnly'"
 * @generated
 */
public interface ResolvedValueSet extends EObject {
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
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSet_ResolutionInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resolutionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSetHeader getResolutionInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet#getResolutionInfo <em>Resolution Info</em>}'
	 * containment reference.
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
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.EntitySynopsis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a synopsis of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">EntityDescription</i> that has been determined to be a
	 * member of the value set named in <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">resolutionInfo</i> according to the stated
	 * criteria or "bindings"
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSet_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntitySynopsis> getMember();

} // ResolvedValueSet
