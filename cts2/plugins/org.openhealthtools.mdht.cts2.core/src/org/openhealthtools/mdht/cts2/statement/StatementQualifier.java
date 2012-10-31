/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.ModelAttributeReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Metadata about a statement including provenance, external identity, validity, etc. The subject of a qualifier is the statement itself, not the
 * statement subject.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getQualifierPredicate <em>Qualifier Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getAssociatedAttribute <em>Associated Attribute</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementQualifier()
 * @model extendedMetaData="name='StatementQualifier' kind='elementOnly'"
 * @generated
 */
public interface StatementQualifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the statement qualifier predicate.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Qualifier Predicate</em>' containment reference.
	 * @see #setQualifierPredicate(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementQualifier_QualifierPredicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='qualifierPredicate' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getQualifierPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getQualifierPredicate <em>Qualifier Predicate</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Qualifier Predicate</em>' containment reference.
	 * @see #getQualifierPredicate()
	 * @generated
	 */
	void setQualifierPredicate(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Associated Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">2</sub> model attribute that represents this particular statement qualifier
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Associated Attribute</em>' containment reference.
	 * @see #setAssociatedAttribute(ModelAttributeReference)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementQualifier_AssociatedAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelAttributeReference getAssociatedAttribute();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getAssociatedAttribute <em>Associated Attribute</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Associated Attribute</em>' containment reference.
	 * @see #getAssociatedAttribute()
	 * @generated
	 */
	void setAssociatedAttribute(ModelAttributeReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(StatementTarget)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementQualifier_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementTarget getTarget();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.StatementQualifier#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StatementTarget value);

} // StatementQualifier
