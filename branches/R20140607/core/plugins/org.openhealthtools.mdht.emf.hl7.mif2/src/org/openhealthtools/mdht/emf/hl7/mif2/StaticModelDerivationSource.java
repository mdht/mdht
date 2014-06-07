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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Model Derivation Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A Derivation stereotype to a StaticModel
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivationSource#getSourceStaticModel <em>Source Static Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelDerivationSource()
 * @model extendedMetaData="name='StaticModelDerivationSource' kind='elementOnly'"
 * @generated
 */
public interface StaticModelDerivationSource extends Derivation {
	/**
	 * Returns the value of the '<em><b>Source Static Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package name of the static model derived from the current model.
	 * UML: Absolute package path (using package names)to the client model on the derivationSupplier dependency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Static Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelDerivationSource_SourceStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getSourceStaticModel();

} // StaticModelDerivationSource
