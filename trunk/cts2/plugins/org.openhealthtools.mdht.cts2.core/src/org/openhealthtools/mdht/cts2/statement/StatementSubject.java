/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The subject of a statement, which may either be a resource URI or an entity reference, which includes both the URI and the namespace/name.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.StatementSubject#getResource <em>Resource</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.StatementSubject#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementSubject()
 * @model extendedMetaData="name='StatementSubject' kind='elementOnly'"
 * @generated
 */
public interface StatementSubject extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A non-entity statement subject such as the URI of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">CodeSystem</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">CodeSystemVersion</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">ValueSet</i>, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementSubject_Resource()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ExternalURI"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.StatementSubject#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of a statement about a class, role or individual.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementSubject_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.StatementSubject#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(URIAndEntityName value);

} // StatementSubject
