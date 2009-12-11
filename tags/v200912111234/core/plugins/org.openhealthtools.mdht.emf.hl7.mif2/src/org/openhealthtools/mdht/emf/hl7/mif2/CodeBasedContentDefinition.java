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
 * A representation of the model object '<em><b>Code Based Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a specific code to include, possibly with related codes
 * UML: Defines the code enumerations imported into this package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#getHeadCodes <em>Head Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#getIncludeRelatedCodes <em>Include Related Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#isIncludeHeadCode <em>Include Head Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeBasedContentDefinition()
 * @model extendedMetaData="name='CodeBasedContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface CodeBasedContentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Head Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the "set" of codes for which related codes should be included.  May only appear (and must appear) if "code" does not appear.  Used when you want to walk a particular relationship type from a whole group of codes rather than just a single code.
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head Codes</em>' containment reference.
	 * @see #setHeadCodes(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeBasedContentDefinition_HeadCodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='headCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getHeadCodes();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#getHeadCodes <em>Head Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Codes</em>' containment reference.
	 * @see #getHeadCodes()
	 * @generated
	 */
	void setHeadCodes(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Include Related Codes</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies relationship types from the current code to other codes that should also be included
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Related Codes</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeBasedContentDefinition_IncludeRelatedCodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeRelatedCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IncludeRelatedCodes> getIncludeRelatedCodes();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the specific code to be included in the value set.  Note: Codes for synonyms must be explicitly listed to be considered part of the value set.
	 * UML: References a specific Enumeration Item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeBasedContentDefinition_Code()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Include Head Code</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the specified code should be included, if false, only related codes should be included
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Head Code</em>' attribute.
	 * @see #isSetIncludeHeadCode()
	 * @see #unsetIncludeHeadCode()
	 * @see #setIncludeHeadCode(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeBasedContentDefinition_IncludeHeadCode()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='includeHeadCode'"
	 * @generated
	 */
	boolean isIncludeHeadCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#isIncludeHeadCode <em>Include Head Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Head Code</em>' attribute.
	 * @see #isSetIncludeHeadCode()
	 * @see #unsetIncludeHeadCode()
	 * @see #isIncludeHeadCode()
	 * @generated
	 */
	void setIncludeHeadCode(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#isIncludeHeadCode <em>Include Head Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeHeadCode()
	 * @see #isIncludeHeadCode()
	 * @see #setIncludeHeadCode(boolean)
	 * @generated
	 */
	void unsetIncludeHeadCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition#isIncludeHeadCode <em>Include Head Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Head Code</em>' attribute is set.
	 * @see #unsetIncludeHeadCode()
	 * @see #isIncludeHeadCode()
	 * @see #setIncludeHeadCode(boolean)
	 * @generated
	 */
	boolean isSetIncludeHeadCode();

} // CodeBasedContentDefinition
