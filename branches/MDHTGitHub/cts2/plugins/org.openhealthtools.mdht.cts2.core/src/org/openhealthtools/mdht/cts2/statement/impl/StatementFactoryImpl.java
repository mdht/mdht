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
package org.openhealthtools.mdht.cts2.statement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.statement.DocumentRoot;
import org.openhealthtools.mdht.cts2.statement.Statement;
import org.openhealthtools.mdht.cts2.statement.StatementDirectory;
import org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry;
import org.openhealthtools.mdht.cts2.statement.StatementFactory;
import org.openhealthtools.mdht.cts2.statement.StatementList;
import org.openhealthtools.mdht.cts2.statement.StatementListEntry;
import org.openhealthtools.mdht.cts2.statement.StatementMsg;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.StatementQualifier;
import org.openhealthtools.mdht.cts2.statement.StatementSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StatementFactoryImpl extends EFactoryImpl implements StatementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static StatementFactory init() {
		try {
			StatementFactory theStatementFactory = (StatementFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/Statement");
			if (theStatementFactory != null) {
				return theStatementFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatementPackage.DOCUMENT_ROOT:
				return createDocumentRoot();
			case StatementPackage.STATEMENT:
				return createStatement();
			case StatementPackage.STATEMENT_DIRECTORY:
				return createStatementDirectory();
			case StatementPackage.STATEMENT_DIRECTORY_ENTRY:
				return createStatementDirectoryEntry();
			case StatementPackage.STATEMENT_LIST:
				return createStatementList();
			case StatementPackage.STATEMENT_LIST_ENTRY:
				return createStatementListEntry();
			case StatementPackage.STATEMENT_MSG:
				return createStatementMsg();
			case StatementPackage.STATEMENT_QUALIFIER:
				return createStatementQualifier();
			case StatementPackage.STATEMENT_SUBJECT:
				return createStatementSubject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementDirectory createStatementDirectory() {
		StatementDirectoryImpl statementDirectory = new StatementDirectoryImpl();
		return statementDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementDirectoryEntry createStatementDirectoryEntry() {
		StatementDirectoryEntryImpl statementDirectoryEntry = new StatementDirectoryEntryImpl();
		return statementDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementList createStatementList() {
		StatementListImpl statementList = new StatementListImpl();
		return statementList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementListEntry createStatementListEntry() {
		StatementListEntryImpl statementListEntry = new StatementListEntryImpl();
		return statementListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementMsg createStatementMsg() {
		StatementMsgImpl statementMsg = new StatementMsgImpl();
		return statementMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementQualifier createStatementQualifier() {
		StatementQualifierImpl statementQualifier = new StatementQualifierImpl();
		return statementQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementSubject createStatementSubject() {
		StatementSubjectImpl statementSubject = new StatementSubjectImpl();
		return statementSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementPackage getStatementPackage() {
		return (StatementPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementPackage getPackage() {
		return StatementPackage.eINSTANCE;
	}

} // StatementFactoryImpl
