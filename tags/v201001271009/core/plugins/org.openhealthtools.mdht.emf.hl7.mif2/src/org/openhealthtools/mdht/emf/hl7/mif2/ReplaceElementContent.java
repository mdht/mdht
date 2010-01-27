/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Element Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines content to replace the existing content of the referenced element
 * UML: Part of a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent#getReplacementContent <em>Replacement Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReplaceElementContent()
 * @model extendedMetaData="name='ReplaceElementContent' kind='elementOnly'"
 * @generated
 */
public interface ReplaceElementContent extends ElementRef {
	/**
	 * Returns the value of the '<em><b>Replacement Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the attributes and elements to be inserted into the new element
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Content</em>' containment reference.
	 * @see #setReplacementContent(MifContent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReplaceElementContent_ReplacementContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replacementContent' namespace='##targetNamespace'"
	 * @generated
	 */
	MifContent getReplacementContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent#getReplacementContent <em>Replacement Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Content</em>' containment reference.
	 * @see #getReplacementContent()
	 * @generated
	 */
	void setReplacementContent(MifContent value);

} // ReplaceElementContent
