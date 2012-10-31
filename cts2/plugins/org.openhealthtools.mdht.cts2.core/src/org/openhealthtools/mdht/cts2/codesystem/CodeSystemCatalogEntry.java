/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
import org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.OntologyDomainReference;
import org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference;
import org.openhealthtools.mdht.cts2.core.OntologyTaskReference;
import org.openhealthtools.mdht.cts2.core.OntologyTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Metadata and access information about a code system.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemCategory <em>Code System Category</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyDomain <em>Ontology Domain</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyType <em>Ontology Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getDesignedForOntologyTask <em>Designed For Ontology Task</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getVersions <em>Versions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCurrentVersion <em>Current Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getUsedOntologyEngineeringTool <em>Used Ontology Engineering Tool</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemName <em>Code System Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry()
 * @model extendedMetaData="name='CodeSystemCatalogEntry' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemCatalogEntry extends AbstractResourceDescription {
	/**
	 * Returns the value of the '<em><b>Code System Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the category or type of resource that the code system represents.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Category</em>' containment reference.
	 * @see #setCodeSystemCategory(CodeSystemCategoryReference)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_CodeSystemCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystemCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemCategoryReference getCodeSystemCategory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemCategory
	 * <em>Code System Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Category</em>' containment reference.
	 * @see #getCodeSystemCategory()
	 * @generated
	 */
	void setCodeSystemCategory(CodeSystemCategoryReference value);

	/**
	 * Returns the value of the '<em><b>Ontology Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the subject domain of the ontology
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ontology Domain</em>' containment reference.
	 * @see #setOntologyDomain(OntologyDomainReference)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_OntologyDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ontologyDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologyDomainReference getOntologyDomain();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyDomain <em>Ontology Domain</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ontology Domain</em>' containment reference.
	 * @see #getOntologyDomain()
	 * @generated
	 */
	void setOntologyDomain(OntologyDomainReference value);

	/**
	 * Returns the value of the '<em><b>Ontology Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the nature of the content of the ontology
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ontology Type</em>' containment reference.
	 * @see #setOntologyType(OntologyTypeReference)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_OntologyType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ontologyType' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologyTypeReference getOntologyType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getOntologyType <em>Ontology Type</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ontology Type</em>' containment reference.
	 * @see #getOntologyType()
	 * @generated
	 */
	void setOntologyType(OntologyTypeReference value);

	/**
	 * Returns the value of the '<em><b>Designed For Ontology Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.OntologyTaskReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the purpose for which the ontology was originally designed
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Designed For Ontology Task</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_DesignedForOntologyTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designedForOntologyTask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OntologyTaskReference> getDesignedForOntologyTask();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">DirectoryURI</i> that references the known versions of this code system.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Versions</em>' attribute.
	 * @see #setVersions(String)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_Versions()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemVersionCatalogEntryDirectoryURI"
	 *        extendedMetaData="kind='element' name='versions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getVersions <em>Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Versions</em>' attribute.
	 * @see #getVersions()
	 * @generated
	 */
	void setVersions(String value);

	/**
	 * Returns the value of the '<em><b>Current Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the code system version marked as <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">CURRENT</i> in the service instance.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Current Version</em>' containment reference.
	 * @see #setCurrentVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_CurrentVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getCurrentVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCurrentVersion <em>Current Version</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Current Version</em>' containment reference.
	 * @see #getCurrentVersion()
	 * @generated
	 */
	void setCurrentVersion(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Used Ontology Engineering Tool</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * information about a tool used to create the ontology
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Used Ontology Engineering Tool</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_UsedOntologyEngineeringTool()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedOntologyEngineeringTool' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OntologyEngineeringToolReference> getUsedOntologyEngineeringTool();

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local identifier that uniquely identifies the code system within the context of the implementing service. Note that the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">about</i> URI is the globally unique identifier.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntry_CodeSystemName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemName" required="true"
	 *        extendedMetaData="kind='attribute' name='codeSystemName'"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry#getCodeSystemName <em>Code System Name</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

} // CodeSystemCatalogEntry
