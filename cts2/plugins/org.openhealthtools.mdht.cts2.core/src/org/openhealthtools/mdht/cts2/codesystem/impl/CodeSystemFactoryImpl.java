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
package org.openhealthtools.mdht.cts2.codesystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemFactory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.codesystem.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemFactoryImpl extends EFactoryImpl implements CodeSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CodeSystemFactory init() {
		try {
			CodeSystemFactory theCodeSystemFactory = (CodeSystemFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/CodeSystem");
			if (theCodeSystemFactory != null) {
				return theCodeSystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemFactoryImpl() {
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY:
				return createCodeSystemCatalogEntry();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY:
				return createCodeSystemCatalogEntryDirectory();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST:
				return createCodeSystemCatalogEntryList();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY:
				return createCodeSystemCatalogEntryListEntry();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG:
				return createCodeSystemCatalogEntryMsg();
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_SUMMARY:
				return createCodeSystemCatalogEntrySummary();
			case CodeSystemPackage.DOCUMENT_ROOT:
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
	public CodeSystemCatalogEntry createCodeSystemCatalogEntry() {
		CodeSystemCatalogEntryImpl codeSystemCatalogEntry = new CodeSystemCatalogEntryImpl();
		return codeSystemCatalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryDirectory createCodeSystemCatalogEntryDirectory() {
		CodeSystemCatalogEntryDirectoryImpl codeSystemCatalogEntryDirectory = new CodeSystemCatalogEntryDirectoryImpl();
		return codeSystemCatalogEntryDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryList createCodeSystemCatalogEntryList() {
		CodeSystemCatalogEntryListImpl codeSystemCatalogEntryList = new CodeSystemCatalogEntryListImpl();
		return codeSystemCatalogEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryListEntry createCodeSystemCatalogEntryListEntry() {
		CodeSystemCatalogEntryListEntryImpl codeSystemCatalogEntryListEntry = new CodeSystemCatalogEntryListEntryImpl();
		return codeSystemCatalogEntryListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryMsg createCodeSystemCatalogEntryMsg() {
		CodeSystemCatalogEntryMsgImpl codeSystemCatalogEntryMsg = new CodeSystemCatalogEntryMsgImpl();
		return codeSystemCatalogEntryMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntrySummary createCodeSystemCatalogEntrySummary() {
		CodeSystemCatalogEntrySummaryImpl codeSystemCatalogEntrySummary = new CodeSystemCatalogEntrySummaryImpl();
		return codeSystemCatalogEntrySummary;
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
	public CodeSystemPackage getCodeSystemPackage() {
		return (CodeSystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeSystemPackage getPackage() {
		return CodeSystemPackage.eINSTANCE;
	}

} // CodeSystemFactoryImpl
