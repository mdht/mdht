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
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Entity List</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * a list of specific entity references that are to be included in the definition. When specified in this form, the service must include all entities
 * in this list whether they are known to the service or not, and
 * whether they are currently <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ACTIVE</i> or not.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList#getReferencedEntity <em>Referenced Entity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getSpecificEntityList()
 * @model extendedMetaData="name='SpecificEntityList' kind='elementOnly'"
 * @generated
 */
public interface SpecificEntityList extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.URIAndEntityName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the namespace / name or URI of an entity to be included
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Referenced Entity</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getSpecificEntityList_ReferencedEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencedEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URIAndEntityName> getReferencedEntity();

} // SpecificEntityList
