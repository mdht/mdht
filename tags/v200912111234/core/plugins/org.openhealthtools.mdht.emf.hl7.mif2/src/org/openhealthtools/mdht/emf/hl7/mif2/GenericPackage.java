/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a "collection" of artifacts within a particular namespace.
 * UML: An instance of a Package stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#getContent <em>Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#isIsComplete <em>Is Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGenericPackage()
 * @model extendedMetaData="name='GenericPackage' kind='elementOnly'"
 * @generated
 */
public interface GenericPackage extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the package.
	 * UML: A collector for the comments and constraints associated with a publication package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(PackageAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGenericPackage_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(PackageAnnotations value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the content within the package
	 * UML: The ownedElements of the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(PackageContent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGenericPackage_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageContent getContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(PackageContent value);

	/**
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the package represents the complete content within the namespace.  Otherwise, the content represents only partial content.
	 * UML: Tag on GenericPackage stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #isSetIsComplete()
	 * @see #unsetIsComplete()
	 * @see #setIsComplete(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGenericPackage_IsComplete()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isComplete'"
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isSetIsComplete()
	 * @see #unsetIsComplete()
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsComplete()
	 * @see #isIsComplete()
	 * @see #setIsComplete(boolean)
	 * @generated
	 */
	void unsetIsComplete();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage#isIsComplete <em>Is Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Complete</em>' attribute is set.
	 * @see #unsetIsComplete()
	 * @see #isIsComplete()
	 * @see #setIsComplete(boolean)
	 * @generated
	 */
	boolean isSetIsComplete();

} // GenericPackage
