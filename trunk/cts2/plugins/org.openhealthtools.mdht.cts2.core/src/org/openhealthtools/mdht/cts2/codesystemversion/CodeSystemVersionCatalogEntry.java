/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystemversion;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.LanguageReference;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersion</i> is a collection of assertions about one or more entities. If
 * the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">state</i> of a <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersion</i> is <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">Final </i>the set of assertions made the resource is fixed, meaning
 * that if one knows the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">documentURI</i> assigned to the version and the specific <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">sourceAndNotation</i> from which the version instance was derived, the set of
 * assertions is known as well.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getVersionOf <em>Version Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getImports <em>Imports</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getDefaultLanguage <em>Default Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getSupportedLanguage <em>Supported Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getEntityDescriptions <em>Entity Descriptions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getAssociations <em>Associations</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getClasses <em>Classes</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getRoles <em>Roles</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getIndividuals <em>Individuals</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getCodeSystemVersionName <em>Code System Version Name
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry()
 * @model extendedMetaData="name='CodeSystemVersionCatalogEntry' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionCatalogEntry extends ResourceVersionDescription {
	/**
	 * Returns the value of the '<em><b>Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name, URI and, if supported by the service, link to the code system that this version represents.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Version Of</em>' containment reference.
	 * @see #setVersionOf(CodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_VersionOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versionOf' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemReference getVersionOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getVersionOf <em>Version Of</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version Of</em>' containment reference.
	 * @see #getVersionOf()
	 * @generated
	 */
	void setVersionOf(CodeSystemReference value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a code system version whose assertions are included as part this code system version.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_Imports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imports' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemVersionReference> getImports();

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the default spoken or written language used in this version
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Default Language</em>' containment reference.
	 * @see #setDefaultLanguage(LanguageReference)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_DefaultLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageReference getDefaultLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getDefaultLanguage
	 * <em>Default Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Language</em>' containment reference.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(LanguageReference value);

	/**
	 * Returns the value of the '<em><b>Supported Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.LanguageReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * all languages recognized by this particular code system version
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Supported Language</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_SupportedLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LanguageReference> getSupportedLanguage();

	/**
	 * Returns the value of the '<em><b>Entity Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a DirectoryURI that resolves to the set of all entities and their descriptions asserted by this code system version. This attribute will only
	 * be present if and only if the service implementation
	 * supports the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">EntityQuery</b> service profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entity Descriptions</em>' attribute.
	 * @see #setEntityDescriptions(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_EntityDescriptions()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='entityDescriptions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEntityDescriptions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getEntityDescriptions
	 * <em>Entity Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Descriptions</em>' attribute.
	 * @see #getEntityDescriptions()
	 * @generated
	 */
	void setEntityDescriptions(String value);

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">DirectoryURI</i> that,resolves to a a list of all associations asserted by
	 * this particular code system version
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Associations</em>' attribute.
	 * @see #setAssociations(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_Associations()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.AssociationDirectoryURI"
	 *        extendedMetaData="kind='element' name='associations' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssociations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getAssociations
	 * <em>Associations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Associations</em>' attribute.
	 * @see #getAssociations()
	 * @generated
	 */
	void setAssociations(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">DirectoryURI</i> that resolves to the set of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">EntityDescriptions </i>that are of type owl:Class within this code system. Will
	 * only be present in code systems that represent
	 * ontologies.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Classes</em>' attribute.
	 * @see #setClasses(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_Classes()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='classes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClasses();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getClasses <em>Classes</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Classes</em>' attribute.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">DirectoryURI</i> that resolves to the set of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">EntityDescriptions </i>that are of type owl:ObjectProperty or owl:DataProperty
	 * within this code system. Will only be present in code systems
	 * that represent ontologies.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Roles</em>' attribute.
	 * @see #setRoles(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_Roles()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='roles' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRoles();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getRoles <em>Roles</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Roles</em>' attribute.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(String value);

	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">DirectoryURI</i> that resolves to the set of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">EntityDescriptions </i>that are of type owl:Individual within this code system.
	 * Will only be present in code systems that represent
	 * ontologies.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Individuals</em>' attribute.
	 * @see #setIndividuals(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_Individuals()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='individuals' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndividuals();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getIndividuals
	 * <em>Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Individuals</em>' attribute.
	 * @see #getIndividuals()
	 * @generated
	 */
	void setIndividuals(String value);

	/**
	 * Returns the value of the '<em><b>Code System Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an identifier that uniquely names this particular code system version within the context of the CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">2</sub> service instance.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Name</em>' attribute.
	 * @see #setCodeSystemVersionName(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntry_CodeSystemVersionName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemVersionName" required="true"
	 *        extendedMetaData="kind='attribute' name='codeSystemVersionName'"
	 * @generated
	 */
	String getCodeSystemVersionName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry#getCodeSystemVersionName
	 * <em>Code System Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version Name</em>' attribute.
	 * @see #getCodeSystemVersionName()
	 * @generated
	 */
	void setCodeSystemVersionName(String value);

} // CodeSystemVersionCatalogEntry
