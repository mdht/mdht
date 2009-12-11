/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifes a specific version of a given value set
 * UML: Stereotype on Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getUsesCodeSystemSupplement <em>Uses Code System Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getSupportedCodeSystem <em>Supported Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getSupportedLanguage <em>Supported Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getAssociatedConceptProperty <em>Associated Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getContent <em>Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getNonSelectableContent <em>Non Selectable Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getEnumeratedContent <em>Enumerated Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getExampleContent <em>Example Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getVersionTime <em>Version Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion()
 * @model extendedMetaData="name='ValueSetVersion' kind='elementOnly'"
 * @generated
 */
public interface ValueSetVersion extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Uses Code System Supplement</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists code system extensions used by this value-set
	 * UML: packages that have elements imported into this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Code System Supplement</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_UsesCodeSystemSupplement()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='element' name='usesCodeSystemSupplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsesCodeSystemSupplement();

	/**
	 * Returns the value of the '<em><b>Supported Code System</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists code systems used by this value-set
	 * UML: packages that have elements imported into this package
	 * Derived: Extract the list of code systems referenced by content
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Code System</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_SupportedCodeSystem()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='element' name='supportedCodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSupportedCodeSystem();

	/**
	 * Returns the value of the '<em><b>Supported Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists languages fully supported (print names for all concepts exist in the language) used by this value-set
	 * UML: Tag on stereotype
	 * Derived: Extract the list of languages that have print names for all concepts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Language</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_SupportedLanguage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='element' name='supportedLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSupportedLanguage();

	/**
	 * Returns the value of the '<em><b>Associated Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concept Properties that are associated with this Value Set Version because the property is DECLARED as value-set associatable by the Code System from which this value set draws its enumerated content.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_AssociatedConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedConceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptProperty> getAssociatedConceptProperty();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the codes from a given code system allowed as part of the value set version
	 * UML: Identifies what EnumerationItems should be imported into this Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Non Selectable Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, overrides the default "selectable" characteristic of the codes defined by 'content' such that all codes are selectable with the exception of those found within this value-set.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Selectable Content</em>' containment reference.
	 * @see #setNonSelectableContent(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_NonSelectableContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonSelectableContent' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getNonSelectableContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getNonSelectableContent <em>Non Selectable Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Selectable Content</em>' containment reference.
	 * @see #getNonSelectableContent()
	 * @generated
	 */
	void setNonSelectableContent(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Enumerated Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an explicit enumeration of the codes from a given code system associated with the value set version based on its definition
	 * UML: Identifies what EnumerationItems have been imported into this Package
	 * Derive: Todo - explicit enumeration of all codes in this value set version based on the expressions within 'content'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerated Content</em>' containment reference.
	 * @see #setEnumeratedContent(VocabularyCodeRefs)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_EnumeratedContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumeratedContent' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularyCodeRefs getEnumeratedContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getEnumeratedContent <em>Enumerated Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerated Content</em>' containment reference.
	 * @see #getEnumeratedContent()
	 * @generated
	 */
	void setEnumeratedContent(VocabularyCodeRefs value);

	/**
	 * Returns the value of the '<em><b>Example Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subset of the content of the value-set for publication purposes to provide an example of the codes available in the value-set
	 * UML: Tag on complex stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Content</em>' containment reference.
	 * @see #setExampleContent(VocabularyCodeRefs)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_ExampleContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleContent' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularyCodeRefs getExampleContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getExampleContent <em>Example Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Content</em>' containment reference.
	 * @see #getExampleContent()
	 * @generated
	 */
	void setExampleContent(VocabularyCodeRefs value);

	/**
	 * Returns the value of the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which this particular value set version came into being
	 * UML: Corresponds to Package.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Date</em>' attribute.
	 * @see #setVersionDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_VersionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='attribute' name='versionDate'"
	 * @generated
	 */
	XMLGregorianCalendar getVersionDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getVersionDate <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Date</em>' attribute.
	 * @see #getVersionDate()
	 * @generated
	 */
	void setVersionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Version Time</b></em>' attribute.
	 * The default value is <code>"00:00:00"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time on which this particular value set version came into being.  Only needed when multiple versions of a value-set are created on a given day.
	 * UML: Corresponds to Package.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Time</em>' attribute.
	 * @see #isSetVersionTime()
	 * @see #unsetVersionTime()
	 * @see #setVersionTime(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getValueSetVersion_VersionTime()
	 * @model default="00:00:00" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='attribute' name='versionTime'"
	 * @generated
	 */
	XMLGregorianCalendar getVersionTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getVersionTime <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Time</em>' attribute.
	 * @see #isSetVersionTime()
	 * @see #unsetVersionTime()
	 * @see #getVersionTime()
	 * @generated
	 */
	void setVersionTime(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getVersionTime <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersionTime()
	 * @see #getVersionTime()
	 * @see #setVersionTime(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetVersionTime();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion#getVersionTime <em>Version Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version Time</em>' attribute is set.
	 * @see #unsetVersionTime()
	 * @see #getVersionTime()
	 * @see #setVersionTime(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetVersionTime();

} // ValueSetVersion
