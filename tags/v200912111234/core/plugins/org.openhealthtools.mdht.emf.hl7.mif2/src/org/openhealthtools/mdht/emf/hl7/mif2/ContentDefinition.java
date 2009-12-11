/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a value set built up of the inclusion, exclusion and/or union of multiple other value sets.  If no constraints are specified, then the content is the complete set of codes in the referenced code system.
 * UML: Defines the code enumerations imported into this package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCombinedContent <em>Combined Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCodeBasedContent <em>Code Based Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getPropertyBasedContent <em>Property Based Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCodeFilterContent <em>Code Filter Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getNonComputableContent <em>Non Computable Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getValueSetRef <em>Value Set Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getAllowedQualifiers <em>Allowed Qualifiers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getProhibitedQualifiers <em>Prohibited Qualifiers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#isAreBaseQualifiersUnlimited <em>Are Base Qualifiers Unlimited</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getVersionDate <em>Version Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition()
 * @model extendedMetaData="name='ContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface ContentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the content definition.
	 * UML: A collector for the comments and constraints associated with a vocabulary model.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ContentDefinitionAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinitionAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ContentDefinitionAnnotations value);

	/**
	 * Returns the value of the '<em><b>Combined Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content derived from multiple other value sets
	 * UML: Mechanism for defining imported contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Content</em>' containment reference.
	 * @see #setCombinedContent(CombinedContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_CombinedContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedContent' namespace='##targetNamespace'"
	 * @generated
	 */
	CombinedContentDefinition getCombinedContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCombinedContent <em>Combined Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Content</em>' containment reference.
	 * @see #getCombinedContent()
	 * @generated
	 */
	void setCombinedContent(CombinedContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Code Based Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content based on a code and its related codes
	 * UML: Mechanism for defining imported contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Based Content</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_CodeBasedContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeBasedContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeBasedContentDefinition> getCodeBasedContent();

	/**
	 * Returns the value of the '<em><b>Property Based Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content derived through constraints on the properties of allowed codes
	 * UML: Mechanism for defining imported contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Based Content</em>' containment reference.
	 * @see #setPropertyBasedContent(PropertyBasedContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_PropertyBasedContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyBasedContent' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyBasedContentDefinition getPropertyBasedContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getPropertyBasedContent <em>Property Based Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Based Content</em>' containment reference.
	 * @see #getPropertyBasedContent()
	 * @generated
	 */
	void setPropertyBasedContent(PropertyBasedContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Code Filter Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content derived through explic filters on code mnemonics
	 * UML: Mechanism for defining imported contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Filter Content</em>' containment reference.
	 * @see #setCodeFilterContent(CodeFilterContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_CodeFilterContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeFilterContent' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeFilterContentDefinition getCodeFilterContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCodeFilterContent <em>Code Filter Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Filter Content</em>' containment reference.
	 * @see #getCodeFilterContent()
	 * @generated
	 */
	void setCodeFilterContent(CodeFilterContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Non Computable Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a value-set in a non-computable manner (or at least a manner that is not supported by MIF representation).  This may include free-hand descriptions, pseudo-expressions or even formal expressions against some local terminology data model.  NOTE: It is an error for structural domains and attributes to be bound to a value-set with non-computable content.
	 * UML: Mechanism for defining imported contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Computable Content</em>' containment reference.
	 * @see #setNonComputableContent(NonComputableContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_NonComputableContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonComputableContent' namespace='##targetNamespace'"
	 * @generated
	 */
	NonComputableContentDefinition getNonComputableContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getNonComputableContent <em>Non Computable Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Computable Content</em>' containment reference.
	 * @see #getNonComputableContent()
	 * @generated
	 */
	void setNonComputableContent(NonComputableContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Value Set Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content imported from another value set reference
	 * UML: Mechanism for defining imported contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set Ref</em>' containment reference.
	 * @see #setValueSetRef(VocabularyValueSetRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_ValueSetRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularyValueSetRef getValueSetRef();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getValueSetRef <em>Value Set Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Ref</em>' containment reference.
	 * @see #getValueSetRef()
	 * @generated
	 */
	void setValueSetRef(VocabularyValueSetRef value);

	/**
	 * Returns the value of the '<em><b>Allowed Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any constraints on qualifiers for codes associated with this value-set.  (The default set of qualifiers is all of those supported by the code system.  Presence of this element reduces those allowed to only those allowed by the value-set, though rules about what qualifiers apply for which codes are still valid.)
	 * UML: Tag on complex stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Qualifiers</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_AllowedQualifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedQualifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelationshipBasedContentDefinition> getAllowedQualifiers();

	/**
	 * Returns the value of the '<em><b>Prohibited Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any constraints on qualifiers for codes associated with this value-set.  (The default set of qualifiers is all of those supported by the code system.  Presence of this element reduces those allowed to only those allowed by the value-set, though rules about what qualifiers apply for which codes are still valid.)
	 * UML: Tag on complex stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prohibited Qualifiers</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_ProhibitedQualifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prohibitedQualifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelationshipBasedContentDefinition> getProhibitedQualifiers();

	/**
	 * Returns the value of the '<em><b>Are Base Qualifiers Unlimited</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that there are no constraints on qualifiers.  If false, only those qualifiers found in allowedQualifiers and not found in prohibitedQualifiers are permitted.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Are Base Qualifiers Unlimited</em>' attribute.
	 * @see #isSetAreBaseQualifiersUnlimited()
	 * @see #unsetAreBaseQualifiersUnlimited()
	 * @see #setAreBaseQualifiersUnlimited(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_AreBaseQualifiersUnlimited()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='areBaseQualifiersUnlimited'"
	 * @generated
	 */
	boolean isAreBaseQualifiersUnlimited();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#isAreBaseQualifiersUnlimited <em>Are Base Qualifiers Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Are Base Qualifiers Unlimited</em>' attribute.
	 * @see #isSetAreBaseQualifiersUnlimited()
	 * @see #unsetAreBaseQualifiersUnlimited()
	 * @see #isAreBaseQualifiersUnlimited()
	 * @generated
	 */
	void setAreBaseQualifiersUnlimited(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#isAreBaseQualifiersUnlimited <em>Are Base Qualifiers Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAreBaseQualifiersUnlimited()
	 * @see #isAreBaseQualifiersUnlimited()
	 * @see #setAreBaseQualifiersUnlimited(boolean)
	 * @generated
	 */
	void unsetAreBaseQualifiersUnlimited();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#isAreBaseQualifiersUnlimited <em>Are Base Qualifiers Unlimited</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Are Base Qualifiers Unlimited</em>' attribute is set.
	 * @see #unsetAreBaseQualifiersUnlimited()
	 * @see #isAreBaseQualifiersUnlimited()
	 * @see #setAreBaseQualifiersUnlimited(boolean)
	 * @generated
	 */
	boolean isSetAreBaseQualifiersUnlimited();

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code system from which the codes are drawn.
	 * UML: References the package from which the EnumerationItems should be imported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_CodeSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='codeSystem'"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, identifies the code system version from which the codes are drawn.  If not specified, the current version of the code system is assumed.
	 * UML: References the package from which the EnumerationItems should be imported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Date</em>' attribute.
	 * @see #setVersionDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContentDefinition_VersionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='versionDate'"
	 * @generated
	 */
	XMLGregorianCalendar getVersionDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition#getVersionDate <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Date</em>' attribute.
	 * @see #getVersionDate()
	 * @generated
	 */
	void setVersionDate(XMLGregorianCalendar value);

} // ContentDefinition
