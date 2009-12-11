/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a particular organization and rendering of a collection of artifacts.
 * UML: An instance of a Package stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage#getPublicationContent <em>Publication Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage#getPublishedItem <em>Published Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage#getPublishedGroup <em>Published Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationPackage()
 * @model extendedMetaData="name='PublicationPackage' kind='elementOnly'"
 * @generated
 */
public interface PublicationPackage extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the publication.
	 * UML: A collector for the comments and constraints associated with a publication package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(PublicationAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationPackage_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(PublicationAnnotations value);

	/**
	 * Returns the value of the '<em><b>Publication Content</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Content</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Content</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationPackage_PublicationContent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PublicationContent:13'"
	 * @generated
	 */
	FeatureMap getPublicationContent();

	/**
	 * Returns the value of the '<em><b>Published Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a particular element to publish within the package
	 * UML: An owned element within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published Item</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationPackage_PublishedItem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishedItem' namespace='##targetNamespace' group='#PublicationContent:13'"
	 * @generated
	 */
	EList<PublicationItem> getPublishedItem();

	/**
	 * Returns the value of the '<em><b>Published Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a sub-hierarchy of elements to appear within the publication
	 * UML: An owned element within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published Group</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationPackage_PublishedGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishedGroup' namespace='##targetNamespace' group='#PublicationContent:13'"
	 * @generated
	 */
	EList<PublicationGroup> getPublishedGroup();

} // PublicationPackage
