/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Value Set Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies the vocabulary concept that is the 'root' for the content of this element.
 * UML: DomainSpecification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getCodingStrength <em>Coding Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getIgnoredValueSet <em>Ignored Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getMinimumValueSet <em>Minimum Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getRevisionFrequency <em>Revision Frequency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getRootCode <em>Root Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyValueSetBinding()
 * @model extendedMetaData="name='VocabularyValueSetBinding' kind='empty'"
 * @generated
 */
public interface VocabularyValueSetBinding extends VocabularyValueSetRef {
	/**
	 * Returns the value of the '<em><b>Coding Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the level of flexibility the constructor of a model instance has in using coded values.
	 * UML: tag on DomainSpecification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coding Strength</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind
	 * @see #isSetCodingStrength()
	 * @see #unsetCodingStrength()
	 * @see #setCodingStrength(CodingStrengthKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyValueSetBinding_CodingStrength()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='codingStrength'"
	 * @generated
	 */
	CodingStrengthKind getCodingStrength();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getCodingStrength <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coding Strength</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind
	 * @see #isSetCodingStrength()
	 * @see #unsetCodingStrength()
	 * @see #getCodingStrength()
	 * @generated
	 */
	void setCodingStrength(CodingStrengthKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getCodingStrength <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodingStrength()
	 * @see #getCodingStrength()
	 * @see #setCodingStrength(CodingStrengthKind)
	 * @generated
	 */
	void unsetCodingStrength();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getCodingStrength <em>Coding Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coding Strength</em>' attribute is set.
	 * @see #unsetCodingStrength()
	 * @see #getCodingStrength()
	 * @see #setCodingStrength(CodingStrengthKind)
	 * @generated
	 */
	boolean isSetCodingStrength();

	/**
	 * Returns the value of the '<em><b>Ignored Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of codes within the overall valueset that the implementer is willing to accept without raising an error, but whose content will be ignored and not processed in any useful manner
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignored Value Set</em>' attribute.
	 * @see #setIgnoredValueSet(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyValueSetBinding_IgnoredValueSet()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='ignoredValueSet'"
	 * @generated
	 */
	String getIgnoredValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getIgnoredValueSet <em>Ignored Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignored Value Set</em>' attribute.
	 * @see #getIgnoredValueSet()
	 * @generated
	 */
	void setIgnoredValueSet(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of codes within the overall value set that must be supported by an implementer to be considered compliant
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Value Set</em>' attribute.
	 * @see #setMinimumValueSet(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyValueSetBinding_MinimumValueSet()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='minimumValueSet'"
	 * @generated
	 */
	String getMinimumValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getMinimumValueSet <em>Minimum Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value Set</em>' attribute.
	 * @see #getMinimumValueSet()
	 * @generated
	 */
	void setMinimumValueSet(String value);

	/**
	 * Returns the value of the '<em><b>Revision Frequency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.RevisionFrequencyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how often applications are expected to update their codes to reflect changes to the value-set associated with the attribute
	 * UML: tag on DomainSpecification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Frequency</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RevisionFrequencyKind
	 * @see #isSetRevisionFrequency()
	 * @see #unsetRevisionFrequency()
	 * @see #setRevisionFrequency(RevisionFrequencyKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyValueSetBinding_RevisionFrequency()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionFrequency'"
	 * @generated
	 */
	RevisionFrequencyKind getRevisionFrequency();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getRevisionFrequency <em>Revision Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Frequency</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RevisionFrequencyKind
	 * @see #isSetRevisionFrequency()
	 * @see #unsetRevisionFrequency()
	 * @see #getRevisionFrequency()
	 * @generated
	 */
	void setRevisionFrequency(RevisionFrequencyKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getRevisionFrequency <em>Revision Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionFrequency()
	 * @see #getRevisionFrequency()
	 * @see #setRevisionFrequency(RevisionFrequencyKind)
	 * @generated
	 */
	void unsetRevisionFrequency();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getRevisionFrequency <em>Revision Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revision Frequency</em>' attribute is set.
	 * @see #unsetRevisionFrequency()
	 * @see #getRevisionFrequency()
	 * @see #setRevisionFrequency(RevisionFrequencyKind)
	 * @generated
	 */
	boolean isSetRevisionFrequency();

	/**
	 * Returns the value of the '<em><b>Root Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For value sets of the form "&lt;= OBS", allows conveying the root code of the value set.  Only usable for key structural attributes - classCode, moodCode, determinerCode and typeCode.
	 * UML: Part of complex tag
	 * Derived: This is the "code" attribute on the codeBasedContentDefinition for the value set being referenced
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Code</em>' attribute.
	 * @see #setRootCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyValueSetBinding_RootCode()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='rootCode'"
	 * @generated
	 */
	String getRootCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding#getRootCode <em>Root Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Code</em>' attribute.
	 * @see #getRootCode()
	 * @generated
	 */
	void setRootCode(String value);

} // VocabularyValueSetBinding
