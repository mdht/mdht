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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to make absoloute references to other packages.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getCombinedId <em>Combined Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getRoot <em>Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSection <em>Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSubArtifact <em>Sub Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSubSection <em>Sub Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef()
 * @model extendedMetaData="name='PackageRef' kind='empty'"
 * @generated
 */
public interface PackageRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the category of the artifacts in the package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactKind
	 * @see #isSetArtifact()
	 * @see #unsetArtifact()
	 * @see #setArtifact(ArtifactKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Artifact()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='artifact'"
	 * @generated
	 */
	ArtifactKind getArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactKind
	 * @see #isSetArtifact()
	 * @see #unsetArtifact()
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(ArtifactKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArtifact()
	 * @see #getArtifact()
	 * @see #setArtifact(ArtifactKind)
	 * @generated
	 */
	void unsetArtifact();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getArtifact <em>Artifact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Artifact</em>' attribute is set.
	 * @see #unsetArtifact()
	 * @see #getArtifact()
	 * @see #setArtifact(ArtifactKind)
	 * @generated
	 */
	boolean isSetArtifact();

	/**
	 * Returns the value of the '<em><b>Combined Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concatenated "complete" identifier for the package including all packages in the package hierarchy
	 * UML: tag made of concatenated package names for entire package hierarchy.
	 * Derive: Todo - concatenate the other id parts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Id</em>' attribute.
	 * @see #setCombinedId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_CombinedId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.CollapsedPackageId"
	 *        extendedMetaData="kind='attribute' name='combinedId'"
	 * @generated
	 */
	String getCombinedId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getCombinedId <em>Combined Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Id</em>' attribute.
	 * @see #getCombinedId()
	 * @generated
	 */
	void setCombinedId(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DomainKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the domain package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainKind
	 * @see #isSetDomain()
	 * @see #unsetDomain()
	 * @see #setDomain(DomainKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Domain()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='domain'"
	 * @generated
	 */
	DomainKind getDomain();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainKind
	 * @see #isSetDomain()
	 * @see #unsetDomain()
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomain()
	 * @see #getDomain()
	 * @see #setDomain(DomainKind)
	 * @generated
	 */
	void unsetDomain();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getDomain <em>Domain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domain</em>' attribute is set.
	 * @see #unsetDomain()
	 * @see #getDomain()
	 * @see #setDomain(DomainKind)
	 * @generated
	 */
	boolean isSetDomain();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the identifier number of the package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Id()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Realm Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the geopolitical area covered by the package.  Also used to distinguish "local" artifacts.
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realm Namespace</em>' attribute.
	 * @see #setRealmNamespace(Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_RealmNamespace()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.RealmNamespaceKind"
	 *        extendedMetaData="kind='attribute' name='realmNamespace'"
	 * @generated
	 */
	Object getRealmNamespace();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getRealmNamespace <em>Realm Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realm Namespace</em>' attribute.
	 * @see #getRealmNamespace()
	 * @generated
	 */
	void setRealmNamespace(Object value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the release date of a non-versioned package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_ReleaseDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='releaseDate'"
	 * @generated
	 */
	XMLGregorianCalendar getReleaseDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRootKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the fundamental categorization of the package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageRootKind
	 * @see #isSetRoot()
	 * @see #unsetRoot()
	 * @see #setRoot(PackageRootKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Root()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='root'"
	 * @generated
	 */
	PackageRootKind getRoot();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageRootKind
	 * @see #isSetRoot()
	 * @see #unsetRoot()
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(PackageRootKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoot()
	 * @see #getRoot()
	 * @see #setRoot(PackageRootKind)
	 * @generated
	 */
	void unsetRoot();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getRoot <em>Root</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Root</em>' attribute is set.
	 * @see #unsetRoot()
	 * @see #getRoot()
	 * @see #setRoot(PackageRootKind)
	 * @generated
	 */
	boolean isSetRoot();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Added by Eclipse for backwards compatibility (Grahame 9-Oct 2007). To be removed later
	 * Deprecated: This element isn't really part of the id, but rather is used for publishing
	 * UML: no mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #setSection(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Section()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='section'"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(String value);

	/**
	 * Returns the value of the '<em><b>Sub Artifact</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.SubArtifactKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the sub-category of the artifacts in the package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Artifact</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubArtifactKind
	 * @see #isSetSubArtifact()
	 * @see #unsetSubArtifact()
	 * @see #setSubArtifact(SubArtifactKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_SubArtifact()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='subArtifact'"
	 * @generated
	 */
	SubArtifactKind getSubArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSubArtifact <em>Sub Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Artifact</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubArtifactKind
	 * @see #isSetSubArtifact()
	 * @see #unsetSubArtifact()
	 * @see #getSubArtifact()
	 * @generated
	 */
	void setSubArtifact(SubArtifactKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSubArtifact <em>Sub Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubArtifact()
	 * @see #getSubArtifact()
	 * @see #setSubArtifact(SubArtifactKind)
	 * @generated
	 */
	void unsetSubArtifact();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSubArtifact <em>Sub Artifact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Artifact</em>' attribute is set.
	 * @see #unsetSubArtifact()
	 * @see #getSubArtifact()
	 * @see #setSubArtifact(SubArtifactKind)
	 * @generated
	 */
	boolean isSetSubArtifact();

	/**
	 * Returns the value of the '<em><b>Sub Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Added by Eclipse for backwards compatibility (Grahame 27-Nov 2007). To be removed later
	 * Deprecated: This element isn't really part of the id, but rather is used for publishing
	 * UML: no mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Section</em>' attribute.
	 * @see #setSubSection(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_SubSection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='subSection'"
	 * @generated
	 */
	String getSubSection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getSubSection <em>Sub Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Section</em>' attribute.
	 * @see #getSubSection()
	 * @generated
	 */
	void setSubSection(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the version package
	 * UML: ModelElement.name, inherited by package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRef_Version()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // PackageRef
