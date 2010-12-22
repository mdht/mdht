/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to reference a domain associated with another element
 * UML: DomainSpecification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularySpecification()
 * @model extendedMetaData="name='VocabularySpecification' kind='elementOnly'"
 * @generated
 */
public interface VocabularySpecification extends Dependency {
	/**
	 * Returns the value of the '<em><b>Concept Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vocabulary domain from which content may be drawn.
	 * UML: DomainSpecification supplier association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Domain</em>' containment reference.
	 * @see #setConceptDomain(ConceptDomainRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularySpecification_ConceptDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conceptDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptDomainRef getConceptDomain();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification#getConceptDomain <em>Concept Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Domain</em>' containment reference.
	 * @see #getConceptDomain()
	 * @generated
	 */
	void setConceptDomain(ConceptDomainRef value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vocabulary value-set from which content may be drawn.
	 * UML: ValueSetSpecification supplier association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(VocabularyValueSetBinding)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularySpecification_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularyValueSetBinding getValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(VocabularyValueSetBinding value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific fixed-value code that must be used.
	 * UML: Code supplier association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(VocabularyCodeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularySpecification_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularyCodeRef getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(VocabularyCodeRef value);

} // VocabularySpecification
