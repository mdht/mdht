/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Code Refs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an enumeration of codes from a valueset
 * UML: Part of a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRefs#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRefs()
 * @model extendedMetaData="name='VocabularyCodeRefs' kind='elementOnly'"
 * @generated
 */
public interface VocabularyCodeRefs extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a single sample code
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRefs_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyCodeRef> getCode();

} // VocabularyCodeRefs
