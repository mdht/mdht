/**
 */
package org.eclipse.mdht.uml.cda.core.profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.LogicalConstraint#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getLogicalConstraint()
 * @model
 * @generated
 */
public interface LogicalConstraint extends ConstraintValidation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.cda.core.profile.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.LogicalOperator
	 * @see #setOperation(LogicalOperator)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getLogicalConstraint_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogicalOperator getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.LogicalConstraint#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Operation</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.LogicalOperator
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(LogicalOperator value);

} // LogicalConstraint
