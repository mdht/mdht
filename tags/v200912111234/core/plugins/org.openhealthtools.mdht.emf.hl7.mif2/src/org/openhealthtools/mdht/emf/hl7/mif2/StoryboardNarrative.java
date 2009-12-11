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
 * A representation of the model object '<em><b>Storyboard Narrative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A description of how the set of interactions described by the storyboard might look in a particular business environment.
 * UML: Tag on Storyboard
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getDeprecatedPackageLocation <em>Deprecated Package Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardNarrative()
 * @model extendedMetaData="name='StoryboardNarrative' kind='elementOnly'"
 * @generated
 */
public interface StoryboardNarrative extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows indication of what realms a particular narrative applies to (if different from the realm associated with the overall storyboard)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardNarrative_Context()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Context:4'"
	 * @generated
	 */
	FeatureMap getContext();

	/**
	 * Returns the value of the '<em><b>Realm Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RealmElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the affiliate or sub-realm associated with the element.  If none is specified, the affiliate associated with the package is assumed.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realm Namespace</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardNarrative_RealmNamespace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realmNamespace' namespace='##targetNamespace' group='#Context:4'"
	 * @generated
	 */
	EList<RealmElement> getRealmNamespace();

	/**
	 * Returns the value of the '<em><b>Deprecated Package Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a package style identifier for the storyboard.  No longer required as storyboard narratives exist inside storyboard artifacts and Identifies where (within the 'repository' package hierarchy) this package resides
	 * UML: Identifies the namespace the package is part of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecated Package Location</em>' containment reference.
	 * @see #setDeprecatedPackageLocation(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardNarrative_DeprecatedPackageLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deprecatedPackageLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getDeprecatedPackageLocation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getDeprecatedPackageLocation <em>Deprecated Package Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated Package Location</em>' containment reference.
	 * @see #getDeprecatedPackageLocation()
	 * @generated
	 */
	void setDeprecatedPackageLocation(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual text of the storyboard narrative
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardNarrative_Text()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getText();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the package in circumstances where the 'name' is more of an identifier.
	 * UML: title tag on Package stereotype
	 * DublinCore: Equivalent to 'title'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardNarrative_Title()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // StoryboardNarrative
