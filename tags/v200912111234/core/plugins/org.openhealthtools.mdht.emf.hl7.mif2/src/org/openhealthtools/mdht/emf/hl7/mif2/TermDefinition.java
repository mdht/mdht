/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides a definition for a single concept
 * UML: Stereotype of EnumerationLiteral
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition#getTermTranslation <em>Term Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTermDefinition()
 * @model extendedMetaData="name='TermDefinition' kind='elementOnly'"
 * @generated
 */
public interface TermDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Term Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides alternative expressions of the same term in different languages
	 * UML: Complex tag on TermDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Translation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTermDefinition_TermTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='termTranslation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getTermTranslation();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the detailed definition on a per realm/language basis
	 * UML: Complex tag on TermDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTermDefinition_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplexMarkupWithLanguage> getDefinition();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies an equivalent term whose definition should be used in place of (where this element has no definition) or as a supplement to the definition of this element.
	 * UML: Complex tag on TermDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTermDefinition_SeeAlso()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='element' name='seeAlso' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSeeAlso();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal name for the term being defined.
	 * UML: the 'name' of the EnumerationLiteral
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTermDefinition_Term()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='term'"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

} // TermDefinition
