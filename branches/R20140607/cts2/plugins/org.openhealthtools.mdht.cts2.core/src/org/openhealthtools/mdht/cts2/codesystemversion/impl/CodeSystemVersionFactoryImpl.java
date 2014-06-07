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
package org.openhealthtools.mdht.cts2.codesystemversion.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionFactory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemVersionFactoryImpl extends EFactoryImpl implements CodeSystemVersionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CodeSystemVersionFactory init() {
		try {
			CodeSystemVersionFactory theCodeSystemVersionFactory = (CodeSystemVersionFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion");
			if (theCodeSystemVersionFactory != null) {
				return theCodeSystemVersionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeSystemVersionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionFactoryImpl() {
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return createCodeSystemVersionCatalogEntry();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY:
				return createCodeSystemVersionCatalogEntryDirectory();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST:
				return createCodeSystemVersionCatalogEntryList();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY:
				return createCodeSystemVersionCatalogEntryListEntry();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG:
				return createCodeSystemVersionCatalogEntryMsg();
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY:
				return createCodeSystemVersionCatalogEntrySummary();
			case CodeSystemVersionPackage.DOCUMENT_ROOT:
				return createDocumentRoot();
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
	public CodeSystemVersionCatalogEntry createCodeSystemVersionCatalogEntry() {
		CodeSystemVersionCatalogEntryImpl codeSystemVersionCatalogEntry = new CodeSystemVersionCatalogEntryImpl();
		return codeSystemVersionCatalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryDirectory createCodeSystemVersionCatalogEntryDirectory() {
		CodeSystemVersionCatalogEntryDirectoryImpl codeSystemVersionCatalogEntryDirectory = new CodeSystemVersionCatalogEntryDirectoryImpl();
		return codeSystemVersionCatalogEntryDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryList createCodeSystemVersionCatalogEntryList() {
		CodeSystemVersionCatalogEntryListImpl codeSystemVersionCatalogEntryList = new CodeSystemVersionCatalogEntryListImpl();
		return codeSystemVersionCatalogEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryListEntry createCodeSystemVersionCatalogEntryListEntry() {
		CodeSystemVersionCatalogEntryListEntryImpl codeSystemVersionCatalogEntryListEntry = new CodeSystemVersionCatalogEntryListEntryImpl();
		return codeSystemVersionCatalogEntryListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryMsg createCodeSystemVersionCatalogEntryMsg() {
		CodeSystemVersionCatalogEntryMsgImpl codeSystemVersionCatalogEntryMsg = new CodeSystemVersionCatalogEntryMsgImpl();
		return codeSystemVersionCatalogEntryMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntrySummary createCodeSystemVersionCatalogEntrySummary() {
		CodeSystemVersionCatalogEntrySummaryImpl codeSystemVersionCatalogEntrySummary = new CodeSystemVersionCatalogEntrySummaryImpl();
		return codeSystemVersionCatalogEntrySummary;
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
	public CodeSystemVersionPackage getCodeSystemVersionPackage() {
		return (CodeSystemVersionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeSystemVersionPackage getPackage() {
		return CodeSystemVersionPackage.eINSTANCE;
	}

} // CodeSystemVersionFactoryImpl
