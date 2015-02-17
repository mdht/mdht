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
 * A representation of the model object '<em><b>Static Model Interface Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A package of Common Model Element interfaces that can be imported into StaticModels for reference
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage#getImportStaticModelInterfacePackage <em>Import Static Model Interface Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage#getCommonModelElementDefinition <em>Common Model Element Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage#getStubDefinition <em>Stub Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelInterfacePackage()
 * @model extendedMetaData="name='StaticModelInterfacePackage' kind='elementOnly'"
 * @generated
 */
public interface StaticModelInterfacePackage extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Imported Vocabulary Model Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vocabulary model that is used in defining the interfaces by this model
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Vocabulary Model Package</em>' containment reference.
	 * @see #setImportedVocabularyModelPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelInterfacePackage_ImportedVocabularyModelPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedVocabularyModelPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportedVocabularyModelPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Vocabulary Model Package</em>' containment reference.
	 * @see #getImportedVocabularyModelPackage()
	 * @generated
	 */
	void setImportedVocabularyModelPackage(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Import Static Model Interface Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies other static model interface packages that are being 'included' in the current one.  Packages are processed in the order listed, with dulicate context interfaces in subsequent packages (or the current package) overriding interfaces imported from prior packages.  I.e. later imports and the current package take priority over prior imports.
	 * UML: Another Static Model Interface package that is imported into the current package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Static Model Interface Package</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelInterfacePackage_ImportStaticModelInterfacePackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importStaticModelInterfacePackage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactDependency> getImportStaticModelInterfacePackage();

	/**
	 * Returns the value of the '<em><b>Common Model Element Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of the CMET definitions included in the static model interface package
	 * UML: Bound interfaces defined within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Model Element Definition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelInterfacePackage_CommonModelElementDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commonModelElementDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommonModelElementDefinition> getCommonModelElementDefinition();

	/**
	 * Returns the value of the '<em><b>Stub Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of the stub definitions included in the static model interface package
	 * UML: Unbound interfaces defined within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stub Definition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelInterfacePackage_StubDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stubDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StubDefinition> getStubDefinition();

} // StaticModelInterfacePackage
