/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Code</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getConceptName <em>Concept Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getUsageNote <em>Usage Note</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetCode()
 * @model
 * @generated
 */
public interface ValueSetCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Concept Name</em>' attribute.
	 * @see #setConceptName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetCode_ConceptName()
	 * @model ordered="false"
	 * @generated
	 */
	String getConceptName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getConceptName <em>Concept Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Concept Name</em>' attribute.
	 * @see #getConceptName()
	 * @generated
	 */
	void setConceptName(String value);

	/**
	 * Returns the value of the '<em><b>Usage Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Note</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Usage Note</em>' attribute.
	 * @see #setUsageNote(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetCode_UsageNote()
	 * @model ordered="false"
	 * @generated
	 */
	String getUsageNote();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getUsageNote <em>Usage Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Usage Note</em>' attribute.
	 * @see #getUsageNote()
	 * @generated
	 */
	void setUsageNote(String value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' reference.
	 * @see #setCodeSystem(CodeSystemVersion)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetCode_CodeSystem()
	 * @model ordered="false"
	 * @generated
	 */
	CodeSystemVersion getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getCodeSystem <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystemVersion value);

	/**
	 * Returns the value of the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration Literal</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #setBase_EnumerationLiteral(EnumerationLiteral)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetCode_Base_EnumerationLiteral()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EnumerationLiteral getBase_EnumerationLiteral();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode#getBase_EnumerationLiteral
	 * <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 */
	void setBase_EnumerationLiteral(EnumerationLiteral value);

} // ValueSetCode
