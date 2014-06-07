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
package org.openhealthtools.mdht.cts2.codesystemversion.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage
 * @generated
 */
public class CodeSystemVersionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CodeSystemVersionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CodeSystemVersionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemVersionSwitch<Adapter> modelSwitch = new CodeSystemVersionSwitch<Adapter>() {
		@Override
		public Adapter caseCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry object) {
			return createCodeSystemVersionCatalogEntryAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersionCatalogEntryDirectory(CodeSystemVersionCatalogEntryDirectory object) {
			return createCodeSystemVersionCatalogEntryDirectoryAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersionCatalogEntryList(CodeSystemVersionCatalogEntryList object) {
			return createCodeSystemVersionCatalogEntryListAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersionCatalogEntryListEntry(CodeSystemVersionCatalogEntryListEntry object) {
			return createCodeSystemVersionCatalogEntryListEntryAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersionCatalogEntryMsg(CodeSystemVersionCatalogEntryMsg object) {
			return createCodeSystemVersionCatalogEntryMsgAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersionCatalogEntrySummary(CodeSystemVersionCatalogEntrySummary object) {
			return createCodeSystemVersionCatalogEntrySummaryAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseChangeable(Changeable object) {
			return createChangeableAdapter();
		}

		@Override
		public Adapter caseResourceDescription(ResourceDescription object) {
			return createResourceDescriptionAdapter();
		}

		@Override
		public Adapter caseResourceVersionDescription(ResourceVersionDescription object) {
			return createResourceVersionDescriptionAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseDirectory(Directory object) {
			return createDirectoryAdapter();
		}

		@Override
		public Adapter caseDirectoryEntry(DirectoryEntry object) {
			return createDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResourceDescriptionDirectoryEntry(ResourceDescriptionDirectoryEntry object) {
			return createResourceDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResourceVersionDescriptionDirectoryEntry(ResourceVersionDescriptionDirectoryEntry object) {
			return createResourceVersionDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry
	 * <em>Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry
	 * @generated
	 */
	public Adapter createCodeSystemVersionCatalogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory
	 * <em>Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory
	 * @generated
	 */
	public Adapter createCodeSystemVersionCatalogEntryDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList
	 * <em>Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList
	 * @generated
	 */
	public Adapter createCodeSystemVersionCatalogEntryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry
	 * <em>Catalog Entry List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry
	 * @generated
	 */
	public Adapter createCodeSystemVersionCatalogEntryListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg
	 * <em>Catalog Entry Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg
	 * @generated
	 */
	public Adapter createCodeSystemVersionCatalogEntryMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary
	 * <em>Catalog Entry Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary
	 * @generated
	 */
	public Adapter createCodeSystemVersionCatalogEntrySummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Changeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable
	 * @generated
	 */
	public Adapter createChangeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription
	 * @generated
	 */
	public Adapter createResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * <em>Resource Version Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * @generated
	 */
	public Adapter createResourceVersionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry
	 * @generated
	 */
	public Adapter createDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * <em>Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * <em>Resource Version Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceVersionDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // CodeSystemVersionAdapterFactory
