/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a known translation between two code systems
 * UML: A stereotype on dependency
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getSourceConcept <em>Source Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getTargetConcept <em>Target Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getTranslatableDirection <em>Translatable Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation()
 * @model extendedMetaData="name='CodeTranslation' kind='elementOnly'"
 * @generated
 */
public interface CodeTranslation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the CodeTranslation.
	 * UML: A collector for the comments and constraints associated with a CodeTranslation.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(CodeTranslationAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeTranslationAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(CodeTranslationAnnotations value);

	/**
	 * Returns the value of the '<em><b>Source Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code for which the translation exists
	 * UML: A reference to the Enumeration Item that is the client of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Concept</em>' containment reference.
	 * @see #setSourceConcept(ConceptRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation_SourceConcept()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptRef getSourceConcept();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getSourceConcept <em>Source Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Concept</em>' containment reference.
	 * @see #getSourceConcept()
	 * @generated
	 */
	void setSourceConcept(ConceptRef value);

	/**
	 * Returns the value of the '<em><b>Target Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code being translated to
	 * UML: A reference to the Enumeration Item that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Concept</em>' containment reference.
	 * @see #setTargetConcept(ConceptRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation_TargetConcept()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptRef getTargetConcept();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getTargetConcept <em>Target Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Concept</em>' containment reference.
	 * @see #getTargetConcept()
	 * @generated
	 */
	void setTargetConcept(ConceptRef value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the semantic relationship between the source and target code expressed in terms of the target.  E.g. "broader than" means target is broader than source.
	 * UML: A tag on the CodeTranslation dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #setQuality(MapRelationshipKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation_Quality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='quality'"
	 * @generated
	 */
	MapRelationshipKind getQuality();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(MapRelationshipKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuality()
	 * @see #getQuality()
	 * @see #setQuality(MapRelationshipKind)
	 * @generated
	 */
	void unsetQuality();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getQuality <em>Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quality</em>' attribute is set.
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @see #setQuality(MapRelationshipKind)
	 * @generated
	 */
	boolean isSetQuality();

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

	/**
	 * Returns the value of the '<em><b>Translatable Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.TranslatableDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates in which direction code translation is being asserted to be permissable (if any)
	 * UML: Tag on CodeTranslation dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translatable Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TranslatableDirectionKind
	 * @see #isSetTranslatableDirection()
	 * @see #unsetTranslatableDirection()
	 * @see #setTranslatableDirection(TranslatableDirectionKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeTranslation_TranslatableDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='translatableDirection'"
	 * @generated
	 */
	TranslatableDirectionKind getTranslatableDirection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getTranslatableDirection <em>Translatable Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TranslatableDirectionKind
	 * @see #isSetTranslatableDirection()
	 * @see #unsetTranslatableDirection()
	 * @see #getTranslatableDirection()
	 * @generated
	 */
	void setTranslatableDirection(TranslatableDirectionKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getTranslatableDirection <em>Translatable Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTranslatableDirection()
	 * @see #getTranslatableDirection()
	 * @see #setTranslatableDirection(TranslatableDirectionKind)
	 * @generated
	 */
	void unsetTranslatableDirection();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation#getTranslatableDirection <em>Translatable Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Translatable Direction</em>' attribute is set.
	 * @see #unsetTranslatableDirection()
	 * @see #getTranslatableDirection()
	 * @see #setTranslatableDirection(TranslatableDirectionKind)
	 * @generated
	 */
	boolean isSetTranslatableDirection();

} // CodeTranslation
