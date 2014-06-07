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
package org.openhealthtools.mdht.cts2.statement;

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.StatementMsg#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementMsg()
 * @model extendedMetaData="name='StatementMsg' kind='elementOnly'"
 * @generated
 */
public interface StatementMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatementMsg_Statement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace'"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.StatementMsg#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // StatementMsg
