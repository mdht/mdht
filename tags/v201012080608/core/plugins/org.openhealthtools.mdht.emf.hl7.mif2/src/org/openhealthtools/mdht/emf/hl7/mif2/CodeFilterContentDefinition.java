/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Filter Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies the codes to be included by describing characteristics of the code mnemonic.  Codes must match all of the characteristics specified.
 * UML: Defines the code enumerations imported into this package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeFilterContentDefinition()
 * @model extendedMetaData="name='CodeFilterContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface CodeFilterContentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a regular expression that must be true when applied to a code for it to be included in the allowed content.  Content MUST be a valid regular expression, as used in 23c schema definition.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(EObject)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeFilterContentDefinition_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExpression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(EObject value);

	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of expression to be used to select the codes.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterExpressionKind
	 * @see #isSetExpressionType()
	 * @see #unsetExpressionType()
	 * @see #setExpressionType(CodeFilterExpressionKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeFilterContentDefinition_ExpressionType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='expressionType'"
	 * @generated
	 */
	CodeFilterExpressionKind getExpressionType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterExpressionKind
	 * @see #isSetExpressionType()
	 * @see #unsetExpressionType()
	 * @see #getExpressionType()
	 * @generated
	 */
	void setExpressionType(CodeFilterExpressionKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpressionType()
	 * @see #getExpressionType()
	 * @see #setExpressionType(CodeFilterExpressionKind)
	 * @generated
	 */
	void unsetExpressionType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition#getExpressionType <em>Expression Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expression Type</em>' attribute is set.
	 * @see #unsetExpressionType()
	 * @see #getExpressionType()
	 * @see #setExpressionType(CodeFilterExpressionKind)
	 * @generated
	 */
	boolean isSetExpressionType();

} // CodeFilterContentDefinition
