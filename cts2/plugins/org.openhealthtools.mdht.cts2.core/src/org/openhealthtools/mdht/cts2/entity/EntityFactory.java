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
package org.openhealthtools.mdht.cts2.entity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage
 * @generated
 */
public interface EntityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EntityFactory eINSTANCE = org.openhealthtools.mdht.cts2.entity.impl.EntityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Annotation Property Description</em>'.
	 * @generated
	 */
	AnnotationPropertyDescription createAnnotationPropertyDescription();

	/**
	 * Returns a new object of class '<em>Anonymous Entity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Anonymous Entity Description</em>'.
	 * @generated
	 */
	AnonymousEntityDescription createAnonymousEntityDescription();

	/**
	 * Returns a new object of class '<em>Anonymous Individual Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Anonymous Individual Description</em>'.
	 * @generated
	 */
	AnonymousIndividualDescription createAnonymousIndividualDescription();

	/**
	 * Returns a new object of class '<em>Class Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Class Description</em>'.
	 * @generated
	 */
	ClassDescription createClassDescription();

	/**
	 * Returns a new object of class '<em>Data Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Property Description</em>'.
	 * @generated
	 */
	DataPropertyDescription createDataPropertyDescription();

	/**
	 * Returns a new object of class '<em>Data Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Type Description</em>'.
	 * @generated
	 */
	DataTypeDescription createDataTypeDescription();

	/**
	 * Returns a new object of class '<em>Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Designation</em>'.
	 * @generated
	 */
	Designation createDesignation();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	EntityDescription createEntityDescription();

	/**
	 * Returns a new object of class '<em>Description Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Description Msg</em>'.
	 * @generated
	 */
	EntityDescriptionMsg createEntityDescriptionMsg();

	/**
	 * Returns a new object of class '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Directory</em>'.
	 * @generated
	 */
	EntityDirectory createEntityDirectory();

	/**
	 * Returns a new object of class '<em>Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Directory Entry</em>'.
	 * @generated
	 */
	EntityDirectoryEntry createEntityDirectoryEntry();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	EntityList createEntityList();

	/**
	 * Returns a new object of class '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>List Entry</em>'.
	 * @generated
	 */
	EntityListEntry createEntityListEntry();

	/**
	 * Returns a new object of class '<em>Reference Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Reference Msg</em>'.
	 * @generated
	 */
	EntityReferenceMsg createEntityReferenceMsg();

	/**
	 * Returns a new object of class '<em>Named Entity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Entity Description</em>'.
	 * @generated
	 */
	NamedEntityDescription createNamedEntityDescription();

	/**
	 * Returns a new object of class '<em>Named Individual Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Individual Description</em>'.
	 * @generated
	 */
	NamedIndividualDescription createNamedIndividualDescription();

	/**
	 * Returns a new object of class '<em>Object Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Object Property Description</em>'.
	 * @generated
	 */
	ObjectPropertyDescription createObjectPropertyDescription();

	/**
	 * Returns a new object of class '<em>Predicate Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Predicate Description</em>'.
	 * @generated
	 */
	PredicateDescription createPredicateDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EntityPackage getEntityPackage();

} // EntityFactory
