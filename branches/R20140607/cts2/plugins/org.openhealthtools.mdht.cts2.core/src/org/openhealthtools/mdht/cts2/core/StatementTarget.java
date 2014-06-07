/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Target</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * the target of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Statement. StatementTarget</i> represents one of a literal value, a reference
 * to a non-entity type <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">resource</i>, an <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entity, </i> or an anonymous blank <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">BNODE</i>.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getEntity <em>Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getLiteral <em>Literal</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getResource <em>Resource</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getBnode <em>Bnode</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getExternalIdentifier <em>External Identifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getStatementTarget()
 * @model extendedMetaData="name='StatementTarget' kind='elementOnly'"
 * @generated
 */
public interface StatementTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the URI and optional namespace/name when the target type is <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ENTITY</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getStatementTarget_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the literal target when the statement type is <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">LITERAL.</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getStatementTarget_Literal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getLiteral();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(OpaqueData value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the resource URI when the statement type is <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">RESOURCE</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getStatementTarget_Resource()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ExternalURI"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getResource <em>Resource</em>}' attribute.
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
	 * Returns the value of the '<em><b>Bnode</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.AnonymousStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a collection of statements about an anonymous subject
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Bnode</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getStatementTarget_Bnode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bnode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnonymousStatement> getBnode();

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an external identifier that has been assigned to the statement with this particular target by the authoring body. As an example, this would
	 * carry the SctId if the authoring body were
	 * SNOMED-CT
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>External Identifier</em>' attribute.
	 * @see #setExternalIdentifier(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getStatementTarget_ExternalIdentifier()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='attribute' name='externalIdentifier'"
	 * @generated
	 */
	String getExternalIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.StatementTarget#getExternalIdentifier <em>External Identifier</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>External Identifier</em>' attribute.
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	void setExternalIdentifier(String value);

} // StatementTarget
