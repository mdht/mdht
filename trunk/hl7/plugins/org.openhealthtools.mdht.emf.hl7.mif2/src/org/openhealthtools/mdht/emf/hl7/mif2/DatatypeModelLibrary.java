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
 * A representation of the model object '<em><b>Datatype Model Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for datatype definitions
 * UML: DatatypeModelLibrary stereotype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getImportDatatypeModelLibrary <em>Import Datatype Model Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getImportAnnotationLibrary <em>Import Annotation Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeModelLibrary()
 * @model extendedMetaData="name='DatatypeModelLibrary' kind='elementOnly'"
 * @generated
 */
public interface DatatypeModelLibrary extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Imported Vocabulary Model Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vocabulary model that is used by this model
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Vocabulary Model Package</em>' containment reference.
	 * @see #setImportedVocabularyModelPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeModelLibrary_ImportedVocabularyModelPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedVocabularyModelPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportedVocabularyModelPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Vocabulary Model Package</em>' containment reference.
	 * @see #getImportedVocabularyModelPackage()
	 * @generated
	 */
	void setImportedVocabularyModelPackage(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Import Datatype Model Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any datatype model that is extended by the current model.  This would be used for "local" datatype models that add additional datatype flavors.  If no specific datatypes are referred to, then all are imported, otherwise only those listed are imported
	 * UML: supplier association to Import stereotype of a Permission dependency to another DatatypeModelLibrary
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Datatype Model Library</em>' containment reference.
	 * @see #setImportDatatypeModelLibrary(ImportDatatypeModelLibrary)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeModelLibrary_ImportDatatypeModelLibrary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importDatatypeModelLibrary' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportDatatypeModelLibrary getImportDatatypeModelLibrary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getImportDatatypeModelLibrary <em>Import Datatype Model Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Datatype Model Library</em>' containment reference.
	 * @see #getImportDatatypeModelLibrary()
	 * @generated
	 */
	void setImportDatatypeModelLibrary(ImportDatatypeModelLibrary value);

	/**
	 * Returns the value of the '<em><b>Import Annotation Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the annotation library that is used to supplement the annotations defined in this model.  Annotations in this model with no 'cascade' information take precedence over annotations defined in the annoation library
	 * UML: AnnotationLibrary package that is imported into the model package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Annotation Library</em>' containment reference.
	 * @see #setImportAnnotationLibrary(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeModelLibrary_ImportAnnotationLibrary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importAnnotationLibrary' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportAnnotationLibrary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary#getImportAnnotationLibrary <em>Import Annotation Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Annotation Library</em>' containment reference.
	 * @see #getImportAnnotationLibrary()
	 * @generated
	 */
	void setImportAnnotationLibrary(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists all of the datatypes defined in the current model.
	 * UML: The ownedElement relationship to the DatatypeDefinitions in the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeModelLibrary_Datatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Datatype> getDatatype();

} // DatatypeModelLibrary
